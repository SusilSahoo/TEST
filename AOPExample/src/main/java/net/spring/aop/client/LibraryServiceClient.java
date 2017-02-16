package net.spring.aop.client;

import net.spring.aop.service.LibraryService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LibraryServiceClient 
{
    private static ApplicationContext applicationContext;

	public static void main( String[] args )
    {
    	String configLocation = "myLibraryAppContext.xml";
    	applicationContext = new ClassPathXmlApplicationContext(configLocation);
    	LibraryService myLibraryService = (LibraryService) applicationContext.getBean("libraryServiceProxy");
    	myLibraryService.issueBook(1, 1);
        myLibraryService.returnBook(2, 2);
        myLibraryService.addBook(3);
    }
}
