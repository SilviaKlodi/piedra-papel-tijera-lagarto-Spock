package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	Forma valor;
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.valor = forma;
		//Diefinir Constructor//throw new RuntimeException("No implementado aún");
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		
		if (this.valor == Forma.PIEDRA && (otra.valor == Forma.LAGARTO || otra.valor == Forma.TIJERA))
			return Resultado.GANA;
		if (this.valor == Forma.PIEDRA && (otra.valor == Forma.SPOCK || otra.valor == Forma.PAPEL))
			return Resultado.PIERDE;
		
		if (this.valor == Forma.SPOCK && (otra.valor == Forma.TIJERA || otra.valor == Forma.PIEDRA))
			return Resultado.GANA;
		if (this.valor == Forma.SPOCK && (otra.valor == Forma.PAPEL || otra.valor == Forma.LAGARTO))
			return Resultado.PIERDE;
		
		if (this.valor == Forma.PAPEL && (otra.valor == Forma.PIEDRA || otra.valor == Forma.SPOCK))
			return Resultado.GANA;
		if (this.valor == Forma.PAPEL && (otra.valor == Forma.TIJERA || otra.valor == Forma.LAGARTO))
			return Resultado.PIERDE;
		
		if (this.valor == Forma.LAGARTO && (otra.valor == Forma.PAPEL || otra.valor == Forma.SPOCK))
			return Resultado.GANA;
		if (this.valor == Forma.LAGARTO && (otra.valor == Forma.TIJERA || otra.valor == Forma.PIEDRA))
			return Resultado.PIERDE;

		if (this.valor == Forma.TIJERA && (otra.valor == Forma.PAPEL || otra.valor == Forma.LAGARTO))
			return Resultado.GANA;
		if (this.valor == Forma.TIJERA && (otra.valor == Forma.SPOCK || otra.valor == Forma.PIEDRA))
			return Resultado.PIERDE;
		
		return Resultado.EMPATA;
			//throw new RuntimeException("No implementado aún");
	}

}
