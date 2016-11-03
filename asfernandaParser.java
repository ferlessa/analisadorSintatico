// Generated from asfernanda.txt by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class asfernandaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ADDOP=16, MULOP=17, 
		OP_LOGICO=18, OP_RELACIONAL=19, OP_ATRIBUICAO=20, COMMENTS=21, WS=22, 
		TIPO_DADO=23, DECLARACAO_METODO=24, ID=25, NUM=26;
	public static final int
		RULE_expr = 0, RULE_term = 1, RULE_variavel = 2, RULE_atribuicao = 3, 
		RULE_metodo = 4, RULE_classe = 5, RULE_declaracao = 6, RULE_op_cond = 7;
	public static final String[] ruleNames = {
		"expr", "term", "variavel", "atribuicao", "metodo", "classe", "declaracao", 
		"op_cond"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'void'", "'('", "')'", "'{'", "'}'", "'class'", "'extends'", 
		"'if'", "'else'", "'while'", "'for'", "'System.out.println'", "'sout'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ADDOP", "MULOP", "OP_LOGICO", "OP_RELACIONAL", 
		"OP_ATRIBUICAO", "COMMENTS", "WS", "TIPO_DADO", "DECLARACAO_METODO", "ID", 
		"NUM"
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

	@Override
	public String getGrammarFileName() { return "asfernanda.txt"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public asfernandaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADDOP() { return getToken(asfernandaParser.ADDOP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(17);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(24);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(19);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(20);
					match(ADDOP);
					setState(21);
					term(0);
					}
					} 
				}
				setState(26);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(asfernandaParser.NUM, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULOP() { return getToken(asfernandaParser.MULOP, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(28);
			match(NUM);
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(30);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(31);
					match(MULOP);
					setState(32);
					match(NUM);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode TIPO_DADO() { return getToken(asfernandaParser.TIPO_DADO, 0); }
		public TerminalNode ID() { return getToken(asfernandaParser.ID, 0); }
		public TerminalNode NUM() { return getToken(asfernandaParser.NUM, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variavel);
		try {
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(TIPO_DADO);
				setState(39);
				match(ID);
				setState(40);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(TIPO_DADO);
				setState(42);
				match(ID);
				setState(43);
				match(T__1);
				setState(44);
				match(NUM);
				setState(45);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(ID);
				}
				break;
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(asfernandaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TIPO_DADO() { return getToken(asfernandaParser.TIPO_DADO, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if (_la==TIPO_DADO) {
				{
				setState(49);
				match(TIPO_DADO);
				}
			}

			setState(52);
			match(ID);
			setState(53);
			match(T__1);
			setState(54);
			expr(0);
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

	public static class MetodoContext extends ParserRuleContext {
		public TerminalNode DECLARACAO_METODO() { return getToken(asfernandaParser.DECLARACAO_METODO, 0); }
		public List<TerminalNode> ID() { return getTokens(asfernandaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(asfernandaParser.ID, i);
		}
		public List<TerminalNode> TIPO_DADO() { return getTokens(asfernandaParser.TIPO_DADO); }
		public TerminalNode TIPO_DADO(int i) {
			return getToken(asfernandaParser.TIPO_DADO, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).exitMetodo(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(DECLARACAO_METODO);
			setState(57);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==TIPO_DADO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(58);
			match(ID);
			setState(59);
			match(T__3);
			setState(60);
			match(TIPO_DADO);
			setState(61);
			match(ID);
			setState(62);
			match(T__4);
			setState(63);
			match(T__5);
			setState(65);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(64);
				expr(0);
				}
			}

			setState(67);
			match(T__6);
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

	public static class ClasseContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(asfernandaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(asfernandaParser.ID, i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).exitClasse(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__7);
			setState(70);
			match(ID);
			setState(73);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(71);
				match(T__8);
				setState(72);
				match(ID);
				}
			}

			setState(75);
			match(T__5);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << TIPO_DADO) | (1L << DECLARACAO_METODO) | (1L << ID))) != 0)) {
				{
				{
				setState(76);
				declaracao();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__6);
			{
			setState(83);
			match(T__6);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public Op_condContext op_cond() {
			return getRuleContext(Op_condContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(asfernandaParser.OP_ATRIBUICAO, 0); }
		public TerminalNode OP_RELACIONAL() { return getToken(asfernandaParser.OP_RELACIONAL, 0); }
		public TerminalNode NUM() { return getToken(asfernandaParser.NUM, 0); }
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao);
		int _la;
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__5);
				{
				setState(86);
				declaracao();
				}
				setState(87);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__9);
				setState(90);
				match(T__3);
				setState(91);
				op_cond();
				setState(92);
				match(T__4);
				setState(93);
				declaracao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__9);
				setState(96);
				match(T__3);
				setState(97);
				op_cond();
				setState(98);
				match(T__4);
				setState(99);
				declaracao();
				setState(100);
				match(T__10);
				setState(101);
				declaracao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				match(T__11);
				setState(104);
				match(T__3);
				setState(105);
				op_cond();
				setState(106);
				match(T__4);
				setState(107);
				match(T__5);
				setState(111);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(108);
					expr(0);
					}
					break;
				case 2:
					{
					setState(109);
					declaracao();
					}
					break;
				case 3:
					{
					setState(110);
					variavel();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				_la = _input.LA(1);
				if (_la==TIPO_DADO || _la==ID) {
					{
					setState(113);
					variavel();
					setState(114);
					match(OP_ATRIBUICAO);
					}
				}

				setState(118);
				match(T__0);
				setState(119);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(T__12);
				setState(121);
				match(T__3);
				setState(122);
				variavel();
				setState(123);
				variavel();
				setState(124);
				match(OP_RELACIONAL);
				setState(125);
				match(NUM);
				setState(126);
				match(T__0);
				setState(127);
				variavel();
				setState(128);
				match(OP_ATRIBUICAO);
				setState(129);
				match(T__4);
				setState(130);
				match(T__5);
				setState(134);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(131);
					expr(0);
					}
					break;
				case 2:
					{
					setState(132);
					declaracao();
					}
					break;
				case 3:
					{
					setState(133);
					variavel();
					}
					break;
				}
				setState(136);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				match(T__13);
				setState(139);
				match(T__3);
				setState(143);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(140);
					expr(0);
					}
					break;
				case 2:
					{
					setState(141);
					variavel();
					}
					break;
				case 3:
					{
					setState(142);
					match(NUM);
					}
					break;
				}
				setState(145);
				match(T__4);
				setState(146);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				match(T__14);
				setState(148);
				match(T__3);
				setState(149);
				expr(0);
				setState(150);
				match(T__4);
				setState(151);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				metodo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				variavel();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(155);
				atribuicao();
				}
				break;
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

	public static class Op_condContext extends ParserRuleContext {
		public TerminalNode OP_RELACIONAL() { return getToken(asfernandaParser.OP_RELACIONAL, 0); }
		public List<TerminalNode> NUM() { return getTokens(asfernandaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(asfernandaParser.NUM, i);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public Op_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).enterOp_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asfernandaListener ) ((asfernandaListener)listener).exitOp_cond(this);
		}
	}

	public final Op_condContext op_cond() throws RecognitionException {
		Op_condContext _localctx = new Op_condContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_op_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(158);
				match(NUM);
				}
				break;
			case TIPO_DADO:
			case ID:
				{
				setState(159);
				variavel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(162);
			match(OP_RELACIONAL);
			setState(165);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(163);
				match(NUM);
				}
				break;
			case TIPO_DADO:
			case ID:
				{
				setState(164);
				variavel();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 1:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3$\n"+
		"\3\f\3\16\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5"+
		"\5\5\65\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6D\n"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7L\n\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\b\3\b\3\b\5\b"+
		"w\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0089\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009f\n\b\3\t\3\t\5\t\u00a3\n\t\3\t"+
		"\3\t\3\t\5\t\u00a8\n\t\3\t\2\4\2\4\n\2\4\6\b\n\f\16\20\2\3\4\2\5\5\31"+
		"\31\u00bc\2\22\3\2\2\2\4\35\3\2\2\2\6\61\3\2\2\2\b\64\3\2\2\2\n:\3\2\2"+
		"\2\fG\3\2\2\2\16\u009e\3\2\2\2\20\u00a2\3\2\2\2\22\23\b\2\1\2\23\24\5"+
		"\4\3\2\24\32\3\2\2\2\25\26\f\4\2\2\26\27\7\22\2\2\27\31\5\4\3\2\30\25"+
		"\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\3\3\2\2\2\34\32"+
		"\3\2\2\2\35\36\b\3\1\2\36\37\7\34\2\2\37%\3\2\2\2 !\f\4\2\2!\"\7\23\2"+
		"\2\"$\7\34\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%"+
		"\3\2\2\2()\7\31\2\2)*\7\33\2\2*\62\7\3\2\2+,\7\31\2\2,-\7\33\2\2-.\7\4"+
		"\2\2./\7\34\2\2/\62\7\3\2\2\60\62\7\33\2\2\61(\3\2\2\2\61+\3\2\2\2\61"+
		"\60\3\2\2\2\62\7\3\2\2\2\63\65\7\31\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\7\33\2\2\678\7\4\2\289\5\2\2\29\t\3\2\2\2:;\7\32\2\2"+
		";<\t\2\2\2<=\7\33\2\2=>\7\6\2\2>?\7\31\2\2?@\7\33\2\2@A\7\7\2\2AC\7\b"+
		"\2\2BD\5\2\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\t\2\2F\13\3\2\2\2GH\7"+
		"\n\2\2HK\7\33\2\2IJ\7\13\2\2JL\7\33\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2"+
		"MQ\7\b\2\2NP\5\16\b\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2"+
		"\2SQ\3\2\2\2TU\7\t\2\2UV\7\t\2\2V\r\3\2\2\2WX\7\b\2\2XY\5\16\b\2YZ\7\t"+
		"\2\2Z\u009f\3\2\2\2[\\\7\f\2\2\\]\7\6\2\2]^\5\20\t\2^_\7\7\2\2_`\5\16"+
		"\b\2`\u009f\3\2\2\2ab\7\f\2\2bc\7\6\2\2cd\5\20\t\2de\7\7\2\2ef\5\16\b"+
		"\2fg\7\r\2\2gh\5\16\b\2h\u009f\3\2\2\2ij\7\16\2\2jk\7\6\2\2kl\5\20\t\2"+
		"lm\7\7\2\2mq\7\b\2\2nr\5\2\2\2or\5\16\b\2pr\5\6\4\2qn\3\2\2\2qo\3\2\2"+
		"\2qp\3\2\2\2r\u009f\3\2\2\2st\5\6\4\2tu\7\26\2\2uw\3\2\2\2vs\3\2\2\2v"+
		"w\3\2\2\2wx\3\2\2\2xy\7\3\2\2y\u009f\7\t\2\2z{\7\17\2\2{|\7\6\2\2|}\5"+
		"\6\4\2}~\5\6\4\2~\177\7\25\2\2\177\u0080\7\34\2\2\u0080\u0081\7\3\2\2"+
		"\u0081\u0082\5\6\4\2\u0082\u0083\7\26\2\2\u0083\u0084\7\7\2\2\u0084\u0088"+
		"\7\b\2\2\u0085\u0089\5\2\2\2\u0086\u0089\5\16\b\2\u0087\u0089\5\6\4\2"+
		"\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\7\t\2\2\u008b\u009f\3\2\2\2\u008c\u008d\7\20\2\2"+
		"\u008d\u0091\7\6\2\2\u008e\u0092\5\2\2\2\u008f\u0092\5\6\4\2\u0090\u0092"+
		"\7\34\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0094\7\7\2\2\u0094\u009f\7\3\2\2\u0095\u0096"+
		"\7\21\2\2\u0096\u0097\7\6\2\2\u0097\u0098\5\2\2\2\u0098\u0099\7\7\2\2"+
		"\u0099\u009a\7\3\2\2\u009a\u009f\3\2\2\2\u009b\u009f\5\n\6\2\u009c\u009f"+
		"\5\6\4\2\u009d\u009f\5\b\5\2\u009eW\3\2\2\2\u009e[\3\2\2\2\u009ea\3\2"+
		"\2\2\u009ei\3\2\2\2\u009ev\3\2\2\2\u009ez\3\2\2\2\u009e\u008c\3\2\2\2"+
		"\u009e\u0095\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\17\3\2\2\2\u00a0\u00a3\7\34\2\2\u00a1\u00a3\5\6\4\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\7\25"+
		"\2\2\u00a5\u00a8\7\34\2\2\u00a6\u00a8\5\6\4\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\21\3\2\2\2\20\32%\61\64CKQqv\u0088\u0091\u009e\u00a2"+
		"\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}