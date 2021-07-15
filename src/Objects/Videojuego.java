package Objects;

public class Videojuego {
	
	//ATRIBUTOS
	private String titulo;
	private double horasJuego;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	
	//CONSTRRUCTORES
	public Videojuego() {
		this("", 10, false, "", "");
	}
	
	public Videojuego(String titulo, double horasEstimadas) {
		this(titulo, horasEstimadas, false, "", "");
	}
	
	public Videojuego(String titulo, double horasJuego, boolean entregado, String genero, String compañia) {
		this.titulo = titulo;
		this.horasJuego = horasJuego;
		this.entregado = entregado;
		this.genero = genero;
		this.compañia = compañia;
	}
	
	//GETTERS & SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getHorasJuego() {
		return horasJuego;
	}

	public void setHorasJuego(double horasJuego) {
		this.horasJuego = horasJuego;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasJuego=" + horasJuego + ", entregado=" + entregado + ", genero="
				+ genero + ", compañia=" + compañia + "]";
	}
	
}
