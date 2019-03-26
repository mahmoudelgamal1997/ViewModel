package com.example2017.android.viewmodel;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button but;
    TextView txt;
    CounterViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but=(Button)findViewById(R.id.button);
        txt=(TextView)findViewById(R.id.txt);

        viewModel= ViewModelProviders.of(this).get(CounterViewModel.class);
        displayClickCount(viewModel.getCount());


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.setCount(viewModel.getCount()+1);
                displayClickCount(viewModel.getCount());
            }
        });


    }


    private void displayClickCount(int clickCount) {
        txt.setText(String.valueOf(clickCount));
    }



}
