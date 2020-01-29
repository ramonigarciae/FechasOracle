package com.rg.fechas.fechas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CambioFecha {

	/**
	 * Agrega una cantidad de meses a una fecha dada, pero si la fecha ingresada es
	 * el último día del mes, la nueva fecha es es el último día del mes
	 * 
	 * @param date Fecha
	 * @param meses Cantidad de meses a agregar
	 * @return Nueva fecha
	 */
	public Date agregarMesesFormatOracle(Date date, int meses) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		// Si es el último día
		if (esUltimoDiaMes(date)) {
			// Se asigna la fecha al primer día del mes
			gc.set(Calendar.DATE, 1);
			// Se agrega la cantidad de meses, permaneciendo en el primer día
			gc.add(Calendar.MONTH, meses);
			// Se asigna el último día del mes a la fecha
			gc.set(Calendar.DATE, gc.getActualMaximum(Calendar.DAY_OF_MONTH));
		} else {
			gc.add(Calendar.MONTH, meses);
		}
		return gc.getTime();
	}

	/**
	 * Verifica si la fecha es el último día del mes
	 * @param date Fecha
	 * @return Confirmación de último día del mes
	 */
	public boolean esUltimoDiaMes(Date date) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);

		int ultimoDia = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		int diaActual = gc.get(Calendar.DAY_OF_MONTH);

		return ultimoDia == diaActual;
	}
}
