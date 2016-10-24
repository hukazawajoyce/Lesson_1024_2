package com.hukazawa.user.lesson_1024_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import static com.hukazawa.user.lesson_1024_2.R.id.spinner;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ToggleButton tb;
    TextView tv,tv1;
    Spinner list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        tb = (ToggleButton) findViewById(R.id.toggleButton);
        list = (Spinner) findViewById(R.id.spinner);
        tv = (TextView) findViewById(R.id.textView2);
        tv1 = (TextView) findViewById(R.id.textView3);

        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //TextView itemTv = (TextView) view;
                //String str =
                String[] f =getResources().getStringArray(R.array.animal);
                String str = f[position];
                tv.setText(str);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(it);
            }


        });

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("MYLOG", "Check:" + isChecked);
            }
        });

    }
    public void clickclick (View v)
    {
        int p =list.getSelectedItemPosition();
        String[] f =getResources().getStringArray(R.array.animal);
        String str = f[p];

        tv1.setText(str);


    }

}
