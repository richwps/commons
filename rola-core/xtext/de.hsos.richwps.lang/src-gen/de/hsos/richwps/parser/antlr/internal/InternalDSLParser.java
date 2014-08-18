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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PROTOCOL", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_IN_REFERENCE_HANDLE", "RULE_OUT_REFERENCE_HANDLE", "RULE_VAR_REFERENCE_HANDLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bind'", "'process'", "'to'", "'execute'", "'with'", "'store'", "'as'", "'='", "'.'", "'/'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_OUT_REFERENCE_HANDLE=9;
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
    public static final int T__17=17;
    public static final int RULE_IN_REFERENCE_HANDLE=8;
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

                if ( ((LA1_0>=RULE_OUT_REFERENCE_HANDLE && LA1_0<=RULE_VAR_REFERENCE_HANDLE)||LA1_0==15||LA1_0==18) ) {
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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:115:1: ruleOperation returns [EObject current=null] : (this_LocalBinding_0= ruleLocalBinding | this_RemoteBinding_1= ruleRemoteBinding | this_Assignment_2= ruleAssignment | this_ExecuteStatement_3= ruleExecuteStatement ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_LocalBinding_0 = null;

        EObject this_RemoteBinding_1 = null;

        EObject this_Assignment_2 = null;

        EObject this_ExecuteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:118:28: ( (this_LocalBinding_0= ruleLocalBinding | this_RemoteBinding_1= ruleRemoteBinding | this_Assignment_2= ruleAssignment | this_ExecuteStatement_3= ruleExecuteStatement ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:119:1: (this_LocalBinding_0= ruleLocalBinding | this_RemoteBinding_1= ruleRemoteBinding | this_Assignment_2= ruleAssignment | this_ExecuteStatement_3= ruleExecuteStatement )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:119:1: (this_LocalBinding_0= ruleLocalBinding | this_RemoteBinding_1= ruleRemoteBinding | this_Assignment_2= ruleAssignment | this_ExecuteStatement_3= ruleExecuteStatement )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==16) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_ID) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==RULE_PROTOCOL) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:166:1: entryRuleLocalBinding returns [EObject current=null] : iv_ruleLocalBinding= ruleLocalBinding EOF ;
    public final EObject entryRuleLocalBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalBinding = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:167:2: (iv_ruleLocalBinding= ruleLocalBinding EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:168:2: iv_ruleLocalBinding= ruleLocalBinding EOF
            {
             newCompositeNode(grammarAccess.getLocalBindingRule()); 
            pushFollow(FOLLOW_ruleLocalBinding_in_entryRuleLocalBinding339);
            iv_ruleLocalBinding=ruleLocalBinding();

            state._fsp--;

             current =iv_ruleLocalBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalBinding349); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:175:1: ruleLocalBinding returns [EObject current=null] : (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_processid_2_0= ruleQUALIFIEDNAME ) ) otherlv_3= 'to' ( (lv_handle_4_0= ruleQUALIFIEDID ) ) ) ;
    public final EObject ruleLocalBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_processid_2_0 = null;

        AntlrDatatypeRuleToken lv_handle_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:178:28: ( (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_processid_2_0= ruleQUALIFIEDNAME ) ) otherlv_3= 'to' ( (lv_handle_4_0= ruleQUALIFIEDID ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:179:1: (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_processid_2_0= ruleQUALIFIEDNAME ) ) otherlv_3= 'to' ( (lv_handle_4_0= ruleQUALIFIEDID ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:179:1: (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_processid_2_0= ruleQUALIFIEDNAME ) ) otherlv_3= 'to' ( (lv_handle_4_0= ruleQUALIFIEDID ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:179:3: otherlv_0= 'bind' otherlv_1= 'process' ( (lv_processid_2_0= ruleQUALIFIEDNAME ) ) otherlv_3= 'to' ( (lv_handle_4_0= ruleQUALIFIEDID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleLocalBinding386); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalBindingAccess().getBindKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleLocalBinding398); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalBindingAccess().getProcessKeyword_1());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:187:1: ( (lv_processid_2_0= ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:188:1: (lv_processid_2_0= ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:188:1: (lv_processid_2_0= ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:189:3: lv_processid_2_0= ruleQUALIFIEDNAME
            {
             
            	        newCompositeNode(grammarAccess.getLocalBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_ruleLocalBinding419);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleLocalBinding431); 

                	newLeafNode(otherlv_3, grammarAccess.getLocalBindingAccess().getToKeyword_3());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:209:1: ( (lv_handle_4_0= ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:210:1: (lv_handle_4_0= ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:210:1: (lv_handle_4_0= ruleQUALIFIEDID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:211:3: lv_handle_4_0= ruleQUALIFIEDID
            {
             
            	        newCompositeNode(grammarAccess.getLocalBindingAccess().getHandleQUALIFIEDIDParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_ruleLocalBinding452);
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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:235:1: entryRuleRemoteBinding returns [EObject current=null] : iv_ruleRemoteBinding= ruleRemoteBinding EOF ;
    public final EObject entryRuleRemoteBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoteBinding = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:236:2: (iv_ruleRemoteBinding= ruleRemoteBinding EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:237:2: iv_ruleRemoteBinding= ruleRemoteBinding EOF
            {
             newCompositeNode(grammarAccess.getRemoteBindingRule()); 
            pushFollow(FOLLOW_ruleRemoteBinding_in_entryRuleRemoteBinding488);
            iv_ruleRemoteBinding=ruleRemoteBinding();

            state._fsp--;

             current =iv_ruleRemoteBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRemoteBinding498); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:244:1: ruleRemoteBinding returns [EObject current=null] : (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_protocol_2_0= RULE_PROTOCOL ) ) ( (lv_host_3_0= ruleQUALIFIEDNAME ) ) ( (lv_port_4_0= RULE_INT ) ) ( (lv_path_5_0= ruleURI ) ) ( (lv_processid_6_0= ruleQUALIFIEDNAME ) ) otherlv_7= 'to' ( (lv_handle_8_0= ruleQUALIFIEDID ) ) ) ;
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
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:247:28: ( (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_protocol_2_0= RULE_PROTOCOL ) ) ( (lv_host_3_0= ruleQUALIFIEDNAME ) ) ( (lv_port_4_0= RULE_INT ) ) ( (lv_path_5_0= ruleURI ) ) ( (lv_processid_6_0= ruleQUALIFIEDNAME ) ) otherlv_7= 'to' ( (lv_handle_8_0= ruleQUALIFIEDID ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:248:1: (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_protocol_2_0= RULE_PROTOCOL ) ) ( (lv_host_3_0= ruleQUALIFIEDNAME ) ) ( (lv_port_4_0= RULE_INT ) ) ( (lv_path_5_0= ruleURI ) ) ( (lv_processid_6_0= ruleQUALIFIEDNAME ) ) otherlv_7= 'to' ( (lv_handle_8_0= ruleQUALIFIEDID ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:248:1: (otherlv_0= 'bind' otherlv_1= 'process' ( (lv_protocol_2_0= RULE_PROTOCOL ) ) ( (lv_host_3_0= ruleQUALIFIEDNAME ) ) ( (lv_port_4_0= RULE_INT ) ) ( (lv_path_5_0= ruleURI ) ) ( (lv_processid_6_0= ruleQUALIFIEDNAME ) ) otherlv_7= 'to' ( (lv_handle_8_0= ruleQUALIFIEDID ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:248:3: otherlv_0= 'bind' otherlv_1= 'process' ( (lv_protocol_2_0= RULE_PROTOCOL ) ) ( (lv_host_3_0= ruleQUALIFIEDNAME ) ) ( (lv_port_4_0= RULE_INT ) ) ( (lv_path_5_0= ruleURI ) ) ( (lv_processid_6_0= ruleQUALIFIEDNAME ) ) otherlv_7= 'to' ( (lv_handle_8_0= ruleQUALIFIEDID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleRemoteBinding535); 

                	newLeafNode(otherlv_0, grammarAccess.getRemoteBindingAccess().getBindKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleRemoteBinding547); 

                	newLeafNode(otherlv_1, grammarAccess.getRemoteBindingAccess().getProcessKeyword_1());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:256:1: ( (lv_protocol_2_0= RULE_PROTOCOL ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:257:1: (lv_protocol_2_0= RULE_PROTOCOL )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:257:1: (lv_protocol_2_0= RULE_PROTOCOL )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:258:3: lv_protocol_2_0= RULE_PROTOCOL
            {
            lv_protocol_2_0=(Token)match(input,RULE_PROTOCOL,FOLLOW_RULE_PROTOCOL_in_ruleRemoteBinding564); 

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

            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:274:2: ( (lv_host_3_0= ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:275:1: (lv_host_3_0= ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:275:1: (lv_host_3_0= ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:276:3: lv_host_3_0= ruleQUALIFIEDNAME
            {
             
            	        newCompositeNode(grammarAccess.getRemoteBindingAccess().getHostQUALIFIEDNAMEParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_ruleRemoteBinding590);
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

            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:292:2: ( (lv_port_4_0= RULE_INT ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:293:1: (lv_port_4_0= RULE_INT )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:293:1: (lv_port_4_0= RULE_INT )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:294:3: lv_port_4_0= RULE_INT
            {
            lv_port_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRemoteBinding607); 

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

            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:310:2: ( (lv_path_5_0= ruleURI ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:311:1: (lv_path_5_0= ruleURI )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:311:1: (lv_path_5_0= ruleURI )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:312:3: lv_path_5_0= ruleURI
            {
             
            	        newCompositeNode(grammarAccess.getRemoteBindingAccess().getPathURIParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleRemoteBinding633);
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

            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:328:2: ( (lv_processid_6_0= ruleQUALIFIEDNAME ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:329:1: (lv_processid_6_0= ruleQUALIFIEDNAME )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:329:1: (lv_processid_6_0= ruleQUALIFIEDNAME )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:330:3: lv_processid_6_0= ruleQUALIFIEDNAME
            {
             
            	        newCompositeNode(grammarAccess.getRemoteBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_ruleRemoteBinding654);
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

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleRemoteBinding666); 

                	newLeafNode(otherlv_7, grammarAccess.getRemoteBindingAccess().getToKeyword_7());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:350:1: ( (lv_handle_8_0= ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:351:1: (lv_handle_8_0= ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:351:1: (lv_handle_8_0= ruleQUALIFIEDID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:352:3: lv_handle_8_0= ruleQUALIFIEDID
            {
             
            	        newCompositeNode(grammarAccess.getRemoteBindingAccess().getHandleQUALIFIEDIDParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_ruleRemoteBinding687);
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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:376:1: entryRuleExecuteStatement returns [EObject current=null] : iv_ruleExecuteStatement= ruleExecuteStatement EOF ;
    public final EObject entryRuleExecuteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteStatement = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:377:2: (iv_ruleExecuteStatement= ruleExecuteStatement EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:378:2: iv_ruleExecuteStatement= ruleExecuteStatement EOF
            {
             newCompositeNode(grammarAccess.getExecuteStatementRule()); 
            pushFollow(FOLLOW_ruleExecuteStatement_in_entryRuleExecuteStatement723);
            iv_ruleExecuteStatement=ruleExecuteStatement();

            state._fsp--;

             current =iv_ruleExecuteStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecuteStatement733); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:385:1: ruleExecuteStatement returns [EObject current=null] : (otherlv_0= 'execute' ( (lv_handle_1_0= ruleQUALIFIEDID ) ) otherlv_2= 'with' ( (lv_execinputs_3_0= ruleExecInput ) )* otherlv_4= 'store' ( (lv_execoutputs_5_0= ruleExecOutput ) )* ) ;
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
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:388:28: ( (otherlv_0= 'execute' ( (lv_handle_1_0= ruleQUALIFIEDID ) ) otherlv_2= 'with' ( (lv_execinputs_3_0= ruleExecInput ) )* otherlv_4= 'store' ( (lv_execoutputs_5_0= ruleExecOutput ) )* ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:389:1: (otherlv_0= 'execute' ( (lv_handle_1_0= ruleQUALIFIEDID ) ) otherlv_2= 'with' ( (lv_execinputs_3_0= ruleExecInput ) )* otherlv_4= 'store' ( (lv_execoutputs_5_0= ruleExecOutput ) )* )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:389:1: (otherlv_0= 'execute' ( (lv_handle_1_0= ruleQUALIFIEDID ) ) otherlv_2= 'with' ( (lv_execinputs_3_0= ruleExecInput ) )* otherlv_4= 'store' ( (lv_execoutputs_5_0= ruleExecOutput ) )* )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:389:3: otherlv_0= 'execute' ( (lv_handle_1_0= ruleQUALIFIEDID ) ) otherlv_2= 'with' ( (lv_execinputs_3_0= ruleExecInput ) )* otherlv_4= 'store' ( (lv_execoutputs_5_0= ruleExecOutput ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleExecuteStatement770); 

                	newLeafNode(otherlv_0, grammarAccess.getExecuteStatementAccess().getExecuteKeyword_0());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:393:1: ( (lv_handle_1_0= ruleQUALIFIEDID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:394:1: (lv_handle_1_0= ruleQUALIFIEDID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:394:1: (lv_handle_1_0= ruleQUALIFIEDID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:395:3: lv_handle_1_0= ruleQUALIFIEDID
            {
             
            	        newCompositeNode(grammarAccess.getExecuteStatementAccess().getHandleQUALIFIEDIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_ruleExecuteStatement791);
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleExecuteStatement803); 

                	newLeafNode(otherlv_2, grammarAccess.getExecuteStatementAccess().getWithKeyword_2());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:415:1: ( (lv_execinputs_3_0= ruleExecInput ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_IN_REFERENCE_HANDLE||LA3_0==RULE_VAR_REFERENCE_HANDLE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:416:1: (lv_execinputs_3_0= ruleExecInput )
            	    {
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:416:1: (lv_execinputs_3_0= ruleExecInput )
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:417:3: lv_execinputs_3_0= ruleExecInput
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExecuteStatementAccess().getExecinputsExecInputParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExecInput_in_ruleExecuteStatement824);
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleExecuteStatement837); 

                	newLeafNode(otherlv_4, grammarAccess.getExecuteStatementAccess().getStoreKeyword_4());
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:437:1: ( (lv_execoutputs_5_0= ruleExecOutput ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:438:1: (lv_execoutputs_5_0= ruleExecOutput )
            	    {
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:438:1: (lv_execoutputs_5_0= ruleExecOutput )
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:439:3: lv_execoutputs_5_0= ruleExecOutput
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExecuteStatementAccess().getExecoutputsExecOutputParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExecOutput_in_ruleExecuteStatement858);
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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:463:1: entryRuleExecInput returns [EObject current=null] : iv_ruleExecInput= ruleExecInput EOF ;
    public final EObject entryRuleExecInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecInput = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:464:2: (iv_ruleExecInput= ruleExecInput EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:465:2: iv_ruleExecInput= ruleExecInput EOF
            {
             newCompositeNode(grammarAccess.getExecInputRule()); 
            pushFollow(FOLLOW_ruleExecInput_in_entryRuleExecInput895);
            iv_ruleExecInput=ruleExecInput();

            state._fsp--;

             current =iv_ruleExecInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecInput905); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:472:1: ruleExecInput returns [EObject current=null] : ( ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) ) | ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) ) ) ;
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
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:475:28: ( ( ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) ) | ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:476:1: ( ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) ) | ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:476:1: ( ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) ) | ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) ) )
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
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:476:2: ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:476:2: ( ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:476:3: ( (lv_reference_0_0= ruleIN_REFERENCE ) ) otherlv_1= 'as' ( (lv_wpsid_2_0= RULE_ID ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:476:3: ( (lv_reference_0_0= ruleIN_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:477:1: (lv_reference_0_0= ruleIN_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:477:1: (lv_reference_0_0= ruleIN_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:478:3: lv_reference_0_0= ruleIN_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getExecInputAccess().getReferenceIN_REFERENCEParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIN_REFERENCE_in_ruleExecInput952);
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

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleExecInput964); 

                        	newLeafNode(otherlv_1, grammarAccess.getExecInputAccess().getAsKeyword_0_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:498:1: ( (lv_wpsid_2_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:499:1: (lv_wpsid_2_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:499:1: (lv_wpsid_2_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:500:3: lv_wpsid_2_0= RULE_ID
                    {
                    lv_wpsid_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecInput981); 

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
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:517:6: ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:517:6: ( ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:517:7: ( (lv_reference_3_0= ruleVAR_REFERENCE ) ) otherlv_4= 'as' ( (lv_wpsid_5_0= RULE_ID ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:517:7: ( (lv_reference_3_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:518:1: (lv_reference_3_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:518:1: (lv_reference_3_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:519:3: lv_reference_3_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getExecInputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleExecInput1015);
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

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleExecInput1027); 

                        	newLeafNode(otherlv_4, grammarAccess.getExecInputAccess().getAsKeyword_1_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:539:1: ( (lv_wpsid_5_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:540:1: (lv_wpsid_5_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:540:1: (lv_wpsid_5_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:541:3: lv_wpsid_5_0= RULE_ID
                    {
                    lv_wpsid_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecInput1044); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:565:1: entryRuleExecOutput returns [EObject current=null] : iv_ruleExecOutput= ruleExecOutput EOF ;
    public final EObject entryRuleExecOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecOutput = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:566:2: (iv_ruleExecOutput= ruleExecOutput EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:567:2: iv_ruleExecOutput= ruleExecOutput EOF
            {
             newCompositeNode(grammarAccess.getExecOutputRule()); 
            pushFollow(FOLLOW_ruleExecOutput_in_entryRuleExecOutput1086);
            iv_ruleExecOutput=ruleExecOutput();

            state._fsp--;

             current =iv_ruleExecOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecOutput1096); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:574:1: ruleExecOutput returns [EObject current=null] : ( ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) ) | ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) ) ) ;
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
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:577:28: ( ( ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) ) | ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:578:1: ( ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) ) | ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:578:1: ( ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) ) | ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==21) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==RULE_VAR_REFERENCE_HANDLE) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==RULE_OUT_REFERENCE_HANDLE) ) {
                        alt6=1;
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
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:578:2: ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:578:2: ( ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:578:3: ( (lv_wpsid_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_reference_2_0= ruleOUT_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:578:3: ( (lv_wpsid_0_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:579:1: (lv_wpsid_0_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:579:1: (lv_wpsid_0_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:580:3: lv_wpsid_0_0= RULE_ID
                    {
                    lv_wpsid_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecOutput1139); 

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

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleExecOutput1156); 

                        	newLeafNode(otherlv_1, grammarAccess.getExecOutputAccess().getAsKeyword_0_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:600:1: ( (lv_reference_2_0= ruleOUT_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:601:1: (lv_reference_2_0= ruleOUT_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:601:1: (lv_reference_2_0= ruleOUT_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:602:3: lv_reference_2_0= ruleOUT_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getExecOutputAccess().getReferenceOUT_REFERENCEParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOUT_REFERENCE_in_ruleExecOutput1177);
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
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:619:6: ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:619:6: ( ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:619:7: ( (lv_wpsid_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_reference_5_0= ruleVAR_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:619:7: ( (lv_wpsid_3_0= RULE_ID ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:620:1: (lv_wpsid_3_0= RULE_ID )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:620:1: (lv_wpsid_3_0= RULE_ID )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:621:3: lv_wpsid_3_0= RULE_ID
                    {
                    lv_wpsid_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecOutput1202); 

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

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleExecOutput1219); 

                        	newLeafNode(otherlv_4, grammarAccess.getExecOutputAccess().getAsKeyword_1_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:641:1: ( (lv_reference_5_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:642:1: (lv_reference_5_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:642:1: (lv_reference_5_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:643:3: lv_reference_5_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getExecOutputAccess().getReferenceVAR_REFERENCEParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleExecOutput1240);
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


    // $ANTLR start "entryRuleAssignment"
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:667:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:668:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:669:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1277);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1287); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:676:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) ) ) ;
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
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:679:28: ( ( ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:680:1: ( ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:680:1: ( ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:680:2: ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:680:2: ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:680:3: ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:680:3: ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:681:1: (lv_lefthand_0_0= ruleOUT_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:681:1: (lv_lefthand_0_0= ruleOUT_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:682:3: lv_lefthand_0_0= ruleOUT_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOUT_REFERENCE_in_ruleAssignment1334);
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

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAssignment1346); 

                        	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:702:1: ( (lv_righthand_2_0= ruleIN_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:703:1: (lv_righthand_2_0= ruleIN_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:703:1: (lv_righthand_2_0= ruleIN_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:704:3: lv_righthand_2_0= ruleIN_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getRighthandIN_REFERENCEParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIN_REFERENCE_in_ruleAssignment1367);
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
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:721:6: ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:721:6: ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:721:7: ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:721:7: ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:722:1: (lv_lefthand_3_0= ruleOUT_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:722:1: (lv_lefthand_3_0= ruleOUT_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:723:3: lv_lefthand_3_0= ruleOUT_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getLefthandOUT_REFERENCEParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOUT_REFERENCE_in_ruleAssignment1396);
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

                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAssignment1408); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:743:1: ( (lv_righthand_5_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:744:1: (lv_righthand_5_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:744:1: (lv_righthand_5_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:745:3: lv_righthand_5_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getRighthandVAR_REFERENCEParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment1429);
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
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:762:6: ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:762:6: ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:762:7: ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:762:7: ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:763:1: (lv_lefthand_6_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:763:1: (lv_lefthand_6_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:764:3: lv_lefthand_6_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment1458);
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

                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleAssignment1470); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:784:1: ( (lv_val_s_8_0= RULE_STRING ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:785:1: (lv_val_s_8_0= RULE_STRING )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:785:1: (lv_val_s_8_0= RULE_STRING )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:786:3: lv_val_s_8_0= RULE_STRING
                    {
                    lv_val_s_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignment1487); 

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
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:803:6: ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:803:6: ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:803:7: ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:803:7: ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:804:1: (lv_lefthand_9_0= ruleVAR_REFERENCE )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:804:1: (lv_lefthand_9_0= ruleVAR_REFERENCE )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:805:3: lv_lefthand_9_0= ruleVAR_REFERENCE
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getLefthandVAR_REFERENCEParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment1521);
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

                    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleAssignment1533); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_3_1());
                        
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:825:1: ( (lv_val_i_11_0= RULE_INT ) )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:826:1: (lv_val_i_11_0= RULE_INT )
                    {
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:826:1: (lv_val_i_11_0= RULE_INT )
                    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:827:3: lv_val_i_11_0= RULE_INT
                    {
                    lv_val_i_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAssignment1550); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:851:1: entryRuleIN_REFERENCE returns [EObject current=null] : iv_ruleIN_REFERENCE= ruleIN_REFERENCE EOF ;
    public final EObject entryRuleIN_REFERENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIN_REFERENCE = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:852:2: (iv_ruleIN_REFERENCE= ruleIN_REFERENCE EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:853:2: iv_ruleIN_REFERENCE= ruleIN_REFERENCE EOF
            {
             newCompositeNode(grammarAccess.getIN_REFERENCERule()); 
            pushFollow(FOLLOW_ruleIN_REFERENCE_in_entryRuleIN_REFERENCE1592);
            iv_ruleIN_REFERENCE=ruleIN_REFERENCE();

            state._fsp--;

             current =iv_ruleIN_REFERENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIN_REFERENCE1602); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:860:1: ruleIN_REFERENCE returns [EObject current=null] : (this_IN_REFERENCE_HANDLE_0= RULE_IN_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIN_REFERENCE() throws RecognitionException {
        EObject current = null;

        Token this_IN_REFERENCE_HANDLE_0=null;
        Token lv_refname_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:863:28: ( (this_IN_REFERENCE_HANDLE_0= RULE_IN_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:864:1: (this_IN_REFERENCE_HANDLE_0= RULE_IN_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:864:1: (this_IN_REFERENCE_HANDLE_0= RULE_IN_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:864:2: this_IN_REFERENCE_HANDLE_0= RULE_IN_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) )
            {
            this_IN_REFERENCE_HANDLE_0=(Token)match(input,RULE_IN_REFERENCE_HANDLE,FOLLOW_RULE_IN_REFERENCE_HANDLE_in_ruleIN_REFERENCE1638); 
             
                newLeafNode(this_IN_REFERENCE_HANDLE_0, grammarAccess.getIN_REFERENCEAccess().getIN_REFERENCE_HANDLETerminalRuleCall_0()); 
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:868:1: ( (lv_refname_1_0= RULE_ID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:869:1: (lv_refname_1_0= RULE_ID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:869:1: (lv_refname_1_0= RULE_ID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:870:3: lv_refname_1_0= RULE_ID
            {
            lv_refname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIN_REFERENCE1654); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:894:1: entryRuleOUT_REFERENCE returns [EObject current=null] : iv_ruleOUT_REFERENCE= ruleOUT_REFERENCE EOF ;
    public final EObject entryRuleOUT_REFERENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOUT_REFERENCE = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:895:2: (iv_ruleOUT_REFERENCE= ruleOUT_REFERENCE EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:896:2: iv_ruleOUT_REFERENCE= ruleOUT_REFERENCE EOF
            {
             newCompositeNode(grammarAccess.getOUT_REFERENCERule()); 
            pushFollow(FOLLOW_ruleOUT_REFERENCE_in_entryRuleOUT_REFERENCE1695);
            iv_ruleOUT_REFERENCE=ruleOUT_REFERENCE();

            state._fsp--;

             current =iv_ruleOUT_REFERENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOUT_REFERENCE1705); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:903:1: ruleOUT_REFERENCE returns [EObject current=null] : (this_OUT_REFERENCE_HANDLE_0= RULE_OUT_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOUT_REFERENCE() throws RecognitionException {
        EObject current = null;

        Token this_OUT_REFERENCE_HANDLE_0=null;
        Token lv_refname_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:906:28: ( (this_OUT_REFERENCE_HANDLE_0= RULE_OUT_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:907:1: (this_OUT_REFERENCE_HANDLE_0= RULE_OUT_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:907:1: (this_OUT_REFERENCE_HANDLE_0= RULE_OUT_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:907:2: this_OUT_REFERENCE_HANDLE_0= RULE_OUT_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) )
            {
            this_OUT_REFERENCE_HANDLE_0=(Token)match(input,RULE_OUT_REFERENCE_HANDLE,FOLLOW_RULE_OUT_REFERENCE_HANDLE_in_ruleOUT_REFERENCE1741); 
             
                newLeafNode(this_OUT_REFERENCE_HANDLE_0, grammarAccess.getOUT_REFERENCEAccess().getOUT_REFERENCE_HANDLETerminalRuleCall_0()); 
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:911:1: ( (lv_refname_1_0= RULE_ID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:912:1: (lv_refname_1_0= RULE_ID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:912:1: (lv_refname_1_0= RULE_ID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:913:3: lv_refname_1_0= RULE_ID
            {
            lv_refname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOUT_REFERENCE1757); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:937:1: entryRuleVAR_REFERENCE returns [EObject current=null] : iv_ruleVAR_REFERENCE= ruleVAR_REFERENCE EOF ;
    public final EObject entryRuleVAR_REFERENCE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAR_REFERENCE = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:938:2: (iv_ruleVAR_REFERENCE= ruleVAR_REFERENCE EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:939:2: iv_ruleVAR_REFERENCE= ruleVAR_REFERENCE EOF
            {
             newCompositeNode(grammarAccess.getVAR_REFERENCERule()); 
            pushFollow(FOLLOW_ruleVAR_REFERENCE_in_entryRuleVAR_REFERENCE1798);
            iv_ruleVAR_REFERENCE=ruleVAR_REFERENCE();

            state._fsp--;

             current =iv_ruleVAR_REFERENCE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAR_REFERENCE1808); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:946:1: ruleVAR_REFERENCE returns [EObject current=null] : (this_VAR_REFERENCE_HANDLE_0= RULE_VAR_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVAR_REFERENCE() throws RecognitionException {
        EObject current = null;

        Token this_VAR_REFERENCE_HANDLE_0=null;
        Token lv_refname_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:949:28: ( (this_VAR_REFERENCE_HANDLE_0= RULE_VAR_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:950:1: (this_VAR_REFERENCE_HANDLE_0= RULE_VAR_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:950:1: (this_VAR_REFERENCE_HANDLE_0= RULE_VAR_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:950:2: this_VAR_REFERENCE_HANDLE_0= RULE_VAR_REFERENCE_HANDLE ( (lv_refname_1_0= RULE_ID ) )
            {
            this_VAR_REFERENCE_HANDLE_0=(Token)match(input,RULE_VAR_REFERENCE_HANDLE,FOLLOW_RULE_VAR_REFERENCE_HANDLE_in_ruleVAR_REFERENCE1844); 
             
                newLeafNode(this_VAR_REFERENCE_HANDLE_0, grammarAccess.getVAR_REFERENCEAccess().getVAR_REFERENCE_HANDLETerminalRuleCall_0()); 
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:954:1: ( (lv_refname_1_0= RULE_ID ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:955:1: (lv_refname_1_0= RULE_ID )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:955:1: (lv_refname_1_0= RULE_ID )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:956:3: lv_refname_1_0= RULE_ID
            {
            lv_refname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVAR_REFERENCE1860); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:980:1: entryRuleQUALIFIEDNAME returns [String current=null] : iv_ruleQUALIFIEDNAME= ruleQUALIFIEDNAME EOF ;
    public final String entryRuleQUALIFIEDNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUALIFIEDNAME = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:981:2: (iv_ruleQUALIFIEDNAME= ruleQUALIFIEDNAME EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:982:2: iv_ruleQUALIFIEDNAME= ruleQUALIFIEDNAME EOF
            {
             newCompositeNode(grammarAccess.getQUALIFIEDNAMERule()); 
            pushFollow(FOLLOW_ruleQUALIFIEDNAME_in_entryRuleQUALIFIEDNAME1902);
            iv_ruleQUALIFIEDNAME=ruleQUALIFIEDNAME();

            state._fsp--;

             current =iv_ruleQUALIFIEDNAME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDNAME1913); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:989:1: ruleQUALIFIEDNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQUALIFIEDNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:992:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:993:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:993:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:993:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME1953); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1000:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1001:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleQUALIFIEDNAME1972); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQUALIFIEDNAMEAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME1987); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQUALIFIEDNAMEAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1021:1: entryRuleQUALIFIEDID returns [String current=null] : iv_ruleQUALIFIEDID= ruleQUALIFIEDID EOF ;
    public final String entryRuleQUALIFIEDID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUALIFIEDID = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1022:2: (iv_ruleQUALIFIEDID= ruleQUALIFIEDID EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1023:2: iv_ruleQUALIFIEDID= ruleQUALIFIEDID EOF
            {
             newCompositeNode(grammarAccess.getQUALIFIEDIDRule()); 
            pushFollow(FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID2035);
            iv_ruleQUALIFIEDID=ruleQUALIFIEDID();

            state._fsp--;

             current =iv_ruleQUALIFIEDID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIEDID2046); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1030:1: ruleQUALIFIEDID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQUALIFIEDID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1033:28: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1034:1: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1034:1: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1034:6: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDID2086); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1041:1: (kw= '/' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1042:2: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleQUALIFIEDID2105); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQUALIFIEDIDAccess().getSolidusKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIEDID2120); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQUALIFIEDIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1062:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1063:2: (iv_ruleURI= ruleURI EOF )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1064:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI2168);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI2179); 

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
    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1071:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1074:28: ( (kw= '/' this_ID_1= RULE_ID )* )
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1075:1: (kw= '/' this_ID_1= RULE_ID )*
            {
            // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1075:1: (kw= '/' this_ID_1= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.hsos.richwps.lang/src-gen/de/hsos/richwps/parser/antlr/internal/InternalDSL.g:1076:2: kw= '/' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleURI2217); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getURIAccess().getSolidusKeyword_0()); 
            	        
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI2232); 

            	    		current.merge(this_ID_1);
            	        
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getURIAccess().getIDTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
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
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\1\11\2\6\2\26\1\10\1\5\4\uffff";
    static final String DFA7_maxS =
        "\1\12\2\6\2\26\1\12\1\7\4\uffff";
    static final String DFA7_acceptS =
        "\7\uffff\1\2\1\1\1\4\1\3";
    static final String DFA7_specialS =
        "\13\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\10\1\uffff\1\7",
            "\1\11\1\uffff\1\12",
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
            return "680:1: ( ( ( (lv_lefthand_0_0= ruleOUT_REFERENCE ) ) otherlv_1= '=' ( (lv_righthand_2_0= ruleIN_REFERENCE ) ) ) | ( ( (lv_lefthand_3_0= ruleOUT_REFERENCE ) ) otherlv_4= '=' ( (lv_righthand_5_0= ruleVAR_REFERENCE ) ) ) | ( ( (lv_lefthand_6_0= ruleVAR_REFERENCE ) ) otherlv_7= '=' ( (lv_val_s_8_0= RULE_STRING ) ) ) | ( ( (lv_lefthand_9_0= ruleVAR_REFERENCE ) ) otherlv_10= '=' ( (lv_val_i_11_0= RULE_INT ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleWorksequence_in_entryRuleWorksequence75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorksequence85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleWorksequence130 = new BitSet(new long[]{0x0000000000048602L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalBinding_in_ruleOperation223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemoteBinding_in_ruleOperation250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleOperation277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_ruleOperation304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalBinding_in_entryRuleLocalBinding339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalBinding349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLocalBinding386 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLocalBinding398 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_ruleLocalBinding419 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLocalBinding431 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_ruleLocalBinding452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRemoteBinding_in_entryRuleRemoteBinding488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRemoteBinding498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRemoteBinding535 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRemoteBinding547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PROTOCOL_in_ruleRemoteBinding564 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_ruleRemoteBinding590 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRemoteBinding607 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_ruleURI_in_ruleRemoteBinding633 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_ruleRemoteBinding654 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRemoteBinding666 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_ruleRemoteBinding687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecuteStatement_in_entryRuleExecuteStatement723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecuteStatement733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExecuteStatement770 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_ruleExecuteStatement791 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExecuteStatement803 = new BitSet(new long[]{0x0000000000100500L});
    public static final BitSet FOLLOW_ruleExecInput_in_ruleExecuteStatement824 = new BitSet(new long[]{0x0000000000100500L});
    public static final BitSet FOLLOW_20_in_ruleExecuteStatement837 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleExecOutput_in_ruleExecuteStatement858 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleExecInput_in_entryRuleExecInput895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecInput905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_ruleExecInput952 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecInput964 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecInput981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleExecInput1015 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecInput1027 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecInput1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecOutput_in_entryRuleExecOutput1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecOutput1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecOutput1139 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecOutput1156 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_ruleExecOutput1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecOutput1202 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExecOutput1219 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleExecOutput1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_ruleAssignment1334 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssignment1346 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_ruleAssignment1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_ruleAssignment1396 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssignment1408 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment1458 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssignment1470 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_ruleAssignment1521 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssignment1533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAssignment1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIN_REFERENCE_in_entryRuleIN_REFERENCE1592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIN_REFERENCE1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IN_REFERENCE_HANDLE_in_ruleIN_REFERENCE1638 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIN_REFERENCE1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOUT_REFERENCE_in_entryRuleOUT_REFERENCE1695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOUT_REFERENCE1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OUT_REFERENCE_HANDLE_in_ruleOUT_REFERENCE1741 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOUT_REFERENCE1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_REFERENCE_in_entryRuleVAR_REFERENCE1798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAR_REFERENCE1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_REFERENCE_HANDLE_in_ruleVAR_REFERENCE1844 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVAR_REFERENCE1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDNAME_in_entryRuleQUALIFIEDNAME1902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDNAME1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME1953 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQUALIFIEDNAME1972 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDNAME1987 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleQUALIFIEDID_in_entryRuleQUALIFIEDID2035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIEDID2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDID2086 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleQUALIFIEDID2105 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIEDID2120 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI2168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleURI2217 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI2232 = new BitSet(new long[]{0x0000000001000002L});

}