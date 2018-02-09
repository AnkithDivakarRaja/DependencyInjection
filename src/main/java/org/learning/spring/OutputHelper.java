package org.learning.spring;

public class OutputHelper {

	IOGenerator ioGenerator;

	public IOGenerator getIoGenerator() {
		return ioGenerator;
	}

	public void setIoGenerator(IOGenerator ioGenerator) {
		this.ioGenerator = ioGenerator;
	}
	
	void generateOutput() {
		ioGenerator.generateOutput();
	}
}
