package edu.upc.dsa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServirTest {
    @Before
    public void SetUp(){
        ProductManagerImpl.getInstance().addProduct("café", "frío", 5);
        ProductManagerImpl.getInstance().addProduct("café", "caliente", 6);
        ProductManagerImpl.getInstance().addProduct("cocacola", "fría", 10);
    }

    @Test
    public void processOrder() {
        ProductManagerImpl.getInstance().processOrder();
    }
    @After
    public void tearDown() { ProductManagerImpl.delete();}


}
