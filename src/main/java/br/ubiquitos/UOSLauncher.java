package br.ubiquitos;

import br.unb.unbiquitous.ubiquitos.uos.context.ContextException;
import br.unb.unbiquitous.ubiquitos.uos.context.UOSApplicationContext;

public class UOSLauncher {

	/**
	 * @param args
	 * @throws ContextException 
	 */
	public static void main(String[] args) throws ContextException {
		UOSApplicationContext applicationContext = new UOSApplicationContext();
		applicationContext.init();
	}

}
