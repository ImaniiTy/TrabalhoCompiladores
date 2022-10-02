/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.analysis;

import sarapatel.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgramaEntrada(AProgramaEntrada node);
    void caseAProdDeclVarProgramaEsq(AProdDeclVarProgramaEsq node);
    void caseAProdDeclConstProgramaEsq(AProdDeclConstProgramaEsq node);
    void caseAProdDeclProcedimentoProgramaDir(AProdDeclProcedimentoProgramaDir node);
    void caseAProdDeclFuncaoProgramaDir(AProdDeclFuncaoProgramaDir node);
    void caseAVarIdProdDeclVar(AVarIdProdDeclVar node);
    void caseAVarIdAtribuicaoProdDeclVar(AVarIdAtribuicaoProdDeclVar node);
    void caseAConstanteProdDeclConst(AConstanteProdDeclConst node);
    void caseAIdAtribuicaoIdAtribuicao(AIdAtribuicaoIdAtribuicao node);
    void caseAArrayCompArrayComp(AArrayCompArrayComp node);
    void caseATipoBaseTipo(ATipoBaseTipo node);
    void caseATipoExpTipo(ATipoExpTipo node);
    void caseATipoInteiroTipoBase(ATipoInteiroTipoBase node);
    void caseATipoBooleanoTipoBase(ATipoBooleanoTipoBase node);
    void caseATipoRealTipoBase(ATipoRealTipoBase node);
    void caseATipoCadeiaTipoBase(ATipoCadeiaTipoBase node);
    void caseAProdDeclProcedimentoProdDeclProcedimento(AProdDeclProcedimentoProdDeclProcedimento node);
    void caseAProdDeclFuncaoProdDeclFuncao(AProdDeclFuncaoProdDeclFuncao node);
    void caseAParametroParametros(AParametroParametros node);
    void caseABarraParametroBarraParametro(ABarraParametroBarraParametro node);
    void caseATipoParametroParametro(ATipoParametroParametro node);
    void caseATipoBaseTipoParametro(ATipoBaseTipoParametro node);
    void caseATipoParametroTipoParametro(ATipoParametroTipoParametro node);
    void caseASeSimplesComandoComandoSe(ASeSimplesComandoComandoSe node);
    void caseASeTernarioComandoComandoSe(ASeTernarioComandoComandoSe node);
    void caseAComandoSe(AComandoSe node);
    void caseAEnquantoComandoComando(AEnquantoComandoComando node);
    void caseAIdAtribuicaoComandoComando(AIdAtribuicaoComandoComando node);
    void caseAChamadaProcedimentoComandoComando(AChamadaProcedimentoComandoComando node);
    void caseABlocoComandosComando(ABlocoComandosComando node);
    void caseABlocoComandosBlocoComandos(ABlocoComandosBlocoComandos node);
    void caseAValorValor(AValorValor node);
    void caseAValorArrayValor(AValorArrayValor node);
    void caseABlocoExpressoesBlocoExpressoes(ABlocoExpressoesBlocoExpressoes node);
    void caseAChamadaFuncaoChamadaFuncao(AChamadaFuncaoChamadaFuncao node);
    void caseAChamadaProcedimentoChamadaProcedimento(AChamadaProcedimentoChamadaProcedimento node);
    void caseAListaExpListaExp(AListaExpListaExp node);
    void caseATernarioTernario(ATernarioTernario node);
    void caseABarraExpBarraExp(ABarraExpBarraExp node);
    void caseAPrio1Exp(APrio1Exp node);
    void caseACompOuExp(ACompOuExp node);
    void caseAPrio2Prio1(APrio2Prio1 node);
    void caseACompEPrio1(ACompEPrio1 node);
    void caseAPrio3Prio2(APrio3Prio2 node);
    void caseAIgualPrio2(AIgualPrio2 node);
    void caseAPrio4Prio3(APrio4Prio3 node);
    void caseAMaiorIgualPrio3(AMaiorIgualPrio3 node);
    void caseAMaiorPrio3(AMaiorPrio3 node);
    void caseAPrio5Prio4(APrio5Prio4 node);
    void caseASomaPrio4(ASomaPrio4 node);
    void caseAMenosPrio4(AMenosPrio4 node);
    void caseAPrio6Prio5(APrio6Prio5 node);
    void caseAMultPrio5(AMultPrio5 node);
    void caseADivPrio5(ADivPrio5 node);
    void caseAModPrio5(AModPrio5 node);
    void caseAPrio7Prio6(APrio7Prio6 node);
    void caseANegacaoPrio6(ANegacaoPrio6 node);
    void caseANegativoPrio6(ANegativoPrio6 node);
    void caseANumeroIntPrio7(ANumeroIntPrio7 node);
    void caseANumeroRealPrio7(ANumeroRealPrio7 node);
    void caseABooleanoPrio7(ABooleanoPrio7 node);
    void caseAPrio7(APrio7 node);
    void caseAValorPrio7(AValorPrio7 node);
    void caseAChamadaFuncaoPrio7(AChamadaFuncaoPrio7 node);
    void caseAArrayCompPrio7(AArrayCompPrio7 node);
    void caseATernarioPrio7(ATernarioPrio7 node);
    void caseABlocoExpressoesPrio7(ABlocoExpressoesPrio7 node);
    void caseAParPrio7(AParPrio7 node);

    void caseTNumeroInt(TNumeroInt node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTNumeroBinario(TNumeroBinario node);
    void caseTDeclVar(TDeclVar node);
    void caseTDeclConst(TDeclConst node);
    void caseTDeclProcedimento(TDeclProcedimento node);
    void caseTDeclFuncao(TDeclFuncao node);
    void caseTCmdSe(TCmdSe node);
    void caseTCmdSenao(TCmdSenao node);
    void caseTCmdEnquanto(TCmdEnquanto node);
    void caseTTipoInteiro(TTipoInteiro node);
    void caseTTipoBooleano(TTipoBooleano node);
    void caseTTipoReal(TTipoReal node);
    void caseTTipoCadeia(TTipoCadeia node);
    void caseTInicioBloco(TInicioBloco node);
    void caseTFimBloco(TFimBloco node);
    void caseTParEsq(TParEsq node);
    void caseTParDir(TParDir node);
    void caseTColEsq(TColEsq node);
    void caseTColDir(TColDir node);
    void caseTAbreComentario(TAbreComentario node);
    void caseTFechaComentario(TFechaComentario node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTPartida(TPartida node);
    void caseTBarra(TBarra node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTIgual(TIgual node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTMaior(TMaior node);
    void caseTNegacao(TNegacao node);
    void caseTCompE(TCompE node);
    void caseTCompOu(TCompOu node);
    void caseTSoma(TSoma node);
    void caseTMenos(TMenos node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTVerdade(TVerdade node);
    void caseTFalso(TFalso node);
    void caseTVazio(TVazio node);
    void caseTCadeia(TCadeia node);
    void caseTComentarioLinha(TComentarioLinha node);
    void caseTComentarioBloco(TComentarioBloco node);
    void caseTId(TId node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
