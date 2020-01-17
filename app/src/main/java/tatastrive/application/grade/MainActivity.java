package tatastrive.application.grade;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
     static MediaPlayer am;
    Thread timer;

    @Override
    protected void onPause() {
        super.onPause();
        am.release();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        am = MediaPlayer.create(MainActivity.this,R.raw.kalimba);
        am.start();
        timer = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(10000);


                }
                catch(InterruptedException e)
                {

                }
                finally
                {
                    Intent on = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(on);
                }
            }
        };
        timer.start();


    }
}
