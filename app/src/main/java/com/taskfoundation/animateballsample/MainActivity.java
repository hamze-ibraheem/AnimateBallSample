package com.taskfoundation.animateballsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.taskfoundation.animateballsample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ballImageView = (ImageView) findViewById(R.id.ballImageView);
        animateBall(ballImageView);
    }

    /**
     *
     * @param view
     */
    public void animateBall(View view){
        view.animate().rotation(360).setDuration(500).translationXBy(1000).setDuration(1000).alpha(0).setDuration(2000);
    }

}