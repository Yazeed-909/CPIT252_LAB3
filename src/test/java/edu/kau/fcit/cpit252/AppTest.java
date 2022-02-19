package edu.kau.fcit.cpit252;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void assertClonesNotEqual(){
        try {
            Car c1 = new Car("Honda", "Accord", 2019);
            // Make a clone
            Car c2 =Car.CloneCar(c1);
            
            
            System.out.println("-----------------------------------------------------");
            System.out.println("Car 1 hashCode:"+c1.hashCode());
            System.out.println("make: "+c1.make+" model: "+c1.model+" year: "+c1.year);

            System.out.println("Car 2 hashCode:"+c2.hashCode());
            System.out.println("make: "+c2.make+" model: "+c2.model+" year: "+c2.year);
            System.out.println("-----------------------------------------------------");
            
            
            
            
            assertNotEquals(c1, c2);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(AppTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
