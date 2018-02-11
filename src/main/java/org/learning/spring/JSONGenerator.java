package org.learning.spring;

public class JSONGenerator implements IOGenerator {

	FileNameGenerator nameGen;
	
	@Override
	public void generateOutput() {
		System.out.println("JSON response generated with the name " + nameGen.getFileName());

	}
	
	public FileNameGenerator getNameGen() {
		return nameGen;
	}

	public void setNameGen(FileNameGenerator nameGen) {
		this.nameGen = nameGen;
	}

}
