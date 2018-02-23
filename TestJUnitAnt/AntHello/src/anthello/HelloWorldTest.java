package anthello;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;

public class HelloWorldTest {
    public HelloWorldTest() {
    }

    /*******
     * PASS
     *******/

    @Test
    public void testShouldPass1() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
    }

    @Test
    public void testShouldPass2() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
    }

    @Test
    public void testShouldPass3() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
        
        //fail("Intentional failure");
    }

    @Test
    public void testShouldPass4() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
    }

    @Test
    public void testShouldPass5() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
    }

    @Test
    public void testShouldPass6() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
        
        //fail("Intentional failure");
    }

    @Test
    public void testShouldPass7() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
    }

    @Test
    public void testShouldPass8() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
    }

    @Test
    public void testShouldPass9() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
        
        //fail("Intentional failure");
    }


    /*******
     * SKIP
     *******/

    @Ignore
    @Test
    public void testSayHelloShouldSkip1() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();

    }

    @Ignore
    @Test
    public void testSayHelloShouldSkip2() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();

    }

    @Ignore
    @Test
    public void testSayHelloShouldSkip3() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();

    }

    @Ignore
    @Test
    public void testSayHelloShouldSkip4() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();

    }

    @Ignore
    @Test
    public void testSayHelloShouldSkip5() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();

    }

    /*******
     * FAIL 
     *******/

    @Test
    public void testSayHelloShouldFail1() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
        
        fail("Intentional failure");
    }

    @Test
    public void testSayHelloShouldFail2() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
        
        fail("Intentional failure");
    }

    @Test
    public void testSayHelloShouldFail3() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
        
        fail("Intentional failure");
    }

}

