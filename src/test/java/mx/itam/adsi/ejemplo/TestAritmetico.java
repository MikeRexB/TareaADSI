package mx.itam.adsi.ejemplo;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAritmetico {
    private final static Logger LOG = Logger.getLogger(TestAritmetico.class);
    

    
    private Aritmetico a = new Aritmetico();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void minTest() {
        LOG.info("Ejecutando la prueba");
        
        assertEquals(-11,a.min(0,-11));
	assertEquals(-11,a.min(-11,0));
	assertEquals(0,a.min(0,8));
	assertEquals(0,a.min(8,0));
	assertEquals(1,a.min(1,1));
	assertEquals(-11,a.min(8,-11));
    }

    @Test
    public void absTest() {
        LOG.info("Ejecutando la prueba");
        
	assertEquals(11,a.abs(-11));
	assertEquals(0,a.abs(0));
	assertEquals(8,a.abs(8));
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
