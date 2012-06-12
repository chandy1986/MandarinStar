package com.learningco.mandarinstar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Main extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	// Inflating a menu resource
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			MenuInflater inflater = getMenuInflater();
			inflater.inflate(R.menu.mainmenu, menu);
			return true;
		}

		// Handles menu item selection
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			switch (item.getItemId()) {
			case R.id.reset:
				reset();
				return true;
			case R.id.help:
				help();
				return true;
			case R.id.about:
				about();
				return true;
			default:
				return super.onOptionsItemSelected(item);
			}
		}

		private void about() {
		    // TODO Auto-generated method stub
		    
		}

		private void help() {
		    // TODO Auto-generated method stub
		    
		}

		private void reset() {
		    // TODO Auto-generated method stub
		    
		}
}
