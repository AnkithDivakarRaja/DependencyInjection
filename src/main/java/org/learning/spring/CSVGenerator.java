package org.learning.spring;

public class CSVGenerator implements IOGenerator {

	FileNameGenerator nameGen;

	@Override
	public void generateOutput() {
		System.out.println("CSV File generated with the name " + nameGen.getFileName());

	}

	public FileNameGenerator getNameGen() {
		return nameGen;
	}

	public void setNameGen(FileNameGenerator nameGen) {
		this.nameGen = nameGen;
	}

}
