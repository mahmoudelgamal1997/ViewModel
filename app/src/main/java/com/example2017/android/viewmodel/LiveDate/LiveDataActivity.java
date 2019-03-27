package com.example2017.android.viewmodel.LiveDate;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example2017.android.viewmodel.R;

public class LiveDataActivity extends AppCompatActivity {

    ViewModelLiveData modelLiveData;

    Button button ;
    TextView txt ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);


        txt=(TextView)findViewById(R.id.txt2);
        button=(Button)findViewById(R.id.button2);



        modelLiveData = ViewModelProviders.of(this).get(ViewModelLiveData.class);

        // Create the observer which updates the UI.
        final Observer<Integer> nameObserver = new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable final Integer newName) {
                // Update the UI, in this case, a TextView.
                txt.setText(String.valueOf(newName));
            }
        };
        modelLiveData.getMutableLiveData().observe(this, nameObserver);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                        modelLiveData.getMutableLiveData().setValue(3);


            }catch (Exception e){
                    Toast.makeText(LiveDataActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

}
