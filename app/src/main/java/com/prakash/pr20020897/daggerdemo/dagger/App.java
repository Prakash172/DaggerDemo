package com.prakash.pr20020897.daggerdemo.dagger;

import android.app.Application;

import com.prakash.pr20020897.daggerdemo.DaggerMemberAppComponent;

public class App extends Application {

    private static App app;
    private MemberAppComponent memberAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        memberAppComponent = DaggerMemberAppComponent.builder() // The name should Prefix the Dagger to the Component
                .memberModule(new MemberModule()) // the name should start with small letter and same as module name
                .build();
        // DaggerMemberAppComponent is Generated by the dagger which will have memberModule variable of MemberModule class in the Builder
        // We can fetch more than one Module in the same component
        // Don't forget to add the android:name=".App" in android manifest file inside the application
    }

    public static App getApp() {
        return app;
    }

    public MemberAppComponent getMemberAppComponent() {
        return memberAppComponent;
    }
}


// Note that the dagger is not used for the small size projects and it is good only if the project size is large and there are
// lot of modules whose instantiation is to be control in good manner than we use the dagger.

