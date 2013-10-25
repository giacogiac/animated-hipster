package arduinoml.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import arduinoml.*;

public class Main {

	public static void main(String[] args) {
		Machine my = LoadModel("model/yannBUZZ.xmi");
		ToArduinoCode sketch = new ToArduinoCode();
		System.out.println(sketch.doSwitch(my));
	}
	
	protected static Machine LoadModel(String fileName) {
		ResourceSet resources = Setup();
		URI uri = URI.createFileURI(fileName);
		Resource resource = resources.getResource(uri, true);
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			return (Machine) resource.getContents().get(0);
		}
		throw new RuntimeException("Unable to load model!");
	}
	
	private static ResourceSet Setup() {
		ResourceSet resources = new ResourceSetImpl();
		Resource.Factory.Registry registry = resources.getResourceFactoryRegistry();
		registry.getExtensionToFactoryMap().put ("xmi", new XMIResourceFactoryImpl());
		resources.getPackageRegistry().put(ArduinomlPackage.eNS_URI, ArduinomlPackage.eINSTANCE);
		return resources;
	}

}
