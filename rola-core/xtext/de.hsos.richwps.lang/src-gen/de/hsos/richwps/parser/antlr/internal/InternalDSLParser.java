package de.hsos.richwps.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.hsos.richwps.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PROTOCOL", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_IN_REFERENCE_HANDLE", "RULE_OUT_REFERENCE_HANDLE", "RULE_VAR_REFERENCE_HANDLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bind'", "'process'", "'to'", "'execute'", "'with'", "'store'", "'as'", "'if'", "'else'", "'end'", "'='", "'.'", "'/'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_OUT_REFERENCE_HANDLE=9;
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
    public static final int RULE_VAR_REFERENCE_HANDLE=10;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int RULE_PROTOCOL=4;
    public static final int RULE_IN_REFERENCE_HANDLE=8;
    public static final int T__17=17;
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g"; }



     	private DSLGrammarAccess grammarAccess;
     	
        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Worksequence";	
       	}
       	
       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleWorksequence"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:67:1: entryRuleWorksequence returns [EObject current=null] : iv_ruleWorksequence= ruleWorksequence EOF ;
    public final EObject entryRuleWorksequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorksequence = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:68:2: (iv_ruleWorksequence= ruleWorksequence EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:69:2: iv_ruleWorksequence= ruleWorksequence EOF
            {
             newCompositeNode(grammarAccess.getWorksequenceRule()); 
            pushFollow(FOLLOW_ruleWorksequence_in_entryRuleWorksequence75);
            iv_ruleWorksequence=ruleWorksequence();

            state._fsp--;

             current =iv_ruleWorksequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorksequence85); 

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
    // $ANTLR end "entryRuleWorksequence"


    // $ANTLR start "ruleWorksequence"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:76:1: ruleWorksequence returns [EObject current=null] : ( (lv_operations_0_0= ruleOperation ) )* ;
    public final EObject ruleWorksequence() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:79:28: ( ( (lv_operations_0_0= ruleOperation ) )* )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:80:1: ( (lv_operations_0_0= ruleOperation ) )*
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:80:1: ( (lv_operations_0_0= ruleOperation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_OUT_REFERENCE_HANDLE && LA1_0<=RULE_VAR_REFERENCE_HANDLE)||LA1_0==15||LA1_0==18||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:81:1: (lv_operations_0_0= ruleOperation )
            	    {
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:81:1: (lv_operations_0_0= ruleOperation )
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:82:3: lv_operations_0_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorksequenceAccess().getOperationsOperationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleWorksequence130);
            	    lv_operations_0_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorksequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operations",
            	            		lv_operations_0_0, 
            	            		"Operation");
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
    // $ANTLR end "ruleWorksequence"


    // $ANTLR start "entryRuleOperation"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:106:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:107:2: (iv_ruleOperation= ruleOperation EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:108:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation166);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation176); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:115:1: ruleOperation returns [EObject current=null] : (this_LocalBinding_0= ruleLocalBinding | this_RemoteBinding_1= ruleRemoteBinding | this_Assignment_2= ruleAssignment | this_ExecuteStatement_3= ruleExecuteStatement | this_IfStatement_4= ruleIfStatement ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_LocalBinding_0 = null;

        EObject this_RemoteBinding_1 = null;

        EObject this_Assignment_2 = null;

        EObject this_ExecuteStatement_3 = null;

        EObject this_IfStatement_4 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:118:28: ( (this_LocalBinding_0= ruleLocalBinding | this_RemoteBinding_1= ruleRemoteBinding | this_Assignment_2= ruleAssignment | this_ExecuteStatement_3= ruleExecuteStatement | this_IfStatement_4= ruleIfStatement ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:119:1: (this_LocalBinding_0= ruleLocalBinding | this_RemoteBinding_1= ruleRemoteBinding | this_Assignment_2= ruleAssignment | this_ExecuteStatement_3= ruleExecuteStatement | this_IfStatement_4= ruleIfStatement )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:119:1: (this_LocalBinding_0= ruleLocalBinding | this_RemoteBinding_1= ruleRemoteBinding | this_Assignment_2= ruleAssignment | this_ExecuteStatement_3= ruleExecuteStatement | this_IfStatement_4= ruleIfStatement )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==16) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==RULE_ID) ) {
                        alt2=1;
                    }
                    else if ( (LA2_5==RULE_PROTOCOL) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_OUT_REFERENCE_HANDLE:
            case RULE_VAR_REFERENCE_HANDLE:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:120:5: this_LocalBinding_0= ruleLocalBinding
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getLocalBindingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLocalBinding_in_ruleOperation223);
                    this_LocalBinding_0=ruleLocalBinding();

                    state._fsp--;

                     
                            current = this_LocalBinding_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:130:5: this_RemoteBinding_1= ruleRemoteBinding
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getRemoteBindingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRemoteBinding_in_ruleOperation250);
                    this_RemoteBinding_1=ruleRemoteBinding();

                    state._fsp--;

                     
                            current = this_RemoteBinding_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:140:5: this_Assignment_2= ruleAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAssignment_in_ruleOperation277);
                    this_Assignment_2=ruleAssignment();

                    state._fsp--;

                     
                            current = this_Assignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:150:5: this_ExecuteStatement_3= ruleExecuteStatement
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getExecuteStatementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExecuteStatement_in_ruleOperation304);
                    this_ExecuteStatement_3=ruleExecuteStatement();

                    state._fsp--;

                     
                            current = this_ExecuteStatement_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:160:5: this_IfStatement_4= ruleIfStatement
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getIfStatementParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleOperation331);
                    this_IfStatement_4=ruleIfStatement();

                    state._fsp--;

                     
                            current = this_IfStatement_4; 
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleLocalBinding"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:176:1: entryRuleLocalBinding returns [EObject current=null] : iv_ruleLocalBinding= ruleLocalBinding EOF ;
    public final EObject entryRuleLocalBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalBinding = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:177:2: (iv_ruleLocalBinding= ruleLocalBinding EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:178:2: iv_ruleLocalBinding= ruleLocalBinding EOF
            {
             newCompositeNode(grammarAccess.getLocalBindingRule()); 
            pushFollow(FOLLOW_ruleLocalBinding_in_entryRuleLocalBinding366);
            iv_ruleLocalBinding=ruleLocalBinding();

            state._fsp--;

             current =iv_ruleLocalBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalBinding376); 

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
    // $ANTLR end "entryRuleLocalBinding"


    // $ANTLR start "ruleLocalBinding"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:185:1: ruleLocalBinding returns [EObject current=null] : (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_processid_2_0= ruleQUALIFIEDNAME ) ) otherlv_3= 'to' ( (lv_handle_4_0= ruleQUALIFIEDID ) ) ) ;
    public final EObject ruleLocalBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_processid_2_0 = null;

        AntlrDatatypeRuleToken lv_handle_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:188:28: ( (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_processid_2_0= ruleQUALIFIEDNAME ) ) otherlv_3= 'to' ( (lv_handle_4_0= ruleQUALIFIEDID ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:189:1: (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_processid_2_0= ruleQUALIFIEDNAME ) ) otherlv_3= 'to' ( (lv_handle_4_0= ruleQUALIFIEDID ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:189:1: (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_processid_2_0= ruleQUALIFIEDNAME ) ) otherlv_3= 'to' ( (lv_handle_4_0= ruleQUALIFIEDID ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:189:3: otherlv_0= 'bind' otherlv_1= 'process' ( (lv_processid_2_0= ruleQUALIFIEDNAME ) ) otherlv_3= 'to' ( (lv_handle_4_0= ruleQUALIFIEDID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleLocalBinding413); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalBindingAccess().getBindKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleLocalBinding425); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalBindingAccess().getProcessKeyword_1());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:197:1: ( (lv_processid_2_0= ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:198:1: (lv_processid_2_0= ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:198:1: (lv_processid_2_0= ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:199:3: lv_processid_2_0= ruleQUALIFIEDNAME
            {
             
            	        newCompositeNode(grammarAccess.getLocalBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_ruleLocalBinding446);
            lv_processid_2_0=ruleQUALIFIEDNAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalBindingRule());
            	        }
                   		set(
                   			current, 
                   			"processid",
                    		lv_processid_2_0, 
                    		"QUALIFIEDNAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleLocalBinding458); 

                	newLeafNode(otherlv_3, grammarAccess.getLocalBindingAccess().getToKeyword_3());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:219:1: ( (lv_handle_4_0= ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:220:1: (lv_handle_4_0= ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:220:1: (lv_handle_4_0= ruleQUALIFIEDID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:221:3: lv_handle_4_0= ruleQUALIFIEDID
            {
             
            	        newCompositeNode(grammarAccess.getLocalBindingAccess().getHandleQUALIFIEDIDParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_ruleLocalBinding479);
            lv_handle_4_0=ruleQUALIFIEDID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalBindingRule());
            	        }
                   		set(
                   			current, 
                   			"handle",
                    		lv_handle_4_0, 
                    		"QUALIFIEDID");
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
    // $ANTLR end "ruleLocalBinding"


    // $ANTLR start "entryRuleRemoteBinding"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:245:1: entryRuleRemoteBinding returns [EObject current=null] : iv_ruleRemoteBinding= ruleRemoteBinding EOF ;
    public final EObject entryRuleRemoteBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoteBinding = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:246:2: (iv_ruleRemoteBinding= ruleRemoteBinding EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:247:2: iv_ruleRemoteBinding= ruleRemoteBinding EOF
            {
             newCompositeNode(grammarAccess.getRemoteBindingRule()); 
            pushFollow(FOLLOW_ruleRemoteBinding_in_entryRuleRemoteBinding515);
            iv_ruleRemoteBinding=ruleRemoteBinding();

            state._fsp--;

             current =iv_ruleRemoteBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRemoteBinding525); 

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
    // $ANTLR end "entryRuleRemoteBinding"


    // $ANTLR start "ruleRemoteBinding"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:254:1: ruleRemoteBinding returns [EObject current=null] : (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_protocol_2_0= RULE_PROTOCOL ) ) ( (lv_host_3_0= ruleQUALIFIEDNAME ) ) ( (lv_port_4_0= RULE_INT ) ) ( (lv_path_5_0= ruleURI ) ) ( (lv_processid_6_0= ruleQUALIFIEDNAME ) ) otherlv_7= 'to' ( (lv_handle_8_0= ruleQUALIFIEDID ) ) ) ;
    public final EObject ruleRemoteBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_protocol_2_0=null;
        Token lv_port_4_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_host_3_0 = null;

        AntlrDatatypeRuleToken lv_path_5_0 = null;

        AntlrDatatypeRuleToken lv_processid_6_0 = null;

        AntlrDatatypeRuleToken lv_handle_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:257:28: ( (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_protocol_2_0= RULE_PROTOCOL ) ) ( (lv_host_3_0= ruleQUALIFIEDNAME ) ) ( (lv_port_4_0= RULE_INT ) ) ( (lv_path_5_0= ruleURI ) ) ( (lv_processid_6_0= ruleQUALIFIEDNAME ) ) otherlv_7= 'to' ( (lv_handle_8_0= ruleQUALIFIEDID ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:258:1: (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_protocol_2_0= RULE_PROTOCOL ) ) ( (lv_host_3_0= ruleQUALIFIEDNAME ) ) ( (lv_port_4_0= RULE_INT ) ) ( (lv_path_5_0= ruleURI ) ) ( (lv_processid_6_0= ruleQUALIFIEDNAME ) ) otherlv_7= 'to' ( (lv_handle_8_0= ruleQUALIFIEDID ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:258:1: (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_protocol_2_0= RULE_PROTOCOL ) ) ( (lv_host_3_0= ruleQUALIFIEDNAME ) ) ( (lv_port_4_0= RULE_INT ) ) ( (lv_path_5_0= ruleURI ) ) ( (lv_processid_6_0= ruleQUALIFIEDNAME ) ) otherlv_7= 'to' ( (lv_handle_8_0= ruleQUALIFIEDID ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:258:3: otherlv_0= 'bind' otherlv_1= 'process' ( (lv_protocol_2_0= RULE_PROTOCOL ) ) ( (lv_host_3_0= ruleQUALIFIEDNAME ) ) ( (lv_port_4_0= RULE_INT ) ) ( (lv_path_5_0= ruleURI ) ) ( (lv_processid_6_0= ruleQUALIFIEDNAME ) ) otherlv_7= 'to' ( (lv_handle_8_0= ruleQUALIFIEDID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleRemoteBinding562); 

                	newLeafNode(otherlv_0, grammarAccess.getRemoteBindingAccess().getBindKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleRemoteBinding574); 

                	newLeafNode(otherlv_1, grammarAccess.getRemoteBindingAccess().getProcessKeyword_1());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:266:1: ( (lv_protocol_2_0= RULE_PROTOCOL ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:267:1: (lv_protocol_2_0= RULE_PROTOCOL )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:267:1: (lv_protocol_2_0= RULE_PROTOCOL )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:268:3: lv_protocol_2_0= RULE_PROTOCOL
            {
            lv_protocol_2_0=(Token)match(input,RULE_PROTOCOL,FOLLOW_RULE_PROTOCOL_in_ruleRemoteBinding591); 

            			newLeafNode(lv_protocol_2_0, grammarAccess.getRemoteBindingAccess().getProtocolPROTOCOLTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRemoteBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"protocol",
                    		lv_protocol_2_0, 
                    		"PROTOCOL");
            	    

            }


            }

            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:284:2: ( (lv_host_3_0= ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:285:1: (lv_host_3_0= ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:285:1: (lv_host_3_0= ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:286:3: lv_host_3_0= ruleQUALIFIEDNAME
            {
             
            	        newCompositeNode(grammarAccess.getRemoteBindingAccess().getHostQUALIFIEDNAMEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_ruleRemoteBinding617);
            lv_host_3_0=ruleQUALIFIEDNAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRemoteBindingRule());
            	        }
                   		set(
                   			current, 
                   			"host",
                    		lv_host_3_0, 
                    		"QUALIFIEDNAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:302:2: ( (lv_port_4_0= RULE_INT ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:303:1: (lv_port_4_0= RULE_INT )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:303:1: (lv_port_4_0= RULE_INT )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:304:3: lv_port_4_0= RULE_INT
            {
            lv_port_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRemoteBinding634); 

            			newLeafNode(lv_port_4_0, grammarAccess.getRemoteBindingAccess().getPortINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRemoteBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"port",
                    		lv_port_4_0, 
                    		"INT");
            	    

            }


            }

            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:320:2: ( (lv_path_5_0= ruleURI ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:321:1: (lv_path_5_0= ruleURI )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:321:1: (lv_path_5_0= ruleURI )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:322:3: lv_path_5_0= ruleURI
            {
             
            	        newCompositeNode(grammarAccess.getRemoteBindingAccess().getPathURIParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleRemoteBinding660);
            lv_path_5_0=ruleURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRemoteBindingRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_5_0, 
                    		"URI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:338:2: ( (lv_processid_6_0= ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:339:1: (lv_processid_6_0= ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:339:1: (lv_processid_6_0= ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:340:3: lv_processid_6_0= ruleQUALIFIEDNAME
            {
             
            	        newCompositeNode(grammarAccess.getRemoteBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_ruleRemoteBinding681);
            lv_processid_6_0=ruleQUALIFIEDNAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRemoteBindingRule());
            	        }
                   		set(
                   			current, 
                   			"processid",
                    		lv_processid_6_0, 
                    		"QUALIFIEDNAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleRemoteBinding693); 

                	newLeafNode(otherlv_7, grammarAccess.getRemoteBindingAccess().getToKeyword_7());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:360:1: ( (lv_handle_8_0= ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:361:1: (lv_handle_8_0= ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:361:1: (lv_handle_8_0= ruleQUALIFIEDID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:362:3: lv_handle_8_0= ruleQUALIFIEDID
            {
             
            	        newCompositeNode(grammarAccess.getRemoteBindingAccess().getHandleQUALIFIEDIDParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_ruleRemoteBinding714);
            lv_handle_8_0=ruleQUALIFIEDID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRemoteBindingRule());
            	        }
                   		set(
                   			current, 
                   			"handle",
                    		lv_handle_8_0, 
                    		"QUALIFIEDID");
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
    // $ANTLR end "ruleRemoteBinding"


    // $ANTLR start "entryRuleExecuteStatement"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:386:1: entryRuleExecuteStatement returns [EObject current=null] : iv_ruleExecuteStatement= ruleExecuteStatement EOF ;
    public final EObject entryRuleExecuteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteStatement = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:387:2: (iv_ruleExecuteStatement= ruleExecuteStatement EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:388:2: iv_ruleExecuteStatement= ruleExecuteStatement EOF
            {
             newCompositeNode(grammarAccess.getExecuteStatementRule()); 
            pushFollow(FOLLOW_ruleExecuteStatement_in_entryRuleExecuteStatement750);
            iv_ruleExecuteStatement=ruleExecuteStatement();

            state._fsp--;

             current =iv_ruleExecuteStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecuteStatement760); 

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
    // $ANTLR end "entryRuleExecuteStatement"


    // $ANTLR start "ruleExecuteStatement"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:395:1: ruleExecuteStatement returns [EObject current=null] : (otherlv_0= 'execute' ( (lv_handle_1_0= ruleQUALIFIEDID ) ) otherlv_2= 'with' ( (lv_execinputs_3_0= ruleExecInput ) )* otherlv_4= 'store' ( (lv_execoutputs_5_0= ruleExecOutput ) )* ) ;
    public final EObject ruleExecuteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_handle_1_0 = null;

        EObject lv_execinputs_3_0 = null;

        EObject lv_execoutputs_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:398:28: ( (otherlv_0= 'execute' ( (lv_handle_1_0= ruleQUALIFIEDID ) ) otherlv_2= 'with' ( (lv_execinputs_3_0= ruleExecInput ) )* otherlv_4= 'store' ( (lv_execoutputs_5_0= ruleExecOutput ) )* ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:399:1: (otherlv_0= 'execute' ( (lv_handle_1_0= ruleQUALIFIEDID ) ) otherlv_2= 'with' ( (lv_execinputs_3_0= ruleExecInput ) )* otherlv_4= 'store' ( (lv_execoutputs_5_0= ruleExecOutput ) )* )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:399:1: (otherlv_0= 'execute' ( (lv_handle_1_0= ruleQUALIFIEDID ) ) otherlv_2= 'with' ( (lv_execinputs_3_0= ruleExecInput ) )* otherlv_4= 'store' ( (lv_execoutputs_5_0= ruleExecOutput ) )* )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:399:3: otherlv_0= 'execute' ( (lv_handle_1_0= ruleQUALIFIEDID ) ) otherlv_2= 'with' ( (lv_execinputs_3_0= ruleExecInput ) )* otherlv_4= 'store' ( (lv_execoutputs_5_0= ruleExecOutput ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleExecuteStatement797); 

                	newLeafNode(otherlv_0, grammarAccess.getExecuteStatementAccess().getExecuteKeyword_0());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:403:1: ( (lv_handle_1_0= ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:404:1: (lv_handle_1_0= ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:404:1: (lv_handle_1_0= ruleQUALIFIEDID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:405:3: lv_handle_1_0= ruleQUALIFIEDID
            {
             
            	        newCompositeNode(grammarAccess.getExecuteStatementAccess().getHandleQUALIFIEDIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_ruleExecuteStatement818);
            lv_handle_1_0=ruleQUALIFIEDID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExecuteStatementRule());
            	        }
                   		set(
                   			current, 
                   			"handle",
                    		lv_handle_1_0, 
                    		"QUALIFIEDID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleExecuteStatement830); 

                	newLeafNode(otherlv_2, grammarAccess.getExecuteStatementAccess().getWithKeyword_2());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:425:1: ( (lv_execinputs_3_0= ruleExecInput ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_IN_REFERENCE_HANDLE||LA3_0==RULE_VAR_REFERENCE_HANDLE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:426:1: (lv_execinputs_3_0= ruleExecInput )
            	    {
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:426:1: (lv_execinputs_3_0= ruleExecInput )
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:427:3: lv_execinputs_3_0= ruleExecInput
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExecuteStatementAccess().getExecinputsExecInputParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExecInput_in_ruleExecuteStatement851);
            	    lv_execinputs_3_0=ruleExecInput();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExecuteStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"execinputs",
            	            		lv_execinputs_3_0, 
            	            		"ExecInput");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleExecuteStatement864); 

                	newLeafNode(otherlv_4, grammarAccess.getExecuteStatementAccess().getStoreKeyword_4());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:447:1: ( (lv_execoutputs_5_0= ruleExecOutput ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:448:1: (lv_execoutputs_5_0= ruleExecOutput )
            	    {
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:448:1: (lv_execoutputs_5_0= ruleExecOutput )
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:449:3: lv_execoutputs_5_0= ruleExecOutput
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExecuteStatementAccess().getExecoutputsExecOutputParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExecOutput_in_ruleExecuteStatement885);
            	    lv_execoutputs_5_0=ruleExecOutput();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExecuteStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"execoutputs",
            	            		lv_execoutputs_5_0, 
            	            		"ExecOutput");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleExecuteStatement"


    // $ANTLR start "entryRuleExecInput"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:473:1: entryRuleExecInput returns [EObject current=null] : iv_ruleExecInput= ruleExecInput EOF ;
    public final EObject entryRuleExecInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecInput = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:474:2: (iv_ruleExecInput= ruleExecInput EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:475:2: iv_ruleExecInput= ruleExecInput EOF
            {
             newCompositeNode(grammarAccess.getExecInputRule()); 
            pushFollow(FOLLOW_ruleExecInput_in_entryRuleExecInput922);
            iv_ruleExecInput=ruleExecInput();

            state._fsp--;

             current =iv_ruleExecInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecInput932); 

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
    // $ANTLR end "entryRuleExecInput"


    // $ANTLR start "ruleExecInput"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:482:1: ruleExecInput returns [EObject current=null] : ( ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) ) | ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) ) ) ;
    public final EObject ruleExecInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_wpsid_2_0=null;
        Token otherlv_4=null;
        Token lv_wpsid_5_0=null;
        EObject lv_reference_0_0 = null;

        EObject lv_reference_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:485:28: ( ( ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) ) | ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:486:1: ( ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) ) | ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:486:1: ( ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) ) | ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_IN_REFERENCE_HANDLE) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_VAR_REFERENCE_HANDLE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:486:2: ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:486:2: ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:486:3: ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:486:3: ( (lv_reference_0_0= ruleIN_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:487:1: (lv_reference_0_0= ruleIN_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:487:1: (lv_reference_0_0= ruleIN_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:488:3: lv_reference_0_0= ruleIN_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getExecInputAccess().getReferenceIN_REFERENCEParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIN_REFERENCE_in_ruleExecInput979);
                    lv_reference_0_0=ruleIN_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExecInputRule());
                    	        }
                           		set(
                           			current, 
                           			"reference",
                            		lv_reference_0_0, 
                            		"IN_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleExecInput991); 

                        	newLeafNode(otherlv_1, grammarAccess.getExecInputAccess().getAsKeyword_0_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:508:1: ( (lv_wpsid_2_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:509:1: (lv_wpsid_2_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:509:1: (lv_wpsid_2_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:510:3: lv_wpsid_2_0= RULE_ID
                    {
                    lv_wpsid_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecInput1008); 

                    			newLeafNode(lv_wpsid_2_0, grammarAccess.getExecInputAccess().getWpsidIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExecInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"wpsid",
                            		lv_wpsid_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:527:6: ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:527:6: ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:527:7: ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:527:7: ( (lv_reference_3_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:528:1: (lv_reference_3_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:528:1: (lv_reference_3_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:529:3: lv_reference_3_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getExecInputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleExecInput1042);
                    lv_reference_3_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExecInputRule());
                    	        }
                           		set(
                           			current, 
                           			"reference",
                            		lv_reference_3_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleExecInput1054); 

                        	newLeafNode(otherlv_4, grammarAccess.getExecInputAccess().getAsKeyword_1_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:549:1: ( (lv_wpsid_5_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:550:1: (lv_wpsid_5_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:550:1: (lv_wpsid_5_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:551:3: lv_wpsid_5_0= RULE_ID
                    {
                    lv_wpsid_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecInput1071); 

                    			newLeafNode(lv_wpsid_5_0, grammarAccess.getExecInputAccess().getWpsidIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExecInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"wpsid",
                            		lv_wpsid_5_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleExecInput"


    // $ANTLR start "entryRuleExecOutput"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:575:1: entryRuleExecOutput returns [EObject current=null] : iv_ruleExecOutput= ruleExecOutput EOF ;
    public final EObject entryRuleExecOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecOutput = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:576:2: (iv_ruleExecOutput= ruleExecOutput EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:577:2: iv_ruleExecOutput= ruleExecOutput EOF
            {
             newCompositeNode(grammarAccess.getExecOutputRule()); 
            pushFollow(FOLLOW_ruleExecOutput_in_entryRuleExecOutput1113);
            iv_ruleExecOutput=ruleExecOutput();

            state._fsp--;

             current =iv_ruleExecOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecOutput1123); 

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
    // $ANTLR end "entryRuleExecOutput"


    // $ANTLR start "ruleExecOutput"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:584:1: ruleExecOutput returns [EObject current=null] : ( ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) ) | ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) ) ) ;
    public final EObject ruleExecOutput() throws RecognitionException {
        EObject current = null;

        Token lv_wpsid_0_0=null;
        Token otherlv_1=null;
        Token lv_wpsid_3_0=null;
        Token otherlv_4=null;
        EObject lv_reference_2_0 = null;

        EObject lv_reference_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:587:28: ( ( ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) ) | ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:588:1: ( ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) ) | ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:588:1: ( ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) ) | ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==21) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==RULE_OUT_REFERENCE_HANDLE) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==RULE_VAR_REFERENCE_HANDLE) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:588:2: ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:588:2: ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:588:3: ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:588:3: ( (lv_wpsid_0_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:589:1: (lv_wpsid_0_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:589:1: (lv_wpsid_0_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:590:3: lv_wpsid_0_0= RULE_ID
                    {
                    lv_wpsid_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecOutput1166); 

                    			newLeafNode(lv_wpsid_0_0, grammarAccess.getExecOutputAccess().getWpsidIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExecOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"wpsid",
                            		lv_wpsid_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleExecOutput1183); 

                        	newLeafNode(otherlv_1, grammarAccess.getExecOutputAccess().getAsKeyword_0_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:610:1: ( (lv_reference_2_0= ruleOUT_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:611:1: (lv_reference_2_0= ruleOUT_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:611:1: (lv_reference_2_0= ruleOUT_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:612:3: lv_reference_2_0= ruleOUT_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getExecOutputAccess().getReferenceOUT_REFERENCEParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOUT_REFERENCE_in_ruleExecOutput1204);
                    lv_reference_2_0=ruleOUT_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExecOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"reference",
                            		lv_reference_2_0, 
                            		"OUT_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:629:6: ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:629:6: ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:629:7: ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:629:7: ( (lv_wpsid_3_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:630:1: (lv_wpsid_3_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:630:1: (lv_wpsid_3_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:631:3: lv_wpsid_3_0= RULE_ID
                    {
                    lv_wpsid_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecOutput1229); 

                    			newLeafNode(lv_wpsid_3_0, grammarAccess.getExecOutputAccess().getWpsidIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExecOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"wpsid",
                            		lv_wpsid_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleExecOutput1246); 

                        	newLeafNode(otherlv_4, grammarAccess.getExecOutputAccess().getAsKeyword_1_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:651:1: ( (lv_reference_5_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:652:1: (lv_reference_5_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:652:1: (lv_reference_5_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:653:3: lv_reference_5_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getExecOutputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleExecOutput1267);
                    lv_reference_5_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExecOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"reference",
                            		lv_reference_5_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleExecOutput"


    // $ANTLR start "entryRuleIfStatement"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:677:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:678:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:679:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement1304);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement1314); 

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:686:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( ( ( (lv_lefthand_1_0= ruleIN_REFERENCE ) ) ( (lv_operator_2_0= RULE_ID ) ) ( (lv_righthand_3_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_4_0= ruleIN_REFERENCE ) ) ( (lv_operator_5_0= RULE_ID ) ) ( (lv_val_s_6_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_7_0= ruleIN_REFERENCE ) ) ( (lv_operator_8_0= RULE_ID ) ) ( (lv_val_i_9_0= RULE_INT ) ) ) | ( ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) ) ( (lv_operator_11_0= RULE_ID ) ) ( (lv_righthand_12_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) ) ( (lv_operator_14_0= RULE_ID ) ) ( (lv_righthand_15_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) ) ( (lv_operator_17_0= RULE_ID ) ) ( (lv_val_s_18_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) ) ( (lv_operator_20_0= RULE_ID ) ) ( (lv_val_i_21_0= RULE_INT ) ) ) | ( ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) ) ( (lv_operator_23_0= RULE_ID ) ) ( (lv_righthand_24_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) ) ( (lv_operator_26_0= RULE_ID ) ) ( (lv_righthand_27_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) ) ( (lv_operator_29_0= RULE_ID ) ) ( (lv_val_s_30_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) ) ( (lv_operator_32_0= RULE_ID ) ) ( (lv_val_i_33_0= RULE_INT ) ) ) ) ( ( (lv_ifoperations_34_1= ruleAssignment | lv_ifoperations_34_2= ruleExecuteStatement ) ) )* (otherlv_35= 'else' ( ( (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement ) ) )* )? otherlv_37= 'end' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operator_2_0=null;
        Token lv_operator_5_0=null;
        Token lv_val_s_6_0=null;
        Token lv_operator_8_0=null;
        Token lv_val_i_9_0=null;
        Token lv_operator_11_0=null;
        Token lv_operator_14_0=null;
        Token lv_operator_17_0=null;
        Token lv_val_s_18_0=null;
        Token lv_operator_20_0=null;
        Token lv_val_i_21_0=null;
        Token lv_operator_23_0=null;
        Token lv_operator_26_0=null;
        Token lv_operator_29_0=null;
        Token lv_val_s_30_0=null;
        Token lv_operator_32_0=null;
        Token lv_val_i_33_0=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        EObject lv_lefthand_1_0 = null;

        EObject lv_righthand_3_0 = null;

        EObject lv_lefthand_4_0 = null;

        EObject lv_lefthand_7_0 = null;

        EObject lv_lefthand_10_0 = null;

        EObject lv_righthand_12_0 = null;

        EObject lv_lefthand_13_0 = null;

        EObject lv_righthand_15_0 = null;

        EObject lv_lefthand_16_0 = null;

        EObject lv_lefthand_19_0 = null;

        EObject lv_lefthand_22_0 = null;

        EObject lv_righthand_24_0 = null;

        EObject lv_lefthand_25_0 = null;

        EObject lv_righthand_27_0 = null;

        EObject lv_lefthand_28_0 = null;

        EObject lv_lefthand_31_0 = null;

        EObject lv_ifoperations_34_1 = null;

        EObject lv_ifoperations_34_2 = null;

        EObject lv_elseoperations_36_1 = null;

        EObject lv_elseoperations_36_2 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:689:28: ( (otherlv_0= 'if' ( ( ( (lv_lefthand_1_0= ruleIN_REFERENCE ) ) ( (lv_operator_2_0= RULE_ID ) ) ( (lv_righthand_3_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_4_0= ruleIN_REFERENCE ) ) ( (lv_operator_5_0= RULE_ID ) ) ( (lv_val_s_6_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_7_0= ruleIN_REFERENCE ) ) ( (lv_operator_8_0= RULE_ID ) ) ( (lv_val_i_9_0= RULE_INT ) ) ) | ( ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) ) ( (lv_operator_11_0= RULE_ID ) ) ( (lv_righthand_12_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) ) ( (lv_operator_14_0= RULE_ID ) ) ( (lv_righthand_15_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) ) ( (lv_operator_17_0= RULE_ID ) ) ( (lv_val_s_18_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) ) ( (lv_operator_20_0= RULE_ID ) ) ( (lv_val_i_21_0= RULE_INT ) ) ) | ( ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) ) ( (lv_operator_23_0= RULE_ID ) ) ( (lv_righthand_24_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) ) ( (lv_operator_26_0= RULE_ID ) ) ( (lv_righthand_27_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) ) ( (lv_operator_29_0= RULE_ID ) ) ( (lv_val_s_30_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) ) ( (lv_operator_32_0= RULE_ID ) ) ( (lv_val_i_33_0= RULE_INT ) ) ) ) ( ( (lv_ifoperations_34_1= ruleAssignment | lv_ifoperations_34_2= ruleExecuteStatement ) ) )* (otherlv_35= 'else' ( ( (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement ) ) )* )? otherlv_37= 'end' ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:690:1: (otherlv_0= 'if' ( ( ( (lv_lefthand_1_0= ruleIN_REFERENCE ) ) ( (lv_operator_2_0= RULE_ID ) ) ( (lv_righthand_3_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_4_0= ruleIN_REFERENCE ) ) ( (lv_operator_5_0= RULE_ID ) ) ( (lv_val_s_6_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_7_0= ruleIN_REFERENCE ) ) ( (lv_operator_8_0= RULE_ID ) ) ( (lv_val_i_9_0= RULE_INT ) ) ) | ( ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) ) ( (lv_operator_11_0= RULE_ID ) ) ( (lv_righthand_12_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) ) ( (lv_operator_14_0= RULE_ID ) ) ( (lv_righthand_15_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) ) ( (lv_operator_17_0= RULE_ID ) ) ( (lv_val_s_18_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) ) ( (lv_operator_20_0= RULE_ID ) ) ( (lv_val_i_21_0= RULE_INT ) ) ) | ( ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) ) ( (lv_operator_23_0= RULE_ID ) ) ( (lv_righthand_24_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) ) ( (lv_operator_26_0= RULE_ID ) ) ( (lv_righthand_27_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) ) ( (lv_operator_29_0= RULE_ID ) ) ( (lv_val_s_30_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) ) ( (lv_operator_32_0= RULE_ID ) ) ( (lv_val_i_33_0= RULE_INT ) ) ) ) ( ( (lv_ifoperations_34_1= ruleAssignment | lv_ifoperations_34_2= ruleExecuteStatement ) ) )* (otherlv_35= 'else' ( ( (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement ) ) )* )? otherlv_37= 'end' )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:690:1: (otherlv_0= 'if' ( ( ( (lv_lefthand_1_0= ruleIN_REFERENCE ) ) ( (lv_operator_2_0= RULE_ID ) ) ( (lv_righthand_3_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_4_0= ruleIN_REFERENCE ) ) ( (lv_operator_5_0= RULE_ID ) ) ( (lv_val_s_6_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_7_0= ruleIN_REFERENCE ) ) ( (lv_operator_8_0= RULE_ID ) ) ( (lv_val_i_9_0= RULE_INT ) ) ) | ( ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) ) ( (lv_operator_11_0= RULE_ID ) ) ( (lv_righthand_12_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) ) ( (lv_operator_14_0= RULE_ID ) ) ( (lv_righthand_15_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) ) ( (lv_operator_17_0= RULE_ID ) ) ( (lv_val_s_18_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) ) ( (lv_operator_20_0= RULE_ID ) ) ( (lv_val_i_21_0= RULE_INT ) ) ) | ( ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) ) ( (lv_operator_23_0= RULE_ID ) ) ( (lv_righthand_24_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) ) ( (lv_operator_26_0= RULE_ID ) ) ( (lv_righthand_27_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) ) ( (lv_operator_29_0= RULE_ID ) ) ( (lv_val_s_30_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) ) ( (lv_operator_32_0= RULE_ID ) ) ( (lv_val_i_33_0= RULE_INT ) ) ) ) ( ( (lv_ifoperations_34_1= ruleAssignment | lv_ifoperations_34_2= ruleExecuteStatement ) ) )* (otherlv_35= 'else' ( ( (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement ) ) )* )? otherlv_37= 'end' )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:690:3: otherlv_0= 'if' ( ( ( (lv_lefthand_1_0= ruleIN_REFERENCE ) ) ( (lv_operator_2_0= RULE_ID ) ) ( (lv_righthand_3_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_4_0= ruleIN_REFERENCE ) ) ( (lv_operator_5_0= RULE_ID ) ) ( (lv_val_s_6_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_7_0= ruleIN_REFERENCE ) ) ( (lv_operator_8_0= RULE_ID ) ) ( (lv_val_i_9_0= RULE_INT ) ) ) | ( ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) ) ( (lv_operator_11_0= RULE_ID ) ) ( (lv_righthand_12_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) ) ( (lv_operator_14_0= RULE_ID ) ) ( (lv_righthand_15_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) ) ( (lv_operator_17_0= RULE_ID ) ) ( (lv_val_s_18_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) ) ( (lv_operator_20_0= RULE_ID ) ) ( (lv_val_i_21_0= RULE_INT ) ) ) | ( ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) ) ( (lv_operator_23_0= RULE_ID ) ) ( (lv_righthand_24_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) ) ( (lv_operator_26_0= RULE_ID ) ) ( (lv_righthand_27_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) ) ( (lv_operator_29_0= RULE_ID ) ) ( (lv_val_s_30_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) ) ( (lv_operator_32_0= RULE_ID ) ) ( (lv_val_i_33_0= RULE_INT ) ) ) ) ( ( (lv_ifoperations_34_1= ruleAssignment | lv_ifoperations_34_2= ruleExecuteStatement ) ) )* (otherlv_35= 'else' ( ( (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement ) ) )* )? otherlv_37= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleIfStatement1351); 

                	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:694:1: ( ( ( (lv_lefthand_1_0= ruleIN_REFERENCE ) ) ( (lv_operator_2_0= RULE_ID ) ) ( (lv_righthand_3_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_4_0= ruleIN_REFERENCE ) ) ( (lv_operator_5_0= RULE_ID ) ) ( (lv_val_s_6_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_7_0= ruleIN_REFERENCE ) ) ( (lv_operator_8_0= RULE_ID ) ) ( (lv_val_i_9_0= RULE_INT ) ) ) | ( ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) ) ( (lv_operator_11_0= RULE_ID ) ) ( (lv_righthand_12_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) ) ( (lv_operator_14_0= RULE_ID ) ) ( (lv_righthand_15_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) ) ( (lv_operator_17_0= RULE_ID ) ) ( (lv_val_s_18_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) ) ( (lv_operator_20_0= RULE_ID ) ) ( (lv_val_i_21_0= RULE_INT ) ) ) | ( ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) ) ( (lv_operator_23_0= RULE_ID ) ) ( (lv_righthand_24_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) ) ( (lv_operator_26_0= RULE_ID ) ) ( (lv_righthand_27_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) ) ( (lv_operator_29_0= RULE_ID ) ) ( (lv_val_s_30_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) ) ( (lv_operator_32_0= RULE_ID ) ) ( (lv_val_i_33_0= RULE_INT ) ) ) )
            int alt7=11;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:694:2: ( ( (lv_lefthand_1_0= ruleIN_REFERENCE ) ) ( (lv_operator_2_0= RULE_ID ) ) ( (lv_righthand_3_0= ruleIN_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:694:2: ( ( (lv_lefthand_1_0= ruleIN_REFERENCE ) ) ( (lv_operator_2_0= RULE_ID ) ) ( (lv_righthand_3_0= ruleIN_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:694:3: ( (lv_lefthand_1_0= ruleIN_REFERENCE ) ) ( (lv_operator_2_0= RULE_ID ) ) ( (lv_righthand_3_0= ruleIN_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:694:3: ( (lv_lefthand_1_0= ruleIN_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:695:1: (lv_lefthand_1_0= ruleIN_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:695:1: (lv_lefthand_1_0= ruleIN_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:696:3: lv_lefthand_1_0= ruleIN_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandIN_REFERENCEParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1374);
                    lv_lefthand_1_0=ruleIN_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_1_0, 
                            		"IN_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:712:2: ( (lv_operator_2_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:713:1: (lv_operator_2_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:713:1: (lv_operator_2_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:714:3: lv_operator_2_0= RULE_ID
                    {
                    lv_operator_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement1391); 

                    			newLeafNode(lv_operator_2_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:730:2: ( (lv_righthand_3_0= ruleIN_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:731:1: (lv_righthand_3_0= ruleIN_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:731:1: (lv_righthand_3_0= ruleIN_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:732:3: lv_righthand_3_0= ruleIN_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getRighthandIN_REFERENCEParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1417);
                    lv_righthand_3_0=ruleIN_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"righthand",
                            		lv_righthand_3_0, 
                            		"IN_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:749:6: ( ( (lv_lefthand_4_0= ruleIN_REFERENCE ) ) ( (lv_operator_5_0= RULE_ID ) ) ( (lv_val_s_6_0= RULE_STRING ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:749:6: ( ( (lv_lefthand_4_0= ruleIN_REFERENCE ) ) ( (lv_operator_5_0= RULE_ID ) ) ( (lv_val_s_6_0= RULE_STRING ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:749:7: ( (lv_lefthand_4_0= ruleIN_REFERENCE ) ) ( (lv_operator_5_0= RULE_ID ) ) ( (lv_val_s_6_0= RULE_STRING ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:749:7: ( (lv_lefthand_4_0= ruleIN_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:750:1: (lv_lefthand_4_0= ruleIN_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:750:1: (lv_lefthand_4_0= ruleIN_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:751:3: lv_lefthand_4_0= ruleIN_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandIN_REFERENCEParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1446);
                    lv_lefthand_4_0=ruleIN_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_4_0, 
                            		"IN_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:767:2: ( (lv_operator_5_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:768:1: (lv_operator_5_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:768:1: (lv_operator_5_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:769:3: lv_operator_5_0= RULE_ID
                    {
                    lv_operator_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement1463); 

                    			newLeafNode(lv_operator_5_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:785:2: ( (lv_val_s_6_0= RULE_STRING ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:786:1: (lv_val_s_6_0= RULE_STRING )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:786:1: (lv_val_s_6_0= RULE_STRING )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:787:3: lv_val_s_6_0= RULE_STRING
                    {
                    lv_val_s_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfStatement1485); 

                    			newLeafNode(lv_val_s_6_0, grammarAccess.getIfStatementAccess().getVal_sSTRINGTerminalRuleCall_1_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val_s",
                            		lv_val_s_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:804:6: ( ( (lv_lefthand_7_0= ruleIN_REFERENCE ) ) ( (lv_operator_8_0= RULE_ID ) ) ( (lv_val_i_9_0= RULE_INT ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:804:6: ( ( (lv_lefthand_7_0= ruleIN_REFERENCE ) ) ( (lv_operator_8_0= RULE_ID ) ) ( (lv_val_i_9_0= RULE_INT ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:804:7: ( (lv_lefthand_7_0= ruleIN_REFERENCE ) ) ( (lv_operator_8_0= RULE_ID ) ) ( (lv_val_i_9_0= RULE_INT ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:804:7: ( (lv_lefthand_7_0= ruleIN_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:805:1: (lv_lefthand_7_0= ruleIN_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:805:1: (lv_lefthand_7_0= ruleIN_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:806:3: lv_lefthand_7_0= ruleIN_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandIN_REFERENCEParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1519);
                    lv_lefthand_7_0=ruleIN_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_7_0, 
                            		"IN_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:822:2: ( (lv_operator_8_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:823:1: (lv_operator_8_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:823:1: (lv_operator_8_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:824:3: lv_operator_8_0= RULE_ID
                    {
                    lv_operator_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement1536); 

                    			newLeafNode(lv_operator_8_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_8_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:840:2: ( (lv_val_i_9_0= RULE_INT ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:841:1: (lv_val_i_9_0= RULE_INT )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:841:1: (lv_val_i_9_0= RULE_INT )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:842:3: lv_val_i_9_0= RULE_INT
                    {
                    lv_val_i_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIfStatement1558); 

                    			newLeafNode(lv_val_i_9_0, grammarAccess.getIfStatementAccess().getVal_iINTTerminalRuleCall_1_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val_i",
                            		lv_val_i_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:859:6: ( ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) ) ( (lv_operator_11_0= RULE_ID ) ) ( (lv_righthand_12_0= ruleIN_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:859:6: ( ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) ) ( (lv_operator_11_0= RULE_ID ) ) ( (lv_righthand_12_0= ruleIN_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:859:7: ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) ) ( (lv_operator_11_0= RULE_ID ) ) ( (lv_righthand_12_0= ruleIN_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:859:7: ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:860:1: (lv_lefthand_10_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:860:1: (lv_lefthand_10_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:861:3: lv_lefthand_10_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1592);
                    lv_lefthand_10_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_10_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:877:2: ( (lv_operator_11_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:878:1: (lv_operator_11_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:878:1: (lv_operator_11_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:879:3: lv_operator_11_0= RULE_ID
                    {
                    lv_operator_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement1609); 

                    			newLeafNode(lv_operator_11_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_11_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:895:2: ( (lv_righthand_12_0= ruleIN_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:896:1: (lv_righthand_12_0= ruleIN_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:896:1: (lv_righthand_12_0= ruleIN_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:897:3: lv_righthand_12_0= ruleIN_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getRighthandIN_REFERENCEParserRuleCall_1_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1635);
                    lv_righthand_12_0=ruleIN_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"righthand",
                            		lv_righthand_12_0, 
                            		"IN_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:914:6: ( ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) ) ( (lv_operator_14_0= RULE_ID ) ) ( (lv_righthand_15_0= ruleVAR_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:914:6: ( ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) ) ( (lv_operator_14_0= RULE_ID ) ) ( (lv_righthand_15_0= ruleVAR_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:914:7: ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) ) ( (lv_operator_14_0= RULE_ID ) ) ( (lv_righthand_15_0= ruleVAR_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:914:7: ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:915:1: (lv_lefthand_13_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:915:1: (lv_lefthand_13_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:916:3: lv_lefthand_13_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1664);
                    lv_lefthand_13_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_13_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:932:2: ( (lv_operator_14_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:933:1: (lv_operator_14_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:933:1: (lv_operator_14_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:934:3: lv_operator_14_0= RULE_ID
                    {
                    lv_operator_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement1681); 

                    			newLeafNode(lv_operator_14_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_14_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:950:2: ( (lv_righthand_15_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:951:1: (lv_righthand_15_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:951:1: (lv_righthand_15_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:952:3: lv_righthand_15_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getRighthandVAR_REFERENCEParserRuleCall_1_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1707);
                    lv_righthand_15_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"righthand",
                            		lv_righthand_15_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:969:6: ( ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) ) ( (lv_operator_17_0= RULE_ID ) ) ( (lv_val_s_18_0= RULE_STRING ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:969:6: ( ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) ) ( (lv_operator_17_0= RULE_ID ) ) ( (lv_val_s_18_0= RULE_STRING ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:969:7: ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) ) ( (lv_operator_17_0= RULE_ID ) ) ( (lv_val_s_18_0= RULE_STRING ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:969:7: ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:970:1: (lv_lefthand_16_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:970:1: (lv_lefthand_16_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:971:3: lv_lefthand_16_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1736);
                    lv_lefthand_16_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_16_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:987:2: ( (lv_operator_17_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:988:1: (lv_operator_17_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:988:1: (lv_operator_17_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:989:3: lv_operator_17_0= RULE_ID
                    {
                    lv_operator_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement1753); 

                    			newLeafNode(lv_operator_17_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_17_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1005:2: ( (lv_val_s_18_0= RULE_STRING ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1006:1: (lv_val_s_18_0= RULE_STRING )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1006:1: (lv_val_s_18_0= RULE_STRING )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1007:3: lv_val_s_18_0= RULE_STRING
                    {
                    lv_val_s_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfStatement1775); 

                    			newLeafNode(lv_val_s_18_0, grammarAccess.getIfStatementAccess().getVal_sSTRINGTerminalRuleCall_1_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val_s",
                            		lv_val_s_18_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1024:6: ( ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) ) ( (lv_operator_20_0= RULE_ID ) ) ( (lv_val_i_21_0= RULE_INT ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1024:6: ( ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) ) ( (lv_operator_20_0= RULE_ID ) ) ( (lv_val_i_21_0= RULE_INT ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1024:7: ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) ) ( (lv_operator_20_0= RULE_ID ) ) ( (lv_val_i_21_0= RULE_INT ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1024:7: ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1025:1: (lv_lefthand_19_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1025:1: (lv_lefthand_19_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1026:3: lv_lefthand_19_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandVAR_REFERENCEParserRuleCall_1_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1809);
                    lv_lefthand_19_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_19_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1042:2: ( (lv_operator_20_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1043:1: (lv_operator_20_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1043:1: (lv_operator_20_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1044:3: lv_operator_20_0= RULE_ID
                    {
                    lv_operator_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement1826); 

                    			newLeafNode(lv_operator_20_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_20_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1060:2: ( (lv_val_i_21_0= RULE_INT ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1061:1: (lv_val_i_21_0= RULE_INT )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1061:1: (lv_val_i_21_0= RULE_INT )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1062:3: lv_val_i_21_0= RULE_INT
                    {
                    lv_val_i_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIfStatement1848); 

                    			newLeafNode(lv_val_i_21_0, grammarAccess.getIfStatementAccess().getVal_iINTTerminalRuleCall_1_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val_i",
                            		lv_val_i_21_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1079:6: ( ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) ) ( (lv_operator_23_0= RULE_ID ) ) ( (lv_righthand_24_0= ruleIN_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1079:6: ( ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) ) ( (lv_operator_23_0= RULE_ID ) ) ( (lv_righthand_24_0= ruleIN_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1079:7: ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) ) ( (lv_operator_23_0= RULE_ID ) ) ( (lv_righthand_24_0= ruleIN_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1079:7: ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1080:1: (lv_lefthand_22_0= ruleOUT_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1080:1: (lv_lefthand_22_0= ruleOUT_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1081:3: lv_lefthand_22_0= ruleOUT_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_7_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOUT_REFERENCE_in_ruleIfStatement1882);
                    lv_lefthand_22_0=ruleOUT_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_22_0, 
                            		"OUT_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1097:2: ( (lv_operator_23_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1098:1: (lv_operator_23_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1098:1: (lv_operator_23_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1099:3: lv_operator_23_0= RULE_ID
                    {
                    lv_operator_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement1899); 

                    			newLeafNode(lv_operator_23_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_23_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1115:2: ( (lv_righthand_24_0= ruleIN_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1116:1: (lv_righthand_24_0= ruleIN_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1116:1: (lv_righthand_24_0= ruleIN_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1117:3: lv_righthand_24_0= ruleIN_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getRighthandIN_REFERENCEParserRuleCall_1_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1925);
                    lv_righthand_24_0=ruleIN_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"righthand",
                            		lv_righthand_24_0, 
                            		"IN_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1134:6: ( ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) ) ( (lv_operator_26_0= RULE_ID ) ) ( (lv_righthand_27_0= ruleVAR_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1134:6: ( ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) ) ( (lv_operator_26_0= RULE_ID ) ) ( (lv_righthand_27_0= ruleVAR_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1134:7: ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) ) ( (lv_operator_26_0= RULE_ID ) ) ( (lv_righthand_27_0= ruleVAR_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1134:7: ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1135:1: (lv_lefthand_25_0= ruleOUT_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1135:1: (lv_lefthand_25_0= ruleOUT_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1136:3: lv_lefthand_25_0= ruleOUT_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_8_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOUT_REFERENCE_in_ruleIfStatement1954);
                    lv_lefthand_25_0=ruleOUT_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_25_0, 
                            		"OUT_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1152:2: ( (lv_operator_26_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1153:1: (lv_operator_26_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1153:1: (lv_operator_26_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1154:3: lv_operator_26_0= RULE_ID
                    {
                    lv_operator_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement1971); 

                    			newLeafNode(lv_operator_26_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_26_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1170:2: ( (lv_righthand_27_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1171:1: (lv_righthand_27_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1171:1: (lv_righthand_27_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1172:3: lv_righthand_27_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getRighthandVAR_REFERENCEParserRuleCall_1_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1997);
                    lv_righthand_27_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"righthand",
                            		lv_righthand_27_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1189:6: ( ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) ) ( (lv_operator_29_0= RULE_ID ) ) ( (lv_val_s_30_0= RULE_STRING ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1189:6: ( ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) ) ( (lv_operator_29_0= RULE_ID ) ) ( (lv_val_s_30_0= RULE_STRING ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1189:7: ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) ) ( (lv_operator_29_0= RULE_ID ) ) ( (lv_val_s_30_0= RULE_STRING ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1189:7: ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1190:1: (lv_lefthand_28_0= ruleOUT_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1190:1: (lv_lefthand_28_0= ruleOUT_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1191:3: lv_lefthand_28_0= ruleOUT_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_9_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOUT_REFERENCE_in_ruleIfStatement2026);
                    lv_lefthand_28_0=ruleOUT_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_28_0, 
                            		"OUT_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1207:2: ( (lv_operator_29_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1208:1: (lv_operator_29_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1208:1: (lv_operator_29_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1209:3: lv_operator_29_0= RULE_ID
                    {
                    lv_operator_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement2043); 

                    			newLeafNode(lv_operator_29_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_29_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1225:2: ( (lv_val_s_30_0= RULE_STRING ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1226:1: (lv_val_s_30_0= RULE_STRING )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1226:1: (lv_val_s_30_0= RULE_STRING )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1227:3: lv_val_s_30_0= RULE_STRING
                    {
                    lv_val_s_30_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfStatement2065); 

                    			newLeafNode(lv_val_s_30_0, grammarAccess.getIfStatementAccess().getVal_sSTRINGTerminalRuleCall_1_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val_s",
                            		lv_val_s_30_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1244:6: ( ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) ) ( (lv_operator_32_0= RULE_ID ) ) ( (lv_val_i_33_0= RULE_INT ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1244:6: ( ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) ) ( (lv_operator_32_0= RULE_ID ) ) ( (lv_val_i_33_0= RULE_INT ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1244:7: ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) ) ( (lv_operator_32_0= RULE_ID ) ) ( (lv_val_i_33_0= RULE_INT ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1244:7: ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1245:1: (lv_lefthand_31_0= ruleOUT_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1245:1: (lv_lefthand_31_0= ruleOUT_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1246:3: lv_lefthand_31_0= ruleOUT_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getLefthandOUT_REFERENCEParserRuleCall_1_10_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOUT_REFERENCE_in_ruleIfStatement2099);
                    lv_lefthand_31_0=ruleOUT_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_31_0, 
                            		"OUT_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1262:2: ( (lv_operator_32_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1263:1: (lv_operator_32_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1263:1: (lv_operator_32_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1264:3: lv_operator_32_0= RULE_ID
                    {
                    lv_operator_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIfStatement2116); 

                    			newLeafNode(lv_operator_32_0, grammarAccess.getIfStatementAccess().getOperatorIDTerminalRuleCall_1_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_32_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1280:2: ( (lv_val_i_33_0= RULE_INT ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1281:1: (lv_val_i_33_0= RULE_INT )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1281:1: (lv_val_i_33_0= RULE_INT )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1282:3: lv_val_i_33_0= RULE_INT
                    {
                    lv_val_i_33_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIfStatement2138); 

                    			newLeafNode(lv_val_i_33_0, grammarAccess.getIfStatementAccess().getVal_iINTTerminalRuleCall_1_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIfStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val_i",
                            		lv_val_i_33_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1298:4: ( ( (lv_ifoperations_34_1= ruleAssignment | lv_ifoperations_34_2= ruleExecuteStatement ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_OUT_REFERENCE_HANDLE && LA9_0<=RULE_VAR_REFERENCE_HANDLE)||LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1299:1: ( (lv_ifoperations_34_1= ruleAssignment | lv_ifoperations_34_2= ruleExecuteStatement ) )
            	    {
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1299:1: ( (lv_ifoperations_34_1= ruleAssignment | lv_ifoperations_34_2= ruleExecuteStatement ) )
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1300:1: (lv_ifoperations_34_1= ruleAssignment | lv_ifoperations_34_2= ruleExecuteStatement )
            	    {
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1300:1: (lv_ifoperations_34_1= ruleAssignment | lv_ifoperations_34_2= ruleExecuteStatement )
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
            	            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1301:3: lv_ifoperations_34_1= ruleAssignment
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfoperationsAssignmentParserRuleCall_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAssignment_in_ruleIfStatement2168);
            	            lv_ifoperations_34_1=ruleAssignment();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"ifoperations",
            	                    		lv_ifoperations_34_1, 
            	                    		"Assignment");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1316:8: lv_ifoperations_34_2= ruleExecuteStatement
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfoperationsExecuteStatementParserRuleCall_2_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleExecuteStatement_in_ruleIfStatement2187);
            	            lv_ifoperations_34_2=ruleExecuteStatement();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"ifoperations",
            	                    		lv_ifoperations_34_2, 
            	                    		"ExecuteStatement");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1334:3: (otherlv_35= 'else' ( ( (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1334:5: otherlv_35= 'else' ( ( (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement ) ) )*
                    {
                    otherlv_35=(Token)match(input,23,FOLLOW_23_in_ruleIfStatement2204); 

                        	newLeafNode(otherlv_35, grammarAccess.getIfStatementAccess().getElseKeyword_3_0());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1338:1: ( ( (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_OUT_REFERENCE_HANDLE && LA11_0<=RULE_VAR_REFERENCE_HANDLE)||LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1339:1: ( (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement ) )
                    	    {
                    	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1339:1: ( (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement ) )
                    	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1340:1: (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement )
                    	    {
                    	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1340:1: (lv_elseoperations_36_1= ruleAssignment | lv_elseoperations_36_2= ruleExecuteStatement )
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( ((LA10_0>=RULE_OUT_REFERENCE_HANDLE && LA10_0<=RULE_VAR_REFERENCE_HANDLE)) ) {
                    	        alt10=1;
                    	    }
                    	    else if ( (LA10_0==18) ) {
                    	        alt10=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 10, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1341:3: lv_elseoperations_36_1= ruleAssignment
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseoperationsAssignmentParserRuleCall_3_1_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAssignment_in_ruleIfStatement2227);
                    	            lv_elseoperations_36_1=ruleAssignment();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"elseoperations",
                    	                    		lv_elseoperations_36_1, 
                    	                    		"Assignment");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1356:8: lv_elseoperations_36_2= ruleExecuteStatement
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseoperationsExecuteStatementParserRuleCall_3_1_0_1()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleExecuteStatement_in_ruleIfStatement2246);
                    	            lv_elseoperations_36_2=ruleExecuteStatement();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"elseoperations",
                    	                    		lv_elseoperations_36_2, 
                    	                    		"ExecuteStatement");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_37=(Token)match(input,24,FOLLOW_24_in_ruleIfStatement2264); 

                	newLeafNode(otherlv_37, grammarAccess.getIfStatementAccess().getEndKeyword_4());
                

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleAssignment"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1386:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1387:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1388:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment2300);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment2310); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1395:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_val_s_8_0=null;
        Token otherlv_10=null;
        Token lv_val_i_11_0=null;
        EObject lv_lefthand_0_0 = null;

        EObject lv_righthand_2_0 = null;

        EObject lv_lefthand_3_0 = null;

        EObject lv_righthand_5_0 = null;

        EObject lv_lefthand_6_0 = null;

        EObject lv_lefthand_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1398:28: ( ( ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1399:1: ( ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1399:1: ( ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) ) )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1399:2: ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1399:2: ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1399:3: ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1399:3: ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1400:1: (lv_lefthand_0_0= ruleOUT_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1400:1: (lv_lefthand_0_0= ruleOUT_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1401:3: lv_lefthand_0_0= ruleOUT_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOUT_REFERENCE_in_ruleAssignment2357);
                    lv_lefthand_0_0=ruleOUT_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_0_0, 
                            		"OUT_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAssignment2369); 

                        	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1421:1: ( (lv_righthand_2_0= ruleIN_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1422:1: (lv_righthand_2_0= ruleIN_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1422:1: (lv_righthand_2_0= ruleIN_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1423:3: lv_righthand_2_0= ruleIN_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getRighthandIN_REFERENCEParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIN_REFERENCE_in_ruleAssignment2390);
                    lv_righthand_2_0=ruleIN_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"righthand",
                            		lv_righthand_2_0, 
                            		"IN_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1440:6: ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1440:6: ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1440:7: ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1440:7: ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1441:1: (lv_lefthand_3_0= ruleOUT_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1441:1: (lv_lefthand_3_0= ruleOUT_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1442:3: lv_lefthand_3_0= ruleOUT_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOUT_REFERENCE_in_ruleAssignment2419);
                    lv_lefthand_3_0=ruleOUT_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_3_0, 
                            		"OUT_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleAssignment2431); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1462:1: ( (lv_righthand_5_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1463:1: (lv_righthand_5_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1463:1: (lv_righthand_5_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1464:3: lv_righthand_5_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getRighthandVAR_REFERENCEParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment2452);
                    lv_righthand_5_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"righthand",
                            		lv_righthand_5_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1481:6: ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1481:6: ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1481:7: ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1481:7: ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1482:1: (lv_lefthand_6_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1482:1: (lv_lefthand_6_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1483:3: lv_lefthand_6_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment2481);
                    lv_lefthand_6_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_6_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleAssignment2493); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1503:1: ( (lv_val_s_8_0= RULE_STRING ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1504:1: (lv_val_s_8_0= RULE_STRING )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1504:1: (lv_val_s_8_0= RULE_STRING )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1505:3: lv_val_s_8_0= RULE_STRING
                    {
                    lv_val_s_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignment2510); 

                    			newLeafNode(lv_val_s_8_0, grammarAccess.getAssignmentAccess().getVal_sSTRINGTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val_s",
                            		lv_val_s_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1522:6: ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1522:6: ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1522:7: ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1522:7: ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1523:1: (lv_lefthand_9_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1523:1: (lv_lefthand_9_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1524:3: lv_lefthand_9_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment2544);
                    lv_lefthand_9_0=ruleVAR_REFERENCE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"lefthand",
                            		lv_lefthand_9_0, 
                            		"VAR_REFERENCE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleAssignment2556); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_3_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1544:1: ( (lv_val_i_11_0= RULE_INT ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1545:1: (lv_val_i_11_0= RULE_INT )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1545:1: (lv_val_i_11_0= RULE_INT )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1546:3: lv_val_i_11_0= RULE_INT
                    {
                    lv_val_i_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAssignment2573); 

                    			newLeafNode(lv_val_i_11_0, grammarAccess.getAssignmentAccess().getVal_iINTTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val_i",
                            		lv_val_i_11_0, 
                            		"INT");
                    	    

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleIN_REFERENCE"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1570:1: entryRuleIN_REFERENCE returns [EObject current=null] : iv_ruleIN_REFERENCE= ruleIN_REFERENCE EOF ;
    public final EObject entryRuleIN_REFERENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIN_REFERENCE = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1571:2: (iv_ruleIN_REFERENCE= ruleIN_REFERENCE EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1572:2: iv_ruleIN_REFERENCE= ruleIN_REFERENCE EOF
            {
             newCompositeNode(grammarAccess.getIN_REFERENCERule()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_entryRuleIN_REFERENCE2615);
            iv_ruleIN_REFERENCE=ruleIN_REFERENCE();

            state._fsp--;

             current =iv_ruleIN_REFERENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIN_REFERENCE2625); 

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
    // $ANTLR end "entryRuleIN_REFERENCE"


    // $ANTLR start "ruleIN_REFERENCE"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1579:1: ruleIN_REFERENCE returns [EObject current=null] : (this_IN_REFERENCE_HANDLE_0= RULE_IN_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIN_REFERENCE() throws RecognitionException {
        EObject current = null;

        Token this_IN_REFERENCE_HANDLE_0=null;
        Token lv_refname_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1582:28: ( (this_IN_REFERENCE_HANDLE_0= RULE_IN_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1583:1: (this_IN_REFERENCE_HANDLE_0= RULE_IN_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1583:1: (this_IN_REFERENCE_HANDLE_0= RULE_IN_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1583:2: this_IN_REFERENCE_HANDLE_0= RULE_IN_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) )
            {
            this_IN_REFERENCE_HANDLE_0=(Token)match(input,RULE_IN_REFERENCE_HANDLE,FOLLOW_RULE_IN_REFERENCE_HANDLE_in_ruleIN_REFERENCE2661); 
             
                newLeafNode(this_IN_REFERENCE_HANDLE_0, grammarAccess.getIN_REFERENCEAccess().getIN_REFERENCE_HANDLETerminalRuleCall_0()); 
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1587:1: ( (lv_refname_1_0= RULE_ID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1588:1: (lv_refname_1_0= RULE_ID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1588:1: (lv_refname_1_0= RULE_ID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1589:3: lv_refname_1_0= RULE_ID
            {
            lv_refname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIN_REFERENCE2677); 

            			newLeafNode(lv_refname_1_0, grammarAccess.getIN_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIN_REFERENCERule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"refname",
                    		lv_refname_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleIN_REFERENCE"


    // $ANTLR start "entryRuleOUT_REFERENCE"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1613:1: entryRuleOUT_REFERENCE returns [EObject current=null] : iv_ruleOUT_REFERENCE= ruleOUT_REFERENCE EOF ;
    public final EObject entryRuleOUT_REFERENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOUT_REFERENCE = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1614:2: (iv_ruleOUT_REFERENCE= ruleOUT_REFERENCE EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1615:2: iv_ruleOUT_REFERENCE= ruleOUT_REFERENCE EOF
            {
             newCompositeNode(grammarAccess.getOUT_REFERENCERule()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_entryRuleOUT_REFERENCE2718);
            iv_ruleOUT_REFERENCE=ruleOUT_REFERENCE();

            state._fsp--;

             current =iv_ruleOUT_REFERENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOUT_REFERENCE2728); 

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
    // $ANTLR end "entryRuleOUT_REFERENCE"


    // $ANTLR start "ruleOUT_REFERENCE"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1622:1: ruleOUT_REFERENCE returns [EObject current=null] : (this_OUT_REFERENCE_HANDLE_0= RULE_OUT_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOUT_REFERENCE() throws RecognitionException {
        EObject current = null;

        Token this_OUT_REFERENCE_HANDLE_0=null;
        Token lv_refname_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1625:28: ( (this_OUT_REFERENCE_HANDLE_0= RULE_OUT_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1626:1: (this_OUT_REFERENCE_HANDLE_0= RULE_OUT_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1626:1: (this_OUT_REFERENCE_HANDLE_0= RULE_OUT_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1626:2: this_OUT_REFERENCE_HANDLE_0= RULE_OUT_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) )
            {
            this_OUT_REFERENCE_HANDLE_0=(Token)match(input,RULE_OUT_REFERENCE_HANDLE,FOLLOW_RULE_OUT_REFERENCE_HANDLE_in_ruleOUT_REFERENCE2764); 
             
                newLeafNode(this_OUT_REFERENCE_HANDLE_0, grammarAccess.getOUT_REFERENCEAccess().getOUT_REFERENCE_HANDLETerminalRuleCall_0()); 
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1630:1: ( (lv_refname_1_0= RULE_ID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1631:1: (lv_refname_1_0= RULE_ID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1631:1: (lv_refname_1_0= RULE_ID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1632:3: lv_refname_1_0= RULE_ID
            {
            lv_refname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOUT_REFERENCE2780); 

            			newLeafNode(lv_refname_1_0, grammarAccess.getOUT_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOUT_REFERENCERule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"refname",
                    		lv_refname_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleOUT_REFERENCE"


    // $ANTLR start "entryRuleVAR_REFERENCE"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1656:1: entryRuleVAR_REFERENCE returns [EObject current=null] : iv_ruleVAR_REFERENCE= ruleVAR_REFERENCE EOF ;
    public final EObject entryRuleVAR_REFERENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAR_REFERENCE = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1657:2: (iv_ruleVAR_REFERENCE= ruleVAR_REFERENCE EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1658:2: iv_ruleVAR_REFERENCE= ruleVAR_REFERENCE EOF
            {
             newCompositeNode(grammarAccess.getVAR_REFERENCERule()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_entryRuleVAR_REFERENCE2821);
            iv_ruleVAR_REFERENCE=ruleVAR_REFERENCE();

            state._fsp--;

             current =iv_ruleVAR_REFERENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAR_REFERENCE2831); 

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
    // $ANTLR end "entryRuleVAR_REFERENCE"


    // $ANTLR start "ruleVAR_REFERENCE"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1665:1: ruleVAR_REFERENCE returns [EObject current=null] : (this_VAR_REFERENCE_HANDLE_0= RULE_VAR_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVAR_REFERENCE() throws RecognitionException {
        EObject current = null;

        Token this_VAR_REFERENCE_HANDLE_0=null;
        Token lv_refname_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1668:28: ( (this_VAR_REFERENCE_HANDLE_0= RULE_VAR_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1669:1: (this_VAR_REFERENCE_HANDLE_0= RULE_VAR_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1669:1: (this_VAR_REFERENCE_HANDLE_0= RULE_VAR_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1669:2: this_VAR_REFERENCE_HANDLE_0= RULE_VAR_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) )
            {
            this_VAR_REFERENCE_HANDLE_0=(Token)match(input,RULE_VAR_REFERENCE_HANDLE,FOLLOW_RULE_VAR_REFERENCE_HANDLE_in_ruleVAR_REFERENCE2867); 
             
                newLeafNode(this_VAR_REFERENCE_HANDLE_0, grammarAccess.getVAR_REFERENCEAccess().getVAR_REFERENCE_HANDLETerminalRuleCall_0()); 
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1673:1: ( (lv_refname_1_0= RULE_ID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1674:1: (lv_refname_1_0= RULE_ID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1674:1: (lv_refname_1_0= RULE_ID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1675:3: lv_refname_1_0= RULE_ID
            {
            lv_refname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVAR_REFERENCE2883); 

            			newLeafNode(lv_refname_1_0, grammarAccess.getVAR_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVAR_REFERENCERule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"refname",
                    		lv_refname_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleVAR_REFERENCE"


    // $ANTLR start "entryRuleQUALIFIEDNAME"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1699:1: entryRuleQUALIFIEDNAME returns [String current=null] : iv_ruleQUALIFIEDNAME= ruleQUALIFIEDNAME EOF ;
    public final String entryRuleQUALIFIEDNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUALIFIEDNAME = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1700:2: (iv_ruleQUALIFIEDNAME= ruleQUALIFIEDNAME EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1701:2: iv_ruleQUALIFIEDNAME= ruleQUALIFIEDNAME EOF
            {
             newCompositeNode(grammarAccess.getQUALIFIEDNAMERule()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_entryRuleQUALIFIEDNAME2925);
            iv_ruleQUALIFIEDNAME=ruleQUALIFIEDNAME();

            state._fsp--;

             current =iv_ruleQUALIFIEDNAME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDNAME2936); 

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
    // $ANTLR end "entryRuleQUALIFIEDNAME"


    // $ANTLR start "ruleQUALIFIEDNAME"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1708:1: ruleQUALIFIEDNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQUALIFIEDNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1711:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1712:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1712:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1712:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME2976); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1719:1: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1720:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleQUALIFIEDNAME2995); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQUALIFIEDNAMEAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME3010); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQUALIFIEDNAME"


    // $ANTLR start "entryRuleQUALIFIEDID"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1740:1: entryRuleQUALIFIEDID returns [String current=null] : iv_ruleQUALIFIEDID= ruleQUALIFIEDID EOF ;
    public final String entryRuleQUALIFIEDID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUALIFIEDID = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1741:2: (iv_ruleQUALIFIEDID= ruleQUALIFIEDID EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1742:2: iv_ruleQUALIFIEDID= ruleQUALIFIEDID EOF
            {
             newCompositeNode(grammarAccess.getQUALIFIEDIDRule()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID3058);
            iv_ruleQUALIFIEDID=ruleQUALIFIEDID();

            state._fsp--;

             current =iv_ruleQUALIFIEDID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDID3069); 

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
    // $ANTLR end "entryRuleQUALIFIEDID"


    // $ANTLR start "ruleQUALIFIEDID"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1749:1: ruleQUALIFIEDID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_QUALIFIEDNAME_2= ruleQUALIFIEDNAME )* ) ;
    public final AntlrDatatypeRuleToken ruleQUALIFIEDID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_QUALIFIEDNAME_2 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1752:28: ( (this_ID_0= RULE_ID (kw= '/' this_QUALIFIEDNAME_2= ruleQUALIFIEDNAME )* ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1753:1: (this_ID_0= RULE_ID (kw= '/' this_QUALIFIEDNAME_2= ruleQUALIFIEDNAME )* )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1753:1: (this_ID_0= RULE_ID (kw= '/' this_QUALIFIEDNAME_2= ruleQUALIFIEDNAME )* )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1753:6: this_ID_0= RULE_ID (kw= '/' this_QUALIFIEDNAME_2= ruleQUALIFIEDNAME )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDID3109); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1760:1: (kw= '/' this_QUALIFIEDNAME_2= ruleQUALIFIEDNAME )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1761:2: kw= '/' this_QUALIFIEDNAME_2= ruleQUALIFIEDNAME
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleQUALIFIEDID3128); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQUALIFIEDIDAccess().getSolidusKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQUALIFIEDIDAccess().getQUALIFIEDNAMEParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_ruleQUALIFIEDID3150);
            	    this_QUALIFIEDNAME_2=ruleQUALIFIEDNAME();

            	    state._fsp--;


            	    		current.merge(this_QUALIFIEDNAME_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleQUALIFIEDID"


    // $ANTLR start "entryRuleURI"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1785:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1786:2: (iv_ruleURI= ruleURI EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1787:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI3198);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI3209); 

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1794:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1797:28: ( (kw= '/' this_ID_1= RULE_ID )* )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1798:1: (kw= '/' this_ID_1= RULE_ID )*
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1798:1: (kw= '/' this_ID_1= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1799:2: kw= '/' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleURI3247); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getURIAccess().getSolidusKeyword_0()); 
            	        
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI3262); 

            	    		current.merge(this_ID_1);
            	        
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getURIAccess().getIDTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleURI"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA7_eotS =
        "\25\uffff";
    static final String DFA7_eofS =
        "\25\uffff";
    static final String DFA7_minS =
        "\1\10\6\6\3\5\13\uffff";
    static final String DFA7_maxS =
        "\1\12\6\6\1\10\2\12\13\uffff";
    static final String DFA7_acceptS =
        "\12\uffff\1\3\1\1\1\2\1\4\1\5\1\7\1\6\1\12\1\10\1\11\1\13";
    static final String DFA7_specialS =
        "\25\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\3\1\2",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\1\uffff\1\14\1\13",
            "\1\17\1\uffff\1\20\1\15\1\uffff\1\16",
            "\1\24\1\uffff\1\21\1\22\1\uffff\1\23",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "694:1: ( ( ( (lv_lefthand_1_0= ruleIN_REFERENCE ) ) ( (lv_operator_2_0= RULE_ID ) ) ( (lv_righthand_3_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_4_0= ruleIN_REFERENCE ) ) ( (lv_operator_5_0= RULE_ID ) ) ( (lv_val_s_6_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_7_0= ruleIN_REFERENCE ) ) ( (lv_operator_8_0= RULE_ID ) ) ( (lv_val_i_9_0= RULE_INT ) ) ) | ( ( (lv_lefthand_10_0= ruleVAR_REFERENCE ) ) ( (lv_operator_11_0= RULE_ID ) ) ( (lv_righthand_12_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_13_0= ruleVAR_REFERENCE ) ) ( (lv_operator_14_0= RULE_ID ) ) ( (lv_righthand_15_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_16_0= ruleVAR_REFERENCE ) ) ( (lv_operator_17_0= RULE_ID ) ) ( (lv_val_s_18_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_19_0= ruleVAR_REFERENCE ) ) ( (lv_operator_20_0= RULE_ID ) ) ( (lv_val_i_21_0= RULE_INT ) ) ) | ( ( (lv_lefthand_22_0= ruleOUT_REFERENCE ) ) ( (lv_operator_23_0= RULE_ID ) ) ( (lv_righthand_24_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_25_0= ruleOUT_REFERENCE ) ) ( (lv_operator_26_0= RULE_ID ) ) ( (lv_righthand_27_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_28_0= ruleOUT_REFERENCE ) ) ( (lv_operator_29_0= RULE_ID ) ) ( (lv_val_s_30_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_31_0= ruleOUT_REFERENCE ) ) ( (lv_operator_32_0= RULE_ID ) ) ( (lv_val_i_33_0= RULE_INT ) ) ) )";
        }
    }
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\13\uffff";
    static final String DFA13_minS =
        "\1\11\2\6\2\31\1\10\1\5\4\uffff";
    static final String DFA13_maxS =
        "\1\12\2\6\2\31\1\12\1\7\4\uffff";
    static final String DFA13_acceptS =
        "\7\uffff\1\1\1\2\1\3\1\4";
    static final String DFA13_specialS =
        "\13\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\1\uffff\1\10",
            "\1\12\1\uffff\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1399:1: ( ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleWorksequence_in_entryRuleWorksequence75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorksequence85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleWorksequence130 = new BitSet(new long[]{0x0000000000448602L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalBinding_in_ruleOperation223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemoteBinding_in_ruleOperation250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleOperation277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_ruleOperation304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleOperation331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalBinding_in_entryRuleLocalBinding366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalBinding376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLocalBinding413 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLocalBinding425 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_ruleLocalBinding446 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLocalBinding458 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_ruleLocalBinding479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemoteBinding_in_entryRuleRemoteBinding515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRemoteBinding525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRemoteBinding562 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRemoteBinding574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PROTOCOL_in_ruleRemoteBinding591 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_ruleRemoteBinding617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRemoteBinding634 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_ruleURI_in_ruleRemoteBinding660 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_ruleRemoteBinding681 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRemoteBinding693 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_ruleRemoteBinding714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_entryRuleExecuteStatement750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecuteStatement760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExecuteStatement797 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_ruleExecuteStatement818 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExecuteStatement830 = new BitSet(new long[]{0x0000000000100500L});
    public static final BitSet FOLLOW_ruleExecInput_in_ruleExecuteStatement851 = new BitSet(new long[]{0x0000000000100500L});
    public static final BitSet FOLLOW_20_in_ruleExecuteStatement864 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleExecOutput_in_ruleExecuteStatement885 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleExecInput_in_entryRuleExecInput922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecInput932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_ruleExecInput979 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecInput991 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecInput1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleExecInput1042 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecInput1054 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecInput1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecOutput_in_entryRuleExecOutput1113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecOutput1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecOutput1166 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecOutput1183 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_ruleExecOutput1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecOutput1229 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecOutput1246 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleExecOutput1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleIfStatement1351 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1374 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement1391 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1417 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1446 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement1463 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfStatement1485 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1519 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement1536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIfStatement1558 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1592 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement1609 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1635 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1664 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement1681 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1707 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1736 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement1753 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfStatement1775 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1809 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement1826 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIfStatement1848 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_ruleIfStatement1882 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement1899 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_ruleIfStatement1925 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_ruleIfStatement1954 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement1971 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleIfStatement1997 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_ruleIfStatement2026 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement2043 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfStatement2065 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_ruleIfStatement2099 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIfStatement2116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIfStatement2138 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleIfStatement2168 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_ruleIfStatement2187 = new BitSet(new long[]{0x0000000001840600L});
    public static final BitSet FOLLOW_23_in_ruleIfStatement2204 = new BitSet(new long[]{0x0000000001040600L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleIfStatement2227 = new BitSet(new long[]{0x0000000001040600L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_ruleIfStatement2246 = new BitSet(new long[]{0x0000000001040600L});
    public static final BitSet FOLLOW_24_in_ruleIfStatement2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment2300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_ruleAssignment2357 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignment2369 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_ruleAssignment2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_ruleAssignment2419 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignment2431 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment2481 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignment2493 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment2544 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignment2556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAssignment2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_entryRuleIN_REFERENCE2615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIN_REFERENCE2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IN_REFERENCE_HANDLE_in_ruleIN_REFERENCE2661 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIN_REFERENCE2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_entryRuleOUT_REFERENCE2718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOUT_REFERENCE2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OUT_REFERENCE_HANDLE_in_ruleOUT_REFERENCE2764 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOUT_REFERENCE2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_entryRuleVAR_REFERENCE2821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAR_REFERENCE2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_REFERENCE_HANDLE_in_ruleVAR_REFERENCE2867 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVAR_REFERENCE2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_entryRuleQUALIFIEDNAME2925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDNAME2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME2976 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQUALIFIEDNAME2995 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME3010 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID3058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDID3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDID3109 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleQUALIFIEDID3128 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_ruleQUALIFIEDID3150 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI3198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleURI3247 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI3262 = new BitSet(new long[]{0x0000000008000002L});

}