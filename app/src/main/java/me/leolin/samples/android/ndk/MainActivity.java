package me.leolin.samples.android.ndk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends Activity {

    static {
        System.loadLibrary("MyLib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NdkService ndkService = new NdkService();
        Toast.makeText(this, ndkService.provideInfo(), Toast.LENGTH_LONG).show();
    }

}
