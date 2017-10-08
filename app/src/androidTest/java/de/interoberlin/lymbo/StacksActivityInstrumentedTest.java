package de.interoberlin.lymbo;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.interoberlin.lymbo.view.activities.StacksActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class StacksActivityInstrumentedTest {

    @Rule
    public ActivityTestRule<StacksActivity> mActivityRule =
            new ActivityTestRule(StacksActivity.class);

    @Test
    public void listGoesOverTheFold() {
        onView(withText(R.string.app_name)).check(matches(isDisplayed()));
    }
}