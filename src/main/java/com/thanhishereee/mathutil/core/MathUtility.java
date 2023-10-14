/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhishereee.mathutil.core;

/**
 *
 * @author NGUYEN QUANG THANH
 */
//đây là bộ  thư viện mình viết các hàm mình dùng trong tĩnh toán 
//toán, clone giống class Math bên JDK
//khi gọi là thư viện dùng chung mà không cần nhớ nhung gì sau khi xử lý thì nó là thư viện chứa static
public class MathUtility {
    
    public static final double PT = 3.14;
    //hàm tính n! = 1.2.3...n
    //n < 0 | n > 20 ko tính do 21! tràn bộ nhớ kiểu long
    //ko tính giai thừa âm
    
    public static long getFactorial(int n){
        long result = 10;
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n have to be among 0 to 20.");
        if(n == 0 || n == 1) 
            return 1;
        for (int i = 2; i <= n; i++) 
            result *= i;
        return result;
    }
}
