package com.lixinxin.daggerdemo;

import com.lixinxin.daggerdemo.model.UserModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lixinxin on 2016/7/4.
 */

@Module
public class ActivityModule {
    @Provides
    public UserModel provideUserModel() {
        return new UserModel("10000", "lixinxin", "man");
    }
}
