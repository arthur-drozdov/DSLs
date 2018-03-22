package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PAPER'", "'TURTLE'", "'PENSTATE'", "'UP'", "'DOWN'", "'PENCOLOUR'", "'MOVE'", "'RIGHT'", "'LEFT'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PROGRAM";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePROGRAM"
    // InternalMyDsl.g:64:1: entryRulePROGRAM returns [EObject current=null] : iv_rulePROGRAM= rulePROGRAM EOF ;
    public final EObject entryRulePROGRAM() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePROGRAM = null;


        try {
            // InternalMyDsl.g:64:48: (iv_rulePROGRAM= rulePROGRAM EOF )
            // InternalMyDsl.g:65:2: iv_rulePROGRAM= rulePROGRAM EOF
            {
             newCompositeNode(grammarAccess.getPROGRAMRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePROGRAM=rulePROGRAM();

            state._fsp--;

             current =iv_rulePROGRAM; 
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
    // $ANTLR end "entryRulePROGRAM"


    // $ANTLR start "rulePROGRAM"
    // InternalMyDsl.g:71:1: rulePROGRAM returns [EObject current=null] : ( (lv_commands_0_0= ruleCMD ) )* ;
    public final EObject rulePROGRAM() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_commands_0_0= ruleCMD ) )* )
            // InternalMyDsl.g:78:2: ( (lv_commands_0_0= ruleCMD ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_commands_0_0= ruleCMD ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)||(LA1_0>=16 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_commands_0_0= ruleCMD )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_commands_0_0= ruleCMD )
            	    // InternalMyDsl.g:80:4: lv_commands_0_0= ruleCMD
            	    {

            	    				newCompositeNode(grammarAccess.getPROGRAMAccess().getCommandsCMDParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCMD();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPROGRAMRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.CMD");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "rulePROGRAM"


    // $ANTLR start "entryRuleCMD"
    // InternalMyDsl.g:100:1: entryRuleCMD returns [EObject current=null] : iv_ruleCMD= ruleCMD EOF ;
    public final EObject entryRuleCMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMD = null;


        try {
            // InternalMyDsl.g:100:44: (iv_ruleCMD= ruleCMD EOF )
            // InternalMyDsl.g:101:2: iv_ruleCMD= ruleCMD EOF
            {
             newCompositeNode(grammarAccess.getCMDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCMD=ruleCMD();

            state._fsp--;

             current =iv_ruleCMD; 
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
    // $ANTLR end "entryRuleCMD"


    // $ANTLR start "ruleCMD"
    // InternalMyDsl.g:107:1: ruleCMD returns [EObject current=null] : (this_PAPER_0= rulePAPER | this_TURTLE_1= ruleTURTLE | this_PENSTATE_2= rulePENSTATE | this_PENCOLOUR_3= rulePENCOLOUR | this_MOVE_4= ruleMOVE | this_RIGHT_5= ruleRIGHT | this_LEFT_6= ruleLEFT ) ;
    public final EObject ruleCMD() throws RecognitionException {
        EObject current = null;

        EObject this_PAPER_0 = null;

        EObject this_TURTLE_1 = null;

        EObject this_PENSTATE_2 = null;

        EObject this_PENCOLOUR_3 = null;

        EObject this_MOVE_4 = null;

        EObject this_RIGHT_5 = null;

        EObject this_LEFT_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_PAPER_0= rulePAPER | this_TURTLE_1= ruleTURTLE | this_PENSTATE_2= rulePENSTATE | this_PENCOLOUR_3= rulePENCOLOUR | this_MOVE_4= ruleMOVE | this_RIGHT_5= ruleRIGHT | this_LEFT_6= ruleLEFT ) )
            // InternalMyDsl.g:114:2: (this_PAPER_0= rulePAPER | this_TURTLE_1= ruleTURTLE | this_PENSTATE_2= rulePENSTATE | this_PENCOLOUR_3= rulePENCOLOUR | this_MOVE_4= ruleMOVE | this_RIGHT_5= ruleRIGHT | this_LEFT_6= ruleLEFT )
            {
            // InternalMyDsl.g:114:2: (this_PAPER_0= rulePAPER | this_TURTLE_1= ruleTURTLE | this_PENSTATE_2= rulePENSTATE | this_PENCOLOUR_3= rulePENCOLOUR | this_MOVE_4= ruleMOVE | this_RIGHT_5= ruleRIGHT | this_LEFT_6= ruleLEFT )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            case 19:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_PAPER_0= rulePAPER
                    {

                    			newCompositeNode(grammarAccess.getCMDAccess().getPAPERParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAPER_0=rulePAPER();

                    state._fsp--;


                    			current = this_PAPER_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_TURTLE_1= ruleTURTLE
                    {

                    			newCompositeNode(grammarAccess.getCMDAccess().getTURTLEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TURTLE_1=ruleTURTLE();

                    state._fsp--;


                    			current = this_TURTLE_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:133:3: this_PENSTATE_2= rulePENSTATE
                    {

                    			newCompositeNode(grammarAccess.getCMDAccess().getPENSTATEParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PENSTATE_2=rulePENSTATE();

                    state._fsp--;


                    			current = this_PENSTATE_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:142:3: this_PENCOLOUR_3= rulePENCOLOUR
                    {

                    			newCompositeNode(grammarAccess.getCMDAccess().getPENCOLOURParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PENCOLOUR_3=rulePENCOLOUR();

                    state._fsp--;


                    			current = this_PENCOLOUR_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:151:3: this_MOVE_4= ruleMOVE
                    {

                    			newCompositeNode(grammarAccess.getCMDAccess().getMOVEParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MOVE_4=ruleMOVE();

                    state._fsp--;


                    			current = this_MOVE_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:160:3: this_RIGHT_5= ruleRIGHT
                    {

                    			newCompositeNode(grammarAccess.getCMDAccess().getRIGHTParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RIGHT_5=ruleRIGHT();

                    state._fsp--;


                    			current = this_RIGHT_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:169:3: this_LEFT_6= ruleLEFT
                    {

                    			newCompositeNode(grammarAccess.getCMDAccess().getLEFTParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LEFT_6=ruleLEFT();

                    state._fsp--;


                    			current = this_LEFT_6;
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
    // $ANTLR end "ruleCMD"


    // $ANTLR start "entryRulePAPER"
    // InternalMyDsl.g:181:1: entryRulePAPER returns [EObject current=null] : iv_rulePAPER= rulePAPER EOF ;
    public final EObject entryRulePAPER() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAPER = null;


        try {
            // InternalMyDsl.g:181:46: (iv_rulePAPER= rulePAPER EOF )
            // InternalMyDsl.g:182:2: iv_rulePAPER= rulePAPER EOF
            {
             newCompositeNode(grammarAccess.getPAPERRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAPER=rulePAPER();

            state._fsp--;

             current =iv_rulePAPER; 
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
    // $ANTLR end "entryRulePAPER"


    // $ANTLR start "rulePAPER"
    // InternalMyDsl.g:188:1: rulePAPER returns [EObject current=null] : (otherlv_0= 'PAPER' ( (lv_sizeX_1_0= RULE_INT ) ) ( (lv_sizeY_2_0= RULE_INT ) ) ( (lv_paperColour_3_0= RULE_STRING ) ) ) ;
    public final EObject rulePAPER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sizeX_1_0=null;
        Token lv_sizeY_2_0=null;
        Token lv_paperColour_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:194:2: ( (otherlv_0= 'PAPER' ( (lv_sizeX_1_0= RULE_INT ) ) ( (lv_sizeY_2_0= RULE_INT ) ) ( (lv_paperColour_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:195:2: (otherlv_0= 'PAPER' ( (lv_sizeX_1_0= RULE_INT ) ) ( (lv_sizeY_2_0= RULE_INT ) ) ( (lv_paperColour_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:195:2: (otherlv_0= 'PAPER' ( (lv_sizeX_1_0= RULE_INT ) ) ( (lv_sizeY_2_0= RULE_INT ) ) ( (lv_paperColour_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:196:3: otherlv_0= 'PAPER' ( (lv_sizeX_1_0= RULE_INT ) ) ( (lv_sizeY_2_0= RULE_INT ) ) ( (lv_paperColour_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPAPERAccess().getPAPERKeyword_0());
            		
            // InternalMyDsl.g:200:3: ( (lv_sizeX_1_0= RULE_INT ) )
            // InternalMyDsl.g:201:4: (lv_sizeX_1_0= RULE_INT )
            {
            // InternalMyDsl.g:201:4: (lv_sizeX_1_0= RULE_INT )
            // InternalMyDsl.g:202:5: lv_sizeX_1_0= RULE_INT
            {
            lv_sizeX_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_sizeX_1_0, grammarAccess.getPAPERAccess().getSizeXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPAPERRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sizeX",
            						lv_sizeX_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:218:3: ( (lv_sizeY_2_0= RULE_INT ) )
            // InternalMyDsl.g:219:4: (lv_sizeY_2_0= RULE_INT )
            {
            // InternalMyDsl.g:219:4: (lv_sizeY_2_0= RULE_INT )
            // InternalMyDsl.g:220:5: lv_sizeY_2_0= RULE_INT
            {
            lv_sizeY_2_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_sizeY_2_0, grammarAccess.getPAPERAccess().getSizeYINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPAPERRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sizeY",
            						lv_sizeY_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:236:3: ( (lv_paperColour_3_0= RULE_STRING ) )
            // InternalMyDsl.g:237:4: (lv_paperColour_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:237:4: (lv_paperColour_3_0= RULE_STRING )
            // InternalMyDsl.g:238:5: lv_paperColour_3_0= RULE_STRING
            {
            lv_paperColour_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_paperColour_3_0, grammarAccess.getPAPERAccess().getPaperColourSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPAPERRule());
            					}
            					setWithLastConsumed(
            						current,
            						"paperColour",
            						lv_paperColour_3_0,
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
    // $ANTLR end "rulePAPER"


    // $ANTLR start "entryRuleTURTLE"
    // InternalMyDsl.g:258:1: entryRuleTURTLE returns [EObject current=null] : iv_ruleTURTLE= ruleTURTLE EOF ;
    public final EObject entryRuleTURTLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTURTLE = null;


        try {
            // InternalMyDsl.g:258:47: (iv_ruleTURTLE= ruleTURTLE EOF )
            // InternalMyDsl.g:259:2: iv_ruleTURTLE= ruleTURTLE EOF
            {
             newCompositeNode(grammarAccess.getTURTLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTURTLE=ruleTURTLE();

            state._fsp--;

             current =iv_ruleTURTLE; 
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
    // $ANTLR end "entryRuleTURTLE"


    // $ANTLR start "ruleTURTLE"
    // InternalMyDsl.g:265:1: ruleTURTLE returns [EObject current=null] : (otherlv_0= 'TURTLE' ( (lv_startPosX_1_0= RULE_INT ) ) ( (lv_startPosY_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTURTLE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_startPosX_1_0=null;
        Token lv_startPosY_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:271:2: ( (otherlv_0= 'TURTLE' ( (lv_startPosX_1_0= RULE_INT ) ) ( (lv_startPosY_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:272:2: (otherlv_0= 'TURTLE' ( (lv_startPosX_1_0= RULE_INT ) ) ( (lv_startPosY_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:272:2: (otherlv_0= 'TURTLE' ( (lv_startPosX_1_0= RULE_INT ) ) ( (lv_startPosY_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:273:3: otherlv_0= 'TURTLE' ( (lv_startPosX_1_0= RULE_INT ) ) ( (lv_startPosY_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTURTLEAccess().getTURTLEKeyword_0());
            		
            // InternalMyDsl.g:277:3: ( (lv_startPosX_1_0= RULE_INT ) )
            // InternalMyDsl.g:278:4: (lv_startPosX_1_0= RULE_INT )
            {
            // InternalMyDsl.g:278:4: (lv_startPosX_1_0= RULE_INT )
            // InternalMyDsl.g:279:5: lv_startPosX_1_0= RULE_INT
            {
            lv_startPosX_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_startPosX_1_0, grammarAccess.getTURTLEAccess().getStartPosXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTURTLERule());
            					}
            					setWithLastConsumed(
            						current,
            						"startPosX",
            						lv_startPosX_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:295:3: ( (lv_startPosY_2_0= RULE_INT ) )
            // InternalMyDsl.g:296:4: (lv_startPosY_2_0= RULE_INT )
            {
            // InternalMyDsl.g:296:4: (lv_startPosY_2_0= RULE_INT )
            // InternalMyDsl.g:297:5: lv_startPosY_2_0= RULE_INT
            {
            lv_startPosY_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_startPosY_2_0, grammarAccess.getTURTLEAccess().getStartPosYINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTURTLERule());
            					}
            					setWithLastConsumed(
            						current,
            						"startPosY",
            						lv_startPosY_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleTURTLE"


    // $ANTLR start "entryRulePENSTATE"
    // InternalMyDsl.g:317:1: entryRulePENSTATE returns [EObject current=null] : iv_rulePENSTATE= rulePENSTATE EOF ;
    public final EObject entryRulePENSTATE() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePENSTATE = null;


        try {
            // InternalMyDsl.g:317:49: (iv_rulePENSTATE= rulePENSTATE EOF )
            // InternalMyDsl.g:318:2: iv_rulePENSTATE= rulePENSTATE EOF
            {
             newCompositeNode(grammarAccess.getPENSTATERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePENSTATE=rulePENSTATE();

            state._fsp--;

             current =iv_rulePENSTATE; 
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
    // $ANTLR end "entryRulePENSTATE"


    // $ANTLR start "rulePENSTATE"
    // InternalMyDsl.g:324:1: rulePENSTATE returns [EObject current=null] : (otherlv_0= 'PENSTATE' ( ( (lv_penState_1_1= 'UP' | lv_penState_1_2= 'DOWN' ) ) ) ) ;
    public final EObject rulePENSTATE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_penState_1_1=null;
        Token lv_penState_1_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:330:2: ( (otherlv_0= 'PENSTATE' ( ( (lv_penState_1_1= 'UP' | lv_penState_1_2= 'DOWN' ) ) ) ) )
            // InternalMyDsl.g:331:2: (otherlv_0= 'PENSTATE' ( ( (lv_penState_1_1= 'UP' | lv_penState_1_2= 'DOWN' ) ) ) )
            {
            // InternalMyDsl.g:331:2: (otherlv_0= 'PENSTATE' ( ( (lv_penState_1_1= 'UP' | lv_penState_1_2= 'DOWN' ) ) ) )
            // InternalMyDsl.g:332:3: otherlv_0= 'PENSTATE' ( ( (lv_penState_1_1= 'UP' | lv_penState_1_2= 'DOWN' ) ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPENSTATEAccess().getPENSTATEKeyword_0());
            		
            // InternalMyDsl.g:336:3: ( ( (lv_penState_1_1= 'UP' | lv_penState_1_2= 'DOWN' ) ) )
            // InternalMyDsl.g:337:4: ( (lv_penState_1_1= 'UP' | lv_penState_1_2= 'DOWN' ) )
            {
            // InternalMyDsl.g:337:4: ( (lv_penState_1_1= 'UP' | lv_penState_1_2= 'DOWN' ) )
            // InternalMyDsl.g:338:5: (lv_penState_1_1= 'UP' | lv_penState_1_2= 'DOWN' )
            {
            // InternalMyDsl.g:338:5: (lv_penState_1_1= 'UP' | lv_penState_1_2= 'DOWN' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:339:6: lv_penState_1_1= 'UP'
                    {
                    lv_penState_1_1=(Token)match(input,14,FOLLOW_2); 

                    						newLeafNode(lv_penState_1_1, grammarAccess.getPENSTATEAccess().getPenStateUPKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPENSTATERule());
                    						}
                    						setWithLastConsumed(current, "penState", lv_penState_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:350:6: lv_penState_1_2= 'DOWN'
                    {
                    lv_penState_1_2=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_penState_1_2, grammarAccess.getPENSTATEAccess().getPenStateDOWNKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPENSTATERule());
                    						}
                    						setWithLastConsumed(current, "penState", lv_penState_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "rulePENSTATE"


    // $ANTLR start "entryRulePENCOLOUR"
    // InternalMyDsl.g:367:1: entryRulePENCOLOUR returns [EObject current=null] : iv_rulePENCOLOUR= rulePENCOLOUR EOF ;
    public final EObject entryRulePENCOLOUR() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePENCOLOUR = null;


        try {
            // InternalMyDsl.g:367:50: (iv_rulePENCOLOUR= rulePENCOLOUR EOF )
            // InternalMyDsl.g:368:2: iv_rulePENCOLOUR= rulePENCOLOUR EOF
            {
             newCompositeNode(grammarAccess.getPENCOLOURRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePENCOLOUR=rulePENCOLOUR();

            state._fsp--;

             current =iv_rulePENCOLOUR; 
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
    // $ANTLR end "entryRulePENCOLOUR"


    // $ANTLR start "rulePENCOLOUR"
    // InternalMyDsl.g:374:1: rulePENCOLOUR returns [EObject current=null] : (otherlv_0= 'PENCOLOUR' ( (lv_colour_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePENCOLOUR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_colour_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:380:2: ( (otherlv_0= 'PENCOLOUR' ( (lv_colour_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:381:2: (otherlv_0= 'PENCOLOUR' ( (lv_colour_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:381:2: (otherlv_0= 'PENCOLOUR' ( (lv_colour_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:382:3: otherlv_0= 'PENCOLOUR' ( (lv_colour_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPENCOLOURAccess().getPENCOLOURKeyword_0());
            		
            // InternalMyDsl.g:386:3: ( (lv_colour_1_0= RULE_STRING ) )
            // InternalMyDsl.g:387:4: (lv_colour_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:387:4: (lv_colour_1_0= RULE_STRING )
            // InternalMyDsl.g:388:5: lv_colour_1_0= RULE_STRING
            {
            lv_colour_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_colour_1_0, grammarAccess.getPENCOLOURAccess().getColourSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPENCOLOURRule());
            					}
            					setWithLastConsumed(
            						current,
            						"colour",
            						lv_colour_1_0,
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
    // $ANTLR end "rulePENCOLOUR"


    // $ANTLR start "entryRuleMOVE"
    // InternalMyDsl.g:408:1: entryRuleMOVE returns [EObject current=null] : iv_ruleMOVE= ruleMOVE EOF ;
    public final EObject entryRuleMOVE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOVE = null;


        try {
            // InternalMyDsl.g:408:45: (iv_ruleMOVE= ruleMOVE EOF )
            // InternalMyDsl.g:409:2: iv_ruleMOVE= ruleMOVE EOF
            {
             newCompositeNode(grammarAccess.getMOVERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMOVE=ruleMOVE();

            state._fsp--;

             current =iv_ruleMOVE; 
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
    // $ANTLR end "entryRuleMOVE"


    // $ANTLR start "ruleMOVE"
    // InternalMyDsl.g:415:1: ruleMOVE returns [EObject current=null] : (otherlv_0= 'MOVE' ( (lv_amount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMOVE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:421:2: ( (otherlv_0= 'MOVE' ( (lv_amount_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:422:2: (otherlv_0= 'MOVE' ( (lv_amount_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:422:2: (otherlv_0= 'MOVE' ( (lv_amount_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:423:3: otherlv_0= 'MOVE' ( (lv_amount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMOVEAccess().getMOVEKeyword_0());
            		
            // InternalMyDsl.g:427:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalMyDsl.g:428:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalMyDsl.g:428:4: (lv_amount_1_0= RULE_INT )
            // InternalMyDsl.g:429:5: lv_amount_1_0= RULE_INT
            {
            lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_amount_1_0, grammarAccess.getMOVEAccess().getAmountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMOVERule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMOVE"


    // $ANTLR start "entryRuleRIGHT"
    // InternalMyDsl.g:449:1: entryRuleRIGHT returns [EObject current=null] : iv_ruleRIGHT= ruleRIGHT EOF ;
    public final EObject entryRuleRIGHT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRIGHT = null;


        try {
            // InternalMyDsl.g:449:46: (iv_ruleRIGHT= ruleRIGHT EOF )
            // InternalMyDsl.g:450:2: iv_ruleRIGHT= ruleRIGHT EOF
            {
             newCompositeNode(grammarAccess.getRIGHTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRIGHT=ruleRIGHT();

            state._fsp--;

             current =iv_ruleRIGHT; 
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
    // $ANTLR end "entryRuleRIGHT"


    // $ANTLR start "ruleRIGHT"
    // InternalMyDsl.g:456:1: ruleRIGHT returns [EObject current=null] : (otherlv_0= 'RIGHT' ( (lv_amount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRIGHT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:462:2: ( (otherlv_0= 'RIGHT' ( (lv_amount_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:463:2: (otherlv_0= 'RIGHT' ( (lv_amount_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:463:2: (otherlv_0= 'RIGHT' ( (lv_amount_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:464:3: otherlv_0= 'RIGHT' ( (lv_amount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRIGHTAccess().getRIGHTKeyword_0());
            		
            // InternalMyDsl.g:468:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalMyDsl.g:469:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalMyDsl.g:469:4: (lv_amount_1_0= RULE_INT )
            // InternalMyDsl.g:470:5: lv_amount_1_0= RULE_INT
            {
            lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_amount_1_0, grammarAccess.getRIGHTAccess().getAmountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRIGHTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRIGHT"


    // $ANTLR start "entryRuleLEFT"
    // InternalMyDsl.g:490:1: entryRuleLEFT returns [EObject current=null] : iv_ruleLEFT= ruleLEFT EOF ;
    public final EObject entryRuleLEFT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLEFT = null;


        try {
            // InternalMyDsl.g:490:45: (iv_ruleLEFT= ruleLEFT EOF )
            // InternalMyDsl.g:491:2: iv_ruleLEFT= ruleLEFT EOF
            {
             newCompositeNode(grammarAccess.getLEFTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLEFT=ruleLEFT();

            state._fsp--;

             current =iv_ruleLEFT; 
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
    // $ANTLR end "entryRuleLEFT"


    // $ANTLR start "ruleLEFT"
    // InternalMyDsl.g:497:1: ruleLEFT returns [EObject current=null] : (otherlv_0= 'LEFT' ( (lv_amount_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLEFT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:503:2: ( (otherlv_0= 'LEFT' ( (lv_amount_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:504:2: (otherlv_0= 'LEFT' ( (lv_amount_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:504:2: (otherlv_0= 'LEFT' ( (lv_amount_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:505:3: otherlv_0= 'LEFT' ( (lv_amount_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLEFTAccess().getLEFTKeyword_0());
            		
            // InternalMyDsl.g:509:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalMyDsl.g:510:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalMyDsl.g:510:4: (lv_amount_1_0= RULE_INT )
            // InternalMyDsl.g:511:5: lv_amount_1_0= RULE_INT
            {
            lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_amount_1_0, grammarAccess.getLEFTAccess().getAmountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLEFTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleLEFT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000F3802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});

}