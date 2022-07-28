package com.jbsoft.annotationtest;

@SEImportInterface
public class MassiveWorkflow implements MassiveImportInterface {

	public int batchSize() {
		return 50;
	}

	public int threads() {
		return 1;
	}

	@SEImportInterfaceMethod(name = "NEWWF")
	public void newWorkflow() {
		System.out.println("NEWWF");
	}

}
