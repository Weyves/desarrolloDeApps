package hacer1;

import java.util.List;

public class CadenaTv {
	
	private static String _nombre;
	private static List<Serie> _series;
	
	public CadenaTv(String nombre) {
		this._nombre = nombre;
	}
	
	public static void addSerie(String addSerie) {
		Serie serie = new Serie(_nombre, addSerie);
		_series.add(serie);
	}
	
	public static List<Serie> getSeries(){
		return _series;
	}

}
