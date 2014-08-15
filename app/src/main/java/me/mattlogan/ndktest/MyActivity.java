package me.mattlogan.ndktest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MyActivity extends Activity {

    static {
        System.loadLibrary("hello-jni");
    }

    public native String stringFromJNI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        String testString = stringFromJNI();

        TextView mainText = (TextView) findViewById(R.id.main_text);
        mainText.setText(testString);
    }
}
