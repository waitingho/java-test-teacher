/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestStringOperator {
    public static void main(String[] args) {
        String s;
        
        s = "Hello, " + "price:" + 500 + ",庫存:" + true + 1.5 + '3';
        System.out.println("s = " + s);
        
        s = "Hello, " + 500 /12 ;
        System.out.println("s = " + s);
        
        s = "Hello, price: " + (500 + '元') ;
        System.out.println("s = " + s);

        s = true + (5.0 + "Hello");
        System.out.println("s="+s);        
    }
}
