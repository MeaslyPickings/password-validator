package com.example.hugh.passwordvalidator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Hugh on 2017-05-28.
 */

public class PassTest {

    private String string;
    private PassValidator check;

    @Before
    public void setUp(){
        string = "Hunter_2";
        check = new PassValidator();
    }

    @Test
    public void isNotPassword() {

        assertNotEquals(check.validate(string), 0);
    }

    @Test
    public void has8Characters() {

        assertNotEquals(check.validate(string), 1);
    }

    @Test
    public void hasSpecialChar() {

        assertNotEquals(check.validate(string), 2);
    }

    @Test
    public void hasDigit() {

        assertNotEquals(check.validate(string), 3);
    }

    @Test
    public void hasDifCase() {

        assertNotEquals(check.validate(string), 4);
    }

}
