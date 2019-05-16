package com.gmail.chernii.oleksii;

import junit.framework.TestCase;
import org.apache.log4j.Logger;

public class UtilTest extends TestCase {
    private static final Logger log = Logger.getLogger(UtilTest.class);

    public void testValidateMobileNumber() throws Exception {
        //valid date
        String validNumber = "+389998884444";
        assertTrue(Util.validateMobileNumber(validNumber));

        //invalid date
        String invalidNumber = "#111111111";
        assertFalse(Util.validateMobileNumber(invalidNumber));
        log.info("validateMobileNumber() test passed");
    }

    public void testValidateEmail() throws Exception {
        //valid data
        String validEmail = "asds.123@gmail.com";
        assertTrue(Util.validateEmail(validEmail));

        //invalid date
        String invalidEmail = "111ddddd.fff.ss";
        assertFalse(Util.validateEmail(invalidEmail));
        log.info("validateEmail() test passed");
    }

    public void testValidateDate() throws Exception {
        //valid data
        String validFirstDate = "31.12.1999";
        String validSecondDate = "1.12.1999";
        assertTrue(Util.validateDate(validFirstDate));
        assertTrue(Util.validateDate(validSecondDate));

        //invalid date
        String invalidFirstDate = "32.11.2000";
        String invalidSecondDate = "31.13.2000";
        assertFalse(Util.validateDate(invalidFirstDate));
        assertFalse(Util.validateDate(invalidSecondDate));
        log.info("validateDate() test passed");
    }

    public void testValidateIp4() throws Exception {
        //valid data
        String validIp4 = "19.117.63.126";
        assertTrue(Util.validateIp4(validIp4));

        //invalid date
        String invalidIp4 = "257.117.123.222";
        assertFalse(Util.validateIp4(invalidIp4));
        log.info("validateIp4() test passed");
    }
}
