package com.rg.fechas.fechas;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

class CambioFechaTest {

	@Test
	void testAgregarMesesFormatOracleEnero1() {
		CambioFecha cf =  new CambioFecha();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2020, 0, 1);
		String expected = "01/02/2020";
		
		Date date= gc.getTime();
		Date nuevaFecha =cf.agregarMesesFormatOracle(date, 1);
		
		String fechaConFormato = formatFecha(nuevaFecha);
		
		assertEquals(expected, fechaConFormato); 
	}

	
	@Test
	void testAgregarMesesFormatOracleEnero3() {
		CambioFecha cf =  new CambioFecha();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2020, 0, 3);
		String expected = "03/02/2020";
		
		Date date= gc.getTime();
		Date nuevaFecha =cf.agregarMesesFormatOracle(date, 1);
		
		String fechaConFormato = formatFecha(nuevaFecha);
		
		assertEquals(expected, fechaConFormato); 
	}
	
	@Test
	void testAgregarMesesFormatOracleEnero6() {
		CambioFecha cf =  new CambioFecha();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2020, 0, 6);
		String expected = "06/02/2020";
		
		Date date= gc.getTime();
		Date nuevaFecha =cf.agregarMesesFormatOracle(date, 1);
		
		String fechaConFormato = formatFecha(nuevaFecha);
		
		assertEquals(expected, fechaConFormato); 
	}
	
	
	@Test
	void testAgregarMesesFormatOracleEnero10() {
		CambioFecha cf =  new CambioFecha();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2020, 0, 10);
		String expected = "10/02/2020";
		
		Date date= gc.getTime();
		Date nuevaFecha =cf.agregarMesesFormatOracle(date, 1);
		
		String fechaConFormato = formatFecha(nuevaFecha);
		
		assertEquals(expected, fechaConFormato); 
	}
	
	@Test
	void testAgregarMesesFormatOracleEnero13() {
		CambioFecha cf =  new CambioFecha();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2020, 0, 13);
		String expected = "13/02/2020";
		
		Date date= gc.getTime();
		Date nuevaFecha =cf.agregarMesesFormatOracle(date, 1);
		
		String fechaConFormato = formatFecha(nuevaFecha);
		
		assertEquals(expected, fechaConFormato); 
	}
	
	@Test
	void testAgregarMesesFormatOracleEnero20() {
		CambioFecha cf =  new CambioFecha();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2020, 0, 20);
		String expected = "20/02/2020";
		
		Date date= gc.getTime();
		Date nuevaFecha =cf.agregarMesesFormatOracle(date, 1);
		
		String fechaConFormato = formatFecha(nuevaFecha);
		
		assertEquals(expected, fechaConFormato); 
	}
	
	
	@Test
	void testAgregarMesesFormatOracleEnero31() {
		CambioFecha cf =  new CambioFecha();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2020, 0, 31);
		String expected = "29/02/2020";
		
		Date date= gc.getTime();
		Date nuevaFecha =cf.agregarMesesFormatOracle(date, 1);
		
		String fechaConFormato = formatFecha(nuevaFecha);
		
		assertEquals(expected, fechaConFormato); 
	}
	
	
	@Test
	void testAgregarMesesFormatOracleFebrero28() {
		CambioFecha cf =  new CambioFecha();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2020, 1, 28);
		String expected = "28/03/2020";
		
		Date date= gc.getTime();
		Date nuevaFecha =cf.agregarMesesFormatOracle(date, 1);
		
		String fechaConFormato = formatFecha(nuevaFecha);
		
		assertEquals(expected, fechaConFormato); 
	}
	
	

	@Test
	void testAgregarMesesFormatOracleFebrero29() {
		CambioFecha cf =  new CambioFecha();
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2020, 1, 29);
		String expected = "31/03/2020";
		
		Date date= gc.getTime();
		Date nuevaFecha =cf.agregarMesesFormatOracle(date, 1);
		
		String fechaConFormato = formatFecha(nuevaFecha);
		
		assertEquals(expected, fechaConFormato); 
	}
	
	

	
	
	
	
	@Test
	void tesUltimoDia_false() {
		Date date = new Date();
		CambioFecha cf = new CambioFecha();
		boolean esUltimoDia = cf.esUltimoDiaMes(date);
		assertFalse(esUltimoDia);
	}
	
	private String formatFecha(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}
}
