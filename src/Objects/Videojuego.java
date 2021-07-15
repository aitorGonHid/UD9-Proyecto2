package Objects;

public class Videojuego {
	
	//ATRIBUTOS
	private String titulo;
	private double horasJuego;
	private boolean entregado;
	private String genero;
	private String compa�ia;
	
	
	//CONSTRRUCTORES
	public Videojuego() {
		this("", 10, false, "", "");
	}
	
	public Videojuego(String titulo, double horasEstimadas) {
		this(titulo, horasEstimadas, false, "", "");
	}
	
	public Videojuego(String titulo, double horasJuego, boolean entregado, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasJuego = horasJuego;
		this.entregado = entregado;
		this.genero = genero;
		this.compa�ia = compa�ia;
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasJuego=" + horasJuego + ", entregado=" + entregado + ", genero="
				+ genero + ", compa�ia=" + compa�ia + "]";
	}
	
}
