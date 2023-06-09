package li2.plp.expressions2.expression;

import li2.plp.expressions1.util.Tipo;
import li2.plp.expressions1.util.TipoPrimitivo;
import li2.plp.expressions2.memory.AmbienteCompilacao;

/**
 * Objetos desta classe encapsulam valor inteiro.
 */
public class ValorInteiro extends ValorConcreto<Integer> {

	/**
	 * Cria <code>ValorInteiro</code> contendo o valor fornecido.
	 */
	public ValorInteiro(Integer valor) {
		super(valor);
	}

	public ValorInteiro(Boolean valor){
		super(BoolMap(valor));
	}

	public ValorInteiro(Character valor){
		super((int)valor);
	}

	/**
	 * Retorna os tipos possiveis desta expressao.
	 * 
	 * @param amb
	 *            o ambiente de compila��o.
	 * @return os tipos possiveis desta expressao.
	 */
	private static Integer BoolMap(boolean valor){
		if(valor){
			return 1;
		}
		else{
			return 0;
		}
	}
	public Tipo getTipo(AmbienteCompilacao amb) {
		return TipoPrimitivo.INTEIRO;
	}

	public ValorInteiro clone(){
		return new ValorInteiro(this.valor());
	}
}
