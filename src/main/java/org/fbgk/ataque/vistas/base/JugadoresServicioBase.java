package org.fbgk.ataque.vistas.base;

import org.fbgk.ataque.bbdd.AtaqueDao;
import org.fbgk.ataque.vistas.JugadoresServicio;
import org.fbgk.ataque.vistas.UtilVistaServicio;

/**
 * The Class JugadoresServicioBase.
 */
public abstract class JugadoresServicioBase implements JugadoresServicio {

	/** The ataque dao. */
	protected AtaqueDao			ataqueDao;

	/** The util vista servicio. */
	protected UtilVistaServicio	utilVistaServicio;

	/**
	 * Sets the ataque dao.
	 * 
	 * @param ataqueDao
	 *            the new ataque dao
	 */
	public void setAtaqueDao(final AtaqueDao ataqueDao) {
		this.ataqueDao = ataqueDao;
	}

	/**
	 * Sets the util vista servicio.
	 * 
	 * @param utilVistaServicio
	 *            the new util vista servicio
	 */
	public void setUtilVistaServicio(final UtilVistaServicio utilVistaServicio) {
		this.utilVistaServicio = utilVistaServicio;
	}

}
