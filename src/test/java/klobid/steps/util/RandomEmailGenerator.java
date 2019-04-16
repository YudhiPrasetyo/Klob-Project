package klobid.steps.util;

import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomEmailGenerator {

    public static String generate(){
        Double length = (Math.random()*10 + 5);
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.random(length.intValue(), allowedChars);
        email = temp + "@gmail.com";
        return email;
    }
}
