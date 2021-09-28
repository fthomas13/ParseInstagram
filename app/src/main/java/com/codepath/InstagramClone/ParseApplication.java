package com.codepath.InstagramClone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BqCar3gqEyTNxCpfvlN63zdaYcgFlTIO0sIJaEuc")
                .clientKey("UJ6UgfKpm4icswcFjdoEbvGq9QMb4322ui1ZSy36")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}