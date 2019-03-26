package com.gmail.chernii.oleksii;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Space on 26.03.2019.
 */
public class Util {
    private static final String REGEX_NUMBER = "^\\+[1-9][0-9]{11}$";
    private static final String REGEX_EMAIL = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
    private static final String REGEX_DATE = "^(3[01]|[12][0-9]|0?[0-9])\\.(1[0-2]|0?[0-9])\\.(\\d{4})$";// dd.mm.yyyy
    private static final String REGEX_IP4 = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    public static boolean validateMobileNumber(String number) {
        return validate(number, Valid.MOBILE_NUMBER);
    }

    public static boolean validateEmail(String email) {
        return validate(email, Valid.EMAIL);
    }

    public static boolean validateDate(String date) {
        return validate(date, Valid.DATE);
    }

    public static boolean validateIp4(String ip4) {
        return validate(ip4, Valid.IP4);
    }

    private static boolean validate(String match, Valid valid) {
        String regex;
        switch (valid) {
            case MOBILE_NUMBER:
                regex = REGEX_NUMBER;
                break;
            case EMAIL:
                regex = REGEX_EMAIL;
                break;
            case DATE:
                regex = REGEX_DATE;
                break;
            case IP4:
                regex = REGEX_IP4;
                break;
            default:
                return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(match);
        return matcher.matches();
    }
}
