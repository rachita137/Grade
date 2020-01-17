package tatastrive.application.grade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static tatastrive.application.grade.MainActivity.am;

public class Grade1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_grade1 );

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        am.release();
        finish();
    }
}
