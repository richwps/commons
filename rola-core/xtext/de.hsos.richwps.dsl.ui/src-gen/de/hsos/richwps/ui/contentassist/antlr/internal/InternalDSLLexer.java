package de.hsos.richwps.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int RULE_OUT_REFERENCE_HANDLE=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_VAR_REFERENCE_HANDLE=6;
    public static final int T__19=19;
    public static final int RULE_STRING=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int RULE_PROTOCOL=8;
    public static final int T__18=18;
    public static final int RULE_IN_REFERENCE_HANDLE=4;
    public static final int T__17=17;
    public static final int RULE_INT=9;
    public static final int RULE_WS=13;

    // delegates
    // delegators

    public InternalDSLLexer() {;} 
    public InternalDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:11:7: ( 'bind' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:11:9: 'bind'
            {
            match("bind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:12:7: ( 'process' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:12:9: 'process'
            {
            match("process"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:13:7: ( 'to' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:13:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:14:7: ( 'execute' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:14:9: 'execute'
            {
            match("execute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:15:7: ( 'with' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:15:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:16:7: ( 'store' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:16:9: 'store'
            {
            match("store"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:17:7: ( 'as' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:17:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:18:7: ( '=' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:19:7: ( '.' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:19:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:20:7: ( '/' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:20:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_IN_REFERENCE_HANDLE"
    public final void mRULE_IN_REFERENCE_HANDLE() throws RecognitionException {
        try {
            int _type = RULE_IN_REFERENCE_HANDLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2914:26: ( ( 'in.' | 'IN.' ) )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2914:28: ( 'in.' | 'IN.' )
            {
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2914:28: ( 'in.' | 'IN.' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='i') ) {
                alt1=1;
            }
            else if ( (LA1_0=='I') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2914:29: 'in.'
                    {
                    match("in."); 


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2914:35: 'IN.'
                    {
                    match("IN."); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_REFERENCE_HANDLE"

    // $ANTLR start "RULE_VAR_REFERENCE_HANDLE"
    public final void mRULE_VAR_REFERENCE_HANDLE() throws RecognitionException {
        try {
            int _type = RULE_VAR_REFERENCE_HANDLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2916:27: ( ( 'var.' | 'VAR.' ) )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2916:29: ( 'var.' | 'VAR.' )
            {
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2916:29: ( 'var.' | 'VAR.' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='v') ) {
                alt2=1;
            }
            else if ( (LA2_0=='V') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2916:30: 'var.'
                    {
                    match("var."); 


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2916:37: 'VAR.'
                    {
                    match("VAR."); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VAR_REFERENCE_HANDLE"

    // $ANTLR start "RULE_OUT_REFERENCE_HANDLE"
    public final void mRULE_OUT_REFERENCE_HANDLE() throws RecognitionException {
        try {
            int _type = RULE_OUT_REFERENCE_HANDLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2918:27: ( ( 'out.' | 'OUT.' ) )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2918:29: ( 'out.' | 'OUT.' )
            {
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2918:29: ( 'out.' | 'OUT.' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='o') ) {
                alt3=1;
            }
            else if ( (LA3_0=='O') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2918:30: 'out.'
                    {
                    match("out."); 


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2918:37: 'OUT.'
                    {
                    match("OUT."); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OUT_REFERENCE_HANDLE"

    // $ANTLR start "RULE_PROTOCOL"
    public final void mRULE_PROTOCOL() throws RecognitionException {
        try {
            int _type = RULE_PROTOCOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2920:15: ( ( 'http' | 'https' ) )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2920:17: ( 'http' | 'https' )
            {
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2920:17: ( 'http' | 'https' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='h') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='t') ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2=='t') ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3=='p') ) {
                            int LA4_4 = input.LA(5);

                            if ( (LA4_4=='s') ) {
                                alt4=2;
                            }
                            else {
                                alt4=1;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2920:18: 'http'
                    {
                    match("http"); 


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2920:25: 'https'
                    {
                    match("https"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROTOCOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2922:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2922:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2922:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2922:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2922:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2924:10: ( ( '0' .. '9' )+ )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2924:12: ( '0' .. '9' )+
            {
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2924:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2924:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2926:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2928:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2928:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2928:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2928:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2930:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2930:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2930:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2930:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2930:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2930:41: ( '\\r' )? '\\n'
                    {
                    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2930:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2930:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2932:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2932:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2932:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2934:16: ( . )
            // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:2934:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_IN_REFERENCE_HANDLE | RULE_VAR_REFERENCE_HANDLE | RULE_OUT_REFERENCE_HANDLE | RULE_PROTOCOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=21;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:70: RULE_IN_REFERENCE_HANDLE
                {
                mRULE_IN_REFERENCE_HANDLE(); 

                }
                break;
            case 12 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:95: RULE_VAR_REFERENCE_HANDLE
                {
                mRULE_VAR_REFERENCE_HANDLE(); 

                }
                break;
            case 13 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:121: RULE_OUT_REFERENCE_HANDLE
                {
                mRULE_OUT_REFERENCE_HANDLE(); 

                }
                break;
            case 14 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:147: RULE_PROTOCOL
                {
                mRULE_PROTOCOL(); 

                }
                break;
            case 15 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:161: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:169: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:178: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:190: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:206: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:222: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // ../de.hsos.richwps.dsl.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:230: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\7\32\2\uffff\1\45\7\32\1\30\2\uffff\2\30\2\uffff\1\32\1"+
        "\uffff\1\32\1\62\3\32\1\66\5\uffff\7\32\3\uffff\2\32\1\uffff\3\32"+
        "\2\uffff\5\32\1\105\2\32\1\110\1\32\2\uffff\1\113\1\uffff\2\32\1"+
        "\uffff\1\116\1\113\1\uffff\2\32\1\uffff\1\121\1\122\2\uffff";
    static final String DFA16_eofS =
        "\123\uffff";
    static final String DFA16_minS =
        "\1\0\1\151\1\162\1\157\1\170\1\151\1\164\1\163\2\uffff\1\52\1\156"+
        "\1\116\1\141\1\101\1\165\1\125\1\164\1\101\2\uffff\2\0\2\uffff\1"+
        "\156\1\uffff\1\157\1\60\1\145\1\164\1\157\1\60\5\uffff\2\56\1\162"+
        "\1\122\1\164\1\124\1\164\3\uffff\1\144\1\143\1\uffff\1\143\1\150"+
        "\1\162\2\uffff\4\56\1\160\1\60\1\145\1\165\1\60\1\145\2\uffff\1"+
        "\60\1\uffff\1\163\1\164\1\uffff\2\60\1\uffff\1\163\1\145\1\uffff"+
        "\2\60\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\151\1\162\1\157\1\170\1\151\1\164\1\163\2\uffff\1\57"+
        "\1\156\1\116\1\141\1\101\1\165\1\125\1\164\1\172\2\uffff\2\uffff"+
        "\2\uffff\1\156\1\uffff\1\157\1\172\1\145\1\164\1\157\1\172\5\uffff"+
        "\2\56\1\162\1\122\1\164\1\124\1\164\3\uffff\1\144\1\143\1\uffff"+
        "\1\143\1\150\1\162\2\uffff\4\56\1\160\1\172\1\145\1\165\1\172\1"+
        "\145\2\uffff\1\172\1\uffff\1\163\1\164\1\uffff\2\172\1\uffff\1\163"+
        "\1\145\1\uffff\2\172\2\uffff";
    static final String DFA16_acceptS =
        "\10\uffff\1\10\1\11\11\uffff\1\17\1\20\2\uffff\1\24\1\25\1\uffff"+
        "\1\17\6\uffff\1\10\1\11\1\22\1\23\1\12\7\uffff\1\20\1\21\1\24\2"+
        "\uffff\1\3\3\uffff\1\7\1\13\12\uffff\1\14\1\15\1\uffff\1\1\2\uffff"+
        "\1\5\2\uffff\1\16\2\uffff\1\6\2\uffff\1\2\1\4";
    static final String DFA16_specialS =
        "\1\1\24\uffff\1\2\1\0\74\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\25\4\30\1\26\6\30\1"+
            "\11\1\12\12\24\3\30\1\10\3\30\10\23\1\14\5\23\1\20\6\23\1\16"+
            "\4\23\3\30\1\22\1\23\1\30\1\7\1\1\2\23\1\4\2\23\1\21\1\13\5"+
            "\23\1\17\1\2\2\23\1\6\1\3\1\23\1\15\1\5\3\23\uff85\30",
            "\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "",
            "",
            "\1\43\4\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\0\56",
            "\0\56",
            "",
            "",
            "\1\60",
            "",
            "\1\61",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\103",
            "\1\104",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\106",
            "\1\107",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\111",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32\1\112\7\32",
            "",
            "\1\114",
            "\1\115",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\117",
            "\1\120",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_IN_REFERENCE_HANDLE | RULE_VAR_REFERENCE_HANDLE | RULE_OUT_REFERENCE_HANDLE | RULE_PROTOCOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_22 = input.LA(1);

                        s = -1;
                        if ( ((LA16_22>='\u0000' && LA16_22<='\uFFFF')) ) {s = 46;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='b') ) {s = 1;}

                        else if ( (LA16_0=='p') ) {s = 2;}

                        else if ( (LA16_0=='t') ) {s = 3;}

                        else if ( (LA16_0=='e') ) {s = 4;}

                        else if ( (LA16_0=='w') ) {s = 5;}

                        else if ( (LA16_0=='s') ) {s = 6;}

                        else if ( (LA16_0=='a') ) {s = 7;}

                        else if ( (LA16_0=='=') ) {s = 8;}

                        else if ( (LA16_0=='.') ) {s = 9;}

                        else if ( (LA16_0=='/') ) {s = 10;}

                        else if ( (LA16_0=='i') ) {s = 11;}

                        else if ( (LA16_0=='I') ) {s = 12;}

                        else if ( (LA16_0=='v') ) {s = 13;}

                        else if ( (LA16_0=='V') ) {s = 14;}

                        else if ( (LA16_0=='o') ) {s = 15;}

                        else if ( (LA16_0=='O') ) {s = 16;}

                        else if ( (LA16_0=='h') ) {s = 17;}

                        else if ( (LA16_0=='^') ) {s = 18;}

                        else if ( ((LA16_0>='A' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='N')||(LA16_0>='P' && LA16_0<='U')||(LA16_0>='W' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='c' && LA16_0<='d')||(LA16_0>='f' && LA16_0<='g')||(LA16_0>='j' && LA16_0<='n')||(LA16_0>='q' && LA16_0<='r')||LA16_0=='u'||(LA16_0>='x' && LA16_0<='z')) ) {s = 19;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 20;}

                        else if ( (LA16_0=='\"') ) {s = 21;}

                        else if ( (LA16_0=='\'') ) {s = 22;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 23;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='-')||(LA16_0>=':' && LA16_0<='<')||(LA16_0>='>' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_21 = input.LA(1);

                        s = -1;
                        if ( ((LA16_21>='\u0000' && LA16_21<='\uFFFF')) ) {s = 46;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}