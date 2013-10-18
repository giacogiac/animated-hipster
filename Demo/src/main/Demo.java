package main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import arduinoml.Machine;

public class Demo {
	
	public static Machine loadFromDSL (String fileName) {
		arduinoml.AMLXStandaloneSetup.doSetup();
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createFileURI(fileName), true);
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			return (Machine) resource.getContents().get(0);
		}
		throw new RuntimeException("Unable to load model !");
	}

	public static void main(String[] args) {
		Machine m = loadFromDSL("model/demo.amlx");
		System.out.println(m.getStart().getName());
	}

}
