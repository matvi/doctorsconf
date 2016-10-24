package com.softwareengineerandroid.davidmata.doctorsconferences;

import android.test.AndroidTestCase;

import com.softwareengineerandroid.davidmata.user.User;

/**
 * Created by davidmata on 20/10/2016.
 */

public class TestUser extends AndroidTestCase {

    public void testUser(){
        User user = new User(1,"david@gmail.com","123",1);
        assertEquals(user.getId(),1);
        assertEquals(user.getUser(),"david@gmail.com");
        assertEquals(user.getPassword(),"123");
        assertEquals(user.getAdmin(),1);
    }

}
