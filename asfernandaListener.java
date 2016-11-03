// Generated from asfernanda.txt by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link asfernandaParser}.
 */
public interface asfernandaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link asfernandaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(asfernandaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link asfernandaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(asfernandaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link asfernandaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(asfernandaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link asfernandaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(asfernandaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link asfernandaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(asfernandaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link asfernandaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(asfernandaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link asfernandaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(asfernandaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link asfernandaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(asfernandaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link asfernandaParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(asfernandaParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link asfernandaParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(asfernandaParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link asfernandaParser#classe}.
	 * @param ctx the parse tree
	 */
	void enterClasse(asfernandaParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link asfernandaParser#classe}.
	 * @param ctx the parse tree
	 */
	void exitClasse(asfernandaParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link asfernandaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(asfernandaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link asfernandaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(asfernandaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link asfernandaParser#op_cond}.
	 * @param ctx the parse tree
	 */
	void enterOp_cond(asfernandaParser.Op_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link asfernandaParser#op_cond}.
	 * @param ctx the parse tree
	 */
	void exitOp_cond(asfernandaParser.Op_condContext ctx);
}