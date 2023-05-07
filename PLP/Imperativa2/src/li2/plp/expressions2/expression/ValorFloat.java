package li2.plp.expressions2.expression;
import li2.plp.expressions1.util.Tipo;
import li2.plp.expressions1.util.TipoPrimitivo;
import li2.plp.expressions2.memory.AmbienteCompilacao;

public class ValorFloat extends ValorConcreto<Float> {

	/**
	 * Cria <code>ValorFloat</code> contendo o valor fornecido.
	 */

	public ValorFloat(Float valor) {
		super(valor);
	}

	public ValorFloat(Integer valor){
		super((float) valor);
	}
	
	public ValorFloat(Boolean valor){
		super(BoolMap(valor));
	}

	/**
	 * Retorna os tipos possiveis desta expressao.
	 * 
	 * @param amb
	 *            o ambiente de compila��o.
	 * @return os tipos possiveis desta expressao.
	 */
	private static float BoolMap(Boolean valor){
		if(valor){
			return 1;
		}
		else{
			return 0;
		}
	}

	public Tipo getTipo(AmbienteCompilacao amb) {
		return TipoPrimitivo.FLOAT;
	}

	public ValorFloat clone(){
		return new ValorFloat(this.valor());
	}
}

    

