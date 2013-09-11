package org.fbgk.ataque.main;

import java.io.IOException;

import org.apache.pivot.wtk.DesktopApplicationContext;
import org.fbgk.ataque.vistas.impl.PantallaPrincipal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The Class Marshaller.
 */
public class Marshaller {

	/** The context. */
	public static ApplicationContext	context;

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(final String[] args) throws IOException {
		context = new ClassPathXmlApplicationContext("/spring/*.xml");
		DesktopApplicationContext.main(PantallaPrincipal.class, new String[] {});
		// atacar();
		// context.getBean(TransformacionServicioImpl.class).actualizarBBDD();
		// final AtaqueDao ataqueDao = (AtaqueDao) context.getBean("ataqueDao");
		// for (final AtaqueDTO ataqueDTO : ataqueDao.recuperarTodo(new
		// AtaqueDTO())) {
		// ataqueDao.eliminar(ataqueDTO);
		// }
		// context.getBean(BarbarosServicioImpl.class).mantenimientoBarbaros((PueblosDTO)
		// ataqueDao.consultar("FROM PueblosDTO WHERE name='ArqAnd'"), 12,
		// ataqueDao.consultar(new ListaAtaquesDTO(), 1));
		// // final URLActionsServicio urlActions =
		// context.getBean(URLActionsImpl.class);
		// for (int i = 0; i < 15; i++) {
		// urlActions.atacarListaBarbaroTodo(1, 2);
		// }

	}

}
