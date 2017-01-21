package com.designParten.creational;

public class Client 
{
    public static void main( String[] args )
    {    	
        System.out.println( "Example for Factory Design parten" );
        
        Client client = new Client();
        
        AbstractGeneratorCreator generator = new GeneratorCreator();        
        client.someMethodThatLogs(generator);
    }
    
    private void someMethodThatLogs(AbstractGeneratorCreator generatorCreater) {
    	
    	/*Generator generator = generatorCreater.createGenerator();
    	generator.generate("Object created");*/
    	
    	Generator generator1 = generatorCreater.createGenerator1("xls");
    	generator1.generate("Object created1");
    	
    }
}
