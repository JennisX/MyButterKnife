package com.jennis.mybutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_txt)
    public TextView text;

    @BindString(R.string.my_name)
    public String name;

    @OnClick(R.id.main_btn)
    public void click() {
        text.setText(name);
    }

    @OnLongClick(R.id.main_linear)
    public boolean longClick() {
        Toast.makeText(this, "Please click the button!", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        text.setText("Who am I ?");
    }
}
