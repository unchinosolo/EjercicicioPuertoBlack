package ar.unlam.puertoBlack;


public abstract class Yate implements Comparable<Yate> {
	
	protected String nombre;
	protected String duenio;
	protected Double mangaAncho;
	protected Double calado;
	protected Double esloraLargo;
	protected Integer tripulacion;
	protected Double peso;
	protected Double precio;
	
	public Yate(String nombre, String duenio, Double mangaAncho, Double calado, Double esloraLargo, Integer tripulacion,
			Double peso) {
		this.nombre = nombre;
		this.duenio = duenio;
		this.mangaAncho = mangaAncho;
		this.calado = calado;
		this.esloraLargo = esloraLargo;
		this.tripulacion = tripulacion;
		this.peso = peso;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public Double getMangaAncho() {
		return mangaAncho;
	}

	public void setMangaAncho(Double mangaAncho) {
		this.mangaAncho = mangaAncho;
	}

	public Double getCalado() {
		return calado;
	}

	public void setCalado(Double calado) {
		this.calado = calado;
	}

	public Double getEsloraLargo() {
		return esloraLargo;
	}

	public void setEsloraLargo(Double esloraLargo) {
		this.esloraLargo = esloraLargo;
	}

	public Integer getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Integer tripulacion) {
		this.tripulacion = tripulacion;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yate other = (Yate) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}		
	
	@Override
	public int compareTo(Yate o) {
		return this.nombre.compareToIgnoreCase(nombre);
	}
	
	

}
