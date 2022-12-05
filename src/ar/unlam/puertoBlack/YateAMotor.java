package ar.unlam.puertoBlack;

public class YateAMotor extends Yate implements IPrecioAmarras{
	
	private Double desplazamiento;
	private String propulsionMotor;
	private Integer potencia;
	private Integer velocidad;
	private Integer autonomia;
	private final Double PRECIO_AMARRE = 10000.0;
	private Double precio;
	
	public YateAMotor(String nombre, String duenio, Double mangaAncho, Double calado, Double esloraLargo,
			Integer tripulacion, Double peso, Double desplazamiento, String propulsionMotor,
			Integer potencia, Integer velocidad, Integer autonomia) {
		super(nombre, duenio, mangaAncho, calado, esloraLargo, tripulacion, peso);
		this.desplazamiento = desplazamiento;
		this.propulsionMotor = propulsionMotor;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}
	

	public Double getDesplazamiento() {
		return desplazamiento;
	}


	public void setDesplazamiento(Double desplazamiento) {
		this.desplazamiento = desplazamiento;
	}


	public String getPropulsionMotor() {
		return propulsionMotor;
	}


	public void setPropulsionMotor(String propulsionMotor) {
		this.propulsionMotor = propulsionMotor;
	}


	public Integer getPotencia() {
		return potencia;
	}


	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}


	public Integer getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}


	public Integer getAutonomia() {
		return autonomia;
	}


	public void setAutonomia(Integer autonomia) {
		this.autonomia = autonomia;
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
