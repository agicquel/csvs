package com.agicquel.csvs.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.agicquel.csvs.services.CSVsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSVsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INT", "RULE_ANY_OTHER", "';'", "'{'", "'}'", "'while'", "'('", "')'", "'if'", "'else'", "'load'", "'store'", "'create'", "'set'", "'print'", "'export'", "'delete'", "'add'", "'row'", "'col'", "'cell'", "','", "'field'", "'count'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCSVsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCSVsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCSVsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCSVs.g"; }



     	private CSVsGrammarAccess grammarAccess;

        public InternalCSVsParser(TokenStream input, CSVsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected CSVsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalCSVs.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalCSVs.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalCSVs.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalCSVs.g:71:1: ruleProgram returns [EObject current=null] : ( ruleLC ( (lv_commands_1_0= ruleCommand ) )* ruleLC ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:77:2: ( ( ruleLC ( (lv_commands_1_0= ruleCommand ) )* ruleLC ) )
            // InternalCSVs.g:78:2: ( ruleLC ( (lv_commands_1_0= ruleCommand ) )* ruleLC )
            {
            // InternalCSVs.g:78:2: ( ruleLC ( (lv_commands_1_0= ruleCommand ) )* ruleLC )
            // InternalCSVs.g:79:3: ruleLC ( (lv_commands_1_0= ruleCommand ) )* ruleLC
            {

            			newCompositeNode(grammarAccess.getProgramAccess().getLCParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:86:3: ( (lv_commands_1_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ML_COMMENT && LA1_0<=RULE_SL_COMMENT)||LA1_0==14||LA1_0==17||(LA1_0>=19 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCSVs.g:87:4: (lv_commands_1_0= ruleCommand )
            	    {
            	    // InternalCSVs.g:87:4: (lv_commands_1_0= ruleCommand )
            	    // InternalCSVs.g:88:5: lv_commands_1_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getCommandsCommandParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_commands_1_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_1_0,
            	    						"com.agicquel.csvs.CSVs.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            			newCompositeNode(grammarAccess.getProgramAccess().getLCParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleLC"
    // InternalCSVs.g:116:1: entryRuleLC returns [String current=null] : iv_ruleLC= ruleLC EOF ;
    public final String entryRuleLC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLC = null;


        try {
            // InternalCSVs.g:116:42: (iv_ruleLC= ruleLC EOF )
            // InternalCSVs.g:117:2: iv_ruleLC= ruleLC EOF
            {
             newCompositeNode(grammarAccess.getLCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLC=ruleLC();

            state._fsp--;

             current =iv_ruleLC.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLC"


    // $ANTLR start "ruleLC"
    // InternalCSVs.g:123:1: ruleLC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WS_0= RULE_WS )? ;
    public final AntlrDatatypeRuleToken ruleLC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:129:2: ( (this_WS_0= RULE_WS )? )
            // InternalCSVs.g:130:2: (this_WS_0= RULE_WS )?
            {
            // InternalCSVs.g:130:2: (this_WS_0= RULE_WS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_WS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCSVs.g:131:3: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_2); 

                    			current.merge(this_WS_0);
                    		

                    			newLeafNode(this_WS_0, grammarAccess.getLCAccess().getWSTerminalRuleCall());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLC"


    // $ANTLR start "entryRuleCommand"
    // InternalCSVs.g:142:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalCSVs.g:142:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalCSVs.g:143:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalCSVs.g:149:1: ruleCommand returns [EObject current=null] : ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | this_ControlCommand_3= ruleControlCommand | ( () ruleCommentCommand ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CsvCommand_0 = null;

        EObject this_ControlCommand_3 = null;



        	enterRule();

        try {
            // InternalCSVs.g:155:2: ( ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | this_ControlCommand_3= ruleControlCommand | ( () ruleCommentCommand ) ) )
            // InternalCSVs.g:156:2: ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | this_ControlCommand_3= ruleControlCommand | ( () ruleCommentCommand ) )
            {
            // InternalCSVs.g:156:2: ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | this_ControlCommand_3= ruleControlCommand | ( () ruleCommentCommand ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt3=1;
                }
                break;
            case 14:
            case 17:
                {
                alt3=2;
                }
                break;
            case RULE_ML_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCSVs.g:157:3: (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' )
                    {
                    // InternalCSVs.g:157:3: (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' )
                    // InternalCSVs.g:158:4: this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';'
                    {

                    				newCompositeNode(grammarAccess.getCommandAccess().getCsvCommandParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_CsvCommand_0=ruleCsvCommand();

                    state._fsp--;


                    				current = this_CsvCommand_0;
                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getCommandAccess().getLCParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_5);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,11,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getSemicolonKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVs.g:179:3: this_ControlCommand_3= ruleControlCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getControlCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlCommand_3=ruleControlCommand();

                    state._fsp--;


                    			current = this_ControlCommand_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCSVs.g:188:3: ( () ruleCommentCommand )
                    {
                    // InternalCSVs.g:188:3: ( () ruleCommentCommand )
                    // InternalCSVs.g:189:4: () ruleCommentCommand
                    {
                    // InternalCSVs.g:189:4: ()
                    // InternalCSVs.g:190:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getCommandAction_2_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getCommandAccess().getCommentCommandParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleCommentCommand();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleBlock"
    // InternalCSVs.g:208:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalCSVs.g:208:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalCSVs.g:209:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalCSVs.g:215:1: ruleBlock returns [EObject current=null] : (otherlv_0= '{' ruleLC this_Program_2= ruleProgram ruleLC otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_Program_2 = null;



        	enterRule();

        try {
            // InternalCSVs.g:221:2: ( (otherlv_0= '{' ruleLC this_Program_2= ruleProgram ruleLC otherlv_4= '}' ) )
            // InternalCSVs.g:222:2: (otherlv_0= '{' ruleLC this_Program_2= ruleProgram ruleLC otherlv_4= '}' )
            {
            // InternalCSVs.g:222:2: (otherlv_0= '{' ruleLC this_Program_2= ruleProgram ruleLC otherlv_4= '}' )
            // InternalCSVs.g:223:3: otherlv_0= '{' ruleLC this_Program_2= ruleProgram ruleLC otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBlockAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getBlockAccess().getProgramParserRuleCall_2());
            		
            pushFollow(FOLLOW_6);
            this_Program_2=ruleProgram();

            state._fsp--;


            			current = this_Program_2;
            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getBlockAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_7);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleControlCommand"
    // InternalCSVs.g:257:1: entryRuleControlCommand returns [EObject current=null] : iv_ruleControlCommand= ruleControlCommand EOF ;
    public final EObject entryRuleControlCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlCommand = null;


        try {
            // InternalCSVs.g:257:55: (iv_ruleControlCommand= ruleControlCommand EOF )
            // InternalCSVs.g:258:2: iv_ruleControlCommand= ruleControlCommand EOF
            {
             newCompositeNode(grammarAccess.getControlCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlCommand=ruleControlCommand();

            state._fsp--;

             current =iv_ruleControlCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControlCommand"


    // $ANTLR start "ruleControlCommand"
    // InternalCSVs.g:264:1: ruleControlCommand returns [EObject current=null] : (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand ) ;
    public final EObject ruleControlCommand() throws RecognitionException {
        EObject current = null;

        EObject this_WhileCommand_0 = null;

        EObject this_IfCommand_1 = null;



        	enterRule();

        try {
            // InternalCSVs.g:270:2: ( (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand ) )
            // InternalCSVs.g:271:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand )
            {
            // InternalCSVs.g:271:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCSVs.g:272:3: this_WhileCommand_0= ruleWhileCommand
                    {

                    			newCompositeNode(grammarAccess.getControlCommandAccess().getWhileCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileCommand_0=ruleWhileCommand();

                    state._fsp--;


                    			current = this_WhileCommand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:281:3: this_IfCommand_1= ruleIfCommand
                    {

                    			newCompositeNode(grammarAccess.getControlCommandAccess().getIfCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfCommand_1=ruleIfCommand();

                    state._fsp--;


                    			current = this_IfCommand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlCommand"


    // $ANTLR start "entryRuleWhileCommand"
    // InternalCSVs.g:293:1: entryRuleWhileCommand returns [EObject current=null] : iv_ruleWhileCommand= ruleWhileCommand EOF ;
    public final EObject entryRuleWhileCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileCommand = null;


        try {
            // InternalCSVs.g:293:53: (iv_ruleWhileCommand= ruleWhileCommand EOF )
            // InternalCSVs.g:294:2: iv_ruleWhileCommand= ruleWhileCommand EOF
            {
             newCompositeNode(grammarAccess.getWhileCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileCommand=ruleWhileCommand();

            state._fsp--;

             current =iv_ruleWhileCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileCommand"


    // $ANTLR start "ruleWhileCommand"
    // InternalCSVs.g:300:1: ruleWhileCommand returns [EObject current=null] : (otherlv_0= 'while' ruleLC otherlv_2= '(' ruleLC ( (lv_cond_4_0= ruleExpression ) ) ruleLC otherlv_6= ')' ruleLC ( (lv_body_8_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_cond_4_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:306:2: ( (otherlv_0= 'while' ruleLC otherlv_2= '(' ruleLC ( (lv_cond_4_0= ruleExpression ) ) ruleLC otherlv_6= ')' ruleLC ( (lv_body_8_0= ruleBlock ) ) ) )
            // InternalCSVs.g:307:2: (otherlv_0= 'while' ruleLC otherlv_2= '(' ruleLC ( (lv_cond_4_0= ruleExpression ) ) ruleLC otherlv_6= ')' ruleLC ( (lv_body_8_0= ruleBlock ) ) )
            {
            // InternalCSVs.g:307:2: (otherlv_0= 'while' ruleLC otherlv_2= '(' ruleLC ( (lv_cond_4_0= ruleExpression ) ) ruleLC otherlv_6= ')' ruleLC ( (lv_body_8_0= ruleBlock ) ) )
            // InternalCSVs.g:308:3: otherlv_0= 'while' ruleLC otherlv_2= '(' ruleLC ( (lv_cond_4_0= ruleExpression ) ) ruleLC otherlv_6= ')' ruleLC ( (lv_body_8_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
            		

            			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileCommandAccess().getLeftParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:330:3: ( (lv_cond_4_0= ruleExpression ) )
            // InternalCSVs.g:331:4: (lv_cond_4_0= ruleExpression )
            {
            // InternalCSVs.g:331:4: (lv_cond_4_0= ruleExpression )
            // InternalCSVs.g:332:5: lv_cond_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileCommandAccess().getCondExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_cond_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_4_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileCommandAccess().getRightParenthesisKeyword_6());
            		

            			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_13);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:367:3: ( (lv_body_8_0= ruleBlock ) )
            // InternalCSVs.g:368:4: (lv_body_8_0= ruleBlock )
            {
            // InternalCSVs.g:368:4: (lv_body_8_0= ruleBlock )
            // InternalCSVs.g:369:5: lv_body_8_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getWhileCommandAccess().getBodyBlockParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_8_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_8_0,
            						"com.agicquel.csvs.CSVs.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileCommand"


    // $ANTLR start "entryRuleIfCommand"
    // InternalCSVs.g:390:1: entryRuleIfCommand returns [EObject current=null] : iv_ruleIfCommand= ruleIfCommand EOF ;
    public final EObject entryRuleIfCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCommand = null;


        try {
            // InternalCSVs.g:390:50: (iv_ruleIfCommand= ruleIfCommand EOF )
            // InternalCSVs.g:391:2: iv_ruleIfCommand= ruleIfCommand EOF
            {
             newCompositeNode(grammarAccess.getIfCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfCommand=ruleIfCommand();

            state._fsp--;

             current =iv_ruleIfCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfCommand"


    // $ANTLR start "ruleIfCommand"
    // InternalCSVs.g:397:1: ruleIfCommand returns [EObject current=null] : (otherlv_0= 'if' ruleLC otherlv_2= '(' ruleLC ( (lv_cond_4_0= ruleExpression ) ) ruleLC otherlv_6= ')' ruleLC ( (lv_thenBody_8_0= ruleBlock ) ) ruleLC (otherlv_10= 'else' ruleLC ( (lv_elseBody_12_0= ruleBlock ) ) ruleLC )? ) ;
    public final EObject ruleIfCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_cond_4_0 = null;

        EObject lv_thenBody_8_0 = null;

        EObject lv_elseBody_12_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:403:2: ( (otherlv_0= 'if' ruleLC otherlv_2= '(' ruleLC ( (lv_cond_4_0= ruleExpression ) ) ruleLC otherlv_6= ')' ruleLC ( (lv_thenBody_8_0= ruleBlock ) ) ruleLC (otherlv_10= 'else' ruleLC ( (lv_elseBody_12_0= ruleBlock ) ) ruleLC )? ) )
            // InternalCSVs.g:404:2: (otherlv_0= 'if' ruleLC otherlv_2= '(' ruleLC ( (lv_cond_4_0= ruleExpression ) ) ruleLC otherlv_6= ')' ruleLC ( (lv_thenBody_8_0= ruleBlock ) ) ruleLC (otherlv_10= 'else' ruleLC ( (lv_elseBody_12_0= ruleBlock ) ) ruleLC )? )
            {
            // InternalCSVs.g:404:2: (otherlv_0= 'if' ruleLC otherlv_2= '(' ruleLC ( (lv_cond_4_0= ruleExpression ) ) ruleLC otherlv_6= ')' ruleLC ( (lv_thenBody_8_0= ruleBlock ) ) ruleLC (otherlv_10= 'else' ruleLC ( (lv_elseBody_12_0= ruleBlock ) ) ruleLC )? )
            // InternalCSVs.g:405:3: otherlv_0= 'if' ruleLC otherlv_2= '(' ruleLC ( (lv_cond_4_0= ruleExpression ) ) ruleLC otherlv_6= ')' ruleLC ( (lv_thenBody_8_0= ruleBlock ) ) ruleLC (otherlv_10= 'else' ruleLC ( (lv_elseBody_12_0= ruleBlock ) ) ruleLC )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getIfCommandAccess().getLeftParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:427:3: ( (lv_cond_4_0= ruleExpression ) )
            // InternalCSVs.g:428:4: (lv_cond_4_0= ruleExpression )
            {
            // InternalCSVs.g:428:4: (lv_cond_4_0= ruleExpression )
            // InternalCSVs.g:429:5: lv_cond_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfCommandAccess().getCondExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_cond_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfCommandRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_4_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getIfCommandAccess().getRightParenthesisKeyword_6());
            		

            			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_13);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:464:3: ( (lv_thenBody_8_0= ruleBlock ) )
            // InternalCSVs.g:465:4: (lv_thenBody_8_0= ruleBlock )
            {
            // InternalCSVs.g:465:4: (lv_thenBody_8_0= ruleBlock )
            // InternalCSVs.g:466:5: lv_thenBody_8_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfCommandAccess().getThenBodyBlockParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_thenBody_8_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfCommandRule());
            					}
            					set(
            						current,
            						"thenBody",
            						lv_thenBody_8_0,
            						"com.agicquel.csvs.CSVs.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_9());
            		
            pushFollow(FOLLOW_15);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:490:3: (otherlv_10= 'else' ruleLC ( (lv_elseBody_12_0= ruleBlock ) ) ruleLC )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCSVs.g:491:4: otherlv_10= 'else' ruleLC ( (lv_elseBody_12_0= ruleBlock ) ) ruleLC
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfCommandAccess().getElseKeyword_10_0());
                    			

                    				newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_10_1());
                    			
                    pushFollow(FOLLOW_13);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:502:4: ( (lv_elseBody_12_0= ruleBlock ) )
                    // InternalCSVs.g:503:5: (lv_elseBody_12_0= ruleBlock )
                    {
                    // InternalCSVs.g:503:5: (lv_elseBody_12_0= ruleBlock )
                    // InternalCSVs.g:504:6: lv_elseBody_12_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getIfCommandAccess().getElseBodyBlockParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_elseBody_12_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfCommandRule());
                    						}
                    						set(
                    							current,
                    							"elseBody",
                    							lv_elseBody_12_0,
                    							"com.agicquel.csvs.CSVs.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    				newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_10_3());
                    			
                    pushFollow(FOLLOW_2);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfCommand"


    // $ANTLR start "entryRuleCsvCommand"
    // InternalCSVs.g:533:1: entryRuleCsvCommand returns [EObject current=null] : iv_ruleCsvCommand= ruleCsvCommand EOF ;
    public final EObject entryRuleCsvCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvCommand = null;


        try {
            // InternalCSVs.g:533:51: (iv_ruleCsvCommand= ruleCsvCommand EOF )
            // InternalCSVs.g:534:2: iv_ruleCsvCommand= ruleCsvCommand EOF
            {
             newCompositeNode(grammarAccess.getCsvCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCsvCommand=ruleCsvCommand();

            state._fsp--;

             current =iv_ruleCsvCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCsvCommand"


    // $ANTLR start "ruleCsvCommand"
    // InternalCSVs.g:540:1: ruleCsvCommand returns [EObject current=null] : (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_AddCommand_7= ruleAddCommand ) ;
    public final EObject ruleCsvCommand() throws RecognitionException {
        EObject current = null;

        EObject this_LoadCommand_0 = null;

        EObject this_StoreCommand_1 = null;

        EObject this_CreateCommand_2 = null;

        EObject this_SetCommand_3 = null;

        EObject this_PrintCommand_4 = null;

        EObject this_ExportCommand_5 = null;

        EObject this_DeleteCommand_6 = null;

        EObject this_AddCommand_7 = null;



        	enterRule();

        try {
            // InternalCSVs.g:546:2: ( (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_AddCommand_7= ruleAddCommand ) )
            // InternalCSVs.g:547:2: (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_AddCommand_7= ruleAddCommand )
            {
            // InternalCSVs.g:547:2: (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_AddCommand_7= ruleAddCommand )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            case 26:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCSVs.g:548:3: this_LoadCommand_0= ruleLoadCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getLoadCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadCommand_0=ruleLoadCommand();

                    state._fsp--;


                    			current = this_LoadCommand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:557:3: this_StoreCommand_1= ruleStoreCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getStoreCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StoreCommand_1=ruleStoreCommand();

                    state._fsp--;


                    			current = this_StoreCommand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCSVs.g:566:3: this_CreateCommand_2= ruleCreateCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getCreateCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateCommand_2=ruleCreateCommand();

                    state._fsp--;


                    			current = this_CreateCommand_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCSVs.g:575:3: this_SetCommand_3= ruleSetCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getSetCommandParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetCommand_3=ruleSetCommand();

                    state._fsp--;


                    			current = this_SetCommand_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCSVs.g:584:3: this_PrintCommand_4= rulePrintCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getPrintCommandParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintCommand_4=rulePrintCommand();

                    state._fsp--;


                    			current = this_PrintCommand_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCSVs.g:593:3: this_ExportCommand_5= ruleExportCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getExportCommandParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExportCommand_5=ruleExportCommand();

                    state._fsp--;


                    			current = this_ExportCommand_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCSVs.g:602:3: this_DeleteCommand_6= ruleDeleteCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getDeleteCommandParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteCommand_6=ruleDeleteCommand();

                    state._fsp--;


                    			current = this_DeleteCommand_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalCSVs.g:611:3: this_AddCommand_7= ruleAddCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getAddCommandParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddCommand_7=ruleAddCommand();

                    state._fsp--;


                    			current = this_AddCommand_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCsvCommand"


    // $ANTLR start "entryRuleLoadCommand"
    // InternalCSVs.g:623:1: entryRuleLoadCommand returns [EObject current=null] : iv_ruleLoadCommand= ruleLoadCommand EOF ;
    public final EObject entryRuleLoadCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadCommand = null;


        try {
            // InternalCSVs.g:623:52: (iv_ruleLoadCommand= ruleLoadCommand EOF )
            // InternalCSVs.g:624:2: iv_ruleLoadCommand= ruleLoadCommand EOF
            {
             newCompositeNode(grammarAccess.getLoadCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadCommand=ruleLoadCommand();

            state._fsp--;

             current =iv_ruleLoadCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadCommand"


    // $ANTLR start "ruleLoadCommand"
    // InternalCSVs.g:630:1: ruleLoadCommand returns [EObject current=null] : (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC this_STRING_4= RULE_STRING ) ;
    public final EObject ruleLoadCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token this_STRING_4=null;


        	enterRule();

        try {
            // InternalCSVs.g:636:2: ( (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC this_STRING_4= RULE_STRING ) )
            // InternalCSVs.g:637:2: (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC this_STRING_4= RULE_STRING )
            {
            // InternalCSVs.g:637:2: (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC this_STRING_4= RULE_STRING )
            // InternalCSVs.g:638:3: otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC this_STRING_4= RULE_STRING
            {
            otherlv_0=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadCommandAccess().getLoadKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLoadCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:649:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:650:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:650:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:651:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_var_2_0, grammarAccess.getLoadCommandAccess().getVarIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getLoadCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_4, grammarAccess.getLoadCommandAccess().getSTRINGTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadCommand"


    // $ANTLR start "entryRuleStoreCommand"
    // InternalCSVs.g:682:1: entryRuleStoreCommand returns [EObject current=null] : iv_ruleStoreCommand= ruleStoreCommand EOF ;
    public final EObject entryRuleStoreCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreCommand = null;


        try {
            // InternalCSVs.g:682:53: (iv_ruleStoreCommand= ruleStoreCommand EOF )
            // InternalCSVs.g:683:2: iv_ruleStoreCommand= ruleStoreCommand EOF
            {
             newCompositeNode(grammarAccess.getStoreCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoreCommand=ruleStoreCommand();

            state._fsp--;

             current =iv_ruleStoreCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStoreCommand"


    // $ANTLR start "ruleStoreCommand"
    // InternalCSVs.g:689:1: ruleStoreCommand returns [EObject current=null] : (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC this_STRING_4= RULE_STRING ) ;
    public final EObject ruleStoreCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token this_STRING_4=null;


        	enterRule();

        try {
            // InternalCSVs.g:695:2: ( (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC this_STRING_4= RULE_STRING ) )
            // InternalCSVs.g:696:2: (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC this_STRING_4= RULE_STRING )
            {
            // InternalCSVs.g:696:2: (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC this_STRING_4= RULE_STRING )
            // InternalCSVs.g:697:3: otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC this_STRING_4= RULE_STRING
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreCommandAccess().getStoreKeyword_0());
            		

            			newCompositeNode(grammarAccess.getStoreCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:708:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:709:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:709:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:710:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_var_2_0, grammarAccess.getStoreCommandAccess().getVarIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getStoreCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_4, grammarAccess.getStoreCommandAccess().getSTRINGTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStoreCommand"


    // $ANTLR start "entryRuleCreateCommand"
    // InternalCSVs.g:741:1: entryRuleCreateCommand returns [EObject current=null] : iv_ruleCreateCommand= ruleCreateCommand EOF ;
    public final EObject entryRuleCreateCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateCommand = null;


        try {
            // InternalCSVs.g:741:54: (iv_ruleCreateCommand= ruleCreateCommand EOF )
            // InternalCSVs.g:742:2: iv_ruleCreateCommand= ruleCreateCommand EOF
            {
             newCompositeNode(grammarAccess.getCreateCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateCommand=ruleCreateCommand();

            state._fsp--;

             current =iv_ruleCreateCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateCommand"


    // $ANTLR start "ruleCreateCommand"
    // InternalCSVs.g:748:1: ruleCreateCommand returns [EObject current=null] : (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCreateCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:754:2: ( (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) ) )
            // InternalCSVs.g:755:2: (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) )
            {
            // InternalCSVs.g:755:2: (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) )
            // InternalCSVs.g:756:3: otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateCommandAccess().getCreateKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCreateCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:767:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:768:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:768:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:769:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var_2_0, grammarAccess.getCreateCommandAccess().getVarIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateCommand"


    // $ANTLR start "entryRuleSetCommand"
    // InternalCSVs.g:789:1: entryRuleSetCommand returns [EObject current=null] : iv_ruleSetCommand= ruleSetCommand EOF ;
    public final EObject entryRuleSetCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetCommand = null;


        try {
            // InternalCSVs.g:789:51: (iv_ruleSetCommand= ruleSetCommand EOF )
            // InternalCSVs.g:790:2: iv_ruleSetCommand= ruleSetCommand EOF
            {
             newCompositeNode(grammarAccess.getSetCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetCommand=ruleSetCommand();

            state._fsp--;

             current =iv_ruleSetCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetCommand"


    // $ANTLR start "ruleSetCommand"
    // InternalCSVs.g:796:1: ruleSetCommand returns [EObject current=null] : (otherlv_0= 'set' ruleLC ( (lv_var_2_0= ruleExpression ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleSetCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_var_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:802:2: ( (otherlv_0= 'set' ruleLC ( (lv_var_2_0= ruleExpression ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) ) )
            // InternalCSVs.g:803:2: (otherlv_0= 'set' ruleLC ( (lv_var_2_0= ruleExpression ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:803:2: (otherlv_0= 'set' ruleLC ( (lv_var_2_0= ruleExpression ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) )
            // InternalCSVs.g:804:3: otherlv_0= 'set' ruleLC ( (lv_var_2_0= ruleExpression ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSetCommandAccess().getSetKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSetCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:815:3: ( (lv_var_2_0= ruleExpression ) )
            // InternalCSVs.g:816:4: (lv_var_2_0= ruleExpression )
            {
            // InternalCSVs.g:816:4: (lv_var_2_0= ruleExpression )
            // InternalCSVs.g:817:5: lv_var_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSetCommandAccess().getVarExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_var_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetCommandRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getSetCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:841:3: ( (lv_expression_4_0= ruleExpression ) )
            // InternalCSVs.g:842:4: (lv_expression_4_0= ruleExpression )
            {
            // InternalCSVs.g:842:4: (lv_expression_4_0= ruleExpression )
            // InternalCSVs.g:843:5: lv_expression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSetCommandAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetCommandRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetCommand"


    // $ANTLR start "entryRulePrintCommand"
    // InternalCSVs.g:864:1: entryRulePrintCommand returns [EObject current=null] : iv_rulePrintCommand= rulePrintCommand EOF ;
    public final EObject entryRulePrintCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCommand = null;


        try {
            // InternalCSVs.g:864:53: (iv_rulePrintCommand= rulePrintCommand EOF )
            // InternalCSVs.g:865:2: iv_rulePrintCommand= rulePrintCommand EOF
            {
             newCompositeNode(grammarAccess.getPrintCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintCommand=rulePrintCommand();

            state._fsp--;

             current =iv_rulePrintCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintCommand"


    // $ANTLR start "rulePrintCommand"
    // InternalCSVs.g:871:1: rulePrintCommand returns [EObject current=null] : (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject rulePrintCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:877:2: ( (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalCSVs.g:878:2: (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:878:2: (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalCSVs.g:879:3: otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintCommandAccess().getPrintKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPrintCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:890:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalCSVs.g:891:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalCSVs.g:891:4: (lv_expression_2_0= ruleExpression )
            // InternalCSVs.g:892:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPrintCommandAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintCommandRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintCommand"


    // $ANTLR start "entryRuleExportCommand"
    // InternalCSVs.g:913:1: entryRuleExportCommand returns [EObject current=null] : iv_ruleExportCommand= ruleExportCommand EOF ;
    public final EObject entryRuleExportCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportCommand = null;


        try {
            // InternalCSVs.g:913:54: (iv_ruleExportCommand= ruleExportCommand EOF )
            // InternalCSVs.g:914:2: iv_ruleExportCommand= ruleExportCommand EOF
            {
             newCompositeNode(grammarAccess.getExportCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExportCommand=ruleExportCommand();

            state._fsp--;

             current =iv_ruleExportCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExportCommand"


    // $ANTLR start "ruleExportCommand"
    // InternalCSVs.g:920:1: ruleExportCommand returns [EObject current=null] : (otherlv_0= 'export' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleExportCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:926:2: ( (otherlv_0= 'export' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalCSVs.g:927:2: (otherlv_0= 'export' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:927:2: (otherlv_0= 'export' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalCSVs.g:928:3: otherlv_0= 'export' ruleLC ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExportCommandAccess().getExportKeyword_0());
            		

            			newCompositeNode(grammarAccess.getExportCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:939:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalCSVs.g:940:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalCSVs.g:940:4: (lv_expression_2_0= ruleExpression )
            // InternalCSVs.g:941:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExportCommandAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportCommandRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExportCommand"


    // $ANTLR start "entryRuleDeleteCommand"
    // InternalCSVs.g:962:1: entryRuleDeleteCommand returns [EObject current=null] : iv_ruleDeleteCommand= ruleDeleteCommand EOF ;
    public final EObject entryRuleDeleteCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteCommand = null;


        try {
            // InternalCSVs.g:962:54: (iv_ruleDeleteCommand= ruleDeleteCommand EOF )
            // InternalCSVs.g:963:2: iv_ruleDeleteCommand= ruleDeleteCommand EOF
            {
             newCompositeNode(grammarAccess.getDeleteCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteCommand=ruleDeleteCommand();

            state._fsp--;

             current =iv_ruleDeleteCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteCommand"


    // $ANTLR start "ruleDeleteCommand"
    // InternalCSVs.g:969:1: ruleDeleteCommand returns [EObject current=null] : (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleDeleteCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:975:2: ( (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalCSVs.g:976:2: (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:976:2: (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalCSVs.g:977:3: otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteCommandAccess().getDeleteKeyword_0());
            		

            			newCompositeNode(grammarAccess.getDeleteCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:988:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalCSVs.g:989:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalCSVs.g:989:4: (lv_expression_2_0= ruleExpression )
            // InternalCSVs.g:990:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDeleteCommandAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteCommandRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteCommand"


    // $ANTLR start "entryRuleAddCommand"
    // InternalCSVs.g:1011:1: entryRuleAddCommand returns [EObject current=null] : iv_ruleAddCommand= ruleAddCommand EOF ;
    public final EObject entryRuleAddCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddCommand = null;


        try {
            // InternalCSVs.g:1011:51: (iv_ruleAddCommand= ruleAddCommand EOF )
            // InternalCSVs.g:1012:2: iv_ruleAddCommand= ruleAddCommand EOF
            {
             newCompositeNode(grammarAccess.getAddCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddCommand=ruleAddCommand();

            state._fsp--;

             current =iv_ruleAddCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddCommand"


    // $ANTLR start "ruleAddCommand"
    // InternalCSVs.g:1018:1: ruleAddCommand returns [EObject current=null] : (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleAddCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1024:2: ( (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) ) )
            // InternalCSVs.g:1025:2: (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:1025:2: (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) )
            // InternalCSVs.g:1026:3: otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAddCommandAccess().getAddKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAddCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_22);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1037:3: ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) )
            // InternalCSVs.g:1038:4: ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) )
            {
            // InternalCSVs.g:1038:4: ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) )
            // InternalCSVs.g:1039:5: (lv_op_2_1= 'row' | lv_op_2_2= 'col' )
            {
            // InternalCSVs.g:1039:5: (lv_op_2_1= 'row' | lv_op_2_2= 'col' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCSVs.g:1040:6: lv_op_2_1= 'row'
                    {
                    lv_op_2_1=(Token)match(input,27,FOLLOW_10); 

                    						newLeafNode(lv_op_2_1, grammarAccess.getAddCommandAccess().getOpRowKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddCommandRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:1051:6: lv_op_2_2= 'col'
                    {
                    lv_op_2_2=(Token)match(input,28,FOLLOW_10); 

                    						newLeafNode(lv_op_2_2, grammarAccess.getAddCommandAccess().getOpColKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddCommandRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            			newCompositeNode(grammarAccess.getAddCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1071:3: ( (lv_expression_4_0= ruleExpression ) )
            // InternalCSVs.g:1072:4: (lv_expression_4_0= ruleExpression )
            {
            // InternalCSVs.g:1072:4: (lv_expression_4_0= ruleExpression )
            // InternalCSVs.g:1073:5: lv_expression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAddCommandAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddCommandRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddCommand"


    // $ANTLR start "entryRuleCommentCommand"
    // InternalCSVs.g:1094:1: entryRuleCommentCommand returns [String current=null] : iv_ruleCommentCommand= ruleCommentCommand EOF ;
    public final String entryRuleCommentCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentCommand = null;


        try {
            // InternalCSVs.g:1094:54: (iv_ruleCommentCommand= ruleCommentCommand EOF )
            // InternalCSVs.g:1095:2: iv_ruleCommentCommand= ruleCommentCommand EOF
            {
             newCompositeNode(grammarAccess.getCommentCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentCommand=ruleCommentCommand();

            state._fsp--;

             current =iv_ruleCommentCommand.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentCommand"


    // $ANTLR start "ruleCommentCommand"
    // InternalCSVs.g:1101:1: ruleCommentCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleCommentCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ML_COMMENT_0=null;
        Token this_SL_COMMENT_1=null;


        	enterRule();

        try {
            // InternalCSVs.g:1107:2: ( (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // InternalCSVs.g:1108:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // InternalCSVs.g:1108:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ML_COMMENT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_SL_COMMENT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCSVs.g:1109:3: this_ML_COMMENT_0= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    			current.merge(this_ML_COMMENT_0);
                    		

                    			newLeafNode(this_ML_COMMENT_0, grammarAccess.getCommentCommandAccess().getML_COMMENTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:1117:3: this_SL_COMMENT_1= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

                    			current.merge(this_SL_COMMENT_1);
                    		

                    			newLeafNode(this_SL_COMMENT_1, grammarAccess.getCommentCommandAccess().getSL_COMMENTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentCommand"


    // $ANTLR start "entryRuleExpression"
    // InternalCSVs.g:1128:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCSVs.g:1128:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCSVs.g:1129:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCSVs.g:1135:1: ruleExpression returns [EObject current=null] : (this_Or_0= ruleOr | this_Selector_1= ruleSelector | this_CountExpr_2= ruleCountExpr ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;

        EObject this_Selector_1 = null;

        EObject this_CountExpr_2 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1141:2: ( (this_Or_0= ruleOr | this_Selector_1= ruleSelector | this_CountExpr_2= ruleCountExpr ) )
            // InternalCSVs.g:1142:2: (this_Or_0= ruleOr | this_Selector_1= ruleSelector | this_CountExpr_2= ruleCountExpr )
            {
            // InternalCSVs.g:1142:2: (this_Or_0= ruleOr | this_Selector_1= ruleSelector | this_CountExpr_2= ruleCountExpr )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 15:
            case 45:
            case 46:
            case 47:
                {
                alt9=1;
                }
                break;
            case 27:
            case 28:
            case 29:
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCSVs.g:1143:3: this_Or_0= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_0=ruleOr();

                    state._fsp--;


                    			current = this_Or_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:1152:3: this_Selector_1= ruleSelector
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selector_1=ruleSelector();

                    state._fsp--;


                    			current = this_Selector_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCSVs.g:1161:3: this_CountExpr_2= ruleCountExpr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCountExprParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountExpr_2=ruleCountExpr();

                    state._fsp--;


                    			current = this_CountExpr_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleVariableExpr"
    // InternalCSVs.g:1173:1: entryRuleVariableExpr returns [EObject current=null] : iv_ruleVariableExpr= ruleVariableExpr EOF ;
    public final EObject entryRuleVariableExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpr = null;


        try {
            // InternalCSVs.g:1173:53: (iv_ruleVariableExpr= ruleVariableExpr EOF )
            // InternalCSVs.g:1174:2: iv_ruleVariableExpr= ruleVariableExpr EOF
            {
             newCompositeNode(grammarAccess.getVariableExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableExpr=ruleVariableExpr();

            state._fsp--;

             current =iv_ruleVariableExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableExpr"


    // $ANTLR start "ruleVariableExpr"
    // InternalCSVs.g:1180:1: ruleVariableExpr returns [EObject current=null] : ( (lv_term_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableExpr() throws RecognitionException {
        EObject current = null;

        Token lv_term_0_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:1186:2: ( ( (lv_term_0_0= RULE_ID ) ) )
            // InternalCSVs.g:1187:2: ( (lv_term_0_0= RULE_ID ) )
            {
            // InternalCSVs.g:1187:2: ( (lv_term_0_0= RULE_ID ) )
            // InternalCSVs.g:1188:3: (lv_term_0_0= RULE_ID )
            {
            // InternalCSVs.g:1188:3: (lv_term_0_0= RULE_ID )
            // InternalCSVs.g:1189:4: lv_term_0_0= RULE_ID
            {
            lv_term_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_term_0_0, grammarAccess.getVariableExprAccess().getTermIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableExprRule());
            				}
            				setWithLastConsumed(
            					current,
            					"term",
            					lv_term_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableExpr"


    // $ANTLR start "entryRuleSelector"
    // InternalCSVs.g:1208:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalCSVs.g:1208:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalCSVs.g:1209:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalCSVs.g:1215:1: ruleSelector returns [EObject current=null] : (this_RowSelect_0= ruleRowSelect | this_ColSelect_1= ruleColSelect | this_CellSelect_2= ruleCellSelect | this_FieldSelect_3= ruleFieldSelect ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        EObject this_RowSelect_0 = null;

        EObject this_ColSelect_1 = null;

        EObject this_CellSelect_2 = null;

        EObject this_FieldSelect_3 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1221:2: ( (this_RowSelect_0= ruleRowSelect | this_ColSelect_1= ruleColSelect | this_CellSelect_2= ruleCellSelect | this_FieldSelect_3= ruleFieldSelect ) )
            // InternalCSVs.g:1222:2: (this_RowSelect_0= ruleRowSelect | this_ColSelect_1= ruleColSelect | this_CellSelect_2= ruleCellSelect | this_FieldSelect_3= ruleFieldSelect )
            {
            // InternalCSVs.g:1222:2: (this_RowSelect_0= ruleRowSelect | this_ColSelect_1= ruleColSelect | this_CellSelect_2= ruleCellSelect | this_FieldSelect_3= ruleFieldSelect )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            case 31:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCSVs.g:1223:3: this_RowSelect_0= ruleRowSelect
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getRowSelectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RowSelect_0=ruleRowSelect();

                    state._fsp--;


                    			current = this_RowSelect_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:1232:3: this_ColSelect_1= ruleColSelect
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getColSelectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColSelect_1=ruleColSelect();

                    state._fsp--;


                    			current = this_ColSelect_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCSVs.g:1241:3: this_CellSelect_2= ruleCellSelect
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getCellSelectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CellSelect_2=ruleCellSelect();

                    state._fsp--;


                    			current = this_CellSelect_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCSVs.g:1250:3: this_FieldSelect_3= ruleFieldSelect
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getFieldSelectParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldSelect_3=ruleFieldSelect();

                    state._fsp--;


                    			current = this_FieldSelect_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleRowSelect"
    // InternalCSVs.g:1262:1: entryRuleRowSelect returns [EObject current=null] : iv_ruleRowSelect= ruleRowSelect EOF ;
    public final EObject entryRuleRowSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowSelect = null;


        try {
            // InternalCSVs.g:1262:50: (iv_ruleRowSelect= ruleRowSelect EOF )
            // InternalCSVs.g:1263:2: iv_ruleRowSelect= ruleRowSelect EOF
            {
             newCompositeNode(grammarAccess.getRowSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowSelect=ruleRowSelect();

            state._fsp--;

             current =iv_ruleRowSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRowSelect"


    // $ANTLR start "ruleRowSelect"
    // InternalCSVs.g:1269:1: ruleRowSelect returns [EObject current=null] : (otherlv_0= 'row' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' ) ;
    public final EObject ruleRowSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1275:2: ( (otherlv_0= 'row' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' ) )
            // InternalCSVs.g:1276:2: (otherlv_0= 'row' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' )
            {
            // InternalCSVs.g:1276:2: (otherlv_0= 'row' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' )
            // InternalCSVs.g:1277:3: otherlv_0= 'row' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRowSelectAccess().getRowKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRowSelectAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1288:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:1289:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:1289:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:1290:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_var_2_0, grammarAccess.getRowSelectAccess().getVarIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRowSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getRowSelectAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getRowSelectAccess().getLeftParenthesisKeyword_4());
            		

            			newCompositeNode(grammarAccess.getRowSelectAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1324:3: ( (lv_expression_6_0= ruleExpression ) )
            // InternalCSVs.g:1325:4: (lv_expression_6_0= ruleExpression )
            {
            // InternalCSVs.g:1325:4: (lv_expression_6_0= ruleExpression )
            // InternalCSVs.g:1326:5: lv_expression_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRowSelectAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowSelectRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getRowSelectAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRowSelectAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRowSelect"


    // $ANTLR start "entryRuleColSelect"
    // InternalCSVs.g:1358:1: entryRuleColSelect returns [EObject current=null] : iv_ruleColSelect= ruleColSelect EOF ;
    public final EObject entryRuleColSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColSelect = null;


        try {
            // InternalCSVs.g:1358:50: (iv_ruleColSelect= ruleColSelect EOF )
            // InternalCSVs.g:1359:2: iv_ruleColSelect= ruleColSelect EOF
            {
             newCompositeNode(grammarAccess.getColSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColSelect=ruleColSelect();

            state._fsp--;

             current =iv_ruleColSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColSelect"


    // $ANTLR start "ruleColSelect"
    // InternalCSVs.g:1365:1: ruleColSelect returns [EObject current=null] : (otherlv_0= 'col' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' ) ;
    public final EObject ruleColSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1371:2: ( (otherlv_0= 'col' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' ) )
            // InternalCSVs.g:1372:2: (otherlv_0= 'col' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' )
            {
            // InternalCSVs.g:1372:2: (otherlv_0= 'col' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' )
            // InternalCSVs.g:1373:3: otherlv_0= 'col' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getColSelectAccess().getColKeyword_0());
            		

            			newCompositeNode(grammarAccess.getColSelectAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1384:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:1385:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:1385:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:1386:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_var_2_0, grammarAccess.getColSelectAccess().getVarIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getColSelectAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getColSelectAccess().getLeftParenthesisKeyword_4());
            		

            			newCompositeNode(grammarAccess.getColSelectAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1420:3: ( (lv_expression_6_0= ruleExpression ) )
            // InternalCSVs.g:1421:4: (lv_expression_6_0= ruleExpression )
            {
            // InternalCSVs.g:1421:4: (lv_expression_6_0= ruleExpression )
            // InternalCSVs.g:1422:5: lv_expression_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getColSelectAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColSelectRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getColSelectAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getColSelectAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColSelect"


    // $ANTLR start "entryRuleCellSelect"
    // InternalCSVs.g:1454:1: entryRuleCellSelect returns [EObject current=null] : iv_ruleCellSelect= ruleCellSelect EOF ;
    public final EObject entryRuleCellSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellSelect = null;


        try {
            // InternalCSVs.g:1454:51: (iv_ruleCellSelect= ruleCellSelect EOF )
            // InternalCSVs.g:1455:2: iv_ruleCellSelect= ruleCellSelect EOF
            {
             newCompositeNode(grammarAccess.getCellSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellSelect=ruleCellSelect();

            state._fsp--;

             current =iv_ruleCellSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellSelect"


    // $ANTLR start "ruleCellSelect"
    // InternalCSVs.g:1461:1: ruleCellSelect returns [EObject current=null] : (otherlv_0= 'cell' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expressionRow_6_0= ruleExpression ) ) ruleLC otherlv_8= ',' ruleLC ( (lv_expressionCol_10_0= ruleExpression ) ) ruleLC otherlv_12= ')' ) ;
    public final EObject ruleCellSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_expressionRow_6_0 = null;

        EObject lv_expressionCol_10_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1467:2: ( (otherlv_0= 'cell' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expressionRow_6_0= ruleExpression ) ) ruleLC otherlv_8= ',' ruleLC ( (lv_expressionCol_10_0= ruleExpression ) ) ruleLC otherlv_12= ')' ) )
            // InternalCSVs.g:1468:2: (otherlv_0= 'cell' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expressionRow_6_0= ruleExpression ) ) ruleLC otherlv_8= ',' ruleLC ( (lv_expressionCol_10_0= ruleExpression ) ) ruleLC otherlv_12= ')' )
            {
            // InternalCSVs.g:1468:2: (otherlv_0= 'cell' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expressionRow_6_0= ruleExpression ) ) ruleLC otherlv_8= ',' ruleLC ( (lv_expressionCol_10_0= ruleExpression ) ) ruleLC otherlv_12= ')' )
            // InternalCSVs.g:1469:3: otherlv_0= 'cell' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expressionRow_6_0= ruleExpression ) ) ruleLC otherlv_8= ',' ruleLC ( (lv_expressionCol_10_0= ruleExpression ) ) ruleLC otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCellSelectAccess().getCellKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCellSelectAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1480:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:1481:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:1481:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:1482:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_var_2_0, grammarAccess.getCellSelectAccess().getVarIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getCellSelectAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getCellSelectAccess().getLeftParenthesisKeyword_4());
            		

            			newCompositeNode(grammarAccess.getCellSelectAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1516:3: ( (lv_expressionRow_6_0= ruleExpression ) )
            // InternalCSVs.g:1517:4: (lv_expressionRow_6_0= ruleExpression )
            {
            // InternalCSVs.g:1517:4: (lv_expressionRow_6_0= ruleExpression )
            // InternalCSVs.g:1518:5: lv_expressionRow_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCellSelectAccess().getExpressionRowExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_expressionRow_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellSelectRule());
            					}
            					set(
            						current,
            						"expressionRow",
            						lv_expressionRow_6_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getCellSelectAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_24);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getCellSelectAccess().getCommaKeyword_8());
            		

            			newCompositeNode(grammarAccess.getCellSelectAccess().getLCParserRuleCall_9());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1553:3: ( (lv_expressionCol_10_0= ruleExpression ) )
            // InternalCSVs.g:1554:4: (lv_expressionCol_10_0= ruleExpression )
            {
            // InternalCSVs.g:1554:4: (lv_expressionCol_10_0= ruleExpression )
            // InternalCSVs.g:1555:5: lv_expressionCol_10_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCellSelectAccess().getExpressionColExpressionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_expressionCol_10_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellSelectRule());
            					}
            					set(
            						current,
            						"expressionCol",
            						lv_expressionCol_10_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getCellSelectAccess().getLCParserRuleCall_11());
            		
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCellSelectAccess().getRightParenthesisKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellSelect"


    // $ANTLR start "entryRuleFieldSelect"
    // InternalCSVs.g:1587:1: entryRuleFieldSelect returns [EObject current=null] : iv_ruleFieldSelect= ruleFieldSelect EOF ;
    public final EObject entryRuleFieldSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelect = null;


        try {
            // InternalCSVs.g:1587:52: (iv_ruleFieldSelect= ruleFieldSelect EOF )
            // InternalCSVs.g:1588:2: iv_ruleFieldSelect= ruleFieldSelect EOF
            {
             newCompositeNode(grammarAccess.getFieldSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldSelect=ruleFieldSelect();

            state._fsp--;

             current =iv_ruleFieldSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldSelect"


    // $ANTLR start "ruleFieldSelect"
    // InternalCSVs.g:1594:1: ruleFieldSelect returns [EObject current=null] : (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' ) ;
    public final EObject ruleFieldSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1600:2: ( (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' ) )
            // InternalCSVs.g:1601:2: (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' )
            {
            // InternalCSVs.g:1601:2: (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' )
            // InternalCSVs.g:1602:3: otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldSelectAccess().getFieldKeyword_0());
            		

            			newCompositeNode(grammarAccess.getFieldSelectAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1613:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:1614:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:1614:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:1615:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_var_2_0, grammarAccess.getFieldSelectAccess().getVarIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getFieldSelectAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldSelectAccess().getLeftParenthesisKeyword_4());
            		

            			newCompositeNode(grammarAccess.getFieldSelectAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1649:3: ( (lv_expression_6_0= ruleExpression ) )
            // InternalCSVs.g:1650:4: (lv_expression_6_0= ruleExpression )
            {
            // InternalCSVs.g:1650:4: (lv_expression_6_0= ruleExpression )
            // InternalCSVs.g:1651:5: lv_expression_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFieldSelectAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldSelectRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getFieldSelectAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFieldSelectAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldSelect"


    // $ANTLR start "entryRuleCountExpr"
    // InternalCSVs.g:1683:1: entryRuleCountExpr returns [EObject current=null] : iv_ruleCountExpr= ruleCountExpr EOF ;
    public final EObject entryRuleCountExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountExpr = null;


        try {
            // InternalCSVs.g:1683:50: (iv_ruleCountExpr= ruleCountExpr EOF )
            // InternalCSVs.g:1684:2: iv_ruleCountExpr= ruleCountExpr EOF
            {
             newCompositeNode(grammarAccess.getCountExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountExpr=ruleCountExpr();

            state._fsp--;

             current =iv_ruleCountExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountExpr"


    // $ANTLR start "ruleCountExpr"
    // InternalCSVs.g:1690:1: ruleCountExpr returns [EObject current=null] : (otherlv_0= 'count' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' ) ;
    public final EObject ruleCountExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1696:2: ( (otherlv_0= 'count' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' ) )
            // InternalCSVs.g:1697:2: (otherlv_0= 'count' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' )
            {
            // InternalCSVs.g:1697:2: (otherlv_0= 'count' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')' )
            // InternalCSVs.g:1698:3: otherlv_0= 'count' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= ruleExpression ) ) ruleLC otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCountExprAccess().getCountKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCountExprAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1709:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:1710:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:1710:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:1711:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_var_2_0, grammarAccess.getCountExprAccess().getVarIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountExprRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getCountExprAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getCountExprAccess().getLeftParenthesisKeyword_4());
            		

            			newCompositeNode(grammarAccess.getCountExprAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1745:3: ( (lv_expression_6_0= ruleExpression ) )
            // InternalCSVs.g:1746:4: (lv_expression_6_0= ruleExpression )
            {
            // InternalCSVs.g:1746:4: (lv_expression_6_0= ruleExpression )
            // InternalCSVs.g:1747:5: lv_expression_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCountExprAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountExprRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getCountExprAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCountExprAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountExpr"


    // $ANTLR start "entryRuleOr"
    // InternalCSVs.g:1779:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalCSVs.g:1779:43: (iv_ruleOr= ruleOr EOF )
            // InternalCSVs.g:1780:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalCSVs.g:1786:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ruleLC otherlv_3= '||' ruleLC ( (lv_right_5_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_And_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1792:2: ( (this_And_0= ruleAnd ( () ruleLC otherlv_3= '||' ruleLC ( (lv_right_5_0= ruleAnd ) ) )* ) )
            // InternalCSVs.g:1793:2: (this_And_0= ruleAnd ( () ruleLC otherlv_3= '||' ruleLC ( (lv_right_5_0= ruleAnd ) ) )* )
            {
            // InternalCSVs.g:1793:2: (this_And_0= ruleAnd ( () ruleLC otherlv_3= '||' ruleLC ( (lv_right_5_0= ruleAnd ) ) )* )
            // InternalCSVs.g:1794:3: this_And_0= ruleAnd ( () ruleLC otherlv_3= '||' ruleLC ( (lv_right_5_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1802:3: ( () ruleLC otherlv_3= '||' ruleLC ( (lv_right_5_0= ruleAnd ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WS) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==33) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCSVs.g:1803:4: () ruleLC otherlv_3= '||' ruleLC ( (lv_right_5_0= ruleAnd ) )
            	    {
            	    // InternalCSVs.g:1803:4: ()
            	    // InternalCSVs.g:1804:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getOrAccess().getLCParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_26);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_3=(Token)match(input,33,FOLLOW_27); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_2());
            	    			

            	    				newCompositeNode(grammarAccess.getOrAccess().getLCParserRuleCall_1_3());
            	    			
            	    pushFollow(FOLLOW_28);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:1828:4: ( (lv_right_5_0= ruleAnd ) )
            	    // InternalCSVs.g:1829:5: (lv_right_5_0= ruleAnd )
            	    {
            	    // InternalCSVs.g:1829:5: (lv_right_5_0= ruleAnd )
            	    // InternalCSVs.g:1830:6: lv_right_5_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_5_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.agicquel.csvs.CSVs.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalCSVs.g:1852:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalCSVs.g:1852:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalCSVs.g:1853:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalCSVs.g:1859:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ruleLC otherlv_3= '&&' ruleLC ( (lv_right_5_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Equality_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1865:2: ( (this_Equality_0= ruleEquality ( () ruleLC otherlv_3= '&&' ruleLC ( (lv_right_5_0= ruleEquality ) ) )* ) )
            // InternalCSVs.g:1866:2: (this_Equality_0= ruleEquality ( () ruleLC otherlv_3= '&&' ruleLC ( (lv_right_5_0= ruleEquality ) ) )* )
            {
            // InternalCSVs.g:1866:2: (this_Equality_0= ruleEquality ( () ruleLC otherlv_3= '&&' ruleLC ( (lv_right_5_0= ruleEquality ) ) )* )
            // InternalCSVs.g:1867:3: this_Equality_0= ruleEquality ( () ruleLC otherlv_3= '&&' ruleLC ( (lv_right_5_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1875:3: ( () ruleLC otherlv_3= '&&' ruleLC ( (lv_right_5_0= ruleEquality ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WS) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==34) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCSVs.g:1876:4: () ruleLC otherlv_3= '&&' ruleLC ( (lv_right_5_0= ruleEquality ) )
            	    {
            	    // InternalCSVs.g:1876:4: ()
            	    // InternalCSVs.g:1877:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getAndAccess().getLCParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_30);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_3=(Token)match(input,34,FOLLOW_27); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_2());
            	    			

            	    				newCompositeNode(grammarAccess.getAndAccess().getLCParserRuleCall_1_3());
            	    			
            	    pushFollow(FOLLOW_28);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:1901:4: ( (lv_right_5_0= ruleEquality ) )
            	    // InternalCSVs.g:1902:5: (lv_right_5_0= ruleEquality )
            	    {
            	    // InternalCSVs.g:1902:5: (lv_right_5_0= ruleEquality )
            	    // InternalCSVs.g:1903:6: lv_right_5_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_5_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.agicquel.csvs.CSVs.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalCSVs.g:1925:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalCSVs.g:1925:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalCSVs.g:1926:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalCSVs.g:1932:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ruleLC ( ( (lv_op_3_1= '==' | lv_op_3_2= '!=' ) ) ) ruleLC ( (lv_right_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1938:2: ( (this_Comparison_0= ruleComparison ( () ruleLC ( ( (lv_op_3_1= '==' | lv_op_3_2= '!=' ) ) ) ruleLC ( (lv_right_5_0= ruleComparison ) ) )* ) )
            // InternalCSVs.g:1939:2: (this_Comparison_0= ruleComparison ( () ruleLC ( ( (lv_op_3_1= '==' | lv_op_3_2= '!=' ) ) ) ruleLC ( (lv_right_5_0= ruleComparison ) ) )* )
            {
            // InternalCSVs.g:1939:2: (this_Comparison_0= ruleComparison ( () ruleLC ( ( (lv_op_3_1= '==' | lv_op_3_2= '!=' ) ) ) ruleLC ( (lv_right_5_0= ruleComparison ) ) )* )
            // InternalCSVs.g:1940:3: this_Comparison_0= ruleComparison ( () ruleLC ( ( (lv_op_3_1= '==' | lv_op_3_2= '!=' ) ) ) ruleLC ( (lv_right_5_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1948:3: ( () ruleLC ( ( (lv_op_3_1= '==' | lv_op_3_2= '!=' ) ) ) ruleLC ( (lv_right_5_0= ruleComparison ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_WS) ) {
                    int LA14_1 = input.LA(2);

                    if ( ((LA14_1>=35 && LA14_1<=36)) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>=35 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCSVs.g:1949:4: () ruleLC ( ( (lv_op_3_1= '==' | lv_op_3_2= '!=' ) ) ) ruleLC ( (lv_right_5_0= ruleComparison ) )
            	    {
            	    // InternalCSVs.g:1949:4: ()
            	    // InternalCSVs.g:1950:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getEqualityAccess().getLCParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_32);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:1963:4: ( ( (lv_op_3_1= '==' | lv_op_3_2= '!=' ) ) )
            	    // InternalCSVs.g:1964:5: ( (lv_op_3_1= '==' | lv_op_3_2= '!=' ) )
            	    {
            	    // InternalCSVs.g:1964:5: ( (lv_op_3_1= '==' | lv_op_3_2= '!=' ) )
            	    // InternalCSVs.g:1965:6: (lv_op_3_1= '==' | lv_op_3_2= '!=' )
            	    {
            	    // InternalCSVs.g:1965:6: (lv_op_3_1= '==' | lv_op_3_2= '!=' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==35) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==36) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalCSVs.g:1966:7: lv_op_3_1= '=='
            	            {
            	            lv_op_3_1=(Token)match(input,35,FOLLOW_27); 

            	            							newLeafNode(lv_op_3_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_2_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_3_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVs.g:1977:7: lv_op_3_2= '!='
            	            {
            	            lv_op_3_2=(Token)match(input,36,FOLLOW_27); 

            	            							newLeafNode(lv_op_3_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_2_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_3_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getEqualityAccess().getLCParserRuleCall_1_3());
            	    			
            	    pushFollow(FOLLOW_28);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:1997:4: ( (lv_right_5_0= ruleComparison ) )
            	    // InternalCSVs.g:1998:5: (lv_right_5_0= ruleComparison )
            	    {
            	    // InternalCSVs.g:1998:5: (lv_right_5_0= ruleComparison )
            	    // InternalCSVs.g:1999:6: lv_right_5_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_5_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.agicquel.csvs.CSVs.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalCSVs.g:2021:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalCSVs.g:2021:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalCSVs.g:2022:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalCSVs.g:2028:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ruleLC ( ( (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' ) ) ) ruleLC ( (lv_right_5_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token lv_op_3_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2034:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ruleLC ( ( (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' ) ) ) ruleLC ( (lv_right_5_0= rulePlusOrMinus ) ) )* ) )
            // InternalCSVs.g:2035:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ruleLC ( ( (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' ) ) ) ruleLC ( (lv_right_5_0= rulePlusOrMinus ) ) )* )
            {
            // InternalCSVs.g:2035:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ruleLC ( ( (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' ) ) ) ruleLC ( (lv_right_5_0= rulePlusOrMinus ) ) )* )
            // InternalCSVs.g:2036:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ruleLC ( ( (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' ) ) ) ruleLC ( (lv_right_5_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2044:3: ( () ruleLC ( ( (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' ) ) ) ruleLC ( (lv_right_5_0= rulePlusOrMinus ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WS) ) {
                    int LA16_1 = input.LA(2);

                    if ( ((LA16_1>=37 && LA16_1<=40)) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>=37 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCSVs.g:2045:4: () ruleLC ( ( (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' ) ) ) ruleLC ( (lv_right_5_0= rulePlusOrMinus ) )
            	    {
            	    // InternalCSVs.g:2045:4: ()
            	    // InternalCSVs.g:2046:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getComparisonAccess().getLCParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_34);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2059:4: ( ( (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' ) ) )
            	    // InternalCSVs.g:2060:5: ( (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' ) )
            	    {
            	    // InternalCSVs.g:2060:5: ( (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' ) )
            	    // InternalCSVs.g:2061:6: (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' )
            	    {
            	    // InternalCSVs.g:2061:6: (lv_op_3_1= '>=' | lv_op_3_2= '<=' | lv_op_3_3= '>' | lv_op_3_4= '<' )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalCSVs.g:2062:7: lv_op_3_1= '>='
            	            {
            	            lv_op_3_1=(Token)match(input,37,FOLLOW_27); 

            	            							newLeafNode(lv_op_3_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_2_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_3_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVs.g:2073:7: lv_op_3_2= '<='
            	            {
            	            lv_op_3_2=(Token)match(input,38,FOLLOW_27); 

            	            							newLeafNode(lv_op_3_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_2_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_3_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalCSVs.g:2084:7: lv_op_3_3= '>'
            	            {
            	            lv_op_3_3=(Token)match(input,39,FOLLOW_27); 

            	            							newLeafNode(lv_op_3_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_2_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_3_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalCSVs.g:2095:7: lv_op_3_4= '<'
            	            {
            	            lv_op_3_4=(Token)match(input,40,FOLLOW_27); 

            	            							newLeafNode(lv_op_3_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_2_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_3_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getComparisonAccess().getLCParserRuleCall_1_3());
            	    			
            	    pushFollow(FOLLOW_28);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2115:4: ( (lv_right_5_0= rulePlusOrMinus ) )
            	    // InternalCSVs.g:2116:5: (lv_right_5_0= rulePlusOrMinus )
            	    {
            	    // InternalCSVs.g:2116:5: (lv_right_5_0= rulePlusOrMinus )
            	    // InternalCSVs.g:2117:6: lv_right_5_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_5_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.agicquel.csvs.CSVs.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalCSVs.g:2139:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalCSVs.g:2139:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalCSVs.g:2140:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalCSVs.g:2146:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( () ruleLC ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ) ruleLC ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2152:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( () ruleLC ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ) ruleLC ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalCSVs.g:2153:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( () ruleLC ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ) ruleLC ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalCSVs.g:2153:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( () ruleLC ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ) ruleLC ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalCSVs.g:2154:3: this_MulOrDiv_0= ruleMulOrDiv ( ( () ruleLC ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ) ruleLC ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2162:3: ( ( () ruleLC ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ) ruleLC ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    int LA18_1 = input.LA(2);

                    if ( ((LA18_1>=41 && LA18_1<=42)) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>=41 && LA18_0<=42)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCSVs.g:2163:4: ( () ruleLC ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ) ruleLC ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalCSVs.g:2163:4: ( () ruleLC ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) )
            	    // InternalCSVs.g:2164:5: () ruleLC ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) )
            	    {
            	    // InternalCSVs.g:2164:5: ()
            	    // InternalCSVs.g:2165:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }


            	    					newCompositeNode(grammarAccess.getPlusOrMinusAccess().getLCParserRuleCall_1_0_1());
            	    				
            	    pushFollow(FOLLOW_36);
            	    ruleLC();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				
            	    // InternalCSVs.g:2178:5: ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) )
            	    // InternalCSVs.g:2179:6: ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) )
            	    {
            	    // InternalCSVs.g:2179:6: ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) )
            	    // InternalCSVs.g:2180:7: (lv_op_3_1= '+' | lv_op_3_2= '-' )
            	    {
            	    // InternalCSVs.g:2180:7: (lv_op_3_1= '+' | lv_op_3_2= '-' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==41) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==42) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalCSVs.g:2181:8: lv_op_3_1= '+'
            	            {
            	            lv_op_3_1=(Token)match(input,41,FOLLOW_27); 

            	            								newLeafNode(lv_op_3_1, grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_2_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_3_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVs.g:2192:8: lv_op_3_2= '-'
            	            {
            	            lv_op_3_2=(Token)match(input,42,FOLLOW_27); 

            	            								newLeafNode(lv_op_3_2, grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_2_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_3_2, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getPlusOrMinusAccess().getLCParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_28);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2213:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalCSVs.g:2214:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalCSVs.g:2214:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalCSVs.g:2215:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.agicquel.csvs.CSVs.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalCSVs.g:2237:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalCSVs.g:2237:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalCSVs.g:2238:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalCSVs.g:2244:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () ruleLC ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ) ruleLC ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2250:2: ( (this_Primary_0= rulePrimary ( ( () ruleLC ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ) ruleLC ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalCSVs.g:2251:2: (this_Primary_0= rulePrimary ( ( () ruleLC ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ) ruleLC ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalCSVs.g:2251:2: (this_Primary_0= rulePrimary ( ( () ruleLC ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ) ruleLC ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalCSVs.g:2252:3: this_Primary_0= rulePrimary ( ( () ruleLC ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ) ruleLC ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2260:3: ( ( () ruleLC ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ) ruleLC ( (lv_right_5_0= rulePrimary ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    int LA20_1 = input.LA(2);

                    if ( ((LA20_1>=43 && LA20_1<=44)) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>=43 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCSVs.g:2261:4: ( () ruleLC ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ) ruleLC ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalCSVs.g:2261:4: ( () ruleLC ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) )
            	    // InternalCSVs.g:2262:5: () ruleLC ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) )
            	    {
            	    // InternalCSVs.g:2262:5: ()
            	    // InternalCSVs.g:2263:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }


            	    					newCompositeNode(grammarAccess.getMulOrDivAccess().getLCParserRuleCall_1_0_1());
            	    				
            	    pushFollow(FOLLOW_38);
            	    ruleLC();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				
            	    // InternalCSVs.g:2276:5: ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) )
            	    // InternalCSVs.g:2277:6: ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) )
            	    {
            	    // InternalCSVs.g:2277:6: ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) )
            	    // InternalCSVs.g:2278:7: (lv_op_3_1= '*' | lv_op_3_2= '/' )
            	    {
            	    // InternalCSVs.g:2278:7: (lv_op_3_1= '*' | lv_op_3_2= '/' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==43) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==44) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalCSVs.g:2279:8: lv_op_3_1= '*'
            	            {
            	            lv_op_3_1=(Token)match(input,43,FOLLOW_27); 

            	            								newLeafNode(lv_op_3_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_2_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMulOrDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_3_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVs.g:2290:8: lv_op_3_2= '/'
            	            {
            	            lv_op_3_2=(Token)match(input,44,FOLLOW_27); 

            	            								newLeafNode(lv_op_3_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_2_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMulOrDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_3_2, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getMulOrDivAccess().getLCParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_28);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2311:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalCSVs.g:2312:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalCSVs.g:2312:5: (lv_right_5_0= rulePrimary )
            	    // InternalCSVs.g:2313:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.agicquel.csvs.CSVs.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalCSVs.g:2335:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalCSVs.g:2335:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalCSVs.g:2336:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalCSVs.g:2342:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | ( () otherlv_6= '!' ( (lv_expression_7_0= rulePrimary ) ) ) | this_Atomic_8= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Expression_2 = null;

        EObject lv_expression_7_0 = null;

        EObject this_Atomic_8 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2348:2: ( ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | ( () otherlv_6= '!' ( (lv_expression_7_0= rulePrimary ) ) ) | this_Atomic_8= ruleAtomic ) )
            // InternalCSVs.g:2349:2: ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | ( () otherlv_6= '!' ( (lv_expression_7_0= rulePrimary ) ) ) | this_Atomic_8= ruleAtomic )
            {
            // InternalCSVs.g:2349:2: ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | ( () otherlv_6= '!' ( (lv_expression_7_0= rulePrimary ) ) ) | this_Atomic_8= ruleAtomic )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt21=1;
                }
                break;
            case 45:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 46:
            case 47:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalCSVs.g:2350:3: (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' )
                    {
                    // InternalCSVs.g:2350:3: (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' )
                    // InternalCSVs.g:2351:4: otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getLCParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_11);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getLCParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_12);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVs.g:2383:3: ( () otherlv_6= '!' ( (lv_expression_7_0= rulePrimary ) ) )
                    {
                    // InternalCSVs.g:2383:3: ( () otherlv_6= '!' ( (lv_expression_7_0= rulePrimary ) ) )
                    // InternalCSVs.g:2384:4: () otherlv_6= '!' ( (lv_expression_7_0= rulePrimary ) )
                    {
                    // InternalCSVs.g:2384:4: ()
                    // InternalCSVs.g:2385:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,45,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalCSVs.g:2395:4: ( (lv_expression_7_0= rulePrimary ) )
                    // InternalCSVs.g:2396:5: (lv_expression_7_0= rulePrimary )
                    {
                    // InternalCSVs.g:2396:5: (lv_expression_7_0= rulePrimary )
                    // InternalCSVs.g:2397:6: lv_expression_7_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_7_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_7_0,
                    							"com.agicquel.csvs.CSVs.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCSVs.g:2416:3: this_Atomic_8= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_8=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalCSVs.g:2428:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalCSVs.g:2428:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalCSVs.g:2429:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalCSVs.g:2435:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | this_VariableExpr_6= ruleVariableExpr ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        EObject this_VariableExpr_6 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2441:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | this_VariableExpr_6= ruleVariableExpr ) )
            // InternalCSVs.g:2442:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | this_VariableExpr_6= ruleVariableExpr )
            {
            // InternalCSVs.g:2442:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | this_VariableExpr_6= ruleVariableExpr )
            int alt23=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt23=1;
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case 46:
            case 47:
                {
                alt23=3;
                }
                break;
            case RULE_ID:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalCSVs.g:2443:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalCSVs.g:2443:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalCSVs.g:2444:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalCSVs.g:2444:4: ()
                    // InternalCSVs.g:2445:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:2451:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalCSVs.g:2452:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalCSVs.g:2452:5: (lv_value_1_0= RULE_INT )
                    // InternalCSVs.g:2453:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCSVs.g:2471:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCSVs.g:2471:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCSVs.g:2472:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCSVs.g:2472:4: ()
                    // InternalCSVs.g:2473:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:2479:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCSVs.g:2480:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCSVs.g:2480:5: (lv_value_3_0= RULE_STRING )
                    // InternalCSVs.g:2481:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCSVs.g:2499:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalCSVs.g:2499:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalCSVs.g:2500:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalCSVs.g:2500:4: ()
                    // InternalCSVs.g:2501:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:2507:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalCSVs.g:2508:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalCSVs.g:2508:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalCSVs.g:2509:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalCSVs.g:2509:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==46) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==47) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalCSVs.g:2510:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,46,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCSVs.g:2521:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,47,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCSVs.g:2536:3: this_VariableExpr_6= ruleVariableExpr
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getVariableExprParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableExpr_6=ruleVariableExpr();

                    state._fsp--;


                    			current = this_VariableExpr_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000007FA4190L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000E001B8008270L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000E00000008270L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000E00000008260L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001800000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000001E000000012L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000060000000012L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000180000000012L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000180000000000L});

}