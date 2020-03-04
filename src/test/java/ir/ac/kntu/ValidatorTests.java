package ir.ac.kntu;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author Mahvari
 */
public class ValidatorTests {

    @BeforeAll
    public static void setUp(){
        System.err.println("#### Starting Unit Tests | Validator ####");
    }

    @Test
    public void testCheckName1(){
        String name = "lol";
        Assertions.assertTrue(Validator.checkName(name),
                "wrong method implementation - name is valid");
    }

    @Test
    public void testCheckName2(){
        String name = "NO";
        Assertions.assertFalse(Validator.checkName(name),
                "wrong method implementation - name is not valid");
    }

    @Test
    public void testCheckName3(){
        String name = "GREETINGS";
        Assertions.assertTrue(Validator.checkName(name),
                "wrong method implementation - name is valid");
    }

    @Test
    public void testCheckEmail1(){
        String email = "lol@lol.com";
        Assertions.assertTrue(Validator.checkEmail(email),
                "wrong method implementation - email format is correct");
    }

    @Test
    public void testCheckEmail2(){
        String email = "lol@lol";
        Assertions.assertFalse(Validator.checkEmail(email),
                "wrong method implementation - email format is incorrect");
    }

    @Test
    public void testCheckEmail3(){
        String email = "xd@pew.org";
        Assertions.assertFalse(Validator.checkEmail(email),
                "wrong method implementation - email format is incorrect");
    }

    @Test public void testCheckMobile1(){
        String mobileNum = "09123456789";
        Assertions.assertTrue(Validator.checkMobile(mobileNum),
                "wrong method implementation - phone number format is correct");
    }

    @Test public void testCheckMobile2(){
        String mobileNum = "0912356789";
        Assertions.assertFalse(Validator.checkMobile(mobileNum),
                "wrong method implementation - phone number format is incorrect");
    }

    @Test public void testCheckMobile3(){
        String mobileNum = "0912o564789";
        Assertions.assertFalse(Validator.checkMobile(mobileNum),
                "wrong method implementation - phone number format is incorrect");
    }

    @AfterAll
    public static void end() {
        System.err.println("#### End Of Testing | Validator ####");
    }
}
