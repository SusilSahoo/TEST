package com.designParten.creational;

public class GeneratorCreator extends AbstractGeneratorCreator{

	@Override
	public Generator createGenerator() {
		XMLGenerator logger = new XMLGenerator();
		return logger;
	}

	public Generator createGenerator1(String str) {
		
		Generator generator = null;
		
		switch (str) {
		case "xml":
			generator = new XMLGenerator();
			break;
			
		case "csv":
			generator = new CSVGenerator();
			break;
			
		case "xls":
			generator = new XLSGenerator();
			break;	
			
		default:
			break;
		}
		return generator;
	}
}
