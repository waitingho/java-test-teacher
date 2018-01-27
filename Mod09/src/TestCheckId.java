/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestCheckId {
    public static void main(String[] args) {
        //1.輸入身分證號
        
        String id = "A123456789";//B183255996
        
        //2.檢查身分證長度為10,並符合格式(可以嘗試用Regular Expression來檢查)
        if(id!=null && id.length()==10){
            //2.1 把身分證號第一ˇ個英文字母轉成對應的整數int
            char firstChar = id.charAt(0);
//            System.out.println("firstchar = " + firstChar);
            int firstNumber = 0; //10~35 
            //ToDO: 請加上英文字源轉成對應的int的轉換程式...
            
            //2.2把firsrnumber依據公式處理
            int n1 = firstNumber/10;
            int n2 = firstNumber%10;
            int sum = n1 + n2*9;
            
            //2.3將身分證字號從第2個數字字員逐個取出後依據公式處理
            //TODO:n3*8 + n4*7 + n5*6 + n6*5 + n7*4 + n8*3 + n9*2 + n10*1 + n11*1....(try to use for loop)
            
            
            //2.4 當sum為10的倍數及為正確
            //TODO: 加上判斷式
//            switch(firstChar){
//                case 'A':
//                    firstNumber = 10;
//                    break;
            }
            
        }else {
            System.out.println(id + "輸入錯誤");
        }
        
    }
   
}
