/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestAssignment {
    public static void main(String[] args) {
        //以下為基本 +=, *= ㄉ示範    
        byte x = 20;
        x += 100* 3.5 % '2';//強迫轉型 , x = (byte)(x + (100 * 3.5 % '2'))
        System.out.println( "x = " + x);
        
        short y = 5;
        y *= x + 320; // y = (short)(y (x+320))
        System.out.println("y = " +y);


        //以下為基本=示範
        System.out.println("************************************************");
        int a,b,c = 1 ;
        a = 100;
//        c = b;//編譯失敗 因為b沒指派初值
        b = a+1;
        
        System.out.println("b: "+ b);
        c = b;
        System.out.println(c);
        
        //promotion
        
        byte a1;
        a1 = 100;
        int b1;
        b1 = a1;
        
        char d1 = '1';
        
        c = d1;
        System.out.println("c = "+c);
        
        long e = c;
        System.out.println("e = " + e);
        
        //casting(轉型)
        
       int k = 65;
       char d2 =(char) k;
        System.out.println("d2 = " +d2);
        
        double d = -1234.5;
        b = (byte)d;
        System.out.println("b =" +b);
        
        
    }
    
}
