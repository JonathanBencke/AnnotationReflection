package com.jbsoft.annotationtest;

@SEImportInterface
public class MassiveDocument implements MassiveImportInterface {

	public int batchSize() {
		return 50;
	}

	public int threads() {
		return 1;
	}

	@SEImportInterfaceMethod(name = "NEWDOC")
	public void newDocument() {
		System.out.println("NEWDOC");
	}

	@SEImportInterfaceMethod(name = "NEWATTRI")
	public void newAttribute() {
		System.out.println("NEWATTRI");
	}

}
