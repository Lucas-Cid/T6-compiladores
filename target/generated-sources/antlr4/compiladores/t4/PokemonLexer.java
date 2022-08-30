// Generated from compiladores/t4/Pokemon.g4 by ANTLR 4.7.2
package compiladores.t4;
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, RESERVED_WORD=3, IDENT=4, NUM=5, TYPE=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "RESERVED_WORD", "IDENT", "NUM", "TYPE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "RESERVED_WORD", "IDENT", "NUM", "TYPE"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\u00bb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4K\n\4\3\5\3\5\6\5O\n\5\r\5\16\5P\3\5\7\5T\n\5\f\5\16\5W\13\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ba\n\7\2\2\b\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\3\2\5\3\2C\\\4\2C\\c|\3\2\62;\2\u00d5\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\21\3\2"+
		"\2\2\7J\3\2\2\2\tL\3\2\2\2\13X\3\2\2\2\r\u00b9\3\2\2\2\17\20\7*\2\2\20"+
		"\4\3\2\2\2\21\22\7+\2\2\22\6\3\2\2\2\23\24\7v\2\2\24\25\7{\2\2\25\26\7"+
		"r\2\2\26K\7g\2\2\27\30\7u\2\2\30\31\7m\2\2\31\32\7k\2\2\32\33\7n\2\2\33"+
		"\34\7n\2\2\34K\7u\2\2\35\36\7y\2\2\36\37\7g\2\2\37 \7k\2\2 !\7i\2\2!\""+
		"\7j\2\2\"K\7v\2\2#$\7J\2\2$K\7R\2\2%&\7R\2\2&K\7R\2\2\'(\7p\2\2()\7c\2"+
		"\2)*\7o\2\2*K\7g\2\2+,\7f\2\2,-\7g\2\2-.\7e\2\2./\7n\2\2/\60\7c\2\2\60"+
		"\61\7t\2\2\61K\7g\2\2\62\63\7u\2\2\63\64\7m\2\2\64\65\7k\2\2\65\66\7n"+
		"\2\2\66K\7n\2\2\678\7r\2\289\7q\2\29:\7m\2\2:;\7g\2\2;<\7o\2\2<=\7q\2"+
		"\2=K\7p\2\2>?\7h\2\2?@\7k\2\2@A\7o\2\2AB\7a\2\2BC\7f\2\2CD\7g\2\2DE\7"+
		"e\2\2EF\7n\2\2FG\7c\2\2GH\7t\2\2HK\7g\2\2IK\7<\2\2J\23\3\2\2\2J\27\3\2"+
		"\2\2J\35\3\2\2\2J#\3\2\2\2J%\3\2\2\2J\'\3\2\2\2J+\3\2\2\2J\62\3\2\2\2"+
		"J\67\3\2\2\2J>\3\2\2\2JI\3\2\2\2K\b\3\2\2\2LU\t\2\2\2MO\t\3\2\2NM\3\2"+
		"\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\5\13\6\2SN\3\2\2\2TW\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2V\n\3\2\2\2WU\3\2\2\2XY\t\4\2\2Y\f\3\2\2\2Z"+
		"[\7d\2\2[\\\7w\2\2\\\u00ba\7i\2\2]^\7f\2\2^_\7t\2\2_`\7c\2\2`a\7i\2\2"+
		"ab\7q\2\2b\u00ba\7p\2\2cd\7g\2\2de\7n\2\2ef\7g\2\2fg\7v\2\2gh\7t\2\2h"+
		"i\7k\2\2i\u00ba\7e\2\2jk\7h\2\2kl\7c\2\2lm\7k\2\2mn\7t\2\2n\u00ba\7{\2"+
		"\2op\7h\2\2pq\7k\2\2qr\7i\2\2rs\7j\2\2st\7v\2\2tu\7k\2\2uv\7p\2\2v\u00ba"+
		"\7i\2\2wx\7h\2\2xy\7k\2\2yz\7t\2\2z\u00ba\7g\2\2{|\7h\2\2|}\7n\2\2}~\7"+
		"{\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\u00ba\7i\2\2\u0081\u0082\7i\2"+
		"\2\u0082\u0083\7j\2\2\u0083\u0084\7q\2\2\u0084\u0085\7u\2\2\u0085\u00ba"+
		"\7v\2\2\u0086\u0087\7i\2\2\u0087\u0088\7t\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u00ba\7u\2\2\u008b\u008c\7i\2\2\u008c\u008d\7t\2\2"+
		"\u008d\u008e\7q\2\2\u008e\u008f\7w\2\2\u008f\u0090\7p\2\2\u0090\u00ba"+
		"\7f\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7e\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7w\2\2\u0096\u0097\7f\2\2\u0097\u0098\7g\2\2"+
		"\u0098\u0099\7p\2\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b\u009c"+
		"\7o\2\2\u009c\u009d\7c\2\2\u009d\u00ba\7n\2\2\u009e\u009f\7r\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7q\2\2"+
		"\u00a3\u00ba\7p\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7"+
		"\7{\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\u00ba\7e\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7e\2\2"+
		"\u00ae\u00ba\7m\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b3\7g\2\2\u00b3\u00ba\7n\2\2\u00b4\u00b5\7y\2\2\u00b5"+
		"\u00b6\7c\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7g\2\2\u00b8\u00ba\7t\2\2"+
		"\u00b9Z\3\2\2\2\u00b9]\3\2\2\2\u00b9c\3\2\2\2\u00b9j\3\2\2\2\u00b9o\3"+
		"\2\2\2\u00b9w\3\2\2\2\u00b9{\3\2\2\2\u00b9\u0081\3\2\2\2\u00b9\u0086\3"+
		"\2\2\2\u00b9\u008b\3\2\2\2\u00b9\u0091\3\2\2\2\u00b9\u009e\3\2\2\2\u00b9"+
		"\u00a4\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b4\3\2"+
		"\2\2\u00ba\16\3\2\2\2\7\2JPU\u00b9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}