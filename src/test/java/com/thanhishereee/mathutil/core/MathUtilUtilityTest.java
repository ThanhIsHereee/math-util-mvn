/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thanhishereee.mathutil.core;

import com.thanhishereee.math.util.mvn.MathUtilMvn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NGUYEN QUANG THANH
 */
public class MathUtilUtilityTest {
       //Cấu trúc TC : ID | DESC | Steps/Procedures | Expected Result | Status
    //Test Case #1 - Verify getFactorial(with n = 0)
    //Steps:
    //      1. Given n = 0
    //      2. Call/invoke getFactorial(n = 0)
    //Expected Result:
    //          The method must return 1 as the result of 0
    //Status: PASSED | FAILLED đoán xem , chờ code
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //Test Case #2 - Verify getFactorial(with n = 1)
    //Steps:
    //      1. Given n = 1
    //      2. Call/invoke getFactorial(n = 1)
    //Expected Result:
    //          The method must return 1 as the result of 1
    //Status: PASSED | FAILLED đoán xem , chờ code
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    //Test Case #3 - Verify getFactorial(with n = 2)
    //Steps:
    //      1. Given n = 2
    //      2. Call/invoke getFactorial(n = 2)
    //Expected Result:
    //          The method must return 2 as the result of 2
    //Status: PASSED | FAILLED đoán xem , chờ code
    @Test
    public void verifyFactorialGivenRightArgument2ReturnsOk(){
        assertEquals(2, MathUtility.getFactorial(2));
    }
    //Test Case #4 - Verify getFactorial(with n = 5)
    //Steps:
    //      1. Given n = 5
    //      2. Call/invoke getFactorial(n = 5)
    //Expected Result:
    //          The method must return 120 as the result of 5
    //Status: PASSED | FAILLED đoán xem , chờ code
    @Test
    public void verifyFactorialGivenRightArgument3ReturnsOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
