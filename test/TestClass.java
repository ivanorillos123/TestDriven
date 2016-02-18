/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import teamivan.TestDrivenMenthods;

public class TestClass {
    
   @Test
        public void addingTwoNumbers()
        {
            TestDrivenMenthods.add(3,2);
            
        }
    @Test
    public void addingTwoNumbersEqualsTwo(){
        Assert.assertEquals(5, TestDrivenMenthods.add(2,3));
    }
    
}
