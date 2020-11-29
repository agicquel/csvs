#!/bin/bash

echo "Clean old files..."
rm -f ./sources/*.py
rm -f ./sources/*.sh
rm -f ./sources/*.out
rm -f ./sources/*.time

echo "Compile test files..."
for testFile in ./sources/*.csvs; do
    java -jar compiler.jar -python $testFile
    java -jar compiler.jar -bash $testFile
done

echo "Test sh files..."
for testFile in ./sources/*.sh; do
    echo $testFile
    /usr/bin/time -v -o `echo "$testFile.time"` bash $testFile >> `echo "$testFile.out"`
done

echo "Test py files..."
for testFile in ./sources/*.py; do
    echo $testFile
    /usr/bin/time -v -o `echo "$testFile.time"` python3 $testFile >> `echo "$testFile.out"`
done


echo "Create report..."
rm -f ./report.csv && touch ./report.csv
echo "Test name,Execution type,Execution time,CPU usage,Max memory (kbytes),Result equivalent" >> ./report.csv
for timeFile in ./sources/*.time; do
    test_name=`echo $timeFile | cut -d\. -f2`
    exec_type=`echo $timeFile | cut -d\. -f3`
    exec_time=`cat $timeFile | grep "Elapsed (wall clock) time" | cut -d\  -f8`
    cpu_usage=`cat $timeFile | grep "Percent of CPU" | cut -d\  -f7`
    max_mem=`cat $timeFile | grep "Maximum resident set size" | cut -d\  -f6`

    out_file=`echo $timeFile | sed "s/.time/.out/g"`
    exec_type_2=$([[ "$exec_type" = "sh" ]] && echo "py" || echo "sh")
    out_file_2=`echo $out_file | sed "s/$exec_type/$exec_type_2/g"`
    diff=`diff --strip-trailing-cr $out_file $out_file_2`
    diff_result=$([[ "$diff" = "" ]] && echo "same" || echo "different")

    echo "$test_name,$exec_type,$exec_time,$cpu_usage,$max_mem,$diff_result" >> ./report.csv

done
