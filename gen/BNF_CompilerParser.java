// Generated from I:/PROYECTOS JAVA/BNF_Compiler/src\BNF_Compiler.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BNF_CompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUMA=1, RESTA=2, MULT=3, DIV=4, ASIGNACION=5, MAYOR_IGUALQ=6, MENOR_IGUALQ=7, 
		MAYOR_Q=8, MENOR_Q=9, IGUAL=10, EQUIVALENTE=11, DISTINTO=12, LLAVES_A=13, 
		LLAVES_C=14, CORCHETE_A=15, CORCHETE_C=16, PARENTESIS_A=17, PARENTESIS_C=18, 
		COMA=19, PUNTO=20, PUNTOCOMA=21, DOSPUNTOS=22, COMILLAS=23, IF=24, ELSE=25, 
		FOR=26, PRINT=27, INT=28, STRING=29, WHILE=30, NUMERO=31, TEXTO=32, WS=33;
	public static final int
		RULE_program = 0, RULE_ignore = 1, RULE_id = 2, RULE_numero = 3, RULE_decimal = 4, 
		RULE_operadores = 5, RULE_simbolos = 6, RULE_equivalente = 7, RULE_cadena = 8, 
		RULE_while_T = 9, RULE_for_T = 10, RULE_if_T = 11, RULE_print = 12, RULE_else_T = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "ignore", "id", "numero", "decimal", "operadores", "simbolos", 
			"equivalente", "cadena", "while_T", "for_T", "if_T", "print", "else_T"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'='", "'>='", "'<='", "'>'", "'<'", 
			"'=='", "'equivalente'", "'<>'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"','", "'.'", "';'", "':'", "'\"'", "'if'", "'else'", "'for'", "'print'", 
			"'int'", "'String'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUMA", "RESTA", "MULT", "DIV", "ASIGNACION", "MAYOR_IGUALQ", "MENOR_IGUALQ", 
			"MAYOR_Q", "MENOR_Q", "IGUAL", "EQUIVALENTE", "DISTINTO", "LLAVES_A", 
			"LLAVES_C", "CORCHETE_A", "CORCHETE_C", "PARENTESIS_A", "PARENTESIS_C", 
			"COMA", "PUNTO", "PUNTOCOMA", "DOSPUNTOS", "COMILLAS", "IF", "ELSE", 
			"FOR", "PRINT", "INT", "STRING", "WHILE", "NUMERO", "TEXTO", "WS"
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
	public String getGrammarFileName() { return "BNF_Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BNF_CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DecimalContext> decimal() {
			return getRuleContexts(DecimalContext.class);
		}
		public DecimalContext decimal(int i) {
			return getRuleContext(DecimalContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<While_TContext> while_T() {
			return getRuleContexts(While_TContext.class);
		}
		public While_TContext while_T(int i) {
			return getRuleContext(While_TContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<For_TContext> for_T() {
			return getRuleContexts(For_TContext.class);
		}
		public For_TContext for_T(int i) {
			return getRuleContext(For_TContext.class,i);
		}
		public List<If_TContext> if_T() {
			return getRuleContexts(If_TContext.class);
		}
		public If_TContext if_T(int i) {
			return getRuleContext(If_TContext.class,i);
		}
		public List<Else_TContext> else_T() {
			return getRuleContexts(Else_TContext.class);
		}
		public Else_TContext else_T(int i) {
			return getRuleContext(Else_TContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(28);
					decimal();
					}
					break;
				case 2:
					{
					setState(29);
					numero();
					}
					break;
				case 3:
					{
					setState(30);
					id();
					}
					break;
				case 4:
					{
					setState(31);
					while_T();
					}
					break;
				case 5:
					{
					setState(32);
					print();
					}
					break;
				case 6:
					{
					setState(33);
					for_T();
					}
					break;
				case 7:
					{
					setState(34);
					if_T();
					}
					break;
				case 8:
					{
					setState(35);
					else_T();
					}
					break;
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << PRINT) | (1L << WHILE) | (1L << NUMERO) | (1L << TEXTO))) != 0) );
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

	public static class IgnoreContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(BNF_CompilerParser.WS, 0); }
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitIgnore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitIgnore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ignore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(WS);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(BNF_CompilerParser.TEXTO, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(TEXTO);
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(BNF_CompilerParser.NUMERO, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(NUMERO);
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

	public static class DecimalContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(BNF_CompilerParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(BNF_CompilerParser.NUMERO, i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(BNF_CompilerParser.PUNTOCOMA, 0); }
		public List<TerminalNode> PUNTO() { return getTokens(BNF_CompilerParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(BNF_CompilerParser.PUNTO, i);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(NUMERO);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				match(PUNTO);
				setState(48);
				match(NUMERO);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PUNTO );
			setState(53);
			match(PUNTOCOMA);
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

	public static class OperadoresContext extends ParserRuleContext {
		public List<TerminalNode> SUMA() { return getTokens(BNF_CompilerParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(BNF_CompilerParser.SUMA, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(BNF_CompilerParser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(BNF_CompilerParser.RESTA, i);
		}
		public List<TerminalNode> MULT() { return getTokens(BNF_CompilerParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(BNF_CompilerParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(BNF_CompilerParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(BNF_CompilerParser.DIV, i);
		}
		public List<TerminalNode> MAYOR_IGUALQ() { return getTokens(BNF_CompilerParser.MAYOR_IGUALQ); }
		public TerminalNode MAYOR_IGUALQ(int i) {
			return getToken(BNF_CompilerParser.MAYOR_IGUALQ, i);
		}
		public List<TerminalNode> MENOR_IGUALQ() { return getTokens(BNF_CompilerParser.MENOR_IGUALQ); }
		public TerminalNode MENOR_IGUALQ(int i) {
			return getToken(BNF_CompilerParser.MENOR_IGUALQ, i);
		}
		public List<TerminalNode> MAYOR_Q() { return getTokens(BNF_CompilerParser.MAYOR_Q); }
		public TerminalNode MAYOR_Q(int i) {
			return getToken(BNF_CompilerParser.MAYOR_Q, i);
		}
		public List<TerminalNode> MENOR_Q() { return getTokens(BNF_CompilerParser.MENOR_Q); }
		public TerminalNode MENOR_Q(int i) {
			return getToken(BNF_CompilerParser.MENOR_Q, i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(BNF_CompilerParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(BNF_CompilerParser.IGUAL, i);
		}
		public List<TerminalNode> DISTINTO() { return getTokens(BNF_CompilerParser.DISTINTO); }
		public TerminalNode DISTINTO(int i) {
			return getToken(BNF_CompilerParser.DISTINTO, i);
		}
		public List<TerminalNode> ASIGNACION() { return getTokens(BNF_CompilerParser.ASIGNACION); }
		public TerminalNode ASIGNACION(int i) {
			return getToken(BNF_CompilerParser.ASIGNACION, i);
		}
		public OperadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterOperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitOperadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitOperadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoresContext operadores() throws RecognitionException {
		OperadoresContext _localctx = new OperadoresContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operadores);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(55);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULT) | (1L << DIV) | (1L << ASIGNACION) | (1L << MAYOR_IGUALQ) | (1L << MENOR_IGUALQ) | (1L << MAYOR_Q) | (1L << MENOR_Q) | (1L << IGUAL) | (1L << DISTINTO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SimbolosContext extends ParserRuleContext {
		public List<TerminalNode> LLAVES_A() { return getTokens(BNF_CompilerParser.LLAVES_A); }
		public TerminalNode LLAVES_A(int i) {
			return getToken(BNF_CompilerParser.LLAVES_A, i);
		}
		public List<TerminalNode> LLAVES_C() { return getTokens(BNF_CompilerParser.LLAVES_C); }
		public TerminalNode LLAVES_C(int i) {
			return getToken(BNF_CompilerParser.LLAVES_C, i);
		}
		public List<TerminalNode> PARENTESIS_A() { return getTokens(BNF_CompilerParser.PARENTESIS_A); }
		public TerminalNode PARENTESIS_A(int i) {
			return getToken(BNF_CompilerParser.PARENTESIS_A, i);
		}
		public List<TerminalNode> PARENTESIS_C() { return getTokens(BNF_CompilerParser.PARENTESIS_C); }
		public TerminalNode PARENTESIS_C(int i) {
			return getToken(BNF_CompilerParser.PARENTESIS_C, i);
		}
		public List<TerminalNode> CORCHETE_A() { return getTokens(BNF_CompilerParser.CORCHETE_A); }
		public TerminalNode CORCHETE_A(int i) {
			return getToken(BNF_CompilerParser.CORCHETE_A, i);
		}
		public List<TerminalNode> CORCHETE_C() { return getTokens(BNF_CompilerParser.CORCHETE_C); }
		public TerminalNode CORCHETE_C(int i) {
			return getToken(BNF_CompilerParser.CORCHETE_C, i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(BNF_CompilerParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(BNF_CompilerParser.PUNTO, i);
		}
		public List<TerminalNode> DOSPUNTOS() { return getTokens(BNF_CompilerParser.DOSPUNTOS); }
		public TerminalNode DOSPUNTOS(int i) {
			return getToken(BNF_CompilerParser.DOSPUNTOS, i);
		}
		public List<TerminalNode> PUNTOCOMA() { return getTokens(BNF_CompilerParser.PUNTOCOMA); }
		public TerminalNode PUNTOCOMA(int i) {
			return getToken(BNF_CompilerParser.PUNTOCOMA, i);
		}
		public List<TerminalNode> COMILLAS() { return getTokens(BNF_CompilerParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(BNF_CompilerParser.COMILLAS, i);
		}
		public List<TerminalNode> COMA() { return getTokens(BNF_CompilerParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(BNF_CompilerParser.COMA, i);
		}
		public SimbolosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simbolos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterSimbolos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitSimbolos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitSimbolos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimbolosContext simbolos() throws RecognitionException {
		SimbolosContext _localctx = new SimbolosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simbolos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLAVES_A) | (1L << LLAVES_C) | (1L << CORCHETE_A) | (1L << CORCHETE_C) | (1L << PARENTESIS_A) | (1L << PARENTESIS_C) | (1L << COMA) | (1L << PUNTO) | (1L << PUNTOCOMA) | (1L << DOSPUNTOS) | (1L << COMILLAS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLAVES_A) | (1L << LLAVES_C) | (1L << CORCHETE_A) | (1L << CORCHETE_C) | (1L << PARENTESIS_A) | (1L << PARENTESIS_C) | (1L << COMA) | (1L << PUNTO) | (1L << PUNTOCOMA) | (1L << DOSPUNTOS) | (1L << COMILLAS))) != 0) );
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

	public static class EquivalenteContext extends ParserRuleContext {
		public TerminalNode EQUIVALENTE() { return getToken(BNF_CompilerParser.EQUIVALENTE, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(BNF_CompilerParser.PARENTESIS_A, 0); }
		public TerminalNode COMA() { return getToken(BNF_CompilerParser.COMA, 0); }
		public TerminalNode PARENTESIS_C() { return getToken(BNF_CompilerParser.PARENTESIS_C, 0); }
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public EquivalenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterEquivalente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitEquivalente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitEquivalente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquivalenteContext equivalente() throws RecognitionException {
		EquivalenteContext _localctx = new EquivalenteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_equivalente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(EQUIVALENTE);
			setState(66);
			match(PARENTESIS_A);
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMILLAS:
				{
				setState(67);
				cadena();
				}
				break;
			case TEXTO:
				{
				setState(68);
				id();
				}
				break;
			case COMA:
				break;
			default:
				break;
			}
			setState(71);
			match(COMA);
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMILLAS:
				{
				setState(72);
				cadena();
				}
				break;
			case TEXTO:
				{
				setState(73);
				id();
				}
				break;
			case PARENTESIS_C:
				break;
			default:
				break;
			}
			setState(76);
			match(PARENTESIS_C);
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

	public static class CadenaContext extends ParserRuleContext {
		public List<TerminalNode> COMILLAS() { return getTokens(BNF_CompilerParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(BNF_CompilerParser.COMILLAS, i);
		}
		public List<TerminalNode> TEXTO() { return getTokens(BNF_CompilerParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(BNF_CompilerParser.TEXTO, i);
		}
		public List<TerminalNode> WS() { return getTokens(BNF_CompilerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BNF_CompilerParser.WS, i);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitCadena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(COMILLAS);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==TEXTO || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXTO || _la==WS );
			setState(84);
			match(COMILLAS);
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

	public static class While_TContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BNF_CompilerParser.WHILE, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(BNF_CompilerParser.PARENTESIS_A, 0); }
		public OperadoresContext operadores() {
			return getRuleContext(OperadoresContext.class,0);
		}
		public TerminalNode PARENTESIS_C() { return getToken(BNF_CompilerParser.PARENTESIS_C, 0); }
		public TerminalNode LLAVES_A() { return getToken(BNF_CompilerParser.LLAVES_A, 0); }
		public TerminalNode LLAVES_C() { return getToken(BNF_CompilerParser.LLAVES_C, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(BNF_CompilerParser.PUNTOCOMA, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<DecimalContext> decimal() {
			return getRuleContexts(DecimalContext.class);
		}
		public DecimalContext decimal(int i) {
			return getRuleContext(DecimalContext.class,i);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public While_TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_T; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterWhile_T(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitWhile_T(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitWhile_T(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_TContext while_T() throws RecognitionException {
		While_TContext _localctx = new While_TContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_T);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(WHILE);
			{
			setState(87);
			match(PARENTESIS_A);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(88);
					id();
					}
					break;
				case 2:
					{
					setState(89);
					numero();
					}
					break;
				case 3:
					{
					setState(90);
					decimal();
					}
					break;
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERO || _la==TEXTO );
			setState(95);
			operadores();
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(96);
					id();
					}
					break;
				case 2:
					{
					setState(97);
					numero();
					}
					break;
				case 3:
					{
					setState(98);
					decimal();
					}
					break;
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERO || _la==TEXTO );
			setState(103);
			match(PARENTESIS_C);
			setState(104);
			match(LLAVES_A);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << PRINT) | (1L << WHILE) | (1L << NUMERO) | (1L << TEXTO))) != 0)) {
				{
				setState(105);
				program();
				}
			}

			setState(108);
			match(LLAVES_C);
			setState(109);
			match(PUNTOCOMA);
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

	public static class For_TContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BNF_CompilerParser.FOR, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(BNF_CompilerParser.PARENTESIS_A, 0); }
		public TerminalNode INT() { return getToken(BNF_CompilerParser.INT, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ASIGNACION() { return getToken(BNF_CompilerParser.ASIGNACION, 0); }
		public List<TerminalNode> PUNTOCOMA() { return getTokens(BNF_CompilerParser.PUNTOCOMA); }
		public TerminalNode PUNTOCOMA(int i) {
			return getToken(BNF_CompilerParser.PUNTOCOMA, i);
		}
		public List<OperadoresContext> operadores() {
			return getRuleContexts(OperadoresContext.class);
		}
		public OperadoresContext operadores(int i) {
			return getRuleContext(OperadoresContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode PARENTESIS_C() { return getToken(BNF_CompilerParser.PARENTESIS_C, 0); }
		public TerminalNode LLAVES_A() { return getToken(BNF_CompilerParser.LLAVES_A, 0); }
		public TerminalNode LLAVES_C() { return getToken(BNF_CompilerParser.LLAVES_C, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public For_TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_T; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterFor_T(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitFor_T(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitFor_T(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_TContext for_T() throws RecognitionException {
		For_TContext _localctx = new For_TContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_T);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(FOR);
			setState(112);
			match(PARENTESIS_A);
			setState(113);
			match(INT);
			setState(114);
			id();
			setState(115);
			match(ASIGNACION);
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				{
				setState(116);
				id();
				}
				break;
			case NUMERO:
				{
				setState(117);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			match(PUNTOCOMA);
			setState(121);
			id();
			setState(122);
			operadores();
			setState(123);
			numero();
			setState(124);
			match(PUNTOCOMA);
			setState(125);
			id();
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				operadores();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULT) | (1L << DIV) | (1L << ASIGNACION) | (1L << MAYOR_IGUALQ) | (1L << MENOR_IGUALQ) | (1L << MAYOR_Q) | (1L << MENOR_Q) | (1L << IGUAL) | (1L << DISTINTO))) != 0) );
			setState(131);
			match(PARENTESIS_C);
			setState(132);
			match(LLAVES_A);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << PRINT) | (1L << WHILE) | (1L << NUMERO) | (1L << TEXTO))) != 0)) {
				{
				setState(133);
				program();
				}
			}

			setState(136);
			match(LLAVES_C);
			setState(137);
			match(PUNTOCOMA);
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

	public static class If_TContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BNF_CompilerParser.IF, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(BNF_CompilerParser.PARENTESIS_A, 0); }
		public TerminalNode PARENTESIS_C() { return getToken(BNF_CompilerParser.PARENTESIS_C, 0); }
		public TerminalNode LLAVES_A() { return getToken(BNF_CompilerParser.LLAVES_A, 0); }
		public List<TerminalNode> LLAVES_C() { return getTokens(BNF_CompilerParser.LLAVES_C); }
		public TerminalNode LLAVES_C(int i) {
			return getToken(BNF_CompilerParser.LLAVES_C, i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(BNF_CompilerParser.PUNTOCOMA, 0); }
		public EquivalenteContext equivalente() {
			return getRuleContext(EquivalenteContext.class,0);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<OperadoresContext> operadores() {
			return getRuleContexts(OperadoresContext.class);
		}
		public OperadoresContext operadores(int i) {
			return getRuleContext(OperadoresContext.class,i);
		}
		public If_TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_T; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterIf_T(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitIf_T(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitIf_T(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_TContext if_T() throws RecognitionException {
		If_TContext _localctx = new If_TContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_T);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IF);
			setState(140);
			match(PARENTESIS_A);
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					numero();
					setState(142);
					operadores();
					setState(143);
					numero();
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERO );
				}
				break;
			case EQUIVALENTE:
				{
				setState(149);
				equivalente();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
			match(PARENTESIS_C);
			setState(153);
			match(LLAVES_A);
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(154);
				program();
				}
				break;
			case 2:
				{
				setState(155);
				match(LLAVES_C);
				}
				break;
			}
			setState(158);
			match(LLAVES_C);
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case ELSE:
			case FOR:
			case PRINT:
			case WHILE:
			case NUMERO:
			case TEXTO:
				{
				setState(159);
				program();
				}
				break;
			case LLAVES_C:
				{
				setState(160);
				match(LLAVES_C);
				}
				break;
			case PUNTOCOMA:
				break;
			default:
				break;
			}
			setState(163);
			match(PUNTOCOMA);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(BNF_CompilerParser.PRINT, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(BNF_CompilerParser.PARENTESIS_A, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode PARENTESIS_C() { return getToken(BNF_CompilerParser.PARENTESIS_C, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(BNF_CompilerParser.PUNTOCOMA, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(PRINT);
			setState(166);
			match(PARENTESIS_A);
			setState(167);
			cadena();
			setState(168);
			match(PARENTESIS_C);
			setState(169);
			match(PUNTOCOMA);
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

	public static class Else_TContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BNF_CompilerParser.ELSE, 0); }
		public TerminalNode LLAVES_A() { return getToken(BNF_CompilerParser.LLAVES_A, 0); }
		public TerminalNode LLAVES_C() { return getToken(BNF_CompilerParser.LLAVES_C, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Else_TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_T; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).enterElse_T(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BNF_CompilerListener ) ((BNF_CompilerListener)listener).exitElse_T(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNF_CompilerVisitor ) return ((BNF_CompilerVisitor<? extends T>)visitor).visitElse_T(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_TContext else_T() throws RecognitionException {
		Else_TContext _localctx = new Else_TContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else_T);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ELSE);
			setState(172);
			match(LLAVES_A);
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(173);
				print();
				}
				break;
			case 2:
				{
				setState(174);
				program();
				}
				break;
			}
			setState(177);
			match(LLAVES_C);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\6\2\'\n\2\r\2\16\2(\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\6\6\64\n\6"+
		"\r\6\16\6\65\3\6\3\6\3\7\6\7;\n\7\r\7\16\7<\3\b\6\b@\n\b\r\b\16\bA\3\t"+
		"\3\t\3\t\3\t\5\tH\n\t\3\t\3\t\3\t\5\tM\n\t\3\t\3\t\3\n\3\n\6\nS\n\n\r"+
		"\n\16\nT\3\n\3\n\3\13\3\13\3\13\3\13\3\13\6\13^\n\13\r\13\16\13_\3\13"+
		"\3\13\3\13\3\13\6\13f\n\13\r\13\16\13g\3\13\3\13\3\13\5\13m\n\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fy\n\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\6\f\u0082\n\f\r\f\16\f\u0083\3\f\3\f\3\f\5\f\u0089\n\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0094\n\r\r\r\16\r\u0095\3\r\5\r\u0099"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u009f\n\r\3\r\3\r\3\r\5\r\u00a4\n\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\17"+
		"\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\4\2\3\f\16\16"+
		"\3\2\17\31\3\2\"#\2\u00c9\2&\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2"+
		"\n\60\3\2\2\2\f:\3\2\2\2\16?\3\2\2\2\20C\3\2\2\2\22P\3\2\2\2\24X\3\2\2"+
		"\2\26q\3\2\2\2\30\u008d\3\2\2\2\32\u00a7\3\2\2\2\34\u00ad\3\2\2\2\36\'"+
		"\5\n\6\2\37\'\5\b\5\2 \'\5\6\4\2!\'\5\24\13\2\"\'\5\32\16\2#\'\5\26\f"+
		"\2$\'\5\30\r\2%\'\5\34\17\2&\36\3\2\2\2&\37\3\2\2\2& \3\2\2\2&!\3\2\2"+
		"\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2"+
		"\2\2)\3\3\2\2\2*+\7#\2\2+\5\3\2\2\2,-\7\"\2\2-\7\3\2\2\2./\7!\2\2/\t\3"+
		"\2\2\2\60\63\7!\2\2\61\62\7\26\2\2\62\64\7!\2\2\63\61\3\2\2\2\64\65\3"+
		"\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\27\2\28\13\3\2"+
		"\2\29;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\r\3\2\2\2>@\t"+
		"\3\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\17\3\2\2\2CD\7\r\2\2D"+
		"G\7\23\2\2EH\5\22\n\2FH\5\6\4\2GE\3\2\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2"+
		"\2IL\7\25\2\2JM\5\22\n\2KM\5\6\4\2LJ\3\2\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2"+
		"\2\2NO\7\24\2\2O\21\3\2\2\2PR\7\31\2\2QS\t\4\2\2RQ\3\2\2\2ST\3\2\2\2T"+
		"R\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\31\2\2W\23\3\2\2\2XY\7 \2\2Y]\7\23\2"+
		"\2Z^\5\6\4\2[^\5\b\5\2\\^\5\n\6\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2"+
		"\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ae\5\f\7\2bf\5\6\4\2cf\5\b\5\2df\5\n"+
		"\6\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2"+
		"\2\2ij\7\24\2\2jl\7\17\2\2km\5\2\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7"+
		"\20\2\2op\7\27\2\2p\25\3\2\2\2qr\7\34\2\2rs\7\23\2\2st\7\36\2\2tu\5\6"+
		"\4\2ux\7\7\2\2vy\5\6\4\2wy\5\b\5\2xv\3\2\2\2xw\3\2\2\2yz\3\2\2\2z{\7\27"+
		"\2\2{|\5\6\4\2|}\5\f\7\2}~\5\b\5\2~\177\7\27\2\2\177\u0081\5\6\4\2\u0080"+
		"\u0082\5\f\7\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\24\2\2\u0086"+
		"\u0088\7\17\2\2\u0087\u0089\5\2\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\20\2\2\u008b\u008c\7\27\2\2\u008c"+
		"\27\3\2\2\2\u008d\u008e\7\32\2\2\u008e\u0098\7\23\2\2\u008f\u0090\5\b"+
		"\5\2\u0090\u0091\5\f\7\2\u0091\u0092\5\b\5\2\u0092\u0094\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0099\5\20\t\2\u0098\u0093\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\24\2\2\u009b\u009e\7"+
		"\17\2\2\u009c\u009f\5\2\2\2\u009d\u009f\7\20\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\7\20"+
		"\2\2\u00a1\u00a4\5\2\2\2\u00a2\u00a4\7\20\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\27"+
		"\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\7\23\2\2\u00a9"+
		"\u00aa\5\22\n\2\u00aa\u00ab\7\24\2\2\u00ab\u00ac\7\27\2\2\u00ac\33\3\2"+
		"\2\2\u00ad\u00ae\7\33\2\2\u00ae\u00b1\7\17\2\2\u00af\u00b2\5\32\16\2\u00b0"+
		"\u00b2\5\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\20\2\2\u00b4\35\3\2\2\2\27&(\65"+
		"<AGLT]_eglx\u0083\u0088\u0095\u0098\u009e\u00a3\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}