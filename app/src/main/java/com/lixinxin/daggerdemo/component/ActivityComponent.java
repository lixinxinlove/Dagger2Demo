package com.lixinxin.daggerdemo.component;

import com.lixinxin.daggerdemo.ActivityModule;
import com.lixinxin.daggerdemo.MainActivity;

import dagger.Component;

/**
 * Created by lixinxin on 2016/7/4.
 */

@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
