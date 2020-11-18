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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_INT", "RULE_DOUBLE", "RULE_ANY_OTHER", "';'", "'{'", "'}'", "'while'", "'if'", "'else'", "'load'", "'store'", "'export_json'", "'create'", "'='", "'print'", "'delete'", "'add'", "'row'", "'col'", "'rename'", "':'", "'on'", "'filter'", "'('", "')'", "'apply'", "'merge'", "'with'", "'concat'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'['", "']'", "'field'", "'count'", "'last'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int RULE_DOUBLE=10;
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
    public static final int RULE_ANY_OTHER=11;
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
    // InternalCSVs.g:71:1: ruleModel returns [EObject current=null] : ( () ruleLC ( (lv_commands_2_0= ruleCommand ) )* ruleLC ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:77:2: ( ( () ruleLC ( (lv_commands_2_0= ruleCommand ) )* ruleLC ) )
            // InternalCSVs.g:78:2: ( () ruleLC ( (lv_commands_2_0= ruleCommand ) )* ruleLC )
            {
            // InternalCSVs.g:78:2: ( () ruleLC ( (lv_commands_2_0= ruleCommand ) )* ruleLC )
            // InternalCSVs.g:79:3: () ruleLC ( (lv_commands_2_0= ruleCommand ) )* ruleLC
            {
            // InternalCSVs.g:79:3: ()
            // InternalCSVs.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getModelAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:93:3: ( (lv_commands_2_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_DOUBLE)||(LA1_0>=15 && LA1_0<=16)||(LA1_0>=18 && LA1_0<=21)||(LA1_0>=23 && LA1_0<=25)||LA1_0==28||LA1_0==30||LA1_0==35||LA1_0==37||(LA1_0>=54 && LA1_0<=58)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCSVs.g:94:4: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalCSVs.g:94:4: (lv_commands_2_0= ruleCommand )
            	    // InternalCSVs.g:95:5: lv_commands_2_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_2_0,
            	    						"com.agicquel.csvs.CSVs.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            			newCompositeNode(grammarAccess.getModelAccess().getLCParserRuleCall_3());
            		
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
    // InternalCSVs.g:123:1: entryRuleLC returns [String current=null] : iv_ruleLC= ruleLC EOF ;
    public final String entryRuleLC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLC = null;


        try {
            // InternalCSVs.g:123:42: (iv_ruleLC= ruleLC EOF )
            // InternalCSVs.g:124:2: iv_ruleLC= ruleLC EOF
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
    // InternalCSVs.g:130:1: ruleLC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WS_0= RULE_WS )? ;
    public final AntlrDatatypeRuleToken ruleLC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WS_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:136:2: ( (this_WS_0= RULE_WS )? )
            // InternalCSVs.g:137:2: (this_WS_0= RULE_WS )?
            {
            // InternalCSVs.g:137:2: (this_WS_0= RULE_WS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_WS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCSVs.g:138:3: this_WS_0= RULE_WS
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
    // InternalCSVs.g:149:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalCSVs.g:149:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalCSVs.g:150:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalCSVs.g:156:1: ruleCommand returns [EObject current=null] : ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | ( () ruleCommentCommand ) | this_ControlCommand_5= ruleControlCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CsvCommand_0 = null;

        EObject this_ControlCommand_5 = null;



        	enterRule();

        try {
            // InternalCSVs.g:162:2: ( ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | ( () ruleCommentCommand ) | this_ControlCommand_5= ruleControlCommand ) )
            // InternalCSVs.g:163:2: ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | ( () ruleCommentCommand ) | this_ControlCommand_5= ruleControlCommand )
            {
            // InternalCSVs.g:163:2: ( (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' ) | ( () ruleCommentCommand ) | this_ControlCommand_5= ruleControlCommand )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 28:
            case 30:
            case 35:
            case 37:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
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
            case 15:
            case 16:
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
                    // InternalCSVs.g:164:3: (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' )
                    {
                    // InternalCSVs.g:164:3: (this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';' )
                    // InternalCSVs.g:165:4: this_CsvCommand_0= ruleCsvCommand ruleLC otherlv_2= ';'
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
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getSemicolonKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVs.g:186:3: ( () ruleCommentCommand )
                    {
                    // InternalCSVs.g:186:3: ( () ruleCommentCommand )
                    // InternalCSVs.g:187:4: () ruleCommentCommand
                    {
                    // InternalCSVs.g:187:4: ()
                    // InternalCSVs.g:188:5: 
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
                    // InternalCSVs.g:203:3: this_ControlCommand_5= ruleControlCommand
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
    // InternalCSVs.g:215:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalCSVs.g:215:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalCSVs.g:216:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalCSVs.g:222:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ruleLC ( (lv_commands_3_0= ruleCommand ) )* ruleLC otherlv_5= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:228:2: ( ( () otherlv_1= '{' ruleLC ( (lv_commands_3_0= ruleCommand ) )* ruleLC otherlv_5= '}' ) )
            // InternalCSVs.g:229:2: ( () otherlv_1= '{' ruleLC ( (lv_commands_3_0= ruleCommand ) )* ruleLC otherlv_5= '}' )
            {
            // InternalCSVs.g:229:2: ( () otherlv_1= '{' ruleLC ( (lv_commands_3_0= ruleCommand ) )* ruleLC otherlv_5= '}' )
            // InternalCSVs.g:230:3: () otherlv_1= '{' ruleLC ( (lv_commands_3_0= ruleCommand ) )* ruleLC otherlv_5= '}'
            {
            // InternalCSVs.g:230:3: ()
            // InternalCSVs.g:231:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
            		

            			newCompositeNode(grammarAccess.getBlockAccess().getLCParserRuleCall_2());
            		
            pushFollow(FOLLOW_6);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:248:3: ( (lv_commands_3_0= ruleCommand ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_DOUBLE)||(LA4_0>=15 && LA4_0<=16)||(LA4_0>=18 && LA4_0<=21)||(LA4_0>=23 && LA4_0<=25)||LA4_0==28||LA4_0==30||LA4_0==35||LA4_0==37||(LA4_0>=54 && LA4_0<=58)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCSVs.g:249:4: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalCSVs.g:249:4: (lv_commands_3_0= ruleCommand )
            	    // InternalCSVs.g:250:5: lv_commands_3_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getCommandsCommandParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_commands_3_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_3_0,
            	    						"com.agicquel.csvs.CSVs.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            			newCompositeNode(grammarAccess.getBlockAccess().getLCParserRuleCall_4());
            		
            pushFollow(FOLLOW_7);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalCSVs.g:282:1: entryRuleControlCommand returns [EObject current=null] : iv_ruleControlCommand= ruleControlCommand EOF ;
    public final EObject entryRuleControlCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlCommand = null;


        try {
            // InternalCSVs.g:282:55: (iv_ruleControlCommand= ruleControlCommand EOF )
            // InternalCSVs.g:283:2: iv_ruleControlCommand= ruleControlCommand EOF
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
    // InternalCSVs.g:289:1: ruleControlCommand returns [EObject current=null] : (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand ) ;
    public final EObject ruleControlCommand() throws RecognitionException {
        EObject current = null;

        EObject this_WhileCommand_0 = null;

        EObject this_IfCommand_1 = null;



        	enterRule();

        try {
            // InternalCSVs.g:295:2: ( (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand ) )
            // InternalCSVs.g:296:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand )
            {
            // InternalCSVs.g:296:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCSVs.g:297:3: this_WhileCommand_0= ruleWhileCommand
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
                    // InternalCSVs.g:306:3: this_IfCommand_1= ruleIfCommand
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
    // InternalCSVs.g:318:1: entryRuleWhileCommand returns [EObject current=null] : iv_ruleWhileCommand= ruleWhileCommand EOF ;
    public final EObject entryRuleWhileCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileCommand = null;


        try {
            // InternalCSVs.g:318:53: (iv_ruleWhileCommand= ruleWhileCommand EOF )
            // InternalCSVs.g:319:2: iv_ruleWhileCommand= ruleWhileCommand EOF
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
    // InternalCSVs.g:325:1: ruleWhileCommand returns [EObject current=null] : (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpression ) ) ruleLC ( (lv_body_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cond_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:331:2: ( (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpression ) ) ruleLC ( (lv_body_4_0= ruleBlock ) ) ) )
            // InternalCSVs.g:332:2: (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpression ) ) ruleLC ( (lv_body_4_0= ruleBlock ) ) )
            {
            // InternalCSVs.g:332:2: (otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpression ) ) ruleLC ( (lv_body_4_0= ruleBlock ) ) )
            // InternalCSVs.g:333:3: otherlv_0= 'while' ruleLC ( (lv_cond_2_0= ruleExpression ) ) ruleLC ( (lv_body_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
            		

            			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:344:3: ( (lv_cond_2_0= ruleExpression ) )
            // InternalCSVs.g:345:4: (lv_cond_2_0= ruleExpression )
            {
            // InternalCSVs.g:345:4: (lv_cond_2_0= ruleExpression )
            // InternalCSVs.g:346:5: lv_cond_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileCommandAccess().getCondExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_cond_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_2_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getWhileCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:370:3: ( (lv_body_4_0= ruleBlock ) )
            // InternalCSVs.g:371:4: (lv_body_4_0= ruleBlock )
            {
            // InternalCSVs.g:371:4: (lv_body_4_0= ruleBlock )
            // InternalCSVs.g:372:5: lv_body_4_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getWhileCommandAccess().getBodyBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_4_0,
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
    // InternalCSVs.g:393:1: entryRuleIfCommand returns [EObject current=null] : iv_ruleIfCommand= ruleIfCommand EOF ;
    public final EObject entryRuleIfCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCommand = null;


        try {
            // InternalCSVs.g:393:50: (iv_ruleIfCommand= ruleIfCommand EOF )
            // InternalCSVs.g:394:2: iv_ruleIfCommand= ruleIfCommand EOF
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
    // InternalCSVs.g:400:1: ruleIfCommand returns [EObject current=null] : (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpression ) ) ruleLC ( (lv_thenBody_4_0= ruleBlock ) ) ruleLC (otherlv_6= 'else' ruleLC ( (lv_elseBody_8_0= ruleBlock ) ) ruleLC )? ) ;
    public final EObject ruleIfCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject lv_cond_2_0 = null;

        EObject lv_thenBody_4_0 = null;

        EObject lv_elseBody_8_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:406:2: ( (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpression ) ) ruleLC ( (lv_thenBody_4_0= ruleBlock ) ) ruleLC (otherlv_6= 'else' ruleLC ( (lv_elseBody_8_0= ruleBlock ) ) ruleLC )? ) )
            // InternalCSVs.g:407:2: (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpression ) ) ruleLC ( (lv_thenBody_4_0= ruleBlock ) ) ruleLC (otherlv_6= 'else' ruleLC ( (lv_elseBody_8_0= ruleBlock ) ) ruleLC )? )
            {
            // InternalCSVs.g:407:2: (otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpression ) ) ruleLC ( (lv_thenBody_4_0= ruleBlock ) ) ruleLC (otherlv_6= 'else' ruleLC ( (lv_elseBody_8_0= ruleBlock ) ) ruleLC )? )
            // InternalCSVs.g:408:3: otherlv_0= 'if' ruleLC ( (lv_cond_2_0= ruleExpression ) ) ruleLC ( (lv_thenBody_4_0= ruleBlock ) ) ruleLC (otherlv_6= 'else' ruleLC ( (lv_elseBody_8_0= ruleBlock ) ) ruleLC )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:419:3: ( (lv_cond_2_0= ruleExpression ) )
            // InternalCSVs.g:420:4: (lv_cond_2_0= ruleExpression )
            {
            // InternalCSVs.g:420:4: (lv_cond_2_0= ruleExpression )
            // InternalCSVs.g:421:5: lv_cond_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfCommandAccess().getCondExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_cond_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfCommandRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_2_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_9);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:445:3: ( (lv_thenBody_4_0= ruleBlock ) )
            // InternalCSVs.g:446:4: (lv_thenBody_4_0= ruleBlock )
            {
            // InternalCSVs.g:446:4: (lv_thenBody_4_0= ruleBlock )
            // InternalCSVs.g:447:5: lv_thenBody_4_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfCommandAccess().getThenBodyBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_thenBody_4_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfCommandRule());
            					}
            					set(
            						current,
            						"thenBody",
            						lv_thenBody_4_0,
            						"com.agicquel.csvs.CSVs.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_11);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:471:3: (otherlv_6= 'else' ruleLC ( (lv_elseBody_8_0= ruleBlock ) ) ruleLC )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCSVs.g:472:4: otherlv_6= 'else' ruleLC ( (lv_elseBody_8_0= ruleBlock ) ) ruleLC
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfCommandAccess().getElseKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_9);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:483:4: ( (lv_elseBody_8_0= ruleBlock ) )
                    // InternalCSVs.g:484:5: (lv_elseBody_8_0= ruleBlock )
                    {
                    // InternalCSVs.g:484:5: (lv_elseBody_8_0= ruleBlock )
                    // InternalCSVs.g:485:6: lv_elseBody_8_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getIfCommandAccess().getElseBodyBlockParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_elseBody_8_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfCommandRule());
                    						}
                    						set(
                    							current,
                    							"elseBody",
                    							lv_elseBody_8_0,
                    							"com.agicquel.csvs.CSVs.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    				newCompositeNode(grammarAccess.getIfCommandAccess().getLCParserRuleCall_6_3());
                    			
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
    // InternalCSVs.g:514:1: entryRuleCsvCommand returns [EObject current=null] : iv_ruleCsvCommand= ruleCsvCommand EOF ;
    public final EObject entryRuleCsvCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvCommand = null;


        try {
            // InternalCSVs.g:514:51: (iv_ruleCsvCommand= ruleCsvCommand EOF )
            // InternalCSVs.g:515:2: iv_ruleCsvCommand= ruleCsvCommand EOF
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
    // InternalCSVs.g:521:1: ruleCsvCommand returns [EObject current=null] : (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_ApplyCommand_7= ruleApplyCommand | this_AddCommand_8= ruleAddCommand | this_RenameCommand_9= ruleRenameCommand | this_MergeCommand_10= ruleMergeCommand | this_ConcatCommand_11= ruleConcatCommand ) ;
    public final EObject ruleCsvCommand() throws RecognitionException {
        EObject current = null;

        EObject this_LoadCommand_0 = null;

        EObject this_StoreCommand_1 = null;

        EObject this_CreateCommand_2 = null;

        EObject this_SetCommand_3 = null;

        EObject this_PrintCommand_4 = null;

        EObject this_ExportCommand_5 = null;

        EObject this_DeleteCommand_6 = null;

        EObject this_ApplyCommand_7 = null;

        EObject this_AddCommand_8 = null;

        EObject this_RenameCommand_9 = null;

        EObject this_MergeCommand_10 = null;

        EObject this_ConcatCommand_11 = null;



        	enterRule();

        try {
            // InternalCSVs.g:527:2: ( (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_ApplyCommand_7= ruleApplyCommand | this_AddCommand_8= ruleAddCommand | this_RenameCommand_9= ruleRenameCommand | this_MergeCommand_10= ruleMergeCommand | this_ConcatCommand_11= ruleConcatCommand ) )
            // InternalCSVs.g:528:2: (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_ApplyCommand_7= ruleApplyCommand | this_AddCommand_8= ruleAddCommand | this_RenameCommand_9= ruleRenameCommand | this_MergeCommand_10= ruleMergeCommand | this_ConcatCommand_11= ruleConcatCommand )
            {
            // InternalCSVs.g:528:2: (this_LoadCommand_0= ruleLoadCommand | this_StoreCommand_1= ruleStoreCommand | this_CreateCommand_2= ruleCreateCommand | this_SetCommand_3= ruleSetCommand | this_PrintCommand_4= rulePrintCommand | this_ExportCommand_5= ruleExportCommand | this_DeleteCommand_6= ruleDeleteCommand | this_ApplyCommand_7= ruleApplyCommand | this_AddCommand_8= ruleAddCommand | this_RenameCommand_9= ruleRenameCommand | this_MergeCommand_10= ruleMergeCommand | this_ConcatCommand_11= ruleConcatCommand )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 20:
                {
                alt7=6;
                }
                break;
            case 24:
                {
                alt7=7;
                }
                break;
            case 30:
                {
                alt7=8;
                }
                break;
            case 25:
                {
                alt7=9;
                }
                break;
            case 28:
                {
                alt7=10;
                }
                break;
            case 35:
                {
                alt7=11;
                }
                break;
            case 37:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCSVs.g:529:3: this_LoadCommand_0= ruleLoadCommand
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
                    // InternalCSVs.g:538:3: this_StoreCommand_1= ruleStoreCommand
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
                    // InternalCSVs.g:547:3: this_CreateCommand_2= ruleCreateCommand
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
                    // InternalCSVs.g:556:3: this_SetCommand_3= ruleSetCommand
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
                    // InternalCSVs.g:565:3: this_PrintCommand_4= rulePrintCommand
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
                    // InternalCSVs.g:574:3: this_ExportCommand_5= ruleExportCommand
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
                    // InternalCSVs.g:583:3: this_DeleteCommand_6= ruleDeleteCommand
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
                    // InternalCSVs.g:592:3: this_ApplyCommand_7= ruleApplyCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getApplyCommandParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplyCommand_7=ruleApplyCommand();

                    state._fsp--;


                    			current = this_ApplyCommand_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalCSVs.g:601:3: this_AddCommand_8= ruleAddCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getAddCommandParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddCommand_8=ruleAddCommand();

                    state._fsp--;


                    			current = this_AddCommand_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalCSVs.g:610:3: this_RenameCommand_9= ruleRenameCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getRenameCommandParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameCommand_9=ruleRenameCommand();

                    state._fsp--;


                    			current = this_RenameCommand_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalCSVs.g:619:3: this_MergeCommand_10= ruleMergeCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getMergeCommandParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeCommand_10=ruleMergeCommand();

                    state._fsp--;


                    			current = this_MergeCommand_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalCSVs.g:628:3: this_ConcatCommand_11= ruleConcatCommand
                    {

                    			newCompositeNode(grammarAccess.getCsvCommandAccess().getConcatCommandParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConcatCommand_11=ruleConcatCommand();

                    state._fsp--;


                    			current = this_ConcatCommand_11;
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
    // InternalCSVs.g:640:1: entryRuleLoadCommand returns [EObject current=null] : iv_ruleLoadCommand= ruleLoadCommand EOF ;
    public final EObject entryRuleLoadCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadCommand = null;


        try {
            // InternalCSVs.g:640:52: (iv_ruleLoadCommand= ruleLoadCommand EOF )
            // InternalCSVs.g:641:2: iv_ruleLoadCommand= ruleLoadCommand EOF
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
    // InternalCSVs.g:647:1: ruleLoadCommand returns [EObject current=null] : (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleLoadCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token lv_path_4_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:653:2: ( (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) )
            // InternalCSVs.g:654:2: (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            {
            // InternalCSVs.g:654:2: (otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            // InternalCSVs.g:655:3: otherlv_0= 'load' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadCommandAccess().getLoadKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLoadCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:666:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:667:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:667:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:668:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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
            		
            pushFollow(FOLLOW_16);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:691:3: ( (lv_path_4_0= RULE_STRING ) )
            // InternalCSVs.g:692:4: (lv_path_4_0= RULE_STRING )
            {
            // InternalCSVs.g:692:4: (lv_path_4_0= RULE_STRING )
            // InternalCSVs.g:693:5: lv_path_4_0= RULE_STRING
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
    // InternalCSVs.g:713:1: entryRuleStoreCommand returns [EObject current=null] : iv_ruleStoreCommand= ruleStoreCommand EOF ;
    public final EObject entryRuleStoreCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreCommand = null;


        try {
            // InternalCSVs.g:713:53: (iv_ruleStoreCommand= ruleStoreCommand EOF )
            // InternalCSVs.g:714:2: iv_ruleStoreCommand= ruleStoreCommand EOF
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
    // InternalCSVs.g:720:1: ruleStoreCommand returns [EObject current=null] : (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleStoreCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token lv_path_4_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:726:2: ( (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) )
            // InternalCSVs.g:727:2: (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            {
            // InternalCSVs.g:727:2: (otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            // InternalCSVs.g:728:3: otherlv_0= 'store' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreCommandAccess().getStoreKeyword_0());
            		

            			newCompositeNode(grammarAccess.getStoreCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:739:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:740:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:740:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:741:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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
            		
            pushFollow(FOLLOW_16);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:764:3: ( (lv_path_4_0= RULE_STRING ) )
            // InternalCSVs.g:765:4: (lv_path_4_0= RULE_STRING )
            {
            // InternalCSVs.g:765:4: (lv_path_4_0= RULE_STRING )
            // InternalCSVs.g:766:5: lv_path_4_0= RULE_STRING
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
    // InternalCSVs.g:786:1: entryRuleExportCommand returns [EObject current=null] : iv_ruleExportCommand= ruleExportCommand EOF ;
    public final EObject entryRuleExportCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportCommand = null;


        try {
            // InternalCSVs.g:786:54: (iv_ruleExportCommand= ruleExportCommand EOF )
            // InternalCSVs.g:787:2: iv_ruleExportCommand= ruleExportCommand EOF
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
    // InternalCSVs.g:793:1: ruleExportCommand returns [EObject current=null] : (otherlv_0= 'export_json' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleExportCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token lv_path_4_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:799:2: ( (otherlv_0= 'export_json' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) ) )
            // InternalCSVs.g:800:2: (otherlv_0= 'export_json' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            {
            // InternalCSVs.g:800:2: (otherlv_0= 'export_json' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) ) )
            // InternalCSVs.g:801:3: otherlv_0= 'export_json' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC ( (lv_path_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExportCommandAccess().getExport_jsonKeyword_0());
            		

            			newCompositeNode(grammarAccess.getExportCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:812:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:813:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:813:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:814:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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
            		
            pushFollow(FOLLOW_16);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:837:3: ( (lv_path_4_0= RULE_STRING ) )
            // InternalCSVs.g:838:4: (lv_path_4_0= RULE_STRING )
            {
            // InternalCSVs.g:838:4: (lv_path_4_0= RULE_STRING )
            // InternalCSVs.g:839:5: lv_path_4_0= RULE_STRING
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
    // InternalCSVs.g:859:1: entryRuleCreateCommand returns [EObject current=null] : iv_ruleCreateCommand= ruleCreateCommand EOF ;
    public final EObject entryRuleCreateCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateCommand = null;


        try {
            // InternalCSVs.g:859:54: (iv_ruleCreateCommand= ruleCreateCommand EOF )
            // InternalCSVs.g:860:2: iv_ruleCreateCommand= ruleCreateCommand EOF
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
    // InternalCSVs.g:866:1: ruleCreateCommand returns [EObject current=null] : (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) ) ;
    public final EObject ruleCreateCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:872:2: ( (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) ) )
            // InternalCSVs.g:873:2: (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) )
            {
            // InternalCSVs.g:873:2: (otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) ) )
            // InternalCSVs.g:874:3: otherlv_0= 'create' ruleLC ( (lv_var_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateCommandAccess().getCreateKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCreateCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:885:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:886:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:886:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:887:5: lv_var_2_0= RULE_ID
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
    // InternalCSVs.g:907:1: entryRuleSetCommand returns [EObject current=null] : iv_ruleSetCommand= ruleSetCommand EOF ;
    public final EObject entryRuleSetCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetCommand = null;


        try {
            // InternalCSVs.g:907:51: (iv_ruleSetCommand= ruleSetCommand EOF )
            // InternalCSVs.g:908:2: iv_ruleSetCommand= ruleSetCommand EOF
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
    // InternalCSVs.g:914:1: ruleSetCommand returns [EObject current=null] : ( ( (lv_var_0_0= ruleCsvsExpr ) ) ruleLC otherlv_2= '=' ruleLC ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleSetCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_var_0_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:920:2: ( ( ( (lv_var_0_0= ruleCsvsExpr ) ) ruleLC otherlv_2= '=' ruleLC ( (lv_expression_4_0= ruleExpression ) ) ) )
            // InternalCSVs.g:921:2: ( ( (lv_var_0_0= ruleCsvsExpr ) ) ruleLC otherlv_2= '=' ruleLC ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:921:2: ( ( (lv_var_0_0= ruleCsvsExpr ) ) ruleLC otherlv_2= '=' ruleLC ( (lv_expression_4_0= ruleExpression ) ) )
            // InternalCSVs.g:922:3: ( (lv_var_0_0= ruleCsvsExpr ) ) ruleLC otherlv_2= '=' ruleLC ( (lv_expression_4_0= ruleExpression ) )
            {
            // InternalCSVs.g:922:3: ( (lv_var_0_0= ruleCsvsExpr ) )
            // InternalCSVs.g:923:4: (lv_var_0_0= ruleCsvsExpr )
            {
            // InternalCSVs.g:923:4: (lv_var_0_0= ruleCsvsExpr )
            // InternalCSVs.g:924:5: lv_var_0_0= ruleCsvsExpr
            {

            					newCompositeNode(grammarAccess.getSetCommandAccess().getVarCsvsExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_var_0_0=ruleCsvsExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetCommandRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"com.agicquel.csvs.CSVs.CsvsExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getSetCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSetCommandAccess().getEqualsSignKeyword_2());
            		

            			newCompositeNode(grammarAccess.getSetCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:959:3: ( (lv_expression_4_0= ruleExpression ) )
            // InternalCSVs.g:960:4: (lv_expression_4_0= ruleExpression )
            {
            // InternalCSVs.g:960:4: (lv_expression_4_0= ruleExpression )
            // InternalCSVs.g:961:5: lv_expression_4_0= ruleExpression
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
    // InternalCSVs.g:982:1: entryRulePrintCommand returns [EObject current=null] : iv_rulePrintCommand= rulePrintCommand EOF ;
    public final EObject entryRulePrintCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCommand = null;


        try {
            // InternalCSVs.g:982:53: (iv_rulePrintCommand= rulePrintCommand EOF )
            // InternalCSVs.g:983:2: iv_rulePrintCommand= rulePrintCommand EOF
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
    // InternalCSVs.g:989:1: rulePrintCommand returns [EObject current=null] : (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject rulePrintCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:995:2: ( (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalCSVs.g:996:2: (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:996:2: (otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalCSVs.g:997:3: otherlv_0= 'print' ruleLC ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintCommandAccess().getPrintKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPrintCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1008:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalCSVs.g:1009:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalCSVs.g:1009:4: (lv_expression_2_0= ruleExpression )
            // InternalCSVs.g:1010:5: lv_expression_2_0= ruleExpression
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
    // InternalCSVs.g:1031:1: entryRuleDeleteCommand returns [EObject current=null] : iv_ruleDeleteCommand= ruleDeleteCommand EOF ;
    public final EObject entryRuleDeleteCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteCommand = null;


        try {
            // InternalCSVs.g:1031:54: (iv_ruleDeleteCommand= ruleDeleteCommand EOF )
            // InternalCSVs.g:1032:2: iv_ruleDeleteCommand= ruleDeleteCommand EOF
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
    // InternalCSVs.g:1038:1: ruleDeleteCommand returns [EObject current=null] : (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleCsvsExpr ) ) ) ;
    public final EObject ruleDeleteCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1044:2: ( (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleCsvsExpr ) ) ) )
            // InternalCSVs.g:1045:2: (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleCsvsExpr ) ) )
            {
            // InternalCSVs.g:1045:2: (otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleCsvsExpr ) ) )
            // InternalCSVs.g:1046:3: otherlv_0= 'delete' ruleLC ( (lv_expression_2_0= ruleCsvsExpr ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteCommandAccess().getDeleteKeyword_0());
            		

            			newCompositeNode(grammarAccess.getDeleteCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1057:3: ( (lv_expression_2_0= ruleCsvsExpr ) )
            // InternalCSVs.g:1058:4: (lv_expression_2_0= ruleCsvsExpr )
            {
            // InternalCSVs.g:1058:4: (lv_expression_2_0= ruleCsvsExpr )
            // InternalCSVs.g:1059:5: lv_expression_2_0= ruleCsvsExpr
            {

            					newCompositeNode(grammarAccess.getDeleteCommandAccess().getExpressionCsvsExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleCsvsExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteCommandRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"com.agicquel.csvs.CSVs.CsvsExpr");
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
    // InternalCSVs.g:1080:1: entryRuleAddCommand returns [EObject current=null] : iv_ruleAddCommand= ruleAddCommand EOF ;
    public final EObject entryRuleAddCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddCommand = null;


        try {
            // InternalCSVs.g:1080:51: (iv_ruleAddCommand= ruleAddCommand EOF )
            // InternalCSVs.g:1081:2: iv_ruleAddCommand= ruleAddCommand EOF
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
    // InternalCSVs.g:1087:1: ruleAddCommand returns [EObject current=null] : (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleCsvsExpr ) ) ) ;
    public final EObject ruleAddCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1093:2: ( (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleCsvsExpr ) ) ) )
            // InternalCSVs.g:1094:2: (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleCsvsExpr ) ) )
            {
            // InternalCSVs.g:1094:2: (otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleCsvsExpr ) ) )
            // InternalCSVs.g:1095:3: otherlv_0= 'add' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleCsvsExpr ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAddCommandAccess().getAddKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAddCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_22);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1106:3: ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) )
            // InternalCSVs.g:1107:4: ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) )
            {
            // InternalCSVs.g:1107:4: ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) )
            // InternalCSVs.g:1108:5: (lv_op_2_1= 'row' | lv_op_2_2= 'col' )
            {
            // InternalCSVs.g:1108:5: (lv_op_2_1= 'row' | lv_op_2_2= 'col' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCSVs.g:1109:6: lv_op_2_1= 'row'
                    {
                    lv_op_2_1=(Token)match(input,26,FOLLOW_19); 

                    						newLeafNode(lv_op_2_1, grammarAccess.getAddCommandAccess().getOpRowKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddCommandRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:1120:6: lv_op_2_2= 'col'
                    {
                    lv_op_2_2=(Token)match(input,27,FOLLOW_19); 

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
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1140:3: ( (lv_expression_4_0= ruleCsvsExpr ) )
            // InternalCSVs.g:1141:4: (lv_expression_4_0= ruleCsvsExpr )
            {
            // InternalCSVs.g:1141:4: (lv_expression_4_0= ruleCsvsExpr )
            // InternalCSVs.g:1142:5: lv_expression_4_0= ruleCsvsExpr
            {

            					newCompositeNode(grammarAccess.getAddCommandAccess().getExpressionCsvsExprParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_4_0=ruleCsvsExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddCommandRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"com.agicquel.csvs.CSVs.CsvsExpr");
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


    // $ANTLR start "entryRuleRenameCommand"
    // InternalCSVs.g:1163:1: entryRuleRenameCommand returns [EObject current=null] : iv_ruleRenameCommand= ruleRenameCommand EOF ;
    public final EObject entryRuleRenameCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameCommand = null;


        try {
            // InternalCSVs.g:1163:54: (iv_ruleRenameCommand= ruleRenameCommand EOF )
            // InternalCSVs.g:1164:2: iv_ruleRenameCommand= ruleRenameCommand EOF
            {
             newCompositeNode(grammarAccess.getRenameCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameCommand=ruleRenameCommand();

            state._fsp--;

             current =iv_ruleRenameCommand; 
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
    // $ANTLR end "entryRuleRenameCommand"


    // $ANTLR start "ruleRenameCommand"
    // InternalCSVs.g:1170:1: ruleRenameCommand returns [EObject current=null] : (otherlv_0= 'rename' ruleLC ( (lv_expr_2_0= ruleCsvsExpr ) ) ruleLC ( (lv_oldname_4_0= ruleExpression ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_newname_8_0= ruleExpression ) ) ) ;
    public final EObject ruleRenameCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject lv_expr_2_0 = null;

        EObject lv_oldname_4_0 = null;

        EObject lv_newname_8_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1176:2: ( (otherlv_0= 'rename' ruleLC ( (lv_expr_2_0= ruleCsvsExpr ) ) ruleLC ( (lv_oldname_4_0= ruleExpression ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_newname_8_0= ruleExpression ) ) ) )
            // InternalCSVs.g:1177:2: (otherlv_0= 'rename' ruleLC ( (lv_expr_2_0= ruleCsvsExpr ) ) ruleLC ( (lv_oldname_4_0= ruleExpression ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_newname_8_0= ruleExpression ) ) )
            {
            // InternalCSVs.g:1177:2: (otherlv_0= 'rename' ruleLC ( (lv_expr_2_0= ruleCsvsExpr ) ) ruleLC ( (lv_oldname_4_0= ruleExpression ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_newname_8_0= ruleExpression ) ) )
            // InternalCSVs.g:1178:3: otherlv_0= 'rename' ruleLC ( (lv_expr_2_0= ruleCsvsExpr ) ) ruleLC ( (lv_oldname_4_0= ruleExpression ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_newname_8_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameCommandAccess().getRenameKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRenameCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1189:3: ( (lv_expr_2_0= ruleCsvsExpr ) )
            // InternalCSVs.g:1190:4: (lv_expr_2_0= ruleCsvsExpr )
            {
            // InternalCSVs.g:1190:4: (lv_expr_2_0= ruleCsvsExpr )
            // InternalCSVs.g:1191:5: lv_expr_2_0= ruleCsvsExpr
            {

            					newCompositeNode(grammarAccess.getRenameCommandAccess().getExprCsvsExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_expr_2_0=ruleCsvsExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenameCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"com.agicquel.csvs.CSVs.CsvsExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getRenameCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1215:3: ( (lv_oldname_4_0= ruleExpression ) )
            // InternalCSVs.g:1216:4: (lv_oldname_4_0= ruleExpression )
            {
            // InternalCSVs.g:1216:4: (lv_oldname_4_0= ruleExpression )
            // InternalCSVs.g:1217:5: lv_oldname_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRenameCommandAccess().getOldnameExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_oldname_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenameCommandRule());
            					}
            					set(
            						current,
            						"oldname",
            						lv_oldname_4_0,
            						"com.agicquel.csvs.CSVs.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getRenameCommandAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_24);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getRenameCommandAccess().getColonKeyword_6());
            		

            			newCompositeNode(grammarAccess.getRenameCommandAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1252:3: ( (lv_newname_8_0= ruleExpression ) )
            // InternalCSVs.g:1253:4: (lv_newname_8_0= ruleExpression )
            {
            // InternalCSVs.g:1253:4: (lv_newname_8_0= ruleExpression )
            // InternalCSVs.g:1254:5: lv_newname_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRenameCommandAccess().getNewnameExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_newname_8_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenameCommandRule());
            					}
            					set(
            						current,
            						"newname",
            						lv_newname_8_0,
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
    // $ANTLR end "ruleRenameCommand"


    // $ANTLR start "entryRuleApplyCommand"
    // InternalCSVs.g:1275:1: entryRuleApplyCommand returns [EObject current=null] : iv_ruleApplyCommand= ruleApplyCommand EOF ;
    public final EObject entryRuleApplyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyCommand = null;


        try {
            // InternalCSVs.g:1275:53: (iv_ruleApplyCommand= ruleApplyCommand EOF )
            // InternalCSVs.g:1276:2: iv_ruleApplyCommand= ruleApplyCommand EOF
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
    // InternalCSVs.g:1282:1: ruleApplyCommand returns [EObject current=null] : (otherlv_0= 'on' ruleLC ( (lv_selection_2_0= ruleCsvsExpr ) ) ruleLC ( (lv_if_4_0= ruleApplyFilterCommand ) )? ruleLC ( (lv_exec_6_0= ruleApplyExecCommand ) ) ) ;
    public final EObject ruleApplyCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_selection_2_0 = null;

        EObject lv_if_4_0 = null;

        EObject lv_exec_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1288:2: ( (otherlv_0= 'on' ruleLC ( (lv_selection_2_0= ruleCsvsExpr ) ) ruleLC ( (lv_if_4_0= ruleApplyFilterCommand ) )? ruleLC ( (lv_exec_6_0= ruleApplyExecCommand ) ) ) )
            // InternalCSVs.g:1289:2: (otherlv_0= 'on' ruleLC ( (lv_selection_2_0= ruleCsvsExpr ) ) ruleLC ( (lv_if_4_0= ruleApplyFilterCommand ) )? ruleLC ( (lv_exec_6_0= ruleApplyExecCommand ) ) )
            {
            // InternalCSVs.g:1289:2: (otherlv_0= 'on' ruleLC ( (lv_selection_2_0= ruleCsvsExpr ) ) ruleLC ( (lv_if_4_0= ruleApplyFilterCommand ) )? ruleLC ( (lv_exec_6_0= ruleApplyExecCommand ) ) )
            // InternalCSVs.g:1290:3: otherlv_0= 'on' ruleLC ( (lv_selection_2_0= ruleCsvsExpr ) ) ruleLC ( (lv_if_4_0= ruleApplyFilterCommand ) )? ruleLC ( (lv_exec_6_0= ruleApplyExecCommand ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getApplyCommandAccess().getOnKeyword_0());
            		

            			newCompositeNode(grammarAccess.getApplyCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1301:3: ( (lv_selection_2_0= ruleCsvsExpr ) )
            // InternalCSVs.g:1302:4: (lv_selection_2_0= ruleCsvsExpr )
            {
            // InternalCSVs.g:1302:4: (lv_selection_2_0= ruleCsvsExpr )
            // InternalCSVs.g:1303:5: lv_selection_2_0= ruleCsvsExpr
            {

            					newCompositeNode(grammarAccess.getApplyCommandAccess().getSelectionCsvsExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_selection_2_0=ruleCsvsExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplyCommandRule());
            					}
            					set(
            						current,
            						"selection",
            						lv_selection_2_0,
            						"com.agicquel.csvs.CSVs.CsvsExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getApplyCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_25);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1327:3: ( (lv_if_4_0= ruleApplyFilterCommand ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCSVs.g:1328:4: (lv_if_4_0= ruleApplyFilterCommand )
                    {
                    // InternalCSVs.g:1328:4: (lv_if_4_0= ruleApplyFilterCommand )
                    // InternalCSVs.g:1329:5: lv_if_4_0= ruleApplyFilterCommand
                    {

                    					newCompositeNode(grammarAccess.getApplyCommandAccess().getIfApplyFilterCommandParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_25);
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
            		
            pushFollow(FOLLOW_25);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1353:3: ( (lv_exec_6_0= ruleApplyExecCommand ) )
            // InternalCSVs.g:1354:4: (lv_exec_6_0= ruleApplyExecCommand )
            {
            // InternalCSVs.g:1354:4: (lv_exec_6_0= ruleApplyExecCommand )
            // InternalCSVs.g:1355:5: lv_exec_6_0= ruleApplyExecCommand
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
    // InternalCSVs.g:1376:1: entryRuleApplyFilterCommand returns [EObject current=null] : iv_ruleApplyFilterCommand= ruleApplyFilterCommand EOF ;
    public final EObject entryRuleApplyFilterCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFilterCommand = null;


        try {
            // InternalCSVs.g:1376:59: (iv_ruleApplyFilterCommand= ruleApplyFilterCommand EOF )
            // InternalCSVs.g:1377:2: iv_ruleApplyFilterCommand= ruleApplyFilterCommand EOF
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
    // InternalCSVs.g:1383:1: ruleApplyFilterCommand returns [EObject current=null] : (otherlv_0= 'filter' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' ) ;
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
            // InternalCSVs.g:1389:2: ( (otherlv_0= 'filter' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' ) )
            // InternalCSVs.g:1390:2: (otherlv_0= 'filter' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' )
            {
            // InternalCSVs.g:1390:2: (otherlv_0= 'filter' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' )
            // InternalCSVs.g:1391:3: otherlv_0= 'filter' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getApplyFilterCommandAccess().getFilterKeyword_0());
            		

            			newCompositeNode(grammarAccess.getApplyFilterCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_27);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getApplyFilterCommandAccess().getLeftParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getApplyFilterCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_14);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1413:3: ( (lv_varName_4_0= RULE_ID ) )
            // InternalCSVs.g:1414:4: (lv_varName_4_0= RULE_ID )
            {
            // InternalCSVs.g:1414:4: (lv_varName_4_0= RULE_ID )
            // InternalCSVs.g:1415:5: lv_varName_4_0= RULE_ID
            {
            lv_varName_4_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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
            		
            pushFollow(FOLLOW_24);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getApplyFilterCommandAccess().getColonKeyword_6());
            		

            			newCompositeNode(grammarAccess.getApplyFilterCommandAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1449:3: ( (lv_expr_8_0= ruleExpression ) )
            // InternalCSVs.g:1450:4: (lv_expr_8_0= ruleExpression )
            {
            // InternalCSVs.g:1450:4: (lv_expr_8_0= ruleExpression )
            // InternalCSVs.g:1451:5: lv_expr_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getApplyFilterCommandAccess().getExprExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_28);
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
            		
            pushFollow(FOLLOW_29);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_10=(Token)match(input,33,FOLLOW_2); 

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
    // InternalCSVs.g:1483:1: entryRuleApplyExecCommand returns [EObject current=null] : iv_ruleApplyExecCommand= ruleApplyExecCommand EOF ;
    public final EObject entryRuleApplyExecCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyExecCommand = null;


        try {
            // InternalCSVs.g:1483:57: (iv_ruleApplyExecCommand= ruleApplyExecCommand EOF )
            // InternalCSVs.g:1484:2: iv_ruleApplyExecCommand= ruleApplyExecCommand EOF
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
    // InternalCSVs.g:1490:1: ruleApplyExecCommand returns [EObject current=null] : (otherlv_0= 'apply' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' ) ;
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
            // InternalCSVs.g:1496:2: ( (otherlv_0= 'apply' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' ) )
            // InternalCSVs.g:1497:2: (otherlv_0= 'apply' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' )
            {
            // InternalCSVs.g:1497:2: (otherlv_0= 'apply' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')' )
            // InternalCSVs.g:1498:3: otherlv_0= 'apply' ruleLC otherlv_2= '(' ruleLC ( (lv_varName_4_0= RULE_ID ) ) ruleLC otherlv_6= ':' ruleLC ( (lv_expr_8_0= ruleExpression ) ) ruleLC otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getApplyExecCommandAccess().getApplyKeyword_0());
            		

            			newCompositeNode(grammarAccess.getApplyExecCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_27);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getApplyExecCommandAccess().getLeftParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getApplyExecCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_14);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1520:3: ( (lv_varName_4_0= RULE_ID ) )
            // InternalCSVs.g:1521:4: (lv_varName_4_0= RULE_ID )
            {
            // InternalCSVs.g:1521:4: (lv_varName_4_0= RULE_ID )
            // InternalCSVs.g:1522:5: lv_varName_4_0= RULE_ID
            {
            lv_varName_4_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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
            		
            pushFollow(FOLLOW_24);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getApplyExecCommandAccess().getColonKeyword_6());
            		

            			newCompositeNode(grammarAccess.getApplyExecCommandAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1556:3: ( (lv_expr_8_0= ruleExpression ) )
            // InternalCSVs.g:1557:4: (lv_expr_8_0= ruleExpression )
            {
            // InternalCSVs.g:1557:4: (lv_expr_8_0= ruleExpression )
            // InternalCSVs.g:1558:5: lv_expr_8_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getApplyExecCommandAccess().getExprExpressionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_28);
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
            		
            pushFollow(FOLLOW_29);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_10=(Token)match(input,33,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMergeCommand"
    // InternalCSVs.g:1590:1: entryRuleMergeCommand returns [EObject current=null] : iv_ruleMergeCommand= ruleMergeCommand EOF ;
    public final EObject entryRuleMergeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeCommand = null;


        try {
            // InternalCSVs.g:1590:53: (iv_ruleMergeCommand= ruleMergeCommand EOF )
            // InternalCSVs.g:1591:2: iv_ruleMergeCommand= ruleMergeCommand EOF
            {
             newCompositeNode(grammarAccess.getMergeCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMergeCommand=ruleMergeCommand();

            state._fsp--;

             current =iv_ruleMergeCommand; 
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
    // $ANTLR end "entryRuleMergeCommand"


    // $ANTLR start "ruleMergeCommand"
    // InternalCSVs.g:1597:1: ruleMergeCommand returns [EObject current=null] : (otherlv_0= 'merge' ruleLC ( (lv_selection1_2_0= ruleCsvsExpr ) ) ruleLC otherlv_4= 'with' ruleLC ( (lv_selection2_6_0= ruleCsvsExpr ) ) ) ;
    public final EObject ruleMergeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_selection1_2_0 = null;

        EObject lv_selection2_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1603:2: ( (otherlv_0= 'merge' ruleLC ( (lv_selection1_2_0= ruleCsvsExpr ) ) ruleLC otherlv_4= 'with' ruleLC ( (lv_selection2_6_0= ruleCsvsExpr ) ) ) )
            // InternalCSVs.g:1604:2: (otherlv_0= 'merge' ruleLC ( (lv_selection1_2_0= ruleCsvsExpr ) ) ruleLC otherlv_4= 'with' ruleLC ( (lv_selection2_6_0= ruleCsvsExpr ) ) )
            {
            // InternalCSVs.g:1604:2: (otherlv_0= 'merge' ruleLC ( (lv_selection1_2_0= ruleCsvsExpr ) ) ruleLC otherlv_4= 'with' ruleLC ( (lv_selection2_6_0= ruleCsvsExpr ) ) )
            // InternalCSVs.g:1605:3: otherlv_0= 'merge' ruleLC ( (lv_selection1_2_0= ruleCsvsExpr ) ) ruleLC otherlv_4= 'with' ruleLC ( (lv_selection2_6_0= ruleCsvsExpr ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeCommandAccess().getMergeKeyword_0());
            		

            			newCompositeNode(grammarAccess.getMergeCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1616:3: ( (lv_selection1_2_0= ruleCsvsExpr ) )
            // InternalCSVs.g:1617:4: (lv_selection1_2_0= ruleCsvsExpr )
            {
            // InternalCSVs.g:1617:4: (lv_selection1_2_0= ruleCsvsExpr )
            // InternalCSVs.g:1618:5: lv_selection1_2_0= ruleCsvsExpr
            {

            					newCompositeNode(grammarAccess.getMergeCommandAccess().getSelection1CsvsExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_selection1_2_0=ruleCsvsExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMergeCommandRule());
            					}
            					set(
            						current,
            						"selection1",
            						lv_selection1_2_0,
            						"com.agicquel.csvs.CSVs.CsvsExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getMergeCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_31);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getMergeCommandAccess().getWithKeyword_4());
            		

            			newCompositeNode(grammarAccess.getMergeCommandAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1653:3: ( (lv_selection2_6_0= ruleCsvsExpr ) )
            // InternalCSVs.g:1654:4: (lv_selection2_6_0= ruleCsvsExpr )
            {
            // InternalCSVs.g:1654:4: (lv_selection2_6_0= ruleCsvsExpr )
            // InternalCSVs.g:1655:5: lv_selection2_6_0= ruleCsvsExpr
            {

            					newCompositeNode(grammarAccess.getMergeCommandAccess().getSelection2CsvsExprParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_selection2_6_0=ruleCsvsExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMergeCommandRule());
            					}
            					set(
            						current,
            						"selection2",
            						lv_selection2_6_0,
            						"com.agicquel.csvs.CSVs.CsvsExpr");
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
    // $ANTLR end "ruleMergeCommand"


    // $ANTLR start "entryRuleConcatCommand"
    // InternalCSVs.g:1676:1: entryRuleConcatCommand returns [EObject current=null] : iv_ruleConcatCommand= ruleConcatCommand EOF ;
    public final EObject entryRuleConcatCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatCommand = null;


        try {
            // InternalCSVs.g:1676:54: (iv_ruleConcatCommand= ruleConcatCommand EOF )
            // InternalCSVs.g:1677:2: iv_ruleConcatCommand= ruleConcatCommand EOF
            {
             newCompositeNode(grammarAccess.getConcatCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcatCommand=ruleConcatCommand();

            state._fsp--;

             current =iv_ruleConcatCommand; 
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
    // $ANTLR end "entryRuleConcatCommand"


    // $ANTLR start "ruleConcatCommand"
    // InternalCSVs.g:1683:1: ruleConcatCommand returns [EObject current=null] : (otherlv_0= 'concat' ruleLC ( (lv_selection1_2_0= ruleCsvsExpr ) ) ruleLC otherlv_4= 'with' ruleLC ( (lv_selection2_6_0= ruleCsvsExpr ) ) ) ;
    public final EObject ruleConcatCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_selection1_2_0 = null;

        EObject lv_selection2_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1689:2: ( (otherlv_0= 'concat' ruleLC ( (lv_selection1_2_0= ruleCsvsExpr ) ) ruleLC otherlv_4= 'with' ruleLC ( (lv_selection2_6_0= ruleCsvsExpr ) ) ) )
            // InternalCSVs.g:1690:2: (otherlv_0= 'concat' ruleLC ( (lv_selection1_2_0= ruleCsvsExpr ) ) ruleLC otherlv_4= 'with' ruleLC ( (lv_selection2_6_0= ruleCsvsExpr ) ) )
            {
            // InternalCSVs.g:1690:2: (otherlv_0= 'concat' ruleLC ( (lv_selection1_2_0= ruleCsvsExpr ) ) ruleLC otherlv_4= 'with' ruleLC ( (lv_selection2_6_0= ruleCsvsExpr ) ) )
            // InternalCSVs.g:1691:3: otherlv_0= 'concat' ruleLC ( (lv_selection1_2_0= ruleCsvsExpr ) ) ruleLC otherlv_4= 'with' ruleLC ( (lv_selection2_6_0= ruleCsvsExpr ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getConcatCommandAccess().getConcatKeyword_0());
            		

            			newCompositeNode(grammarAccess.getConcatCommandAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1702:3: ( (lv_selection1_2_0= ruleCsvsExpr ) )
            // InternalCSVs.g:1703:4: (lv_selection1_2_0= ruleCsvsExpr )
            {
            // InternalCSVs.g:1703:4: (lv_selection1_2_0= ruleCsvsExpr )
            // InternalCSVs.g:1704:5: lv_selection1_2_0= ruleCsvsExpr
            {

            					newCompositeNode(grammarAccess.getConcatCommandAccess().getSelection1CsvsExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_selection1_2_0=ruleCsvsExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConcatCommandRule());
            					}
            					set(
            						current,
            						"selection1",
            						lv_selection1_2_0,
            						"com.agicquel.csvs.CSVs.CsvsExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getConcatCommandAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_31);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getConcatCommandAccess().getWithKeyword_4());
            		

            			newCompositeNode(grammarAccess.getConcatCommandAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:1739:3: ( (lv_selection2_6_0= ruleCsvsExpr ) )
            // InternalCSVs.g:1740:4: (lv_selection2_6_0= ruleCsvsExpr )
            {
            // InternalCSVs.g:1740:4: (lv_selection2_6_0= ruleCsvsExpr )
            // InternalCSVs.g:1741:5: lv_selection2_6_0= ruleCsvsExpr
            {

            					newCompositeNode(grammarAccess.getConcatCommandAccess().getSelection2CsvsExprParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_selection2_6_0=ruleCsvsExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConcatCommandRule());
            					}
            					set(
            						current,
            						"selection2",
            						lv_selection2_6_0,
            						"com.agicquel.csvs.CSVs.CsvsExpr");
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
    // $ANTLR end "ruleConcatCommand"


    // $ANTLR start "entryRuleCommentCommand"
    // InternalCSVs.g:1762:1: entryRuleCommentCommand returns [String current=null] : iv_ruleCommentCommand= ruleCommentCommand EOF ;
    public final String entryRuleCommentCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentCommand = null;


        try {
            // InternalCSVs.g:1762:54: (iv_ruleCommentCommand= ruleCommentCommand EOF )
            // InternalCSVs.g:1763:2: iv_ruleCommentCommand= ruleCommentCommand EOF
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
    // InternalCSVs.g:1769:1: ruleCommentCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleCommentCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ML_COMMENT_0=null;
        Token this_SL_COMMENT_1=null;


        	enterRule();

        try {
            // InternalCSVs.g:1775:2: ( (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // InternalCSVs.g:1776:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // InternalCSVs.g:1776:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ML_COMMENT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_SL_COMMENT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCSVs.g:1777:3: this_ML_COMMENT_0= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    			current.merge(this_ML_COMMENT_0);
                    		

                    			newLeafNode(this_ML_COMMENT_0, grammarAccess.getCommentCommandAccess().getML_COMMENTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:1785:3: this_SL_COMMENT_1= RULE_SL_COMMENT
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
    // InternalCSVs.g:1796:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCSVs.g:1796:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCSVs.g:1797:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalCSVs.g:1803:1: ruleExpression returns [EObject current=null] : this_OrExpr_0= ruleOrExpr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpr_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1809:2: (this_OrExpr_0= ruleOrExpr )
            // InternalCSVs.g:1810:2: this_OrExpr_0= ruleOrExpr
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


    // $ANTLR start "entryRuleOrExpr"
    // InternalCSVs.g:1821:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalCSVs.g:1821:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalCSVs.g:1822:2: iv_ruleOrExpr= ruleOrExpr EOF
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
    // InternalCSVs.g:1828:1: ruleOrExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleAddExpr ) ) ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1834:2: ( ( ( (lv_left_0_0= ruleAddExpr ) ) ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )* ) )
            // InternalCSVs.g:1835:2: ( ( (lv_left_0_0= ruleAddExpr ) ) ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )* )
            {
            // InternalCSVs.g:1835:2: ( ( (lv_left_0_0= ruleAddExpr ) ) ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )* )
            // InternalCSVs.g:1836:3: ( (lv_left_0_0= ruleAddExpr ) ) ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )*
            {
            // InternalCSVs.g:1836:3: ( (lv_left_0_0= ruleAddExpr ) )
            // InternalCSVs.g:1837:4: (lv_left_0_0= ruleAddExpr )
            {
            // InternalCSVs.g:1837:4: (lv_left_0_0= ruleAddExpr )
            // InternalCSVs.g:1838:5: lv_left_0_0= ruleAddExpr
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

            // InternalCSVs.g:1855:3: ( ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WS) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==38) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCSVs.g:1856:4: ruleLC otherlv_2= '||' ruleLC ( (lv_right_4_0= ruleAddExpr ) )
            	    {

            	    				newCompositeNode(grammarAccess.getOrExprAccess().getLCParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_33);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_2=(Token)match(input,38,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			

            	    				newCompositeNode(grammarAccess.getOrExprAccess().getLCParserRuleCall_1_2());
            	    			
            	    pushFollow(FOLLOW_8);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:1874:4: ( (lv_right_4_0= ruleAddExpr ) )
            	    // InternalCSVs.g:1875:5: (lv_right_4_0= ruleAddExpr )
            	    {
            	    // InternalCSVs.g:1875:5: (lv_right_4_0= ruleAddExpr )
            	    // InternalCSVs.g:1876:6: lv_right_4_0= ruleAddExpr
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
    // InternalCSVs.g:1898:1: entryRuleAddExpr returns [EObject current=null] : iv_ruleAddExpr= ruleAddExpr EOF ;
    public final EObject entryRuleAddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpr = null;


        try {
            // InternalCSVs.g:1898:48: (iv_ruleAddExpr= ruleAddExpr EOF )
            // InternalCSVs.g:1899:2: iv_ruleAddExpr= ruleAddExpr EOF
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
    // InternalCSVs.g:1905:1: ruleAddExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleEqualityExpr ) ) ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )* ) ;
    public final EObject ruleAddExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1911:2: ( ( ( (lv_left_0_0= ruleEqualityExpr ) ) ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )* ) )
            // InternalCSVs.g:1912:2: ( ( (lv_left_0_0= ruleEqualityExpr ) ) ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )* )
            {
            // InternalCSVs.g:1912:2: ( ( (lv_left_0_0= ruleEqualityExpr ) ) ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )* )
            // InternalCSVs.g:1913:3: ( (lv_left_0_0= ruleEqualityExpr ) ) ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )*
            {
            // InternalCSVs.g:1913:3: ( (lv_left_0_0= ruleEqualityExpr ) )
            // InternalCSVs.g:1914:4: (lv_left_0_0= ruleEqualityExpr )
            {
            // InternalCSVs.g:1914:4: (lv_left_0_0= ruleEqualityExpr )
            // InternalCSVs.g:1915:5: lv_left_0_0= ruleEqualityExpr
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

            // InternalCSVs.g:1932:3: ( ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WS) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==39) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCSVs.g:1933:4: ruleLC otherlv_2= '&&' ruleLC ( (lv_right_4_0= ruleEqualityExpr ) )
            	    {

            	    				newCompositeNode(grammarAccess.getAddExprAccess().getLCParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_35);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_2=(Token)match(input,39,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAddExprAccess().getAmpersandAmpersandKeyword_1_1());
            	    			

            	    				newCompositeNode(grammarAccess.getAddExprAccess().getLCParserRuleCall_1_2());
            	    			
            	    pushFollow(FOLLOW_8);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:1951:4: ( (lv_right_4_0= ruleEqualityExpr ) )
            	    // InternalCSVs.g:1952:5: (lv_right_4_0= ruleEqualityExpr )
            	    {
            	    // InternalCSVs.g:1952:5: (lv_right_4_0= ruleEqualityExpr )
            	    // InternalCSVs.g:1953:6: lv_right_4_0= ruleEqualityExpr
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
    // InternalCSVs.g:1975:1: entryRuleEqualityExpr returns [EObject current=null] : iv_ruleEqualityExpr= ruleEqualityExpr EOF ;
    public final EObject entryRuleEqualityExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpr = null;


        try {
            // InternalCSVs.g:1975:53: (iv_ruleEqualityExpr= ruleEqualityExpr EOF )
            // InternalCSVs.g:1976:2: iv_ruleEqualityExpr= ruleEqualityExpr EOF
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
    // InternalCSVs.g:1982:1: ruleEqualityExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleComparaisonExpr ) ) ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )? ) ;
    public final EObject ruleEqualityExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:1988:2: ( ( ( (lv_left_0_0= ruleComparaisonExpr ) ) ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )? ) )
            // InternalCSVs.g:1989:2: ( ( (lv_left_0_0= ruleComparaisonExpr ) ) ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )? )
            {
            // InternalCSVs.g:1989:2: ( ( (lv_left_0_0= ruleComparaisonExpr ) ) ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )? )
            // InternalCSVs.g:1990:3: ( (lv_left_0_0= ruleComparaisonExpr ) ) ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )?
            {
            // InternalCSVs.g:1990:3: ( (lv_left_0_0= ruleComparaisonExpr ) )
            // InternalCSVs.g:1991:4: (lv_left_0_0= ruleComparaisonExpr )
            {
            // InternalCSVs.g:1991:4: (lv_left_0_0= ruleComparaisonExpr )
            // InternalCSVs.g:1992:5: lv_left_0_0= ruleComparaisonExpr
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

            // InternalCSVs.g:2009:3: ( ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_WS) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=40 && LA14_1<=41)) ) {
                    alt14=1;
                }
            }
            else if ( ((LA14_0>=40 && LA14_0<=41)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCSVs.g:2010:4: ruleLC ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ruleLC ( (lv_right_4_0= ruleComparaisonExpr ) )
                    {

                    				newCompositeNode(grammarAccess.getEqualityExprAccess().getLCParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_37);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:2017:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
                    // InternalCSVs.g:2018:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
                    {
                    // InternalCSVs.g:2018:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
                    // InternalCSVs.g:2019:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
                    {
                    // InternalCSVs.g:2019:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==40) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==41) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalCSVs.g:2020:7: lv_op_2_1= '=='
                            {
                            lv_op_2_1=(Token)match(input,40,FOLLOW_8); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityExprAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEqualityExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCSVs.g:2031:7: lv_op_2_2= '!='
                            {
                            lv_op_2_2=(Token)match(input,41,FOLLOW_8); 

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
                    			
                    pushFollow(FOLLOW_8);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:2051:4: ( (lv_right_4_0= ruleComparaisonExpr ) )
                    // InternalCSVs.g:2052:5: (lv_right_4_0= ruleComparaisonExpr )
                    {
                    // InternalCSVs.g:2052:5: (lv_right_4_0= ruleComparaisonExpr )
                    // InternalCSVs.g:2053:6: lv_right_4_0= ruleComparaisonExpr
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
    // InternalCSVs.g:2075:1: entryRuleComparaisonExpr returns [EObject current=null] : iv_ruleComparaisonExpr= ruleComparaisonExpr EOF ;
    public final EObject entryRuleComparaisonExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparaisonExpr = null;


        try {
            // InternalCSVs.g:2075:56: (iv_ruleComparaisonExpr= ruleComparaisonExpr EOF )
            // InternalCSVs.g:2076:2: iv_ruleComparaisonExpr= ruleComparaisonExpr EOF
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
    // InternalCSVs.g:2082:1: ruleComparaisonExpr returns [EObject current=null] : ( ( (lv_left_0_0= rulePlusOrMinusExpr ) ) ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )? ) ;
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
            // InternalCSVs.g:2088:2: ( ( ( (lv_left_0_0= rulePlusOrMinusExpr ) ) ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )? ) )
            // InternalCSVs.g:2089:2: ( ( (lv_left_0_0= rulePlusOrMinusExpr ) ) ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )? )
            {
            // InternalCSVs.g:2089:2: ( ( (lv_left_0_0= rulePlusOrMinusExpr ) ) ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )? )
            // InternalCSVs.g:2090:3: ( (lv_left_0_0= rulePlusOrMinusExpr ) ) ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )?
            {
            // InternalCSVs.g:2090:3: ( (lv_left_0_0= rulePlusOrMinusExpr ) )
            // InternalCSVs.g:2091:4: (lv_left_0_0= rulePlusOrMinusExpr )
            {
            // InternalCSVs.g:2091:4: (lv_left_0_0= rulePlusOrMinusExpr )
            // InternalCSVs.g:2092:5: lv_left_0_0= rulePlusOrMinusExpr
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

            // InternalCSVs.g:2109:3: ( ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_WS) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=42 && LA16_1<=45)) ) {
                    alt16=1;
                }
            }
            else if ( ((LA16_0>=42 && LA16_0<=45)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCSVs.g:2110:4: ruleLC ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ruleLC ( (lv_right_4_0= rulePlusOrMinusExpr ) )
                    {

                    				newCompositeNode(grammarAccess.getComparaisonExprAccess().getLCParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_39);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:2117:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
                    // InternalCSVs.g:2118:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
                    {
                    // InternalCSVs.g:2118:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
                    // InternalCSVs.g:2119:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
                    {
                    // InternalCSVs.g:2119:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
                    int alt15=4;
                    switch ( input.LA(1) ) {
                    case 42:
                        {
                        alt15=1;
                        }
                        break;
                    case 43:
                        {
                        alt15=2;
                        }
                        break;
                    case 44:
                        {
                        alt15=3;
                        }
                        break;
                    case 45:
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
                            // InternalCSVs.g:2120:7: lv_op_2_1= '>='
                            {
                            lv_op_2_1=(Token)match(input,42,FOLLOW_8); 

                            							newLeafNode(lv_op_2_1, grammarAccess.getComparaisonExprAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparaisonExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCSVs.g:2131:7: lv_op_2_2= '<='
                            {
                            lv_op_2_2=(Token)match(input,43,FOLLOW_8); 

                            							newLeafNode(lv_op_2_2, grammarAccess.getComparaisonExprAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparaisonExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalCSVs.g:2142:7: lv_op_2_3= '>'
                            {
                            lv_op_2_3=(Token)match(input,44,FOLLOW_8); 

                            							newLeafNode(lv_op_2_3, grammarAccess.getComparaisonExprAccess().getOpGreaterThanSignKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getComparaisonExprRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalCSVs.g:2153:7: lv_op_2_4= '<'
                            {
                            lv_op_2_4=(Token)match(input,45,FOLLOW_8); 

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
                    			
                    pushFollow(FOLLOW_8);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:2173:4: ( (lv_right_4_0= rulePlusOrMinusExpr ) )
                    // InternalCSVs.g:2174:5: (lv_right_4_0= rulePlusOrMinusExpr )
                    {
                    // InternalCSVs.g:2174:5: (lv_right_4_0= rulePlusOrMinusExpr )
                    // InternalCSVs.g:2175:6: lv_right_4_0= rulePlusOrMinusExpr
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
    // InternalCSVs.g:2197:1: entryRulePlusOrMinusExpr returns [EObject current=null] : iv_rulePlusOrMinusExpr= rulePlusOrMinusExpr EOF ;
    public final EObject entryRulePlusOrMinusExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinusExpr = null;


        try {
            // InternalCSVs.g:2197:56: (iv_rulePlusOrMinusExpr= rulePlusOrMinusExpr EOF )
            // InternalCSVs.g:2198:2: iv_rulePlusOrMinusExpr= rulePlusOrMinusExpr EOF
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
    // InternalCSVs.g:2204:1: rulePlusOrMinusExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleMulOrDivExpr ) ) ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )* ) ;
    public final EObject rulePlusOrMinusExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2210:2: ( ( ( (lv_left_0_0= ruleMulOrDivExpr ) ) ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )* ) )
            // InternalCSVs.g:2211:2: ( ( (lv_left_0_0= ruleMulOrDivExpr ) ) ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )* )
            {
            // InternalCSVs.g:2211:2: ( ( (lv_left_0_0= ruleMulOrDivExpr ) ) ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )* )
            // InternalCSVs.g:2212:3: ( (lv_left_0_0= ruleMulOrDivExpr ) ) ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )*
            {
            // InternalCSVs.g:2212:3: ( (lv_left_0_0= ruleMulOrDivExpr ) )
            // InternalCSVs.g:2213:4: (lv_left_0_0= ruleMulOrDivExpr )
            {
            // InternalCSVs.g:2213:4: (lv_left_0_0= ruleMulOrDivExpr )
            // InternalCSVs.g:2214:5: lv_left_0_0= ruleMulOrDivExpr
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

            // InternalCSVs.g:2231:3: ( ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    int LA18_1 = input.LA(2);

                    if ( ((LA18_1>=46 && LA18_1<=47)) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>=46 && LA18_0<=47)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCSVs.g:2232:4: ruleLC ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ruleLC ( (lv_right_4_0= ruleMulOrDivExpr ) )
            	    {

            	    				newCompositeNode(grammarAccess.getPlusOrMinusExprAccess().getLCParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_41);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2239:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalCSVs.g:2240:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalCSVs.g:2240:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalCSVs.g:2241:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalCSVs.g:2241:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==46) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==47) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalCSVs.g:2242:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,46,FOLLOW_8); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getPlusOrMinusExprAccess().getOpPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPlusOrMinusExprRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVs.g:2253:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,47,FOLLOW_8); 

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
            	    			
            	    pushFollow(FOLLOW_8);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2273:4: ( (lv_right_4_0= ruleMulOrDivExpr ) )
            	    // InternalCSVs.g:2274:5: (lv_right_4_0= ruleMulOrDivExpr )
            	    {
            	    // InternalCSVs.g:2274:5: (lv_right_4_0= ruleMulOrDivExpr )
            	    // InternalCSVs.g:2275:6: lv_right_4_0= ruleMulOrDivExpr
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
    // InternalCSVs.g:2297:1: entryRuleMulOrDivExpr returns [EObject current=null] : iv_ruleMulOrDivExpr= ruleMulOrDivExpr EOF ;
    public final EObject entryRuleMulOrDivExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDivExpr = null;


        try {
            // InternalCSVs.g:2297:53: (iv_ruleMulOrDivExpr= ruleMulOrDivExpr EOF )
            // InternalCSVs.g:2298:2: iv_ruleMulOrDivExpr= ruleMulOrDivExpr EOF
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
    // InternalCSVs.g:2304:1: ruleMulOrDivExpr returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimaryExpr ) ) ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )* ) ;
    public final EObject ruleMulOrDivExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2310:2: ( ( ( (lv_left_0_0= rulePrimaryExpr ) ) ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )* ) )
            // InternalCSVs.g:2311:2: ( ( (lv_left_0_0= rulePrimaryExpr ) ) ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )* )
            {
            // InternalCSVs.g:2311:2: ( ( (lv_left_0_0= rulePrimaryExpr ) ) ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )* )
            // InternalCSVs.g:2312:3: ( (lv_left_0_0= rulePrimaryExpr ) ) ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )*
            {
            // InternalCSVs.g:2312:3: ( (lv_left_0_0= rulePrimaryExpr ) )
            // InternalCSVs.g:2313:4: (lv_left_0_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:2313:4: (lv_left_0_0= rulePrimaryExpr )
            // InternalCSVs.g:2314:5: lv_left_0_0= rulePrimaryExpr
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

            // InternalCSVs.g:2331:3: ( ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    int LA20_1 = input.LA(2);

                    if ( ((LA20_1>=48 && LA20_1<=50)) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>=48 && LA20_0<=50)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCSVs.g:2332:4: ruleLC ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ruleLC ( (lv_right_4_0= rulePrimaryExpr ) )
            	    {

            	    				newCompositeNode(grammarAccess.getMulOrDivExprAccess().getLCParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_43);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2339:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // InternalCSVs.g:2340:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // InternalCSVs.g:2340:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // InternalCSVs.g:2341:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // InternalCSVs.g:2341:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 50:
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
            	            // InternalCSVs.g:2342:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,48,FOLLOW_8); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivExprAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivExprRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVs.g:2353:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,49,FOLLOW_8); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivExprAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivExprRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalCSVs.g:2364:7: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,50,FOLLOW_8); 

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
            	    			
            	    pushFollow(FOLLOW_8);
            	    ruleLC();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCSVs.g:2384:4: ( (lv_right_4_0= rulePrimaryExpr ) )
            	    // InternalCSVs.g:2385:5: (lv_right_4_0= rulePrimaryExpr )
            	    {
            	    // InternalCSVs.g:2385:5: (lv_right_4_0= rulePrimaryExpr )
            	    // InternalCSVs.g:2386:6: lv_right_4_0= rulePrimaryExpr
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


    // $ANTLR start "entryRuleNotExpr"
    // InternalCSVs.g:2408:1: entryRuleNotExpr returns [EObject current=null] : iv_ruleNotExpr= ruleNotExpr EOF ;
    public final EObject entryRuleNotExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpr = null;


        try {
            // InternalCSVs.g:2408:48: (iv_ruleNotExpr= ruleNotExpr EOF )
            // InternalCSVs.g:2409:2: iv_ruleNotExpr= ruleNotExpr EOF
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
    // InternalCSVs.g:2415:1: ruleNotExpr returns [EObject current=null] : (otherlv_0= '!' ruleLC ( (lv_expr_2_0= rulePrimaryExpr ) ) ) ;
    public final EObject ruleNotExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2421:2: ( (otherlv_0= '!' ruleLC ( (lv_expr_2_0= rulePrimaryExpr ) ) ) )
            // InternalCSVs.g:2422:2: (otherlv_0= '!' ruleLC ( (lv_expr_2_0= rulePrimaryExpr ) ) )
            {
            // InternalCSVs.g:2422:2: (otherlv_0= '!' ruleLC ( (lv_expr_2_0= rulePrimaryExpr ) ) )
            // InternalCSVs.g:2423:3: otherlv_0= '!' ruleLC ( (lv_expr_2_0= rulePrimaryExpr ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNotExprAccess().getExclamationMarkKeyword_0());
            		

            			newCompositeNode(grammarAccess.getNotExprAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2434:3: ( (lv_expr_2_0= rulePrimaryExpr ) )
            // InternalCSVs.g:2435:4: (lv_expr_2_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:2435:4: (lv_expr_2_0= rulePrimaryExpr )
            // InternalCSVs.g:2436:5: lv_expr_2_0= rulePrimaryExpr
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


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalCSVs.g:2457:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalCSVs.g:2457:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalCSVs.g:2458:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
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
    // InternalCSVs.g:2464:1: rulePrimaryExpr returns [EObject current=null] : ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | this_NotExpr_5= ruleNotExpr | this_CsvsExpr_6= ruleCsvsExpr ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_Expression_2 = null;

        EObject this_NotExpr_5 = null;

        EObject this_CsvsExpr_6 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2470:2: ( ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | this_NotExpr_5= ruleNotExpr | this_CsvsExpr_6= ruleCsvsExpr ) )
            // InternalCSVs.g:2471:2: ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | this_NotExpr_5= ruleNotExpr | this_CsvsExpr_6= ruleCsvsExpr )
            {
            // InternalCSVs.g:2471:2: ( (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' ) | this_NotExpr_5= ruleNotExpr | this_CsvsExpr_6= ruleCsvsExpr )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt21=1;
                }
                break;
            case 51:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
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
                    // InternalCSVs.g:2472:3: (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' )
                    {
                    // InternalCSVs.g:2472:3: (otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')' )
                    // InternalCSVs.g:2473:4: otherlv_0= '(' ruleLC this_Expression_2= ruleExpression ruleLC otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExprAccess().getLCParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExprAccess().getExpressionParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_28);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExprAccess().getLCParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_29);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVs.g:2505:3: this_NotExpr_5= ruleNotExpr
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
                    // InternalCSVs.g:2514:3: this_CsvsExpr_6= ruleCsvsExpr
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExprAccess().getCsvsExprParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CsvsExpr_6=ruleCsvsExpr();

                    state._fsp--;


                    			current = this_CsvsExpr_6;
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


    // $ANTLR start "entryRuleCsvsExpr"
    // InternalCSVs.g:2526:1: entryRuleCsvsExpr returns [EObject current=null] : iv_ruleCsvsExpr= ruleCsvsExpr EOF ;
    public final EObject entryRuleCsvsExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvsExpr = null;


        try {
            // InternalCSVs.g:2526:49: (iv_ruleCsvsExpr= ruleCsvsExpr EOF )
            // InternalCSVs.g:2527:2: iv_ruleCsvsExpr= ruleCsvsExpr EOF
            {
             newCompositeNode(grammarAccess.getCsvsExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCsvsExpr=ruleCsvsExpr();

            state._fsp--;

             current =iv_ruleCsvsExpr; 
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
    // $ANTLR end "entryRuleCsvsExpr"


    // $ANTLR start "ruleCsvsExpr"
    // InternalCSVs.g:2533:1: ruleCsvsExpr returns [EObject current=null] : (this_AtomicExpr_0= ruleAtomicExpr | this_Selector_1= ruleSelector | this_CountExpr_2= ruleCountExpr | this_FieldSelect_3= ruleFieldSelect | this_LastExpr_4= ruleLastExpr ) ;
    public final EObject ruleCsvsExpr() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpr_0 = null;

        EObject this_Selector_1 = null;

        EObject this_CountExpr_2 = null;

        EObject this_FieldSelect_3 = null;

        EObject this_LastExpr_4 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2539:2: ( (this_AtomicExpr_0= ruleAtomicExpr | this_Selector_1= ruleSelector | this_CountExpr_2= ruleCountExpr | this_FieldSelect_3= ruleFieldSelect | this_LastExpr_4= ruleLastExpr ) )
            // InternalCSVs.g:2540:2: (this_AtomicExpr_0= ruleAtomicExpr | this_Selector_1= ruleSelector | this_CountExpr_2= ruleCountExpr | this_FieldSelect_3= ruleFieldSelect | this_LastExpr_4= ruleLastExpr )
            {
            // InternalCSVs.g:2540:2: (this_AtomicExpr_0= ruleAtomicExpr | this_Selector_1= ruleSelector | this_CountExpr_2= ruleCountExpr | this_FieldSelect_3= ruleFieldSelect | this_LastExpr_4= ruleLastExpr )
            int alt22=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 57:
            case 58:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case RULE_WS:
                    {
                    int LA22_6 = input.LA(3);

                    if ( ((LA22_6>=RULE_WS && LA22_6<=RULE_STRING)||(LA22_6>=RULE_INT && LA22_6<=RULE_DOUBLE)||(LA22_6>=12 && LA22_6<=13)||LA22_6==22||LA22_6==29||(LA22_6>=31 && LA22_6<=34)||LA22_6==36||(LA22_6>=38 && LA22_6<=51)||(LA22_6>=53 && LA22_6<=58)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_6==52) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case RULE_DOUBLE:
                case 12:
                case 13:
                case 22:
                case 29:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                    {
                    alt22=1;
                    }
                    break;
                case 52:
                    {
                    alt22=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }

                }
                break;
            case 55:
                {
                alt22=3;
                }
                break;
            case 54:
                {
                alt22=4;
                }
                break;
            case 56:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalCSVs.g:2541:3: this_AtomicExpr_0= ruleAtomicExpr
                    {

                    			newCompositeNode(grammarAccess.getCsvsExprAccess().getAtomicExprParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicExpr_0=ruleAtomicExpr();

                    state._fsp--;


                    			current = this_AtomicExpr_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:2550:3: this_Selector_1= ruleSelector
                    {

                    			newCompositeNode(grammarAccess.getCsvsExprAccess().getSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selector_1=ruleSelector();

                    state._fsp--;


                    			current = this_Selector_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCSVs.g:2559:3: this_CountExpr_2= ruleCountExpr
                    {

                    			newCompositeNode(grammarAccess.getCsvsExprAccess().getCountExprParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountExpr_2=ruleCountExpr();

                    state._fsp--;


                    			current = this_CountExpr_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCSVs.g:2568:3: this_FieldSelect_3= ruleFieldSelect
                    {

                    			newCompositeNode(grammarAccess.getCsvsExprAccess().getFieldSelectParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldSelect_3=ruleFieldSelect();

                    state._fsp--;


                    			current = this_FieldSelect_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCSVs.g:2577:3: this_LastExpr_4= ruleLastExpr
                    {

                    			newCompositeNode(grammarAccess.getCsvsExprAccess().getLastExprParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LastExpr_4=ruleLastExpr();

                    state._fsp--;


                    			current = this_LastExpr_4;
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
    // $ANTLR end "ruleCsvsExpr"


    // $ANTLR start "entryRuleSelector"
    // InternalCSVs.g:2589:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalCSVs.g:2589:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalCSVs.g:2590:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalCSVs.g:2596:1: ruleSelector returns [EObject current=null] : ( ( (lv_var_0_0= RULE_ID ) ) ruleLC otherlv_2= '[' ruleLC ( (lv_expressionCol_4_0= ruleCsvsExpr ) )? ruleLC otherlv_6= ':' ruleLC ( (lv_expressionRow_8_0= ruleCsvsExpr ) )? ruleLC otherlv_10= ']' ( ruleLC otherlv_12= '[' ( (lv_expressionSubCol_13_0= ruleCsvsExpr ) )? ruleLC otherlv_15= ':' ruleLC ( (lv_expressionSubRow_17_0= ruleCsvsExpr ) ) ruleLC otherlv_19= ']' )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        EObject lv_expressionCol_4_0 = null;

        EObject lv_expressionRow_8_0 = null;

        EObject lv_expressionSubCol_13_0 = null;

        EObject lv_expressionSubRow_17_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2602:2: ( ( ( (lv_var_0_0= RULE_ID ) ) ruleLC otherlv_2= '[' ruleLC ( (lv_expressionCol_4_0= ruleCsvsExpr ) )? ruleLC otherlv_6= ':' ruleLC ( (lv_expressionRow_8_0= ruleCsvsExpr ) )? ruleLC otherlv_10= ']' ( ruleLC otherlv_12= '[' ( (lv_expressionSubCol_13_0= ruleCsvsExpr ) )? ruleLC otherlv_15= ':' ruleLC ( (lv_expressionSubRow_17_0= ruleCsvsExpr ) ) ruleLC otherlv_19= ']' )? ) )
            // InternalCSVs.g:2603:2: ( ( (lv_var_0_0= RULE_ID ) ) ruleLC otherlv_2= '[' ruleLC ( (lv_expressionCol_4_0= ruleCsvsExpr ) )? ruleLC otherlv_6= ':' ruleLC ( (lv_expressionRow_8_0= ruleCsvsExpr ) )? ruleLC otherlv_10= ']' ( ruleLC otherlv_12= '[' ( (lv_expressionSubCol_13_0= ruleCsvsExpr ) )? ruleLC otherlv_15= ':' ruleLC ( (lv_expressionSubRow_17_0= ruleCsvsExpr ) ) ruleLC otherlv_19= ']' )? )
            {
            // InternalCSVs.g:2603:2: ( ( (lv_var_0_0= RULE_ID ) ) ruleLC otherlv_2= '[' ruleLC ( (lv_expressionCol_4_0= ruleCsvsExpr ) )? ruleLC otherlv_6= ':' ruleLC ( (lv_expressionRow_8_0= ruleCsvsExpr ) )? ruleLC otherlv_10= ']' ( ruleLC otherlv_12= '[' ( (lv_expressionSubCol_13_0= ruleCsvsExpr ) )? ruleLC otherlv_15= ':' ruleLC ( (lv_expressionSubRow_17_0= ruleCsvsExpr ) ) ruleLC otherlv_19= ']' )? )
            // InternalCSVs.g:2604:3: ( (lv_var_0_0= RULE_ID ) ) ruleLC otherlv_2= '[' ruleLC ( (lv_expressionCol_4_0= ruleCsvsExpr ) )? ruleLC otherlv_6= ':' ruleLC ( (lv_expressionRow_8_0= ruleCsvsExpr ) )? ruleLC otherlv_10= ']' ( ruleLC otherlv_12= '[' ( (lv_expressionSubCol_13_0= ruleCsvsExpr ) )? ruleLC otherlv_15= ':' ruleLC ( (lv_expressionSubRow_17_0= ruleCsvsExpr ) ) ruleLC otherlv_19= ']' )?
            {
            // InternalCSVs.g:2604:3: ( (lv_var_0_0= RULE_ID ) )
            // InternalCSVs.g:2605:4: (lv_var_0_0= RULE_ID )
            {
            // InternalCSVs.g:2605:4: (lv_var_0_0= RULE_ID )
            // InternalCSVs.g:2606:5: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(lv_var_0_0, grammarAccess.getSelectorAccess().getVarIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getSelectorAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_45);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,52,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_2());
            		

            			newCompositeNode(grammarAccess.getSelectorAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_46);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2640:3: ( (lv_expressionCol_4_0= ruleCsvsExpr ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||(LA23_0>=RULE_INT && LA23_0<=RULE_DOUBLE)||(LA23_0>=54 && LA23_0<=58)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCSVs.g:2641:4: (lv_expressionCol_4_0= ruleCsvsExpr )
                    {
                    // InternalCSVs.g:2641:4: (lv_expressionCol_4_0= ruleCsvsExpr )
                    // InternalCSVs.g:2642:5: lv_expressionCol_4_0= ruleCsvsExpr
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getExpressionColCsvsExprParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_expressionCol_4_0=ruleCsvsExpr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectorRule());
                    					}
                    					set(
                    						current,
                    						"expressionCol",
                    						lv_expressionCol_4_0,
                    						"com.agicquel.csvs.CSVs.CsvsExpr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getSelectorAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_24);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,29,FOLLOW_47); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectorAccess().getColonKeyword_6());
            		

            			newCompositeNode(grammarAccess.getSelectorAccess().getLCParserRuleCall_7());
            		
            pushFollow(FOLLOW_47);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2677:3: ( (lv_expressionRow_8_0= ruleCsvsExpr ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||(LA24_0>=RULE_INT && LA24_0<=RULE_DOUBLE)||(LA24_0>=54 && LA24_0<=58)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCSVs.g:2678:4: (lv_expressionRow_8_0= ruleCsvsExpr )
                    {
                    // InternalCSVs.g:2678:4: (lv_expressionRow_8_0= ruleCsvsExpr )
                    // InternalCSVs.g:2679:5: lv_expressionRow_8_0= ruleCsvsExpr
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getExpressionRowCsvsExprParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_48);
                    lv_expressionRow_8_0=ruleCsvsExpr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectorRule());
                    					}
                    					set(
                    						current,
                    						"expressionRow",
                    						lv_expressionRow_8_0,
                    						"com.agicquel.csvs.CSVs.CsvsExpr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getSelectorAccess().getLCParserRuleCall_9());
            		
            pushFollow(FOLLOW_49);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_10=(Token)match(input,53,FOLLOW_50); 

            			newLeafNode(otherlv_10, grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_10());
            		
            // InternalCSVs.g:2707:3: ( ruleLC otherlv_12= '[' ( (lv_expressionSubCol_13_0= ruleCsvsExpr ) )? ruleLC otherlv_15= ':' ruleLC ( (lv_expressionSubRow_17_0= ruleCsvsExpr ) ) ruleLC otherlv_19= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_WS) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==52) ) {
                    alt26=1;
                }
            }
            else if ( (LA26_0==52) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCSVs.g:2708:4: ruleLC otherlv_12= '[' ( (lv_expressionSubCol_13_0= ruleCsvsExpr ) )? ruleLC otherlv_15= ':' ruleLC ( (lv_expressionSubRow_17_0= ruleCsvsExpr ) ) ruleLC otherlv_19= ']'
                    {

                    				newCompositeNode(grammarAccess.getSelectorAccess().getLCParserRuleCall_11_0());
                    			
                    pushFollow(FOLLOW_45);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_12=(Token)match(input,52,FOLLOW_46); 

                    				newLeafNode(otherlv_12, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_11_1());
                    			
                    // InternalCSVs.g:2719:4: ( (lv_expressionSubCol_13_0= ruleCsvsExpr ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||(LA25_0>=RULE_INT && LA25_0<=RULE_DOUBLE)||(LA25_0>=54 && LA25_0<=58)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalCSVs.g:2720:5: (lv_expressionSubCol_13_0= ruleCsvsExpr )
                            {
                            // InternalCSVs.g:2720:5: (lv_expressionSubCol_13_0= ruleCsvsExpr )
                            // InternalCSVs.g:2721:6: lv_expressionSubCol_13_0= ruleCsvsExpr
                            {

                            						newCompositeNode(grammarAccess.getSelectorAccess().getExpressionSubColCsvsExprParserRuleCall_11_2_0());
                            					
                            pushFollow(FOLLOW_23);
                            lv_expressionSubCol_13_0=ruleCsvsExpr();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSelectorRule());
                            						}
                            						set(
                            							current,
                            							"expressionSubCol",
                            							lv_expressionSubCol_13_0,
                            							"com.agicquel.csvs.CSVs.CsvsExpr");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getSelectorAccess().getLCParserRuleCall_11_3());
                    			
                    pushFollow(FOLLOW_24);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_15=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getSelectorAccess().getColonKeyword_11_4());
                    			

                    				newCompositeNode(grammarAccess.getSelectorAccess().getLCParserRuleCall_11_5());
                    			
                    pushFollow(FOLLOW_20);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalCSVs.g:2756:4: ( (lv_expressionSubRow_17_0= ruleCsvsExpr ) )
                    // InternalCSVs.g:2757:5: (lv_expressionSubRow_17_0= ruleCsvsExpr )
                    {
                    // InternalCSVs.g:2757:5: (lv_expressionSubRow_17_0= ruleCsvsExpr )
                    // InternalCSVs.g:2758:6: lv_expressionSubRow_17_0= ruleCsvsExpr
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getExpressionSubRowCsvsExprParserRuleCall_11_6_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_expressionSubRow_17_0=ruleCsvsExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"expressionSubRow",
                    							lv_expressionSubRow_17_0,
                    							"com.agicquel.csvs.CSVs.CsvsExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    				newCompositeNode(grammarAccess.getSelectorAccess().getLCParserRuleCall_11_7());
                    			
                    pushFollow(FOLLOW_49);
                    ruleLC();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_19=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_11_8());
                    			

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleFieldSelect"
    // InternalCSVs.g:2791:1: entryRuleFieldSelect returns [EObject current=null] : iv_ruleFieldSelect= ruleFieldSelect EOF ;
    public final EObject entryRuleFieldSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelect = null;


        try {
            // InternalCSVs.g:2791:52: (iv_ruleFieldSelect= ruleFieldSelect EOF )
            // InternalCSVs.g:2792:2: iv_ruleFieldSelect= ruleFieldSelect EOF
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
    // InternalCSVs.g:2798:1: ruleFieldSelect returns [EObject current=null] : (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '[' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ']' ) ;
    public final EObject ruleFieldSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_2_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2804:2: ( (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '[' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ']' ) )
            // InternalCSVs.g:2805:2: (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '[' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ']' )
            {
            // InternalCSVs.g:2805:2: (otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '[' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ']' )
            // InternalCSVs.g:2806:3: otherlv_0= 'field' ruleLC ( (lv_var_2_0= RULE_ID ) ) ruleLC otherlv_4= '[' ruleLC ( (lv_expression_6_0= rulePrimaryExpr ) ) ruleLC otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldSelectAccess().getFieldKeyword_0());
            		

            			newCompositeNode(grammarAccess.getFieldSelectAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2817:3: ( (lv_var_2_0= RULE_ID ) )
            // InternalCSVs.g:2818:4: (lv_var_2_0= RULE_ID )
            {
            // InternalCSVs.g:2818:4: (lv_var_2_0= RULE_ID )
            // InternalCSVs.g:2819:5: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_44); 

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
            		
            pushFollow(FOLLOW_45);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldSelectAccess().getLeftSquareBracketKeyword_4());
            		

            			newCompositeNode(grammarAccess.getFieldSelectAccess().getLCParserRuleCall_5());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2853:3: ( (lv_expression_6_0= rulePrimaryExpr ) )
            // InternalCSVs.g:2854:4: (lv_expression_6_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:2854:4: (lv_expression_6_0= rulePrimaryExpr )
            // InternalCSVs.g:2855:5: lv_expression_6_0= rulePrimaryExpr
            {

            					newCompositeNode(grammarAccess.getFieldSelectAccess().getExpressionPrimaryExprParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_48);
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
            		
            pushFollow(FOLLOW_49);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,53,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFieldSelectAccess().getRightSquareBracketKeyword_8());
            		

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
    // InternalCSVs.g:2887:1: entryRuleCountExpr returns [EObject current=null] : iv_ruleCountExpr= ruleCountExpr EOF ;
    public final EObject entryRuleCountExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountExpr = null;


        try {
            // InternalCSVs.g:2887:50: (iv_ruleCountExpr= ruleCountExpr EOF )
            // InternalCSVs.g:2888:2: iv_ruleCountExpr= ruleCountExpr EOF
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
    // InternalCSVs.g:2894:1: ruleCountExpr returns [EObject current=null] : (otherlv_0= 'count' ruleLC ( (lv_expression_2_0= rulePrimaryExpr ) ) ) ;
    public final EObject ruleCountExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2900:2: ( (otherlv_0= 'count' ruleLC ( (lv_expression_2_0= rulePrimaryExpr ) ) ) )
            // InternalCSVs.g:2901:2: (otherlv_0= 'count' ruleLC ( (lv_expression_2_0= rulePrimaryExpr ) ) )
            {
            // InternalCSVs.g:2901:2: (otherlv_0= 'count' ruleLC ( (lv_expression_2_0= rulePrimaryExpr ) ) )
            // InternalCSVs.g:2902:3: otherlv_0= 'count' ruleLC ( (lv_expression_2_0= rulePrimaryExpr ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCountExprAccess().getCountKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCountExprAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2913:3: ( (lv_expression_2_0= rulePrimaryExpr ) )
            // InternalCSVs.g:2914:4: (lv_expression_2_0= rulePrimaryExpr )
            {
            // InternalCSVs.g:2914:4: (lv_expression_2_0= rulePrimaryExpr )
            // InternalCSVs.g:2915:5: lv_expression_2_0= rulePrimaryExpr
            {

            					newCompositeNode(grammarAccess.getCountExprAccess().getExpressionPrimaryExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=rulePrimaryExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountExprRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
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
    // $ANTLR end "ruleCountExpr"


    // $ANTLR start "entryRuleLastExpr"
    // InternalCSVs.g:2936:1: entryRuleLastExpr returns [EObject current=null] : iv_ruleLastExpr= ruleLastExpr EOF ;
    public final EObject entryRuleLastExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLastExpr = null;


        try {
            // InternalCSVs.g:2936:49: (iv_ruleLastExpr= ruleLastExpr EOF )
            // InternalCSVs.g:2937:2: iv_ruleLastExpr= ruleLastExpr EOF
            {
             newCompositeNode(grammarAccess.getLastExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLastExpr=ruleLastExpr();

            state._fsp--;

             current =iv_ruleLastExpr; 
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
    // $ANTLR end "entryRuleLastExpr"


    // $ANTLR start "ruleLastExpr"
    // InternalCSVs.g:2943:1: ruleLastExpr returns [EObject current=null] : (otherlv_0= 'last' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleCsvsExpr ) ) ) ;
    public final EObject ruleLastExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalCSVs.g:2949:2: ( (otherlv_0= 'last' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleCsvsExpr ) ) ) )
            // InternalCSVs.g:2950:2: (otherlv_0= 'last' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleCsvsExpr ) ) )
            {
            // InternalCSVs.g:2950:2: (otherlv_0= 'last' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleCsvsExpr ) ) )
            // InternalCSVs.g:2951:3: otherlv_0= 'last' ruleLC ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) ) ruleLC ( (lv_expression_4_0= ruleCsvsExpr ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getLastExprAccess().getLastKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLastExprAccess().getLCParserRuleCall_1());
            		
            pushFollow(FOLLOW_22);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2962:3: ( ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) ) )
            // InternalCSVs.g:2963:4: ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) )
            {
            // InternalCSVs.g:2963:4: ( (lv_op_2_1= 'row' | lv_op_2_2= 'col' ) )
            // InternalCSVs.g:2964:5: (lv_op_2_1= 'row' | lv_op_2_2= 'col' )
            {
            // InternalCSVs.g:2964:5: (lv_op_2_1= 'row' | lv_op_2_2= 'col' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            else if ( (LA27_0==27) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCSVs.g:2965:6: lv_op_2_1= 'row'
                    {
                    lv_op_2_1=(Token)match(input,26,FOLLOW_19); 

                    						newLeafNode(lv_op_2_1, grammarAccess.getLastExprAccess().getOpRowKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLastExprRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCSVs.g:2976:6: lv_op_2_2= 'col'
                    {
                    lv_op_2_2=(Token)match(input,27,FOLLOW_19); 

                    						newLeafNode(lv_op_2_2, grammarAccess.getLastExprAccess().getOpColKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLastExprRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            			newCompositeNode(grammarAccess.getLastExprAccess().getLCParserRuleCall_3());
            		
            pushFollow(FOLLOW_20);
            ruleLC();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCSVs.g:2996:3: ( (lv_expression_4_0= ruleCsvsExpr ) )
            // InternalCSVs.g:2997:4: (lv_expression_4_0= ruleCsvsExpr )
            {
            // InternalCSVs.g:2997:4: (lv_expression_4_0= ruleCsvsExpr )
            // InternalCSVs.g:2998:5: lv_expression_4_0= ruleCsvsExpr
            {

            					newCompositeNode(grammarAccess.getLastExprAccess().getExpressionCsvsExprParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_4_0=ruleCsvsExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLastExprRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"com.agicquel.csvs.CSVs.CsvsExpr");
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
    // $ANTLR end "ruleLastExpr"


    // $ANTLR start "entryRuleAtomicExpr"
    // InternalCSVs.g:3019:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // InternalCSVs.g:3019:51: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // InternalCSVs.g:3020:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
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
    // InternalCSVs.g:3026:1: ruleAtomicExpr returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( (lv_value_9_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_1=null;
        Token lv_value_7_2=null;
        Token lv_value_9_0=null;


        	enterRule();

        try {
            // InternalCSVs.g:3032:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( (lv_value_9_0= RULE_ID ) ) ) ) )
            // InternalCSVs.g:3033:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( (lv_value_9_0= RULE_ID ) ) ) )
            {
            // InternalCSVs.g:3033:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( (lv_value_9_0= RULE_ID ) ) ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt29=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt29=2;
                }
                break;
            case RULE_STRING:
                {
                alt29=3;
                }
                break;
            case 57:
            case 58:
                {
                alt29=4;
                }
                break;
            case RULE_ID:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalCSVs.g:3034:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalCSVs.g:3034:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalCSVs.g:3035:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalCSVs.g:3035:4: ()
                    // InternalCSVs.g:3036:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExprAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:3042:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalCSVs.g:3043:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalCSVs.g:3043:5: (lv_value_1_0= RULE_INT )
                    // InternalCSVs.g:3044:6: lv_value_1_0= RULE_INT
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
                    // InternalCSVs.g:3062:3: ( () ( (lv_value_3_0= RULE_DOUBLE ) ) )
                    {
                    // InternalCSVs.g:3062:3: ( () ( (lv_value_3_0= RULE_DOUBLE ) ) )
                    // InternalCSVs.g:3063:4: () ( (lv_value_3_0= RULE_DOUBLE ) )
                    {
                    // InternalCSVs.g:3063:4: ()
                    // InternalCSVs.g:3064:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExprAccess().getDoubleConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:3070:4: ( (lv_value_3_0= RULE_DOUBLE ) )
                    // InternalCSVs.g:3071:5: (lv_value_3_0= RULE_DOUBLE )
                    {
                    // InternalCSVs.g:3071:5: (lv_value_3_0= RULE_DOUBLE )
                    // InternalCSVs.g:3072:6: lv_value_3_0= RULE_DOUBLE
                    {
                    lv_value_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicExprAccess().getValueDOUBLETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExprRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"com.agicquel.csvs.CSVs.DOUBLE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCSVs.g:3090:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalCSVs.g:3090:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalCSVs.g:3091:4: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalCSVs.g:3091:4: ()
                    // InternalCSVs.g:3092:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExprAccess().getStringConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:3098:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalCSVs.g:3099:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalCSVs.g:3099:5: (lv_value_5_0= RULE_STRING )
                    // InternalCSVs.g:3100:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getAtomicExprAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExprRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCSVs.g:3118:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    {
                    // InternalCSVs.g:3118:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    // InternalCSVs.g:3119:4: () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    {
                    // InternalCSVs.g:3119:4: ()
                    // InternalCSVs.g:3120:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExprAccess().getBoolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:3126:4: ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    // InternalCSVs.g:3127:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    {
                    // InternalCSVs.g:3127:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    // InternalCSVs.g:3128:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    {
                    // InternalCSVs.g:3128:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==57) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==58) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalCSVs.g:3129:7: lv_value_7_1= 'true'
                            {
                            lv_value_7_1=(Token)match(input,57,FOLLOW_2); 

                            							newLeafNode(lv_value_7_1, grammarAccess.getAtomicExprAccess().getValueTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicExprRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCSVs.g:3140:7: lv_value_7_2= 'false'
                            {
                            lv_value_7_2=(Token)match(input,58,FOLLOW_2); 

                            							newLeafNode(lv_value_7_2, grammarAccess.getAtomicExprAccess().getValueFalseKeyword_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicExprRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_7_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCSVs.g:3155:3: ( () ( (lv_value_9_0= RULE_ID ) ) )
                    {
                    // InternalCSVs.g:3155:3: ( () ( (lv_value_9_0= RULE_ID ) ) )
                    // InternalCSVs.g:3156:4: () ( (lv_value_9_0= RULE_ID ) )
                    {
                    // InternalCSVs.g:3156:4: ()
                    // InternalCSVs.g:3157:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExprAccess().getVariableConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalCSVs.g:3163:4: ( (lv_value_9_0= RULE_ID ) )
                    // InternalCSVs.g:3164:5: (lv_value_9_0= RULE_ID )
                    {
                    // InternalCSVs.g:3164:5: (lv_value_9_0= RULE_ID )
                    // InternalCSVs.g:3165:6: lv_value_9_0= RULE_ID
                    {
                    lv_value_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_9_0, grammarAccess.getAtomicExprAccess().getValueIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExprRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x07C0002853BD87F0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x07C0002853BDC7F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x07C8000100000670L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x07C0000000000670L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x07C0000000000660L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000480000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000012L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000030000000012L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00003C0000000012L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000C00000000012L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0007000000000012L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x07C0000020000670L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x07E0000000000670L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000012L});

}