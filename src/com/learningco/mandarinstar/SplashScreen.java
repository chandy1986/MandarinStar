package com.learningco.mandarinstar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		Thread logoTimer = new Thread() {
			public void run() {
				try {
					sleep(1500);
					Intent anIntent = new Intent(
							"com.learningco.mandarinstar.SPLASHSCREEN");
					startActivity(anIntent);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					finish();
				}
			}
		};
		logoTimer.start();
	}
}