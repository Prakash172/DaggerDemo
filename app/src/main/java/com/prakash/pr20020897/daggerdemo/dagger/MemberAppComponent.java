package com.prakash.pr20020897.daggerdemo.dagger;

import com.prakash.pr20020897.daggerdemo.MainActivity;

import dagger.Component;

@Component(modules = MemberModule.class)
public interface MemberAppComponent {
    void inject(MainActivity mainActivity);
}

// we can have more than one component in the same modules as and array of modules
//just use the array initialization notation to bind more than one module in the same component


