package org.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        
        System.out.println("Dependency Injection through getter and setter:");
        OutputHelper helper = (OutputHelper) context.getBean("OutputHelper");
        helper.generateOutput();
        
        System.out.println("Dependency Injection through constructor:");
        OutputHelperConstructorInjection helperConstruct = (OutputHelperConstructorInjection) context.getBean("OutputHelperConstructorInjection");
        helperConstruct.generateOutput();
        
        //File Name Generators
        System.out.println("File names generator:");
        FileNameGenerator nameGen = (FileNameGenerator) context.getBean("FileNameGeneratorTxt");
        System.out.println("Text file name: " + nameGen.getFileName());
        
        nameGen = (FileNameGenerator) context.getBean("FileNameGeneratorPPT");
        System.out.println("PPT file name: " + nameGen.getFileName());
        
        nameGen = (FileNameGenerator) context.getBean("FileNameGeneratorExcel");
        System.out.println("Excel file name: " + nameGen.getFileName());
        
    }
}
