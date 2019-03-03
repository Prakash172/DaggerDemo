package com.prakash.pr20020897.daggerdemo.dagger;

import com.prakash.pr20020897.daggerdemo.MemberDataManager;

import dagger.Module;
import dagger.Provides;

@Module
public class MemberModule {
    // Modules represent the DataModelClass object

    @Provides
    public MemberDataManager provideMemberDataManager() {
        return new MemberDataManager();
    }
}
