package org.lion.a02fragment2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "====_MainActivity";
    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.ll);
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        FirstFragment first = new FirstFragment();
        transaction.replace(R.id.ll, first);
        Log.i(TAG, "MainActivity.onCreate() transaction=" + transaction.getClass().getName());
        
        int id = first.getId();
        Log.i(TAG, "MainActivity.onCreate() id=" + id);
        transaction.commit();
    }
}
