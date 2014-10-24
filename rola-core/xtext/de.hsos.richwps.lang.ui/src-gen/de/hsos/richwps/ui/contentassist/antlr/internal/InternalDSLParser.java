package de.hsos.richwps.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.hsos.richwps.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IN_REFERENCE_HANDLE", "RULE_OUT_REFERENCE_HANDLE", "RULE_VAR_REFERENCE_HANDLE", "RULE_ID", "RULE_PROTOCOL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bind'", "'process'", "'to'", "'execute'", "'with'", "'store'", "'as'", "'if'", "'end'", "'else'", "'='", "'.'", "'/'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_OUT_REFERENCE_HANDLE=5;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_VAR_REFERENCE_HANDLE=6;
    public static final int T__19=19;
    public static final int RULE_STRING=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int RULE_PROTOCOL=8;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_IN_REFERENCE_HANDLE=4;
    public static final int RULE_INT=9;
    public static final int RULE_WS=13;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g"; }


     
     	private DSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleWorksequence"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:60:1: entryRuleWorksequence : ruleWorksequence EOF ;
    public final void entryRuleWorksequence() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:61:1: ( ruleWorksequence EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:62:1: ruleWorksequence EOF
            {
             before(grammarAccess.getWorksequenceRule()); 
            pushFollow(FOLLOW_ruleWorksequence_in_entryRuleWorksequence61);
            ruleWorksequence();

            state._fsp--;

             after(grammarAccess.getWorksequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorksequence68); 

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
    // $ANTLR end "entryRuleWorksequence"


    // $ANTLR start "ruleWorksequence"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:69:1: ruleWorksequence : ( ( rule__Worksequence__OperationsAssignment )* ) ;
    public final void ruleWorksequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:73:2: ( ( ( rule__Worksequence__OperationsAssignment )* ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:74:1: ( ( rule__Worksequence__OperationsAssignment )* )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:74:1: ( ( rule__Worksequence__OperationsAssignment )* )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:75:1: ( rule__Worksequence__OperationsAssignment )*
            {
             before(grammarAccess.getWorksequenceAccess().getOperationsAssignment()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:76:1: ( rule__Worksequence__OperationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_OUT_REFERENCE_HANDLE && LA1_0<=RULE_VAR_REFERENCE_HANDLE)||LA1_0==15||LA1_0==18||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:76:2: rule__Worksequence__OperationsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Worksequence__OperationsAssignment_in_ruleWorksequence94);
            	    rule__Worksequence__OperationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getWorksequenceAccess().getOperationsAssignment()); 

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
    // $ANTLR end "ruleWorksequence"


    // $ANTLR start "entryRuleOperation"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:88:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:89:1: ( ruleOperation EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:90:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation122);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation129); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:97:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:101:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:102:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:102:1: ( ( rule__Operation__Alternatives ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:103:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:104:1: ( rule__Operation__Alternatives )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:104:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation155);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleLocalBinding"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:116:1: entryRuleLocalBinding : ruleLocalBinding EOF ;
    public final void entryRuleLocalBinding() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:117:1: ( ruleLocalBinding EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:118:1: ruleLocalBinding EOF
            {
             before(grammarAccess.getLocalBindingRule()); 
            pushFollow(FOLLOW_ruleLocalBinding_in_entryRuleLocalBinding182);
            ruleLocalBinding();

            state._fsp--;

             after(grammarAccess.getLocalBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalBinding189); 

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
    // $ANTLR end "entryRuleLocalBinding"


    // $ANTLR start "ruleLocalBinding"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:125:1: ruleLocalBinding : ( ( rule__LocalBinding__Group__0 ) ) ;
    public final void ruleLocalBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:129:2: ( ( ( rule__LocalBinding__Group__0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:130:1: ( ( rule__LocalBinding__Group__0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:130:1: ( ( rule__LocalBinding__Group__0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:131:1: ( rule__LocalBinding__Group__0 )
            {
             before(grammarAccess.getLocalBindingAccess().getGroup()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:132:1: ( rule__LocalBinding__Group__0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:132:2: rule__LocalBinding__Group__0
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__0_in_ruleLocalBinding215);
            rule__LocalBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleLocalBinding"


    // $ANTLR start "entryRuleRemoteBinding"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:144:1: entryRuleRemoteBinding : ruleRemoteBinding EOF ;
    public final void entryRuleRemoteBinding() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:145:1: ( ruleRemoteBinding EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:146:1: ruleRemoteBinding EOF
            {
             before(grammarAccess.getRemoteBindingRule()); 
            pushFollow(FOLLOW_ruleRemoteBinding_in_entryRuleRemoteBinding242);
            ruleRemoteBinding();

            state._fsp--;

             after(grammarAccess.getRemoteBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRemoteBinding249); 

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
    // $ANTLR end "entryRuleRemoteBinding"


    // $ANTLR start "ruleRemoteBinding"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:153:1: ruleRemoteBinding : ( ( rule__RemoteBinding__Group__0 ) ) ;
    public final void ruleRemoteBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:157:2: ( ( ( rule__RemoteBinding__Group__0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:158:1: ( ( rule__RemoteBinding__Group__0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:158:1: ( ( rule__RemoteBinding__Group__0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:159:1: ( rule__RemoteBinding__Group__0 )
            {
             before(grammarAccess.getRemoteBindingAccess().getGroup()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:160:1: ( rule__RemoteBinding__Group__0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:160:2: rule__RemoteBinding__Group__0
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__0_in_ruleRemoteBinding275);
            rule__RemoteBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleRemoteBinding"


    // $ANTLR start "entryRuleExecuteStatement"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:172:1: entryRuleExecuteStatement : ruleExecuteStatement EOF ;
    public final void entryRuleExecuteStatement() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:173:1: ( ruleExecuteStatement EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:174:1: ruleExecuteStatement EOF
            {
             before(grammarAccess.getExecuteStatementRule()); 
            pushFollow(FOLLOW_ruleExecuteStatement_in_entryRuleExecuteStatement302);
            ruleExecuteStatement();

            state._fsp--;

             after(grammarAccess.getExecuteStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecuteStatement309); 

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
    // $ANTLR end "entryRuleExecuteStatement"


    // $ANTLR start "ruleExecuteStatement"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:181:1: ruleExecuteStatement : ( ( rule__ExecuteStatement__Group__0 ) ) ;
    public final void ruleExecuteStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:185:2: ( ( ( rule__ExecuteStatement__Group__0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:186:1: ( ( rule__ExecuteStatement__Group__0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:186:1: ( ( rule__ExecuteStatement__Group__0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:187:1: ( rule__ExecuteStatement__Group__0 )
            {
             before(grammarAccess.getExecuteStatementAccess().getGroup()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:188:1: ( rule__ExecuteStatement__Group__0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:188:2: rule__ExecuteStatement__Group__0
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__0_in_ruleExecuteStatement335);
            rule__ExecuteStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExecuteStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleExecuteStatement"


    // $ANTLR start "entryRuleExecInput"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:200:1: entryRuleExecInput : ruleExecInput EOF ;
    public final void entryRuleExecInput() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:201:1: ( ruleExecInput EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:202:1: ruleExecInput EOF
            {
             before(grammarAccess.getExecInputRule()); 
            pushFollow(FOLLOW_ruleExecInput_in_entryRuleExecInput362);
            ruleExecInput();

            state._fsp--;

             after(grammarAccess.getExecInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecInput369); 

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
    // $ANTLR end "entryRuleExecInput"


    // $ANTLR start "ruleExecInput"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:209:1: ruleExecInput : ( ( rule__ExecInput__Alternatives ) ) ;
    public final void ruleExecInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:213:2: ( ( ( rule__ExecInput__Alternatives ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:214:1: ( ( rule__ExecInput__Alternatives ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:214:1: ( ( rule__ExecInput__Alternatives ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:215:1: ( rule__ExecInput__Alternatives )
            {
             before(grammarAccess.getExecInputAccess().getAlternatives()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:216:1: ( rule__ExecInput__Alternatives )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:216:2: rule__ExecInput__Alternatives
            {
            pushFollow(FOLLOW_rule__ExecInput__Alternatives_in_ruleExecInput395);
            rule__ExecInput__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExecInputAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExecInput"


    // $ANTLR start "entryRuleExecOutput"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:228:1: entryRuleExecOutput : ruleExecOutput EOF ;
    public final void entryRuleExecOutput() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:229:1: ( ruleExecOutput EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:230:1: ruleExecOutput EOF
            {
             before(grammarAccess.getExecOutputRule()); 
            pushFollow(FOLLOW_ruleExecOutput_in_entryRuleExecOutput422);
            ruleExecOutput();

            state._fsp--;

             after(grammarAccess.getExecOutputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecOutput429); 

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
    // $ANTLR end "entryRuleExecOutput"


    // $ANTLR start "ruleExecOutput"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:237:1: ruleExecOutput : ( ( rule__ExecOutput__Alternatives ) ) ;
    public final void ruleExecOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:241:2: ( ( ( rule__ExecOutput__Alternatives ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:242:1: ( ( rule__ExecOutput__Alternatives ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:242:1: ( ( rule__ExecOutput__Alternatives ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:243:1: ( rule__ExecOutput__Alternatives )
            {
             before(grammarAccess.getExecOutputAccess().getAlternatives()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:244:1: ( rule__ExecOutput__Alternatives )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:244:2: rule__ExecOutput__Alternatives
            {
            pushFollow(FOLLOW_rule__ExecOutput__Alternatives_in_ruleExecOutput455);
            rule__ExecOutput__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExecOutputAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExecOutput"


    // $ANTLR start "entryRuleIfStatement"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:256:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:257:1: ( ruleIfStatement EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:258:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement482);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement489); 

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:265:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:269:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:270:1: ( ( rule__IfStatement__Group__0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:270:1: ( ( rule__IfStatement__Group__0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:271:1: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:272:1: ( rule__IfStatement__Group__0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:272:2: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__0_in_ruleIfStatement515);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleAssignment"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:284:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:285:1: ( ruleAssignment EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:286:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment542);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment549); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:293:1: ruleAssignment : ( ( rule__Assignment__Alternatives ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:297:2: ( ( ( rule__Assignment__Alternatives ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:298:1: ( ( rule__Assignment__Alternatives ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:298:1: ( ( rule__Assignment__Alternatives ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:299:1: ( rule__Assignment__Alternatives )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:300:1: ( rule__Assignment__Alternatives )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:300:2: rule__Assignment__Alternatives
            {
            pushFollow(FOLLOW_rule__Assignment__Alternatives_in_ruleAssignment575);
            rule__Assignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleIN_REFERENCE"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:312:1: entryRuleIN_REFERENCE : ruleIN_REFERENCE EOF ;
    public final void entryRuleIN_REFERENCE() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:313:1: ( ruleIN_REFERENCE EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:314:1: ruleIN_REFERENCE EOF
            {
             before(grammarAccess.getIN_REFERENCERule()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_entryRuleIN_REFERENCE602);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIN_REFERENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIN_REFERENCE609); 

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
    // $ANTLR end "entryRuleIN_REFERENCE"


    // $ANTLR start "ruleIN_REFERENCE"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:321:1: ruleIN_REFERENCE : ( ( rule__IN_REFERENCE__Group__0 ) ) ;
    public final void ruleIN_REFERENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:325:2: ( ( ( rule__IN_REFERENCE__Group__0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:326:1: ( ( rule__IN_REFERENCE__Group__0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:326:1: ( ( rule__IN_REFERENCE__Group__0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:327:1: ( rule__IN_REFERENCE__Group__0 )
            {
             before(grammarAccess.getIN_REFERENCEAccess().getGroup()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:328:1: ( rule__IN_REFERENCE__Group__0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:328:2: rule__IN_REFERENCE__Group__0
            {
            pushFollow(FOLLOW_rule__IN_REFERENCE__Group__0_in_ruleIN_REFERENCE635);
            rule__IN_REFERENCE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIN_REFERENCEAccess().getGroup()); 

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
    // $ANTLR end "ruleIN_REFERENCE"


    // $ANTLR start "entryRuleOUT_REFERENCE"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:340:1: entryRuleOUT_REFERENCE : ruleOUT_REFERENCE EOF ;
    public final void entryRuleOUT_REFERENCE() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:341:1: ( ruleOUT_REFERENCE EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:342:1: ruleOUT_REFERENCE EOF
            {
             before(grammarAccess.getOUT_REFERENCERule()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_entryRuleOUT_REFERENCE662);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getOUT_REFERENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOUT_REFERENCE669); 

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
    // $ANTLR end "entryRuleOUT_REFERENCE"


    // $ANTLR start "ruleOUT_REFERENCE"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:349:1: ruleOUT_REFERENCE : ( ( rule__OUT_REFERENCE__Group__0 ) ) ;
    public final void ruleOUT_REFERENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:353:2: ( ( ( rule__OUT_REFERENCE__Group__0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:354:1: ( ( rule__OUT_REFERENCE__Group__0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:354:1: ( ( rule__OUT_REFERENCE__Group__0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:355:1: ( rule__OUT_REFERENCE__Group__0 )
            {
             before(grammarAccess.getOUT_REFERENCEAccess().getGroup()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:356:1: ( rule__OUT_REFERENCE__Group__0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:356:2: rule__OUT_REFERENCE__Group__0
            {
            pushFollow(FOLLOW_rule__OUT_REFERENCE__Group__0_in_ruleOUT_REFERENCE695);
            rule__OUT_REFERENCE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOUT_REFERENCEAccess().getGroup()); 

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
    // $ANTLR end "ruleOUT_REFERENCE"


    // $ANTLR start "entryRuleVAR_REFERENCE"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:368:1: entryRuleVAR_REFERENCE : ruleVAR_REFERENCE EOF ;
    public final void entryRuleVAR_REFERENCE() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:369:1: ( ruleVAR_REFERENCE EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:370:1: ruleVAR_REFERENCE EOF
            {
             before(grammarAccess.getVAR_REFERENCERule()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_entryRuleVAR_REFERENCE722);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getVAR_REFERENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAR_REFERENCE729); 

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
    // $ANTLR end "entryRuleVAR_REFERENCE"


    // $ANTLR start "ruleVAR_REFERENCE"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:377:1: ruleVAR_REFERENCE : ( ( rule__VAR_REFERENCE__Group__0 ) ) ;
    public final void ruleVAR_REFERENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:381:2: ( ( ( rule__VAR_REFERENCE__Group__0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:382:1: ( ( rule__VAR_REFERENCE__Group__0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:382:1: ( ( rule__VAR_REFERENCE__Group__0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:383:1: ( rule__VAR_REFERENCE__Group__0 )
            {
             before(grammarAccess.getVAR_REFERENCEAccess().getGroup()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:384:1: ( rule__VAR_REFERENCE__Group__0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:384:2: rule__VAR_REFERENCE__Group__0
            {
            pushFollow(FOLLOW_rule__VAR_REFERENCE__Group__0_in_ruleVAR_REFERENCE755);
            rule__VAR_REFERENCE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVAR_REFERENCEAccess().getGroup()); 

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
    // $ANTLR end "ruleVAR_REFERENCE"


    // $ANTLR start "entryRuleQUALIFIEDNAME"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:396:1: entryRuleQUALIFIEDNAME : ruleQUALIFIEDNAME EOF ;
    public final void entryRuleQUALIFIEDNAME() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:397:1: ( ruleQUALIFIEDNAME EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:398:1: ruleQUALIFIEDNAME EOF
            {
             before(grammarAccess.getQUALIFIEDNAMERule()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_entryRuleQUALIFIEDNAME782);
            ruleQUALIFIEDNAME();

            state._fsp--;

             after(grammarAccess.getQUALIFIEDNAMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDNAME789); 

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
    // $ANTLR end "entryRuleQUALIFIEDNAME"


    // $ANTLR start "ruleQUALIFIEDNAME"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:405:1: ruleQUALIFIEDNAME : ( ( rule__QUALIFIEDNAME__Group__0 ) ) ;
    public final void ruleQUALIFIEDNAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:409:2: ( ( ( rule__QUALIFIEDNAME__Group__0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:410:1: ( ( rule__QUALIFIEDNAME__Group__0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:410:1: ( ( rule__QUALIFIEDNAME__Group__0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:411:1: ( rule__QUALIFIEDNAME__Group__0 )
            {
             before(grammarAccess.getQUALIFIEDNAMEAccess().getGroup()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:412:1: ( rule__QUALIFIEDNAME__Group__0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:412:2: rule__QUALIFIEDNAME__Group__0
            {
            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group__0_in_ruleQUALIFIEDNAME815);
            rule__QUALIFIEDNAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQUALIFIEDNAMEAccess().getGroup()); 

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
    // $ANTLR end "ruleQUALIFIEDNAME"


    // $ANTLR start "entryRuleQUALIFIEDID"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:424:1: entryRuleQUALIFIEDID : ruleQUALIFIEDID EOF ;
    public final void entryRuleQUALIFIEDID() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:425:1: ( ruleQUALIFIEDID EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:426:1: ruleQUALIFIEDID EOF
            {
             before(grammarAccess.getQUALIFIEDIDRule()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID842);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getQUALIFIEDIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDID849); 

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
    // $ANTLR end "entryRuleQUALIFIEDID"


    // $ANTLR start "ruleQUALIFIEDID"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:433:1: ruleQUALIFIEDID : ( ( rule__QUALIFIEDID__Group__0 ) ) ;
    public final void ruleQUALIFIEDID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:437:2: ( ( ( rule__QUALIFIEDID__Group__0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:438:1: ( ( rule__QUALIFIEDID__Group__0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:438:1: ( ( rule__QUALIFIEDID__Group__0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:439:1: ( rule__QUALIFIEDID__Group__0 )
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getGroup()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:440:1: ( rule__QUALIFIEDID__Group__0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:440:2: rule__QUALIFIEDID__Group__0
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__0_in_ruleQUALIFIEDID875);
            rule__QUALIFIEDID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQUALIFIEDIDAccess().getGroup()); 

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
    // $ANTLR end "ruleQUALIFIEDID"


    // $ANTLR start "entryRuleURI"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:452:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:453:1: ( ruleURI EOF )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:454:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI902);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI909); 

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:461:1: ruleURI : ( ( rule__URI__Group__0 )* ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:465:2: ( ( ( rule__URI__Group__0 )* ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:466:1: ( ( rule__URI__Group__0 )* )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:466:1: ( ( rule__URI__Group__0 )* )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:467:1: ( rule__URI__Group__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:468:1: ( rule__URI__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:468:2: rule__URI__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI935);
            	    rule__URI__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getURIAccess().getGroup()); 

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
    // $ANTLR end "ruleURI"


    // $ANTLR start "rule__Operation__Alternatives"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:480:1: rule__Operation__Alternatives : ( ( ruleLocalBinding ) | ( ruleRemoteBinding ) | ( ruleAssignment ) | ( ruleExecuteStatement ) | ( ruleIfStatement ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:484:1: ( ( ruleLocalBinding ) | ( ruleRemoteBinding ) | ( ruleAssignment ) | ( ruleExecuteStatement ) | ( ruleIfStatement ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==16) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==RULE_ID) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==RULE_PROTOCOL) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_OUT_REFERENCE_HANDLE:
            case RULE_VAR_REFERENCE_HANDLE:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:485:1: ( ruleLocalBinding )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:485:1: ( ruleLocalBinding )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:486:1: ruleLocalBinding
                    {
                     before(grammarAccess.getOperationAccess().getLocalBindingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLocalBinding_in_rule__Operation__Alternatives972);
                    ruleLocalBinding();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getLocalBindingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:491:6: ( ruleRemoteBinding )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:491:6: ( ruleRemoteBinding )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:492:1: ruleRemoteBinding
                    {
                     before(grammarAccess.getOperationAccess().getRemoteBindingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRemoteBinding_in_rule__Operation__Alternatives989);
                    ruleRemoteBinding();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getRemoteBindingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:497:6: ( ruleAssignment )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:497:6: ( ruleAssignment )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:498:1: ruleAssignment
                    {
                     before(grammarAccess.getOperationAccess().getAssignmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Operation__Alternatives1006);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getAssignmentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:503:6: ( ruleExecuteStatement )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:503:6: ( ruleExecuteStatement )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:504:1: ruleExecuteStatement
                    {
                     before(grammarAccess.getOperationAccess().getExecuteStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExecuteStatement_in_rule__Operation__Alternatives1023);
                    ruleExecuteStatement();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getExecuteStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:509:6: ( ruleIfStatement )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:509:6: ( ruleIfStatement )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:510:1: ruleIfStatement
                    {
                     before(grammarAccess.getOperationAccess().getIfStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleIfStatement_in_rule__Operation__Alternatives1040);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getIfStatementParserRuleCall_4()); 

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__ExecInput__Alternatives"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:520:1: rule__ExecInput__Alternatives : ( ( ( rule__ExecInput__Group_0__0 ) ) | ( ( rule__ExecInput__Group_1__0 ) ) );
    public final void rule__ExecInput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:524:1: ( ( ( rule__ExecInput__Group_0__0 ) ) | ( ( rule__ExecInput__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_IN_REFERENCE_HANDLE) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_VAR_REFERENCE_HANDLE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:525:1: ( ( rule__ExecInput__Group_0__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:525:1: ( ( rule__ExecInput__Group_0__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:526:1: ( rule__ExecInput__Group_0__0 )
                    {
                     before(grammarAccess.getExecInputAccess().getGroup_0()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:527:1: ( rule__ExecInput__Group_0__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:527:2: rule__ExecInput__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExecInput__Group_0__0_in_rule__ExecInput__Alternatives1072);
                    rule__ExecInput__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecInputAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:531:6: ( ( rule__ExecInput__Group_1__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:531:6: ( ( rule__ExecInput__Group_1__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:532:1: ( rule__ExecInput__Group_1__0 )
                    {
                     before(grammarAccess.getExecInputAccess().getGroup_1()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:533:1: ( rule__ExecInput__Group_1__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:533:2: rule__ExecInput__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExecInput__Group_1__0_in_rule__ExecInput__Alternatives1090);
                    rule__ExecInput__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecInputAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExecInput__Alternatives"


    // $ANTLR start "rule__ExecOutput__Alternatives"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:542:1: rule__ExecOutput__Alternatives : ( ( ( rule__ExecOutput__Group_0__0 ) ) | ( ( rule__ExecOutput__Group_1__0 ) ) );
    public final void rule__ExecOutput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:546:1: ( ( ( rule__ExecOutput__Group_0__0 ) ) | ( ( rule__ExecOutput__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==21) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_VAR_REFERENCE_HANDLE) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==RULE_OUT_REFERENCE_HANDLE) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:547:1: ( ( rule__ExecOutput__Group_0__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:547:1: ( ( rule__ExecOutput__Group_0__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:548:1: ( rule__ExecOutput__Group_0__0 )
                    {
                     before(grammarAccess.getExecOutputAccess().getGroup_0()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:549:1: ( rule__ExecOutput__Group_0__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:549:2: rule__ExecOutput__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExecOutput__Group_0__0_in_rule__ExecOutput__Alternatives1123);
                    rule__ExecOutput__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecOutputAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:553:6: ( ( rule__ExecOutput__Group_1__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:553:6: ( ( rule__ExecOutput__Group_1__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:554:1: ( rule__ExecOutput__Group_1__0 )
                    {
                     before(grammarAccess.getExecOutputAccess().getGroup_1()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:555:1: ( rule__ExecOutput__Group_1__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:555:2: rule__ExecOutput__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExecOutput__Group_1__0_in_rule__ExecOutput__Alternatives1141);
                    rule__ExecOutput__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecOutputAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExecOutput__Alternatives"


    // $ANTLR start "rule__IfStatement__Alternatives_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:564:1: rule__IfStatement__Alternatives_1 : ( ( ( rule__IfStatement__Group_1_0__0 ) ) | ( ( rule__IfStatement__Group_1_1__0 ) ) | ( ( rule__IfStatement__Group_1_2__0 ) ) | ( ( rule__IfStatement__Group_1_3__0 ) ) | ( ( rule__IfStatement__Group_1_4__0 ) ) | ( ( rule__IfStatement__Group_1_5__0 ) ) | ( ( rule__IfStatement__Group_1_6__0 ) ) | ( ( rule__IfStatement__Group_1_7__0 ) ) | ( ( rule__IfStatement__Group_1_8__0 ) ) | ( ( rule__IfStatement__Group_1_9__0 ) ) | ( ( rule__IfStatement__Group_1_10__0 ) ) );
    public final void rule__IfStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:568:1: ( ( ( rule__IfStatement__Group_1_0__0 ) ) | ( ( rule__IfStatement__Group_1_1__0 ) ) | ( ( rule__IfStatement__Group_1_2__0 ) ) | ( ( rule__IfStatement__Group_1_3__0 ) ) | ( ( rule__IfStatement__Group_1_4__0 ) ) | ( ( rule__IfStatement__Group_1_5__0 ) ) | ( ( rule__IfStatement__Group_1_6__0 ) ) | ( ( rule__IfStatement__Group_1_7__0 ) ) | ( ( rule__IfStatement__Group_1_8__0 ) ) | ( ( rule__IfStatement__Group_1_9__0 ) ) | ( ( rule__IfStatement__Group_1_10__0 ) ) )
            int alt6=11;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:569:1: ( ( rule__IfStatement__Group_1_0__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:569:1: ( ( rule__IfStatement__Group_1_0__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:570:1: ( rule__IfStatement__Group_1_0__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_0()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:571:1: ( rule__IfStatement__Group_1_0__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:571:2: rule__IfStatement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_0__0_in_rule__IfStatement__Alternatives_11174);
                    rule__IfStatement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:575:6: ( ( rule__IfStatement__Group_1_1__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:575:6: ( ( rule__IfStatement__Group_1_1__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:576:1: ( rule__IfStatement__Group_1_1__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_1()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:577:1: ( rule__IfStatement__Group_1_1__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:577:2: rule__IfStatement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_1__0_in_rule__IfStatement__Alternatives_11192);
                    rule__IfStatement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:581:6: ( ( rule__IfStatement__Group_1_2__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:581:6: ( ( rule__IfStatement__Group_1_2__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:582:1: ( rule__IfStatement__Group_1_2__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_2()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:583:1: ( rule__IfStatement__Group_1_2__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:583:2: rule__IfStatement__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_2__0_in_rule__IfStatement__Alternatives_11210);
                    rule__IfStatement__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:587:6: ( ( rule__IfStatement__Group_1_3__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:587:6: ( ( rule__IfStatement__Group_1_3__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:588:1: ( rule__IfStatement__Group_1_3__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_3()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:589:1: ( rule__IfStatement__Group_1_3__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:589:2: rule__IfStatement__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_3__0_in_rule__IfStatement__Alternatives_11228);
                    rule__IfStatement__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:593:6: ( ( rule__IfStatement__Group_1_4__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:593:6: ( ( rule__IfStatement__Group_1_4__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:594:1: ( rule__IfStatement__Group_1_4__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_4()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:595:1: ( rule__IfStatement__Group_1_4__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:595:2: rule__IfStatement__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_4__0_in_rule__IfStatement__Alternatives_11246);
                    rule__IfStatement__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:599:6: ( ( rule__IfStatement__Group_1_5__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:599:6: ( ( rule__IfStatement__Group_1_5__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:600:1: ( rule__IfStatement__Group_1_5__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_5()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:601:1: ( rule__IfStatement__Group_1_5__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:601:2: rule__IfStatement__Group_1_5__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_5__0_in_rule__IfStatement__Alternatives_11264);
                    rule__IfStatement__Group_1_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:605:6: ( ( rule__IfStatement__Group_1_6__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:605:6: ( ( rule__IfStatement__Group_1_6__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:606:1: ( rule__IfStatement__Group_1_6__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_6()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:607:1: ( rule__IfStatement__Group_1_6__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:607:2: rule__IfStatement__Group_1_6__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_6__0_in_rule__IfStatement__Alternatives_11282);
                    rule__IfStatement__Group_1_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:611:6: ( ( rule__IfStatement__Group_1_7__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:611:6: ( ( rule__IfStatement__Group_1_7__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:612:1: ( rule__IfStatement__Group_1_7__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_7()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:613:1: ( rule__IfStatement__Group_1_7__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:613:2: rule__IfStatement__Group_1_7__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_7__0_in_rule__IfStatement__Alternatives_11300);
                    rule__IfStatement__Group_1_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:617:6: ( ( rule__IfStatement__Group_1_8__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:617:6: ( ( rule__IfStatement__Group_1_8__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:618:1: ( rule__IfStatement__Group_1_8__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_8()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:619:1: ( rule__IfStatement__Group_1_8__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:619:2: rule__IfStatement__Group_1_8__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_8__0_in_rule__IfStatement__Alternatives_11318);
                    rule__IfStatement__Group_1_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:623:6: ( ( rule__IfStatement__Group_1_9__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:623:6: ( ( rule__IfStatement__Group_1_9__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:624:1: ( rule__IfStatement__Group_1_9__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_9()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:625:1: ( rule__IfStatement__Group_1_9__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:625:2: rule__IfStatement__Group_1_9__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_9__0_in_rule__IfStatement__Alternatives_11336);
                    rule__IfStatement__Group_1_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:629:6: ( ( rule__IfStatement__Group_1_10__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:629:6: ( ( rule__IfStatement__Group_1_10__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:630:1: ( rule__IfStatement__Group_1_10__0 )
                    {
                     before(grammarAccess.getIfStatementAccess().getGroup_1_10()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:631:1: ( rule__IfStatement__Group_1_10__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:631:2: rule__IfStatement__Group_1_10__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_1_10__0_in_rule__IfStatement__Alternatives_11354);
                    rule__IfStatement__Group_1_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIfStatementAccess().getGroup_1_10()); 

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
    // $ANTLR end "rule__IfStatement__Alternatives_1"


    // $ANTLR start "rule__IfStatement__IfoperationsAlternatives_2_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:640:1: rule__IfStatement__IfoperationsAlternatives_2_0 : ( ( ruleAssignment ) | ( ruleExecuteStatement ) );
    public final void rule__IfStatement__IfoperationsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:644:1: ( ( ruleAssignment ) | ( ruleExecuteStatement ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_OUT_REFERENCE_HANDLE && LA7_0<=RULE_VAR_REFERENCE_HANDLE)) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:645:1: ( ruleAssignment )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:645:1: ( ruleAssignment )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:646:1: ruleAssignment
                    {
                     before(grammarAccess.getIfStatementAccess().getIfoperationsAssignmentParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_ruleAssignment_in_rule__IfStatement__IfoperationsAlternatives_2_01387);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getIfStatementAccess().getIfoperationsAssignmentParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:651:6: ( ruleExecuteStatement )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:651:6: ( ruleExecuteStatement )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:652:1: ruleExecuteStatement
                    {
                     before(grammarAccess.getIfStatementAccess().getIfoperationsExecuteStatementParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_ruleExecuteStatement_in_rule__IfStatement__IfoperationsAlternatives_2_01404);
                    ruleExecuteStatement();

                    state._fsp--;

                     after(grammarAccess.getIfStatementAccess().getIfoperationsExecuteStatementParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__IfStatement__IfoperationsAlternatives_2_0"


    // $ANTLR start "rule__IfStatement__ElseoperationsAlternatives_3_1_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:662:1: rule__IfStatement__ElseoperationsAlternatives_3_1_0 : ( ( ruleAssignment ) | ( ruleExecuteStatement ) );
    public final void rule__IfStatement__ElseoperationsAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:666:1: ( ( ruleAssignment ) | ( ruleExecuteStatement ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_OUT_REFERENCE_HANDLE && LA8_0<=RULE_VAR_REFERENCE_HANDLE)) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:667:1: ( ruleAssignment )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:667:1: ( ruleAssignment )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:668:1: ruleAssignment
                    {
                     before(grammarAccess.getIfStatementAccess().getElseoperationsAssignmentParserRuleCall_3_1_0_0()); 
                    pushFollow(FOLLOW_ruleAssignment_in_rule__IfStatement__ElseoperationsAlternatives_3_1_01436);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getIfStatementAccess().getElseoperationsAssignmentParserRuleCall_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:673:6: ( ruleExecuteStatement )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:673:6: ( ruleExecuteStatement )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:674:1: ruleExecuteStatement
                    {
                     before(grammarAccess.getIfStatementAccess().getElseoperationsExecuteStatementParserRuleCall_3_1_0_1()); 
                    pushFollow(FOLLOW_ruleExecuteStatement_in_rule__IfStatement__ElseoperationsAlternatives_3_1_01453);
                    ruleExecuteStatement();

                    state._fsp--;

                     after(grammarAccess.getIfStatementAccess().getElseoperationsExecuteStatementParserRuleCall_3_1_0_1()); 

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
    // $ANTLR end "rule__IfStatement__ElseoperationsAlternatives_3_1_0"


    // $ANTLR start "rule__Assignment__Alternatives"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:684:1: rule__Assignment__Alternatives : ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__Group_1__0 ) ) | ( ( rule__Assignment__Group_2__0 ) ) | ( ( rule__Assignment__Group_3__0 ) ) );
    public final void rule__Assignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:688:1: ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__Group_1__0 ) ) | ( ( rule__Assignment__Group_2__0 ) ) | ( ( rule__Assignment__Group_3__0 ) ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:689:1: ( ( rule__Assignment__Group_0__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:689:1: ( ( rule__Assignment__Group_0__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:690:1: ( rule__Assignment__Group_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_0()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:691:1: ( rule__Assignment__Group_0__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:691:2: rule__Assignment__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Assignment__Group_0__0_in_rule__Assignment__Alternatives1485);
                    rule__Assignment__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:695:6: ( ( rule__Assignment__Group_1__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:695:6: ( ( rule__Assignment__Group_1__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:696:1: ( rule__Assignment__Group_1__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_1()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:697:1: ( rule__Assignment__Group_1__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:697:2: rule__Assignment__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Assignment__Group_1__0_in_rule__Assignment__Alternatives1503);
                    rule__Assignment__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:701:6: ( ( rule__Assignment__Group_2__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:701:6: ( ( rule__Assignment__Group_2__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:702:1: ( rule__Assignment__Group_2__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_2()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:703:1: ( rule__Assignment__Group_2__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:703:2: rule__Assignment__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Assignment__Group_2__0_in_rule__Assignment__Alternatives1521);
                    rule__Assignment__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:707:6: ( ( rule__Assignment__Group_3__0 ) )
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:707:6: ( ( rule__Assignment__Group_3__0 ) )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:708:1: ( rule__Assignment__Group_3__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_3()); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:709:1: ( rule__Assignment__Group_3__0 )
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:709:2: rule__Assignment__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Assignment__Group_3__0_in_rule__Assignment__Alternatives1539);
                    rule__Assignment__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Assignment__Alternatives"


    // $ANTLR start "rule__LocalBinding__Group__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:720:1: rule__LocalBinding__Group__0 : rule__LocalBinding__Group__0__Impl rule__LocalBinding__Group__1 ;
    public final void rule__LocalBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:724:1: ( rule__LocalBinding__Group__0__Impl rule__LocalBinding__Group__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:725:2: rule__LocalBinding__Group__0__Impl rule__LocalBinding__Group__1
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__0__Impl_in_rule__LocalBinding__Group__01570);
            rule__LocalBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalBinding__Group__1_in_rule__LocalBinding__Group__01573);
            rule__LocalBinding__Group__1();

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
    // $ANTLR end "rule__LocalBinding__Group__0"


    // $ANTLR start "rule__LocalBinding__Group__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:732:1: rule__LocalBinding__Group__0__Impl : ( 'bind' ) ;
    public final void rule__LocalBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:736:1: ( ( 'bind' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:737:1: ( 'bind' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:737:1: ( 'bind' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:738:1: 'bind'
            {
             before(grammarAccess.getLocalBindingAccess().getBindKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__LocalBinding__Group__0__Impl1601); 
             after(grammarAccess.getLocalBindingAccess().getBindKeyword_0()); 

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
    // $ANTLR end "rule__LocalBinding__Group__0__Impl"


    // $ANTLR start "rule__LocalBinding__Group__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:751:1: rule__LocalBinding__Group__1 : rule__LocalBinding__Group__1__Impl rule__LocalBinding__Group__2 ;
    public final void rule__LocalBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:755:1: ( rule__LocalBinding__Group__1__Impl rule__LocalBinding__Group__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:756:2: rule__LocalBinding__Group__1__Impl rule__LocalBinding__Group__2
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__1__Impl_in_rule__LocalBinding__Group__11632);
            rule__LocalBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalBinding__Group__2_in_rule__LocalBinding__Group__11635);
            rule__LocalBinding__Group__2();

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
    // $ANTLR end "rule__LocalBinding__Group__1"


    // $ANTLR start "rule__LocalBinding__Group__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:763:1: rule__LocalBinding__Group__1__Impl : ( 'process' ) ;
    public final void rule__LocalBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:767:1: ( ( 'process' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:768:1: ( 'process' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:768:1: ( 'process' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:769:1: 'process'
            {
             before(grammarAccess.getLocalBindingAccess().getProcessKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__LocalBinding__Group__1__Impl1663); 
             after(grammarAccess.getLocalBindingAccess().getProcessKeyword_1()); 

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
    // $ANTLR end "rule__LocalBinding__Group__1__Impl"


    // $ANTLR start "rule__LocalBinding__Group__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:782:1: rule__LocalBinding__Group__2 : rule__LocalBinding__Group__2__Impl rule__LocalBinding__Group__3 ;
    public final void rule__LocalBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:786:1: ( rule__LocalBinding__Group__2__Impl rule__LocalBinding__Group__3 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:787:2: rule__LocalBinding__Group__2__Impl rule__LocalBinding__Group__3
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__2__Impl_in_rule__LocalBinding__Group__21694);
            rule__LocalBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalBinding__Group__3_in_rule__LocalBinding__Group__21697);
            rule__LocalBinding__Group__3();

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
    // $ANTLR end "rule__LocalBinding__Group__2"


    // $ANTLR start "rule__LocalBinding__Group__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:794:1: rule__LocalBinding__Group__2__Impl : ( ( rule__LocalBinding__ProcessidAssignment_2 ) ) ;
    public final void rule__LocalBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:798:1: ( ( ( rule__LocalBinding__ProcessidAssignment_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:799:1: ( ( rule__LocalBinding__ProcessidAssignment_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:799:1: ( ( rule__LocalBinding__ProcessidAssignment_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:800:1: ( rule__LocalBinding__ProcessidAssignment_2 )
            {
             before(grammarAccess.getLocalBindingAccess().getProcessidAssignment_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:801:1: ( rule__LocalBinding__ProcessidAssignment_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:801:2: rule__LocalBinding__ProcessidAssignment_2
            {
            pushFollow(FOLLOW_rule__LocalBinding__ProcessidAssignment_2_in_rule__LocalBinding__Group__2__Impl1724);
            rule__LocalBinding__ProcessidAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalBindingAccess().getProcessidAssignment_2()); 

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
    // $ANTLR end "rule__LocalBinding__Group__2__Impl"


    // $ANTLR start "rule__LocalBinding__Group__3"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:811:1: rule__LocalBinding__Group__3 : rule__LocalBinding__Group__3__Impl rule__LocalBinding__Group__4 ;
    public final void rule__LocalBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:815:1: ( rule__LocalBinding__Group__3__Impl rule__LocalBinding__Group__4 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:816:2: rule__LocalBinding__Group__3__Impl rule__LocalBinding__Group__4
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__3__Impl_in_rule__LocalBinding__Group__31754);
            rule__LocalBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalBinding__Group__4_in_rule__LocalBinding__Group__31757);
            rule__LocalBinding__Group__4();

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
    // $ANTLR end "rule__LocalBinding__Group__3"


    // $ANTLR start "rule__LocalBinding__Group__3__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:823:1: rule__LocalBinding__Group__3__Impl : ( 'to' ) ;
    public final void rule__LocalBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:827:1: ( ( 'to' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:828:1: ( 'to' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:828:1: ( 'to' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:829:1: 'to'
            {
             before(grammarAccess.getLocalBindingAccess().getToKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__LocalBinding__Group__3__Impl1785); 
             after(grammarAccess.getLocalBindingAccess().getToKeyword_3()); 

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
    // $ANTLR end "rule__LocalBinding__Group__3__Impl"


    // $ANTLR start "rule__LocalBinding__Group__4"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:842:1: rule__LocalBinding__Group__4 : rule__LocalBinding__Group__4__Impl ;
    public final void rule__LocalBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:846:1: ( rule__LocalBinding__Group__4__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:847:2: rule__LocalBinding__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LocalBinding__Group__4__Impl_in_rule__LocalBinding__Group__41816);
            rule__LocalBinding__Group__4__Impl();

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
    // $ANTLR end "rule__LocalBinding__Group__4"


    // $ANTLR start "rule__LocalBinding__Group__4__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:853:1: rule__LocalBinding__Group__4__Impl : ( ( rule__LocalBinding__HandleAssignment_4 ) ) ;
    public final void rule__LocalBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:857:1: ( ( ( rule__LocalBinding__HandleAssignment_4 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:858:1: ( ( rule__LocalBinding__HandleAssignment_4 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:858:1: ( ( rule__LocalBinding__HandleAssignment_4 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:859:1: ( rule__LocalBinding__HandleAssignment_4 )
            {
             before(grammarAccess.getLocalBindingAccess().getHandleAssignment_4()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:860:1: ( rule__LocalBinding__HandleAssignment_4 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:860:2: rule__LocalBinding__HandleAssignment_4
            {
            pushFollow(FOLLOW_rule__LocalBinding__HandleAssignment_4_in_rule__LocalBinding__Group__4__Impl1843);
            rule__LocalBinding__HandleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLocalBindingAccess().getHandleAssignment_4()); 

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
    // $ANTLR end "rule__LocalBinding__Group__4__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:880:1: rule__RemoteBinding__Group__0 : rule__RemoteBinding__Group__0__Impl rule__RemoteBinding__Group__1 ;
    public final void rule__RemoteBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:884:1: ( rule__RemoteBinding__Group__0__Impl rule__RemoteBinding__Group__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:885:2: rule__RemoteBinding__Group__0__Impl rule__RemoteBinding__Group__1
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__0__Impl_in_rule__RemoteBinding__Group__01883);
            rule__RemoteBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__1_in_rule__RemoteBinding__Group__01886);
            rule__RemoteBinding__Group__1();

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
    // $ANTLR end "rule__RemoteBinding__Group__0"


    // $ANTLR start "rule__RemoteBinding__Group__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:892:1: rule__RemoteBinding__Group__0__Impl : ( 'bind' ) ;
    public final void rule__RemoteBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:896:1: ( ( 'bind' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:897:1: ( 'bind' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:897:1: ( 'bind' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:898:1: 'bind'
            {
             before(grammarAccess.getRemoteBindingAccess().getBindKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__RemoteBinding__Group__0__Impl1914); 
             after(grammarAccess.getRemoteBindingAccess().getBindKeyword_0()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__0__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:911:1: rule__RemoteBinding__Group__1 : rule__RemoteBinding__Group__1__Impl rule__RemoteBinding__Group__2 ;
    public final void rule__RemoteBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:915:1: ( rule__RemoteBinding__Group__1__Impl rule__RemoteBinding__Group__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:916:2: rule__RemoteBinding__Group__1__Impl rule__RemoteBinding__Group__2
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__1__Impl_in_rule__RemoteBinding__Group__11945);
            rule__RemoteBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__2_in_rule__RemoteBinding__Group__11948);
            rule__RemoteBinding__Group__2();

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
    // $ANTLR end "rule__RemoteBinding__Group__1"


    // $ANTLR start "rule__RemoteBinding__Group__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:923:1: rule__RemoteBinding__Group__1__Impl : ( 'process' ) ;
    public final void rule__RemoteBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:927:1: ( ( 'process' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:928:1: ( 'process' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:928:1: ( 'process' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:929:1: 'process'
            {
             before(grammarAccess.getRemoteBindingAccess().getProcessKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__RemoteBinding__Group__1__Impl1976); 
             after(grammarAccess.getRemoteBindingAccess().getProcessKeyword_1()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__1__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:942:1: rule__RemoteBinding__Group__2 : rule__RemoteBinding__Group__2__Impl rule__RemoteBinding__Group__3 ;
    public final void rule__RemoteBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:946:1: ( rule__RemoteBinding__Group__2__Impl rule__RemoteBinding__Group__3 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:947:2: rule__RemoteBinding__Group__2__Impl rule__RemoteBinding__Group__3
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__2__Impl_in_rule__RemoteBinding__Group__22007);
            rule__RemoteBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__3_in_rule__RemoteBinding__Group__22010);
            rule__RemoteBinding__Group__3();

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
    // $ANTLR end "rule__RemoteBinding__Group__2"


    // $ANTLR start "rule__RemoteBinding__Group__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:954:1: rule__RemoteBinding__Group__2__Impl : ( ( rule__RemoteBinding__ProtocolAssignment_2 ) ) ;
    public final void rule__RemoteBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:958:1: ( ( ( rule__RemoteBinding__ProtocolAssignment_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:959:1: ( ( rule__RemoteBinding__ProtocolAssignment_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:959:1: ( ( rule__RemoteBinding__ProtocolAssignment_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:960:1: ( rule__RemoteBinding__ProtocolAssignment_2 )
            {
             before(grammarAccess.getRemoteBindingAccess().getProtocolAssignment_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:961:1: ( rule__RemoteBinding__ProtocolAssignment_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:961:2: rule__RemoteBinding__ProtocolAssignment_2
            {
            pushFollow(FOLLOW_rule__RemoteBinding__ProtocolAssignment_2_in_rule__RemoteBinding__Group__2__Impl2037);
            rule__RemoteBinding__ProtocolAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getProtocolAssignment_2()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__2__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__3"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:971:1: rule__RemoteBinding__Group__3 : rule__RemoteBinding__Group__3__Impl rule__RemoteBinding__Group__4 ;
    public final void rule__RemoteBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:975:1: ( rule__RemoteBinding__Group__3__Impl rule__RemoteBinding__Group__4 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:976:2: rule__RemoteBinding__Group__3__Impl rule__RemoteBinding__Group__4
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__3__Impl_in_rule__RemoteBinding__Group__32067);
            rule__RemoteBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__4_in_rule__RemoteBinding__Group__32070);
            rule__RemoteBinding__Group__4();

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
    // $ANTLR end "rule__RemoteBinding__Group__3"


    // $ANTLR start "rule__RemoteBinding__Group__3__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:983:1: rule__RemoteBinding__Group__3__Impl : ( ( rule__RemoteBinding__HostAssignment_3 ) ) ;
    public final void rule__RemoteBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:987:1: ( ( ( rule__RemoteBinding__HostAssignment_3 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:988:1: ( ( rule__RemoteBinding__HostAssignment_3 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:988:1: ( ( rule__RemoteBinding__HostAssignment_3 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:989:1: ( rule__RemoteBinding__HostAssignment_3 )
            {
             before(grammarAccess.getRemoteBindingAccess().getHostAssignment_3()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:990:1: ( rule__RemoteBinding__HostAssignment_3 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:990:2: rule__RemoteBinding__HostAssignment_3
            {
            pushFollow(FOLLOW_rule__RemoteBinding__HostAssignment_3_in_rule__RemoteBinding__Group__3__Impl2097);
            rule__RemoteBinding__HostAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getHostAssignment_3()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__3__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__4"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1000:1: rule__RemoteBinding__Group__4 : rule__RemoteBinding__Group__4__Impl rule__RemoteBinding__Group__5 ;
    public final void rule__RemoteBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1004:1: ( rule__RemoteBinding__Group__4__Impl rule__RemoteBinding__Group__5 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1005:2: rule__RemoteBinding__Group__4__Impl rule__RemoteBinding__Group__5
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__4__Impl_in_rule__RemoteBinding__Group__42127);
            rule__RemoteBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__5_in_rule__RemoteBinding__Group__42130);
            rule__RemoteBinding__Group__5();

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
    // $ANTLR end "rule__RemoteBinding__Group__4"


    // $ANTLR start "rule__RemoteBinding__Group__4__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1012:1: rule__RemoteBinding__Group__4__Impl : ( ( rule__RemoteBinding__PortAssignment_4 ) ) ;
    public final void rule__RemoteBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1016:1: ( ( ( rule__RemoteBinding__PortAssignment_4 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1017:1: ( ( rule__RemoteBinding__PortAssignment_4 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1017:1: ( ( rule__RemoteBinding__PortAssignment_4 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1018:1: ( rule__RemoteBinding__PortAssignment_4 )
            {
             before(grammarAccess.getRemoteBindingAccess().getPortAssignment_4()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1019:1: ( rule__RemoteBinding__PortAssignment_4 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1019:2: rule__RemoteBinding__PortAssignment_4
            {
            pushFollow(FOLLOW_rule__RemoteBinding__PortAssignment_4_in_rule__RemoteBinding__Group__4__Impl2157);
            rule__RemoteBinding__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getPortAssignment_4()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__4__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__5"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1029:1: rule__RemoteBinding__Group__5 : rule__RemoteBinding__Group__5__Impl rule__RemoteBinding__Group__6 ;
    public final void rule__RemoteBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1033:1: ( rule__RemoteBinding__Group__5__Impl rule__RemoteBinding__Group__6 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1034:2: rule__RemoteBinding__Group__5__Impl rule__RemoteBinding__Group__6
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__5__Impl_in_rule__RemoteBinding__Group__52187);
            rule__RemoteBinding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__6_in_rule__RemoteBinding__Group__52190);
            rule__RemoteBinding__Group__6();

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
    // $ANTLR end "rule__RemoteBinding__Group__5"


    // $ANTLR start "rule__RemoteBinding__Group__5__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1041:1: rule__RemoteBinding__Group__5__Impl : ( ( rule__RemoteBinding__PathAssignment_5 ) ) ;
    public final void rule__RemoteBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1045:1: ( ( ( rule__RemoteBinding__PathAssignment_5 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1046:1: ( ( rule__RemoteBinding__PathAssignment_5 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1046:1: ( ( rule__RemoteBinding__PathAssignment_5 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1047:1: ( rule__RemoteBinding__PathAssignment_5 )
            {
             before(grammarAccess.getRemoteBindingAccess().getPathAssignment_5()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1048:1: ( rule__RemoteBinding__PathAssignment_5 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1048:2: rule__RemoteBinding__PathAssignment_5
            {
            pushFollow(FOLLOW_rule__RemoteBinding__PathAssignment_5_in_rule__RemoteBinding__Group__5__Impl2217);
            rule__RemoteBinding__PathAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getPathAssignment_5()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__5__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__6"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1058:1: rule__RemoteBinding__Group__6 : rule__RemoteBinding__Group__6__Impl rule__RemoteBinding__Group__7 ;
    public final void rule__RemoteBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1062:1: ( rule__RemoteBinding__Group__6__Impl rule__RemoteBinding__Group__7 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1063:2: rule__RemoteBinding__Group__6__Impl rule__RemoteBinding__Group__7
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__6__Impl_in_rule__RemoteBinding__Group__62247);
            rule__RemoteBinding__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__7_in_rule__RemoteBinding__Group__62250);
            rule__RemoteBinding__Group__7();

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
    // $ANTLR end "rule__RemoteBinding__Group__6"


    // $ANTLR start "rule__RemoteBinding__Group__6__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1070:1: rule__RemoteBinding__Group__6__Impl : ( ( rule__RemoteBinding__ProcessidAssignment_6 ) ) ;
    public final void rule__RemoteBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1074:1: ( ( ( rule__RemoteBinding__ProcessidAssignment_6 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1075:1: ( ( rule__RemoteBinding__ProcessidAssignment_6 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1075:1: ( ( rule__RemoteBinding__ProcessidAssignment_6 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1076:1: ( rule__RemoteBinding__ProcessidAssignment_6 )
            {
             before(grammarAccess.getRemoteBindingAccess().getProcessidAssignment_6()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1077:1: ( rule__RemoteBinding__ProcessidAssignment_6 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1077:2: rule__RemoteBinding__ProcessidAssignment_6
            {
            pushFollow(FOLLOW_rule__RemoteBinding__ProcessidAssignment_6_in_rule__RemoteBinding__Group__6__Impl2277);
            rule__RemoteBinding__ProcessidAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getProcessidAssignment_6()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__6__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__7"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1087:1: rule__RemoteBinding__Group__7 : rule__RemoteBinding__Group__7__Impl rule__RemoteBinding__Group__8 ;
    public final void rule__RemoteBinding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1091:1: ( rule__RemoteBinding__Group__7__Impl rule__RemoteBinding__Group__8 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1092:2: rule__RemoteBinding__Group__7__Impl rule__RemoteBinding__Group__8
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__7__Impl_in_rule__RemoteBinding__Group__72307);
            rule__RemoteBinding__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RemoteBinding__Group__8_in_rule__RemoteBinding__Group__72310);
            rule__RemoteBinding__Group__8();

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
    // $ANTLR end "rule__RemoteBinding__Group__7"


    // $ANTLR start "rule__RemoteBinding__Group__7__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1099:1: rule__RemoteBinding__Group__7__Impl : ( 'to' ) ;
    public final void rule__RemoteBinding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1103:1: ( ( 'to' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1104:1: ( 'to' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1104:1: ( 'to' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1105:1: 'to'
            {
             before(grammarAccess.getRemoteBindingAccess().getToKeyword_7()); 
            match(input,17,FOLLOW_17_in_rule__RemoteBinding__Group__7__Impl2338); 
             after(grammarAccess.getRemoteBindingAccess().getToKeyword_7()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__7__Impl"


    // $ANTLR start "rule__RemoteBinding__Group__8"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1118:1: rule__RemoteBinding__Group__8 : rule__RemoteBinding__Group__8__Impl ;
    public final void rule__RemoteBinding__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1122:1: ( rule__RemoteBinding__Group__8__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1123:2: rule__RemoteBinding__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__RemoteBinding__Group__8__Impl_in_rule__RemoteBinding__Group__82369);
            rule__RemoteBinding__Group__8__Impl();

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
    // $ANTLR end "rule__RemoteBinding__Group__8"


    // $ANTLR start "rule__RemoteBinding__Group__8__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1129:1: rule__RemoteBinding__Group__8__Impl : ( ( rule__RemoteBinding__HandleAssignment_8 ) ) ;
    public final void rule__RemoteBinding__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1133:1: ( ( ( rule__RemoteBinding__HandleAssignment_8 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1134:1: ( ( rule__RemoteBinding__HandleAssignment_8 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1134:1: ( ( rule__RemoteBinding__HandleAssignment_8 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1135:1: ( rule__RemoteBinding__HandleAssignment_8 )
            {
             before(grammarAccess.getRemoteBindingAccess().getHandleAssignment_8()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1136:1: ( rule__RemoteBinding__HandleAssignment_8 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1136:2: rule__RemoteBinding__HandleAssignment_8
            {
            pushFollow(FOLLOW_rule__RemoteBinding__HandleAssignment_8_in_rule__RemoteBinding__Group__8__Impl2396);
            rule__RemoteBinding__HandleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRemoteBindingAccess().getHandleAssignment_8()); 

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
    // $ANTLR end "rule__RemoteBinding__Group__8__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1164:1: rule__ExecuteStatement__Group__0 : rule__ExecuteStatement__Group__0__Impl rule__ExecuteStatement__Group__1 ;
    public final void rule__ExecuteStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1168:1: ( rule__ExecuteStatement__Group__0__Impl rule__ExecuteStatement__Group__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1169:2: rule__ExecuteStatement__Group__0__Impl rule__ExecuteStatement__Group__1
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__0__Impl_in_rule__ExecuteStatement__Group__02444);
            rule__ExecuteStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecuteStatement__Group__1_in_rule__ExecuteStatement__Group__02447);
            rule__ExecuteStatement__Group__1();

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
    // $ANTLR end "rule__ExecuteStatement__Group__0"


    // $ANTLR start "rule__ExecuteStatement__Group__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1176:1: rule__ExecuteStatement__Group__0__Impl : ( 'execute' ) ;
    public final void rule__ExecuteStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1180:1: ( ( 'execute' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1181:1: ( 'execute' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1181:1: ( 'execute' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1182:1: 'execute'
            {
             before(grammarAccess.getExecuteStatementAccess().getExecuteKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ExecuteStatement__Group__0__Impl2475); 
             after(grammarAccess.getExecuteStatementAccess().getExecuteKeyword_0()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__0__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1195:1: rule__ExecuteStatement__Group__1 : rule__ExecuteStatement__Group__1__Impl rule__ExecuteStatement__Group__2 ;
    public final void rule__ExecuteStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1199:1: ( rule__ExecuteStatement__Group__1__Impl rule__ExecuteStatement__Group__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1200:2: rule__ExecuteStatement__Group__1__Impl rule__ExecuteStatement__Group__2
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__1__Impl_in_rule__ExecuteStatement__Group__12506);
            rule__ExecuteStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecuteStatement__Group__2_in_rule__ExecuteStatement__Group__12509);
            rule__ExecuteStatement__Group__2();

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
    // $ANTLR end "rule__ExecuteStatement__Group__1"


    // $ANTLR start "rule__ExecuteStatement__Group__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1207:1: rule__ExecuteStatement__Group__1__Impl : ( ( rule__ExecuteStatement__HandleAssignment_1 ) ) ;
    public final void rule__ExecuteStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1211:1: ( ( ( rule__ExecuteStatement__HandleAssignment_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1212:1: ( ( rule__ExecuteStatement__HandleAssignment_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1212:1: ( ( rule__ExecuteStatement__HandleAssignment_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1213:1: ( rule__ExecuteStatement__HandleAssignment_1 )
            {
             before(grammarAccess.getExecuteStatementAccess().getHandleAssignment_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1214:1: ( rule__ExecuteStatement__HandleAssignment_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1214:2: rule__ExecuteStatement__HandleAssignment_1
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__HandleAssignment_1_in_rule__ExecuteStatement__Group__1__Impl2536);
            rule__ExecuteStatement__HandleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExecuteStatementAccess().getHandleAssignment_1()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__1__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1224:1: rule__ExecuteStatement__Group__2 : rule__ExecuteStatement__Group__2__Impl rule__ExecuteStatement__Group__3 ;
    public final void rule__ExecuteStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1228:1: ( rule__ExecuteStatement__Group__2__Impl rule__ExecuteStatement__Group__3 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1229:2: rule__ExecuteStatement__Group__2__Impl rule__ExecuteStatement__Group__3
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__2__Impl_in_rule__ExecuteStatement__Group__22566);
            rule__ExecuteStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecuteStatement__Group__3_in_rule__ExecuteStatement__Group__22569);
            rule__ExecuteStatement__Group__3();

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
    // $ANTLR end "rule__ExecuteStatement__Group__2"


    // $ANTLR start "rule__ExecuteStatement__Group__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1236:1: rule__ExecuteStatement__Group__2__Impl : ( 'with' ) ;
    public final void rule__ExecuteStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1240:1: ( ( 'with' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1241:1: ( 'with' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1241:1: ( 'with' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1242:1: 'with'
            {
             before(grammarAccess.getExecuteStatementAccess().getWithKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__ExecuteStatement__Group__2__Impl2597); 
             after(grammarAccess.getExecuteStatementAccess().getWithKeyword_2()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__2__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__3"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1255:1: rule__ExecuteStatement__Group__3 : rule__ExecuteStatement__Group__3__Impl rule__ExecuteStatement__Group__4 ;
    public final void rule__ExecuteStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1259:1: ( rule__ExecuteStatement__Group__3__Impl rule__ExecuteStatement__Group__4 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1260:2: rule__ExecuteStatement__Group__3__Impl rule__ExecuteStatement__Group__4
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__3__Impl_in_rule__ExecuteStatement__Group__32628);
            rule__ExecuteStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecuteStatement__Group__4_in_rule__ExecuteStatement__Group__32631);
            rule__ExecuteStatement__Group__4();

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
    // $ANTLR end "rule__ExecuteStatement__Group__3"


    // $ANTLR start "rule__ExecuteStatement__Group__3__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1267:1: rule__ExecuteStatement__Group__3__Impl : ( ( rule__ExecuteStatement__ExecinputsAssignment_3 )* ) ;
    public final void rule__ExecuteStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1271:1: ( ( ( rule__ExecuteStatement__ExecinputsAssignment_3 )* ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1272:1: ( ( rule__ExecuteStatement__ExecinputsAssignment_3 )* )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1272:1: ( ( rule__ExecuteStatement__ExecinputsAssignment_3 )* )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1273:1: ( rule__ExecuteStatement__ExecinputsAssignment_3 )*
            {
             before(grammarAccess.getExecuteStatementAccess().getExecinputsAssignment_3()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1274:1: ( rule__ExecuteStatement__ExecinputsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_IN_REFERENCE_HANDLE||LA10_0==RULE_VAR_REFERENCE_HANDLE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1274:2: rule__ExecuteStatement__ExecinputsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ExecuteStatement__ExecinputsAssignment_3_in_rule__ExecuteStatement__Group__3__Impl2658);
            	    rule__ExecuteStatement__ExecinputsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getExecuteStatementAccess().getExecinputsAssignment_3()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__3__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__4"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1284:1: rule__ExecuteStatement__Group__4 : rule__ExecuteStatement__Group__4__Impl rule__ExecuteStatement__Group__5 ;
    public final void rule__ExecuteStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1288:1: ( rule__ExecuteStatement__Group__4__Impl rule__ExecuteStatement__Group__5 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1289:2: rule__ExecuteStatement__Group__4__Impl rule__ExecuteStatement__Group__5
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__4__Impl_in_rule__ExecuteStatement__Group__42689);
            rule__ExecuteStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecuteStatement__Group__5_in_rule__ExecuteStatement__Group__42692);
            rule__ExecuteStatement__Group__5();

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
    // $ANTLR end "rule__ExecuteStatement__Group__4"


    // $ANTLR start "rule__ExecuteStatement__Group__4__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1296:1: rule__ExecuteStatement__Group__4__Impl : ( 'store' ) ;
    public final void rule__ExecuteStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1300:1: ( ( 'store' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1301:1: ( 'store' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1301:1: ( 'store' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1302:1: 'store'
            {
             before(grammarAccess.getExecuteStatementAccess().getStoreKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__ExecuteStatement__Group__4__Impl2720); 
             after(grammarAccess.getExecuteStatementAccess().getStoreKeyword_4()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__4__Impl"


    // $ANTLR start "rule__ExecuteStatement__Group__5"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1315:1: rule__ExecuteStatement__Group__5 : rule__ExecuteStatement__Group__5__Impl ;
    public final void rule__ExecuteStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1319:1: ( rule__ExecuteStatement__Group__5__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1320:2: rule__ExecuteStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ExecuteStatement__Group__5__Impl_in_rule__ExecuteStatement__Group__52751);
            rule__ExecuteStatement__Group__5__Impl();

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
    // $ANTLR end "rule__ExecuteStatement__Group__5"


    // $ANTLR start "rule__ExecuteStatement__Group__5__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1326:1: rule__ExecuteStatement__Group__5__Impl : ( ( rule__ExecuteStatement__ExecoutputsAssignment_5 )* ) ;
    public final void rule__ExecuteStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1330:1: ( ( ( rule__ExecuteStatement__ExecoutputsAssignment_5 )* ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1331:1: ( ( rule__ExecuteStatement__ExecoutputsAssignment_5 )* )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1331:1: ( ( rule__ExecuteStatement__ExecoutputsAssignment_5 )* )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1332:1: ( rule__ExecuteStatement__ExecoutputsAssignment_5 )*
            {
             before(grammarAccess.getExecuteStatementAccess().getExecoutputsAssignment_5()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1333:1: ( rule__ExecuteStatement__ExecoutputsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1333:2: rule__ExecuteStatement__ExecoutputsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ExecuteStatement__ExecoutputsAssignment_5_in_rule__ExecuteStatement__Group__5__Impl2778);
            	    rule__ExecuteStatement__ExecoutputsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getExecuteStatementAccess().getExecoutputsAssignment_5()); 

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
    // $ANTLR end "rule__ExecuteStatement__Group__5__Impl"


    // $ANTLR start "rule__ExecInput__Group_0__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1355:1: rule__ExecInput__Group_0__0 : rule__ExecInput__Group_0__0__Impl rule__ExecInput__Group_0__1 ;
    public final void rule__ExecInput__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1359:1: ( rule__ExecInput__Group_0__0__Impl rule__ExecInput__Group_0__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1360:2: rule__ExecInput__Group_0__0__Impl rule__ExecInput__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_0__0__Impl_in_rule__ExecInput__Group_0__02821);
            rule__ExecInput__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecInput__Group_0__1_in_rule__ExecInput__Group_0__02824);
            rule__ExecInput__Group_0__1();

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
    // $ANTLR end "rule__ExecInput__Group_0__0"


    // $ANTLR start "rule__ExecInput__Group_0__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1367:1: rule__ExecInput__Group_0__0__Impl : ( ( rule__ExecInput__ReferenceAssignment_0_0 ) ) ;
    public final void rule__ExecInput__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1371:1: ( ( ( rule__ExecInput__ReferenceAssignment_0_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1372:1: ( ( rule__ExecInput__ReferenceAssignment_0_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1372:1: ( ( rule__ExecInput__ReferenceAssignment_0_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1373:1: ( rule__ExecInput__ReferenceAssignment_0_0 )
            {
             before(grammarAccess.getExecInputAccess().getReferenceAssignment_0_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1374:1: ( rule__ExecInput__ReferenceAssignment_0_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1374:2: rule__ExecInput__ReferenceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ExecInput__ReferenceAssignment_0_0_in_rule__ExecInput__Group_0__0__Impl2851);
            rule__ExecInput__ReferenceAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExecInputAccess().getReferenceAssignment_0_0()); 

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
    // $ANTLR end "rule__ExecInput__Group_0__0__Impl"


    // $ANTLR start "rule__ExecInput__Group_0__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1384:1: rule__ExecInput__Group_0__1 : rule__ExecInput__Group_0__1__Impl rule__ExecInput__Group_0__2 ;
    public final void rule__ExecInput__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1388:1: ( rule__ExecInput__Group_0__1__Impl rule__ExecInput__Group_0__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1389:2: rule__ExecInput__Group_0__1__Impl rule__ExecInput__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_0__1__Impl_in_rule__ExecInput__Group_0__12881);
            rule__ExecInput__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecInput__Group_0__2_in_rule__ExecInput__Group_0__12884);
            rule__ExecInput__Group_0__2();

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
    // $ANTLR end "rule__ExecInput__Group_0__1"


    // $ANTLR start "rule__ExecInput__Group_0__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1396:1: rule__ExecInput__Group_0__1__Impl : ( 'as' ) ;
    public final void rule__ExecInput__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1400:1: ( ( 'as' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1401:1: ( 'as' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1401:1: ( 'as' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1402:1: 'as'
            {
             before(grammarAccess.getExecInputAccess().getAsKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__ExecInput__Group_0__1__Impl2912); 
             after(grammarAccess.getExecInputAccess().getAsKeyword_0_1()); 

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
    // $ANTLR end "rule__ExecInput__Group_0__1__Impl"


    // $ANTLR start "rule__ExecInput__Group_0__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1415:1: rule__ExecInput__Group_0__2 : rule__ExecInput__Group_0__2__Impl ;
    public final void rule__ExecInput__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1419:1: ( rule__ExecInput__Group_0__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1420:2: rule__ExecInput__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_0__2__Impl_in_rule__ExecInput__Group_0__22943);
            rule__ExecInput__Group_0__2__Impl();

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
    // $ANTLR end "rule__ExecInput__Group_0__2"


    // $ANTLR start "rule__ExecInput__Group_0__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1426:1: rule__ExecInput__Group_0__2__Impl : ( ( rule__ExecInput__WpsidAssignment_0_2 ) ) ;
    public final void rule__ExecInput__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1430:1: ( ( ( rule__ExecInput__WpsidAssignment_0_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1431:1: ( ( rule__ExecInput__WpsidAssignment_0_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1431:1: ( ( rule__ExecInput__WpsidAssignment_0_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1432:1: ( rule__ExecInput__WpsidAssignment_0_2 )
            {
             before(grammarAccess.getExecInputAccess().getWpsidAssignment_0_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1433:1: ( rule__ExecInput__WpsidAssignment_0_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1433:2: rule__ExecInput__WpsidAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ExecInput__WpsidAssignment_0_2_in_rule__ExecInput__Group_0__2__Impl2970);
            rule__ExecInput__WpsidAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExecInputAccess().getWpsidAssignment_0_2()); 

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
    // $ANTLR end "rule__ExecInput__Group_0__2__Impl"


    // $ANTLR start "rule__ExecInput__Group_1__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1449:1: rule__ExecInput__Group_1__0 : rule__ExecInput__Group_1__0__Impl rule__ExecInput__Group_1__1 ;
    public final void rule__ExecInput__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1453:1: ( rule__ExecInput__Group_1__0__Impl rule__ExecInput__Group_1__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1454:2: rule__ExecInput__Group_1__0__Impl rule__ExecInput__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_1__0__Impl_in_rule__ExecInput__Group_1__03006);
            rule__ExecInput__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecInput__Group_1__1_in_rule__ExecInput__Group_1__03009);
            rule__ExecInput__Group_1__1();

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
    // $ANTLR end "rule__ExecInput__Group_1__0"


    // $ANTLR start "rule__ExecInput__Group_1__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1461:1: rule__ExecInput__Group_1__0__Impl : ( ( rule__ExecInput__ReferenceAssignment_1_0 ) ) ;
    public final void rule__ExecInput__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1465:1: ( ( ( rule__ExecInput__ReferenceAssignment_1_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1466:1: ( ( rule__ExecInput__ReferenceAssignment_1_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1466:1: ( ( rule__ExecInput__ReferenceAssignment_1_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1467:1: ( rule__ExecInput__ReferenceAssignment_1_0 )
            {
             before(grammarAccess.getExecInputAccess().getReferenceAssignment_1_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1468:1: ( rule__ExecInput__ReferenceAssignment_1_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1468:2: rule__ExecInput__ReferenceAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExecInput__ReferenceAssignment_1_0_in_rule__ExecInput__Group_1__0__Impl3036);
            rule__ExecInput__ReferenceAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExecInputAccess().getReferenceAssignment_1_0()); 

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
    // $ANTLR end "rule__ExecInput__Group_1__0__Impl"


    // $ANTLR start "rule__ExecInput__Group_1__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1478:1: rule__ExecInput__Group_1__1 : rule__ExecInput__Group_1__1__Impl rule__ExecInput__Group_1__2 ;
    public final void rule__ExecInput__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1482:1: ( rule__ExecInput__Group_1__1__Impl rule__ExecInput__Group_1__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1483:2: rule__ExecInput__Group_1__1__Impl rule__ExecInput__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_1__1__Impl_in_rule__ExecInput__Group_1__13066);
            rule__ExecInput__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecInput__Group_1__2_in_rule__ExecInput__Group_1__13069);
            rule__ExecInput__Group_1__2();

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
    // $ANTLR end "rule__ExecInput__Group_1__1"


    // $ANTLR start "rule__ExecInput__Group_1__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1490:1: rule__ExecInput__Group_1__1__Impl : ( 'as' ) ;
    public final void rule__ExecInput__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1494:1: ( ( 'as' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1495:1: ( 'as' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1495:1: ( 'as' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1496:1: 'as'
            {
             before(grammarAccess.getExecInputAccess().getAsKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__ExecInput__Group_1__1__Impl3097); 
             after(grammarAccess.getExecInputAccess().getAsKeyword_1_1()); 

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
    // $ANTLR end "rule__ExecInput__Group_1__1__Impl"


    // $ANTLR start "rule__ExecInput__Group_1__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1509:1: rule__ExecInput__Group_1__2 : rule__ExecInput__Group_1__2__Impl ;
    public final void rule__ExecInput__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1513:1: ( rule__ExecInput__Group_1__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1514:2: rule__ExecInput__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExecInput__Group_1__2__Impl_in_rule__ExecInput__Group_1__23128);
            rule__ExecInput__Group_1__2__Impl();

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
    // $ANTLR end "rule__ExecInput__Group_1__2"


    // $ANTLR start "rule__ExecInput__Group_1__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1520:1: rule__ExecInput__Group_1__2__Impl : ( ( rule__ExecInput__WpsidAssignment_1_2 ) ) ;
    public final void rule__ExecInput__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1524:1: ( ( ( rule__ExecInput__WpsidAssignment_1_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1525:1: ( ( rule__ExecInput__WpsidAssignment_1_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1525:1: ( ( rule__ExecInput__WpsidAssignment_1_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1526:1: ( rule__ExecInput__WpsidAssignment_1_2 )
            {
             before(grammarAccess.getExecInputAccess().getWpsidAssignment_1_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1527:1: ( rule__ExecInput__WpsidAssignment_1_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1527:2: rule__ExecInput__WpsidAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ExecInput__WpsidAssignment_1_2_in_rule__ExecInput__Group_1__2__Impl3155);
            rule__ExecInput__WpsidAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExecInputAccess().getWpsidAssignment_1_2()); 

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
    // $ANTLR end "rule__ExecInput__Group_1__2__Impl"


    // $ANTLR start "rule__ExecOutput__Group_0__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1543:1: rule__ExecOutput__Group_0__0 : rule__ExecOutput__Group_0__0__Impl rule__ExecOutput__Group_0__1 ;
    public final void rule__ExecOutput__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1547:1: ( rule__ExecOutput__Group_0__0__Impl rule__ExecOutput__Group_0__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1548:2: rule__ExecOutput__Group_0__0__Impl rule__ExecOutput__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_0__0__Impl_in_rule__ExecOutput__Group_0__03191);
            rule__ExecOutput__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecOutput__Group_0__1_in_rule__ExecOutput__Group_0__03194);
            rule__ExecOutput__Group_0__1();

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
    // $ANTLR end "rule__ExecOutput__Group_0__0"


    // $ANTLR start "rule__ExecOutput__Group_0__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1555:1: rule__ExecOutput__Group_0__0__Impl : ( ( rule__ExecOutput__WpsidAssignment_0_0 ) ) ;
    public final void rule__ExecOutput__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1559:1: ( ( ( rule__ExecOutput__WpsidAssignment_0_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1560:1: ( ( rule__ExecOutput__WpsidAssignment_0_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1560:1: ( ( rule__ExecOutput__WpsidAssignment_0_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1561:1: ( rule__ExecOutput__WpsidAssignment_0_0 )
            {
             before(grammarAccess.getExecOutputAccess().getWpsidAssignment_0_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1562:1: ( rule__ExecOutput__WpsidAssignment_0_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1562:2: rule__ExecOutput__WpsidAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ExecOutput__WpsidAssignment_0_0_in_rule__ExecOutput__Group_0__0__Impl3221);
            rule__ExecOutput__WpsidAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExecOutputAccess().getWpsidAssignment_0_0()); 

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
    // $ANTLR end "rule__ExecOutput__Group_0__0__Impl"


    // $ANTLR start "rule__ExecOutput__Group_0__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1572:1: rule__ExecOutput__Group_0__1 : rule__ExecOutput__Group_0__1__Impl rule__ExecOutput__Group_0__2 ;
    public final void rule__ExecOutput__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1576:1: ( rule__ExecOutput__Group_0__1__Impl rule__ExecOutput__Group_0__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1577:2: rule__ExecOutput__Group_0__1__Impl rule__ExecOutput__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_0__1__Impl_in_rule__ExecOutput__Group_0__13251);
            rule__ExecOutput__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecOutput__Group_0__2_in_rule__ExecOutput__Group_0__13254);
            rule__ExecOutput__Group_0__2();

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
    // $ANTLR end "rule__ExecOutput__Group_0__1"


    // $ANTLR start "rule__ExecOutput__Group_0__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1584:1: rule__ExecOutput__Group_0__1__Impl : ( 'as' ) ;
    public final void rule__ExecOutput__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1588:1: ( ( 'as' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1589:1: ( 'as' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1589:1: ( 'as' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1590:1: 'as'
            {
             before(grammarAccess.getExecOutputAccess().getAsKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__ExecOutput__Group_0__1__Impl3282); 
             after(grammarAccess.getExecOutputAccess().getAsKeyword_0_1()); 

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
    // $ANTLR end "rule__ExecOutput__Group_0__1__Impl"


    // $ANTLR start "rule__ExecOutput__Group_0__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1603:1: rule__ExecOutput__Group_0__2 : rule__ExecOutput__Group_0__2__Impl ;
    public final void rule__ExecOutput__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1607:1: ( rule__ExecOutput__Group_0__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1608:2: rule__ExecOutput__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_0__2__Impl_in_rule__ExecOutput__Group_0__23313);
            rule__ExecOutput__Group_0__2__Impl();

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
    // $ANTLR end "rule__ExecOutput__Group_0__2"


    // $ANTLR start "rule__ExecOutput__Group_0__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1614:1: rule__ExecOutput__Group_0__2__Impl : ( ( rule__ExecOutput__ReferenceAssignment_0_2 ) ) ;
    public final void rule__ExecOutput__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1618:1: ( ( ( rule__ExecOutput__ReferenceAssignment_0_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1619:1: ( ( rule__ExecOutput__ReferenceAssignment_0_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1619:1: ( ( rule__ExecOutput__ReferenceAssignment_0_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1620:1: ( rule__ExecOutput__ReferenceAssignment_0_2 )
            {
             before(grammarAccess.getExecOutputAccess().getReferenceAssignment_0_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1621:1: ( rule__ExecOutput__ReferenceAssignment_0_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1621:2: rule__ExecOutput__ReferenceAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ExecOutput__ReferenceAssignment_0_2_in_rule__ExecOutput__Group_0__2__Impl3340);
            rule__ExecOutput__ReferenceAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExecOutputAccess().getReferenceAssignment_0_2()); 

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
    // $ANTLR end "rule__ExecOutput__Group_0__2__Impl"


    // $ANTLR start "rule__ExecOutput__Group_1__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1637:1: rule__ExecOutput__Group_1__0 : rule__ExecOutput__Group_1__0__Impl rule__ExecOutput__Group_1__1 ;
    public final void rule__ExecOutput__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1641:1: ( rule__ExecOutput__Group_1__0__Impl rule__ExecOutput__Group_1__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1642:2: rule__ExecOutput__Group_1__0__Impl rule__ExecOutput__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_1__0__Impl_in_rule__ExecOutput__Group_1__03376);
            rule__ExecOutput__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecOutput__Group_1__1_in_rule__ExecOutput__Group_1__03379);
            rule__ExecOutput__Group_1__1();

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
    // $ANTLR end "rule__ExecOutput__Group_1__0"


    // $ANTLR start "rule__ExecOutput__Group_1__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1649:1: rule__ExecOutput__Group_1__0__Impl : ( ( rule__ExecOutput__WpsidAssignment_1_0 ) ) ;
    public final void rule__ExecOutput__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1653:1: ( ( ( rule__ExecOutput__WpsidAssignment_1_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1654:1: ( ( rule__ExecOutput__WpsidAssignment_1_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1654:1: ( ( rule__ExecOutput__WpsidAssignment_1_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1655:1: ( rule__ExecOutput__WpsidAssignment_1_0 )
            {
             before(grammarAccess.getExecOutputAccess().getWpsidAssignment_1_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1656:1: ( rule__ExecOutput__WpsidAssignment_1_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1656:2: rule__ExecOutput__WpsidAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExecOutput__WpsidAssignment_1_0_in_rule__ExecOutput__Group_1__0__Impl3406);
            rule__ExecOutput__WpsidAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExecOutputAccess().getWpsidAssignment_1_0()); 

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
    // $ANTLR end "rule__ExecOutput__Group_1__0__Impl"


    // $ANTLR start "rule__ExecOutput__Group_1__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1666:1: rule__ExecOutput__Group_1__1 : rule__ExecOutput__Group_1__1__Impl rule__ExecOutput__Group_1__2 ;
    public final void rule__ExecOutput__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1670:1: ( rule__ExecOutput__Group_1__1__Impl rule__ExecOutput__Group_1__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1671:2: rule__ExecOutput__Group_1__1__Impl rule__ExecOutput__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_1__1__Impl_in_rule__ExecOutput__Group_1__13436);
            rule__ExecOutput__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExecOutput__Group_1__2_in_rule__ExecOutput__Group_1__13439);
            rule__ExecOutput__Group_1__2();

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
    // $ANTLR end "rule__ExecOutput__Group_1__1"


    // $ANTLR start "rule__ExecOutput__Group_1__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1678:1: rule__ExecOutput__Group_1__1__Impl : ( 'as' ) ;
    public final void rule__ExecOutput__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1682:1: ( ( 'as' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1683:1: ( 'as' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1683:1: ( 'as' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1684:1: 'as'
            {
             before(grammarAccess.getExecOutputAccess().getAsKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__ExecOutput__Group_1__1__Impl3467); 
             after(grammarAccess.getExecOutputAccess().getAsKeyword_1_1()); 

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
    // $ANTLR end "rule__ExecOutput__Group_1__1__Impl"


    // $ANTLR start "rule__ExecOutput__Group_1__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1697:1: rule__ExecOutput__Group_1__2 : rule__ExecOutput__Group_1__2__Impl ;
    public final void rule__ExecOutput__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1701:1: ( rule__ExecOutput__Group_1__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1702:2: rule__ExecOutput__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExecOutput__Group_1__2__Impl_in_rule__ExecOutput__Group_1__23498);
            rule__ExecOutput__Group_1__2__Impl();

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
    // $ANTLR end "rule__ExecOutput__Group_1__2"


    // $ANTLR start "rule__ExecOutput__Group_1__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1708:1: rule__ExecOutput__Group_1__2__Impl : ( ( rule__ExecOutput__ReferenceAssignment_1_2 ) ) ;
    public final void rule__ExecOutput__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1712:1: ( ( ( rule__ExecOutput__ReferenceAssignment_1_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1713:1: ( ( rule__ExecOutput__ReferenceAssignment_1_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1713:1: ( ( rule__ExecOutput__ReferenceAssignment_1_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1714:1: ( rule__ExecOutput__ReferenceAssignment_1_2 )
            {
             before(grammarAccess.getExecOutputAccess().getReferenceAssignment_1_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1715:1: ( rule__ExecOutput__ReferenceAssignment_1_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1715:2: rule__ExecOutput__ReferenceAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ExecOutput__ReferenceAssignment_1_2_in_rule__ExecOutput__Group_1__2__Impl3525);
            rule__ExecOutput__ReferenceAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExecOutputAccess().getReferenceAssignment_1_2()); 

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
    // $ANTLR end "rule__ExecOutput__Group_1__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1731:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1735:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1736:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__0__Impl_in_rule__IfStatement__Group__03561);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__1_in_rule__IfStatement__Group__03564);
            rule__IfStatement__Group__1();

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
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1743:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1747:1: ( ( 'if' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1748:1: ( 'if' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1748:1: ( 'if' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1749:1: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__IfStatement__Group__0__Impl3592); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1762:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1766:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1767:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__1__Impl_in_rule__IfStatement__Group__13623);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__2_in_rule__IfStatement__Group__13626);
            rule__IfStatement__Group__2();

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
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1774:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__Alternatives_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1778:1: ( ( ( rule__IfStatement__Alternatives_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1779:1: ( ( rule__IfStatement__Alternatives_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1779:1: ( ( rule__IfStatement__Alternatives_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1780:1: ( rule__IfStatement__Alternatives_1 )
            {
             before(grammarAccess.getIfStatementAccess().getAlternatives_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1781:1: ( rule__IfStatement__Alternatives_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1781:2: rule__IfStatement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__IfStatement__Alternatives_1_in_rule__IfStatement__Group__1__Impl3653);
            rule__IfStatement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1791:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1795:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1796:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__2__Impl_in_rule__IfStatement__Group__23683);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__3_in_rule__IfStatement__Group__23686);
            rule__IfStatement__Group__3();

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
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1803:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__IfoperationsAssignment_2 )* ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1807:1: ( ( ( rule__IfStatement__IfoperationsAssignment_2 )* ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1808:1: ( ( rule__IfStatement__IfoperationsAssignment_2 )* )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1808:1: ( ( rule__IfStatement__IfoperationsAssignment_2 )* )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1809:1: ( rule__IfStatement__IfoperationsAssignment_2 )*
            {
             before(grammarAccess.getIfStatementAccess().getIfoperationsAssignment_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1810:1: ( rule__IfStatement__IfoperationsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_OUT_REFERENCE_HANDLE && LA12_0<=RULE_VAR_REFERENCE_HANDLE)||LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1810:2: rule__IfStatement__IfoperationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__IfStatement__IfoperationsAssignment_2_in_rule__IfStatement__Group__2__Impl3713);
            	    rule__IfStatement__IfoperationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getIfoperationsAssignment_2()); 

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
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1820:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1824:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1825:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__3__Impl_in_rule__IfStatement__Group__33744);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group__4_in_rule__IfStatement__Group__33747);
            rule__IfStatement__Group__4();

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
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1832:1: rule__IfStatement__Group__3__Impl : ( ( rule__IfStatement__Group_3__0 )? ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1836:1: ( ( ( rule__IfStatement__Group_3__0 )? ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1837:1: ( ( rule__IfStatement__Group_3__0 )? )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1837:1: ( ( rule__IfStatement__Group_3__0 )? )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1838:1: ( rule__IfStatement__Group_3__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_3()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1839:1: ( rule__IfStatement__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1839:2: rule__IfStatement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__IfStatement__Group_3__0_in_rule__IfStatement__Group__3__Impl3774);
                    rule__IfStatement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStatementAccess().getGroup_3()); 

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
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1849:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1853:1: ( rule__IfStatement__Group__4__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1854:2: rule__IfStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group__4__Impl_in_rule__IfStatement__Group__43805);
            rule__IfStatement__Group__4__Impl();

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
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1860:1: rule__IfStatement__Group__4__Impl : ( 'end' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1864:1: ( ( 'end' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1865:1: ( 'end' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1865:1: ( 'end' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1866:1: 'end'
            {
             before(grammarAccess.getIfStatementAccess().getEndKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__IfStatement__Group__4__Impl3833); 
             after(grammarAccess.getIfStatementAccess().getEndKeyword_4()); 

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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_0__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1889:1: rule__IfStatement__Group_1_0__0 : rule__IfStatement__Group_1_0__0__Impl rule__IfStatement__Group_1_0__1 ;
    public final void rule__IfStatement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1893:1: ( rule__IfStatement__Group_1_0__0__Impl rule__IfStatement__Group_1_0__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1894:2: rule__IfStatement__Group_1_0__0__Impl rule__IfStatement__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_0__0__Impl_in_rule__IfStatement__Group_1_0__03874);
            rule__IfStatement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_0__1_in_rule__IfStatement__Group_1_0__03877);
            rule__IfStatement__Group_1_0__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_0__0"


    // $ANTLR start "rule__IfStatement__Group_1_0__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1901:1: rule__IfStatement__Group_1_0__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_0_0 ) ) ;
    public final void rule__IfStatement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1905:1: ( ( ( rule__IfStatement__LefthandAssignment_1_0_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1906:1: ( ( rule__IfStatement__LefthandAssignment_1_0_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1906:1: ( ( rule__IfStatement__LefthandAssignment_1_0_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1907:1: ( rule__IfStatement__LefthandAssignment_1_0_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_0_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1908:1: ( rule__IfStatement__LefthandAssignment_1_0_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1908:2: rule__IfStatement__LefthandAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_0_0_in_rule__IfStatement__Group_1_0__0__Impl3904);
            rule__IfStatement__LefthandAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_0_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_0__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_0__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1918:1: rule__IfStatement__Group_1_0__1 : rule__IfStatement__Group_1_0__1__Impl rule__IfStatement__Group_1_0__2 ;
    public final void rule__IfStatement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1922:1: ( rule__IfStatement__Group_1_0__1__Impl rule__IfStatement__Group_1_0__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1923:2: rule__IfStatement__Group_1_0__1__Impl rule__IfStatement__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_0__1__Impl_in_rule__IfStatement__Group_1_0__13934);
            rule__IfStatement__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_0__2_in_rule__IfStatement__Group_1_0__13937);
            rule__IfStatement__Group_1_0__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_0__1"


    // $ANTLR start "rule__IfStatement__Group_1_0__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1930:1: rule__IfStatement__Group_1_0__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__IfStatement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1934:1: ( ( ( rule__IfStatement__OperatorAssignment_1_0_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1935:1: ( ( rule__IfStatement__OperatorAssignment_1_0_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1935:1: ( ( rule__IfStatement__OperatorAssignment_1_0_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1936:1: ( rule__IfStatement__OperatorAssignment_1_0_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_0_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1937:1: ( rule__IfStatement__OperatorAssignment_1_0_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1937:2: rule__IfStatement__OperatorAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_0_1_in_rule__IfStatement__Group_1_0__1__Impl3964);
            rule__IfStatement__OperatorAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_0_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_0__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_0__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1947:1: rule__IfStatement__Group_1_0__2 : rule__IfStatement__Group_1_0__2__Impl ;
    public final void rule__IfStatement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1951:1: ( rule__IfStatement__Group_1_0__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1952:2: rule__IfStatement__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_0__2__Impl_in_rule__IfStatement__Group_1_0__23994);
            rule__IfStatement__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_0__2"


    // $ANTLR start "rule__IfStatement__Group_1_0__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1958:1: rule__IfStatement__Group_1_0__2__Impl : ( ( rule__IfStatement__RighthandAssignment_1_0_2 ) ) ;
    public final void rule__IfStatement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1962:1: ( ( ( rule__IfStatement__RighthandAssignment_1_0_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1963:1: ( ( rule__IfStatement__RighthandAssignment_1_0_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1963:1: ( ( rule__IfStatement__RighthandAssignment_1_0_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1964:1: ( rule__IfStatement__RighthandAssignment_1_0_2 )
            {
             before(grammarAccess.getIfStatementAccess().getRighthandAssignment_1_0_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1965:1: ( rule__IfStatement__RighthandAssignment_1_0_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1965:2: rule__IfStatement__RighthandAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__IfStatement__RighthandAssignment_1_0_2_in_rule__IfStatement__Group_1_0__2__Impl4021);
            rule__IfStatement__RighthandAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getRighthandAssignment_1_0_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_0__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_1__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1981:1: rule__IfStatement__Group_1_1__0 : rule__IfStatement__Group_1_1__0__Impl rule__IfStatement__Group_1_1__1 ;
    public final void rule__IfStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1985:1: ( rule__IfStatement__Group_1_1__0__Impl rule__IfStatement__Group_1_1__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1986:2: rule__IfStatement__Group_1_1__0__Impl rule__IfStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_1__0__Impl_in_rule__IfStatement__Group_1_1__04057);
            rule__IfStatement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_1__1_in_rule__IfStatement__Group_1_1__04060);
            rule__IfStatement__Group_1_1__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_1__0"


    // $ANTLR start "rule__IfStatement__Group_1_1__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1993:1: rule__IfStatement__Group_1_1__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_1_0 ) ) ;
    public final void rule__IfStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1997:1: ( ( ( rule__IfStatement__LefthandAssignment_1_1_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1998:1: ( ( rule__IfStatement__LefthandAssignment_1_1_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1998:1: ( ( rule__IfStatement__LefthandAssignment_1_1_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1999:1: ( rule__IfStatement__LefthandAssignment_1_1_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_1_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2000:1: ( rule__IfStatement__LefthandAssignment_1_1_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2000:2: rule__IfStatement__LefthandAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_1_0_in_rule__IfStatement__Group_1_1__0__Impl4087);
            rule__IfStatement__LefthandAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_1_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_1__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_1__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2010:1: rule__IfStatement__Group_1_1__1 : rule__IfStatement__Group_1_1__1__Impl rule__IfStatement__Group_1_1__2 ;
    public final void rule__IfStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2014:1: ( rule__IfStatement__Group_1_1__1__Impl rule__IfStatement__Group_1_1__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2015:2: rule__IfStatement__Group_1_1__1__Impl rule__IfStatement__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_1__1__Impl_in_rule__IfStatement__Group_1_1__14117);
            rule__IfStatement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_1__2_in_rule__IfStatement__Group_1_1__14120);
            rule__IfStatement__Group_1_1__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_1__1"


    // $ANTLR start "rule__IfStatement__Group_1_1__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2022:1: rule__IfStatement__Group_1_1__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_1_1 ) ) ;
    public final void rule__IfStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2026:1: ( ( ( rule__IfStatement__OperatorAssignment_1_1_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2027:1: ( ( rule__IfStatement__OperatorAssignment_1_1_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2027:1: ( ( rule__IfStatement__OperatorAssignment_1_1_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2028:1: ( rule__IfStatement__OperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_1_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2029:1: ( rule__IfStatement__OperatorAssignment_1_1_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2029:2: rule__IfStatement__OperatorAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_1_1_in_rule__IfStatement__Group_1_1__1__Impl4147);
            rule__IfStatement__OperatorAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_1_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_1__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_1__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2039:1: rule__IfStatement__Group_1_1__2 : rule__IfStatement__Group_1_1__2__Impl ;
    public final void rule__IfStatement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2043:1: ( rule__IfStatement__Group_1_1__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2044:2: rule__IfStatement__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_1__2__Impl_in_rule__IfStatement__Group_1_1__24177);
            rule__IfStatement__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_1__2"


    // $ANTLR start "rule__IfStatement__Group_1_1__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2050:1: rule__IfStatement__Group_1_1__2__Impl : ( ( rule__IfStatement__Val_sAssignment_1_1_2 ) ) ;
    public final void rule__IfStatement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2054:1: ( ( ( rule__IfStatement__Val_sAssignment_1_1_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2055:1: ( ( rule__IfStatement__Val_sAssignment_1_1_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2055:1: ( ( rule__IfStatement__Val_sAssignment_1_1_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2056:1: ( rule__IfStatement__Val_sAssignment_1_1_2 )
            {
             before(grammarAccess.getIfStatementAccess().getVal_sAssignment_1_1_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2057:1: ( rule__IfStatement__Val_sAssignment_1_1_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2057:2: rule__IfStatement__Val_sAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__IfStatement__Val_sAssignment_1_1_2_in_rule__IfStatement__Group_1_1__2__Impl4204);
            rule__IfStatement__Val_sAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getVal_sAssignment_1_1_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_1__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_2__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2073:1: rule__IfStatement__Group_1_2__0 : rule__IfStatement__Group_1_2__0__Impl rule__IfStatement__Group_1_2__1 ;
    public final void rule__IfStatement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2077:1: ( rule__IfStatement__Group_1_2__0__Impl rule__IfStatement__Group_1_2__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2078:2: rule__IfStatement__Group_1_2__0__Impl rule__IfStatement__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_2__0__Impl_in_rule__IfStatement__Group_1_2__04240);
            rule__IfStatement__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_2__1_in_rule__IfStatement__Group_1_2__04243);
            rule__IfStatement__Group_1_2__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_2__0"


    // $ANTLR start "rule__IfStatement__Group_1_2__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2085:1: rule__IfStatement__Group_1_2__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_2_0 ) ) ;
    public final void rule__IfStatement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2089:1: ( ( ( rule__IfStatement__LefthandAssignment_1_2_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2090:1: ( ( rule__IfStatement__LefthandAssignment_1_2_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2090:1: ( ( rule__IfStatement__LefthandAssignment_1_2_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2091:1: ( rule__IfStatement__LefthandAssignment_1_2_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_2_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2092:1: ( rule__IfStatement__LefthandAssignment_1_2_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2092:2: rule__IfStatement__LefthandAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_2_0_in_rule__IfStatement__Group_1_2__0__Impl4270);
            rule__IfStatement__LefthandAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_2_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_2__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_2__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2102:1: rule__IfStatement__Group_1_2__1 : rule__IfStatement__Group_1_2__1__Impl rule__IfStatement__Group_1_2__2 ;
    public final void rule__IfStatement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2106:1: ( rule__IfStatement__Group_1_2__1__Impl rule__IfStatement__Group_1_2__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2107:2: rule__IfStatement__Group_1_2__1__Impl rule__IfStatement__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_2__1__Impl_in_rule__IfStatement__Group_1_2__14300);
            rule__IfStatement__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_2__2_in_rule__IfStatement__Group_1_2__14303);
            rule__IfStatement__Group_1_2__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_2__1"


    // $ANTLR start "rule__IfStatement__Group_1_2__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2114:1: rule__IfStatement__Group_1_2__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_2_1 ) ) ;
    public final void rule__IfStatement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2118:1: ( ( ( rule__IfStatement__OperatorAssignment_1_2_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2119:1: ( ( rule__IfStatement__OperatorAssignment_1_2_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2119:1: ( ( rule__IfStatement__OperatorAssignment_1_2_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2120:1: ( rule__IfStatement__OperatorAssignment_1_2_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_2_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2121:1: ( rule__IfStatement__OperatorAssignment_1_2_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2121:2: rule__IfStatement__OperatorAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_2_1_in_rule__IfStatement__Group_1_2__1__Impl4330);
            rule__IfStatement__OperatorAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_2_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_2__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_2__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2131:1: rule__IfStatement__Group_1_2__2 : rule__IfStatement__Group_1_2__2__Impl ;
    public final void rule__IfStatement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2135:1: ( rule__IfStatement__Group_1_2__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2136:2: rule__IfStatement__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_2__2__Impl_in_rule__IfStatement__Group_1_2__24360);
            rule__IfStatement__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_2__2"


    // $ANTLR start "rule__IfStatement__Group_1_2__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2142:1: rule__IfStatement__Group_1_2__2__Impl : ( ( rule__IfStatement__Val_iAssignment_1_2_2 ) ) ;
    public final void rule__IfStatement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2146:1: ( ( ( rule__IfStatement__Val_iAssignment_1_2_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2147:1: ( ( rule__IfStatement__Val_iAssignment_1_2_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2147:1: ( ( rule__IfStatement__Val_iAssignment_1_2_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2148:1: ( rule__IfStatement__Val_iAssignment_1_2_2 )
            {
             before(grammarAccess.getIfStatementAccess().getVal_iAssignment_1_2_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2149:1: ( rule__IfStatement__Val_iAssignment_1_2_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2149:2: rule__IfStatement__Val_iAssignment_1_2_2
            {
            pushFollow(FOLLOW_rule__IfStatement__Val_iAssignment_1_2_2_in_rule__IfStatement__Group_1_2__2__Impl4387);
            rule__IfStatement__Val_iAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getVal_iAssignment_1_2_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_2__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_3__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2165:1: rule__IfStatement__Group_1_3__0 : rule__IfStatement__Group_1_3__0__Impl rule__IfStatement__Group_1_3__1 ;
    public final void rule__IfStatement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2169:1: ( rule__IfStatement__Group_1_3__0__Impl rule__IfStatement__Group_1_3__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2170:2: rule__IfStatement__Group_1_3__0__Impl rule__IfStatement__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_3__0__Impl_in_rule__IfStatement__Group_1_3__04423);
            rule__IfStatement__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_3__1_in_rule__IfStatement__Group_1_3__04426);
            rule__IfStatement__Group_1_3__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_3__0"


    // $ANTLR start "rule__IfStatement__Group_1_3__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2177:1: rule__IfStatement__Group_1_3__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_3_0 ) ) ;
    public final void rule__IfStatement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2181:1: ( ( ( rule__IfStatement__LefthandAssignment_1_3_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2182:1: ( ( rule__IfStatement__LefthandAssignment_1_3_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2182:1: ( ( rule__IfStatement__LefthandAssignment_1_3_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2183:1: ( rule__IfStatement__LefthandAssignment_1_3_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_3_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2184:1: ( rule__IfStatement__LefthandAssignment_1_3_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2184:2: rule__IfStatement__LefthandAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_3_0_in_rule__IfStatement__Group_1_3__0__Impl4453);
            rule__IfStatement__LefthandAssignment_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_3_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_3__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_3__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2194:1: rule__IfStatement__Group_1_3__1 : rule__IfStatement__Group_1_3__1__Impl rule__IfStatement__Group_1_3__2 ;
    public final void rule__IfStatement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2198:1: ( rule__IfStatement__Group_1_3__1__Impl rule__IfStatement__Group_1_3__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2199:2: rule__IfStatement__Group_1_3__1__Impl rule__IfStatement__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_3__1__Impl_in_rule__IfStatement__Group_1_3__14483);
            rule__IfStatement__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_3__2_in_rule__IfStatement__Group_1_3__14486);
            rule__IfStatement__Group_1_3__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_3__1"


    // $ANTLR start "rule__IfStatement__Group_1_3__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2206:1: rule__IfStatement__Group_1_3__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_3_1 ) ) ;
    public final void rule__IfStatement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2210:1: ( ( ( rule__IfStatement__OperatorAssignment_1_3_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2211:1: ( ( rule__IfStatement__OperatorAssignment_1_3_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2211:1: ( ( rule__IfStatement__OperatorAssignment_1_3_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2212:1: ( rule__IfStatement__OperatorAssignment_1_3_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_3_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2213:1: ( rule__IfStatement__OperatorAssignment_1_3_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2213:2: rule__IfStatement__OperatorAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_3_1_in_rule__IfStatement__Group_1_3__1__Impl4513);
            rule__IfStatement__OperatorAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_3_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_3__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_3__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2223:1: rule__IfStatement__Group_1_3__2 : rule__IfStatement__Group_1_3__2__Impl ;
    public final void rule__IfStatement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2227:1: ( rule__IfStatement__Group_1_3__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2228:2: rule__IfStatement__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_3__2__Impl_in_rule__IfStatement__Group_1_3__24543);
            rule__IfStatement__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_3__2"


    // $ANTLR start "rule__IfStatement__Group_1_3__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2234:1: rule__IfStatement__Group_1_3__2__Impl : ( ( rule__IfStatement__RighthandAssignment_1_3_2 ) ) ;
    public final void rule__IfStatement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2238:1: ( ( ( rule__IfStatement__RighthandAssignment_1_3_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2239:1: ( ( rule__IfStatement__RighthandAssignment_1_3_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2239:1: ( ( rule__IfStatement__RighthandAssignment_1_3_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2240:1: ( rule__IfStatement__RighthandAssignment_1_3_2 )
            {
             before(grammarAccess.getIfStatementAccess().getRighthandAssignment_1_3_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2241:1: ( rule__IfStatement__RighthandAssignment_1_3_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2241:2: rule__IfStatement__RighthandAssignment_1_3_2
            {
            pushFollow(FOLLOW_rule__IfStatement__RighthandAssignment_1_3_2_in_rule__IfStatement__Group_1_3__2__Impl4570);
            rule__IfStatement__RighthandAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getRighthandAssignment_1_3_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_3__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_4__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2257:1: rule__IfStatement__Group_1_4__0 : rule__IfStatement__Group_1_4__0__Impl rule__IfStatement__Group_1_4__1 ;
    public final void rule__IfStatement__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2261:1: ( rule__IfStatement__Group_1_4__0__Impl rule__IfStatement__Group_1_4__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2262:2: rule__IfStatement__Group_1_4__0__Impl rule__IfStatement__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_4__0__Impl_in_rule__IfStatement__Group_1_4__04606);
            rule__IfStatement__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_4__1_in_rule__IfStatement__Group_1_4__04609);
            rule__IfStatement__Group_1_4__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_4__0"


    // $ANTLR start "rule__IfStatement__Group_1_4__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2269:1: rule__IfStatement__Group_1_4__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_4_0 ) ) ;
    public final void rule__IfStatement__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2273:1: ( ( ( rule__IfStatement__LefthandAssignment_1_4_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2274:1: ( ( rule__IfStatement__LefthandAssignment_1_4_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2274:1: ( ( rule__IfStatement__LefthandAssignment_1_4_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2275:1: ( rule__IfStatement__LefthandAssignment_1_4_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_4_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2276:1: ( rule__IfStatement__LefthandAssignment_1_4_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2276:2: rule__IfStatement__LefthandAssignment_1_4_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_4_0_in_rule__IfStatement__Group_1_4__0__Impl4636);
            rule__IfStatement__LefthandAssignment_1_4_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_4_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_4__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_4__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2286:1: rule__IfStatement__Group_1_4__1 : rule__IfStatement__Group_1_4__1__Impl rule__IfStatement__Group_1_4__2 ;
    public final void rule__IfStatement__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2290:1: ( rule__IfStatement__Group_1_4__1__Impl rule__IfStatement__Group_1_4__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2291:2: rule__IfStatement__Group_1_4__1__Impl rule__IfStatement__Group_1_4__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_4__1__Impl_in_rule__IfStatement__Group_1_4__14666);
            rule__IfStatement__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_4__2_in_rule__IfStatement__Group_1_4__14669);
            rule__IfStatement__Group_1_4__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_4__1"


    // $ANTLR start "rule__IfStatement__Group_1_4__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2298:1: rule__IfStatement__Group_1_4__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_4_1 ) ) ;
    public final void rule__IfStatement__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2302:1: ( ( ( rule__IfStatement__OperatorAssignment_1_4_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2303:1: ( ( rule__IfStatement__OperatorAssignment_1_4_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2303:1: ( ( rule__IfStatement__OperatorAssignment_1_4_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2304:1: ( rule__IfStatement__OperatorAssignment_1_4_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_4_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2305:1: ( rule__IfStatement__OperatorAssignment_1_4_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2305:2: rule__IfStatement__OperatorAssignment_1_4_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_4_1_in_rule__IfStatement__Group_1_4__1__Impl4696);
            rule__IfStatement__OperatorAssignment_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_4_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_4__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_4__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2315:1: rule__IfStatement__Group_1_4__2 : rule__IfStatement__Group_1_4__2__Impl ;
    public final void rule__IfStatement__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2319:1: ( rule__IfStatement__Group_1_4__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2320:2: rule__IfStatement__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_4__2__Impl_in_rule__IfStatement__Group_1_4__24726);
            rule__IfStatement__Group_1_4__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_4__2"


    // $ANTLR start "rule__IfStatement__Group_1_4__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2326:1: rule__IfStatement__Group_1_4__2__Impl : ( ( rule__IfStatement__RighthandAssignment_1_4_2 ) ) ;
    public final void rule__IfStatement__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2330:1: ( ( ( rule__IfStatement__RighthandAssignment_1_4_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2331:1: ( ( rule__IfStatement__RighthandAssignment_1_4_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2331:1: ( ( rule__IfStatement__RighthandAssignment_1_4_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2332:1: ( rule__IfStatement__RighthandAssignment_1_4_2 )
            {
             before(grammarAccess.getIfStatementAccess().getRighthandAssignment_1_4_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2333:1: ( rule__IfStatement__RighthandAssignment_1_4_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2333:2: rule__IfStatement__RighthandAssignment_1_4_2
            {
            pushFollow(FOLLOW_rule__IfStatement__RighthandAssignment_1_4_2_in_rule__IfStatement__Group_1_4__2__Impl4753);
            rule__IfStatement__RighthandAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getRighthandAssignment_1_4_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_4__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_5__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2349:1: rule__IfStatement__Group_1_5__0 : rule__IfStatement__Group_1_5__0__Impl rule__IfStatement__Group_1_5__1 ;
    public final void rule__IfStatement__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2353:1: ( rule__IfStatement__Group_1_5__0__Impl rule__IfStatement__Group_1_5__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2354:2: rule__IfStatement__Group_1_5__0__Impl rule__IfStatement__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_5__0__Impl_in_rule__IfStatement__Group_1_5__04789);
            rule__IfStatement__Group_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_5__1_in_rule__IfStatement__Group_1_5__04792);
            rule__IfStatement__Group_1_5__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_5__0"


    // $ANTLR start "rule__IfStatement__Group_1_5__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2361:1: rule__IfStatement__Group_1_5__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_5_0 ) ) ;
    public final void rule__IfStatement__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2365:1: ( ( ( rule__IfStatement__LefthandAssignment_1_5_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2366:1: ( ( rule__IfStatement__LefthandAssignment_1_5_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2366:1: ( ( rule__IfStatement__LefthandAssignment_1_5_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2367:1: ( rule__IfStatement__LefthandAssignment_1_5_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_5_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2368:1: ( rule__IfStatement__LefthandAssignment_1_5_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2368:2: rule__IfStatement__LefthandAssignment_1_5_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_5_0_in_rule__IfStatement__Group_1_5__0__Impl4819);
            rule__IfStatement__LefthandAssignment_1_5_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_5_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_5__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_5__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2378:1: rule__IfStatement__Group_1_5__1 : rule__IfStatement__Group_1_5__1__Impl rule__IfStatement__Group_1_5__2 ;
    public final void rule__IfStatement__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2382:1: ( rule__IfStatement__Group_1_5__1__Impl rule__IfStatement__Group_1_5__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2383:2: rule__IfStatement__Group_1_5__1__Impl rule__IfStatement__Group_1_5__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_5__1__Impl_in_rule__IfStatement__Group_1_5__14849);
            rule__IfStatement__Group_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_5__2_in_rule__IfStatement__Group_1_5__14852);
            rule__IfStatement__Group_1_5__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_5__1"


    // $ANTLR start "rule__IfStatement__Group_1_5__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2390:1: rule__IfStatement__Group_1_5__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_5_1 ) ) ;
    public final void rule__IfStatement__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2394:1: ( ( ( rule__IfStatement__OperatorAssignment_1_5_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2395:1: ( ( rule__IfStatement__OperatorAssignment_1_5_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2395:1: ( ( rule__IfStatement__OperatorAssignment_1_5_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2396:1: ( rule__IfStatement__OperatorAssignment_1_5_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_5_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2397:1: ( rule__IfStatement__OperatorAssignment_1_5_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2397:2: rule__IfStatement__OperatorAssignment_1_5_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_5_1_in_rule__IfStatement__Group_1_5__1__Impl4879);
            rule__IfStatement__OperatorAssignment_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_5_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_5__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_5__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2407:1: rule__IfStatement__Group_1_5__2 : rule__IfStatement__Group_1_5__2__Impl ;
    public final void rule__IfStatement__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2411:1: ( rule__IfStatement__Group_1_5__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2412:2: rule__IfStatement__Group_1_5__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_5__2__Impl_in_rule__IfStatement__Group_1_5__24909);
            rule__IfStatement__Group_1_5__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_5__2"


    // $ANTLR start "rule__IfStatement__Group_1_5__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2418:1: rule__IfStatement__Group_1_5__2__Impl : ( ( rule__IfStatement__Val_sAssignment_1_5_2 ) ) ;
    public final void rule__IfStatement__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2422:1: ( ( ( rule__IfStatement__Val_sAssignment_1_5_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2423:1: ( ( rule__IfStatement__Val_sAssignment_1_5_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2423:1: ( ( rule__IfStatement__Val_sAssignment_1_5_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2424:1: ( rule__IfStatement__Val_sAssignment_1_5_2 )
            {
             before(grammarAccess.getIfStatementAccess().getVal_sAssignment_1_5_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2425:1: ( rule__IfStatement__Val_sAssignment_1_5_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2425:2: rule__IfStatement__Val_sAssignment_1_5_2
            {
            pushFollow(FOLLOW_rule__IfStatement__Val_sAssignment_1_5_2_in_rule__IfStatement__Group_1_5__2__Impl4936);
            rule__IfStatement__Val_sAssignment_1_5_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getVal_sAssignment_1_5_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_5__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_6__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2441:1: rule__IfStatement__Group_1_6__0 : rule__IfStatement__Group_1_6__0__Impl rule__IfStatement__Group_1_6__1 ;
    public final void rule__IfStatement__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2445:1: ( rule__IfStatement__Group_1_6__0__Impl rule__IfStatement__Group_1_6__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2446:2: rule__IfStatement__Group_1_6__0__Impl rule__IfStatement__Group_1_6__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_6__0__Impl_in_rule__IfStatement__Group_1_6__04972);
            rule__IfStatement__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_6__1_in_rule__IfStatement__Group_1_6__04975);
            rule__IfStatement__Group_1_6__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_6__0"


    // $ANTLR start "rule__IfStatement__Group_1_6__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2453:1: rule__IfStatement__Group_1_6__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_6_0 ) ) ;
    public final void rule__IfStatement__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2457:1: ( ( ( rule__IfStatement__LefthandAssignment_1_6_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2458:1: ( ( rule__IfStatement__LefthandAssignment_1_6_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2458:1: ( ( rule__IfStatement__LefthandAssignment_1_6_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2459:1: ( rule__IfStatement__LefthandAssignment_1_6_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_6_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2460:1: ( rule__IfStatement__LefthandAssignment_1_6_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2460:2: rule__IfStatement__LefthandAssignment_1_6_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_6_0_in_rule__IfStatement__Group_1_6__0__Impl5002);
            rule__IfStatement__LefthandAssignment_1_6_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_6_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_6__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_6__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2470:1: rule__IfStatement__Group_1_6__1 : rule__IfStatement__Group_1_6__1__Impl rule__IfStatement__Group_1_6__2 ;
    public final void rule__IfStatement__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2474:1: ( rule__IfStatement__Group_1_6__1__Impl rule__IfStatement__Group_1_6__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2475:2: rule__IfStatement__Group_1_6__1__Impl rule__IfStatement__Group_1_6__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_6__1__Impl_in_rule__IfStatement__Group_1_6__15032);
            rule__IfStatement__Group_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_6__2_in_rule__IfStatement__Group_1_6__15035);
            rule__IfStatement__Group_1_6__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_6__1"


    // $ANTLR start "rule__IfStatement__Group_1_6__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2482:1: rule__IfStatement__Group_1_6__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_6_1 ) ) ;
    public final void rule__IfStatement__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2486:1: ( ( ( rule__IfStatement__OperatorAssignment_1_6_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2487:1: ( ( rule__IfStatement__OperatorAssignment_1_6_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2487:1: ( ( rule__IfStatement__OperatorAssignment_1_6_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2488:1: ( rule__IfStatement__OperatorAssignment_1_6_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_6_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2489:1: ( rule__IfStatement__OperatorAssignment_1_6_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2489:2: rule__IfStatement__OperatorAssignment_1_6_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_6_1_in_rule__IfStatement__Group_1_6__1__Impl5062);
            rule__IfStatement__OperatorAssignment_1_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_6_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_6__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_6__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2499:1: rule__IfStatement__Group_1_6__2 : rule__IfStatement__Group_1_6__2__Impl ;
    public final void rule__IfStatement__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2503:1: ( rule__IfStatement__Group_1_6__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2504:2: rule__IfStatement__Group_1_6__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_6__2__Impl_in_rule__IfStatement__Group_1_6__25092);
            rule__IfStatement__Group_1_6__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_6__2"


    // $ANTLR start "rule__IfStatement__Group_1_6__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2510:1: rule__IfStatement__Group_1_6__2__Impl : ( ( rule__IfStatement__Val_iAssignment_1_6_2 ) ) ;
    public final void rule__IfStatement__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2514:1: ( ( ( rule__IfStatement__Val_iAssignment_1_6_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2515:1: ( ( rule__IfStatement__Val_iAssignment_1_6_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2515:1: ( ( rule__IfStatement__Val_iAssignment_1_6_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2516:1: ( rule__IfStatement__Val_iAssignment_1_6_2 )
            {
             before(grammarAccess.getIfStatementAccess().getVal_iAssignment_1_6_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2517:1: ( rule__IfStatement__Val_iAssignment_1_6_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2517:2: rule__IfStatement__Val_iAssignment_1_6_2
            {
            pushFollow(FOLLOW_rule__IfStatement__Val_iAssignment_1_6_2_in_rule__IfStatement__Group_1_6__2__Impl5119);
            rule__IfStatement__Val_iAssignment_1_6_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getVal_iAssignment_1_6_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_6__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_7__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2533:1: rule__IfStatement__Group_1_7__0 : rule__IfStatement__Group_1_7__0__Impl rule__IfStatement__Group_1_7__1 ;
    public final void rule__IfStatement__Group_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2537:1: ( rule__IfStatement__Group_1_7__0__Impl rule__IfStatement__Group_1_7__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2538:2: rule__IfStatement__Group_1_7__0__Impl rule__IfStatement__Group_1_7__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_7__0__Impl_in_rule__IfStatement__Group_1_7__05155);
            rule__IfStatement__Group_1_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_7__1_in_rule__IfStatement__Group_1_7__05158);
            rule__IfStatement__Group_1_7__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_7__0"


    // $ANTLR start "rule__IfStatement__Group_1_7__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2545:1: rule__IfStatement__Group_1_7__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_7_0 ) ) ;
    public final void rule__IfStatement__Group_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2549:1: ( ( ( rule__IfStatement__LefthandAssignment_1_7_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2550:1: ( ( rule__IfStatement__LefthandAssignment_1_7_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2550:1: ( ( rule__IfStatement__LefthandAssignment_1_7_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2551:1: ( rule__IfStatement__LefthandAssignment_1_7_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_7_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2552:1: ( rule__IfStatement__LefthandAssignment_1_7_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2552:2: rule__IfStatement__LefthandAssignment_1_7_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_7_0_in_rule__IfStatement__Group_1_7__0__Impl5185);
            rule__IfStatement__LefthandAssignment_1_7_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_7_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_7__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_7__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2562:1: rule__IfStatement__Group_1_7__1 : rule__IfStatement__Group_1_7__1__Impl rule__IfStatement__Group_1_7__2 ;
    public final void rule__IfStatement__Group_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2566:1: ( rule__IfStatement__Group_1_7__1__Impl rule__IfStatement__Group_1_7__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2567:2: rule__IfStatement__Group_1_7__1__Impl rule__IfStatement__Group_1_7__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_7__1__Impl_in_rule__IfStatement__Group_1_7__15215);
            rule__IfStatement__Group_1_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_7__2_in_rule__IfStatement__Group_1_7__15218);
            rule__IfStatement__Group_1_7__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_7__1"


    // $ANTLR start "rule__IfStatement__Group_1_7__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2574:1: rule__IfStatement__Group_1_7__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_7_1 ) ) ;
    public final void rule__IfStatement__Group_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2578:1: ( ( ( rule__IfStatement__OperatorAssignment_1_7_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2579:1: ( ( rule__IfStatement__OperatorAssignment_1_7_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2579:1: ( ( rule__IfStatement__OperatorAssignment_1_7_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2580:1: ( rule__IfStatement__OperatorAssignment_1_7_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_7_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2581:1: ( rule__IfStatement__OperatorAssignment_1_7_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2581:2: rule__IfStatement__OperatorAssignment_1_7_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_7_1_in_rule__IfStatement__Group_1_7__1__Impl5245);
            rule__IfStatement__OperatorAssignment_1_7_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_7_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_7__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_7__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2591:1: rule__IfStatement__Group_1_7__2 : rule__IfStatement__Group_1_7__2__Impl ;
    public final void rule__IfStatement__Group_1_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2595:1: ( rule__IfStatement__Group_1_7__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2596:2: rule__IfStatement__Group_1_7__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_7__2__Impl_in_rule__IfStatement__Group_1_7__25275);
            rule__IfStatement__Group_1_7__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_7__2"


    // $ANTLR start "rule__IfStatement__Group_1_7__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2602:1: rule__IfStatement__Group_1_7__2__Impl : ( ( rule__IfStatement__RighthandAssignment_1_7_2 ) ) ;
    public final void rule__IfStatement__Group_1_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2606:1: ( ( ( rule__IfStatement__RighthandAssignment_1_7_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2607:1: ( ( rule__IfStatement__RighthandAssignment_1_7_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2607:1: ( ( rule__IfStatement__RighthandAssignment_1_7_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2608:1: ( rule__IfStatement__RighthandAssignment_1_7_2 )
            {
             before(grammarAccess.getIfStatementAccess().getRighthandAssignment_1_7_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2609:1: ( rule__IfStatement__RighthandAssignment_1_7_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2609:2: rule__IfStatement__RighthandAssignment_1_7_2
            {
            pushFollow(FOLLOW_rule__IfStatement__RighthandAssignment_1_7_2_in_rule__IfStatement__Group_1_7__2__Impl5302);
            rule__IfStatement__RighthandAssignment_1_7_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getRighthandAssignment_1_7_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_7__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_8__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2625:1: rule__IfStatement__Group_1_8__0 : rule__IfStatement__Group_1_8__0__Impl rule__IfStatement__Group_1_8__1 ;
    public final void rule__IfStatement__Group_1_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2629:1: ( rule__IfStatement__Group_1_8__0__Impl rule__IfStatement__Group_1_8__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2630:2: rule__IfStatement__Group_1_8__0__Impl rule__IfStatement__Group_1_8__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_8__0__Impl_in_rule__IfStatement__Group_1_8__05338);
            rule__IfStatement__Group_1_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_8__1_in_rule__IfStatement__Group_1_8__05341);
            rule__IfStatement__Group_1_8__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_8__0"


    // $ANTLR start "rule__IfStatement__Group_1_8__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2637:1: rule__IfStatement__Group_1_8__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_8_0 ) ) ;
    public final void rule__IfStatement__Group_1_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2641:1: ( ( ( rule__IfStatement__LefthandAssignment_1_8_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2642:1: ( ( rule__IfStatement__LefthandAssignment_1_8_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2642:1: ( ( rule__IfStatement__LefthandAssignment_1_8_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2643:1: ( rule__IfStatement__LefthandAssignment_1_8_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_8_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2644:1: ( rule__IfStatement__LefthandAssignment_1_8_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2644:2: rule__IfStatement__LefthandAssignment_1_8_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_8_0_in_rule__IfStatement__Group_1_8__0__Impl5368);
            rule__IfStatement__LefthandAssignment_1_8_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_8_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_8__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_8__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2654:1: rule__IfStatement__Group_1_8__1 : rule__IfStatement__Group_1_8__1__Impl rule__IfStatement__Group_1_8__2 ;
    public final void rule__IfStatement__Group_1_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2658:1: ( rule__IfStatement__Group_1_8__1__Impl rule__IfStatement__Group_1_8__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2659:2: rule__IfStatement__Group_1_8__1__Impl rule__IfStatement__Group_1_8__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_8__1__Impl_in_rule__IfStatement__Group_1_8__15398);
            rule__IfStatement__Group_1_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_8__2_in_rule__IfStatement__Group_1_8__15401);
            rule__IfStatement__Group_1_8__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_8__1"


    // $ANTLR start "rule__IfStatement__Group_1_8__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2666:1: rule__IfStatement__Group_1_8__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_8_1 ) ) ;
    public final void rule__IfStatement__Group_1_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2670:1: ( ( ( rule__IfStatement__OperatorAssignment_1_8_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2671:1: ( ( rule__IfStatement__OperatorAssignment_1_8_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2671:1: ( ( rule__IfStatement__OperatorAssignment_1_8_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2672:1: ( rule__IfStatement__OperatorAssignment_1_8_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_8_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2673:1: ( rule__IfStatement__OperatorAssignment_1_8_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2673:2: rule__IfStatement__OperatorAssignment_1_8_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_8_1_in_rule__IfStatement__Group_1_8__1__Impl5428);
            rule__IfStatement__OperatorAssignment_1_8_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_8_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_8__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_8__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2683:1: rule__IfStatement__Group_1_8__2 : rule__IfStatement__Group_1_8__2__Impl ;
    public final void rule__IfStatement__Group_1_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2687:1: ( rule__IfStatement__Group_1_8__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2688:2: rule__IfStatement__Group_1_8__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_8__2__Impl_in_rule__IfStatement__Group_1_8__25458);
            rule__IfStatement__Group_1_8__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_8__2"


    // $ANTLR start "rule__IfStatement__Group_1_8__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2694:1: rule__IfStatement__Group_1_8__2__Impl : ( ( rule__IfStatement__RighthandAssignment_1_8_2 ) ) ;
    public final void rule__IfStatement__Group_1_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2698:1: ( ( ( rule__IfStatement__RighthandAssignment_1_8_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2699:1: ( ( rule__IfStatement__RighthandAssignment_1_8_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2699:1: ( ( rule__IfStatement__RighthandAssignment_1_8_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2700:1: ( rule__IfStatement__RighthandAssignment_1_8_2 )
            {
             before(grammarAccess.getIfStatementAccess().getRighthandAssignment_1_8_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2701:1: ( rule__IfStatement__RighthandAssignment_1_8_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2701:2: rule__IfStatement__RighthandAssignment_1_8_2
            {
            pushFollow(FOLLOW_rule__IfStatement__RighthandAssignment_1_8_2_in_rule__IfStatement__Group_1_8__2__Impl5485);
            rule__IfStatement__RighthandAssignment_1_8_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getRighthandAssignment_1_8_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_8__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_9__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2717:1: rule__IfStatement__Group_1_9__0 : rule__IfStatement__Group_1_9__0__Impl rule__IfStatement__Group_1_9__1 ;
    public final void rule__IfStatement__Group_1_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2721:1: ( rule__IfStatement__Group_1_9__0__Impl rule__IfStatement__Group_1_9__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2722:2: rule__IfStatement__Group_1_9__0__Impl rule__IfStatement__Group_1_9__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_9__0__Impl_in_rule__IfStatement__Group_1_9__05521);
            rule__IfStatement__Group_1_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_9__1_in_rule__IfStatement__Group_1_9__05524);
            rule__IfStatement__Group_1_9__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_9__0"


    // $ANTLR start "rule__IfStatement__Group_1_9__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2729:1: rule__IfStatement__Group_1_9__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_9_0 ) ) ;
    public final void rule__IfStatement__Group_1_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2733:1: ( ( ( rule__IfStatement__LefthandAssignment_1_9_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2734:1: ( ( rule__IfStatement__LefthandAssignment_1_9_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2734:1: ( ( rule__IfStatement__LefthandAssignment_1_9_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2735:1: ( rule__IfStatement__LefthandAssignment_1_9_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_9_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2736:1: ( rule__IfStatement__LefthandAssignment_1_9_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2736:2: rule__IfStatement__LefthandAssignment_1_9_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_9_0_in_rule__IfStatement__Group_1_9__0__Impl5551);
            rule__IfStatement__LefthandAssignment_1_9_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_9_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_9__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_9__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2746:1: rule__IfStatement__Group_1_9__1 : rule__IfStatement__Group_1_9__1__Impl rule__IfStatement__Group_1_9__2 ;
    public final void rule__IfStatement__Group_1_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2750:1: ( rule__IfStatement__Group_1_9__1__Impl rule__IfStatement__Group_1_9__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2751:2: rule__IfStatement__Group_1_9__1__Impl rule__IfStatement__Group_1_9__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_9__1__Impl_in_rule__IfStatement__Group_1_9__15581);
            rule__IfStatement__Group_1_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_9__2_in_rule__IfStatement__Group_1_9__15584);
            rule__IfStatement__Group_1_9__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_9__1"


    // $ANTLR start "rule__IfStatement__Group_1_9__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2758:1: rule__IfStatement__Group_1_9__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_9_1 ) ) ;
    public final void rule__IfStatement__Group_1_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2762:1: ( ( ( rule__IfStatement__OperatorAssignment_1_9_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2763:1: ( ( rule__IfStatement__OperatorAssignment_1_9_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2763:1: ( ( rule__IfStatement__OperatorAssignment_1_9_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2764:1: ( rule__IfStatement__OperatorAssignment_1_9_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_9_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2765:1: ( rule__IfStatement__OperatorAssignment_1_9_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2765:2: rule__IfStatement__OperatorAssignment_1_9_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_9_1_in_rule__IfStatement__Group_1_9__1__Impl5611);
            rule__IfStatement__OperatorAssignment_1_9_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_9_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_9__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_9__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2775:1: rule__IfStatement__Group_1_9__2 : rule__IfStatement__Group_1_9__2__Impl ;
    public final void rule__IfStatement__Group_1_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2779:1: ( rule__IfStatement__Group_1_9__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2780:2: rule__IfStatement__Group_1_9__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_9__2__Impl_in_rule__IfStatement__Group_1_9__25641);
            rule__IfStatement__Group_1_9__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_9__2"


    // $ANTLR start "rule__IfStatement__Group_1_9__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2786:1: rule__IfStatement__Group_1_9__2__Impl : ( ( rule__IfStatement__Val_sAssignment_1_9_2 ) ) ;
    public final void rule__IfStatement__Group_1_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2790:1: ( ( ( rule__IfStatement__Val_sAssignment_1_9_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2791:1: ( ( rule__IfStatement__Val_sAssignment_1_9_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2791:1: ( ( rule__IfStatement__Val_sAssignment_1_9_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2792:1: ( rule__IfStatement__Val_sAssignment_1_9_2 )
            {
             before(grammarAccess.getIfStatementAccess().getVal_sAssignment_1_9_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2793:1: ( rule__IfStatement__Val_sAssignment_1_9_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2793:2: rule__IfStatement__Val_sAssignment_1_9_2
            {
            pushFollow(FOLLOW_rule__IfStatement__Val_sAssignment_1_9_2_in_rule__IfStatement__Group_1_9__2__Impl5668);
            rule__IfStatement__Val_sAssignment_1_9_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getVal_sAssignment_1_9_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_9__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_10__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2809:1: rule__IfStatement__Group_1_10__0 : rule__IfStatement__Group_1_10__0__Impl rule__IfStatement__Group_1_10__1 ;
    public final void rule__IfStatement__Group_1_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2813:1: ( rule__IfStatement__Group_1_10__0__Impl rule__IfStatement__Group_1_10__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2814:2: rule__IfStatement__Group_1_10__0__Impl rule__IfStatement__Group_1_10__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_10__0__Impl_in_rule__IfStatement__Group_1_10__05704);
            rule__IfStatement__Group_1_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_10__1_in_rule__IfStatement__Group_1_10__05707);
            rule__IfStatement__Group_1_10__1();

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
    // $ANTLR end "rule__IfStatement__Group_1_10__0"


    // $ANTLR start "rule__IfStatement__Group_1_10__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2821:1: rule__IfStatement__Group_1_10__0__Impl : ( ( rule__IfStatement__LefthandAssignment_1_10_0 ) ) ;
    public final void rule__IfStatement__Group_1_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2825:1: ( ( ( rule__IfStatement__LefthandAssignment_1_10_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2826:1: ( ( rule__IfStatement__LefthandAssignment_1_10_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2826:1: ( ( rule__IfStatement__LefthandAssignment_1_10_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2827:1: ( rule__IfStatement__LefthandAssignment_1_10_0 )
            {
             before(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_10_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2828:1: ( rule__IfStatement__LefthandAssignment_1_10_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2828:2: rule__IfStatement__LefthandAssignment_1_10_0
            {
            pushFollow(FOLLOW_rule__IfStatement__LefthandAssignment_1_10_0_in_rule__IfStatement__Group_1_10__0__Impl5734);
            rule__IfStatement__LefthandAssignment_1_10_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getLefthandAssignment_1_10_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_10__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_10__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2838:1: rule__IfStatement__Group_1_10__1 : rule__IfStatement__Group_1_10__1__Impl rule__IfStatement__Group_1_10__2 ;
    public final void rule__IfStatement__Group_1_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2842:1: ( rule__IfStatement__Group_1_10__1__Impl rule__IfStatement__Group_1_10__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2843:2: rule__IfStatement__Group_1_10__1__Impl rule__IfStatement__Group_1_10__2
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_10__1__Impl_in_rule__IfStatement__Group_1_10__15764);
            rule__IfStatement__Group_1_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_1_10__2_in_rule__IfStatement__Group_1_10__15767);
            rule__IfStatement__Group_1_10__2();

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
    // $ANTLR end "rule__IfStatement__Group_1_10__1"


    // $ANTLR start "rule__IfStatement__Group_1_10__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2850:1: rule__IfStatement__Group_1_10__1__Impl : ( ( rule__IfStatement__OperatorAssignment_1_10_1 ) ) ;
    public final void rule__IfStatement__Group_1_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2854:1: ( ( ( rule__IfStatement__OperatorAssignment_1_10_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2855:1: ( ( rule__IfStatement__OperatorAssignment_1_10_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2855:1: ( ( rule__IfStatement__OperatorAssignment_1_10_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2856:1: ( rule__IfStatement__OperatorAssignment_1_10_1 )
            {
             before(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_10_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2857:1: ( rule__IfStatement__OperatorAssignment_1_10_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2857:2: rule__IfStatement__OperatorAssignment_1_10_1
            {
            pushFollow(FOLLOW_rule__IfStatement__OperatorAssignment_1_10_1_in_rule__IfStatement__Group_1_10__1__Impl5794);
            rule__IfStatement__OperatorAssignment_1_10_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getOperatorAssignment_1_10_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_10__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_1_10__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2867:1: rule__IfStatement__Group_1_10__2 : rule__IfStatement__Group_1_10__2__Impl ;
    public final void rule__IfStatement__Group_1_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2871:1: ( rule__IfStatement__Group_1_10__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2872:2: rule__IfStatement__Group_1_10__2__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_1_10__2__Impl_in_rule__IfStatement__Group_1_10__25824);
            rule__IfStatement__Group_1_10__2__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_1_10__2"


    // $ANTLR start "rule__IfStatement__Group_1_10__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2878:1: rule__IfStatement__Group_1_10__2__Impl : ( ( rule__IfStatement__Val_iAssignment_1_10_2 ) ) ;
    public final void rule__IfStatement__Group_1_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2882:1: ( ( ( rule__IfStatement__Val_iAssignment_1_10_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2883:1: ( ( rule__IfStatement__Val_iAssignment_1_10_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2883:1: ( ( rule__IfStatement__Val_iAssignment_1_10_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2884:1: ( rule__IfStatement__Val_iAssignment_1_10_2 )
            {
             before(grammarAccess.getIfStatementAccess().getVal_iAssignment_1_10_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2885:1: ( rule__IfStatement__Val_iAssignment_1_10_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2885:2: rule__IfStatement__Val_iAssignment_1_10_2
            {
            pushFollow(FOLLOW_rule__IfStatement__Val_iAssignment_1_10_2_in_rule__IfStatement__Group_1_10__2__Impl5851);
            rule__IfStatement__Val_iAssignment_1_10_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getVal_iAssignment_1_10_2()); 

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
    // $ANTLR end "rule__IfStatement__Group_1_10__2__Impl"


    // $ANTLR start "rule__IfStatement__Group_3__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2901:1: rule__IfStatement__Group_3__0 : rule__IfStatement__Group_3__0__Impl rule__IfStatement__Group_3__1 ;
    public final void rule__IfStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2905:1: ( rule__IfStatement__Group_3__0__Impl rule__IfStatement__Group_3__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2906:2: rule__IfStatement__Group_3__0__Impl rule__IfStatement__Group_3__1
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_3__0__Impl_in_rule__IfStatement__Group_3__05887);
            rule__IfStatement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStatement__Group_3__1_in_rule__IfStatement__Group_3__05890);
            rule__IfStatement__Group_3__1();

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
    // $ANTLR end "rule__IfStatement__Group_3__0"


    // $ANTLR start "rule__IfStatement__Group_3__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2913:1: rule__IfStatement__Group_3__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2917:1: ( ( 'else' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2918:1: ( 'else' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2918:1: ( 'else' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2919:1: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__IfStatement__Group_3__0__Impl5918); 
             after(grammarAccess.getIfStatementAccess().getElseKeyword_3_0()); 

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
    // $ANTLR end "rule__IfStatement__Group_3__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_3__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2932:1: rule__IfStatement__Group_3__1 : rule__IfStatement__Group_3__1__Impl ;
    public final void rule__IfStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2936:1: ( rule__IfStatement__Group_3__1__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2937:2: rule__IfStatement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__IfStatement__Group_3__1__Impl_in_rule__IfStatement__Group_3__15949);
            rule__IfStatement__Group_3__1__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_3__1"


    // $ANTLR start "rule__IfStatement__Group_3__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2943:1: rule__IfStatement__Group_3__1__Impl : ( ( rule__IfStatement__ElseoperationsAssignment_3_1 )* ) ;
    public final void rule__IfStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2947:1: ( ( ( rule__IfStatement__ElseoperationsAssignment_3_1 )* ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2948:1: ( ( rule__IfStatement__ElseoperationsAssignment_3_1 )* )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2948:1: ( ( rule__IfStatement__ElseoperationsAssignment_3_1 )* )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2949:1: ( rule__IfStatement__ElseoperationsAssignment_3_1 )*
            {
             before(grammarAccess.getIfStatementAccess().getElseoperationsAssignment_3_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2950:1: ( rule__IfStatement__ElseoperationsAssignment_3_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_OUT_REFERENCE_HANDLE && LA14_0<=RULE_VAR_REFERENCE_HANDLE)||LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2950:2: rule__IfStatement__ElseoperationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__IfStatement__ElseoperationsAssignment_3_1_in_rule__IfStatement__Group_3__1__Impl5976);
            	    rule__IfStatement__ElseoperationsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getElseoperationsAssignment_3_1()); 

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
    // $ANTLR end "rule__IfStatement__Group_3__1__Impl"


    // $ANTLR start "rule__Assignment__Group_0__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2964:1: rule__Assignment__Group_0__0 : rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 ;
    public final void rule__Assignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2968:1: ( rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2969:2: rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_0__0__Impl_in_rule__Assignment__Group_0__06011);
            rule__Assignment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_0__1_in_rule__Assignment__Group_0__06014);
            rule__Assignment__Group_0__1();

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
    // $ANTLR end "rule__Assignment__Group_0__0"


    // $ANTLR start "rule__Assignment__Group_0__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2976:1: rule__Assignment__Group_0__0__Impl : ( ( rule__Assignment__LefthandAssignment_0_0 ) ) ;
    public final void rule__Assignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2980:1: ( ( ( rule__Assignment__LefthandAssignment_0_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2981:1: ( ( rule__Assignment__LefthandAssignment_0_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2981:1: ( ( rule__Assignment__LefthandAssignment_0_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2982:1: ( rule__Assignment__LefthandAssignment_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLefthandAssignment_0_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2983:1: ( rule__Assignment__LefthandAssignment_0_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2983:2: rule__Assignment__LefthandAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__LefthandAssignment_0_0_in_rule__Assignment__Group_0__0__Impl6041);
            rule__Assignment__LefthandAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLefthandAssignment_0_0()); 

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
    // $ANTLR end "rule__Assignment__Group_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_0__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2993:1: rule__Assignment__Group_0__1 : rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 ;
    public final void rule__Assignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2997:1: ( rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2998:2: rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group_0__1__Impl_in_rule__Assignment__Group_0__16071);
            rule__Assignment__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_0__2_in_rule__Assignment__Group_0__16074);
            rule__Assignment__Group_0__2();

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
    // $ANTLR end "rule__Assignment__Group_0__1"


    // $ANTLR start "rule__Assignment__Group_0__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3005:1: rule__Assignment__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3009:1: ( ( '=' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3010:1: ( '=' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3010:1: ( '=' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3011:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0_1()); 
            match(input,25,FOLLOW_25_in_rule__Assignment__Group_0__1__Impl6102); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Assignment__Group_0__1__Impl"


    // $ANTLR start "rule__Assignment__Group_0__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3024:1: rule__Assignment__Group_0__2 : rule__Assignment__Group_0__2__Impl ;
    public final void rule__Assignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3028:1: ( rule__Assignment__Group_0__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3029:2: rule__Assignment__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_0__2__Impl_in_rule__Assignment__Group_0__26133);
            rule__Assignment__Group_0__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group_0__2"


    // $ANTLR start "rule__Assignment__Group_0__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3035:1: rule__Assignment__Group_0__2__Impl : ( ( rule__Assignment__RighthandAssignment_0_2 ) ) ;
    public final void rule__Assignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3039:1: ( ( ( rule__Assignment__RighthandAssignment_0_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3040:1: ( ( rule__Assignment__RighthandAssignment_0_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3040:1: ( ( rule__Assignment__RighthandAssignment_0_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3041:1: ( rule__Assignment__RighthandAssignment_0_2 )
            {
             before(grammarAccess.getAssignmentAccess().getRighthandAssignment_0_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3042:1: ( rule__Assignment__RighthandAssignment_0_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3042:2: rule__Assignment__RighthandAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Assignment__RighthandAssignment_0_2_in_rule__Assignment__Group_0__2__Impl6160);
            rule__Assignment__RighthandAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getRighthandAssignment_0_2()); 

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
    // $ANTLR end "rule__Assignment__Group_0__2__Impl"


    // $ANTLR start "rule__Assignment__Group_1__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3058:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3062:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3063:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__0__Impl_in_rule__Assignment__Group_1__06196);
            rule__Assignment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_1__1_in_rule__Assignment__Group_1__06199);
            rule__Assignment__Group_1__1();

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
    // $ANTLR end "rule__Assignment__Group_1__0"


    // $ANTLR start "rule__Assignment__Group_1__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3070:1: rule__Assignment__Group_1__0__Impl : ( ( rule__Assignment__LefthandAssignment_1_0 ) ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3074:1: ( ( ( rule__Assignment__LefthandAssignment_1_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3075:1: ( ( rule__Assignment__LefthandAssignment_1_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3075:1: ( ( rule__Assignment__LefthandAssignment_1_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3076:1: ( rule__Assignment__LefthandAssignment_1_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLefthandAssignment_1_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3077:1: ( rule__Assignment__LefthandAssignment_1_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3077:2: rule__Assignment__LefthandAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Assignment__LefthandAssignment_1_0_in_rule__Assignment__Group_1__0__Impl6226);
            rule__Assignment__LefthandAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLefthandAssignment_1_0()); 

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
    // $ANTLR end "rule__Assignment__Group_1__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3087:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3091:1: ( rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3092:2: rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__1__Impl_in_rule__Assignment__Group_1__16256);
            rule__Assignment__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_1__2_in_rule__Assignment__Group_1__16259);
            rule__Assignment__Group_1__2();

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
    // $ANTLR end "rule__Assignment__Group_1__1"


    // $ANTLR start "rule__Assignment__Group_1__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3099:1: rule__Assignment__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3103:1: ( ( '=' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3104:1: ( '=' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3104:1: ( '=' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3105:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1()); 
            match(input,25,FOLLOW_25_in_rule__Assignment__Group_1__1__Impl6287); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Assignment__Group_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3118:1: rule__Assignment__Group_1__2 : rule__Assignment__Group_1__2__Impl ;
    public final void rule__Assignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3122:1: ( rule__Assignment__Group_1__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3123:2: rule__Assignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__2__Impl_in_rule__Assignment__Group_1__26318);
            rule__Assignment__Group_1__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group_1__2"


    // $ANTLR start "rule__Assignment__Group_1__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3129:1: rule__Assignment__Group_1__2__Impl : ( ( rule__Assignment__RighthandAssignment_1_2 ) ) ;
    public final void rule__Assignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3133:1: ( ( ( rule__Assignment__RighthandAssignment_1_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3134:1: ( ( rule__Assignment__RighthandAssignment_1_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3134:1: ( ( rule__Assignment__RighthandAssignment_1_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3135:1: ( rule__Assignment__RighthandAssignment_1_2 )
            {
             before(grammarAccess.getAssignmentAccess().getRighthandAssignment_1_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3136:1: ( rule__Assignment__RighthandAssignment_1_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3136:2: rule__Assignment__RighthandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Assignment__RighthandAssignment_1_2_in_rule__Assignment__Group_1__2__Impl6345);
            rule__Assignment__RighthandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getRighthandAssignment_1_2()); 

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
    // $ANTLR end "rule__Assignment__Group_1__2__Impl"


    // $ANTLR start "rule__Assignment__Group_2__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3152:1: rule__Assignment__Group_2__0 : rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1 ;
    public final void rule__Assignment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3156:1: ( rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3157:2: rule__Assignment__Group_2__0__Impl rule__Assignment__Group_2__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_2__0__Impl_in_rule__Assignment__Group_2__06381);
            rule__Assignment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_2__1_in_rule__Assignment__Group_2__06384);
            rule__Assignment__Group_2__1();

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
    // $ANTLR end "rule__Assignment__Group_2__0"


    // $ANTLR start "rule__Assignment__Group_2__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3164:1: rule__Assignment__Group_2__0__Impl : ( ( rule__Assignment__LefthandAssignment_2_0 ) ) ;
    public final void rule__Assignment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3168:1: ( ( ( rule__Assignment__LefthandAssignment_2_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3169:1: ( ( rule__Assignment__LefthandAssignment_2_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3169:1: ( ( rule__Assignment__LefthandAssignment_2_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3170:1: ( rule__Assignment__LefthandAssignment_2_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLefthandAssignment_2_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3171:1: ( rule__Assignment__LefthandAssignment_2_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3171:2: rule__Assignment__LefthandAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Assignment__LefthandAssignment_2_0_in_rule__Assignment__Group_2__0__Impl6411);
            rule__Assignment__LefthandAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLefthandAssignment_2_0()); 

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
    // $ANTLR end "rule__Assignment__Group_2__0__Impl"


    // $ANTLR start "rule__Assignment__Group_2__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3181:1: rule__Assignment__Group_2__1 : rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2 ;
    public final void rule__Assignment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3185:1: ( rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3186:2: rule__Assignment__Group_2__1__Impl rule__Assignment__Group_2__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group_2__1__Impl_in_rule__Assignment__Group_2__16441);
            rule__Assignment__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_2__2_in_rule__Assignment__Group_2__16444);
            rule__Assignment__Group_2__2();

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
    // $ANTLR end "rule__Assignment__Group_2__1"


    // $ANTLR start "rule__Assignment__Group_2__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3193:1: rule__Assignment__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3197:1: ( ( '=' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3198:1: ( '=' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3198:1: ( '=' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3199:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2_1()); 
            match(input,25,FOLLOW_25_in_rule__Assignment__Group_2__1__Impl6472); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__Assignment__Group_2__1__Impl"


    // $ANTLR start "rule__Assignment__Group_2__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3212:1: rule__Assignment__Group_2__2 : rule__Assignment__Group_2__2__Impl ;
    public final void rule__Assignment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3216:1: ( rule__Assignment__Group_2__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3217:2: rule__Assignment__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_2__2__Impl_in_rule__Assignment__Group_2__26503);
            rule__Assignment__Group_2__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group_2__2"


    // $ANTLR start "rule__Assignment__Group_2__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3223:1: rule__Assignment__Group_2__2__Impl : ( ( rule__Assignment__Val_sAssignment_2_2 ) ) ;
    public final void rule__Assignment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3227:1: ( ( ( rule__Assignment__Val_sAssignment_2_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3228:1: ( ( rule__Assignment__Val_sAssignment_2_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3228:1: ( ( rule__Assignment__Val_sAssignment_2_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3229:1: ( rule__Assignment__Val_sAssignment_2_2 )
            {
             before(grammarAccess.getAssignmentAccess().getVal_sAssignment_2_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3230:1: ( rule__Assignment__Val_sAssignment_2_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3230:2: rule__Assignment__Val_sAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Assignment__Val_sAssignment_2_2_in_rule__Assignment__Group_2__2__Impl6530);
            rule__Assignment__Val_sAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVal_sAssignment_2_2()); 

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
    // $ANTLR end "rule__Assignment__Group_2__2__Impl"


    // $ANTLR start "rule__Assignment__Group_3__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3246:1: rule__Assignment__Group_3__0 : rule__Assignment__Group_3__0__Impl rule__Assignment__Group_3__1 ;
    public final void rule__Assignment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3250:1: ( rule__Assignment__Group_3__0__Impl rule__Assignment__Group_3__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3251:2: rule__Assignment__Group_3__0__Impl rule__Assignment__Group_3__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_3__0__Impl_in_rule__Assignment__Group_3__06566);
            rule__Assignment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_3__1_in_rule__Assignment__Group_3__06569);
            rule__Assignment__Group_3__1();

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
    // $ANTLR end "rule__Assignment__Group_3__0"


    // $ANTLR start "rule__Assignment__Group_3__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3258:1: rule__Assignment__Group_3__0__Impl : ( ( rule__Assignment__LefthandAssignment_3_0 ) ) ;
    public final void rule__Assignment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3262:1: ( ( ( rule__Assignment__LefthandAssignment_3_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3263:1: ( ( rule__Assignment__LefthandAssignment_3_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3263:1: ( ( rule__Assignment__LefthandAssignment_3_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3264:1: ( rule__Assignment__LefthandAssignment_3_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLefthandAssignment_3_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3265:1: ( rule__Assignment__LefthandAssignment_3_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3265:2: rule__Assignment__LefthandAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Assignment__LefthandAssignment_3_0_in_rule__Assignment__Group_3__0__Impl6596);
            rule__Assignment__LefthandAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLefthandAssignment_3_0()); 

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
    // $ANTLR end "rule__Assignment__Group_3__0__Impl"


    // $ANTLR start "rule__Assignment__Group_3__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3275:1: rule__Assignment__Group_3__1 : rule__Assignment__Group_3__1__Impl rule__Assignment__Group_3__2 ;
    public final void rule__Assignment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3279:1: ( rule__Assignment__Group_3__1__Impl rule__Assignment__Group_3__2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3280:2: rule__Assignment__Group_3__1__Impl rule__Assignment__Group_3__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group_3__1__Impl_in_rule__Assignment__Group_3__16626);
            rule__Assignment__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_3__2_in_rule__Assignment__Group_3__16629);
            rule__Assignment__Group_3__2();

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
    // $ANTLR end "rule__Assignment__Group_3__1"


    // $ANTLR start "rule__Assignment__Group_3__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3287:1: rule__Assignment__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3291:1: ( ( '=' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3292:1: ( '=' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3292:1: ( '=' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3293:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_3_1()); 
            match(input,25,FOLLOW_25_in_rule__Assignment__Group_3__1__Impl6657); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Assignment__Group_3__1__Impl"


    // $ANTLR start "rule__Assignment__Group_3__2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3306:1: rule__Assignment__Group_3__2 : rule__Assignment__Group_3__2__Impl ;
    public final void rule__Assignment__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3310:1: ( rule__Assignment__Group_3__2__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3311:2: rule__Assignment__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_3__2__Impl_in_rule__Assignment__Group_3__26688);
            rule__Assignment__Group_3__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group_3__2"


    // $ANTLR start "rule__Assignment__Group_3__2__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3317:1: rule__Assignment__Group_3__2__Impl : ( ( rule__Assignment__Val_iAssignment_3_2 ) ) ;
    public final void rule__Assignment__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3321:1: ( ( ( rule__Assignment__Val_iAssignment_3_2 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3322:1: ( ( rule__Assignment__Val_iAssignment_3_2 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3322:1: ( ( rule__Assignment__Val_iAssignment_3_2 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3323:1: ( rule__Assignment__Val_iAssignment_3_2 )
            {
             before(grammarAccess.getAssignmentAccess().getVal_iAssignment_3_2()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3324:1: ( rule__Assignment__Val_iAssignment_3_2 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3324:2: rule__Assignment__Val_iAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Assignment__Val_iAssignment_3_2_in_rule__Assignment__Group_3__2__Impl6715);
            rule__Assignment__Val_iAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVal_iAssignment_3_2()); 

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
    // $ANTLR end "rule__Assignment__Group_3__2__Impl"


    // $ANTLR start "rule__IN_REFERENCE__Group__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3340:1: rule__IN_REFERENCE__Group__0 : rule__IN_REFERENCE__Group__0__Impl rule__IN_REFERENCE__Group__1 ;
    public final void rule__IN_REFERENCE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3344:1: ( rule__IN_REFERENCE__Group__0__Impl rule__IN_REFERENCE__Group__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3345:2: rule__IN_REFERENCE__Group__0__Impl rule__IN_REFERENCE__Group__1
            {
            pushFollow(FOLLOW_rule__IN_REFERENCE__Group__0__Impl_in_rule__IN_REFERENCE__Group__06751);
            rule__IN_REFERENCE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IN_REFERENCE__Group__1_in_rule__IN_REFERENCE__Group__06754);
            rule__IN_REFERENCE__Group__1();

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
    // $ANTLR end "rule__IN_REFERENCE__Group__0"


    // $ANTLR start "rule__IN_REFERENCE__Group__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3352:1: rule__IN_REFERENCE__Group__0__Impl : ( RULE_IN_REFERENCE_HANDLE ) ;
    public final void rule__IN_REFERENCE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3356:1: ( ( RULE_IN_REFERENCE_HANDLE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3357:1: ( RULE_IN_REFERENCE_HANDLE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3357:1: ( RULE_IN_REFERENCE_HANDLE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3358:1: RULE_IN_REFERENCE_HANDLE
            {
             before(grammarAccess.getIN_REFERENCEAccess().getIN_REFERENCE_HANDLETerminalRuleCall_0()); 
            match(input,RULE_IN_REFERENCE_HANDLE,FOLLOW_RULE_IN_REFERENCE_HANDLE_in_rule__IN_REFERENCE__Group__0__Impl6781); 
             after(grammarAccess.getIN_REFERENCEAccess().getIN_REFERENCE_HANDLETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IN_REFERENCE__Group__0__Impl"


    // $ANTLR start "rule__IN_REFERENCE__Group__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3369:1: rule__IN_REFERENCE__Group__1 : rule__IN_REFERENCE__Group__1__Impl ;
    public final void rule__IN_REFERENCE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3373:1: ( rule__IN_REFERENCE__Group__1__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3374:2: rule__IN_REFERENCE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IN_REFERENCE__Group__1__Impl_in_rule__IN_REFERENCE__Group__16810);
            rule__IN_REFERENCE__Group__1__Impl();

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
    // $ANTLR end "rule__IN_REFERENCE__Group__1"


    // $ANTLR start "rule__IN_REFERENCE__Group__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3380:1: rule__IN_REFERENCE__Group__1__Impl : ( ( rule__IN_REFERENCE__RefnameAssignment_1 ) ) ;
    public final void rule__IN_REFERENCE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3384:1: ( ( ( rule__IN_REFERENCE__RefnameAssignment_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3385:1: ( ( rule__IN_REFERENCE__RefnameAssignment_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3385:1: ( ( rule__IN_REFERENCE__RefnameAssignment_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3386:1: ( rule__IN_REFERENCE__RefnameAssignment_1 )
            {
             before(grammarAccess.getIN_REFERENCEAccess().getRefnameAssignment_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3387:1: ( rule__IN_REFERENCE__RefnameAssignment_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3387:2: rule__IN_REFERENCE__RefnameAssignment_1
            {
            pushFollow(FOLLOW_rule__IN_REFERENCE__RefnameAssignment_1_in_rule__IN_REFERENCE__Group__1__Impl6837);
            rule__IN_REFERENCE__RefnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIN_REFERENCEAccess().getRefnameAssignment_1()); 

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
    // $ANTLR end "rule__IN_REFERENCE__Group__1__Impl"


    // $ANTLR start "rule__OUT_REFERENCE__Group__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3401:1: rule__OUT_REFERENCE__Group__0 : rule__OUT_REFERENCE__Group__0__Impl rule__OUT_REFERENCE__Group__1 ;
    public final void rule__OUT_REFERENCE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3405:1: ( rule__OUT_REFERENCE__Group__0__Impl rule__OUT_REFERENCE__Group__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3406:2: rule__OUT_REFERENCE__Group__0__Impl rule__OUT_REFERENCE__Group__1
            {
            pushFollow(FOLLOW_rule__OUT_REFERENCE__Group__0__Impl_in_rule__OUT_REFERENCE__Group__06871);
            rule__OUT_REFERENCE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OUT_REFERENCE__Group__1_in_rule__OUT_REFERENCE__Group__06874);
            rule__OUT_REFERENCE__Group__1();

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
    // $ANTLR end "rule__OUT_REFERENCE__Group__0"


    // $ANTLR start "rule__OUT_REFERENCE__Group__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3413:1: rule__OUT_REFERENCE__Group__0__Impl : ( RULE_OUT_REFERENCE_HANDLE ) ;
    public final void rule__OUT_REFERENCE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3417:1: ( ( RULE_OUT_REFERENCE_HANDLE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3418:1: ( RULE_OUT_REFERENCE_HANDLE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3418:1: ( RULE_OUT_REFERENCE_HANDLE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3419:1: RULE_OUT_REFERENCE_HANDLE
            {
             before(grammarAccess.getOUT_REFERENCEAccess().getOUT_REFERENCE_HANDLETerminalRuleCall_0()); 
            match(input,RULE_OUT_REFERENCE_HANDLE,FOLLOW_RULE_OUT_REFERENCE_HANDLE_in_rule__OUT_REFERENCE__Group__0__Impl6901); 
             after(grammarAccess.getOUT_REFERENCEAccess().getOUT_REFERENCE_HANDLETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__OUT_REFERENCE__Group__0__Impl"


    // $ANTLR start "rule__OUT_REFERENCE__Group__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3430:1: rule__OUT_REFERENCE__Group__1 : rule__OUT_REFERENCE__Group__1__Impl ;
    public final void rule__OUT_REFERENCE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3434:1: ( rule__OUT_REFERENCE__Group__1__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3435:2: rule__OUT_REFERENCE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OUT_REFERENCE__Group__1__Impl_in_rule__OUT_REFERENCE__Group__16930);
            rule__OUT_REFERENCE__Group__1__Impl();

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
    // $ANTLR end "rule__OUT_REFERENCE__Group__1"


    // $ANTLR start "rule__OUT_REFERENCE__Group__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3441:1: rule__OUT_REFERENCE__Group__1__Impl : ( ( rule__OUT_REFERENCE__RefnameAssignment_1 ) ) ;
    public final void rule__OUT_REFERENCE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3445:1: ( ( ( rule__OUT_REFERENCE__RefnameAssignment_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3446:1: ( ( rule__OUT_REFERENCE__RefnameAssignment_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3446:1: ( ( rule__OUT_REFERENCE__RefnameAssignment_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3447:1: ( rule__OUT_REFERENCE__RefnameAssignment_1 )
            {
             before(grammarAccess.getOUT_REFERENCEAccess().getRefnameAssignment_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3448:1: ( rule__OUT_REFERENCE__RefnameAssignment_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3448:2: rule__OUT_REFERENCE__RefnameAssignment_1
            {
            pushFollow(FOLLOW_rule__OUT_REFERENCE__RefnameAssignment_1_in_rule__OUT_REFERENCE__Group__1__Impl6957);
            rule__OUT_REFERENCE__RefnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOUT_REFERENCEAccess().getRefnameAssignment_1()); 

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
    // $ANTLR end "rule__OUT_REFERENCE__Group__1__Impl"


    // $ANTLR start "rule__VAR_REFERENCE__Group__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3462:1: rule__VAR_REFERENCE__Group__0 : rule__VAR_REFERENCE__Group__0__Impl rule__VAR_REFERENCE__Group__1 ;
    public final void rule__VAR_REFERENCE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3466:1: ( rule__VAR_REFERENCE__Group__0__Impl rule__VAR_REFERENCE__Group__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3467:2: rule__VAR_REFERENCE__Group__0__Impl rule__VAR_REFERENCE__Group__1
            {
            pushFollow(FOLLOW_rule__VAR_REFERENCE__Group__0__Impl_in_rule__VAR_REFERENCE__Group__06991);
            rule__VAR_REFERENCE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VAR_REFERENCE__Group__1_in_rule__VAR_REFERENCE__Group__06994);
            rule__VAR_REFERENCE__Group__1();

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
    // $ANTLR end "rule__VAR_REFERENCE__Group__0"


    // $ANTLR start "rule__VAR_REFERENCE__Group__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3474:1: rule__VAR_REFERENCE__Group__0__Impl : ( RULE_VAR_REFERENCE_HANDLE ) ;
    public final void rule__VAR_REFERENCE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3478:1: ( ( RULE_VAR_REFERENCE_HANDLE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3479:1: ( RULE_VAR_REFERENCE_HANDLE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3479:1: ( RULE_VAR_REFERENCE_HANDLE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3480:1: RULE_VAR_REFERENCE_HANDLE
            {
             before(grammarAccess.getVAR_REFERENCEAccess().getVAR_REFERENCE_HANDLETerminalRuleCall_0()); 
            match(input,RULE_VAR_REFERENCE_HANDLE,FOLLOW_RULE_VAR_REFERENCE_HANDLE_in_rule__VAR_REFERENCE__Group__0__Impl7021); 
             after(grammarAccess.getVAR_REFERENCEAccess().getVAR_REFERENCE_HANDLETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__VAR_REFERENCE__Group__0__Impl"


    // $ANTLR start "rule__VAR_REFERENCE__Group__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3491:1: rule__VAR_REFERENCE__Group__1 : rule__VAR_REFERENCE__Group__1__Impl ;
    public final void rule__VAR_REFERENCE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3495:1: ( rule__VAR_REFERENCE__Group__1__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3496:2: rule__VAR_REFERENCE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VAR_REFERENCE__Group__1__Impl_in_rule__VAR_REFERENCE__Group__17050);
            rule__VAR_REFERENCE__Group__1__Impl();

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
    // $ANTLR end "rule__VAR_REFERENCE__Group__1"


    // $ANTLR start "rule__VAR_REFERENCE__Group__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3502:1: rule__VAR_REFERENCE__Group__1__Impl : ( ( rule__VAR_REFERENCE__RefnameAssignment_1 ) ) ;
    public final void rule__VAR_REFERENCE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3506:1: ( ( ( rule__VAR_REFERENCE__RefnameAssignment_1 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3507:1: ( ( rule__VAR_REFERENCE__RefnameAssignment_1 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3507:1: ( ( rule__VAR_REFERENCE__RefnameAssignment_1 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3508:1: ( rule__VAR_REFERENCE__RefnameAssignment_1 )
            {
             before(grammarAccess.getVAR_REFERENCEAccess().getRefnameAssignment_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3509:1: ( rule__VAR_REFERENCE__RefnameAssignment_1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3509:2: rule__VAR_REFERENCE__RefnameAssignment_1
            {
            pushFollow(FOLLOW_rule__VAR_REFERENCE__RefnameAssignment_1_in_rule__VAR_REFERENCE__Group__1__Impl7077);
            rule__VAR_REFERENCE__RefnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVAR_REFERENCEAccess().getRefnameAssignment_1()); 

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
    // $ANTLR end "rule__VAR_REFERENCE__Group__1__Impl"


    // $ANTLR start "rule__QUALIFIEDNAME__Group__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3523:1: rule__QUALIFIEDNAME__Group__0 : rule__QUALIFIEDNAME__Group__0__Impl rule__QUALIFIEDNAME__Group__1 ;
    public final void rule__QUALIFIEDNAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3527:1: ( rule__QUALIFIEDNAME__Group__0__Impl rule__QUALIFIEDNAME__Group__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3528:2: rule__QUALIFIEDNAME__Group__0__Impl rule__QUALIFIEDNAME__Group__1
            {
            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group__0__Impl_in_rule__QUALIFIEDNAME__Group__07111);
            rule__QUALIFIEDNAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group__1_in_rule__QUALIFIEDNAME__Group__07114);
            rule__QUALIFIEDNAME__Group__1();

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group__0"


    // $ANTLR start "rule__QUALIFIEDNAME__Group__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3535:1: rule__QUALIFIEDNAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIEDNAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3539:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3540:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3540:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3541:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIEDNAME__Group__0__Impl7141); 
             after(grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group__0__Impl"


    // $ANTLR start "rule__QUALIFIEDNAME__Group__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3552:1: rule__QUALIFIEDNAME__Group__1 : rule__QUALIFIEDNAME__Group__1__Impl ;
    public final void rule__QUALIFIEDNAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3556:1: ( rule__QUALIFIEDNAME__Group__1__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3557:2: rule__QUALIFIEDNAME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group__1__Impl_in_rule__QUALIFIEDNAME__Group__17170);
            rule__QUALIFIEDNAME__Group__1__Impl();

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group__1"


    // $ANTLR start "rule__QUALIFIEDNAME__Group__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3563:1: rule__QUALIFIEDNAME__Group__1__Impl : ( ( rule__QUALIFIEDNAME__Group_1__0 )* ) ;
    public final void rule__QUALIFIEDNAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3567:1: ( ( ( rule__QUALIFIEDNAME__Group_1__0 )* ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3568:1: ( ( rule__QUALIFIEDNAME__Group_1__0 )* )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3568:1: ( ( rule__QUALIFIEDNAME__Group_1__0 )* )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3569:1: ( rule__QUALIFIEDNAME__Group_1__0 )*
            {
             before(grammarAccess.getQUALIFIEDNAMEAccess().getGroup_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3570:1: ( rule__QUALIFIEDNAME__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3570:2: rule__QUALIFIEDNAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group_1__0_in_rule__QUALIFIEDNAME__Group__1__Impl7197);
            	    rule__QUALIFIEDNAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getQUALIFIEDNAMEAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group__1__Impl"


    // $ANTLR start "rule__QUALIFIEDNAME__Group_1__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3584:1: rule__QUALIFIEDNAME__Group_1__0 : rule__QUALIFIEDNAME__Group_1__0__Impl rule__QUALIFIEDNAME__Group_1__1 ;
    public final void rule__QUALIFIEDNAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3588:1: ( rule__QUALIFIEDNAME__Group_1__0__Impl rule__QUALIFIEDNAME__Group_1__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3589:2: rule__QUALIFIEDNAME__Group_1__0__Impl rule__QUALIFIEDNAME__Group_1__1
            {
            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group_1__0__Impl_in_rule__QUALIFIEDNAME__Group_1__07232);
            rule__QUALIFIEDNAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group_1__1_in_rule__QUALIFIEDNAME__Group_1__07235);
            rule__QUALIFIEDNAME__Group_1__1();

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group_1__0"


    // $ANTLR start "rule__QUALIFIEDNAME__Group_1__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3596:1: rule__QUALIFIEDNAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QUALIFIEDNAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3600:1: ( ( '.' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3601:1: ( '.' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3601:1: ( '.' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3602:1: '.'
            {
             before(grammarAccess.getQUALIFIEDNAMEAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__QUALIFIEDNAME__Group_1__0__Impl7263); 
             after(grammarAccess.getQUALIFIEDNAMEAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group_1__0__Impl"


    // $ANTLR start "rule__QUALIFIEDNAME__Group_1__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3615:1: rule__QUALIFIEDNAME__Group_1__1 : rule__QUALIFIEDNAME__Group_1__1__Impl ;
    public final void rule__QUALIFIEDNAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3619:1: ( rule__QUALIFIEDNAME__Group_1__1__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3620:2: rule__QUALIFIEDNAME__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIEDNAME__Group_1__1__Impl_in_rule__QUALIFIEDNAME__Group_1__17294);
            rule__QUALIFIEDNAME__Group_1__1__Impl();

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group_1__1"


    // $ANTLR start "rule__QUALIFIEDNAME__Group_1__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3626:1: rule__QUALIFIEDNAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIEDNAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3630:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3631:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3631:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3632:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIEDNAME__Group_1__1__Impl7321); 
             after(grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QUALIFIEDNAME__Group_1__1__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3647:1: rule__QUALIFIEDID__Group__0 : rule__QUALIFIEDID__Group__0__Impl rule__QUALIFIEDID__Group__1 ;
    public final void rule__QUALIFIEDID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3651:1: ( rule__QUALIFIEDID__Group__0__Impl rule__QUALIFIEDID__Group__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3652:2: rule__QUALIFIEDID__Group__0__Impl rule__QUALIFIEDID__Group__1
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__0__Impl_in_rule__QUALIFIEDID__Group__07354);
            rule__QUALIFIEDID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__1_in_rule__QUALIFIEDID__Group__07357);
            rule__QUALIFIEDID__Group__1();

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
    // $ANTLR end "rule__QUALIFIEDID__Group__0"


    // $ANTLR start "rule__QUALIFIEDID__Group__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3659:1: rule__QUALIFIEDID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIEDID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3663:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3664:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3664:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3665:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIEDID__Group__0__Impl7384); 
             after(grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QUALIFIEDID__Group__0__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3676:1: rule__QUALIFIEDID__Group__1 : rule__QUALIFIEDID__Group__1__Impl ;
    public final void rule__QUALIFIEDID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3680:1: ( rule__QUALIFIEDID__Group__1__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3681:2: rule__QUALIFIEDID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group__1__Impl_in_rule__QUALIFIEDID__Group__17413);
            rule__QUALIFIEDID__Group__1__Impl();

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
    // $ANTLR end "rule__QUALIFIEDID__Group__1"


    // $ANTLR start "rule__QUALIFIEDID__Group__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3687:1: rule__QUALIFIEDID__Group__1__Impl : ( ( rule__QUALIFIEDID__Group_1__0 )* ) ;
    public final void rule__QUALIFIEDID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3691:1: ( ( ( rule__QUALIFIEDID__Group_1__0 )* ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3692:1: ( ( rule__QUALIFIEDID__Group_1__0 )* )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3692:1: ( ( rule__QUALIFIEDID__Group_1__0 )* )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3693:1: ( rule__QUALIFIEDID__Group_1__0 )*
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getGroup_1()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3694:1: ( rule__QUALIFIEDID__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3694:2: rule__QUALIFIEDID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__0_in_rule__QUALIFIEDID__Group__1__Impl7440);
            	    rule__QUALIFIEDID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getQUALIFIEDIDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QUALIFIEDID__Group__1__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3708:1: rule__QUALIFIEDID__Group_1__0 : rule__QUALIFIEDID__Group_1__0__Impl rule__QUALIFIEDID__Group_1__1 ;
    public final void rule__QUALIFIEDID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3712:1: ( rule__QUALIFIEDID__Group_1__0__Impl rule__QUALIFIEDID__Group_1__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3713:2: rule__QUALIFIEDID__Group_1__0__Impl rule__QUALIFIEDID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__0__Impl_in_rule__QUALIFIEDID__Group_1__07475);
            rule__QUALIFIEDID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__1_in_rule__QUALIFIEDID__Group_1__07478);
            rule__QUALIFIEDID__Group_1__1();

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
    // $ANTLR end "rule__QUALIFIEDID__Group_1__0"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3720:1: rule__QUALIFIEDID__Group_1__0__Impl : ( '/' ) ;
    public final void rule__QUALIFIEDID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3724:1: ( ( '/' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3725:1: ( '/' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3725:1: ( '/' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3726:1: '/'
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getSolidusKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__QUALIFIEDID__Group_1__0__Impl7506); 
             after(grammarAccess.getQUALIFIEDIDAccess().getSolidusKeyword_1_0()); 

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
    // $ANTLR end "rule__QUALIFIEDID__Group_1__0__Impl"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3739:1: rule__QUALIFIEDID__Group_1__1 : rule__QUALIFIEDID__Group_1__1__Impl ;
    public final void rule__QUALIFIEDID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3743:1: ( rule__QUALIFIEDID__Group_1__1__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3744:2: rule__QUALIFIEDID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIEDID__Group_1__1__Impl_in_rule__QUALIFIEDID__Group_1__17537);
            rule__QUALIFIEDID__Group_1__1__Impl();

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
    // $ANTLR end "rule__QUALIFIEDID__Group_1__1"


    // $ANTLR start "rule__QUALIFIEDID__Group_1__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3750:1: rule__QUALIFIEDID__Group_1__1__Impl : ( ruleQUALIFIEDNAME ) ;
    public final void rule__QUALIFIEDID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3754:1: ( ( ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3755:1: ( ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3755:1: ( ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3756:1: ruleQUALIFIEDNAME
            {
             before(grammarAccess.getQUALIFIEDIDAccess().getQUALIFIEDNAMEParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_rule__QUALIFIEDID__Group_1__1__Impl7564);
            ruleQUALIFIEDNAME();

            state._fsp--;

             after(grammarAccess.getQUALIFIEDIDAccess().getQUALIFIEDNAMEParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__QUALIFIEDID__Group_1__1__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3771:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3775:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3776:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__07597);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__07600);
            rule__URI__Group__1();

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
    // $ANTLR end "rule__URI__Group__0"


    // $ANTLR start "rule__URI__Group__0__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3783:1: rule__URI__Group__0__Impl : ( '/' ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3787:1: ( ( '/' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3788:1: ( '/' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3788:1: ( '/' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3789:1: '/'
            {
             before(grammarAccess.getURIAccess().getSolidusKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__URI__Group__0__Impl7628); 
             after(grammarAccess.getURIAccess().getSolidusKeyword_0()); 

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
    // $ANTLR end "rule__URI__Group__0__Impl"


    // $ANTLR start "rule__URI__Group__1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3802:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3806:1: ( rule__URI__Group__1__Impl )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3807:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__17659);
            rule__URI__Group__1__Impl();

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
    // $ANTLR end "rule__URI__Group__1"


    // $ANTLR start "rule__URI__Group__1__Impl"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3813:1: rule__URI__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3817:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3818:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3818:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3819:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__Group__1__Impl7686); 
             after(grammarAccess.getURIAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__URI__Group__1__Impl"


    // $ANTLR start "rule__Worksequence__OperationsAssignment"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3835:1: rule__Worksequence__OperationsAssignment : ( ruleOperation ) ;
    public final void rule__Worksequence__OperationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3839:1: ( ( ruleOperation ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3840:1: ( ruleOperation )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3840:1: ( ruleOperation )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3841:1: ruleOperation
            {
             before(grammarAccess.getWorksequenceAccess().getOperationsOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Worksequence__OperationsAssignment7724);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getWorksequenceAccess().getOperationsOperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Worksequence__OperationsAssignment"


    // $ANTLR start "rule__LocalBinding__ProcessidAssignment_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3850:1: rule__LocalBinding__ProcessidAssignment_2 : ( ruleQUALIFIEDNAME ) ;
    public final void rule__LocalBinding__ProcessidAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3854:1: ( ( ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3855:1: ( ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3855:1: ( ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3856:1: ruleQUALIFIEDNAME
            {
             before(grammarAccess.getLocalBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_rule__LocalBinding__ProcessidAssignment_27755);
            ruleQUALIFIEDNAME();

            state._fsp--;

             after(grammarAccess.getLocalBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LocalBinding__ProcessidAssignment_2"


    // $ANTLR start "rule__LocalBinding__HandleAssignment_4"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3865:1: rule__LocalBinding__HandleAssignment_4 : ( ruleQUALIFIEDID ) ;
    public final void rule__LocalBinding__HandleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3869:1: ( ( ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3870:1: ( ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3870:1: ( ruleQUALIFIEDID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3871:1: ruleQUALIFIEDID
            {
             before(grammarAccess.getLocalBindingAccess().getHandleQUALIFIEDIDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_rule__LocalBinding__HandleAssignment_47786);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getLocalBindingAccess().getHandleQUALIFIEDIDParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LocalBinding__HandleAssignment_4"


    // $ANTLR start "rule__RemoteBinding__ProtocolAssignment_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3880:1: rule__RemoteBinding__ProtocolAssignment_2 : ( RULE_PROTOCOL ) ;
    public final void rule__RemoteBinding__ProtocolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3884:1: ( ( RULE_PROTOCOL ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3885:1: ( RULE_PROTOCOL )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3885:1: ( RULE_PROTOCOL )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3886:1: RULE_PROTOCOL
            {
             before(grammarAccess.getRemoteBindingAccess().getProtocolPROTOCOLTerminalRuleCall_2_0()); 
            match(input,RULE_PROTOCOL,FOLLOW_RULE_PROTOCOL_in_rule__RemoteBinding__ProtocolAssignment_27817); 
             after(grammarAccess.getRemoteBindingAccess().getProtocolPROTOCOLTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RemoteBinding__ProtocolAssignment_2"


    // $ANTLR start "rule__RemoteBinding__HostAssignment_3"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3895:1: rule__RemoteBinding__HostAssignment_3 : ( ruleQUALIFIEDNAME ) ;
    public final void rule__RemoteBinding__HostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3899:1: ( ( ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3900:1: ( ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3900:1: ( ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3901:1: ruleQUALIFIEDNAME
            {
             before(grammarAccess.getRemoteBindingAccess().getHostQUALIFIEDNAMEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_rule__RemoteBinding__HostAssignment_37848);
            ruleQUALIFIEDNAME();

            state._fsp--;

             after(grammarAccess.getRemoteBindingAccess().getHostQUALIFIEDNAMEParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RemoteBinding__HostAssignment_3"


    // $ANTLR start "rule__RemoteBinding__PortAssignment_4"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3910:1: rule__RemoteBinding__PortAssignment_4 : ( RULE_INT ) ;
    public final void rule__RemoteBinding__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3914:1: ( ( RULE_INT ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3915:1: ( RULE_INT )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3915:1: ( RULE_INT )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3916:1: RULE_INT
            {
             before(grammarAccess.getRemoteBindingAccess().getPortINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RemoteBinding__PortAssignment_47879); 
             after(grammarAccess.getRemoteBindingAccess().getPortINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__RemoteBinding__PortAssignment_4"


    // $ANTLR start "rule__RemoteBinding__PathAssignment_5"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3925:1: rule__RemoteBinding__PathAssignment_5 : ( ruleURI ) ;
    public final void rule__RemoteBinding__PathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3929:1: ( ( ruleURI ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3930:1: ( ruleURI )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3930:1: ( ruleURI )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3931:1: ruleURI
            {
             before(grammarAccess.getRemoteBindingAccess().getPathURIParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__RemoteBinding__PathAssignment_57910);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getRemoteBindingAccess().getPathURIParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RemoteBinding__PathAssignment_5"


    // $ANTLR start "rule__RemoteBinding__ProcessidAssignment_6"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3940:1: rule__RemoteBinding__ProcessidAssignment_6 : ( ruleQUALIFIEDNAME ) ;
    public final void rule__RemoteBinding__ProcessidAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3944:1: ( ( ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3945:1: ( ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3945:1: ( ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3946:1: ruleQUALIFIEDNAME
            {
             before(grammarAccess.getRemoteBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_rule__RemoteBinding__ProcessidAssignment_67941);
            ruleQUALIFIEDNAME();

            state._fsp--;

             after(grammarAccess.getRemoteBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__RemoteBinding__ProcessidAssignment_6"


    // $ANTLR start "rule__RemoteBinding__HandleAssignment_8"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3955:1: rule__RemoteBinding__HandleAssignment_8 : ( ruleQUALIFIEDID ) ;
    public final void rule__RemoteBinding__HandleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3959:1: ( ( ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3960:1: ( ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3960:1: ( ruleQUALIFIEDID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3961:1: ruleQUALIFIEDID
            {
             before(grammarAccess.getRemoteBindingAccess().getHandleQUALIFIEDIDParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_rule__RemoteBinding__HandleAssignment_87972);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getRemoteBindingAccess().getHandleQUALIFIEDIDParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__RemoteBinding__HandleAssignment_8"


    // $ANTLR start "rule__ExecuteStatement__HandleAssignment_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3970:1: rule__ExecuteStatement__HandleAssignment_1 : ( ruleQUALIFIEDID ) ;
    public final void rule__ExecuteStatement__HandleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3974:1: ( ( ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3975:1: ( ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3975:1: ( ruleQUALIFIEDID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3976:1: ruleQUALIFIEDID
            {
             before(grammarAccess.getExecuteStatementAccess().getHandleQUALIFIEDIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_rule__ExecuteStatement__HandleAssignment_18003);
            ruleQUALIFIEDID();

            state._fsp--;

             after(grammarAccess.getExecuteStatementAccess().getHandleQUALIFIEDIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExecuteStatement__HandleAssignment_1"


    // $ANTLR start "rule__ExecuteStatement__ExecinputsAssignment_3"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3985:1: rule__ExecuteStatement__ExecinputsAssignment_3 : ( ruleExecInput ) ;
    public final void rule__ExecuteStatement__ExecinputsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3989:1: ( ( ruleExecInput ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3990:1: ( ruleExecInput )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3990:1: ( ruleExecInput )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:3991:1: ruleExecInput
            {
             before(grammarAccess.getExecuteStatementAccess().getExecinputsExecInputParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExecInput_in_rule__ExecuteStatement__ExecinputsAssignment_38034);
            ruleExecInput();

            state._fsp--;

             after(grammarAccess.getExecuteStatementAccess().getExecinputsExecInputParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExecuteStatement__ExecinputsAssignment_3"


    // $ANTLR start "rule__ExecuteStatement__ExecoutputsAssignment_5"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4000:1: rule__ExecuteStatement__ExecoutputsAssignment_5 : ( ruleExecOutput ) ;
    public final void rule__ExecuteStatement__ExecoutputsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4004:1: ( ( ruleExecOutput ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4005:1: ( ruleExecOutput )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4005:1: ( ruleExecOutput )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4006:1: ruleExecOutput
            {
             before(grammarAccess.getExecuteStatementAccess().getExecoutputsExecOutputParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExecOutput_in_rule__ExecuteStatement__ExecoutputsAssignment_58065);
            ruleExecOutput();

            state._fsp--;

             after(grammarAccess.getExecuteStatementAccess().getExecoutputsExecOutputParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ExecuteStatement__ExecoutputsAssignment_5"


    // $ANTLR start "rule__ExecInput__ReferenceAssignment_0_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4015:1: rule__ExecInput__ReferenceAssignment_0_0 : ( ruleIN_REFERENCE ) ;
    public final void rule__ExecInput__ReferenceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4019:1: ( ( ruleIN_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4020:1: ( ruleIN_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4020:1: ( ruleIN_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4021:1: ruleIN_REFERENCE
            {
             before(grammarAccess.getExecInputAccess().getReferenceIN_REFERENCEParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_rule__ExecInput__ReferenceAssignment_0_08096);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getExecInputAccess().getReferenceIN_REFERENCEParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__ExecInput__ReferenceAssignment_0_0"


    // $ANTLR start "rule__ExecInput__WpsidAssignment_0_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4030:1: rule__ExecInput__WpsidAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__ExecInput__WpsidAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4034:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4035:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4035:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4036:1: RULE_ID
            {
             before(grammarAccess.getExecInputAccess().getWpsidIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExecInput__WpsidAssignment_0_28127); 
             after(grammarAccess.getExecInputAccess().getWpsidIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__ExecInput__WpsidAssignment_0_2"


    // $ANTLR start "rule__ExecInput__ReferenceAssignment_1_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4045:1: rule__ExecInput__ReferenceAssignment_1_0 : ( ruleVAR_REFERENCE ) ;
    public final void rule__ExecInput__ReferenceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4049:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4050:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4050:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4051:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getExecInputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__ExecInput__ReferenceAssignment_1_08158);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getExecInputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ExecInput__ReferenceAssignment_1_0"


    // $ANTLR start "rule__ExecInput__WpsidAssignment_1_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4060:1: rule__ExecInput__WpsidAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__ExecInput__WpsidAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4064:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4065:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4065:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4066:1: RULE_ID
            {
             before(grammarAccess.getExecInputAccess().getWpsidIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExecInput__WpsidAssignment_1_28189); 
             after(grammarAccess.getExecInputAccess().getWpsidIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ExecInput__WpsidAssignment_1_2"


    // $ANTLR start "rule__ExecOutput__WpsidAssignment_0_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4075:1: rule__ExecOutput__WpsidAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ExecOutput__WpsidAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4079:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4080:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4080:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4081:1: RULE_ID
            {
             before(grammarAccess.getExecOutputAccess().getWpsidIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExecOutput__WpsidAssignment_0_08220); 
             after(grammarAccess.getExecOutputAccess().getWpsidIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__ExecOutput__WpsidAssignment_0_0"


    // $ANTLR start "rule__ExecOutput__ReferenceAssignment_0_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4090:1: rule__ExecOutput__ReferenceAssignment_0_2 : ( ruleOUT_REFERENCE ) ;
    public final void rule__ExecOutput__ReferenceAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4094:1: ( ( ruleOUT_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4095:1: ( ruleOUT_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4095:1: ( ruleOUT_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4096:1: ruleOUT_REFERENCE
            {
             before(grammarAccess.getExecOutputAccess().getReferenceOUT_REFERENCEParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_rule__ExecOutput__ReferenceAssignment_0_28251);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getExecOutputAccess().getReferenceOUT_REFERENCEParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__ExecOutput__ReferenceAssignment_0_2"


    // $ANTLR start "rule__ExecOutput__WpsidAssignment_1_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4105:1: rule__ExecOutput__WpsidAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__ExecOutput__WpsidAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4109:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4110:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4110:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4111:1: RULE_ID
            {
             before(grammarAccess.getExecOutputAccess().getWpsidIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExecOutput__WpsidAssignment_1_08282); 
             after(grammarAccess.getExecOutputAccess().getWpsidIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ExecOutput__WpsidAssignment_1_0"


    // $ANTLR start "rule__ExecOutput__ReferenceAssignment_1_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4120:1: rule__ExecOutput__ReferenceAssignment_1_2 : ( ruleVAR_REFERENCE ) ;
    public final void rule__ExecOutput__ReferenceAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4124:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4125:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4125:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4126:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getExecOutputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__ExecOutput__ReferenceAssignment_1_28313);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getExecOutputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ExecOutput__ReferenceAssignment_1_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_0_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4135:1: rule__IfStatement__LefthandAssignment_1_0_0 : ( ruleIN_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4139:1: ( ( ruleIN_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4140:1: ( ruleIN_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4140:1: ( ruleIN_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4141:1: ruleIN_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandIN_REFERENCEParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_0_08344);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandIN_REFERENCEParserRuleCall_1_0_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_0_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_0_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4150:1: rule__IfStatement__OperatorAssignment_1_0_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4154:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4155:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4155:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4156:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_0_18375); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_0_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_0_1"


    // $ANTLR start "rule__IfStatement__RighthandAssignment_1_0_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4165:1: rule__IfStatement__RighthandAssignment_1_0_2 : ( ruleIN_REFERENCE ) ;
    public final void rule__IfStatement__RighthandAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4169:1: ( ( ruleIN_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4170:1: ( ruleIN_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4170:1: ( ruleIN_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4171:1: ruleIN_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getRighthandIN_REFERENCEParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__RighthandAssignment_1_0_28406);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getRighthandIN_REFERENCEParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__IfStatement__RighthandAssignment_1_0_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_1_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4180:1: rule__IfStatement__LefthandAssignment_1_1_0 : ( ruleIN_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4184:1: ( ( ruleIN_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4185:1: ( ruleIN_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4185:1: ( ruleIN_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4186:1: ruleIN_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandIN_REFERENCEParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_1_08437);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandIN_REFERENCEParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_1_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_1_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4195:1: rule__IfStatement__OperatorAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4199:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4200:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4200:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4201:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_1_18468); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_1_1"


    // $ANTLR start "rule__IfStatement__Val_sAssignment_1_1_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4210:1: rule__IfStatement__Val_sAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__IfStatement__Val_sAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4214:1: ( ( RULE_STRING ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4215:1: ( RULE_STRING )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4215:1: ( RULE_STRING )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4216:1: RULE_STRING
            {
             before(grammarAccess.getIfStatementAccess().getVal_sSTRINGTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IfStatement__Val_sAssignment_1_1_28499); 
             after(grammarAccess.getIfStatementAccess().getVal_sSTRINGTerminalRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__IfStatement__Val_sAssignment_1_1_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_2_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4225:1: rule__IfStatement__LefthandAssignment_1_2_0 : ( ruleIN_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4229:1: ( ( ruleIN_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4230:1: ( ruleIN_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4230:1: ( ruleIN_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4231:1: ruleIN_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandIN_REFERENCEParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_2_08530);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandIN_REFERENCEParserRuleCall_1_2_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_2_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_2_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4240:1: rule__IfStatement__OperatorAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4244:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4245:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4245:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4246:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_2_18561); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_2_1"


    // $ANTLR start "rule__IfStatement__Val_iAssignment_1_2_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4255:1: rule__IfStatement__Val_iAssignment_1_2_2 : ( RULE_INT ) ;
    public final void rule__IfStatement__Val_iAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4259:1: ( ( RULE_INT ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4260:1: ( RULE_INT )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4260:1: ( RULE_INT )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4261:1: RULE_INT
            {
             before(grammarAccess.getIfStatementAccess().getVal_iINTTerminalRuleCall_1_2_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IfStatement__Val_iAssignment_1_2_28592); 
             after(grammarAccess.getIfStatementAccess().getVal_iINTTerminalRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__IfStatement__Val_iAssignment_1_2_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_3_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4270:1: rule__IfStatement__LefthandAssignment_1_3_0 : ( ruleVAR_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4274:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4275:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4275:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4276:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_3_0_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_3_08623);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_3_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_3_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_3_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4285:1: rule__IfStatement__OperatorAssignment_1_3_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4289:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4290:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4290:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4291:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_3_18654); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_3_1"


    // $ANTLR start "rule__IfStatement__RighthandAssignment_1_3_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4300:1: rule__IfStatement__RighthandAssignment_1_3_2 : ( ruleIN_REFERENCE ) ;
    public final void rule__IfStatement__RighthandAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4304:1: ( ( ruleIN_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4305:1: ( ruleIN_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4305:1: ( ruleIN_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4306:1: ruleIN_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getRighthandIN_REFERENCEParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__RighthandAssignment_1_3_28685);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getRighthandIN_REFERENCEParserRuleCall_1_3_2_0()); 

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
    // $ANTLR end "rule__IfStatement__RighthandAssignment_1_3_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_4_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4315:1: rule__IfStatement__LefthandAssignment_1_4_0 : ( ruleVAR_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4319:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4320:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4320:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4321:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_4_0_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_4_08716);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_4_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_4_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_4_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4330:1: rule__IfStatement__OperatorAssignment_1_4_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4334:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4335:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4335:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4336:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_4_18747); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_4_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_4_1"


    // $ANTLR start "rule__IfStatement__RighthandAssignment_1_4_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4345:1: rule__IfStatement__RighthandAssignment_1_4_2 : ( ruleVAR_REFERENCE ) ;
    public final void rule__IfStatement__RighthandAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4349:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4350:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4350:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4351:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getRighthandVAR_REFERENCEParserRuleCall_1_4_2_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__RighthandAssignment_1_4_28778);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getRighthandVAR_REFERENCEParserRuleCall_1_4_2_0()); 

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
    // $ANTLR end "rule__IfStatement__RighthandAssignment_1_4_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_5_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4360:1: rule__IfStatement__LefthandAssignment_1_5_0 : ( ruleVAR_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4364:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4365:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4365:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4366:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_5_0_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_5_08809);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_5_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_5_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_5_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4375:1: rule__IfStatement__OperatorAssignment_1_5_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4379:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4380:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4380:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4381:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_5_18840); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_5_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_5_1"


    // $ANTLR start "rule__IfStatement__Val_sAssignment_1_5_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4390:1: rule__IfStatement__Val_sAssignment_1_5_2 : ( RULE_STRING ) ;
    public final void rule__IfStatement__Val_sAssignment_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4394:1: ( ( RULE_STRING ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4395:1: ( RULE_STRING )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4395:1: ( RULE_STRING )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4396:1: RULE_STRING
            {
             before(grammarAccess.getIfStatementAccess().getVal_sSTRINGTerminalRuleCall_1_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IfStatement__Val_sAssignment_1_5_28871); 
             after(grammarAccess.getIfStatementAccess().getVal_sSTRINGTerminalRuleCall_1_5_2_0()); 

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
    // $ANTLR end "rule__IfStatement__Val_sAssignment_1_5_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_6_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4405:1: rule__IfStatement__LefthandAssignment_1_6_0 : ( ruleVAR_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4409:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4410:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4410:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4411:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_6_0_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_6_08902);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_6_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_6_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_6_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4420:1: rule__IfStatement__OperatorAssignment_1_6_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4424:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4425:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4425:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4426:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_6_18933); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_6_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_6_1"


    // $ANTLR start "rule__IfStatement__Val_iAssignment_1_6_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4435:1: rule__IfStatement__Val_iAssignment_1_6_2 : ( RULE_INT ) ;
    public final void rule__IfStatement__Val_iAssignment_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4439:1: ( ( RULE_INT ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4440:1: ( RULE_INT )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4440:1: ( RULE_INT )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4441:1: RULE_INT
            {
             before(grammarAccess.getIfStatementAccess().getVal_iINTTerminalRuleCall_1_6_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IfStatement__Val_iAssignment_1_6_28964); 
             after(grammarAccess.getIfStatementAccess().getVal_iINTTerminalRuleCall_1_6_2_0()); 

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
    // $ANTLR end "rule__IfStatement__Val_iAssignment_1_6_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_7_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4450:1: rule__IfStatement__LefthandAssignment_1_7_0 : ( ruleOUT_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4454:1: ( ( ruleOUT_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4455:1: ( ruleOUT_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4455:1: ( ruleOUT_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4456:1: ruleOUT_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_7_0_0()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_7_08995);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_7_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_7_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_7_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4465:1: rule__IfStatement__OperatorAssignment_1_7_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4469:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4470:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4470:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4471:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_7_19026); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_7_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_7_1"


    // $ANTLR start "rule__IfStatement__RighthandAssignment_1_7_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4480:1: rule__IfStatement__RighthandAssignment_1_7_2 : ( ruleIN_REFERENCE ) ;
    public final void rule__IfStatement__RighthandAssignment_1_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4484:1: ( ( ruleIN_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4485:1: ( ruleIN_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4485:1: ( ruleIN_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4486:1: ruleIN_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getRighthandIN_REFERENCEParserRuleCall_1_7_2_0()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__RighthandAssignment_1_7_29057);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getRighthandIN_REFERENCEParserRuleCall_1_7_2_0()); 

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
    // $ANTLR end "rule__IfStatement__RighthandAssignment_1_7_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_8_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4495:1: rule__IfStatement__LefthandAssignment_1_8_0 : ( ruleOUT_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4499:1: ( ( ruleOUT_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4500:1: ( ruleOUT_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4500:1: ( ruleOUT_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4501:1: ruleOUT_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_8_0_0()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_8_09088);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_8_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_8_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_8_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4510:1: rule__IfStatement__OperatorAssignment_1_8_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4514:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4515:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4515:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4516:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_8_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_8_19119); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_8_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_8_1"


    // $ANTLR start "rule__IfStatement__RighthandAssignment_1_8_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4525:1: rule__IfStatement__RighthandAssignment_1_8_2 : ( ruleVAR_REFERENCE ) ;
    public final void rule__IfStatement__RighthandAssignment_1_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4529:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4530:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4530:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4531:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getRighthandVAR_REFERENCEParserRuleCall_1_8_2_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__RighthandAssignment_1_8_29150);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getRighthandVAR_REFERENCEParserRuleCall_1_8_2_0()); 

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
    // $ANTLR end "rule__IfStatement__RighthandAssignment_1_8_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_9_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4540:1: rule__IfStatement__LefthandAssignment_1_9_0 : ( ruleOUT_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4544:1: ( ( ruleOUT_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4545:1: ( ruleOUT_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4545:1: ( ruleOUT_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4546:1: ruleOUT_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_9_0_0()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_9_09181);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_9_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_9_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_9_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4555:1: rule__IfStatement__OperatorAssignment_1_9_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4559:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4560:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4560:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4561:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_9_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_9_19212); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_9_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_9_1"


    // $ANTLR start "rule__IfStatement__Val_sAssignment_1_9_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4570:1: rule__IfStatement__Val_sAssignment_1_9_2 : ( RULE_STRING ) ;
    public final void rule__IfStatement__Val_sAssignment_1_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4574:1: ( ( RULE_STRING ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4575:1: ( RULE_STRING )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4575:1: ( RULE_STRING )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4576:1: RULE_STRING
            {
             before(grammarAccess.getIfStatementAccess().getVal_sSTRINGTerminalRuleCall_1_9_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IfStatement__Val_sAssignment_1_9_29243); 
             after(grammarAccess.getIfStatementAccess().getVal_sSTRINGTerminalRuleCall_1_9_2_0()); 

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
    // $ANTLR end "rule__IfStatement__Val_sAssignment_1_9_2"


    // $ANTLR start "rule__IfStatement__LefthandAssignment_1_10_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4585:1: rule__IfStatement__LefthandAssignment_1_10_0 : ( ruleOUT_REFERENCE ) ;
    public final void rule__IfStatement__LefthandAssignment_1_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4589:1: ( ( ruleOUT_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4590:1: ( ruleOUT_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4590:1: ( ruleOUT_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4591:1: ruleOUT_REFERENCE
            {
             before(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_10_0_0()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_10_09274);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_10_0_0()); 

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
    // $ANTLR end "rule__IfStatement__LefthandAssignment_1_10_0"


    // $ANTLR start "rule__IfStatement__OperatorAssignment_1_10_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4600:1: rule__IfStatement__OperatorAssignment_1_10_1 : ( RULE_ID ) ;
    public final void rule__IfStatement__OperatorAssignment_1_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4604:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4605:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4605:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4606:1: RULE_ID
            {
             before(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_10_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_10_19305); 
             after(grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_10_1_0()); 

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
    // $ANTLR end "rule__IfStatement__OperatorAssignment_1_10_1"


    // $ANTLR start "rule__IfStatement__Val_iAssignment_1_10_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4615:1: rule__IfStatement__Val_iAssignment_1_10_2 : ( RULE_INT ) ;
    public final void rule__IfStatement__Val_iAssignment_1_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4619:1: ( ( RULE_INT ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4620:1: ( RULE_INT )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4620:1: ( RULE_INT )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4621:1: RULE_INT
            {
             before(grammarAccess.getIfStatementAccess().getVal_iINTTerminalRuleCall_1_10_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IfStatement__Val_iAssignment_1_10_29336); 
             after(grammarAccess.getIfStatementAccess().getVal_iINTTerminalRuleCall_1_10_2_0()); 

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
    // $ANTLR end "rule__IfStatement__Val_iAssignment_1_10_2"


    // $ANTLR start "rule__IfStatement__IfoperationsAssignment_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4630:1: rule__IfStatement__IfoperationsAssignment_2 : ( ( rule__IfStatement__IfoperationsAlternatives_2_0 ) ) ;
    public final void rule__IfStatement__IfoperationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4634:1: ( ( ( rule__IfStatement__IfoperationsAlternatives_2_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4635:1: ( ( rule__IfStatement__IfoperationsAlternatives_2_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4635:1: ( ( rule__IfStatement__IfoperationsAlternatives_2_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4636:1: ( rule__IfStatement__IfoperationsAlternatives_2_0 )
            {
             before(grammarAccess.getIfStatementAccess().getIfoperationsAlternatives_2_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4637:1: ( rule__IfStatement__IfoperationsAlternatives_2_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4637:2: rule__IfStatement__IfoperationsAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__IfStatement__IfoperationsAlternatives_2_0_in_rule__IfStatement__IfoperationsAssignment_29367);
            rule__IfStatement__IfoperationsAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getIfoperationsAlternatives_2_0()); 

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
    // $ANTLR end "rule__IfStatement__IfoperationsAssignment_2"


    // $ANTLR start "rule__IfStatement__ElseoperationsAssignment_3_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4646:1: rule__IfStatement__ElseoperationsAssignment_3_1 : ( ( rule__IfStatement__ElseoperationsAlternatives_3_1_0 ) ) ;
    public final void rule__IfStatement__ElseoperationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4650:1: ( ( ( rule__IfStatement__ElseoperationsAlternatives_3_1_0 ) ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4651:1: ( ( rule__IfStatement__ElseoperationsAlternatives_3_1_0 ) )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4651:1: ( ( rule__IfStatement__ElseoperationsAlternatives_3_1_0 ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4652:1: ( rule__IfStatement__ElseoperationsAlternatives_3_1_0 )
            {
             before(grammarAccess.getIfStatementAccess().getElseoperationsAlternatives_3_1_0()); 
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4653:1: ( rule__IfStatement__ElseoperationsAlternatives_3_1_0 )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4653:2: rule__IfStatement__ElseoperationsAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__IfStatement__ElseoperationsAlternatives_3_1_0_in_rule__IfStatement__ElseoperationsAssignment_3_19400);
            rule__IfStatement__ElseoperationsAlternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getElseoperationsAlternatives_3_1_0()); 

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
    // $ANTLR end "rule__IfStatement__ElseoperationsAssignment_3_1"


    // $ANTLR start "rule__Assignment__LefthandAssignment_0_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4662:1: rule__Assignment__LefthandAssignment_0_0 : ( ruleOUT_REFERENCE ) ;
    public final void rule__Assignment__LefthandAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4666:1: ( ( ruleOUT_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4667:1: ( ruleOUT_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4667:1: ( ruleOUT_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4668:1: ruleOUT_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_rule__Assignment__LefthandAssignment_0_09433);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Assignment__LefthandAssignment_0_0"


    // $ANTLR start "rule__Assignment__RighthandAssignment_0_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4677:1: rule__Assignment__RighthandAssignment_0_2 : ( ruleIN_REFERENCE ) ;
    public final void rule__Assignment__RighthandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4681:1: ( ( ruleIN_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4682:1: ( ruleIN_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4682:1: ( ruleIN_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4683:1: ruleIN_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getRighthandIN_REFERENCEParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_rule__Assignment__RighthandAssignment_0_29464);
            ruleIN_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getRighthandIN_REFERENCEParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Assignment__RighthandAssignment_0_2"


    // $ANTLR start "rule__Assignment__LefthandAssignment_1_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4692:1: rule__Assignment__LefthandAssignment_1_0 : ( ruleOUT_REFERENCE ) ;
    public final void rule__Assignment__LefthandAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4696:1: ( ( ruleOUT_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4697:1: ( ruleOUT_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4697:1: ( ruleOUT_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4698:1: ruleOUT_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_rule__Assignment__LefthandAssignment_1_09495);
            ruleOUT_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Assignment__LefthandAssignment_1_0"


    // $ANTLR start "rule__Assignment__RighthandAssignment_1_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4707:1: rule__Assignment__RighthandAssignment_1_2 : ( ruleVAR_REFERENCE ) ;
    public final void rule__Assignment__RighthandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4711:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4712:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4712:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4713:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getRighthandVAR_REFERENCEParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__RighthandAssignment_1_29526);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getRighthandVAR_REFERENCEParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Assignment__RighthandAssignment_1_2"


    // $ANTLR start "rule__Assignment__LefthandAssignment_2_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4722:1: rule__Assignment__LefthandAssignment_2_0 : ( ruleVAR_REFERENCE ) ;
    public final void rule__Assignment__LefthandAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4726:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4727:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4727:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4728:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__LefthandAssignment_2_09557);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Assignment__LefthandAssignment_2_0"


    // $ANTLR start "rule__Assignment__Val_sAssignment_2_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4737:1: rule__Assignment__Val_sAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Assignment__Val_sAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4741:1: ( ( RULE_STRING ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4742:1: ( RULE_STRING )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4742:1: ( RULE_STRING )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4743:1: RULE_STRING
            {
             before(grammarAccess.getAssignmentAccess().getVal_sSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assignment__Val_sAssignment_2_29588); 
             after(grammarAccess.getAssignmentAccess().getVal_sSTRINGTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Assignment__Val_sAssignment_2_2"


    // $ANTLR start "rule__Assignment__LefthandAssignment_3_0"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4752:1: rule__Assignment__LefthandAssignment_3_0 : ( ruleVAR_REFERENCE ) ;
    public final void rule__Assignment__LefthandAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4756:1: ( ( ruleVAR_REFERENCE ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4757:1: ( ruleVAR_REFERENCE )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4757:1: ( ruleVAR_REFERENCE )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4758:1: ruleVAR_REFERENCE
            {
             before(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__LefthandAssignment_3_09619);
            ruleVAR_REFERENCE();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Assignment__LefthandAssignment_3_0"


    // $ANTLR start "rule__Assignment__Val_iAssignment_3_2"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4767:1: rule__Assignment__Val_iAssignment_3_2 : ( RULE_INT ) ;
    public final void rule__Assignment__Val_iAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4771:1: ( ( RULE_INT ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4772:1: ( RULE_INT )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4772:1: ( RULE_INT )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4773:1: RULE_INT
            {
             before(grammarAccess.getAssignmentAccess().getVal_iINTTerminalRuleCall_3_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Assignment__Val_iAssignment_3_29650); 
             after(grammarAccess.getAssignmentAccess().getVal_iINTTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Assignment__Val_iAssignment_3_2"


    // $ANTLR start "rule__IN_REFERENCE__RefnameAssignment_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4782:1: rule__IN_REFERENCE__RefnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IN_REFERENCE__RefnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4786:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4787:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4787:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4788:1: RULE_ID
            {
             before(grammarAccess.getIN_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IN_REFERENCE__RefnameAssignment_19681); 
             after(grammarAccess.getIN_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IN_REFERENCE__RefnameAssignment_1"


    // $ANTLR start "rule__OUT_REFERENCE__RefnameAssignment_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4797:1: rule__OUT_REFERENCE__RefnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OUT_REFERENCE__RefnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4801:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4802:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4802:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4803:1: RULE_ID
            {
             before(grammarAccess.getOUT_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OUT_REFERENCE__RefnameAssignment_19712); 
             after(grammarAccess.getOUT_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__OUT_REFERENCE__RefnameAssignment_1"


    // $ANTLR start "rule__VAR_REFERENCE__RefnameAssignment_1"
    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4812:1: rule__VAR_REFERENCE__RefnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VAR_REFERENCE__RefnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4816:1: ( ( RULE_ID ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4817:1: ( RULE_ID )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4817:1: ( RULE_ID )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4818:1: RULE_ID
            {
             before(grammarAccess.getVAR_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VAR_REFERENCE__RefnameAssignment_19743); 
             after(grammarAccess.getVAR_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VAR_REFERENCE__RefnameAssignment_1"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA6_eotS =
        "\25\uffff";
    static final String DFA6_eofS =
        "\25\uffff";
    static final String DFA6_minS =
        "\1\4\6\7\3\4\13\uffff";
    static final String DFA6_maxS =
        "\1\6\6\7\3\12\13\uffff";
    static final String DFA6_acceptS =
        "\12\uffff\1\1\1\3\1\2\1\6\1\7\1\4\1\5\1\13\1\10\1\11\1\12";
    static final String DFA6_specialS =
        "\25\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\3\1\2",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\4\uffff\1\13\1\14",
            "\1\17\1\uffff\1\20\2\uffff\1\16\1\15",
            "\1\22\1\uffff\1\23\2\uffff\1\21\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "564:1: rule__IfStatement__Alternatives_1 : ( ( ( rule__IfStatement__Group_1_0__0 ) ) | ( ( rule__IfStatement__Group_1_1__0 ) ) | ( ( rule__IfStatement__Group_1_2__0 ) ) | ( ( rule__IfStatement__Group_1_3__0 ) ) | ( ( rule__IfStatement__Group_1_4__0 ) ) | ( ( rule__IfStatement__Group_1_5__0 ) ) | ( ( rule__IfStatement__Group_1_6__0 ) ) | ( ( rule__IfStatement__Group_1_7__0 ) ) | ( ( rule__IfStatement__Group_1_8__0 ) ) | ( ( rule__IfStatement__Group_1_9__0 ) ) | ( ( rule__IfStatement__Group_1_10__0 ) ) );";
        }
    }
    static final String DFA9_eotS =
        "\13\uffff";
    static final String DFA9_eofS =
        "\13\uffff";
    static final String DFA9_minS =
        "\1\5\2\7\2\31\1\4\1\11\4\uffff";
    static final String DFA9_maxS =
        "\1\6\2\7\2\31\1\6\1\12\4\uffff";
    static final String DFA9_acceptS =
        "\7\uffff\1\1\1\2\1\4\1\3";
    static final String DFA9_specialS =
        "\13\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\1\uffff\1\10",
            "\1\11\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "684:1: rule__Assignment__Alternatives : ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__Group_1__0 ) ) | ( ( rule__Assignment__Group_2__0 ) ) | ( ( rule__Assignment__Group_3__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleWorksequence_in_entryRuleWorksequence61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorksequence68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Worksequence__OperationsAssignment_in_ruleWorksequence94 = new BitSet(new long[]{0x0000000000448062L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalBinding_in_entryRuleLocalBinding182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalBinding189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__0_in_ruleLocalBinding215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemoteBinding_in_entryRuleRemoteBinding242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRemoteBinding249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__0_in_ruleRemoteBinding275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_entryRuleExecuteStatement302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecuteStatement309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__0_in_ruleExecuteStatement335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecInput_in_entryRuleExecInput362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecInput369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Alternatives_in_ruleExecInput395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecOutput_in_entryRuleExecOutput422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecOutput429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Alternatives_in_ruleExecOutput455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__0_in_ruleIfStatement515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Alternatives_in_ruleAssignment575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_entryRuleIN_REFERENCE602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIN_REFERENCE609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IN_REFERENCE__Group__0_in_ruleIN_REFERENCE635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_entryRuleOUT_REFERENCE662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOUT_REFERENCE669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OUT_REFERENCE__Group__0_in_ruleOUT_REFERENCE695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_entryRuleVAR_REFERENCE722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAR_REFERENCE729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR_REFERENCE__Group__0_in_ruleVAR_REFERENCE755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_entryRuleQUALIFIEDNAME782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDNAME789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group__0_in_ruleQUALIFIEDNAME815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDID849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__0_in_ruleQUALIFIEDID875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI935 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleLocalBinding_in_rule__Operation__Alternatives972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemoteBinding_in_rule__Operation__Alternatives989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Operation__Alternatives1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_rule__Operation__Alternatives1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_rule__Operation__Alternatives1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__0_in_rule__ExecInput__Alternatives1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__0_in_rule__ExecInput__Alternatives1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__0_in_rule__ExecOutput__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__0_in_rule__ExecOutput__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_0__0_in_rule__IfStatement__Alternatives_11174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_1__0_in_rule__IfStatement__Alternatives_11192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_2__0_in_rule__IfStatement__Alternatives_11210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_3__0_in_rule__IfStatement__Alternatives_11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_4__0_in_rule__IfStatement__Alternatives_11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_5__0_in_rule__IfStatement__Alternatives_11264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_6__0_in_rule__IfStatement__Alternatives_11282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_7__0_in_rule__IfStatement__Alternatives_11300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_8__0_in_rule__IfStatement__Alternatives_11318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_9__0_in_rule__IfStatement__Alternatives_11336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_10__0_in_rule__IfStatement__Alternatives_11354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__IfStatement__IfoperationsAlternatives_2_01387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_rule__IfStatement__IfoperationsAlternatives_2_01404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__IfStatement__ElseoperationsAlternatives_3_1_01436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_rule__IfStatement__ElseoperationsAlternatives_3_1_01453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__0_in_rule__Assignment__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__0_in_rule__Assignment__Alternatives1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__0_in_rule__Assignment__Alternatives1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__0_in_rule__Assignment__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__0__Impl_in_rule__LocalBinding__Group__01570 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__1_in_rule__LocalBinding__Group__01573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LocalBinding__Group__0__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__1__Impl_in_rule__LocalBinding__Group__11632 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__2_in_rule__LocalBinding__Group__11635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LocalBinding__Group__1__Impl1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__2__Impl_in_rule__LocalBinding__Group__21694 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__3_in_rule__LocalBinding__Group__21697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__ProcessidAssignment_2_in_rule__LocalBinding__Group__2__Impl1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__3__Impl_in_rule__LocalBinding__Group__31754 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__4_in_rule__LocalBinding__Group__31757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__LocalBinding__Group__3__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__Group__4__Impl_in_rule__LocalBinding__Group__41816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalBinding__HandleAssignment_4_in_rule__LocalBinding__Group__4__Impl1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__0__Impl_in_rule__RemoteBinding__Group__01883 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__1_in_rule__RemoteBinding__Group__01886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RemoteBinding__Group__0__Impl1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__1__Impl_in_rule__RemoteBinding__Group__11945 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__2_in_rule__RemoteBinding__Group__11948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RemoteBinding__Group__1__Impl1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__2__Impl_in_rule__RemoteBinding__Group__22007 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__3_in_rule__RemoteBinding__Group__22010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__ProtocolAssignment_2_in_rule__RemoteBinding__Group__2__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__3__Impl_in_rule__RemoteBinding__Group__32067 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__4_in_rule__RemoteBinding__Group__32070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__HostAssignment_3_in_rule__RemoteBinding__Group__3__Impl2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__4__Impl_in_rule__RemoteBinding__Group__42127 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__5_in_rule__RemoteBinding__Group__42130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__PortAssignment_4_in_rule__RemoteBinding__Group__4__Impl2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__5__Impl_in_rule__RemoteBinding__Group__52187 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__6_in_rule__RemoteBinding__Group__52190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__PathAssignment_5_in_rule__RemoteBinding__Group__5__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__6__Impl_in_rule__RemoteBinding__Group__62247 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__7_in_rule__RemoteBinding__Group__62250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__ProcessidAssignment_6_in_rule__RemoteBinding__Group__6__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__7__Impl_in_rule__RemoteBinding__Group__72307 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__8_in_rule__RemoteBinding__Group__72310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RemoteBinding__Group__7__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__Group__8__Impl_in_rule__RemoteBinding__Group__82369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RemoteBinding__HandleAssignment_8_in_rule__RemoteBinding__Group__8__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__0__Impl_in_rule__ExecuteStatement__Group__02444 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__1_in_rule__ExecuteStatement__Group__02447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExecuteStatement__Group__0__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__1__Impl_in_rule__ExecuteStatement__Group__12506 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__2_in_rule__ExecuteStatement__Group__12509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__HandleAssignment_1_in_rule__ExecuteStatement__Group__1__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__2__Impl_in_rule__ExecuteStatement__Group__22566 = new BitSet(new long[]{0x0000000000100050L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__3_in_rule__ExecuteStatement__Group__22569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ExecuteStatement__Group__2__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__3__Impl_in_rule__ExecuteStatement__Group__32628 = new BitSet(new long[]{0x0000000000100050L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__4_in_rule__ExecuteStatement__Group__32631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__ExecinputsAssignment_3_in_rule__ExecuteStatement__Group__3__Impl2658 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__4__Impl_in_rule__ExecuteStatement__Group__42689 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__5_in_rule__ExecuteStatement__Group__42692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ExecuteStatement__Group__4__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__Group__5__Impl_in_rule__ExecuteStatement__Group__52751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecuteStatement__ExecoutputsAssignment_5_in_rule__ExecuteStatement__Group__5__Impl2778 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__0__Impl_in_rule__ExecInput__Group_0__02821 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__1_in_rule__ExecInput__Group_0__02824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__ReferenceAssignment_0_0_in_rule__ExecInput__Group_0__0__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__1__Impl_in_rule__ExecInput__Group_0__12881 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__2_in_rule__ExecInput__Group_0__12884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExecInput__Group_0__1__Impl2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_0__2__Impl_in_rule__ExecInput__Group_0__22943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__WpsidAssignment_0_2_in_rule__ExecInput__Group_0__2__Impl2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__0__Impl_in_rule__ExecInput__Group_1__03006 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__1_in_rule__ExecInput__Group_1__03009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__ReferenceAssignment_1_0_in_rule__ExecInput__Group_1__0__Impl3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__1__Impl_in_rule__ExecInput__Group_1__13066 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__2_in_rule__ExecInput__Group_1__13069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExecInput__Group_1__1__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__Group_1__2__Impl_in_rule__ExecInput__Group_1__23128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecInput__WpsidAssignment_1_2_in_rule__ExecInput__Group_1__2__Impl3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__0__Impl_in_rule__ExecOutput__Group_0__03191 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__1_in_rule__ExecOutput__Group_0__03194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__WpsidAssignment_0_0_in_rule__ExecOutput__Group_0__0__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__1__Impl_in_rule__ExecOutput__Group_0__13251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__2_in_rule__ExecOutput__Group_0__13254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExecOutput__Group_0__1__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_0__2__Impl_in_rule__ExecOutput__Group_0__23313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__ReferenceAssignment_0_2_in_rule__ExecOutput__Group_0__2__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__0__Impl_in_rule__ExecOutput__Group_1__03376 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__1_in_rule__ExecOutput__Group_1__03379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__WpsidAssignment_1_0_in_rule__ExecOutput__Group_1__0__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__1__Impl_in_rule__ExecOutput__Group_1__13436 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__2_in_rule__ExecOutput__Group_1__13439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExecOutput__Group_1__1__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__Group_1__2__Impl_in_rule__ExecOutput__Group_1__23498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExecOutput__ReferenceAssignment_1_2_in_rule__ExecOutput__Group_1__2__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__0__Impl_in_rule__IfStatement__Group__03561 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__1_in_rule__IfStatement__Group__03564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IfStatement__Group__0__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__1__Impl_in_rule__IfStatement__Group__13623 = new BitSet(new long[]{0x0000000001840060L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__2_in_rule__IfStatement__Group__13626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Alternatives_1_in_rule__IfStatement__Group__1__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__2__Impl_in_rule__IfStatement__Group__23683 = new BitSet(new long[]{0x0000000001840060L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__3_in_rule__IfStatement__Group__23686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__IfoperationsAssignment_2_in_rule__IfStatement__Group__2__Impl3713 = new BitSet(new long[]{0x0000000000040062L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__3__Impl_in_rule__IfStatement__Group__33744 = new BitSet(new long[]{0x0000000001840060L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__4_in_rule__IfStatement__Group__33747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_3__0_in_rule__IfStatement__Group__3__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group__4__Impl_in_rule__IfStatement__Group__43805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IfStatement__Group__4__Impl3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_0__0__Impl_in_rule__IfStatement__Group_1_0__03874 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_0__1_in_rule__IfStatement__Group_1_0__03877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_0_0_in_rule__IfStatement__Group_1_0__0__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_0__1__Impl_in_rule__IfStatement__Group_1_0__13934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_0__2_in_rule__IfStatement__Group_1_0__13937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_0_1_in_rule__IfStatement__Group_1_0__1__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_0__2__Impl_in_rule__IfStatement__Group_1_0__23994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__RighthandAssignment_1_0_2_in_rule__IfStatement__Group_1_0__2__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_1__0__Impl_in_rule__IfStatement__Group_1_1__04057 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_1__1_in_rule__IfStatement__Group_1_1__04060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_1_0_in_rule__IfStatement__Group_1_1__0__Impl4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_1__1__Impl_in_rule__IfStatement__Group_1_1__14117 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_1__2_in_rule__IfStatement__Group_1_1__14120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_1_1_in_rule__IfStatement__Group_1_1__1__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_1__2__Impl_in_rule__IfStatement__Group_1_1__24177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Val_sAssignment_1_1_2_in_rule__IfStatement__Group_1_1__2__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_2__0__Impl_in_rule__IfStatement__Group_1_2__04240 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_2__1_in_rule__IfStatement__Group_1_2__04243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_2_0_in_rule__IfStatement__Group_1_2__0__Impl4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_2__1__Impl_in_rule__IfStatement__Group_1_2__14300 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_2__2_in_rule__IfStatement__Group_1_2__14303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_2_1_in_rule__IfStatement__Group_1_2__1__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_2__2__Impl_in_rule__IfStatement__Group_1_2__24360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Val_iAssignment_1_2_2_in_rule__IfStatement__Group_1_2__2__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_3__0__Impl_in_rule__IfStatement__Group_1_3__04423 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_3__1_in_rule__IfStatement__Group_1_3__04426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_3_0_in_rule__IfStatement__Group_1_3__0__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_3__1__Impl_in_rule__IfStatement__Group_1_3__14483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_3__2_in_rule__IfStatement__Group_1_3__14486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_3_1_in_rule__IfStatement__Group_1_3__1__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_3__2__Impl_in_rule__IfStatement__Group_1_3__24543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__RighthandAssignment_1_3_2_in_rule__IfStatement__Group_1_3__2__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_4__0__Impl_in_rule__IfStatement__Group_1_4__04606 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_4__1_in_rule__IfStatement__Group_1_4__04609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_4_0_in_rule__IfStatement__Group_1_4__0__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_4__1__Impl_in_rule__IfStatement__Group_1_4__14666 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_4__2_in_rule__IfStatement__Group_1_4__14669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_4_1_in_rule__IfStatement__Group_1_4__1__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_4__2__Impl_in_rule__IfStatement__Group_1_4__24726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__RighthandAssignment_1_4_2_in_rule__IfStatement__Group_1_4__2__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_5__0__Impl_in_rule__IfStatement__Group_1_5__04789 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_5__1_in_rule__IfStatement__Group_1_5__04792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_5_0_in_rule__IfStatement__Group_1_5__0__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_5__1__Impl_in_rule__IfStatement__Group_1_5__14849 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_5__2_in_rule__IfStatement__Group_1_5__14852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_5_1_in_rule__IfStatement__Group_1_5__1__Impl4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_5__2__Impl_in_rule__IfStatement__Group_1_5__24909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Val_sAssignment_1_5_2_in_rule__IfStatement__Group_1_5__2__Impl4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_6__0__Impl_in_rule__IfStatement__Group_1_6__04972 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_6__1_in_rule__IfStatement__Group_1_6__04975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_6_0_in_rule__IfStatement__Group_1_6__0__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_6__1__Impl_in_rule__IfStatement__Group_1_6__15032 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_6__2_in_rule__IfStatement__Group_1_6__15035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_6_1_in_rule__IfStatement__Group_1_6__1__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_6__2__Impl_in_rule__IfStatement__Group_1_6__25092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Val_iAssignment_1_6_2_in_rule__IfStatement__Group_1_6__2__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_7__0__Impl_in_rule__IfStatement__Group_1_7__05155 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_7__1_in_rule__IfStatement__Group_1_7__05158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_7_0_in_rule__IfStatement__Group_1_7__0__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_7__1__Impl_in_rule__IfStatement__Group_1_7__15215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_7__2_in_rule__IfStatement__Group_1_7__15218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_7_1_in_rule__IfStatement__Group_1_7__1__Impl5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_7__2__Impl_in_rule__IfStatement__Group_1_7__25275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__RighthandAssignment_1_7_2_in_rule__IfStatement__Group_1_7__2__Impl5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_8__0__Impl_in_rule__IfStatement__Group_1_8__05338 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_8__1_in_rule__IfStatement__Group_1_8__05341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_8_0_in_rule__IfStatement__Group_1_8__0__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_8__1__Impl_in_rule__IfStatement__Group_1_8__15398 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_8__2_in_rule__IfStatement__Group_1_8__15401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_8_1_in_rule__IfStatement__Group_1_8__1__Impl5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_8__2__Impl_in_rule__IfStatement__Group_1_8__25458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__RighthandAssignment_1_8_2_in_rule__IfStatement__Group_1_8__2__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_9__0__Impl_in_rule__IfStatement__Group_1_9__05521 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_9__1_in_rule__IfStatement__Group_1_9__05524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_9_0_in_rule__IfStatement__Group_1_9__0__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_9__1__Impl_in_rule__IfStatement__Group_1_9__15581 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_9__2_in_rule__IfStatement__Group_1_9__15584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_9_1_in_rule__IfStatement__Group_1_9__1__Impl5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_9__2__Impl_in_rule__IfStatement__Group_1_9__25641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Val_sAssignment_1_9_2_in_rule__IfStatement__Group_1_9__2__Impl5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_10__0__Impl_in_rule__IfStatement__Group_1_10__05704 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_10__1_in_rule__IfStatement__Group_1_10__05707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__LefthandAssignment_1_10_0_in_rule__IfStatement__Group_1_10__0__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_10__1__Impl_in_rule__IfStatement__Group_1_10__15764 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_10__2_in_rule__IfStatement__Group_1_10__15767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__OperatorAssignment_1_10_1_in_rule__IfStatement__Group_1_10__1__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_1_10__2__Impl_in_rule__IfStatement__Group_1_10__25824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Val_iAssignment_1_10_2_in_rule__IfStatement__Group_1_10__2__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_3__0__Impl_in_rule__IfStatement__Group_3__05887 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_3__1_in_rule__IfStatement__Group_3__05890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IfStatement__Group_3__0__Impl5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__Group_3__1__Impl_in_rule__IfStatement__Group_3__15949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__ElseoperationsAssignment_3_1_in_rule__IfStatement__Group_3__1__Impl5976 = new BitSet(new long[]{0x0000000000040062L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__0__Impl_in_rule__Assignment__Group_0__06011 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__1_in_rule__Assignment__Group_0__06014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__LefthandAssignment_0_0_in_rule__Assignment__Group_0__0__Impl6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__1__Impl_in_rule__Assignment__Group_0__16071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__2_in_rule__Assignment__Group_0__16074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Assignment__Group_0__1__Impl6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__2__Impl_in_rule__Assignment__Group_0__26133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__RighthandAssignment_0_2_in_rule__Assignment__Group_0__2__Impl6160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__0__Impl_in_rule__Assignment__Group_1__06196 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__1_in_rule__Assignment__Group_1__06199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__LefthandAssignment_1_0_in_rule__Assignment__Group_1__0__Impl6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__1__Impl_in_rule__Assignment__Group_1__16256 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__2_in_rule__Assignment__Group_1__16259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Assignment__Group_1__1__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__2__Impl_in_rule__Assignment__Group_1__26318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__RighthandAssignment_1_2_in_rule__Assignment__Group_1__2__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__0__Impl_in_rule__Assignment__Group_2__06381 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__1_in_rule__Assignment__Group_2__06384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__LefthandAssignment_2_0_in_rule__Assignment__Group_2__0__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__1__Impl_in_rule__Assignment__Group_2__16441 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__2_in_rule__Assignment__Group_2__16444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Assignment__Group_2__1__Impl6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_2__2__Impl_in_rule__Assignment__Group_2__26503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Val_sAssignment_2_2_in_rule__Assignment__Group_2__2__Impl6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__0__Impl_in_rule__Assignment__Group_3__06566 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__1_in_rule__Assignment__Group_3__06569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__LefthandAssignment_3_0_in_rule__Assignment__Group_3__0__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__1__Impl_in_rule__Assignment__Group_3__16626 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__2_in_rule__Assignment__Group_3__16629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Assignment__Group_3__1__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_3__2__Impl_in_rule__Assignment__Group_3__26688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Val_iAssignment_3_2_in_rule__Assignment__Group_3__2__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IN_REFERENCE__Group__0__Impl_in_rule__IN_REFERENCE__Group__06751 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IN_REFERENCE__Group__1_in_rule__IN_REFERENCE__Group__06754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IN_REFERENCE_HANDLE_in_rule__IN_REFERENCE__Group__0__Impl6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IN_REFERENCE__Group__1__Impl_in_rule__IN_REFERENCE__Group__16810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IN_REFERENCE__RefnameAssignment_1_in_rule__IN_REFERENCE__Group__1__Impl6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OUT_REFERENCE__Group__0__Impl_in_rule__OUT_REFERENCE__Group__06871 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__OUT_REFERENCE__Group__1_in_rule__OUT_REFERENCE__Group__06874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OUT_REFERENCE_HANDLE_in_rule__OUT_REFERENCE__Group__0__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OUT_REFERENCE__Group__1__Impl_in_rule__OUT_REFERENCE__Group__16930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OUT_REFERENCE__RefnameAssignment_1_in_rule__OUT_REFERENCE__Group__1__Impl6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR_REFERENCE__Group__0__Impl_in_rule__VAR_REFERENCE__Group__06991 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__VAR_REFERENCE__Group__1_in_rule__VAR_REFERENCE__Group__06994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_REFERENCE_HANDLE_in_rule__VAR_REFERENCE__Group__0__Impl7021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR_REFERENCE__Group__1__Impl_in_rule__VAR_REFERENCE__Group__17050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAR_REFERENCE__RefnameAssignment_1_in_rule__VAR_REFERENCE__Group__1__Impl7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group__0__Impl_in_rule__QUALIFIEDNAME__Group__07111 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group__1_in_rule__QUALIFIEDNAME__Group__07114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIEDNAME__Group__0__Impl7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group__1__Impl_in_rule__QUALIFIEDNAME__Group__17170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group_1__0_in_rule__QUALIFIEDNAME__Group__1__Impl7197 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group_1__0__Impl_in_rule__QUALIFIEDNAME__Group_1__07232 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group_1__1_in_rule__QUALIFIEDNAME__Group_1__07235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__QUALIFIEDNAME__Group_1__0__Impl7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDNAME__Group_1__1__Impl_in_rule__QUALIFIEDNAME__Group_1__17294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIEDNAME__Group_1__1__Impl7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__0__Impl_in_rule__QUALIFIEDID__Group__07354 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__1_in_rule__QUALIFIEDID__Group__07357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIEDID__Group__0__Impl7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group__1__Impl_in_rule__QUALIFIEDID__Group__17413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__0_in_rule__QUALIFIEDID__Group__1__Impl7440 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__0__Impl_in_rule__QUALIFIEDID__Group_1__07475 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__1_in_rule__QUALIFIEDID__Group_1__07478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QUALIFIEDID__Group_1__0__Impl7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIEDID__Group_1__1__Impl_in_rule__QUALIFIEDID__Group_1__17537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_rule__QUALIFIEDID__Group_1__1__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__07597 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__07600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__URI__Group__0__Impl7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__17659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__Group__1__Impl7686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Worksequence__OperationsAssignment7724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_rule__LocalBinding__ProcessidAssignment_27755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_rule__LocalBinding__HandleAssignment_47786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROTOCOL_in_rule__RemoteBinding__ProtocolAssignment_27817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_rule__RemoteBinding__HostAssignment_37848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RemoteBinding__PortAssignment_47879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__RemoteBinding__PathAssignment_57910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_rule__RemoteBinding__ProcessidAssignment_67941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_rule__RemoteBinding__HandleAssignment_87972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_rule__ExecuteStatement__HandleAssignment_18003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecInput_in_rule__ExecuteStatement__ExecinputsAssignment_38034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecOutput_in_rule__ExecuteStatement__ExecoutputsAssignment_58065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_rule__ExecInput__ReferenceAssignment_0_08096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExecInput__WpsidAssignment_0_28127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__ExecInput__ReferenceAssignment_1_08158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExecInput__WpsidAssignment_1_28189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExecOutput__WpsidAssignment_0_08220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_rule__ExecOutput__ReferenceAssignment_0_28251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExecOutput__WpsidAssignment_1_08282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__ExecOutput__ReferenceAssignment_1_28313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_0_08344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_0_18375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__RighthandAssignment_1_0_28406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_1_08437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_1_18468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IfStatement__Val_sAssignment_1_1_28499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_2_08530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_2_18561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IfStatement__Val_iAssignment_1_2_28592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_3_08623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_3_18654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__RighthandAssignment_1_3_28685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_4_08716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_4_18747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__RighthandAssignment_1_4_28778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_5_08809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_5_18840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IfStatement__Val_sAssignment_1_5_28871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_6_08902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_6_18933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IfStatement__Val_iAssignment_1_6_28964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_7_08995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_7_19026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_rule__IfStatement__RighthandAssignment_1_7_29057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_8_09088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_8_19119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__IfStatement__RighthandAssignment_1_8_29150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_9_09181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_9_19212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IfStatement__Val_sAssignment_1_9_29243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_rule__IfStatement__LefthandAssignment_1_10_09274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfStatement__OperatorAssignment_1_10_19305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IfStatement__Val_iAssignment_1_10_29336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__IfoperationsAlternatives_2_0_in_rule__IfStatement__IfoperationsAssignment_29367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStatement__ElseoperationsAlternatives_3_1_0_in_rule__IfStatement__ElseoperationsAssignment_3_19400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_rule__Assignment__LefthandAssignment_0_09433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_rule__Assignment__RighthandAssignment_0_29464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_rule__Assignment__LefthandAssignment_1_09495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__RighthandAssignment_1_29526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__LefthandAssignment_2_09557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assignment__Val_sAssignment_2_29588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_rule__Assignment__LefthandAssignment_3_09619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Assignment__Val_iAssignment_3_29650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IN_REFERENCE__RefnameAssignment_19681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OUT_REFERENCE__RefnameAssignment_19712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VAR_REFERENCE__RefnameAssignment_19743 = new BitSet(new long[]{0x0000000000000002L});

}