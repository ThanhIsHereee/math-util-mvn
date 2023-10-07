/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhishereee.mathutil.main;

import static com.thanhishereee.mathutil.core.MathUtility.getFactorial;
import java.util.Scanner;

/**
 *
 * @author NGUYEN QUANG THANH
 */
public class Main {
    //test thử hàm mình vừa viết tính giai thừa có đúng ko
    //chuẩn bị bộ test data, test case
    //Test case #1: Check if getFactorial() runs
    //                                      well with n = 0
    //Test Procedures:
    //              Given n = 0
    //              Invoke getFactorial()(n = 0)
    //Test case #2: Check if getFactorial() runs
    //                                      well with n = 1
    //Test Procedures:
    //              Given n = 1
    //              Invoke getFactorial()(n = 1)
    
    //Expected Result: 1 //0! == 1????
    public static void main(String[] args) {
        long expected = 1;//giá trị kỳ vọng
        int n = 0;
        long actual = getFactorial(n);//giá trị thực tế
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Number = ");
//        n = Integer.parseInt(sc.nextLine());
        System.out.println(n+"! | expectedValue = "+expected+" | actualValue = "+actual);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Number = ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println(n+"! | expectedValue = "+expected+" | actualValue = "+getFactorial(n));
        if(expected == getFactorial(n))
//            System.out.println("fail");
            System.out.println("Test success at least in this case");
        
    }
}
