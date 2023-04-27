package li2.plp.expressions2.expression;

import li2.plp.expressions1.util.Tipo;
import li2.plp.expressions1.util.TipoPrimitivo;
import li2.plp.expressions2.memory.AmbienteCompilacao;
import li2.plp.expressions2.memory.AmbienteExecucao;
import li2.plp.expressions2.memory.VariavelJaDeclaradaException;
import li2.plp.expressions2.memory.VariavelNaoDeclaradaException;


public class ExpMult extends ExpBinaria {

	/**
	 * Controi uma Expressao de Soma com as sub-expressoes especificadas.
	 * Assume-se que estas sub-expressoes resultam em <code>ValorFloat</code> 
	 * quando avaliadas.
	 * @param esq Expressao da esquerda
	 * @param dir Expressao da direita
	 */
	public ExpMult(Expressao esq, Expressao dir) {
		super(esq, dir, "*");
	}

	/**
	 * Retorna o valor da Expressao de Soma
	 */
	public Valor avaliar(AmbienteExecucao amb) throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		if(getEsq().avaliar(amb) instanceof ValorFloat && getDir().avaliar(amb) instanceof ValorInteiro){
			return new ValorFloat(((ValorFloat) getEsq().avaliar(amb)).valor() *
			((ValorInteiro) getDir().avaliar(amb)).valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorInteiro && getDir().avaliar(amb) instanceof ValorInteiro){
			return new ValorFloat(((ValorInteiro) getEsq().avaliar(amb)).valor() *
			((ValorInteiro) getDir().avaliar(amb)).valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorInteiro && getDir().avaliar(amb) instanceof ValorFloat){
			return new ValorFloat(((ValorInteiro) getEsq().avaliar(amb)).valor() *
			((ValorFloat) getDir().avaliar(amb)).valor());
		}
		return new ValorFloat(
			((ValorFloat) getEsq().avaliar(amb)).valor() *
			((ValorFloat) getDir().avaliar(amb)).valor() );
	}
	
	/**
	 * Realiza a verificacao de tipos desta expressao.
	 *
	 * @param ambiente o ambiente de compila��o.
	 * @return <code>true</code> se os tipos da expressao sao validos;
	 *          <code>false</code> caso contrario.
	 * @exception VariavelNaoDeclaradaException se existir um identificador
	 *          nao declarado no ambiente.
	 * @exception VariavelNaoDeclaradaException se existir um identificador
	 *          declarado mais de uma vez no mesmo bloco do ambiente.
	 */
	protected boolean checaTipoElementoTerminal(AmbienteCompilacao ambiente)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		return ((getEsq().getTipo(ambiente).eFloat()||getEsq().getTipo(ambiente).eInteiro()) && (getDir().getTipo(ambiente).eFloat()||getDir().getTipo(ambiente).eInteiro()));
	}

	/**
	 * Retorna os tipos possiveis desta expressao.
	 *
	 * @param ambiente o ambiente de compila��o.
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo(AmbienteCompilacao ambiente) {
		return TipoPrimitivo.FLOAT;
	}
	
	@Override
	public ExpBinaria clone() {
		return new ExpMult(esq.clone(), dir.clone());
	}
}
