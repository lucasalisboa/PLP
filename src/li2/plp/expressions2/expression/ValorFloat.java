package li2.plp.expressions2.expression;
import li2.plp.expressions1.util.Tipo;
import li2.plp.expressions1.util.TipoPrimitivo;
import li2.plp.expressions2.memory.AmbienteCompilacao;


public class ValorFloat extends ValorConcreto<Float> {

	/**
	 * cria um objeto encapsulando o String fornecido
	 */
	public ValorFloat(Float valor) {
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
		return TipoPrimitivo.FLOAT;
	}

	@Override
	public String toString() {
		return String.format("\"%s\"", super.toString());
	}
	
	public ValorFloat clone() {
		return new ValorFloat(this.valor());
	}
}