package com.lixinxin.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.lixinxin.daggerdemo.component.ActivityComponent;
import com.lixinxin.daggerdemo.component.DaggerActivityComponent;
import com.lixinxin.daggerdemo.model.UserModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    private ActivityComponent mActivityComponent;

    @Inject
    UserModel mUserModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule()).build();
        mActivityComponent.inject(this);
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("ID:" + mUserModel.getId() + " Name: " + mUserModel.getName() + "  Gender: " + mUserModel.getGender());
    }
}
