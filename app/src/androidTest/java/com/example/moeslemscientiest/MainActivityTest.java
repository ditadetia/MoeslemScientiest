package com.example.moeslemscientiest;


import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

import com.example.moeslemscientiest.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(0, click()));

        pressBack();

        ViewInteraction recyclerView2 = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView2.perform(actionOnItemAtPosition(1, click()));

        pressBack();

        ViewInteraction recyclerView3 = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView3.perform(actionOnItemAtPosition(2, click()));

        pressBack();

        ViewInteraction recyclerView4 = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView4.perform(actionOnItemAtPosition(2, click()));

        pressBack();

        ViewInteraction recyclerView5 = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView5.perform(actionOnItemAtPosition(3, click()));

        pressBack();

        ViewInteraction recyclerView6 = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView6.perform(actionOnItemAtPosition(4, click()));

        pressBack();

        ViewInteraction recyclerView7 = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView7.perform(actionOnItemAtPosition(5, click()));

        pressBack();

        ViewInteraction recyclerView8 = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView8.perform(actionOnItemAtPosition(6, click()));

        pressBack();

        ViewInteraction recyclerView9 = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView9.perform(actionOnItemAtPosition(7, click()));

        pressBack();

        ViewInteraction recyclerView10 = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView10.perform(actionOnItemAtPosition(8, click()));

        pressBack();

        ViewInteraction recyclerView11 = onView(
                allOf(withId(R.id.rv_scientist),
                        childAtPosition(
                                withId(R.id.activity_main),
                                0)));
        recyclerView11.perform(actionOnItemAtPosition(9, click()));

        pressBack();
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
