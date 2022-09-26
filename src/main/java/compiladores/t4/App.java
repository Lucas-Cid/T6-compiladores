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
        // Abre arquivo de entrada
        try(PrintWriter p = new PrintWriter(new File(args[1]))) {

            // Abre arquivo de saída para escrita
            CharStream c = CharStreams.fromFileName(args[0]);

            // Realiza a verificação sintática
            PokemonLexer lex = new PokemonLexer(c);
            CommonTokenStream cs = new CommonTokenStream(lex);
            PokemonParser parser = new PokemonParser(cs);
            parser.removeErrorListeners();
            // Sobrescreve as mensagens de erro padrão do antlr
            parser.addErrorListener(new MensagemErro(p));
            ProgramContext arvore = parser.program();

            PokemonSemantico as = new PokemonSemantico();

            // Se não houver nenhum erro sintático, inicia a verificação semântica
            if(!MensagemErro.got_error){
                as.visitProgram(arvore);

                // Escreve os erros semânticos no arquivo de saída
                for(String err: SemanticoUtils.errosSemanticos){
                    p.println(err);
                }

                // Caso não haja nenhum erro semântico, inicia a geração de código em cpp
                if(SemanticoUtils.errosSemanticos.isEmpty()){
                    PokemonGeradorC agc = new PokemonGeradorC();
                    agc.visitProgram(arvore);

                    // Escreve o código gerado em um novo arquivo de saída com extensão .cpp
                    try(PrintWriter pw = new PrintWriter(new File(args[1].split("\\.")[0]+".cpp"))) {
                        pw.print(agc.out.toString());
                    }
                }
            }
            p.println("Fim da compilacao");
            p.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
