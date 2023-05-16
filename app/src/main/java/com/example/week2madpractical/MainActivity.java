package com.example.week2madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "On Create!!");
        User user = new User("Peter", "Male",1,false);
        Button follow = findViewById(R.id.button);
        if(user.followed==false){
            follow.setText("Follow");
        }
        else{
            follow.setText("Unfollowed");
        }
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.followed ==false){
                    follow.setText("Unfollow");
                    user.followed=true;
                }
                else{
                    user.followed=false;
                    follow.setText("follow");
                }
            }
        });


    }

}
