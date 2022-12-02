/*
 * 
 */
package proyectocasodeprueba;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Guevara Ramirez B93564
 */
public class AguinaldoTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public AguinaldoTest() {
    }

    //Test del caso en el cual la fecha inicial es posterior a la fecha final (del cálculo del bono), retorna -1
    @Test
    public void testFindbonusCode1() {
        System.out.println("findbonus, Code: -1");
        LocalDateTime startDate = LocalDateTime.parse("2022-04-12 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2021-12-12 10:30", formatter);
        float amount = 350000;
        float expResult = -1;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    //Test del caso en el cual la cantidad dada para realizar el calculo del bono es menor a los 300 000, retorna -2
    @Test
    public void testFindbonusCode2() {
        System.out.println("findbonus, Code: -2");
        LocalDateTime startDate = LocalDateTime.parse("2021-04-12 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2021-12-12 10:30", formatter);
        float amount = 280000;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    //Test del caso en el cual el mes de la fecha inicial es previo a diciembre y se encuentra un anno anterior a la fecha de final del calculo del bono, retorna -3
    @Test
    public void testFindbonusCode3() {
        System.out.println("findbonus, Code: -3");
        LocalDateTime startDate = LocalDateTime.parse("2020-09-12 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2021-11-30 10:30", formatter);
        float amount = 350000;
        float expResult = -3;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    //Test de la función findbonus() que devuelve el bonus, retorna el bonus, no un codigo
    @Test
    public void testFindbonusNoCode() {
        System.out.println("Test findbonus, No Codes");
        LocalDateTime startDate = LocalDateTime.parse("2020-12-01 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2021-11-30 10:30", formatter);
        float amount = 1200000;
        float expResult = 1200000;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    //Test del calculo directo del bono
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
