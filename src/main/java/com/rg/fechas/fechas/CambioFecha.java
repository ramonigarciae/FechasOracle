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
		if (esUltimoDiaMes(date)) {
			gc.set(Calendar.DATE, 1);
			gc.add(Calendar.MONTH, meses);
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
