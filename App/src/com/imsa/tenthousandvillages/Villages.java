package com.imsa.tenthousandvillages;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Villages extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villages);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_villages, menu);
        return true;
    }
}
