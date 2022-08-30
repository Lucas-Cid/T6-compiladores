// Generated from compiladores/t4/Pokemon.g4 by ANTLR 4.7.2
package compiladores.t4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PokemonParser}.
 */
public interface PokemonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_skill}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_skill(PokemonParser.Declare_skillContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_skill}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_skill(PokemonParser.Declare_skillContext ctx);
}