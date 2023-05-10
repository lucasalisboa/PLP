package li2.plp.expressions2.expression;

import li2.plp.expressions1.util.Tipo;
import li2.plp.expressions1.util.TipoPrimitivo;
import li2.plp.expressions2.memory.AmbienteCompilacao;
import li2.plp.expressions2.memory.AmbienteExecucao;
import li2.plp.expressions2.memory.VariavelJaDeclaradaException;
import li2.plp.expressions2.memory.VariavelNaoDeclaradaException;

/**
* Um objeto desta classe representa uma Expressao de Concatenacao entre
* objetos <code>ValorString</code>
*/
public class ExpConcat extends ExpBinaria{
  

	/**
	 * Controi uma Expressao de Concatenacao com as sub-expressoes especificadas.
	 * Estas sub-expressoes devem ser tais que a avaliacao das mesmas resulta
	 * em <code>ValorString</code>
	 *
	 * @param esq Expressao da esquerda
	 * @param dir Expressao da direita
	 */
	public ExpConcat(Expressao esq, Expressao dir){
		super(esq, dir, "++");
	} 

	/**
	 * Retorna o valor da Expressao de Concatenacao
	 */
	public Valor avaliar(AmbienteExecucao amb) throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		if(getEsq().avaliar(amb) instanceof ValorInteiro && getDir().avaliar(amb) instanceof ValorBooleano){
			ValorString aux_1 = new ValorString(((ValorBooleano) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorInteiro) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorBooleano && getDir().avaliar(amb) instanceof ValorBooleano){
			ValorString aux_1 = new ValorString(((ValorBooleano) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorBooleano) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorInteiro && getDir().avaliar(amb) instanceof ValorInteiro){
			ValorString aux_1 = new ValorString(((ValorInteiro) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorInteiro) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorBooleano && getDir().avaliar(amb) instanceof ValorInteiro){
			ValorString aux_1 = new ValorString(((ValorInteiro) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorBooleano) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorFloat && getDir().avaliar(amb) instanceof ValorBooleano){
			ValorString aux_1 = new ValorString(((ValorBooleano) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorFloat) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorFloat && getDir().avaliar(amb) instanceof ValorBooleano){
			ValorString aux_1 = new ValorString(((ValorFloat) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorBooleano) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorFloat && getDir().avaliar(amb) instanceof ValorFloat){
			ValorString aux_1 = new ValorString(((ValorFloat) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorFloat) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorFloat && getDir().avaliar(amb) instanceof ValorInteiro){
			ValorString aux_1 = new ValorString(((ValorInteiro) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorFloat) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorInteiro && getDir().avaliar(amb) instanceof ValorFloat){
			ValorString aux_1 = new ValorString(((ValorFloat) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorInteiro) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorFloat && getDir().avaliar(amb) instanceof ValorChar){
			ValorString aux_1 = new ValorString(((ValorChar) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorFloat) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorChar && getDir().avaliar(amb) instanceof ValorChar){
			ValorString aux_1 = new ValorString(((ValorChar) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorChar) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorChar && getDir().avaliar(amb) instanceof ValorFloat){
			ValorString aux_1 = new ValorString(((ValorFloat) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorChar) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorChar && getDir().avaliar(amb) instanceof ValorInteiro){
			ValorString aux_1 = new ValorString(((ValorInteiro) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorChar) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorInteiro && getDir().avaliar(amb) instanceof ValorChar){
			ValorString aux_1 = new ValorString(((ValorChar) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorInteiro) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorChar && getDir().avaliar(amb) instanceof ValorBooleano){
			ValorString aux_1 = new ValorString(((ValorBooleano) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorChar) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorBooleano && getDir().avaliar(amb) instanceof ValorChar){
			ValorString aux_1 = new ValorString(((ValorChar) getDir().avaliar(amb)).valor());
			ValorString aux_2 = new ValorString(((ValorBooleano) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorString && getDir().avaliar(amb) instanceof ValorChar){
			ValorString aux_1 = new ValorString(((ValorChar) getDir().avaliar(amb)).valor());
			return new ValorString(((ValorString) getEsq().avaliar(amb)).valor()+ aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorString && getDir().avaliar(amb) instanceof ValorBooleano){
			ValorString aux_1 = new ValorString(((ValorBooleano) getDir().avaliar(amb)).valor());
			return new ValorString(((ValorString) getEsq().avaliar(amb)).valor()+ aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorString && getDir().avaliar(amb) instanceof ValorFloat){
			ValorString aux_1 = new ValorString(((ValorFloat) getDir().avaliar(amb)).valor());
			return new ValorString(((ValorString) getEsq().avaliar(amb)).valor()+ aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorString && getDir().avaliar(amb) instanceof ValorInteiro){
			ValorString aux_1 = new ValorString(((ValorInteiro) getDir().avaliar(amb)).valor());
			return new ValorString(((ValorString) getEsq().avaliar(amb)).valor()+ aux_1.valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorBooleano && getDir().avaliar(amb) instanceof ValorString){
			ValorString aux_2 = new ValorString(((ValorBooleano) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + ((ValorString) getDir().avaliar(amb)).valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorChar && getDir().avaliar(amb) instanceof ValorString){
			ValorString aux_2 = new ValorString(((ValorChar) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + ((ValorString) getDir().avaliar(amb)).valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorInteiro && getDir().avaliar(amb) instanceof ValorString){
			ValorString aux_2 = new ValorString(((ValorInteiro) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + ((ValorString) getDir().avaliar(amb)).valor());
		}
		if(getEsq().avaliar(amb) instanceof ValorFloat && getDir().avaliar(amb) instanceof ValorString){
			ValorString aux_2 = new ValorString(((ValorFloat) getEsq().avaliar(amb)).valor());
			return new ValorString(aux_2.valor() + ((ValorString) getDir().avaliar(amb)).valor());
		}
		return new ValorString(
					( (ValorString) getEsq().avaliar(amb)).valor() +
					( (ValorString) getDir().avaliar(amb)).valor()
		);
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
		return ((getEsq().getTipo(ambiente).eString()||getEsq().getTipo(ambiente).eChar()||getEsq().getTipo(ambiente).eBooleano()||getEsq().getTipo(ambiente).eInteiro()||getEsq().getTipo(ambiente).eFloat()) && (getDir().getTipo(ambiente).eString()||getDir().getTipo(ambiente).eChar()||getDir().getTipo(ambiente).eBooleano()||getDir().getTipo(ambiente).eInteiro()||getDir().getTipo(ambiente).eFloat()));
	}

	/**
	 * Retorna os tipos possiveis desta expressao.
	 *
	 * @param ambiente o ambiente de compila��o.
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo(AmbienteCompilacao ambiente) {
		return TipoPrimitivo.STRING;
	}
	
	@Override
	public ExpBinaria clone() {
		return new ExpConcat(esq.clone(), dir.clone());
	}
}
