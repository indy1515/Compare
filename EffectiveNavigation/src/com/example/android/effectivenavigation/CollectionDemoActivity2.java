package com.example.android.effectivenavigation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CollectionDemoActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_collection_demo_activity2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.collection_demo_activity2, menu);
		return true;
	}

}
