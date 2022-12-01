/*
 * 
 */
package proyectocasodeprueba;

import java.time.LocalDateTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author charl
 */
public class AguinaldoTest {

    public AguinaldoTest() {
    }

    @Test
    public void testFindbonusError1() {
        System.out.println("findbonus1");
        LocalDateTime startDate = LocalDateTime.of(2022, 04, 12, 14, 33, 48, 123456789);
        LocalDateTime endDate = LocalDateTime.of(2021, 12, 12, 14, 33, 48, 123456789);
        float amount = 350000;
        float expResult = -1;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFindbonusError2() {
        System.out.println("findbonus2");
        LocalDateTime startDate = LocalDateTime.of(2021, 04, 12, 14, 33, 48, 123456789);
        LocalDateTime endDate = LocalDateTime.of(2021, 12, 12, 14, 33, 48, 123456789);
        float amount = 280000;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFindbonusError3() {
        System.out.println("findbonus3");
        LocalDateTime startDate = LocalDateTime.of(2020, 9, 12, 14, 33, 48, 123456789);
        LocalDateTime endDate = LocalDateTime.of(2021, 11, 30, 14, 33, 48, 123456789);
        float amount = 350000;
        float expResult = -3;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testBonus() {
        System.out.println("Test Bonus");
        long moth = 10;
        float amount = 1200000;
        float expResult = 1000000;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Aguinaldo.main(args);
        //fail("The test case is a prototype.");
    }

}
