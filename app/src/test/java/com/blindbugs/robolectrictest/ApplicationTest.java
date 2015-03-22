package com.blindbugs.robolectrictest;

import android.app.Activity;
import android.app.Application;
import android.test.ApplicationTestCase;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertThat;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(RobolectricTestRunner.class)
@Config( emulateSdk = 18 )
public class ApplicationTest extends TestCase {


@Test
    public void testThatSucceeds(){
    assert true;
    }


@Test
    public void testThatFails(){
        // all NOK
        assert false;
    }

    @Test
    public void shouldHaveHappySmiles() throws Exception {
        Activity mainActivity = Robolectric.buildActivity(MainActivity.class).get();//.get().getResources().getString(R.string.hello_world);

        assertEquals(null, "Hello world!");
    }
}