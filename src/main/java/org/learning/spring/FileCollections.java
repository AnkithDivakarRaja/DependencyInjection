package org.learning.spring;

import java.util.*;

public class FileCollections {

	private List<IOGenerator> ioList;
	private Map<String, IOGenerator> ioMap;
	private Set<IOGenerator> ioSet;
	private Properties ioProperty;
	
	public List<IOGenerator> getIoList() {
		return ioList;
	}
	public void setIoList(List<IOGenerator> ioList) {
		this.ioList = ioList;
	}
	public Map<String, IOGenerator> getIoMap() {
		return ioMap;
	}
	public void setIoMap(Map<String, IOGenerator> ioMap) {
		this.ioMap = ioMap;
	}
	public Set<IOGenerator> getIoSet() {
		return ioSet;
	}
	public void setIoSet(Set<IOGenerator> ioSet) {
		this.ioSet = ioSet;
	}
	public Properties getIoProperty() {
		return ioProperty;
	}
	public void setIoProperty(Properties ioProperty) {
		this.ioProperty = ioProperty;
	}
	
}
