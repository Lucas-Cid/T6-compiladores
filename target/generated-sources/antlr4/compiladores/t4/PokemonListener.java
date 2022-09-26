// Generated from compiladores\t4\Pokemon.g4 by ANTLR 4.7.2
package compiladores.t4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PokemonParser}.
 */
public interface PokemonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PokemonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PokemonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PokemonParser.ProgramContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_skill_attribute}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_skill_attribute(PokemonParser.Declare_skill_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_skill_attribute}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_skill_attribute(PokemonParser.Declare_skill_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_pokemon}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_pokemon(PokemonParser.Declare_pokemonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_pokemon}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_pokemon(PokemonParser.Declare_pokemonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_pokemon_attribute}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_pokemon_attribute(PokemonParser.Declare_pokemon_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_pokemon_attribute}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_pokemon_attribute(PokemonParser.Declare_pokemon_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#battle}.
	 * @param ctx the parse tree
	 */
	void enterBattle(PokemonParser.BattleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#battle}.
	 * @param ctx the parse tree
	 */
	void exitBattle(PokemonParser.BattleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_name}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_name(PokemonParser.Declare_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_name}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_name(PokemonParser.Declare_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_damage}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_damage(PokemonParser.Declare_damageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_damage}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_damage(PokemonParser.Declare_damageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_cost}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cost(PokemonParser.Declare_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_cost}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cost(PokemonParser.Declare_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_type}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_type(PokemonParser.Declare_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_type}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_type(PokemonParser.Declare_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_hp}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_hp(PokemonParser.Declare_hpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_hp}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_hp(PokemonParser.Declare_hpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_pp}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_pp(PokemonParser.Declare_ppContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_pp}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_pp(PokemonParser.Declare_ppContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#declare_skills}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_skills(PokemonParser.Declare_skillsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#declare_skills}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_skills(PokemonParser.Declare_skillsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonParser#attack}.
	 * @param ctx the parse tree
	 */
	void enterAttack(PokemonParser.AttackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonParser#attack}.
	 * @param ctx the parse tree
	 */
	void exitAttack(PokemonParser.AttackContext ctx);
}