package com.example.hugh.passwordvalidator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest

/**
 * Created by Hugh on 2017-05-29.
 */

public class PassTestEspresso {

    private String textToFind;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);


    @Test
    public void testCorrectStrength1(){
        onView(withId(R.id.editText2)).perform(typeText("Hunter_2"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Very Strong Password")));
    }

    @Test
    public void testCorrectStrength2(){
        onView(withId(R.id.editText2)).perform(typeText("$moneyMan$"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Strong Password")));
    }

    @Test
    public void testCorrectStrength3(){
        onView(withId(R.id.editText2)).perform(typeText("hugh42"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Medium Password")));
    }

    @Test
    public void testCorrectStrength4(){
        onView(withId(R.id.editText2)).perform(typeText("password"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Weak Password")));
    }
}
