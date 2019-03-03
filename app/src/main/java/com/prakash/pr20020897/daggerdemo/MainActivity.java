package com.prakash.pr20020897.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.prakash.pr20020897.daggerdemo.dagger.App;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.empid_et)
    EditText empidEt;
    @BindView(R.id.button)
    Button button;
    @Inject
    MemberDataManager memberDataManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        App.getApp().getMemberAppComponent().inject(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (empidEt.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "The Emp ID is empty, try again", Toast.LENGTH_SHORT).show();
                } else {
                    String input = empidEt.getText().toString();
                    String result = memberDataManager.checkEmpId(input);
                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
