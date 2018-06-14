package com.example.anupamparihar.youtubeapiexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {
YouTubePlayerView  y;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.b1);
        y=(YouTubePlayerView)findViewById(R.id.y1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override//yahan pe string google ki api key
            public void onClick(View v) {
                y.initialize("AIzaSyAC-D4JhP0j4IKfiGysd3Os_aPH4G5BGl4", new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                                          youTubePlayer.loadVideo("SAcpESN_Fk4");          //use parameter object of youtubeplayer
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                    }
                });
            }
        });
    }
}
