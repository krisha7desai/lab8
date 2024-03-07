package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    private MyStack<String> stack;
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
        assertTrue( true );
    }

    public void setUp() {
        stack = new MyStack<>();
    }
    public void testPush() {
        stack.push("first");
        stack.push("second");
        assertEquals("Second element should be on top", "second", stack.peek());
    }

    public void testPop() {
        stack.push("first");
        stack.push("second");
        assertEquals("Pop should return the last element pushed", "second", stack.pop());

    }
}
