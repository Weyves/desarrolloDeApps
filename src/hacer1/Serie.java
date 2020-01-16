package hacer1;

public class Serie extends CadenaTv{

	private String _name;
	
	public Serie(String cadena, String seriesName) {
		super(cadena);
		this._name = seriesName;
		System.out.println("Ha creado " + _name + " en la lista de series de la cadena " + cadena + ".");
	}

}
