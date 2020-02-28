package ir.ac.kntu;

import org.junit.jupiter.api.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Mahvari
 */
public class CustomerTests {

    @BeforeAll
    public static void setUp(){
        System.err.println("#### Starting Unit Tests | Customer ####");
    }

    @Test
    public void testFirstNameSetter1() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchFieldException{

        String firstName = "John";
        Customer customer = new Customer();
        customer.getClass().getMethod("setFirstName", String.class)
                .invoke(customer, firstName);

        Field firstNameField = customer.getClass().getDeclaredField("firstName");
        firstNameField.setAccessible(true);
        String actualFirstName = (String) firstNameField.get(customer);

        Assertions.assertEquals(
                actualFirstName, firstName,
                "wrong implementation of setFirstName");
    }

    @Test
    public void testFirstNameSetter2() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchFieldException{

        String firstName = "Jo";
        Customer customer = new Customer();
        customer.getClass().getMethod("setFirstName", String.class)
                .invoke(customer, firstName);

        Field firstNameField = customer.getClass().getDeclaredField("firstName");
        firstNameField.setAccessible(true);
        String actualFirstName = (String) firstNameField.get(customer);

        Assertions.assertNotEquals(
                actualFirstName, firstName,
                "wrong implementation of setFirstName");
    }

    @Test
    public void testLastNameSetter1() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchFieldException{

        String lastName = "Lo";
        Customer customer = new Customer();
        customer.getClass().getMethod("setLastName", String.class)
                .invoke(customer, lastName);

        Field lastNameField = customer.getClass().getDeclaredField("lastName");
        lastNameField.setAccessible(true);
        String actualLastName = (String) lastNameField.get(customer);

        Assertions.assertNotEquals(
                actualLastName, lastName,
                "wrong implementation of setLastName");
    }

    @Test
    public void testEmailSetter1() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchFieldException{

        String email = "lol@lol.com";
        Customer customer = new Customer();
        customer.getClass().getMethod("setEmail", String.class)
                .invoke(customer, email);

        Field emailField = customer.getClass().getDeclaredField("email");
        emailField.setAccessible(true);
        String actualEmail = (String) emailField.get(customer);

        Assertions.assertEquals(
                actualEmail, email,
                "wrong implementation of setEmail");
    }

    @Test
    public void testEmailSetter2() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchFieldException{

        String email = "lol.lol.com";
        Customer customer = new Customer();
        customer.getClass().getMethod("setEmail", String.class)
                .invoke(customer, email);

        Field emailField = customer.getClass().getDeclaredField("email");
        emailField.setAccessible(true);
        String actualEmail = (String) emailField.get(customer);

        Assertions.assertNotEquals(
                actualEmail, email,
                "wrong implementation of setEmail");
    }

    @Test
    public void testMobileSetter1() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchFieldException{

        String phoneNumber = "094321564789";
        Customer customer = new Customer();
        customer.getClass().getMethod("setMobile", String.class)
                .invoke(customer, phoneNumber);

        Field mobileField = customer.getClass().getDeclaredField("mobile");
        mobileField.setAccessible(true);
        String actualMobile = (String) mobileField.get(customer);

        Assertions.assertNotEquals(
                actualMobile, phoneNumber,
                "wrong implementation of setMobile");
    }

    @Test
    public void testNationalCodeSetter1() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchFieldException{

        String nationalCode = "094321564789";
        Customer customer = new Customer();
        customer.getClass().getMethod("setNationalCode", String.class)
                .invoke(customer, nationalCode);

        Field nationalCodeField = customer.getClass().getDeclaredField("nationalCode");
        nationalCodeField.setAccessible(true);
        String actualNationalCode = (String) nationalCodeField.get(customer);

        Assertions.assertNotEquals(
                actualNationalCode, nationalCode,
                "wrong implementation of setNationalCode");
    }

    @Test
    public void testNationalCodeSetter2() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchFieldException{

        String nationalCode = "3440285081";
        Customer customer = new Customer();
        customer.getClass().getMethod("setNationalCode", String.class)
                .invoke(customer, nationalCode);

        Field nationalCodeField = customer.getClass().getDeclaredField("nationalCode");
        nationalCodeField.setAccessible(true);
        String actualNationalCode = (String) nationalCodeField.get(customer);

        Assertions.assertEquals(
                actualNationalCode, nationalCode,
                "wrong implementation of setNationalCode");
    }

    @Test
    public void testFirstNameGetter() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchFieldException{

        Customer customer = new Customer();

        String firstName = "John";
        customer.getClass().getMethod("setFirstName", String.class)
                .invoke(customer, firstName);

        String getterFirstName = (String) customer.getClass()
                .getMethod("getFirstName").invoke(customer);

        Field firstNameField = customer.getClass().getDeclaredField("firstName");
        firstNameField.setAccessible(true);
        String actualFirstName = (String) firstNameField.get(customer);

        Assertions.assertEquals(
                actualFirstName, getterFirstName,
                "wrong implementation of getFirstName");

    }

    @Test
    public void testLastNameGetter() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            NoSuchFieldException{

        Customer customer = new Customer();

        String lastName = "Greetings";
        customer.getClass().getMethod("setLastName", String.class)
                .invoke(customer, lastName);

        String getterLastName = (String) customer.getClass()
                .getMethod("getLastName").invoke(customer);

        Field LastNameField = customer.getClass().getDeclaredField("lastName");
        LastNameField.setAccessible(true);
        String actualLastName = (String) LastNameField.get(customer);

        Assertions.assertEquals(
                actualLastName, getterLastName,
                "wrong implementation of getLastName");

    }

    @Test
    public void testEmailGetter(){

        Customer customer = new Customer();
        Assertions.assertDoesNotThrow(()->customer.getClass().getMethod("getEmail"),
                "no getEmail method was found");

    }

    @Test
    public void testMobileGetter(){

        Customer customer = new Customer();
        Assertions.assertDoesNotThrow(()->customer.getClass().getMethod("getMobile"),
                "no getMobile method was found");

    }


    @Test
    public void testNationalCodeGetter(){

        Customer customer = new Customer();
        Assertions.assertDoesNotThrow(()->customer.getClass().getMethod("getNationalCode"),
                "no getNationalCode method was found");

    }

    @Test
    public void testAddressGetter(){

        Customer customer = new Customer();
        Assertions.assertDoesNotThrow(()->customer.getClass().getMethod("getAddress"),
                "no getAddress method was found");

    }

    @AfterAll
    public static void end() {
        System.err.println("#### End Of Testing | Customer ####");
    }

}
