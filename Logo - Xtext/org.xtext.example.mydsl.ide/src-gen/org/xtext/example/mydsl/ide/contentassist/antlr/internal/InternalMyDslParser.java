package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UP'", "'DOWN'", "'PAPER'", "'TURTLE'", "'PENSTATE'", "'PENCOLOUR'", "'MOVE'", "'RIGHT'", "'LEFT'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePROGRAM"
    // InternalMyDsl.g:53:1: entryRulePROGRAM : rulePROGRAM EOF ;
    public final void entryRulePROGRAM() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( rulePROGRAM EOF )
            // InternalMyDsl.g:55:1: rulePROGRAM EOF
            {
             before(grammarAccess.getPROGRAMRule()); 
            pushFollow(FOLLOW_1);
            rulePROGRAM();

            state._fsp--;

             after(grammarAccess.getPROGRAMRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePROGRAM"


    // $ANTLR start "rulePROGRAM"
    // InternalMyDsl.g:62:1: rulePROGRAM : ( ( rule__PROGRAM__CommandsAssignment )* ) ;
    public final void rulePROGRAM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__PROGRAM__CommandsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__PROGRAM__CommandsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__PROGRAM__CommandsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__PROGRAM__CommandsAssignment )*
            {
             before(grammarAccess.getPROGRAMAccess().getCommandsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__PROGRAM__CommandsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__PROGRAM__CommandsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PROGRAM__CommandsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPROGRAMAccess().getCommandsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePROGRAM"


    // $ANTLR start "entryRuleCMD"
    // InternalMyDsl.g:78:1: entryRuleCMD : ruleCMD EOF ;
    public final void entryRuleCMD() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleCMD EOF )
            // InternalMyDsl.g:80:1: ruleCMD EOF
            {
             before(grammarAccess.getCMDRule()); 
            pushFollow(FOLLOW_1);
            ruleCMD();

            state._fsp--;

             after(grammarAccess.getCMDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCMD"


    // $ANTLR start "ruleCMD"
    // InternalMyDsl.g:87:1: ruleCMD : ( ( rule__CMD__Alternatives ) ) ;
    public final void ruleCMD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__CMD__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__CMD__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__CMD__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__CMD__Alternatives )
            {
             before(grammarAccess.getCMDAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__CMD__Alternatives )
            // InternalMyDsl.g:94:4: rule__CMD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CMD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCMDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCMD"


    // $ANTLR start "entryRulePAPER"
    // InternalMyDsl.g:103:1: entryRulePAPER : rulePAPER EOF ;
    public final void entryRulePAPER() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( rulePAPER EOF )
            // InternalMyDsl.g:105:1: rulePAPER EOF
            {
             before(grammarAccess.getPAPERRule()); 
            pushFollow(FOLLOW_1);
            rulePAPER();

            state._fsp--;

             after(grammarAccess.getPAPERRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePAPER"


    // $ANTLR start "rulePAPER"
    // InternalMyDsl.g:112:1: rulePAPER : ( ( rule__PAPER__Group__0 ) ) ;
    public final void rulePAPER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__PAPER__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__PAPER__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__PAPER__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__PAPER__Group__0 )
            {
             before(grammarAccess.getPAPERAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__PAPER__Group__0 )
            // InternalMyDsl.g:119:4: rule__PAPER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PAPER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPAPERAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePAPER"


    // $ANTLR start "entryRuleTURTLE"
    // InternalMyDsl.g:128:1: entryRuleTURTLE : ruleTURTLE EOF ;
    public final void entryRuleTURTLE() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleTURTLE EOF )
            // InternalMyDsl.g:130:1: ruleTURTLE EOF
            {
             before(grammarAccess.getTURTLERule()); 
            pushFollow(FOLLOW_1);
            ruleTURTLE();

            state._fsp--;

             after(grammarAccess.getTURTLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTURTLE"


    // $ANTLR start "ruleTURTLE"
    // InternalMyDsl.g:137:1: ruleTURTLE : ( ( rule__TURTLE__Group__0 ) ) ;
    public final void ruleTURTLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__TURTLE__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__TURTLE__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__TURTLE__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__TURTLE__Group__0 )
            {
             before(grammarAccess.getTURTLEAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__TURTLE__Group__0 )
            // InternalMyDsl.g:144:4: rule__TURTLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TURTLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTURTLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTURTLE"


    // $ANTLR start "entryRulePENSTATE"
    // InternalMyDsl.g:153:1: entryRulePENSTATE : rulePENSTATE EOF ;
    public final void entryRulePENSTATE() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulePENSTATE EOF )
            // InternalMyDsl.g:155:1: rulePENSTATE EOF
            {
             before(grammarAccess.getPENSTATERule()); 
            pushFollow(FOLLOW_1);
            rulePENSTATE();

            state._fsp--;

             after(grammarAccess.getPENSTATERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePENSTATE"


    // $ANTLR start "rulePENSTATE"
    // InternalMyDsl.g:162:1: rulePENSTATE : ( ( rule__PENSTATE__Group__0 ) ) ;
    public final void rulePENSTATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__PENSTATE__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__PENSTATE__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__PENSTATE__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__PENSTATE__Group__0 )
            {
             before(grammarAccess.getPENSTATEAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__PENSTATE__Group__0 )
            // InternalMyDsl.g:169:4: rule__PENSTATE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PENSTATE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPENSTATEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePENSTATE"


    // $ANTLR start "entryRulePENCOLOUR"
    // InternalMyDsl.g:178:1: entryRulePENCOLOUR : rulePENCOLOUR EOF ;
    public final void entryRulePENCOLOUR() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( rulePENCOLOUR EOF )
            // InternalMyDsl.g:180:1: rulePENCOLOUR EOF
            {
             before(grammarAccess.getPENCOLOURRule()); 
            pushFollow(FOLLOW_1);
            rulePENCOLOUR();

            state._fsp--;

             after(grammarAccess.getPENCOLOURRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePENCOLOUR"


    // $ANTLR start "rulePENCOLOUR"
    // InternalMyDsl.g:187:1: rulePENCOLOUR : ( ( rule__PENCOLOUR__Group__0 ) ) ;
    public final void rulePENCOLOUR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__PENCOLOUR__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__PENCOLOUR__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__PENCOLOUR__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__PENCOLOUR__Group__0 )
            {
             before(grammarAccess.getPENCOLOURAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__PENCOLOUR__Group__0 )
            // InternalMyDsl.g:194:4: rule__PENCOLOUR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PENCOLOUR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPENCOLOURAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePENCOLOUR"


    // $ANTLR start "entryRuleMOVE"
    // InternalMyDsl.g:203:1: entryRuleMOVE : ruleMOVE EOF ;
    public final void entryRuleMOVE() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleMOVE EOF )
            // InternalMyDsl.g:205:1: ruleMOVE EOF
            {
             before(grammarAccess.getMOVERule()); 
            pushFollow(FOLLOW_1);
            ruleMOVE();

            state._fsp--;

             after(grammarAccess.getMOVERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMOVE"


    // $ANTLR start "ruleMOVE"
    // InternalMyDsl.g:212:1: ruleMOVE : ( ( rule__MOVE__Group__0 ) ) ;
    public final void ruleMOVE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__MOVE__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__MOVE__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__MOVE__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__MOVE__Group__0 )
            {
             before(grammarAccess.getMOVEAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__MOVE__Group__0 )
            // InternalMyDsl.g:219:4: rule__MOVE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MOVE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMOVEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMOVE"


    // $ANTLR start "entryRuleRIGHT"
    // InternalMyDsl.g:228:1: entryRuleRIGHT : ruleRIGHT EOF ;
    public final void entryRuleRIGHT() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRIGHT EOF )
            // InternalMyDsl.g:230:1: ruleRIGHT EOF
            {
             before(grammarAccess.getRIGHTRule()); 
            pushFollow(FOLLOW_1);
            ruleRIGHT();

            state._fsp--;

             after(grammarAccess.getRIGHTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRIGHT"


    // $ANTLR start "ruleRIGHT"
    // InternalMyDsl.g:237:1: ruleRIGHT : ( ( rule__RIGHT__Group__0 ) ) ;
    public final void ruleRIGHT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__RIGHT__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__RIGHT__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__RIGHT__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__RIGHT__Group__0 )
            {
             before(grammarAccess.getRIGHTAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__RIGHT__Group__0 )
            // InternalMyDsl.g:244:4: rule__RIGHT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RIGHT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRIGHTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRIGHT"


    // $ANTLR start "entryRuleLEFT"
    // InternalMyDsl.g:253:1: entryRuleLEFT : ruleLEFT EOF ;
    public final void entryRuleLEFT() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleLEFT EOF )
            // InternalMyDsl.g:255:1: ruleLEFT EOF
            {
             before(grammarAccess.getLEFTRule()); 
            pushFollow(FOLLOW_1);
            ruleLEFT();

            state._fsp--;

             after(grammarAccess.getLEFTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLEFT"


    // $ANTLR start "ruleLEFT"
    // InternalMyDsl.g:262:1: ruleLEFT : ( ( rule__LEFT__Group__0 ) ) ;
    public final void ruleLEFT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__LEFT__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__LEFT__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__LEFT__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__LEFT__Group__0 )
            {
             before(grammarAccess.getLEFTAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__LEFT__Group__0 )
            // InternalMyDsl.g:269:4: rule__LEFT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LEFT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLEFTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLEFT"


    // $ANTLR start "rule__CMD__Alternatives"
    // InternalMyDsl.g:277:1: rule__CMD__Alternatives : ( ( rulePAPER ) | ( ruleTURTLE ) | ( rulePENSTATE ) | ( rulePENCOLOUR ) | ( ruleMOVE ) | ( ruleRIGHT ) | ( ruleLEFT ) );
    public final void rule__CMD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( rulePAPER ) | ( ruleTURTLE ) | ( rulePENSTATE ) | ( rulePENCOLOUR ) | ( ruleMOVE ) | ( ruleRIGHT ) | ( ruleLEFT ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:282:2: ( rulePAPER )
                    {
                    // InternalMyDsl.g:282:2: ( rulePAPER )
                    // InternalMyDsl.g:283:3: rulePAPER
                    {
                     before(grammarAccess.getCMDAccess().getPAPERParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePAPER();

                    state._fsp--;

                     after(grammarAccess.getCMDAccess().getPAPERParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( ruleTURTLE )
                    {
                    // InternalMyDsl.g:288:2: ( ruleTURTLE )
                    // InternalMyDsl.g:289:3: ruleTURTLE
                    {
                     before(grammarAccess.getCMDAccess().getTURTLEParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTURTLE();

                    state._fsp--;

                     after(grammarAccess.getCMDAccess().getTURTLEParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:294:2: ( rulePENSTATE )
                    {
                    // InternalMyDsl.g:294:2: ( rulePENSTATE )
                    // InternalMyDsl.g:295:3: rulePENSTATE
                    {
                     before(grammarAccess.getCMDAccess().getPENSTATEParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePENSTATE();

                    state._fsp--;

                     after(grammarAccess.getCMDAccess().getPENSTATEParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:300:2: ( rulePENCOLOUR )
                    {
                    // InternalMyDsl.g:300:2: ( rulePENCOLOUR )
                    // InternalMyDsl.g:301:3: rulePENCOLOUR
                    {
                     before(grammarAccess.getCMDAccess().getPENCOLOURParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePENCOLOUR();

                    state._fsp--;

                     after(grammarAccess.getCMDAccess().getPENCOLOURParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:306:2: ( ruleMOVE )
                    {
                    // InternalMyDsl.g:306:2: ( ruleMOVE )
                    // InternalMyDsl.g:307:3: ruleMOVE
                    {
                     before(grammarAccess.getCMDAccess().getMOVEParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMOVE();

                    state._fsp--;

                     after(grammarAccess.getCMDAccess().getMOVEParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:312:2: ( ruleRIGHT )
                    {
                    // InternalMyDsl.g:312:2: ( ruleRIGHT )
                    // InternalMyDsl.g:313:3: ruleRIGHT
                    {
                     before(grammarAccess.getCMDAccess().getRIGHTParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleRIGHT();

                    state._fsp--;

                     after(grammarAccess.getCMDAccess().getRIGHTParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:318:2: ( ruleLEFT )
                    {
                    // InternalMyDsl.g:318:2: ( ruleLEFT )
                    // InternalMyDsl.g:319:3: ruleLEFT
                    {
                     before(grammarAccess.getCMDAccess().getLEFTParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleLEFT();

                    state._fsp--;

                     after(grammarAccess.getCMDAccess().getLEFTParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMD__Alternatives"


    // $ANTLR start "rule__PENSTATE__PenStateAlternatives_1_0"
    // InternalMyDsl.g:328:1: rule__PENSTATE__PenStateAlternatives_1_0 : ( ( 'UP' ) | ( 'DOWN' ) );
    public final void rule__PENSTATE__PenStateAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( ( 'UP' ) | ( 'DOWN' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:333:2: ( 'UP' )
                    {
                    // InternalMyDsl.g:333:2: ( 'UP' )
                    // InternalMyDsl.g:334:3: 'UP'
                    {
                     before(grammarAccess.getPENSTATEAccess().getPenStateUPKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPENSTATEAccess().getPenStateUPKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:339:2: ( 'DOWN' )
                    {
                    // InternalMyDsl.g:339:2: ( 'DOWN' )
                    // InternalMyDsl.g:340:3: 'DOWN'
                    {
                     before(grammarAccess.getPENSTATEAccess().getPenStateDOWNKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPENSTATEAccess().getPenStateDOWNKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENSTATE__PenStateAlternatives_1_0"


    // $ANTLR start "rule__PAPER__Group__0"
    // InternalMyDsl.g:349:1: rule__PAPER__Group__0 : rule__PAPER__Group__0__Impl rule__PAPER__Group__1 ;
    public final void rule__PAPER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( rule__PAPER__Group__0__Impl rule__PAPER__Group__1 )
            // InternalMyDsl.g:354:2: rule__PAPER__Group__0__Impl rule__PAPER__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PAPER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PAPER__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__Group__0"


    // $ANTLR start "rule__PAPER__Group__0__Impl"
    // InternalMyDsl.g:361:1: rule__PAPER__Group__0__Impl : ( 'PAPER' ) ;
    public final void rule__PAPER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:365:1: ( ( 'PAPER' ) )
            // InternalMyDsl.g:366:1: ( 'PAPER' )
            {
            // InternalMyDsl.g:366:1: ( 'PAPER' )
            // InternalMyDsl.g:367:2: 'PAPER'
            {
             before(grammarAccess.getPAPERAccess().getPAPERKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPAPERAccess().getPAPERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__Group__0__Impl"


    // $ANTLR start "rule__PAPER__Group__1"
    // InternalMyDsl.g:376:1: rule__PAPER__Group__1 : rule__PAPER__Group__1__Impl rule__PAPER__Group__2 ;
    public final void rule__PAPER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( rule__PAPER__Group__1__Impl rule__PAPER__Group__2 )
            // InternalMyDsl.g:381:2: rule__PAPER__Group__1__Impl rule__PAPER__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PAPER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PAPER__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__Group__1"


    // $ANTLR start "rule__PAPER__Group__1__Impl"
    // InternalMyDsl.g:388:1: rule__PAPER__Group__1__Impl : ( ( rule__PAPER__SizeXAssignment_1 ) ) ;
    public final void rule__PAPER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:392:1: ( ( ( rule__PAPER__SizeXAssignment_1 ) ) )
            // InternalMyDsl.g:393:1: ( ( rule__PAPER__SizeXAssignment_1 ) )
            {
            // InternalMyDsl.g:393:1: ( ( rule__PAPER__SizeXAssignment_1 ) )
            // InternalMyDsl.g:394:2: ( rule__PAPER__SizeXAssignment_1 )
            {
             before(grammarAccess.getPAPERAccess().getSizeXAssignment_1()); 
            // InternalMyDsl.g:395:2: ( rule__PAPER__SizeXAssignment_1 )
            // InternalMyDsl.g:395:3: rule__PAPER__SizeXAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PAPER__SizeXAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPAPERAccess().getSizeXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__Group__1__Impl"


    // $ANTLR start "rule__PAPER__Group__2"
    // InternalMyDsl.g:403:1: rule__PAPER__Group__2 : rule__PAPER__Group__2__Impl rule__PAPER__Group__3 ;
    public final void rule__PAPER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( rule__PAPER__Group__2__Impl rule__PAPER__Group__3 )
            // InternalMyDsl.g:408:2: rule__PAPER__Group__2__Impl rule__PAPER__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PAPER__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PAPER__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__Group__2"


    // $ANTLR start "rule__PAPER__Group__2__Impl"
    // InternalMyDsl.g:415:1: rule__PAPER__Group__2__Impl : ( ( rule__PAPER__SizeYAssignment_2 ) ) ;
    public final void rule__PAPER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:419:1: ( ( ( rule__PAPER__SizeYAssignment_2 ) ) )
            // InternalMyDsl.g:420:1: ( ( rule__PAPER__SizeYAssignment_2 ) )
            {
            // InternalMyDsl.g:420:1: ( ( rule__PAPER__SizeYAssignment_2 ) )
            // InternalMyDsl.g:421:2: ( rule__PAPER__SizeYAssignment_2 )
            {
             before(grammarAccess.getPAPERAccess().getSizeYAssignment_2()); 
            // InternalMyDsl.g:422:2: ( rule__PAPER__SizeYAssignment_2 )
            // InternalMyDsl.g:422:3: rule__PAPER__SizeYAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PAPER__SizeYAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPAPERAccess().getSizeYAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__Group__2__Impl"


    // $ANTLR start "rule__PAPER__Group__3"
    // InternalMyDsl.g:430:1: rule__PAPER__Group__3 : rule__PAPER__Group__3__Impl ;
    public final void rule__PAPER__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( rule__PAPER__Group__3__Impl )
            // InternalMyDsl.g:435:2: rule__PAPER__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PAPER__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__Group__3"


    // $ANTLR start "rule__PAPER__Group__3__Impl"
    // InternalMyDsl.g:441:1: rule__PAPER__Group__3__Impl : ( ( rule__PAPER__PaperColourAssignment_3 ) ) ;
    public final void rule__PAPER__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( ( ( rule__PAPER__PaperColourAssignment_3 ) ) )
            // InternalMyDsl.g:446:1: ( ( rule__PAPER__PaperColourAssignment_3 ) )
            {
            // InternalMyDsl.g:446:1: ( ( rule__PAPER__PaperColourAssignment_3 ) )
            // InternalMyDsl.g:447:2: ( rule__PAPER__PaperColourAssignment_3 )
            {
             before(grammarAccess.getPAPERAccess().getPaperColourAssignment_3()); 
            // InternalMyDsl.g:448:2: ( rule__PAPER__PaperColourAssignment_3 )
            // InternalMyDsl.g:448:3: rule__PAPER__PaperColourAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PAPER__PaperColourAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPAPERAccess().getPaperColourAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__Group__3__Impl"


    // $ANTLR start "rule__TURTLE__Group__0"
    // InternalMyDsl.g:457:1: rule__TURTLE__Group__0 : rule__TURTLE__Group__0__Impl rule__TURTLE__Group__1 ;
    public final void rule__TURTLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( rule__TURTLE__Group__0__Impl rule__TURTLE__Group__1 )
            // InternalMyDsl.g:462:2: rule__TURTLE__Group__0__Impl rule__TURTLE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TURTLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TURTLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TURTLE__Group__0"


    // $ANTLR start "rule__TURTLE__Group__0__Impl"
    // InternalMyDsl.g:469:1: rule__TURTLE__Group__0__Impl : ( 'TURTLE' ) ;
    public final void rule__TURTLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( 'TURTLE' ) )
            // InternalMyDsl.g:474:1: ( 'TURTLE' )
            {
            // InternalMyDsl.g:474:1: ( 'TURTLE' )
            // InternalMyDsl.g:475:2: 'TURTLE'
            {
             before(grammarAccess.getTURTLEAccess().getTURTLEKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTURTLEAccess().getTURTLEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TURTLE__Group__0__Impl"


    // $ANTLR start "rule__TURTLE__Group__1"
    // InternalMyDsl.g:484:1: rule__TURTLE__Group__1 : rule__TURTLE__Group__1__Impl rule__TURTLE__Group__2 ;
    public final void rule__TURTLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( rule__TURTLE__Group__1__Impl rule__TURTLE__Group__2 )
            // InternalMyDsl.g:489:2: rule__TURTLE__Group__1__Impl rule__TURTLE__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TURTLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TURTLE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TURTLE__Group__1"


    // $ANTLR start "rule__TURTLE__Group__1__Impl"
    // InternalMyDsl.g:496:1: rule__TURTLE__Group__1__Impl : ( ( rule__TURTLE__StartPosXAssignment_1 ) ) ;
    public final void rule__TURTLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:500:1: ( ( ( rule__TURTLE__StartPosXAssignment_1 ) ) )
            // InternalMyDsl.g:501:1: ( ( rule__TURTLE__StartPosXAssignment_1 ) )
            {
            // InternalMyDsl.g:501:1: ( ( rule__TURTLE__StartPosXAssignment_1 ) )
            // InternalMyDsl.g:502:2: ( rule__TURTLE__StartPosXAssignment_1 )
            {
             before(grammarAccess.getTURTLEAccess().getStartPosXAssignment_1()); 
            // InternalMyDsl.g:503:2: ( rule__TURTLE__StartPosXAssignment_1 )
            // InternalMyDsl.g:503:3: rule__TURTLE__StartPosXAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TURTLE__StartPosXAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTURTLEAccess().getStartPosXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TURTLE__Group__1__Impl"


    // $ANTLR start "rule__TURTLE__Group__2"
    // InternalMyDsl.g:511:1: rule__TURTLE__Group__2 : rule__TURTLE__Group__2__Impl ;
    public final void rule__TURTLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( rule__TURTLE__Group__2__Impl )
            // InternalMyDsl.g:516:2: rule__TURTLE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TURTLE__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TURTLE__Group__2"


    // $ANTLR start "rule__TURTLE__Group__2__Impl"
    // InternalMyDsl.g:522:1: rule__TURTLE__Group__2__Impl : ( ( rule__TURTLE__StartPosYAssignment_2 ) ) ;
    public final void rule__TURTLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( ( ( rule__TURTLE__StartPosYAssignment_2 ) ) )
            // InternalMyDsl.g:527:1: ( ( rule__TURTLE__StartPosYAssignment_2 ) )
            {
            // InternalMyDsl.g:527:1: ( ( rule__TURTLE__StartPosYAssignment_2 ) )
            // InternalMyDsl.g:528:2: ( rule__TURTLE__StartPosYAssignment_2 )
            {
             before(grammarAccess.getTURTLEAccess().getStartPosYAssignment_2()); 
            // InternalMyDsl.g:529:2: ( rule__TURTLE__StartPosYAssignment_2 )
            // InternalMyDsl.g:529:3: rule__TURTLE__StartPosYAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TURTLE__StartPosYAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTURTLEAccess().getStartPosYAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TURTLE__Group__2__Impl"


    // $ANTLR start "rule__PENSTATE__Group__0"
    // InternalMyDsl.g:538:1: rule__PENSTATE__Group__0 : rule__PENSTATE__Group__0__Impl rule__PENSTATE__Group__1 ;
    public final void rule__PENSTATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( rule__PENSTATE__Group__0__Impl rule__PENSTATE__Group__1 )
            // InternalMyDsl.g:543:2: rule__PENSTATE__Group__0__Impl rule__PENSTATE__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PENSTATE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PENSTATE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENSTATE__Group__0"


    // $ANTLR start "rule__PENSTATE__Group__0__Impl"
    // InternalMyDsl.g:550:1: rule__PENSTATE__Group__0__Impl : ( 'PENSTATE' ) ;
    public final void rule__PENSTATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:554:1: ( ( 'PENSTATE' ) )
            // InternalMyDsl.g:555:1: ( 'PENSTATE' )
            {
            // InternalMyDsl.g:555:1: ( 'PENSTATE' )
            // InternalMyDsl.g:556:2: 'PENSTATE'
            {
             before(grammarAccess.getPENSTATEAccess().getPENSTATEKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPENSTATEAccess().getPENSTATEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENSTATE__Group__0__Impl"


    // $ANTLR start "rule__PENSTATE__Group__1"
    // InternalMyDsl.g:565:1: rule__PENSTATE__Group__1 : rule__PENSTATE__Group__1__Impl ;
    public final void rule__PENSTATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( rule__PENSTATE__Group__1__Impl )
            // InternalMyDsl.g:570:2: rule__PENSTATE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PENSTATE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENSTATE__Group__1"


    // $ANTLR start "rule__PENSTATE__Group__1__Impl"
    // InternalMyDsl.g:576:1: rule__PENSTATE__Group__1__Impl : ( ( rule__PENSTATE__PenStateAssignment_1 ) ) ;
    public final void rule__PENSTATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( ( ( rule__PENSTATE__PenStateAssignment_1 ) ) )
            // InternalMyDsl.g:581:1: ( ( rule__PENSTATE__PenStateAssignment_1 ) )
            {
            // InternalMyDsl.g:581:1: ( ( rule__PENSTATE__PenStateAssignment_1 ) )
            // InternalMyDsl.g:582:2: ( rule__PENSTATE__PenStateAssignment_1 )
            {
             before(grammarAccess.getPENSTATEAccess().getPenStateAssignment_1()); 
            // InternalMyDsl.g:583:2: ( rule__PENSTATE__PenStateAssignment_1 )
            // InternalMyDsl.g:583:3: rule__PENSTATE__PenStateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PENSTATE__PenStateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPENSTATEAccess().getPenStateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENSTATE__Group__1__Impl"


    // $ANTLR start "rule__PENCOLOUR__Group__0"
    // InternalMyDsl.g:592:1: rule__PENCOLOUR__Group__0 : rule__PENCOLOUR__Group__0__Impl rule__PENCOLOUR__Group__1 ;
    public final void rule__PENCOLOUR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( rule__PENCOLOUR__Group__0__Impl rule__PENCOLOUR__Group__1 )
            // InternalMyDsl.g:597:2: rule__PENCOLOUR__Group__0__Impl rule__PENCOLOUR__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PENCOLOUR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PENCOLOUR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOUR__Group__0"


    // $ANTLR start "rule__PENCOLOUR__Group__0__Impl"
    // InternalMyDsl.g:604:1: rule__PENCOLOUR__Group__0__Impl : ( 'PENCOLOUR' ) ;
    public final void rule__PENCOLOUR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:1: ( ( 'PENCOLOUR' ) )
            // InternalMyDsl.g:609:1: ( 'PENCOLOUR' )
            {
            // InternalMyDsl.g:609:1: ( 'PENCOLOUR' )
            // InternalMyDsl.g:610:2: 'PENCOLOUR'
            {
             before(grammarAccess.getPENCOLOURAccess().getPENCOLOURKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPENCOLOURAccess().getPENCOLOURKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOUR__Group__0__Impl"


    // $ANTLR start "rule__PENCOLOUR__Group__1"
    // InternalMyDsl.g:619:1: rule__PENCOLOUR__Group__1 : rule__PENCOLOUR__Group__1__Impl ;
    public final void rule__PENCOLOUR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( rule__PENCOLOUR__Group__1__Impl )
            // InternalMyDsl.g:624:2: rule__PENCOLOUR__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PENCOLOUR__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOUR__Group__1"


    // $ANTLR start "rule__PENCOLOUR__Group__1__Impl"
    // InternalMyDsl.g:630:1: rule__PENCOLOUR__Group__1__Impl : ( ( rule__PENCOLOUR__ColourAssignment_1 ) ) ;
    public final void rule__PENCOLOUR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( ( ( rule__PENCOLOUR__ColourAssignment_1 ) ) )
            // InternalMyDsl.g:635:1: ( ( rule__PENCOLOUR__ColourAssignment_1 ) )
            {
            // InternalMyDsl.g:635:1: ( ( rule__PENCOLOUR__ColourAssignment_1 ) )
            // InternalMyDsl.g:636:2: ( rule__PENCOLOUR__ColourAssignment_1 )
            {
             before(grammarAccess.getPENCOLOURAccess().getColourAssignment_1()); 
            // InternalMyDsl.g:637:2: ( rule__PENCOLOUR__ColourAssignment_1 )
            // InternalMyDsl.g:637:3: rule__PENCOLOUR__ColourAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PENCOLOUR__ColourAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPENCOLOURAccess().getColourAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOUR__Group__1__Impl"


    // $ANTLR start "rule__MOVE__Group__0"
    // InternalMyDsl.g:646:1: rule__MOVE__Group__0 : rule__MOVE__Group__0__Impl rule__MOVE__Group__1 ;
    public final void rule__MOVE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( rule__MOVE__Group__0__Impl rule__MOVE__Group__1 )
            // InternalMyDsl.g:651:2: rule__MOVE__Group__0__Impl rule__MOVE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MOVE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MOVE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__0"


    // $ANTLR start "rule__MOVE__Group__0__Impl"
    // InternalMyDsl.g:658:1: rule__MOVE__Group__0__Impl : ( 'MOVE' ) ;
    public final void rule__MOVE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( ( 'MOVE' ) )
            // InternalMyDsl.g:663:1: ( 'MOVE' )
            {
            // InternalMyDsl.g:663:1: ( 'MOVE' )
            // InternalMyDsl.g:664:2: 'MOVE'
            {
             before(grammarAccess.getMOVEAccess().getMOVEKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMOVEAccess().getMOVEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__0__Impl"


    // $ANTLR start "rule__MOVE__Group__1"
    // InternalMyDsl.g:673:1: rule__MOVE__Group__1 : rule__MOVE__Group__1__Impl ;
    public final void rule__MOVE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( rule__MOVE__Group__1__Impl )
            // InternalMyDsl.g:678:2: rule__MOVE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MOVE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__1"


    // $ANTLR start "rule__MOVE__Group__1__Impl"
    // InternalMyDsl.g:684:1: rule__MOVE__Group__1__Impl : ( ( rule__MOVE__AmountAssignment_1 ) ) ;
    public final void rule__MOVE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( ( ( rule__MOVE__AmountAssignment_1 ) ) )
            // InternalMyDsl.g:689:1: ( ( rule__MOVE__AmountAssignment_1 ) )
            {
            // InternalMyDsl.g:689:1: ( ( rule__MOVE__AmountAssignment_1 ) )
            // InternalMyDsl.g:690:2: ( rule__MOVE__AmountAssignment_1 )
            {
             before(grammarAccess.getMOVEAccess().getAmountAssignment_1()); 
            // InternalMyDsl.g:691:2: ( rule__MOVE__AmountAssignment_1 )
            // InternalMyDsl.g:691:3: rule__MOVE__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MOVE__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMOVEAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Group__1__Impl"


    // $ANTLR start "rule__RIGHT__Group__0"
    // InternalMyDsl.g:700:1: rule__RIGHT__Group__0 : rule__RIGHT__Group__0__Impl rule__RIGHT__Group__1 ;
    public final void rule__RIGHT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( rule__RIGHT__Group__0__Impl rule__RIGHT__Group__1 )
            // InternalMyDsl.g:705:2: rule__RIGHT__Group__0__Impl rule__RIGHT__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RIGHT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RIGHT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIGHT__Group__0"


    // $ANTLR start "rule__RIGHT__Group__0__Impl"
    // InternalMyDsl.g:712:1: rule__RIGHT__Group__0__Impl : ( 'RIGHT' ) ;
    public final void rule__RIGHT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:1: ( ( 'RIGHT' ) )
            // InternalMyDsl.g:717:1: ( 'RIGHT' )
            {
            // InternalMyDsl.g:717:1: ( 'RIGHT' )
            // InternalMyDsl.g:718:2: 'RIGHT'
            {
             before(grammarAccess.getRIGHTAccess().getRIGHTKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRIGHTAccess().getRIGHTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIGHT__Group__0__Impl"


    // $ANTLR start "rule__RIGHT__Group__1"
    // InternalMyDsl.g:727:1: rule__RIGHT__Group__1 : rule__RIGHT__Group__1__Impl ;
    public final void rule__RIGHT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( rule__RIGHT__Group__1__Impl )
            // InternalMyDsl.g:732:2: rule__RIGHT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RIGHT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIGHT__Group__1"


    // $ANTLR start "rule__RIGHT__Group__1__Impl"
    // InternalMyDsl.g:738:1: rule__RIGHT__Group__1__Impl : ( ( rule__RIGHT__AmountAssignment_1 ) ) ;
    public final void rule__RIGHT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( ( ( rule__RIGHT__AmountAssignment_1 ) ) )
            // InternalMyDsl.g:743:1: ( ( rule__RIGHT__AmountAssignment_1 ) )
            {
            // InternalMyDsl.g:743:1: ( ( rule__RIGHT__AmountAssignment_1 ) )
            // InternalMyDsl.g:744:2: ( rule__RIGHT__AmountAssignment_1 )
            {
             before(grammarAccess.getRIGHTAccess().getAmountAssignment_1()); 
            // InternalMyDsl.g:745:2: ( rule__RIGHT__AmountAssignment_1 )
            // InternalMyDsl.g:745:3: rule__RIGHT__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RIGHT__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRIGHTAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIGHT__Group__1__Impl"


    // $ANTLR start "rule__LEFT__Group__0"
    // InternalMyDsl.g:754:1: rule__LEFT__Group__0 : rule__LEFT__Group__0__Impl rule__LEFT__Group__1 ;
    public final void rule__LEFT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( rule__LEFT__Group__0__Impl rule__LEFT__Group__1 )
            // InternalMyDsl.g:759:2: rule__LEFT__Group__0__Impl rule__LEFT__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LEFT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LEFT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEFT__Group__0"


    // $ANTLR start "rule__LEFT__Group__0__Impl"
    // InternalMyDsl.g:766:1: rule__LEFT__Group__0__Impl : ( 'LEFT' ) ;
    public final void rule__LEFT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( 'LEFT' ) )
            // InternalMyDsl.g:771:1: ( 'LEFT' )
            {
            // InternalMyDsl.g:771:1: ( 'LEFT' )
            // InternalMyDsl.g:772:2: 'LEFT'
            {
             before(grammarAccess.getLEFTAccess().getLEFTKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLEFTAccess().getLEFTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEFT__Group__0__Impl"


    // $ANTLR start "rule__LEFT__Group__1"
    // InternalMyDsl.g:781:1: rule__LEFT__Group__1 : rule__LEFT__Group__1__Impl ;
    public final void rule__LEFT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( rule__LEFT__Group__1__Impl )
            // InternalMyDsl.g:786:2: rule__LEFT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LEFT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEFT__Group__1"


    // $ANTLR start "rule__LEFT__Group__1__Impl"
    // InternalMyDsl.g:792:1: rule__LEFT__Group__1__Impl : ( ( rule__LEFT__AmountAssignment_1 ) ) ;
    public final void rule__LEFT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( ( ( rule__LEFT__AmountAssignment_1 ) ) )
            // InternalMyDsl.g:797:1: ( ( rule__LEFT__AmountAssignment_1 ) )
            {
            // InternalMyDsl.g:797:1: ( ( rule__LEFT__AmountAssignment_1 ) )
            // InternalMyDsl.g:798:2: ( rule__LEFT__AmountAssignment_1 )
            {
             before(grammarAccess.getLEFTAccess().getAmountAssignment_1()); 
            // InternalMyDsl.g:799:2: ( rule__LEFT__AmountAssignment_1 )
            // InternalMyDsl.g:799:3: rule__LEFT__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LEFT__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLEFTAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEFT__Group__1__Impl"


    // $ANTLR start "rule__PROGRAM__CommandsAssignment"
    // InternalMyDsl.g:808:1: rule__PROGRAM__CommandsAssignment : ( ruleCMD ) ;
    public final void rule__PROGRAM__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( ruleCMD ) )
            // InternalMyDsl.g:813:2: ( ruleCMD )
            {
            // InternalMyDsl.g:813:2: ( ruleCMD )
            // InternalMyDsl.g:814:3: ruleCMD
            {
             before(grammarAccess.getPROGRAMAccess().getCommandsCMDParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCMD();

            state._fsp--;

             after(grammarAccess.getPROGRAMAccess().getCommandsCMDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROGRAM__CommandsAssignment"


    // $ANTLR start "rule__PAPER__SizeXAssignment_1"
    // InternalMyDsl.g:823:1: rule__PAPER__SizeXAssignment_1 : ( RULE_INT ) ;
    public final void rule__PAPER__SizeXAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:828:2: ( RULE_INT )
            {
            // InternalMyDsl.g:828:2: ( RULE_INT )
            // InternalMyDsl.g:829:3: RULE_INT
            {
             before(grammarAccess.getPAPERAccess().getSizeXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPAPERAccess().getSizeXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__SizeXAssignment_1"


    // $ANTLR start "rule__PAPER__SizeYAssignment_2"
    // InternalMyDsl.g:838:1: rule__PAPER__SizeYAssignment_2 : ( RULE_INT ) ;
    public final void rule__PAPER__SizeYAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:843:2: ( RULE_INT )
            {
            // InternalMyDsl.g:843:2: ( RULE_INT )
            // InternalMyDsl.g:844:3: RULE_INT
            {
             before(grammarAccess.getPAPERAccess().getSizeYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPAPERAccess().getSizeYINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__SizeYAssignment_2"


    // $ANTLR start "rule__PAPER__PaperColourAssignment_3"
    // InternalMyDsl.g:853:1: rule__PAPER__PaperColourAssignment_3 : ( RULE_STRING ) ;
    public final void rule__PAPER__PaperColourAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:857:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:858:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:858:2: ( RULE_STRING )
            // InternalMyDsl.g:859:3: RULE_STRING
            {
             before(grammarAccess.getPAPERAccess().getPaperColourSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPAPERAccess().getPaperColourSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PAPER__PaperColourAssignment_3"


    // $ANTLR start "rule__TURTLE__StartPosXAssignment_1"
    // InternalMyDsl.g:868:1: rule__TURTLE__StartPosXAssignment_1 : ( RULE_INT ) ;
    public final void rule__TURTLE__StartPosXAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:873:2: ( RULE_INT )
            {
            // InternalMyDsl.g:873:2: ( RULE_INT )
            // InternalMyDsl.g:874:3: RULE_INT
            {
             before(grammarAccess.getTURTLEAccess().getStartPosXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTURTLEAccess().getStartPosXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TURTLE__StartPosXAssignment_1"


    // $ANTLR start "rule__TURTLE__StartPosYAssignment_2"
    // InternalMyDsl.g:883:1: rule__TURTLE__StartPosYAssignment_2 : ( RULE_INT ) ;
    public final void rule__TURTLE__StartPosYAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:888:2: ( RULE_INT )
            {
            // InternalMyDsl.g:888:2: ( RULE_INT )
            // InternalMyDsl.g:889:3: RULE_INT
            {
             before(grammarAccess.getTURTLEAccess().getStartPosYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTURTLEAccess().getStartPosYINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TURTLE__StartPosYAssignment_2"


    // $ANTLR start "rule__PENSTATE__PenStateAssignment_1"
    // InternalMyDsl.g:898:1: rule__PENSTATE__PenStateAssignment_1 : ( ( rule__PENSTATE__PenStateAlternatives_1_0 ) ) ;
    public final void rule__PENSTATE__PenStateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( ( rule__PENSTATE__PenStateAlternatives_1_0 ) ) )
            // InternalMyDsl.g:903:2: ( ( rule__PENSTATE__PenStateAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:903:2: ( ( rule__PENSTATE__PenStateAlternatives_1_0 ) )
            // InternalMyDsl.g:904:3: ( rule__PENSTATE__PenStateAlternatives_1_0 )
            {
             before(grammarAccess.getPENSTATEAccess().getPenStateAlternatives_1_0()); 
            // InternalMyDsl.g:905:3: ( rule__PENSTATE__PenStateAlternatives_1_0 )
            // InternalMyDsl.g:905:4: rule__PENSTATE__PenStateAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PENSTATE__PenStateAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPENSTATEAccess().getPenStateAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENSTATE__PenStateAssignment_1"


    // $ANTLR start "rule__PENCOLOUR__ColourAssignment_1"
    // InternalMyDsl.g:913:1: rule__PENCOLOUR__ColourAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PENCOLOUR__ColourAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:918:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:918:2: ( RULE_STRING )
            // InternalMyDsl.g:919:3: RULE_STRING
            {
             before(grammarAccess.getPENCOLOURAccess().getColourSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPENCOLOURAccess().getColourSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOUR__ColourAssignment_1"


    // $ANTLR start "rule__MOVE__AmountAssignment_1"
    // InternalMyDsl.g:928:1: rule__MOVE__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__MOVE__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:933:2: ( RULE_INT )
            {
            // InternalMyDsl.g:933:2: ( RULE_INT )
            // InternalMyDsl.g:934:3: RULE_INT
            {
             before(grammarAccess.getMOVEAccess().getAmountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMOVEAccess().getAmountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__AmountAssignment_1"


    // $ANTLR start "rule__RIGHT__AmountAssignment_1"
    // InternalMyDsl.g:943:1: rule__RIGHT__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__RIGHT__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:948:2: ( RULE_INT )
            {
            // InternalMyDsl.g:948:2: ( RULE_INT )
            // InternalMyDsl.g:949:3: RULE_INT
            {
             before(grammarAccess.getRIGHTAccess().getAmountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRIGHTAccess().getAmountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIGHT__AmountAssignment_1"


    // $ANTLR start "rule__LEFT__AmountAssignment_1"
    // InternalMyDsl.g:958:1: rule__LEFT__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__LEFT__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:963:2: ( RULE_INT )
            {
            // InternalMyDsl.g:963:2: ( RULE_INT )
            // InternalMyDsl.g:964:3: RULE_INT
            {
             before(grammarAccess.getLEFTAccess().getAmountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLEFTAccess().getAmountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEFT__AmountAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000FE002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});

}