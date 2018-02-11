package org.learning.spring;

public class OutputHelperConstructorInjection {

	IOGenerator ioGenerator;

	public OutputHelperConstructorInjection(IOGenerator ioGenerator) {
		this.ioGenerator = ioGenerator;
	}
	
	void generateOutput() {
		ioGenerator.generateOutput();
	}
}
