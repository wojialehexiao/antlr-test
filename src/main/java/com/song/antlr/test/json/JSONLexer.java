package com.song.antlr.test.json;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INT=10, NUMBER=11, EXP=12, STRING=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"INT", "NUMBER", "EXP", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "INT", "NUMBER", 
		"EXP", "STRING", "WS"
	};
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


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\7\13?\n\13\f\13\16\13B\13\13\5\13D\n\13\3"+
		"\f\5\fG\n\f\3\f\3\f\5\fK\n\f\3\f\3\f\3\f\3\f\5\fQ\n\f\3\f\5\fT\n\f\3\f"+
		"\3\f\3\f\5\fY\n\f\3\r\3\r\5\r]\n\r\3\r\3\r\3\16\3\16\7\16c\n\16\f\16\16"+
		"\16f\13\16\3\16\3\16\3\17\6\17k\n\17\r\17\16\17l\3\17\3\17\3d\2\20\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2"+
		"\7\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2\13\f\17\17\2z\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'"+
		"\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21\60\3\2\2\2\23\66\3\2\2\2\25C\3\2\2"+
		"\2\27X\3\2\2\2\31Z\3\2\2\2\33`\3\2\2\2\35j\3\2\2\2\37 \7}\2\2 \4\3\2\2"+
		"\2!\"\7.\2\2\"\6\3\2\2\2#$\7\177\2\2$\b\3\2\2\2%&\7<\2\2&\n\3\2\2\2\'"+
		"(\7]\2\2(\f\3\2\2\2)*\7_\2\2*\16\3\2\2\2+,\7v\2\2,-\7t\2\2-.\7w\2\2./"+
		"\7g\2\2/\20\3\2\2\2\60\61\7h\2\2\61\62\7c\2\2\62\63\7n\2\2\63\64\7u\2"+
		"\2\64\65\7g\2\2\65\22\3\2\2\2\66\67\7p\2\2\678\7w\2\289\7n\2\29:\7n\2"+
		"\2:\24\3\2\2\2;D\7\62\2\2<@\t\2\2\2=?\t\3\2\2>=\3\2\2\2?B\3\2\2\2@>\3"+
		"\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C;\3\2\2\2C<\3\2\2\2D\26\3\2\2\2E"+
		"G\7/\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HY\5\25\13\2IK\7/\2\2JI\3\2\2\2"+
		"JK\3\2\2\2KL\3\2\2\2LM\5\25\13\2MN\7\60\2\2NP\5\25\13\2OQ\5\31\r\2PO\3"+
		"\2\2\2PQ\3\2\2\2QY\3\2\2\2RT\7/\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\5"+
		"\25\13\2VW\5\31\r\2WY\3\2\2\2XF\3\2\2\2XJ\3\2\2\2XS\3\2\2\2Y\30\3\2\2"+
		"\2Z\\\t\4\2\2[]\t\5\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\5\25\13\2_\32"+
		"\3\2\2\2`d\7$\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2\2\2db\3\2\2\2e"+
		"g\3\2\2\2fd\3\2\2\2gh\7$\2\2h\34\3\2\2\2ik\t\6\2\2ji\3\2\2\2kl\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\17\2\2o\36\3\2\2\2\r\2@CFJPSX\\dl\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}