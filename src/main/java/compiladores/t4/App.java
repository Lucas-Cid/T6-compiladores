package compiladores.t4;
import java.io.File;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import compiladores.t4.PokemonParser.ProgramContext;

/**
 * Gabriel de Jesus Dantas 773412
 * BCC
 */
public class App 
{
    public static void main( String[] args )
    {
        try(PrintWriter p = new PrintWriter(new File(args[1]))) {//saida
            CharStream c = CharStreams.fromFileName(args[0]);//entrada
            PokemonLexer lex = new PokemonLexer(c);
            CommonTokenStream cs = new CommonTokenStream(lex); //conversão para token stream
            PokemonParser parser = new PokemonParser(cs);
            parser.removeErrorListeners();
            parser.addErrorListener(new MensagemErro(p));
            ProgramContext arvore = parser.program();
            PokemonSemantico as = new PokemonSemantico();
            if(!MensagemErro.got_error){
                as.visitProgram(arvore);
                for(String err: SemanticoUtils.errosSemanticos){
                    p.println(err);
                }
            }
            p.println("Fim da compilacao");
            p.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
