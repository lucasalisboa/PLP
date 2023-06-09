package li2.plp.expressions2.expression;
import li2.plp.expressions1.util.Tipo;
import li2.plp.expressions1.util.TipoPrimitivo;
import li2.plp.expressions2.memory.AmbienteCompilacao;

public class ValorChar extends ValorConcreto<Character> {

	/**
	 * Cria <code>ValorChar</code> contendo o valor fornecido.
	 */
	public ValorChar(Character valor) {
		super(valor);
	}

	/**
	 * Retorna os tipos possiveis desta expressao.
	 * 
	 * @param amb
	 *            o ambiente de compila��o.
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo(AmbienteCompilacao amb) {
		return TipoPrimitivo.CHAR;
	}

	public ValorChar clone(){
		return new ValorChar(this.valor());
	}
}

    

