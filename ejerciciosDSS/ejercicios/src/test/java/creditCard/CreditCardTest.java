package creditCard;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {
    private CreditCard creditCard;
    
    @Before
    public void setUp() {
        // Set up test objects before each test case
        Calendar expirationDate = Calendar.getInstance();
        expirationDate.set(2025, Calendar.DECEMBER, 31);
        creditCard = new CreditCard("1234567890123456", "John Doe", expirationDate.getTime(), 123);
    }
    
    @Test
    public void testGetNumber() {
        // Verify that the card number is correct
        String expectedNumber = "1234567890123456";
        String actualNumber = creditCard.getNumber();
        Assert.assertEquals(expectedNumber, actualNumber);
    }
    
    // Rest of the test cases...
    
    @Test
    public void testIsExpiredNotExpired() {
        // Verify that a non-expired card is identified correctly
        Calendar expirationDate = Calendar.getInstance();
        expirationDate.set(2025, Calendar.DECEMBER, 31);
        creditCard = new CreditCard("1234567890123456", "John Doe", expirationDate.getTime(), 123);
        boolean isExpired = creditCard.isExpired();
        Assert.assertFalse(isExpired);
    }
    
    @Test
    public void testIsExpiredExpired() {
        // Verify that an expired card is identified correctly
        Calendar expirationDate = Calendar.getInstance();
        expirationDate.set(2021, Calendar.MARCH, 28); // Past expiration date
        creditCard = new CreditCard("1234567890123456", "John Doe", expirationDate.getTime(), 123);
        boolean isExpired = creditCard.isExpired();
        Assert.assertTrue(isExpired);
    }
    
    @Test
    public void testGetHolderName() {
        // Verify that the card owner is correct
        String expectedOwner = "John Doe";
        String actualOwner = creditCard.getHolderName();
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void testGetExpirationDate() {
        // Verify that the expiration date is correct
        Calendar expectedExpirationDate = Calendar.getInstance();
        expectedExpirationDate.set(2025, Calendar.DECEMBER, 31);
        Date actualExpirationDate = creditCard.getExpirationDate();
        Calendar actualCalendar = Calendar.getInstance();
        actualCalendar.setTime(actualExpirationDate);
        Assert.assertEquals(expectedExpirationDate, actualCalendar);
    }

    @Test
    public void testGetCVV() {
        // Verify that the CVV is correct
        int expectedCVV = 123;
        int actualCVV = creditCard.getCvv();
        Assert.assertEquals(expectedCVV, actualCVV);
    }

    @Test
    public void testIsValidNumberValid() {
        // Verify that a valid card number is identified correctly
        boolean isValid = CreditCard.isValidNumber("1234567890123456");
        Assert.assertTrue(isValid);
    }

    @Test
    public void testIsValidNumberInvalid() {
        // Verify that an invalid card number is identified correctly
        boolean isValid = CreditCard.isValidNumber("123456789012345"); // Short number
        Assert.assertFalse(isValid);
    }

    @Test
    public void testIsValidCVVValid() {
        // Verify that a valid CVV is identified correctly
        boolean isValid = CreditCard.isValidCvv(123);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testIsValidCvvInvalid() {
        // Verify that an invalid CVV is identified correctly
        boolean isValid = CreditCard.isValidCvv(1000); // CVV length exceeds maximum
        Assert.assertFalse(isValid);
    }

}
