package org.fbgk.ataque.vistas.base;

import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.Sheet;
import org.apache.pivot.wtk.Window;
import org.fbgk.ataque.actions.URLActionsServicio;
import org.fbgk.ataque.transformacion.TransformacionServicio;
import org.fbgk.ataque.vistas.GestionAtaquesServicio;
import org.fbgk.ataque.vistas.GestionDistanciaMaxServicio;
import org.fbgk.ataque.vistas.GestionListaAtaquesServicio;
import org.fbgk.ataque.vistas.JugadoresServicio;
import org.fbgk.ataque.vistas.OpcionesServicio;
import org.fbgk.ataque.vistas.ServidorServicio;
import org.fbgk.ataque.vistas.impl.JugadoresServicioImpl;

/**
 * The Class PantallaPrincipalBase.
 */
public abstract class PantallaPrincipalBase extends Window implements Application {

	/** The gestion ataques servicio. */
	protected GestionAtaquesServicio		gestionAtaquesServicio;

	/** The gestion distancia max servicio. */
	protected GestionDistanciaMaxServicio	gestionDistanciaMaxServicio;

	/** The gestion ataques servicio. */
	protected GestionListaAtaquesServicio	gestionListaAtaquesServicio;

	/** The jugadores servicio. */
	protected JugadoresServicio				jugadoresServicio;

	/** The opciones servicio. */
	protected OpcionesServicio				opcionesServicio;

	/** The servidor servicio. */
	protected ServidorServicio				servidorServicio;

	/** The sheet. */
	protected Sheet							sheet;

	/** The transformacion servicio. */
	protected TransformacionServicio		transformacionServicio;

	/** The url actions servicio. */
	protected URLActionsServicio			urlActionsServicio;

	/** The window. */
	protected Window						window;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.pivot.wtk.Application#resume()
	 */
	@Override
	public void resume() throws Exception {

	}

	/**
	 * Sets the gestion ataques servicio.
	 * 
	 * @param gestionAtaquesServicio
	 *            the new gestion ataques servicio
	 */
	public void setGestionAtaquesServicio(final GestionAtaquesServicio gestionAtaquesServicio) {
		this.gestionAtaquesServicio = gestionAtaquesServicio;
	}

	/**
	 * Sets the gestion distancia max servicio.
	 * 
	 * @param gestionDistanciaMaxServicio
	 *            the new gestion distancia max servicio
	 */
	public void setGestionDistanciaMaxServicio(final GestionDistanciaMaxServicio gestionDistanciaMaxServicio) {
		this.gestionDistanciaMaxServicio = gestionDistanciaMaxServicio;
	}

	/**
	 * Sets the gestion lista ataques servicio.
	 * 
	 * @param gestionListaAtaquesServicio
	 *            the new gestion lista ataques servicio
	 */
	public void setGestionListaAtaquesServicio(final GestionListaAtaquesServicio gestionListaAtaquesServicio) {
		this.gestionListaAtaquesServicio = gestionListaAtaquesServicio;
	}

	/**
	 * Sets the jugadores servicio.
	 * 
	 * @param jugadoresServicio
	 *            the new jugadores servicio
	 */
	public void setJugadoresServicio(final JugadoresServicio jugadoresServicio) {
		this.jugadoresServicio = jugadoresServicio;
	}

	/**
	 * Sets the jugadores servicio.
	 * 
	 * @param jugadoresServicio
	 *            the new jugadores servicio
	 */
	public void setJugadoresServicio(final JugadoresServicioImpl jugadoresServicio) {
		this.jugadoresServicio = jugadoresServicio;
	}

	/**
	 * Sets the opciones servicio.
	 * 
	 * @param opcionesServicio
	 *            the new opciones servicio
	 */
	public void setOpcionesServicio(final OpcionesServicio opcionesServicio) {
		this.opcionesServicio = opcionesServicio;
	}

	/**
	 * Sets the servidor servicio.
	 * 
	 * @param servidorServicio
	 *            the new servidor servicio
	 */
	public void setServidorServicio(final ServidorServicio servidorServicio) {
		this.servidorServicio = servidorServicio;
	}

	/**
	 * Sets the transformacion servicio.
	 * 
	 * @param transformacionServicio
	 *            the new transformacion servicio
	 */
	public void setTransformacionServicio(final TransformacionServicio transformacionServicio) {
		this.transformacionServicio = transformacionServicio;
	}

	/**
	 * Sets the url actions servicio.
	 * 
	 * @param urlActionsServicio
	 *            the new url actions servicio
	 */
	public void setUrlActionsServicio(final URLActionsServicio urlActionsServicio) {
		this.urlActionsServicio = urlActionsServicio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.pivot.wtk.Application#shutdown(boolean)
	 */
	@Override
	public boolean shutdown(final boolean arg0) throws Exception {
		this.window.close();
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.pivot.wtk.Application#suspend()
	 */
	@Override
	public void suspend() throws Exception {

	}
}
