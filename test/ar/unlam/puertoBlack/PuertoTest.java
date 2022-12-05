package ar.unlam.puertoBlack;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuertoTest {

	@Test
	public void queExistaUnFondeaderoCon70Amarras() {
		Fondeadero nuevoFondeadero = new Fondeadero(70);
		Integer valorEsperado = 70;
		assertEquals(valorEsperado, nuevoFondeadero.getCantidadMaximaDeAmarras());
	}

	@Test
	public void queSePuedaCrearUnYateAMotor() {

		Yate nuevoYateAMotor = new YateAMotor("AZ1", "Andrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);

		String nombreEsperado = "AZ1";
		String nombreObtenido = nuevoYateAMotor.getNombre();
		assertEquals(nombreEsperado, nombreObtenido);

		String duenioEsperado = "Andrés Borgeat";
		String duenioObtenido = nuevoYateAMotor.getDuenio();
		assertEquals(duenioEsperado, duenioObtenido);
	}

	@Test
	public void queSePuedaCrearUnYateAVela() {

		Yate nuevoYateAVela = new YateAVela("XXR", "Sebastián Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);

		String nombreEsperado = "XXR";
		String nombreObtenido = nuevoYateAVela.getNombre();
		assertEquals(nombreEsperado, nombreObtenido);

		String duenioEsperado = "Sebastián Pardo";
		String duenioObtenido = nuevoYateAVela.getDuenio();
		assertEquals(duenioEsperado, duenioObtenido);
	}

	@Test
	public void queSePuedaAmarrarUnYate() {

		Yate nuevoYateAMotor = new YateAMotor("AZ1", "Andrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);

		Fondeadero amarrarYate = new Fondeadero();
		amarrarYate.amararYate(nuevoYateAMotor);

		Integer valorEsperado = 1;
		Integer valorObtenido = amarrarYate.obtenerCantidadDeYatesAmarrados();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedaDesamarrarUnYate() {
		Yate nuevoYateAVela = new YateAVela("XXR", "Sebastián Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);

		Fondeadero desamarrarYate = new Fondeadero(70);
		desamarrarYate.amararYate(nuevoYateAVela);
		desamarrarYate.desamarrarYate(nuevoYateAVela);

		Integer valorEsperado = 0;
		Integer valorObtenido = desamarrarYate.obtenerCantidadDeYatesAmarrados();

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void testObtenerCantidadDeYatesAmarrados() {
		Fondeadero nuevoFondeadero = new Fondeadero();
		Yate nuevoYateAMotor = new YateAMotor("AZ1", "Andrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		nuevoFondeadero.amararYate(nuevoYateAMotor);

		Yate nuevoYateAVela = new YateAVela("XXR", "Sebastián Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);
		nuevoFondeadero.amararYate(nuevoYateAVela);

		Integer valorEsperado = 1;
		Integer valorObtenido = nuevoFondeadero.obtenerCantidadDeYatesAmarrados();

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void testObtenerPrecioDeAmarre() {
		Fondeadero nuevoFondeadero = new Fondeadero();
		Yate nuevoYateAMotor = new YateAMotor("AZ1", "Andrés Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		nuevoFondeadero.amararYate(nuevoYateAMotor);
		
		Double precioEsperado = 13000.0;
		Double precioObtenido = nuevoFondeadero.obtenerPrecioDeAmarre(nuevoYateAMotor);
		
		assertEquals(precioEsperado, precioObtenido);

	}

}
