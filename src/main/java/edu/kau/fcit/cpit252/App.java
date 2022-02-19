package edu.kau.fcit.cpit252;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "Accord", 2019);
        // print car and recall info
        System.out.println(c1);
        // create a duplicate car object to print the recall info in a table
        
        
        
        
        
        try {
        Car c2 = Car.CloneCar(c1);
        RecallViewer rv = new RecallViewer(c2);
        rv.printTableView();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
        }
        
       
        
        
        
       
    }
}
