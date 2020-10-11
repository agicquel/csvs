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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INT", "RULE_ANY_OTHER", "';'", "'{'", "'}'", "'while'", "'('", "')'", "'if'", "'else'", "'load'", "'store'", "'export'", "'create'", "'='", "'print'", "'delete'", "'add'", "'row'", "'col'", "'on'", "'filter'", "':'", "'apply'", "'cell'", "','", "'field'", "'count'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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
    public static final int T__48=48;
    public static final int T__49=49;
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
        	return "Model";
       	}

       	@Override
       	protected CSVsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCSVs.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCSVs.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCSVs.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCSVs.g:71:1: ruleModel returns [EObject current=null] : ( ruleLC ( (lv_commands_1_0= ruleCommand ) )* ruleLC ) ;
    public final EObject ruleModel() throws RecognitionException {
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

            			newCompositeNode(grammarAccess.getModelAccess().getLCParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:86:3: ( (lv_commands_1_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=RULE_ML_COMMENT && LA1_0<=RULE_SL_COMMENT)||LA1_0==14||LA1_0==17||(LA1_0>=19 && LA1_0<=22)||(LA1_0>=24 && LA1_0<=29)||LA1_0==33||LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCSVs.g:87:4: (lv_commands_1_0= ruleCommand )
            	    {
            	    // InternalCSVs.g:87:4: (lv_commands_1_0= ruleCommand )
            	    // InternalCSVs.g:88:5: lv_commands_1_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_commands_1_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
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


            			newCompositeNode(grammarAccess.getModelAccess().getLCParserRuleCall_2());
            		
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
    // $ANTLR end "ruleModel"


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
    // InternalCSVs.g:149:1: ruleCommand returns [EObject current=null] : ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | ( () ruleCommentCommand ) | this_ControlCommand_5= ruleControlCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CsvCommand_0 = null;

        EObject this_ControlCommand_5 = null;



        	enterRule();

        try {
            // InternalCSVs.g:155:2: ( ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | ( () ruleCommentCommand ) | this_ControlCommand_5= ruleControlCommand ) )
            // InternalCSVs.g:156:2: ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | ( () ruleCommentCommand ) | this_ControlCommand_5= ruleControlCommand )
            {
            // InternalCSVs.g:156:2: ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | ( () ruleCommentCommand ) | this_ControlCommand_5= ruleControlCommand )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 33:
            case 35:
                {
                alt3=1;
                }
                break;
            case RULE_ML_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt3=2;
                }
                break;
            case 14:
            case 17:
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
                    // InternalCSVs.g:179:3: ( () ruleCommentCommand )
                    {
                    // InternalCSVs.g:179:3: ( () ruleCommentCommand )
                    // InternalCSVs.g:180:4: () ruleCommentCommand
                    {
                    // InternalCSVs.g:180:4: ()
                    // InternalCSVs.g:181:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getCommandAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getCommandAccess().getCommentCommandParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleCommentCommand();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVs.g:196:3: this_ControlCommand_5= ruleControlCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getControlCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlCommand_5=ruleControlCommand();

                    state._fsp--;


                    			current = this_ControlCommand_5;
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
    // InternalCSVs.g:215:1: ruleBlock returns [EObject current=null] : (otherlv_0= '{' ruleLC this_Model_2= ruleModel ruleLC otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_Model_2 = null;



        	enterRule();

        try {
            // InternalCSVs.g:221:2: ( (otherlv_0= '{' ruleLC this_Model_2= ruleModel ruleLC otherlv_4= '}' ) )
            // InternalCSVs.g:222:2: (otherlv_0= '{' ruleLC this_Model_2= ruleModel ruleLC otherlv_4= '}' )
            {
            // InternalCSVs.g:222:2: (otherlv_0= '{' ruleLC this_Model_2= ruleModel ruleLC otherlv_4= '}' )
            // InternalCSVs.g:223:3: otherlv_0= '{' ruleLC this_Model_2= ruleModel ruleLC otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBlockAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getBlockAccess().getModelParserRuleCall_2());
            		
            pushFollow(FOLLOW_6);
            this_Model_2=ruleModel();

            state._fsp--;


            			current = this_Model_2;
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
    // InternalCSVs.g:540:1: ruleCsvCommand returns [EObject current=null] : (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_AddCommand_7= ruleAddCommand | this_ApplyCommand_8= ruleApplyCommand ) ;
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

        EObject this_ApplyCommand_8 = null;



        	enterRule();

        try {
            // InternalCSVs.g:546:2: ( (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_AddCommand_7= ruleAddCommand | this_ApplyCommand_8= ruleApplyCommand ) )
            // InternalCSVs.g:547:2: (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_AddCommand_7= ruleAddCommand | this_ApplyCommand_8= ruleApplyCommand )
            {
            // InternalCSVs.g:547:2: (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_AddCommand_7= ruleAddCommand | this_ApplyCommand_8= ruleApplyCommand )
            int alt6=9;
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
            case 22:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
            case 27:
            case 28:
            case 33:
            case 35:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            case 21:
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
            case 29:
                {
                alt6=9;
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
                case 9 :
                    // InternalCSVs.g:620:3: this_ApplyCommand_8= ruleApplyCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getApplyCommandParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplyCommand_8=ruleApplyCommand();

                    state._fsp--;


                    			current = this_ApplyCommand_8;
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
    // InternalCSVs.g:632:1: entryRuleLoadCommand returns [EObject current=null] : iv_ruleLoadCommand= ruleLoadCommand EOF ;
    public final EObject entryRuleLoadCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadCommand = null;


        try {
            // InternalCSVs.g:632:52: (iv_ruleLoadCommand= ruleLoadCommand EOF )
            // InternalCSVs.g:633:2: iv_ruleLoadCommand= ruleLoadCommand EOF
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
    // InternalCSVs.g:639:1: ruleLoadCommand returns [EObject current=null] : (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleLoadCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token lv_path_4_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:645:2: ( (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) )
            // InternalCSVs.g:646:2: (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            {
            // InternalCSVs.g:646:2: (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            // InternalCSVs.g:647:3: otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadCommandAccess().getLoadKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLoadCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:658:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:659:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:659:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:660:5: lv_var_2_0= RULE_ID
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
            		
            // InternalCSVs.g:683:3: ( (lv_path_4_0= RULE_STRING ) )
            // InternalCSVs.g:684:4: (lv_path_4_0= RULE_STRING )
            {
            // InternalCSVs.g:684:4: (lv_path_4_0= RULE_STRING )
            // InternalCSVs.g:685:5: lv_path_4_0= RULE_STRING
            {
            lv_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_4_0, grammarAccess.getLoadCommandAccess().getPathSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleLoadCommand"


    // $ANTLR start "entryRuleStoreCommand"
    // InternalCSVs.g:705:1: entryRuleStoreCommand returns [EObject current=null] : iv_ruleStoreCommand= ruleStoreCommand EOF ;
    public final EObject entryRuleStoreCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreCommand = null;


        try {
            // InternalCSVs.g:705:53: (iv_ruleStoreCommand= ruleStoreCommand EOF )
            // InternalCSVs.g:706:2: iv_ruleStoreCommand= ruleStoreCommand EOF
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
    // InternalCSVs.g:712:1: ruleStoreCommand returns [EObject current=null] : (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleStoreCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token lv_path_4_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:718:2: ( (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) )
            // InternalCSVs.g:719:2: (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            {
            // InternalCSVs.g:719:2: (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            // InternalCSVs.g:720:3: otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreCommandAccess().getStoreKeyword_0());
            		

            			newCompositeNode(grammarAccess.getStoreCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:731:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:732:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:732:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:733:5: lv_var_2_0= RULE_ID
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
            		
            // InternalCSVs.g:756:3: ( (lv_path_4_0= RULE_STRING ) )
            // InternalCSVs.g:757:4: (lv_path_4_0= RULE_STRING )
            {
            // InternalCSVs.g:757:4: (lv_path_4_0= RULE_STRING )
            // InternalCSVs.g:758:5: lv_path_4_0= RULE_STRING
            {
            lv_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_4_0, grammarAccess.getStoreCommandAccess().getPathSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleStoreCommand"


    // $ANTLR start "entryRuleExportCommand"
    // InternalCSVs.g:778:1: entryRuleExportCommand returns [EObject current=null] : iv_ruleExportCommand= ruleExportCommand EOF ;
    public final EObject entryRuleExportCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportCommand = null;


        try {
            // InternalCSVs.g:778:54: (iv_ruleExportCommand= ruleExportCommand EOF )
            // InternalCSVs.g:779:2: iv_ruleExportCommand= ruleExportCommand EOF
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
    // InternalCSVs.g:785:1: ruleExportCommand returns [EObject current=null] : (otherlv_0= 'export' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleExportCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token lv_path_4_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:791:2: ( (otherlv_0= 'export' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) )
            // InternalCSVs.g:792:2: (otherlv_0= 'export' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            {
            // InternalCSVs.g:792:2: (otherlv_0= 'export' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            // InternalCSVs.g:793:3: otherlv_0= 'export' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getExportCommandAccess().getExportKeyword_0());
            		

            			newCompositeNode(grammarAccess.getExportCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:804:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:805:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:805:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:806:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_var_2_0, grammarAccess.getExportCommandAccess().getVarIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getExportCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:829:3: ( (lv_path_4_0= RULE_STRING ) )
            // InternalCSVs.g:830:4: (lv_path_4_0= RULE_STRING )
            {
            // InternalCSVs.g:830:4: (lv_path_4_0= RULE_STRING )
            // InternalCSVs.g:831:5: lv_path_4_0= RULE_STRING
            {
            lv_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_4_0, grammarAccess.getExportCommandAccess().getPathSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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


    // $ANTLR start "entryRuleCreateCommand"
    // InternalCSVs.g:851:1: entryRuleCreateCommand returns [EObject current=null] : iv_ruleCreateCommand= ruleCreateCommand EOF ;
    public final EObject entryRuleCreateCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateCommand = null;


        try {
            // InternalCSVs.g:851:54: (iv_ruleCreateCommand= ruleCreateCommand EOF )
            // InternalCSVs.g:852:2: iv_ruleCreateCommand= ruleCreateCommand EOF
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
    // InternalCSVs.g:858:1: ruleCreateCommand returns [EObject current=null] : (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCreateCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:864:2: ( (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) ) )
            // InternalCSVs.g:865:2: (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) )
            {
            // InternalCSVs.g:865:2: (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) )
            // InternalCSVs.g:866:3: otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateCommandAccess().getCreateKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCreateCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:877:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:878:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:878:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:879:5: lv_var_2_0= RULE_ID
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
    // InternalCSVs.g:899:1: entryRuleSetCommand returns [EObject current=null] : iv_ruleSetCommand= ruleSetCommand EOF ;
    public final EObject entryRuleSetCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetCommand = null;


        try {
            // InternalCSVs.g:899:51: (iv_ruleSetCommand= ruleSetCommand EOF )
            // InternalCSVs.g:900:2: iv_ruleSetCommand= ruleSetCommand EOF
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
    // InternalCSVs.g:906:1: ruleSetCommand returns [EObject current=null] : ( ( (lv_var_0_0= ruleSelector ) ) ruleLC otherlv_2= '=' ruleLC ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleSetCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_var_0_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:912:2: ( ( ( (lv_var_0_0= ruleSelector ) ) ruleLC otherlv_2= '=' ruleLC ( (lv_expression_4_0= ruleExpression ) ) ) )
            // InternalCSVs.g:913:2: ( ( (lv_var_0_0= ruleSelector ) ) ruleLC otherlv_2= '=' ruleLC ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:913:2: ( ( (lv_var_0_0= ruleSelector ) ) ruleLC otherlv_2= '=' ruleLC ( (lv_expression_4_0= ruleExpression ) ) )
            // InternalCSVs.g:914:3: ( (lv_var_0_0= ruleSelector ) ) ruleLC otherlv_2= '=' ruleLC ( (lv_expression_4_0= ruleExpression ) )
            {
            // InternalCSVs.g:914:3: ( (lv_var_0_0= ruleSelector ) )
            // InternalCSVs.g:915:4: (lv_var_0_0= ruleSelector )
            {
            // InternalCSVs.g:915:4: (lv_var_0_0= ruleSelector )
            // InternalCSVs.g:916:5: lv_var_0_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getSetCommandAccess().getVarSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_var_0_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetCommandRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"com.agicquel.csvs.CSVs.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getSetCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_22);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSetCommandAccess().getEqualsSignKeyword_2());
            		

            			newCompositeNode(grammarAccess.getSetCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:951:3: ( (lv_expression_4_0= ruleExpression ) )
            // InternalCSVs.g:952:4: (lv_expression_4_0= ruleExpression )
            {
            // InternalCSVs.g:952:4: (lv_expression_4_0= ruleExpression )
            // InternalCSVs.g:953:5: lv_expression_4_0= ruleExpression
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
    // InternalCSVs.g:974:1: entryRulePrintCommand returns [EObject current=null] : iv_rulePrintCommand= rulePrintCommand EOF ;
    public final EObject entryRulePrintCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCommand = null;


        try {
            // InternalCSVs.g:974:53: (iv_rulePrintCommand= rulePrintCommand EOF )
            // InternalCSVs.g:975:2: iv_rulePrintCommand= rulePrintCommand EOF
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
    // InternalCSVs.g:981:1: rulePrintCommand returns [EObject current=null] : (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject rulePrintCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:987:2: ( (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalCSVs.g:988:2: (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:988:2: (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalCSVs.g:989:3: otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintCommandAccess().getPrintKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPrintCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1000:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalCSVs.g:1001:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalCSVs.g:1001:4: (lv_expression_2_0= ruleExpression )
            // InternalCSVs.g:1002:5: lv_expression_2_0= ruleExpression
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


    // $ANTLR start "entryRuleDeleteCommand"
    // InternalCSVs.g:1023:1: entryRuleDeleteCommand returns [EObject current=null] : iv_ruleDeleteCommand= ruleDeleteCommand EOF ;
    public final EObject entryRuleDeleteCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteCommand = null;


        try {
            // InternalCSVs.g:1023:54: (iv_ruleDeleteCommand= ruleDeleteCommand EOF )
            // InternalCSVs.g:1024:2: iv_ruleDeleteCommand= ruleDeleteCommand EOF
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
    // InternalCSVs.g:1030:1: ruleDeleteCommand returns [EObject current=null] : (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleDeleteCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1036:2: ( (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalCSVs.g:1037:2: (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:1037:2: (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalCSVs.g:1038:3: otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteCommandAccess().getDeleteKeyword_0());
            		

            			newCompositeNode(grammarAccess.getDeleteCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1049:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalCSVs.g:1050:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalCSVs.g:1050:4: (lv_expression_2_0= ruleExpression )
            // InternalCSVs.g:1051:5: lv_expression_2_0= ruleExpression
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
    // InternalCSVs.g:1072:1: entryRuleAddCommand returns [EObject current=null] : iv_ruleAddCommand= ruleAddCommand EOF ;
    public final EObject entryRuleAddCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddCommand = null;


        try {
            // InternalCSVs.g:1072:51: (iv_ruleAddCommand= ruleAddCommand EOF )
            // InternalCSVs.g:1073:2: iv_ruleAddCommand= ruleAddCommand EOF
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
    // InternalCSVs.g:1079:1: ruleAddCommand returns [EObject current=null] : (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleAddCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1085:2: ( (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) ) )
            // InternalCSVs.g:1086:2: (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:1086:2: (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) ) )
            // InternalCSVs.g:1087:3: otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getAddCommandAccess().getAddKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAddCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_24);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1098:3: ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) )
            // InternalCSVs.g:1099:4: ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) )
            {
            // InternalCSVs.g:1099:4: ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) )
            // InternalCSVs.g:1100:5: (lv_op_2_1= 'row' | lv_op_2_2= 'col' )
            {
            // InternalCSVs.g:1100:5: (lv_op_2_1= 'row' | lv_op_2_2= 'col' )
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
                    // InternalCSVs.g:1101:6: lv_op_2_1= 'row'
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
                    // InternalCSVs.g:1112:6: lv_op_2_2= 'col'
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
            		
            // InternalCSVs.g:1132:3: ( (lv_expression_4_0= ruleExpression ) )
            // InternalCSVs.g:1133:4: (lv_expression_4_0= ruleExpression )
            {
            // InternalCSVs.g:1133:4: (lv_expression_4_0= ruleExpression )
            // InternalCSVs.g:1134:5: lv_expression_4_0= ruleExpression
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


    // $ANTLR start "entryRuleApplyCommand"
    // InternalCSVs.g:1155:1: entryRuleApplyCommand returns [EObject current=null] : iv_ruleApplyCommand= ruleApplyCommand EOF ;
    public final EObject entryRuleApplyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyCommand = null;


        try {
            // InternalCSVs.g:1155:53: (iv_ruleApplyCommand= ruleApplyCommand EOF )
            // InternalCSVs.g:1156:2: iv_ruleApplyCommand= ruleApplyCommand EOF
            {
             newCompositeNode(grammarAccess.getApplyCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplyCommand=ruleApplyCommand();

            state._fsp--;

             current =iv_ruleApplyCommand; 
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
    // $ANTLR end "entryRuleApplyCommand"


    // $ANTLR start "ruleApplyCommand"
    // InternalCSVs.g:1162:1: ruleApplyCommand returns [EObject current=null] : (otherlv_0= 'on' ruleLC ( (lv_selection_2_0= ruleSelector ) ) ruleLC ( (lv_if_4_0= ruleApplyFilterCommand ) )? ruleLC ( (lv_exec_6_0= ruleApplyExecCommand ) ) ) ;
    public final EObject ruleApplyCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_selection_2_0 = null;

        EObject lv_if_4_0 = null;

        EObject lv_exec_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1168:2: ( (otherlv_0= 'on' ruleLC ( (lv_selection_2_0= ruleSelector ) ) ruleLC ( (lv_if_4_0= ruleApplyFilterCommand ) )? ruleLC ( (lv_exec_6_0= ruleApplyExecCommand ) ) ) )
            // InternalCSVs.g:1169:2: (otherlv_0= 'on' ruleLC ( (lv_selection_2_0= ruleSelector ) ) ruleLC ( (lv_if_4_0= ruleApplyFilterCommand ) )? ruleLC ( (lv_exec_6_0= ruleApplyExecCommand ) ) )
            {
            // InternalCSVs.g:1169:2: (otherlv_0= 'on' ruleLC ( (lv_selection_2_0= ruleSelector ) ) ruleLC ( (lv_if_4_0= ruleApplyFilterCommand ) )? ruleLC ( (lv_exec_6_0= ruleApplyExecCommand ) ) )
            // InternalCSVs.g:1170:3: otherlv_0= 'on' ruleLC ( (lv_selection_2_0= ruleSelector ) ) ruleLC ( (lv_if_4_0= ruleApplyFilterCommand ) )? ruleLC ( (lv_exec_6_0= ruleApplyExecCommand ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getApplyCommandAccess().getOnKeyword_0());
            		

            			newCompositeNode(grammarAccess.getApplyCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_26);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1181:3: ( (lv_selection_2_0= ruleSelector ) )
            // InternalCSVs.g:1182:4: (lv_selection_2_0= ruleSelector )
            {
            // InternalCSVs.g:1182:4: (lv_selection_2_0= ruleSelector )
            // InternalCSVs.g:1183:5: lv_selection_2_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getApplyCommandAccess().getSelectionSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_selection_2_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplyCommandRule());
            					}
            					set(
            						current,
            						"selection",
            						lv_selection_2_0,
            						"com.agicquel.csvs.CSVs.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getApplyCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_27);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1207:3: ( (lv_if_4_0= ruleApplyFilterCommand ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCSVs.g:1208:4: (lv_if_4_0= ruleApplyFilterCommand )
                    {
                    // InternalCSVs.g:1208:4: (lv_if_4_0= ruleApplyFilterCommand )
                    // InternalCSVs.g:1209:5: lv_if_4_0= ruleApplyFilterCommand
                    {

                    					newCompositeNode(grammarAccess.getApplyCommandAccess().getIfApplyFilterCommandParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_if_4_0=ruleApplyFilterCommand();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplyCommandRule());
                    					}
                    					set(
                    						current,
                    						"if",
                    						lv_if_4_0,
                    						"com.agicquel.csvs.CSVs.ApplyFilterCommand");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getApplyCommandAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_27);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1233:3: ( (lv_exec_6_0= ruleApplyExecCommand ) )
            // InternalCSVs.g:1234:4: (lv_exec_6_0= ruleApplyExecCommand )
            {
            // InternalCSVs.g:1234:4: (lv_exec_6_0= ruleApplyExecCommand )
            // InternalCSVs.g:1235:5: lv_exec_6_0= ruleApplyExecCommand
            {

            					newCompositeNode(grammarAccess.getApplyCommandAccess().getExecApplyExecCommandParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_exec_6_0=ruleApplyExecCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplyCommandRule());
            					}
            					set(
            						current,
            						"exec",
            						lv_exec_6_0,
            						"com.agicquel.csvs.CSVs.ApplyExecCommand");
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
    // $ANTLR end "ruleApplyCommand"


    // $ANTLR start "entryRuleApplyFilterCommand"
    // InternalCSVs.g:1256:1: entryRuleApplyFilterCommand returns [EObject current=null] : iv_ruleApplyFilterCommand= ruleApplyFilterCommand EOF ;
    public final EObject entryRuleApplyFilterCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFilterCommand = null;


        try {
            // InternalCSVs.g:1256:59: (iv_ruleApplyFilterCommand= ruleApplyFilterCommand EOF )
            // InternalCSVs.g:1257:2: iv_ruleApplyFilterCommand= ruleApplyFilterCommand EOF
            {
             newCompositeNode(grammarAccess.getApplyFilterCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplyFilterCommand=ruleApplyFilterCommand();

            state._fsp--;

             current =iv_ruleApplyFilterCommand; 
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
    // $ANTLR end "entryRuleApplyFilterCommand"


    // $ANTLR start "ruleApplyFilterCommand"
    // InternalCSVs.g:1263:1: ruleApplyFilterCommand returns [EObject current=null] : (otherlv_0= 'filter' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' ) ;
    public final EObject ruleApplyFilterCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_varName_4_0=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_expr_8_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1269:2: ( (otherlv_0= 'filter' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' ) )
            // InternalCSVs.g:1270:2: (otherlv_0= 'filter' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' )
            {
            // InternalCSVs.g:1270:2: (otherlv_0= 'filter' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' )
            // InternalCSVs.g:1271:3: otherlv_0= 'filter' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getApplyFilterCommandAccess().getFilterKeyword_0());
            		

            			newCompositeNode(grammarAccess.getApplyFilterCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getApplyFilterCommandAccess().getLeftParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getApplyFilterCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1293:3: ( (lv_varName_4_0= RULE_ID ) )
            // InternalCSVs.g:1294:4: (lv_varName_4_0= RULE_ID )
            {
            // InternalCSVs.g:1294:4: (lv_varName_4_0= RULE_ID )
            // InternalCSVs.g:1295:5: lv_varName_4_0= RULE_ID
            {
            lv_varName_4_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varName_4_0, grammarAccess.getApplyFilterCommandAccess().getVarNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplyFilterCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getApplyFilterCommandAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_29);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getApplyFilterCommandAccess().getColonKeyword_6());
            		

            			newCompositeNode(grammarAccess.getApplyFilterCommandAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1329:3: ( (lv_expr_8_0= ruleExpression ) )
            // InternalCSVs.g:1330:4: (lv_expr_8_0= ruleExpression )
            {
            // InternalCSVs.g:1330:4: (lv_expr_8_0= ruleExpression )
            // InternalCSVs.g:1331:5: lv_expr_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getApplyFilterCommandAccess().getExprExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_expr_8_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplyFilterCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_8_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getApplyFilterCommandAccess().getLCParserRuleCall_9());
            		
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getApplyFilterCommandAccess().getRightParenthesisKeyword_10());
            		

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
    // $ANTLR end "ruleApplyFilterCommand"


    // $ANTLR start "entryRuleApplyExecCommand"
    // InternalCSVs.g:1363:1: entryRuleApplyExecCommand returns [EObject current=null] : iv_ruleApplyExecCommand= ruleApplyExecCommand EOF ;
    public final EObject entryRuleApplyExecCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyExecCommand = null;


        try {
            // InternalCSVs.g:1363:57: (iv_ruleApplyExecCommand= ruleApplyExecCommand EOF )
            // InternalCSVs.g:1364:2: iv_ruleApplyExecCommand= ruleApplyExecCommand EOF
            {
             newCompositeNode(grammarAccess.getApplyExecCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplyExecCommand=ruleApplyExecCommand();

            state._fsp--;

             current =iv_ruleApplyExecCommand; 
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
    // $ANTLR end "entryRuleApplyExecCommand"


    // $ANTLR start "ruleApplyExecCommand"
    // InternalCSVs.g:1370:1: ruleApplyExecCommand returns [EObject current=null] : (otherlv_0= 'apply' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' ) ;
    public final EObject ruleApplyExecCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_varName_4_0=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_expr_8_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1376:2: ( (otherlv_0= 'apply' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' ) )
            // InternalCSVs.g:1377:2: (otherlv_0= 'apply' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' )
            {
            // InternalCSVs.g:1377:2: (otherlv_0= 'apply' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' )
            // InternalCSVs.g:1378:3: otherlv_0= 'apply' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getApplyExecCommandAccess().getApplyKeyword_0());
            		

            			newCompositeNode(grammarAccess.getApplyExecCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getApplyExecCommandAccess().getLeftParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getApplyExecCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1400:3: ( (lv_varName_4_0= RULE_ID ) )
            // InternalCSVs.g:1401:4: (lv_varName_4_0= RULE_ID )
            {
            // InternalCSVs.g:1401:4: (lv_varName_4_0= RULE_ID )
            // InternalCSVs.g:1402:5: lv_varName_4_0= RULE_ID
            {
            lv_varName_4_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varName_4_0, grammarAccess.getApplyExecCommandAccess().getVarNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplyExecCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getApplyExecCommandAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_29);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getApplyExecCommandAccess().getColonKeyword_6());
            		

            			newCompositeNode(grammarAccess.getApplyExecCommandAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1436:3: ( (lv_expr_8_0= ruleExpression ) )
            // InternalCSVs.g:1437:4: (lv_expr_8_0= ruleExpression )
            {
            // InternalCSVs.g:1437:4: (lv_expr_8_0= ruleExpression )
            // InternalCSVs.g:1438:5: lv_expr_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getApplyExecCommandAccess().getExprExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_expr_8_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplyExecCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_8_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getApplyExecCommandAccess().getLCParserRuleCall_9());
            		
            pushFollow(FOLLOW_12);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getApplyExecCommandAccess().getRightParenthesisKeyword_10());
            		

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
    // $ANTLR end "ruleApplyExecCommand"


    // $ANTLR start "entryRuleCommentCommand"
    // InternalCSVs.g:1470:1: entryRuleCommentCommand returns [String current=null] : iv_ruleCommentCommand= ruleCommentCommand EOF ;
    public final String entryRuleCommentCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentCommand = null;


        try {
            // InternalCSVs.g:1470:54: (iv_ruleCommentCommand= ruleCommentCommand EOF )
            // InternalCSVs.g:1471:2: iv_ruleCommentCommand= ruleCommentCommand EOF
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
    // InternalCSVs.g:1477:1: ruleCommentCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleCommentCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ML_COMMENT_0=null;
        Token this_SL_COMMENT_1=null;


        	enterRule();

        try {
            // InternalCSVs.g:1483:2: ( (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // InternalCSVs.g:1484:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // InternalCSVs.g:1484:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ML_COMMENT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_SL_COMMENT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCSVs.g:1485:3: this_ML_COMMENT_0= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    			current.merge(this_ML_COMMENT_0);
                    		

                    			newLeafNode(this_ML_COMMENT_0, grammarAccess.getCommentCommandAccess().getML_COMMENTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:1493:3: this_SL_COMMENT_1= RULE_SL_COMMENT
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
    // InternalCSVs.g:1504:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCSVs.g:1504:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCSVs.g:1505:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalCSVs.g:1511:1: ruleExpression returns [EObject current=null] : this_OrExpr_0= ruleOrExpr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpr_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1517:2: (this_OrExpr_0= ruleOrExpr )
            // InternalCSVs.g:1518:2: this_OrExpr_0= ruleOrExpr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExprParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;


            		current = this_OrExpr_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleSelector"
    // InternalCSVs.g:1529:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalCSVs.g:1529:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalCSVs.g:1530:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalCSVs.g:1536:1: ruleSelector returns [EObject current=null] : (this_RowSelect_0= ruleRowSelect | this_ColSelect_1= ruleColSelect | this_CellSelect_2= ruleCellSelect | this_FieldSelect_3= ruleFieldSelect | this_VariableSelect_4= ruleVariableSelect ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        EObject this_RowSelect_0 = null;

        EObject this_ColSelect_1 = null;

        EObject this_CellSelect_2 = null;

        EObject this_FieldSelect_3 = null;

        EObject this_VariableSelect_4 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1542:2: ( (this_RowSelect_0= ruleRowSelect | this_ColSelect_1= ruleColSelect | this_CellSelect_2= ruleCellSelect | this_FieldSelect_3= ruleFieldSelect | this_VariableSelect_4= ruleVariableSelect ) )
            // InternalCSVs.g:1543:2: (this_RowSelect_0= ruleRowSelect | this_ColSelect_1= ruleColSelect | this_CellSelect_2= ruleCellSelect | this_FieldSelect_3= ruleFieldSelect | this_VariableSelect_4= ruleVariableSelect )
            {
            // InternalCSVs.g:1543:2: (this_RowSelect_0= ruleRowSelect | this_ColSelect_1= ruleColSelect | this_CellSelect_2= ruleCellSelect | this_FieldSelect_3= ruleFieldSelect | this_VariableSelect_4= ruleVariableSelect )
            int alt10=5;
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
            case 33:
                {
                alt10=3;
                }
                break;
            case 35:
                {
                alt10=4;
                }
                break;
            case RULE_ID:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCSVs.g:1544:3: this_RowSelect_0= ruleRowSelect
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
                    // InternalCSVs.g:1553:3: this_ColSelect_1= ruleColSelect
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
                    // InternalCSVs.g:1562:3: this_CellSelect_2= ruleCellSelect
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
                    // InternalCSVs.g:1571:3: this_FieldSelect_3= ruleFieldSelect
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getFieldSelectParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldSelect_3=ruleFieldSelect();

                    state._fsp--;


                    			current = this_FieldSelect_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCSVs.g:1580:3: this_VariableSelect_4= ruleVariableSelect
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getVariableSelectParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableSelect_4=ruleVariableSelect();

                    state._fsp--;


                    			current = this_VariableSelect_4;
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
    // InternalCSVs.g:1592:1: entryRuleRowSelect returns [EObject current=null] : iv_ruleRowSelect= ruleRowSelect EOF ;
    public final EObject entryRuleRowSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowSelect = null;


        try {
            // InternalCSVs.g:1592:50: (iv_ruleRowSelect= ruleRowSelect EOF )
            // InternalCSVs.g:1593:2: iv_ruleRowSelect= ruleRowSelect EOF
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
    // InternalCSVs.g:1599:1: ruleRowSelect returns [EObject current=null] : (otherlv_0= 'row' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' ) ;
    public final EObject ruleRowSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1605:2: ( (otherlv_0= 'row' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' ) )
            // InternalCSVs.g:1606:2: (otherlv_0= 'row' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' )
            {
            // InternalCSVs.g:1606:2: (otherlv_0= 'row' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' )
            // InternalCSVs.g:1607:3: otherlv_0= 'row' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRowSelectAccess().getRowKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRowSelectAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1618:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:1619:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:1619:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:1620:5: lv_var_2_0= RULE_ID
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
            		
            // InternalCSVs.g:1654:3: ( (lv_expression_6_0= rulePrimaryExpr ) )
            // InternalCSVs.g:1655:4: (lv_expression_6_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:1655:4: (lv_expression_6_0= rulePrimaryExpr )
            // InternalCSVs.g:1656:5: lv_expression_6_0= rulePrimaryExpr
            {

            					newCompositeNode(grammarAccess.getRowSelectAccess().getExpressionPrimaryExprParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_6_0=rulePrimaryExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowSelectRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"com.agicquel.csvs.CSVs.PrimaryExpr");
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
    // InternalCSVs.g:1688:1: entryRuleColSelect returns [EObject current=null] : iv_ruleColSelect= ruleColSelect EOF ;
    public final EObject entryRuleColSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColSelect = null;


        try {
            // InternalCSVs.g:1688:50: (iv_ruleColSelect= ruleColSelect EOF )
            // InternalCSVs.g:1689:2: iv_ruleColSelect= ruleColSelect EOF
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
    // InternalCSVs.g:1695:1: ruleColSelect returns [EObject current=null] : (otherlv_0= 'col' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' ) ;
    public final EObject ruleColSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1701:2: ( (otherlv_0= 'col' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' ) )
            // InternalCSVs.g:1702:2: (otherlv_0= 'col' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' )
            {
            // InternalCSVs.g:1702:2: (otherlv_0= 'col' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' )
            // InternalCSVs.g:1703:3: otherlv_0= 'col' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getColSelectAccess().getColKeyword_0());
            		

            			newCompositeNode(grammarAccess.getColSelectAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1714:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:1715:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:1715:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:1716:5: lv_var_2_0= RULE_ID
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
            		
            // InternalCSVs.g:1750:3: ( (lv_expression_6_0= rulePrimaryExpr ) )
            // InternalCSVs.g:1751:4: (lv_expression_6_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:1751:4: (lv_expression_6_0= rulePrimaryExpr )
            // InternalCSVs.g:1752:5: lv_expression_6_0= rulePrimaryExpr
            {

            					newCompositeNode(grammarAccess.getColSelectAccess().getExpressionPrimaryExprParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_6_0=rulePrimaryExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColSelectRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"com.agicquel.csvs.CSVs.PrimaryExpr");
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
    // InternalCSVs.g:1784:1: entryRuleCellSelect returns [EObject current=null] : iv_ruleCellSelect= ruleCellSelect EOF ;
    public final EObject entryRuleCellSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellSelect = null;


        try {
            // InternalCSVs.g:1784:51: (iv_ruleCellSelect= ruleCellSelect EOF )
            // InternalCSVs.g:1785:2: iv_ruleCellSelect= ruleCellSelect EOF
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
    // InternalCSVs.g:1791:1: ruleCellSelect returns [EObject current=null] : (otherlv_0= 'cell' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expressionRow_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ',' ruleLC ( (lv_expressionCol_10_0= rulePrimaryExpr ) ) ruleLC otherlv_12= ')' ) ;
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
            // InternalCSVs.g:1797:2: ( (otherlv_0= 'cell' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expressionRow_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ',' ruleLC ( (lv_expressionCol_10_0= rulePrimaryExpr ) ) ruleLC otherlv_12= ')' ) )
            // InternalCSVs.g:1798:2: (otherlv_0= 'cell' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expressionRow_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ',' ruleLC ( (lv_expressionCol_10_0= rulePrimaryExpr ) ) ruleLC otherlv_12= ')' )
            {
            // InternalCSVs.g:1798:2: (otherlv_0= 'cell' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expressionRow_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ',' ruleLC ( (lv_expressionCol_10_0= rulePrimaryExpr ) ) ruleLC otherlv_12= ')' )
            // InternalCSVs.g:1799:3: otherlv_0= 'cell' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expressionRow_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ',' ruleLC ( (lv_expressionCol_10_0= rulePrimaryExpr ) ) ruleLC otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCellSelectAccess().getCellKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCellSelectAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1810:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:1811:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:1811:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:1812:5: lv_var_2_0= RULE_ID
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
            		
            // InternalCSVs.g:1846:3: ( (lv_expressionRow_6_0= rulePrimaryExpr ) )
            // InternalCSVs.g:1847:4: (lv_expressionRow_6_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:1847:4: (lv_expressionRow_6_0= rulePrimaryExpr )
            // InternalCSVs.g:1848:5: lv_expressionRow_6_0= rulePrimaryExpr
            {

            					newCompositeNode(grammarAccess.getCellSelectAccess().getExpressionRowPrimaryExprParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_30);
            lv_expressionRow_6_0=rulePrimaryExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellSelectRule());
            					}
            					set(
            						current,
            						"expressionRow",
            						lv_expressionRow_6_0,
            						"com.agicquel.csvs.CSVs.PrimaryExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getCellSelectAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_31);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getCellSelectAccess().getCommaKeyword_8());
            		

            			newCompositeNode(grammarAccess.getCellSelectAccess().getLCParserRuleCall_9());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1883:3: ( (lv_expressionCol_10_0= rulePrimaryExpr ) )
            // InternalCSVs.g:1884:4: (lv_expressionCol_10_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:1884:4: (lv_expressionCol_10_0= rulePrimaryExpr )
            // InternalCSVs.g:1885:5: lv_expressionCol_10_0= rulePrimaryExpr
            {

            					newCompositeNode(grammarAccess.getCellSelectAccess().getExpressionColPrimaryExprParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_expressionCol_10_0=rulePrimaryExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellSelectRule());
            					}
            					set(
            						current,
            						"expressionCol",
            						lv_expressionCol_10_0,
            						"com.agicquel.csvs.CSVs.PrimaryExpr");
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
    // InternalCSVs.g:1917:1: entryRuleFieldSelect returns [EObject current=null] : iv_ruleFieldSelect= ruleFieldSelect EOF ;
    public final EObject entryRuleFieldSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelect = null;


        try {
            // InternalCSVs.g:1917:52: (iv_ruleFieldSelect= ruleFieldSelect EOF )
            // InternalCSVs.g:1918:2: iv_ruleFieldSelect= ruleFieldSelect EOF
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
    // InternalCSVs.g:1924:1: ruleFieldSelect returns [EObject current=null] : (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' ) ;
    public final EObject ruleFieldSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1930:2: ( (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' ) )
            // InternalCSVs.g:1931:2: (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' )
            {
            // InternalCSVs.g:1931:2: (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' )
            // InternalCSVs.g:1932:3: otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldSelectAccess().getFieldKeyword_0());
            		

            			newCompositeNode(grammarAccess.getFieldSelectAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1943:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:1944:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:1944:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:1945:5: lv_var_2_0= RULE_ID
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
            		
            // InternalCSVs.g:1979:3: ( (lv_expression_6_0= rulePrimaryExpr ) )
            // InternalCSVs.g:1980:4: (lv_expression_6_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:1980:4: (lv_expression_6_0= rulePrimaryExpr )
            // InternalCSVs.g:1981:5: lv_expression_6_0= rulePrimaryExpr
            {

            					newCompositeNode(grammarAccess.getFieldSelectAccess().getExpressionPrimaryExprParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_6_0=rulePrimaryExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldSelectRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"com.agicquel.csvs.CSVs.PrimaryExpr");
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


    // $ANTLR start "entryRuleVariableSelect"
    // InternalCSVs.g:2013:1: entryRuleVariableSelect returns [EObject current=null] : iv_ruleVariableSelect= ruleVariableSelect EOF ;
    public final EObject entryRuleVariableSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableSelect = null;


        try {
            // InternalCSVs.g:2013:55: (iv_ruleVariableSelect= ruleVariableSelect EOF )
            // InternalCSVs.g:2014:2: iv_ruleVariableSelect= ruleVariableSelect EOF
            {
             newCompositeNode(grammarAccess.getVariableSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableSelect=ruleVariableSelect();

            state._fsp--;

             current =iv_ruleVariableSelect; 
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
    // $ANTLR end "entryRuleVariableSelect"


    // $ANTLR start "ruleVariableSelect"
    // InternalCSVs.g:2020:1: ruleVariableSelect returns [EObject current=null] : ( (lv_term_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableSelect() throws RecognitionException {
        EObject current = null;

        Token lv_term_0_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:2026:2: ( ( (lv_term_0_0= RULE_ID ) ) )
            // InternalCSVs.g:2027:2: ( (lv_term_0_0= RULE_ID ) )
            {
            // InternalCSVs.g:2027:2: ( (lv_term_0_0= RULE_ID ) )
            // InternalCSVs.g:2028:3: (lv_term_0_0= RULE_ID )
            {
            // InternalCSVs.g:2028:3: (lv_term_0_0= RULE_ID )
            // InternalCSVs.g:2029:4: lv_term_0_0= RULE_ID
            {
            lv_term_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_term_0_0, grammarAccess.getVariableSelectAccess().getTermIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableSelectRule());
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
    // $ANTLR end "ruleVariableSelect"


    // $ANTLR start "entryRuleCountExpr"
    // InternalCSVs.g:2048:1: entryRuleCountExpr returns [EObject current=null] : iv_ruleCountExpr= ruleCountExpr EOF ;
    public final EObject entryRuleCountExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountExpr = null;


        try {
            // InternalCSVs.g:2048:50: (iv_ruleCountExpr= ruleCountExpr EOF )
            // InternalCSVs.g:2049:2: iv_ruleCountExpr= ruleCountExpr EOF
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
    // InternalCSVs.g:2055:1: ruleCountExpr returns [EObject current=null] : (otherlv_0= 'count' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' ) ;
    public final EObject ruleCountExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2061:2: ( (otherlv_0= 'count' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' ) )
            // InternalCSVs.g:2062:2: (otherlv_0= 'count' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' )
            {
            // InternalCSVs.g:2062:2: (otherlv_0= 'count' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')' )
            // InternalCSVs.g:2063:3: otherlv_0= 'count' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '(' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCountExprAccess().getCountKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCountExprAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2074:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:2075:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:2075:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:2076:5: lv_var_2_0= RULE_ID
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
            		
            // InternalCSVs.g:2110:3: ( (lv_expression_6_0= rulePrimaryExpr ) )
            // InternalCSVs.g:2111:4: (lv_expression_6_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:2111:4: (lv_expression_6_0= rulePrimaryExpr )
            // InternalCSVs.g:2112:5: lv_expression_6_0= rulePrimaryExpr
            {

            					newCompositeNode(grammarAccess.getCountExprAccess().getExpressionPrimaryExprParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_6_0=rulePrimaryExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountExprRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"com.agicquel.csvs.CSVs.PrimaryExpr");
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


    // $ANTLR start "entryRuleOrExpr"
    // InternalCSVs.g:2144:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalCSVs.g:2144:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalCSVs.g:2145:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalCSVs.g:2151:1: ruleOrExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleAddExpr ) ) ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2157:2: ( ( ( (lv_left_0_0= ruleAddExpr ) ) ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )* ) )
            // InternalCSVs.g:2158:2: ( ( (lv_left_0_0= ruleAddExpr ) ) ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )* )
            {
            // InternalCSVs.g:2158:2: ( ( (lv_left_0_0= ruleAddExpr ) ) ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )* )
            // InternalCSVs.g:2159:3: ( (lv_left_0_0= ruleAddExpr ) ) ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )*
            {
            // InternalCSVs.g:2159:3: ( (lv_left_0_0= ruleAddExpr ) )
            // InternalCSVs.g:2160:4: (lv_left_0_0= ruleAddExpr )
            {
            // InternalCSVs.g:2160:4: (lv_left_0_0= ruleAddExpr )
            // InternalCSVs.g:2161:5: lv_left_0_0= ruleAddExpr
            {

            					newCompositeNode(grammarAccess.getOrExprAccess().getLeftAddExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_left_0_0=ruleAddExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrExprRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"com.agicquel.csvs.CSVs.AddExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCSVs.g:2178:3: ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WS) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==37) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCSVs.g:2179:4: ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) )
            	    {

            	    				newCompositeNode(grammarAccess.getOrExprAccess().getLCParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_33);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_2=(Token)match(input,37,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			

            	    				newCompositeNode(grammarAccess.getOrExprAccess().getLCParserRuleCall_1_2());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2197:4: ( (lv_right_4_0= ruleAddExpr ) )
            	    // InternalCSVs.g:2198:5: (lv_right_4_0= ruleAddExpr )
            	    {
            	    // InternalCSVs.g:2198:5: (lv_right_4_0= ruleAddExpr )
            	    // InternalCSVs.g:2199:6: lv_right_4_0= ruleAddExpr
            	    {

            	    						newCompositeNode(grammarAccess.getOrExprAccess().getRightAddExprParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_4_0=ruleAddExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"com.agicquel.csvs.CSVs.AddExpr");
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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAddExpr"
    // InternalCSVs.g:2221:1: entryRuleAddExpr returns [EObject current=null] : iv_ruleAddExpr= ruleAddExpr EOF ;
    public final EObject entryRuleAddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpr = null;


        try {
            // InternalCSVs.g:2221:48: (iv_ruleAddExpr= ruleAddExpr EOF )
            // InternalCSVs.g:2222:2: iv_ruleAddExpr= ruleAddExpr EOF
            {
             newCompositeNode(grammarAccess.getAddExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExpr=ruleAddExpr();

            state._fsp--;

             current =iv_ruleAddExpr; 
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
    // $ANTLR end "entryRuleAddExpr"


    // $ANTLR start "ruleAddExpr"
    // InternalCSVs.g:2228:1: ruleAddExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleEqualityExpr ) ) ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )* ) ;
    public final EObject ruleAddExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2234:2: ( ( ( (lv_left_0_0= ruleEqualityExpr ) ) ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )* ) )
            // InternalCSVs.g:2235:2: ( ( (lv_left_0_0= ruleEqualityExpr ) ) ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )* )
            {
            // InternalCSVs.g:2235:2: ( ( (lv_left_0_0= ruleEqualityExpr ) ) ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )* )
            // InternalCSVs.g:2236:3: ( (lv_left_0_0= ruleEqualityExpr ) ) ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )*
            {
            // InternalCSVs.g:2236:3: ( (lv_left_0_0= ruleEqualityExpr ) )
            // InternalCSVs.g:2237:4: (lv_left_0_0= ruleEqualityExpr )
            {
            // InternalCSVs.g:2237:4: (lv_left_0_0= ruleEqualityExpr )
            // InternalCSVs.g:2238:5: lv_left_0_0= ruleEqualityExpr
            {

            					newCompositeNode(grammarAccess.getAddExprAccess().getLeftEqualityExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_left_0_0=ruleEqualityExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddExprRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"com.agicquel.csvs.CSVs.EqualityExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCSVs.g:2255:3: ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WS) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==38) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCSVs.g:2256:4: ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) )
            	    {

            	    				newCompositeNode(grammarAccess.getAddExprAccess().getLCParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_35);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_2=(Token)match(input,38,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAddExprAccess().getAmpersandAmpersandKeyword_1_1());
            	    			

            	    				newCompositeNode(grammarAccess.getAddExprAccess().getLCParserRuleCall_1_2());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2274:4: ( (lv_right_4_0= ruleEqualityExpr ) )
            	    // InternalCSVs.g:2275:5: (lv_right_4_0= ruleEqualityExpr )
            	    {
            	    // InternalCSVs.g:2275:5: (lv_right_4_0= ruleEqualityExpr )
            	    // InternalCSVs.g:2276:6: lv_right_4_0= ruleEqualityExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAddExprAccess().getRightEqualityExprParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_4_0=ruleEqualityExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"com.agicquel.csvs.CSVs.EqualityExpr");
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
    // $ANTLR end "ruleAddExpr"


    // $ANTLR start "entryRuleEqualityExpr"
    // InternalCSVs.g:2298:1: entryRuleEqualityExpr returns [EObject current=null] : iv_ruleEqualityExpr= ruleEqualityExpr EOF ;
    public final EObject entryRuleEqualityExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpr = null;


        try {
            // InternalCSVs.g:2298:53: (iv_ruleEqualityExpr= ruleEqualityExpr EOF )
            // InternalCSVs.g:2299:2: iv_ruleEqualityExpr= ruleEqualityExpr EOF
            {
             newCompositeNode(grammarAccess.getEqualityExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpr=ruleEqualityExpr();

            state._fsp--;

             current =iv_ruleEqualityExpr; 
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
    // $ANTLR end "entryRuleEqualityExpr"


    // $ANTLR start "ruleEqualityExpr"
    // InternalCSVs.g:2305:1: ruleEqualityExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleComparaisonExpr ) ) ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )? ) ;
    public final EObject ruleEqualityExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2311:2: ( ( ( (lv_left_0_0= ruleComparaisonExpr ) ) ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )? ) )
            // InternalCSVs.g:2312:2: ( ( (lv_left_0_0= ruleComparaisonExpr ) ) ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )? )
            {
            // InternalCSVs.g:2312:2: ( ( (lv_left_0_0= ruleComparaisonExpr ) ) ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )? )
            // InternalCSVs.g:2313:3: ( (lv_left_0_0= ruleComparaisonExpr ) ) ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )?
            {
            // InternalCSVs.g:2313:3: ( (lv_left_0_0= ruleComparaisonExpr ) )
            // InternalCSVs.g:2314:4: (lv_left_0_0= ruleComparaisonExpr )
            {
            // InternalCSVs.g:2314:4: (lv_left_0_0= ruleComparaisonExpr )
            // InternalCSVs.g:2315:5: lv_left_0_0= ruleComparaisonExpr
            {

            					newCompositeNode(grammarAccess.getEqualityExprAccess().getLeftComparaisonExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_left_0_0=ruleComparaisonExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualityExprRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"com.agicquel.csvs.CSVs.ComparaisonExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCSVs.g:2332:3: ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_WS) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=39 && LA14_1<=40)) ) {
                    alt14=1;
                }
            }
            else if ( ((LA14_0>=39 && LA14_0<=40)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCSVs.g:2333:4: ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) )
                    {

                    				newCompositeNode(grammarAccess.getEqualityExprAccess().getLCParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_37);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:2340:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
                    // InternalCSVs.g:2341:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
                    {
                    // InternalCSVs.g:2341:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
                    // InternalCSVs.g:2342:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
                    {
                    // InternalCSVs.g:2342:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==39) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==40) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalCSVs.g:2343:7: lv_op_2_1= '=='
                            {
                            lv_op_2_1=(Token)match(input,39,FOLLOW_10); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityExprAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEqualityExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCSVs.g:2354:7: lv_op_2_2= '!='
                            {
                            lv_op_2_2=(Token)match(input,40,FOLLOW_10); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityExprAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEqualityExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    				newCompositeNode(grammarAccess.getEqualityExprAccess().getLCParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_10);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:2374:4: ( (lv_right_4_0= ruleComparaisonExpr ) )
                    // InternalCSVs.g:2375:5: (lv_right_4_0= ruleComparaisonExpr )
                    {
                    // InternalCSVs.g:2375:5: (lv_right_4_0= ruleComparaisonExpr )
                    // InternalCSVs.g:2376:6: lv_right_4_0= ruleComparaisonExpr
                    {

                    						newCompositeNode(grammarAccess.getEqualityExprAccess().getRightComparaisonExprParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_4_0=ruleComparaisonExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualityExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_4_0,
                    							"com.agicquel.csvs.CSVs.ComparaisonExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleEqualityExpr"


    // $ANTLR start "entryRuleComparaisonExpr"
    // InternalCSVs.g:2398:1: entryRuleComparaisonExpr returns [EObject current=null] : iv_ruleComparaisonExpr= ruleComparaisonExpr EOF ;
    public final EObject entryRuleComparaisonExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaisonExpr = null;


        try {
            // InternalCSVs.g:2398:56: (iv_ruleComparaisonExpr= ruleComparaisonExpr EOF )
            // InternalCSVs.g:2399:2: iv_ruleComparaisonExpr= ruleComparaisonExpr EOF
            {
             newCompositeNode(grammarAccess.getComparaisonExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparaisonExpr=ruleComparaisonExpr();

            state._fsp--;

             current =iv_ruleComparaisonExpr; 
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
    // $ANTLR end "entryRuleComparaisonExpr"


    // $ANTLR start "ruleComparaisonExpr"
    // InternalCSVs.g:2405:1: ruleComparaisonExpr returns [EObject current=null] : ( ( (lv_left_0_0= rulePlusOrMinusExpr ) ) ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )? ) ;
    public final EObject ruleComparaisonExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2411:2: ( ( ( (lv_left_0_0= rulePlusOrMinusExpr ) ) ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )? ) )
            // InternalCSVs.g:2412:2: ( ( (lv_left_0_0= rulePlusOrMinusExpr ) ) ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )? )
            {
            // InternalCSVs.g:2412:2: ( ( (lv_left_0_0= rulePlusOrMinusExpr ) ) ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )? )
            // InternalCSVs.g:2413:3: ( (lv_left_0_0= rulePlusOrMinusExpr ) ) ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )?
            {
            // InternalCSVs.g:2413:3: ( (lv_left_0_0= rulePlusOrMinusExpr ) )
            // InternalCSVs.g:2414:4: (lv_left_0_0= rulePlusOrMinusExpr )
            {
            // InternalCSVs.g:2414:4: (lv_left_0_0= rulePlusOrMinusExpr )
            // InternalCSVs.g:2415:5: lv_left_0_0= rulePlusOrMinusExpr
            {

            					newCompositeNode(grammarAccess.getComparaisonExprAccess().getLeftPlusOrMinusExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_left_0_0=rulePlusOrMinusExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparaisonExprRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"com.agicquel.csvs.CSVs.PlusOrMinusExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCSVs.g:2432:3: ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_WS) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=41 && LA16_1<=44)) ) {
                    alt16=1;
                }
            }
            else if ( ((LA16_0>=41 && LA16_0<=44)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCSVs.g:2433:4: ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) )
                    {

                    				newCompositeNode(grammarAccess.getComparaisonExprAccess().getLCParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_39);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:2440:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
                    // InternalCSVs.g:2441:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
                    {
                    // InternalCSVs.g:2441:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
                    // InternalCSVs.g:2442:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
                    {
                    // InternalCSVs.g:2442:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
                    int alt15=4;
                    switch ( input.LA(1) ) {
                    case 41:
                        {
                        alt15=1;
                        }
                        break;
                    case 42:
                        {
                        alt15=2;
                        }
                        break;
                    case 43:
                        {
                        alt15=3;
                        }
                        break;
                    case 44:
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
                            // InternalCSVs.g:2443:7: lv_op_2_1= '>='
                            {
                            lv_op_2_1=(Token)match(input,41,FOLLOW_10); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getComparaisonExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparaisonExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCSVs.g:2454:7: lv_op_2_2= '<='
                            {
                            lv_op_2_2=(Token)match(input,42,FOLLOW_10); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getComparaisonExprAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparaisonExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalCSVs.g:2465:7: lv_op_2_3= '>'
                            {
                            lv_op_2_3=(Token)match(input,43,FOLLOW_10); 

                            							newLeafNode(lv_op_2_3, grammarAccess.getComparaisonExprAccess().getOpGreaterThanSignKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparaisonExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalCSVs.g:2476:7: lv_op_2_4= '<'
                            {
                            lv_op_2_4=(Token)match(input,44,FOLLOW_10); 

                            							newLeafNode(lv_op_2_4, grammarAccess.getComparaisonExprAccess().getOpLessThanSignKeyword_1_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparaisonExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    				newCompositeNode(grammarAccess.getComparaisonExprAccess().getLCParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_10);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:2496:4: ( (lv_right_4_0= rulePlusOrMinusExpr ) )
                    // InternalCSVs.g:2497:5: (lv_right_4_0= rulePlusOrMinusExpr )
                    {
                    // InternalCSVs.g:2497:5: (lv_right_4_0= rulePlusOrMinusExpr )
                    // InternalCSVs.g:2498:6: lv_right_4_0= rulePlusOrMinusExpr
                    {

                    						newCompositeNode(grammarAccess.getComparaisonExprAccess().getRightPlusOrMinusExprParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_4_0=rulePlusOrMinusExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparaisonExprRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_4_0,
                    							"com.agicquel.csvs.CSVs.PlusOrMinusExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleComparaisonExpr"


    // $ANTLR start "entryRulePlusOrMinusExpr"
    // InternalCSVs.g:2520:1: entryRulePlusOrMinusExpr returns [EObject current=null] : iv_rulePlusOrMinusExpr= rulePlusOrMinusExpr EOF ;
    public final EObject entryRulePlusOrMinusExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinusExpr = null;


        try {
            // InternalCSVs.g:2520:56: (iv_rulePlusOrMinusExpr= rulePlusOrMinusExpr EOF )
            // InternalCSVs.g:2521:2: iv_rulePlusOrMinusExpr= rulePlusOrMinusExpr EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinusExpr=rulePlusOrMinusExpr();

            state._fsp--;

             current =iv_rulePlusOrMinusExpr; 
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
    // $ANTLR end "entryRulePlusOrMinusExpr"


    // $ANTLR start "rulePlusOrMinusExpr"
    // InternalCSVs.g:2527:1: rulePlusOrMinusExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleMulOrDivExpr ) ) ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )* ) ;
    public final EObject rulePlusOrMinusExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2533:2: ( ( ( (lv_left_0_0= ruleMulOrDivExpr ) ) ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )* ) )
            // InternalCSVs.g:2534:2: ( ( (lv_left_0_0= ruleMulOrDivExpr ) ) ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )* )
            {
            // InternalCSVs.g:2534:2: ( ( (lv_left_0_0= ruleMulOrDivExpr ) ) ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )* )
            // InternalCSVs.g:2535:3: ( (lv_left_0_0= ruleMulOrDivExpr ) ) ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )*
            {
            // InternalCSVs.g:2535:3: ( (lv_left_0_0= ruleMulOrDivExpr ) )
            // InternalCSVs.g:2536:4: (lv_left_0_0= ruleMulOrDivExpr )
            {
            // InternalCSVs.g:2536:4: (lv_left_0_0= ruleMulOrDivExpr )
            // InternalCSVs.g:2537:5: lv_left_0_0= ruleMulOrDivExpr
            {

            					newCompositeNode(grammarAccess.getPlusOrMinusExprAccess().getLeftMulOrDivExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_left_0_0=ruleMulOrDivExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlusOrMinusExprRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"com.agicquel.csvs.CSVs.MulOrDivExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCSVs.g:2554:3: ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    int LA18_1 = input.LA(2);

                    if ( ((LA18_1>=45 && LA18_1<=46)) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>=45 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCSVs.g:2555:4: ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) )
            	    {

            	    				newCompositeNode(grammarAccess.getPlusOrMinusExprAccess().getLCParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_41);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2562:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalCSVs.g:2563:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalCSVs.g:2563:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalCSVs.g:2564:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalCSVs.g:2564:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==45) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==46) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalCSVs.g:2565:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,45,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getPlusOrMinusExprAccess().getOpPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPlusOrMinusExprRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVs.g:2576:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,46,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getPlusOrMinusExprAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPlusOrMinusExprRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getPlusOrMinusExprAccess().getLCParserRuleCall_1_2());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2596:4: ( (lv_right_4_0= ruleMulOrDivExpr ) )
            	    // InternalCSVs.g:2597:5: (lv_right_4_0= ruleMulOrDivExpr )
            	    {
            	    // InternalCSVs.g:2597:5: (lv_right_4_0= ruleMulOrDivExpr )
            	    // InternalCSVs.g:2598:6: lv_right_4_0= ruleMulOrDivExpr
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusExprAccess().getRightMulOrDivExprParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_4_0=ruleMulOrDivExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"com.agicquel.csvs.CSVs.MulOrDivExpr");
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
    // $ANTLR end "rulePlusOrMinusExpr"


    // $ANTLR start "entryRuleMulOrDivExpr"
    // InternalCSVs.g:2620:1: entryRuleMulOrDivExpr returns [EObject current=null] : iv_ruleMulOrDivExpr= ruleMulOrDivExpr EOF ;
    public final EObject entryRuleMulOrDivExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDivExpr = null;


        try {
            // InternalCSVs.g:2620:53: (iv_ruleMulOrDivExpr= ruleMulOrDivExpr EOF )
            // InternalCSVs.g:2621:2: iv_ruleMulOrDivExpr= ruleMulOrDivExpr EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDivExpr=ruleMulOrDivExpr();

            state._fsp--;

             current =iv_ruleMulOrDivExpr; 
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
    // $ANTLR end "entryRuleMulOrDivExpr"


    // $ANTLR start "ruleMulOrDivExpr"
    // InternalCSVs.g:2627:1: ruleMulOrDivExpr returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimaryExpr ) ) ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )* ) ;
    public final EObject ruleMulOrDivExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2633:2: ( ( ( (lv_left_0_0= rulePrimaryExpr ) ) ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )* ) )
            // InternalCSVs.g:2634:2: ( ( (lv_left_0_0= rulePrimaryExpr ) ) ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )* )
            {
            // InternalCSVs.g:2634:2: ( ( (lv_left_0_0= rulePrimaryExpr ) ) ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )* )
            // InternalCSVs.g:2635:3: ( (lv_left_0_0= rulePrimaryExpr ) ) ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )*
            {
            // InternalCSVs.g:2635:3: ( (lv_left_0_0= rulePrimaryExpr ) )
            // InternalCSVs.g:2636:4: (lv_left_0_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:2636:4: (lv_left_0_0= rulePrimaryExpr )
            // InternalCSVs.g:2637:5: lv_left_0_0= rulePrimaryExpr
            {

            					newCompositeNode(grammarAccess.getMulOrDivExprAccess().getLeftPrimaryExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_left_0_0=rulePrimaryExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMulOrDivExprRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"com.agicquel.csvs.CSVs.PrimaryExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCSVs.g:2654:3: ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    int LA20_1 = input.LA(2);

                    if ( ((LA20_1>=47 && LA20_1<=49)) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>=47 && LA20_0<=49)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCSVs.g:2655:4: ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) )
            	    {

            	    				newCompositeNode(grammarAccess.getMulOrDivExprAccess().getLCParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_43);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2662:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // InternalCSVs.g:2663:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // InternalCSVs.g:2663:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // InternalCSVs.g:2664:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // InternalCSVs.g:2664:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalCSVs.g:2665:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,47,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivExprAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivExprRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVs.g:2676:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,48,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivExprAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivExprRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalCSVs.g:2687:7: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,49,FOLLOW_10); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivExprAccess().getOpPercentSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivExprRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getMulOrDivExprAccess().getLCParserRuleCall_1_2());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2707:4: ( (lv_right_4_0= rulePrimaryExpr ) )
            	    // InternalCSVs.g:2708:5: (lv_right_4_0= rulePrimaryExpr )
            	    {
            	    // InternalCSVs.g:2708:5: (lv_right_4_0= rulePrimaryExpr )
            	    // InternalCSVs.g:2709:6: lv_right_4_0= rulePrimaryExpr
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivExprAccess().getRightPrimaryExprParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_right_4_0=rulePrimaryExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"com.agicquel.csvs.CSVs.PrimaryExpr");
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
    // $ANTLR end "ruleMulOrDivExpr"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalCSVs.g:2731:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalCSVs.g:2731:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalCSVs.g:2732:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;

             current =iv_rulePrimaryExpr; 
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
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalCSVs.g:2738:1: rulePrimaryExpr returns [EObject current=null] : ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | this_NotExpr_5= ruleNotExpr | this_AtomicExpr_6= ruleAtomicExpr | this_Selector_7= ruleSelector | this_CountExpr_8= ruleCountExpr ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_Expression_2 = null;

        EObject this_NotExpr_5 = null;

        EObject this_AtomicExpr_6 = null;

        EObject this_Selector_7 = null;

        EObject this_CountExpr_8 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2744:2: ( ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | this_NotExpr_5= ruleNotExpr | this_AtomicExpr_6= ruleAtomicExpr | this_Selector_7= ruleSelector | this_CountExpr_8= ruleCountExpr ) )
            // InternalCSVs.g:2745:2: ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | this_NotExpr_5= ruleNotExpr | this_AtomicExpr_6= ruleAtomicExpr | this_Selector_7= ruleSelector | this_CountExpr_8= ruleCountExpr )
            {
            // InternalCSVs.g:2745:2: ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | this_NotExpr_5= ruleNotExpr | this_AtomicExpr_6= ruleAtomicExpr | this_Selector_7= ruleSelector | this_CountExpr_8= ruleCountExpr )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt21=1;
                }
                break;
            case 50:
                {
                alt21=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 51:
            case 52:
                {
                alt21=3;
                }
                break;
            case RULE_ID:
            case 27:
            case 28:
            case 33:
            case 35:
                {
                alt21=4;
                }
                break;
            case 36:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalCSVs.g:2746:3: (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' )
                    {
                    // InternalCSVs.g:2746:3: (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' )
                    // InternalCSVs.g:2747:4: otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExprAccess().getLCParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExprAccess().getExpressionParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_11);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExprAccess().getLCParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_12);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVs.g:2779:3: this_NotExpr_5= ruleNotExpr
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExprAccess().getNotExprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotExpr_5=ruleNotExpr();

                    state._fsp--;


                    			current = this_NotExpr_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCSVs.g:2788:3: this_AtomicExpr_6= ruleAtomicExpr
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExprAccess().getAtomicExprParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicExpr_6=ruleAtomicExpr();

                    state._fsp--;


                    			current = this_AtomicExpr_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCSVs.g:2797:3: this_Selector_7= ruleSelector
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExprAccess().getSelectorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selector_7=ruleSelector();

                    state._fsp--;


                    			current = this_Selector_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCSVs.g:2806:3: this_CountExpr_8= ruleCountExpr
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExprAccess().getCountExprParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountExpr_8=ruleCountExpr();

                    state._fsp--;


                    			current = this_CountExpr_8;
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
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleNotExpr"
    // InternalCSVs.g:2818:1: entryRuleNotExpr returns [EObject current=null] : iv_ruleNotExpr= ruleNotExpr EOF ;
    public final EObject entryRuleNotExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpr = null;


        try {
            // InternalCSVs.g:2818:48: (iv_ruleNotExpr= ruleNotExpr EOF )
            // InternalCSVs.g:2819:2: iv_ruleNotExpr= ruleNotExpr EOF
            {
             newCompositeNode(grammarAccess.getNotExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotExpr=ruleNotExpr();

            state._fsp--;

             current =iv_ruleNotExpr; 
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
    // $ANTLR end "entryRuleNotExpr"


    // $ANTLR start "ruleNotExpr"
    // InternalCSVs.g:2825:1: ruleNotExpr returns [EObject current=null] : (otherlv_0= '!' ruleLC ( (lv_expr_2_0= rulePrimaryExpr ) ) ) ;
    public final EObject ruleNotExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2831:2: ( (otherlv_0= '!' ruleLC ( (lv_expr_2_0= rulePrimaryExpr ) ) ) )
            // InternalCSVs.g:2832:2: (otherlv_0= '!' ruleLC ( (lv_expr_2_0= rulePrimaryExpr ) ) )
            {
            // InternalCSVs.g:2832:2: (otherlv_0= '!' ruleLC ( (lv_expr_2_0= rulePrimaryExpr ) ) )
            // InternalCSVs.g:2833:3: otherlv_0= '!' ruleLC ( (lv_expr_2_0= rulePrimaryExpr ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNotExprAccess().getExclamationMarkKeyword_0());
            		

            			newCompositeNode(grammarAccess.getNotExprAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2844:3: ( (lv_expr_2_0= rulePrimaryExpr ) )
            // InternalCSVs.g:2845:4: (lv_expr_2_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:2845:4: (lv_expr_2_0= rulePrimaryExpr )
            // InternalCSVs.g:2846:5: lv_expr_2_0= rulePrimaryExpr
            {

            					newCompositeNode(grammarAccess.getNotExprAccess().getExprPrimaryExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=rulePrimaryExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotExprRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"com.agicquel.csvs.CSVs.PrimaryExpr");
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
    // $ANTLR end "ruleNotExpr"


    // $ANTLR start "entryRuleAtomicExpr"
    // InternalCSVs.g:2867:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // InternalCSVs.g:2867:51: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // InternalCSVs.g:2868:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
            {
             newCompositeNode(grammarAccess.getAtomicExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpr=ruleAtomicExpr();

            state._fsp--;

             current =iv_ruleAtomicExpr; 
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
    // $ANTLR end "entryRuleAtomicExpr"


    // $ANTLR start "ruleAtomicExpr"
    // InternalCSVs.g:2874:1: ruleAtomicExpr returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;


        	enterRule();

        try {
            // InternalCSVs.g:2880:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) ) )
            // InternalCSVs.g:2881:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) )
            {
            // InternalCSVs.g:2881:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) )
            int alt23=3;
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
            case 51:
            case 52:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalCSVs.g:2882:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalCSVs.g:2882:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalCSVs.g:2883:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalCSVs.g:2883:4: ()
                    // InternalCSVs.g:2884:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExprAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:2890:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalCSVs.g:2891:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalCSVs.g:2891:5: (lv_value_1_0= RULE_INT )
                    // InternalCSVs.g:2892:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicExprAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExprRule());
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
                    // InternalCSVs.g:2910:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCSVs.g:2910:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCSVs.g:2911:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCSVs.g:2911:4: ()
                    // InternalCSVs.g:2912:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExprAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:2918:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCSVs.g:2919:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCSVs.g:2919:5: (lv_value_3_0= RULE_STRING )
                    // InternalCSVs.g:2920:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicExprAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExprRule());
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
                    // InternalCSVs.g:2938:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalCSVs.g:2938:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalCSVs.g:2939:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalCSVs.g:2939:4: ()
                    // InternalCSVs.g:2940:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExprAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:2946:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalCSVs.g:2947:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalCSVs.g:2947:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalCSVs.g:2948:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalCSVs.g:2948:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==51) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==52) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalCSVs.g:2949:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,51,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicExprAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicExprRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCSVs.g:2960:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,52,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getAtomicExprAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicExprRule());
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
    // $ANTLR end "ruleAtomicExpr"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000A3F7A41B0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x001C001A18008270L});
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000A18000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000A18000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000140000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000012L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000018000000012L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00001E0000000012L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000600000000012L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0003800000000012L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0003800000000000L});

}