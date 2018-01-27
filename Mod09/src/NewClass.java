/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NewClass {
    private char var;
    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
        
        NewClass obj1 = new NewClass();
        NewClass obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';
        System.out.println(var1+","+var2);
        System.out.println(obj1.var+","+obj2.var);
        
    }
}
