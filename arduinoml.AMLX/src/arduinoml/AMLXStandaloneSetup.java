package arduinoml;

import arduinoml.impl.ArduinomlPackageImpl;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AMLXStandaloneSetup extends AMLXStandaloneSetupGenerated{

	public static void doSetup() {
		new AMLXStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		ArduinomlPackageImpl.init();
		return super.createInjectorAndDoEMFRegistration();
	}
	
}

