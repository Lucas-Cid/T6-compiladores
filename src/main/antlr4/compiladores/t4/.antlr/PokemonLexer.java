// Generated from d:\7thSemester\Compiladores\Codigo\T6\T6-compiladores\src\main\antlr4\compiladores\t4\Pokemon.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PokemonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		RESERVED_WORD=18, TYPE=19, IDENT=20, NUM=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"RESERVED_WORD", "TYPE", "IDENT", "NUM", "WS"
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


	public PokemonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pokemon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u017d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u0112\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u016c\n\24\3\25\3\25\3\25\7\25\u0171\n\25\f\25\16\25\u0174\13\25\3\26"+
		"\6\26\u0177\n\26\r\26\16\26\u0178\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30\3\2\6\4\2C\\c|\4\2\"\"c|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u019f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\3/\3\2\2\2\5>\3\2\2\2\7J\3\2\2\2\t[\3\2\2\2\13j\3\2\2\2\rv\3\2\2\2"+
		"\17|\3\2\2\2\21\u0084\3\2\2\2\23\u008a\3\2\2\2\25\u0090\3\2\2\2\27\u0094"+
		"\3\2\2\2\31\u0098\3\2\2\2\33\u00a0\3\2\2\2\35\u00a2\3\2\2\2\37\u00a4\3"+
		"\2\2\2!\u00a6\3\2\2\2#\u00ab\3\2\2\2%\u0111\3\2\2\2\'\u016b\3\2\2\2)\u016d"+
		"\3\2\2\2+\u0176\3\2\2\2-\u017a\3\2\2\2/\60\7f\2\2\60\61\7g\2\2\61\62\7"+
		"e\2\2\62\63\7n\2\2\63\64\7c\2\2\64\65\7t\2\2\65\66\7g\2\2\66\67\7\"\2"+
		"\2\678\7u\2\289\7m\2\29:\7k\2\2:;\7n\2\2;<\7n\2\2<=\7<\2\2=\4\3\2\2\2"+
		">?\7h\2\2?@\7k\2\2@A\7o\2\2AB\7a\2\2BC\7f\2\2CD\7g\2\2DE\7e\2\2EF\7n\2"+
		"\2FG\7c\2\2GH\7t\2\2HI\7g\2\2I\6\3\2\2\2JK\7f\2\2KL\7g\2\2LM\7e\2\2MN"+
		"\7n\2\2NO\7c\2\2OP\7t\2\2PQ\7g\2\2QR\7\"\2\2RS\7r\2\2ST\7q\2\2TU\7m\2"+
		"\2UV\7g\2\2VW\7o\2\2WX\7q\2\2XY\7p\2\2YZ\7<\2\2Z\b\3\2\2\2[\\\7d\2\2\\"+
		"]\7g\2\2]^\7i\2\2^_\7k\2\2_`\7p\2\2`a\7a\2\2ab\7d\2\2bc\7c\2\2cd\7v\2"+
		"\2de\7c\2\2ef\7n\2\2fg\7j\2\2gh\7c\2\2hi\7<\2\2i\n\3\2\2\2jk\7g\2\2kl"+
		"\7p\2\2lm\7f\2\2mn\7a\2\2no\7d\2\2op\7c\2\2pq\7v\2\2qr\7c\2\2rs\7n\2\2"+
		"st\7j\2\2tu\7c\2\2u\f\3\2\2\2vw\7p\2\2wx\7c\2\2xy\7o\2\2yz\7g\2\2z{\7"+
		"<\2\2{\16\3\2\2\2|}\7f\2\2}~\7c\2\2~\177\7o\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7i\2\2\u0081\u0082\7g\2\2\u0082\u0083\7<\2\2\u0083\20\3\2\2\2\u0084"+
		"\u0085\7e\2\2\u0085\u0086\7q\2\2\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2"+
		"\u0088\u0089\7<\2\2\u0089\22\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7"+
		"{\2\2\u008c\u008d\7r\2\2\u008d\u008e\7g\2\2\u008e\u008f\7<\2\2\u008f\24"+
		"\3\2\2\2\u0090\u0091\7J\2\2\u0091\u0092\7R\2\2\u0092\u0093\7<\2\2\u0093"+
		"\26\3\2\2\2\u0094\u0095\7R\2\2\u0095\u0096\7R\2\2\u0096\u0097\7<\2\2\u0097"+
		"\30\3\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7m\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7n\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f\7<\2\2"+
		"\u009f\32\3\2\2\2\u00a0\u00a1\7]\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7_\2"+
		"\2\u00a3\36\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5 \3\2\2\2\u00a6\u00a7\7W\2"+
		"\2\u00a7\u00a8\7U\2\2\u00a8\u00a9\7G\2\2\u00a9\u00aa\7U\2\2\u00aa\"\3"+
		"\2\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7P\2\2\u00ad$\3\2\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u00b0\7{\2\2\u00b0\u00b1\7r\2\2\u00b1\u0112\7g\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00b4\7m\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7n\2\2"+
		"\u00b6\u00b7\7n\2\2\u00b7\u0112\7u\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba"+
		"\7c\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7i\2\2\u00bd"+
		"\u0112\7g\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7k\2\2"+
		"\u00c1\u00c2\7i\2\2\u00c2\u00c3\7j\2\2\u00c3\u0112\7v\2\2\u00c4\u00c5"+
		"\7v\2\2\u00c5\u00c6\7{\2\2\u00c6\u00c7\7r\2\2\u00c7\u0112\7g\2\2\u00c8"+
		"\u00c9\7J\2\2\u00c9\u0112\7R\2\2\u00ca\u00cb\7R\2\2\u00cb\u0112\7R\2\2"+
		"\u00cc\u00cd\7e\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7u\2\2\u00cf\u0112"+
		"\7v\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7o\2\2\u00d3"+
		"\u0112\7g\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7m\2\2\u00d6\u00d7\7k\2\2"+
		"\u00d7\u00d8\7n\2\2\u00d8\u0112\7n\2\2\u00d9\u00da\7r\2\2\u00da\u00db"+
		"\7q\2\2\u00db\u00dc\7m\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7o\2\2\u00de"+
		"\u00df\7q\2\2\u00df\u0112\7p\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7g\2\2"+
		"\u00e2\u00e3\7e\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7t\2\2\u00e6\u0112\7g\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00ea\7o\2\2\u00ea\u00eb\7a\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed\u00ee\7e\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1"+
		"\7t\2\2\u00f1\u0112\7g\2\2\u00f2\u00f3\7d\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7i\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7a\2\2"+
		"\u00f8\u00f9\7d\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc"+
		"\7c\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7j\2\2\u00fe\u0112\7c\2\2\u00ff"+
		"\u0100\7g\2\2\u0100\u0101\7p\2\2\u0101\u0102\7f\2\2\u0102\u0103\7a\2\2"+
		"\u0103\u0104\7d\2\2\u0104\u0105\7c\2\2\u0105\u0106\7v\2\2\u0106\u0107"+
		"\7c\2\2\u0107\u0108\7n\2\2\u0108\u0109\7j\2\2\u0109\u0112\7c\2\2\u010a"+
		"\u010b\7w\2\2\u010b\u010c\7u\2\2\u010c\u010d\7g\2\2\u010d\u0112\7u\2\2"+
		"\u010e\u010f\7q\2\2\u010f\u0112\7p\2\2\u0110\u0112\7<\2\2\u0111\u00ae"+
		"\3\2\2\2\u0111\u00b2\3\2\2\2\u0111\u00b8\3\2\2\2\u0111\u00be\3\2\2\2\u0111"+
		"\u00c4\3\2\2\2\u0111\u00c8\3\2\2\2\u0111\u00ca\3\2\2\2\u0111\u00cc\3\2"+
		"\2\2\u0111\u00d0\3\2\2\2\u0111\u00d4\3\2\2\2\u0111\u00d9\3\2\2\2\u0111"+
		"\u00e0\3\2\2\2\u0111\u00e7\3\2\2\2\u0111\u00f2\3\2\2\2\u0111\u00ff\3\2"+
		"\2\2\u0111\u010a\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"&\3\2\2\2\u0113\u0114\7d\2\2\u0114\u0115\7w\2\2\u0115\u016c\7i\2\2\u0116"+
		"\u0117\7f\2\2\u0117\u0118\7t\2\2\u0118\u0119\7c\2\2\u0119\u011a\7i\2\2"+
		"\u011a\u011b\7q\2\2\u011b\u016c\7p\2\2\u011c\u011d\7g\2\2\u011d\u011e"+
		"\7n\2\2\u011e\u011f\7g\2\2\u011f\u0120\7v\2\2\u0120\u0121\7t\2\2\u0121"+
		"\u0122\7k\2\2\u0122\u016c\7e\2\2\u0123\u0124\7h\2\2\u0124\u0125\7c\2\2"+
		"\u0125\u0126\7k\2\2\u0126\u0127\7t\2\2\u0127\u016c\7{\2\2\u0128\u0129"+
		"\7h\2\2\u0129\u012a\7k\2\2\u012a\u012b\7i\2\2\u012b\u012c\7j\2\2\u012c"+
		"\u012d\7v\2\2\u012d\u012e\7k\2\2\u012e\u012f\7p\2\2\u012f\u016c\7i\2\2"+
		"\u0130\u0131\7h\2\2\u0131\u0132\7k\2\2\u0132\u0133\7t\2\2\u0133\u016c"+
		"\7g\2\2\u0134\u0135\7h\2\2\u0135\u0136\7n\2\2\u0136\u0137\7{\2\2\u0137"+
		"\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139\u016c\7i\2\2\u013a\u013b\7i\2\2"+
		"\u013b\u013c\7j\2\2\u013c\u013d\7q\2\2\u013d\u013e\7u\2\2\u013e\u016c"+
		"\7v\2\2\u013f\u0140\7i\2\2\u0140\u0141\7t\2\2\u0141\u0142\7c\2\2\u0142"+
		"\u0143\7u\2\2\u0143\u016c\7u\2\2\u0144\u0145\7i\2\2\u0145\u0146\7t\2\2"+
		"\u0146\u0147\7q\2\2\u0147\u0148\7w\2\2\u0148\u0149\7p\2\2\u0149\u016c"+
		"\7f\2\2\u014a\u014b\7p\2\2\u014b\u014c\7q\2\2\u014c\u014d\7t\2\2\u014d"+
		"\u014e\7o\2\2\u014e\u014f\7c\2\2\u014f\u016c\7n\2\2\u0150\u0151\7r\2\2"+
		"\u0151\u0152\7q\2\2\u0152\u0153\7k\2\2\u0153\u0154\7u\2\2\u0154\u0155"+
		"\7q\2\2\u0155\u016c\7p\2\2\u0156\u0157\7r\2\2\u0157\u0158\7u\2\2\u0158"+
		"\u0159\7{\2\2\u0159\u015a\7e\2\2\u015a\u015b\7j\2\2\u015b\u015c\7k\2\2"+
		"\u015c\u016c\7e\2\2\u015d\u015e\7t\2\2\u015e\u015f\7q\2\2\u015f\u0160"+
		"\7e\2\2\u0160\u016c\7m\2\2\u0161\u0162\7u\2\2\u0162\u0163\7v\2\2\u0163"+
		"\u0164\7g\2\2\u0164\u0165\7g\2\2\u0165\u016c\7n\2\2\u0166\u0167\7y\2\2"+
		"\u0167\u0168\7c\2\2\u0168\u0169\7v\2\2\u0169\u016a\7g\2\2\u016a\u016c"+
		"\7t\2\2\u016b\u0113\3\2\2\2\u016b\u0116\3\2\2\2\u016b\u011c\3\2\2\2\u016b"+
		"\u0123\3\2\2\2\u016b\u0128\3\2\2\2\u016b\u0130\3\2\2\2\u016b\u0134\3\2"+
		"\2\2\u016b\u013a\3\2\2\2\u016b\u013f\3\2\2\2\u016b\u0144\3\2\2\2\u016b"+
		"\u014a\3\2\2\2\u016b\u0150\3\2\2\2\u016b\u0156\3\2\2\2\u016b\u015d\3\2"+
		"\2\2\u016b\u0161\3\2\2\2\u016b\u0166\3\2\2\2\u016c(\3\2\2\2\u016d\u0172"+
		"\t\2\2\2\u016e\u0171\t\3\2\2\u016f\u0171\5+\26\2\u0170\u016e\3\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173*\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\t\4\2\2\u0176\u0175"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		",\3\2\2\2\u017a\u017b\t\5\2\2\u017b\u017c\b\27\2\2\u017c.\3\2\2\2\b\2"+
		"\u0111\u016b\u0170\u0172\u0178\3\3\27\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}