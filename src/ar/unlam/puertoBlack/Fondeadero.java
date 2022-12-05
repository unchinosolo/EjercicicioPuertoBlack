package ar.unlam.puertoBlack;

import java.util.Set;
import java.util.TreeSet;


public class Fondeadero implements IPrecioAmarras{
	
	private Integer CantidadMaximaDeAmarras;
	private Set<Yate> YatesAmarrados = new TreeSet<Yate>();
	private Double recaudacionTotal;
	
	public Fondeadero() {
		
	}

	public Fondeadero(Integer cantidadMaximaDeAmarras) {
		this.CantidadMaximaDeAmarras = cantidadMaximaDeAmarras;
	}

	public Integer getCantidadMaximaDeAmarras() {
		return CantidadMaximaDeAmarras;
	}

	public void setCantidadMaximaDeAmarras(Integer cantidadMaximaDeAmarras) {
		CantidadMaximaDeAmarras = cantidadMaximaDeAmarras;
	}
	
	public void amararYate(Yate yate) {
		this.YatesAmarrados.add(yate);
	}
	
	public void desamarrarYate(Yate yate) {
		this.YatesAmarrados.remove(yate);
	}
	
	public Integer obtenerCantidadDeYatesAmarrados() {
		return this.YatesAmarrados.size();
	}
	
	public Integer obtenerCantidadDeAmarrasDisponibles() {
		Integer amarrasLibres = getCantidadMaximaDeAmarras() - this.YatesAmarrados.size();
		return amarrasLibres;
	}

	@Override
	public Double obtenerPrecioDeAmarre(Yate yate) {
		return yate.getPrecio();
	}
	
	public Double obtenerRecaudacionTotal() {
		for (Yate yate : YatesAmarrados) {
			recaudacionTotal += yate.getPrecio();
		}
		return this.recaudacionTotal;
	}

	
	
	
		
	
	
	
	

}
