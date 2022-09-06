// Generated from compiladores/t4/Pokemon.g4 by ANTLR 4.7.2
package compiladores.t4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PokemonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PokemonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PokemonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PokemonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_skill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_skill(PokemonParser.Declare_skillContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_skill_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_skill_attribute(PokemonParser.Declare_skill_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_pokemon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_pokemon(PokemonParser.Declare_pokemonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_pokemon_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_pokemon_attribute(PokemonParser.Declare_pokemon_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#battle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBattle(PokemonParser.BattleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_name(PokemonParser.Declare_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_damage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_damage(PokemonParser.Declare_damageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_cost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cost(PokemonParser.Declare_costContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_type(PokemonParser.Declare_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_hp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_hp(PokemonParser.Declare_hpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_pp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_pp(PokemonParser.Declare_ppContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#declare_skills}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_skills(PokemonParser.Declare_skillsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PokemonParser#attack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttack(PokemonParser.AttackContext ctx);
}