package compiladores.t4;

import java.io.PrintWriter;
import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
// import compiladores.AlgumaLexer;
import org.antlr.v4.runtime.dfa.DFA;

public class MensagemErro implements ANTLRErrorListener {
    public PrintWriter p;
    static boolean got_error = false; // utilizado para evitar impressões após encontrar primeiro erro
    public MensagemErro(PrintWriter p){
        this.p = p;
    }
    public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, BitSet arg5,
            ATNConfigSet arg6) {
        // TODO Auto-generated method stub
        
    }

    public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, BitSet arg4, ATNConfigSet arg5) {
        // TODO Auto-generated method stub
        
    }

    public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2, int arg3, int arg4, ATNConfigSet arg5) {
        // TODO Auto-generated method stub
        
    }

    public void syntaxError(Recognizer<?, ?> arg0, Object arg1, int arg2, int arg3, String arg4,
            RecognitionException arg5) {
        // TODO Auto-generated method stub
        // Conversão do token stream para token unico
        Token t = (Token) arg1;
        String text = t.getText();
        if(!got_error){
            p.println("Linha " + arg2 + ": erro sintatico proximo a " + text);
            MensagemErro.got_error = true;
        }
    }
    
}