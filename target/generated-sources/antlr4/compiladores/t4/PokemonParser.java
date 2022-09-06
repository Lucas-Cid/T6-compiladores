// Generated from compiladores/t4/Pokemon.g4 by ANTLR 4.7.2
package compiladores.t4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PokemonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		RESERVED_WORD=18, TYPE=19, IDENT=20, NUM=21, WS=22;
	public static final int
		RULE_program = 0, RULE_declare_skill = 1, RULE_declare_skill_attribute = 2, 
		RULE_declare_pokemon = 3, RULE_declare_pokemon_attribute = 4, RULE_battle = 5, 
		RULE_declare_name = 6, RULE_declare_damage = 7, RULE_declare_cost = 8, 
		RULE_declare_type = 9, RULE_declare_hp = 10, RULE_declare_pp = 11, RULE_declare_skills = 12, 
		RULE_attack = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declare_skill", "declare_skill_attribute", "declare_pokemon", 
			"declare_pokemon_attribute", "battle", "declare_name", "declare_damage", 
			"declare_cost", "declare_type", "declare_hp", "declare_pp", "declare_skills", 
			"attack"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'declare skill:'", "'fim_declare'", "'declare pokemon:'", "'begin_batalha:'", 
			"'end_batalha'", "'name:'", "'damage:'", "'cost:'", "'type:'", "'HP:'", 
			"'PP:'", "'skills:'", "'['", "']'", "','", "'USES'", "'ON'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "RESERVED_WORD", "TYPE", "IDENT", 
			"NUM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pokemon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PokemonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BattleContext battle() {
			return getRuleContext(BattleContext.class,0);
		}
		public List<Declare_skillContext> declare_skill() {
			return getRuleContexts(Declare_skillContext.class);
		}
		public Declare_skillContext declare_skill(int i) {
			return getRuleContext(Declare_skillContext.class,i);
		}
		public List<Declare_pokemonContext> declare_pokemon() {
			return getRuleContexts(Declare_pokemonContext.class);
		}
		public Declare_pokemonContext declare_pokemon(int i) {
			return getRuleContext(Declare_pokemonContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(28);
				declare_skill();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(34);
				declare_pokemon();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			battle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_skillContext extends ParserRuleContext {
		public List<Declare_skill_attributeContext> declare_skill_attribute() {
			return getRuleContexts(Declare_skill_attributeContext.class);
		}
		public Declare_skill_attributeContext declare_skill_attribute(int i) {
			return getRuleContext(Declare_skill_attributeContext.class,i);
		}
		public Declare_skillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_skill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_skill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_skill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_skill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_skillContext declare_skill() throws RecognitionException {
		Declare_skillContext _localctx = new Declare_skillContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declare_skill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				{
				setState(43);
				declare_skill_attribute();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_skill_attributeContext extends ParserRuleContext {
		public Declare_nameContext declare_name() {
			return getRuleContext(Declare_nameContext.class,0);
		}
		public Declare_damageContext declare_damage() {
			return getRuleContext(Declare_damageContext.class,0);
		}
		public Declare_costContext declare_cost() {
			return getRuleContext(Declare_costContext.class,0);
		}
		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class,0);
		}
		public Declare_skill_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_skill_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_skill_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_skill_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_skill_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_skill_attributeContext declare_skill_attribute() throws RecognitionException {
		Declare_skill_attributeContext _localctx = new Declare_skill_attributeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declare_skill_attribute);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				declare_name();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				declare_damage();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				declare_cost();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				declare_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_pokemonContext extends ParserRuleContext {
		public List<Declare_pokemon_attributeContext> declare_pokemon_attribute() {
			return getRuleContexts(Declare_pokemon_attributeContext.class);
		}
		public Declare_pokemon_attributeContext declare_pokemon_attribute(int i) {
			return getRuleContext(Declare_pokemon_attributeContext.class,i);
		}
		public Declare_pokemonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_pokemon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_pokemon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_pokemon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_pokemon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_pokemonContext declare_pokemon() throws RecognitionException {
		Declare_pokemonContext _localctx = new Declare_pokemonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare_pokemon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__2);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(58);
				declare_pokemon_attribute();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_pokemon_attributeContext extends ParserRuleContext {
		public Declare_nameContext declare_name() {
			return getRuleContext(Declare_nameContext.class,0);
		}
		public Declare_hpContext declare_hp() {
			return getRuleContext(Declare_hpContext.class,0);
		}
		public Declare_ppContext declare_pp() {
			return getRuleContext(Declare_ppContext.class,0);
		}
		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class,0);
		}
		public Declare_skillsContext declare_skills() {
			return getRuleContext(Declare_skillsContext.class,0);
		}
		public Declare_pokemon_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_pokemon_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_pokemon_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_pokemon_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_pokemon_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_pokemon_attributeContext declare_pokemon_attribute() throws RecognitionException {
		Declare_pokemon_attributeContext _localctx = new Declare_pokemon_attributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declare_pokemon_attribute);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				declare_name();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				declare_hp();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				declare_pp();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				declare_type();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				declare_skills();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BattleContext extends ParserRuleContext {
		public List<AttackContext> attack() {
			return getRuleContexts(AttackContext.class);
		}
		public AttackContext attack(int i) {
			return getRuleContext(AttackContext.class,i);
		}
		public BattleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_battle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterBattle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitBattle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitBattle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BattleContext battle() throws RecognitionException {
		BattleContext _localctx = new BattleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_battle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__3);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(74);
				attack();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_nameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PokemonParser.IDENT, 0); }
		public Declare_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_nameContext declare_name() throws RecognitionException {
		Declare_nameContext _localctx = new Declare_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declare_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__5);
			setState(83);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_damageContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(PokemonParser.NUM, 0); }
		public Declare_damageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_damage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_damage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_damage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_damage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_damageContext declare_damage() throws RecognitionException {
		Declare_damageContext _localctx = new Declare_damageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declare_damage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__6);
			setState(86);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_costContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(PokemonParser.NUM, 0); }
		public Declare_costContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_cost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_cost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_cost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_costContext declare_cost() throws RecognitionException {
		Declare_costContext _localctx = new Declare_costContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declare_cost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__7);
			setState(89);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_typeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(PokemonParser.TYPE, 0); }
		public Declare_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_typeContext declare_type() throws RecognitionException {
		Declare_typeContext _localctx = new Declare_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declare_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__8);
			setState(92);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_hpContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(PokemonParser.NUM, 0); }
		public Declare_hpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_hp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_hp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_hp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_hp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_hpContext declare_hp() throws RecognitionException {
		Declare_hpContext _localctx = new Declare_hpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declare_hp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__9);
			setState(95);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_ppContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(PokemonParser.NUM, 0); }
		public Declare_ppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_pp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_pp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_pp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_pp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_ppContext declare_pp() throws RecognitionException {
		Declare_ppContext _localctx = new Declare_ppContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declare_pp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__10);
			setState(98);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_skillsContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(PokemonParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(PokemonParser.IDENT, i);
		}
		public List<TerminalNode> NUM() { return getTokens(PokemonParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PokemonParser.NUM, i);
		}
		public Declare_skillsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_skills; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterDeclare_skills(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitDeclare_skills(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitDeclare_skills(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_skillsContext declare_skills() throws RecognitionException {
		Declare_skillsContext _localctx = new Declare_skillsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declare_skills);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__11);
			setState(101);
			match(IDENT);
			setState(102);
			match(T__12);
			setState(103);
			match(NUM);
			setState(104);
			match(T__13);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(105);
				match(T__14);
				setState(106);
				match(IDENT);
				setState(107);
				match(T__12);
				setState(108);
				match(NUM);
				setState(109);
				match(T__13);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttackContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(PokemonParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(PokemonParser.IDENT, i);
		}
		public AttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).enterAttack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonListener ) ((PokemonListener)listener).exitAttack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PokemonVisitor ) return ((PokemonVisitor<? extends T>)visitor).visitAttack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttackContext attack() throws RecognitionException {
		AttackContext _localctx = new AttackContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IDENT);
			setState(116);
			match(T__15);
			setState(117);
			match(IDENT);
			setState(118);
			match(T__16);
			setState(119);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\7\2"+
		"&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\7\7N\n\7\f\7\16\7Q\13\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16q\n\16\f\16\16"+
		"\16t\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\2\2z\2!\3\2\2\2\4,\3\2\2\2\69\3\2\2\2\b;\3\2\2\2"+
		"\nI\3\2\2\2\fK\3\2\2\2\16T\3\2\2\2\20W\3\2\2\2\22Z\3\2\2\2\24]\3\2\2\2"+
		"\26`\3\2\2\2\30c\3\2\2\2\32f\3\2\2\2\34u\3\2\2\2\36 \5\4\3\2\37\36\3\2"+
		"\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\'\3\2\2\2#!\3\2\2\2$&\5\b\5\2"+
		"%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\5\f"+
		"\7\2+\3\3\2\2\2,\60\7\3\2\2-/\5\6\4\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2"+
		"\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\4\2\2\64\5\3\2\2"+
		"\2\65:\5\16\b\2\66:\5\20\t\2\67:\5\22\n\28:\5\24\13\29\65\3\2\2\29\66"+
		"\3\2\2\29\67\3\2\2\298\3\2\2\2:\7\3\2\2\2;?\7\5\2\2<>\5\n\6\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\4\2\2C\t\3\2"+
		"\2\2DJ\5\16\b\2EJ\5\26\f\2FJ\5\30\r\2GJ\5\24\13\2HJ\5\32\16\2ID\3\2\2"+
		"\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\13\3\2\2\2KO\7\6\2\2LN\5\34"+
		"\17\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7"+
		"\7\2\2S\r\3\2\2\2TU\7\b\2\2UV\7\26\2\2V\17\3\2\2\2WX\7\t\2\2XY\7\27\2"+
		"\2Y\21\3\2\2\2Z[\7\n\2\2[\\\7\27\2\2\\\23\3\2\2\2]^\7\13\2\2^_\7\25\2"+
		"\2_\25\3\2\2\2`a\7\f\2\2ab\7\27\2\2b\27\3\2\2\2cd\7\r\2\2de\7\27\2\2e"+
		"\31\3\2\2\2fg\7\16\2\2gh\7\26\2\2hi\7\17\2\2ij\7\27\2\2jr\7\20\2\2kl\7"+
		"\21\2\2lm\7\26\2\2mn\7\17\2\2no\7\27\2\2oq\7\20\2\2pk\3\2\2\2qt\3\2\2"+
		"\2rp\3\2\2\2rs\3\2\2\2s\33\3\2\2\2tr\3\2\2\2uv\7\26\2\2vw\7\22\2\2wx\7"+
		"\26\2\2xy\7\23\2\2yz\7\26\2\2z\35\3\2\2\2\n!\'\609?IOr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}