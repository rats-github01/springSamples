package com.rats.samples.spring.core;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.rats.samples.spring.core.Wisher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
    	Wisher wisher = (Wisher) context.getBean("wellwisher");
    	wisher.wish();
    	((AbstractApplicationContext)context).registerShutdownHook();
        assertTrue( true );
    }
}
