package ar.unlam.puertoBlack;

public class YateAVela extends Yate implements IPrecioAmarras {

	private Double alturaMastil;
	private Integer superficieVelicaMayor;
	private Integer superficieTotal;
	private final Double PRECIO_AMARRE = 9000.0;

	public YateAVela(String nombre, String duenio, Double mangaAncho, Double calado, Double esloraLargo,
			Integer tripulacion, Double peso,  Double alturaMastil, Integer superficieVelicaMayor,
			Integer superficieTotal) {
		super(nombre, duenio, mangaAncho, calado, esloraLargo, tripulacion, peso);
		this.alturaMastil = alturaMastil;
		this.superficieVelicaMayor = superficieVelicaMayor;
		this.superficieTotal = superficieTotal;
	}

	public Double getAlturaMastil() {
		return alturaMastil;
	}

	public void setAlturaMastil(Double alturaMastil) {
		this.alturaMastil = alturaMastil;
	}

	public Integer getSuperficieVelicaMayor() {
		return superficieVelicaMayor;
	}

	public void setSuperficieVelicaMayor(Integer superficieVelicaMayor) {
		this.superficieVelicaMayor = superficieVelicaMayor;
	}

	public Integer getSuperficieTotal() {
		return superficieTotal;
	}

	public void setSuperficieTotal(Integer superficieTotal) {
		this.superficieTotal = superficieTotal;
	}

	@Override
	public Double obtenerPrecioDeAmarre(Yate yate) {
		if (yate.getEsloraLargo() <= 20) {
			this.precio = PRECIO_AMARRE + 2000.0;
		} else if (yate.getEsloraLargo() > 20) {
			this.precio = PRECIO_AMARRE + 3000.0;
		}
		return this.precio;
	}

}
