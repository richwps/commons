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
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
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
    public static final int T__18=18;
    public static final int RULE_PROTOCOL=8;
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
    public String getGrammarFileName() { return "../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:11:7: ( 'bind' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:11:9: 'bind'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:12:7: ( 'process' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:12:9: 'process'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:13:7: ( 'to' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:13:9: 'to'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:14:7: ( 'execute' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:14:9: 'execute'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:15:7: ( 'with' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:15:9: 'with'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:16:7: ( 'store' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:16:9: 'store'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:17:7: ( 'as' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:17:9: 'as'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:18:7: ( 'if' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:18:9: 'if'
            {
            match("if"); 


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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:19:7: ( 'end' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:19:9: 'end'
            {
            match("end"); 


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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:20:7: ( 'else' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:20:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:21:7: ( '=' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:22:7: ( '.' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:22:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:23:7: ( '/' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:23:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_IN_REFERENCE_HANDLE"
    public final void mRULE_IN_REFERENCE_HANDLE() throws RecognitionException {
        try {
            int _type = RULE_IN_REFERENCE_HANDLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4828:26: ( ( 'in.' | 'IN.' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4828:28: ( 'in.' | 'IN.' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4828:28: ( 'in.' | 'IN.' )
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
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4828:29: 'in.'
                    {
                    match("in."); 


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4828:35: 'IN.'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4830:27: ( ( 'var.' | 'VAR.' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4830:29: ( 'var.' | 'VAR.' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4830:29: ( 'var.' | 'VAR.' )
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
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4830:30: 'var.'
                    {
                    match("var."); 


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4830:37: 'VAR.'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4832:27: ( ( 'out.' | 'OUT.' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4832:29: ( 'out.' | 'OUT.' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4832:29: ( 'out.' | 'OUT.' )
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
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4832:30: 'out.'
                    {
                    match("out."); 


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4832:37: 'OUT.'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4834:15: ( ( 'http' | 'https' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4834:17: ( 'http' | 'https' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4834:17: ( 'http' | 'https' )
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
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4834:18: 'http'
                    {
                    match("http"); 


                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4834:25: 'https'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4836:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4836:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4836:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4838:10: ( ( '0' .. '9' )+ )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4838:12: ( '0' .. '9' )+
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4838:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4838:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4840:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4842:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4842:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4842:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4842:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4844:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4844:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4844:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4844:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4844:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4844:41: ( '\\r' )? '\\n'
                    {
                    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4844:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4844:41: '\\r'
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4846:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4846:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4846:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4848:16: ( . )
            // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:4848:18: .
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
        // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_IN_REFERENCE_HANDLE | RULE_VAR_REFERENCE_HANDLE | RULE_OUT_REFERENCE_HANDLE | RULE_PROTOCOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=24;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:88: RULE_IN_REFERENCE_HANDLE
                {
                mRULE_IN_REFERENCE_HANDLE(); 

                }
                break;
            case 15 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:113: RULE_VAR_REFERENCE_HANDLE
                {
                mRULE_VAR_REFERENCE_HANDLE(); 

                }
                break;
            case 16 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:139: RULE_OUT_REFERENCE_HANDLE
                {
                mRULE_OUT_REFERENCE_HANDLE(); 

                }
                break;
            case 17 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:165: RULE_PROTOCOL
                {
                mRULE_PROTOCOL(); 

                }
                break;
            case 18 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:179: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:187: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:196: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:208: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:224: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:240: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // ../de.hsos.richwps.lang.ui/src-gen/de/hsos/richwps/ui/contentassist/antlr/internal/InternalDSL.g:1:248: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\10\31\2\uffff\1\50\6\31\2\uffff\2\27\2\uffff\1\31\1\uffff"+
        "\1\31\1\64\5\31\1\72\1\73\1\31\5\uffff\6\31\3\uffff\2\31\1\uffff"+
        "\1\31\1\105\3\31\3\uffff\5\31\1\114\2\31\1\uffff\1\117\1\120\1\31"+
        "\2\uffff\1\123\1\uffff\2\31\2\uffff\1\126\1\123\1\uffff\2\31\1\uffff"+
        "\1\131\1\132\2\uffff";
    static final String DFA15_eofS =
        "\133\uffff";
    static final String DFA15_minS =
        "\1\0\1\151\1\162\1\157\1\154\1\151\1\164\1\163\1\146\2\uffff\1\52"+
        "\1\116\1\141\1\101\1\165\1\125\1\164\2\uffff\2\0\2\uffff\1\156\1"+
        "\uffff\1\157\1\55\1\145\1\144\1\163\1\164\1\157\2\55\1\56\5\uffff"+
        "\1\56\1\162\1\122\1\164\1\124\1\164\3\uffff\1\144\1\143\1\uffff"+
        "\1\143\1\55\1\145\1\150\1\162\3\uffff\4\56\1\160\1\55\1\145\1\165"+
        "\1\uffff\2\55\1\145\2\uffff\1\55\1\uffff\1\163\1\164\2\uffff\2\55"+
        "\1\uffff\1\163\1\145\1\uffff\2\55\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\151\1\162\1\157\1\170\1\151\1\164\1\163\1\156\2\uffff"+
        "\1\57\1\116\1\141\1\101\1\165\1\125\1\164\2\uffff\2\uffff\2\uffff"+
        "\1\156\1\uffff\1\157\1\172\1\145\1\144\1\163\1\164\1\157\2\172\1"+
        "\56\5\uffff\1\56\1\162\1\122\1\164\1\124\1\164\3\uffff\1\144\1\143"+
        "\1\uffff\1\143\1\172\1\145\1\150\1\162\3\uffff\4\56\1\160\1\172"+
        "\1\145\1\165\1\uffff\2\172\1\145\2\uffff\1\172\1\uffff\1\163\1\164"+
        "\2\uffff\2\172\1\uffff\1\163\1\145\1\uffff\2\172\2\uffff";
    static final String DFA15_acceptS =
        "\11\uffff\1\13\1\14\7\uffff\1\22\1\23\2\uffff\1\27\1\30\1\uffff"+
        "\1\22\12\uffff\1\13\1\14\1\25\1\26\1\15\6\uffff\1\23\1\24\1\27\2"+
        "\uffff\1\3\5\uffff\1\7\1\10\1\16\10\uffff\1\11\3\uffff\1\17\1\20"+
        "\1\uffff\1\1\2\uffff\1\12\1\5\2\uffff\1\21\2\uffff\1\6\2\uffff\1"+
        "\2\1\4";
    static final String DFA15_specialS =
        "\1\1\23\uffff\1\2\1\0\105\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\24\4\27\1\25\5\27\1"+
            "\22\1\12\1\13\12\23\3\27\1\11\3\27\10\22\1\14\5\22\1\20\6\22"+
            "\1\16\4\22\4\27\1\22\1\27\1\7\1\1\2\22\1\4\2\22\1\21\1\10\5"+
            "\22\1\17\1\2\2\22\1\6\1\3\1\22\1\15\1\5\3\22\uff85\27",
            "\1\30",
            "\1\32",
            "\1\33",
            "\1\36\1\uffff\1\35\11\uffff\1\34",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42\7\uffff\1\43",
            "",
            "",
            "\1\46\4\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "\0\60",
            "\0\60",
            "",
            "",
            "\1\62",
            "",
            "\1\63",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "\1\111",
            "\1\111",
            "\1\112",
            "\1\112",
            "\1\113",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\115",
            "\1\116",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\121",
            "",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31"+
            "\1\122\7\31",
            "",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\127",
            "\1\130",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_IN_REFERENCE_HANDLE | RULE_VAR_REFERENCE_HANDLE | RULE_OUT_REFERENCE_HANDLE | RULE_PROTOCOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_21 = input.LA(1);

                        s = -1;
                        if ( ((LA15_21>='\u0000' && LA15_21<='\uFFFF')) ) {s = 48;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='b') ) {s = 1;}

                        else if ( (LA15_0=='p') ) {s = 2;}

                        else if ( (LA15_0=='t') ) {s = 3;}

                        else if ( (LA15_0=='e') ) {s = 4;}

                        else if ( (LA15_0=='w') ) {s = 5;}

                        else if ( (LA15_0=='s') ) {s = 6;}

                        else if ( (LA15_0=='a') ) {s = 7;}

                        else if ( (LA15_0=='i') ) {s = 8;}

                        else if ( (LA15_0=='=') ) {s = 9;}

                        else if ( (LA15_0=='.') ) {s = 10;}

                        else if ( (LA15_0=='/') ) {s = 11;}

                        else if ( (LA15_0=='I') ) {s = 12;}

                        else if ( (LA15_0=='v') ) {s = 13;}

                        else if ( (LA15_0=='V') ) {s = 14;}

                        else if ( (LA15_0=='o') ) {s = 15;}

                        else if ( (LA15_0=='O') ) {s = 16;}

                        else if ( (LA15_0=='h') ) {s = 17;}

                        else if ( (LA15_0=='-'||(LA15_0>='A' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='N')||(LA15_0>='P' && LA15_0<='U')||(LA15_0>='W' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='c' && LA15_0<='d')||(LA15_0>='f' && LA15_0<='g')||(LA15_0>='j' && LA15_0<='n')||(LA15_0>='q' && LA15_0<='r')||LA15_0=='u'||(LA15_0>='x' && LA15_0<='z')) ) {s = 18;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 19;}

                        else if ( (LA15_0=='\"') ) {s = 20;}

                        else if ( (LA15_0=='\'') ) {s = 21;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 22;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<=',')||(LA15_0>=':' && LA15_0<='<')||(LA15_0>='>' && LA15_0<='@')||(LA15_0>='[' && LA15_0<='^')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_20 = input.LA(1);

                        s = -1;
                        if ( ((LA15_20>='\u0000' && LA15_20<='\uFFFF')) ) {s = 48;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}