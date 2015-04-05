package com.example.abogados;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseUser;

public class Welcome extends Activity{
	
	Button logout;
	TextView usertxt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		usertxt = (TextView) findViewById(R.id.tvWelcome);
		logout = (Button) findViewById(R.id.bLogout);
		
		//Retrieve current user from Parse.com
		ParseUser currentUser = ParseUser.getCurrentUser();
		
		//Convert currentUser into String
		String userstr = currentUser.getUsername().toString();
		
		usertxt.setText("Welcome. You are logged in as " + userstr);
		
	}
	
	public void initLogOut(View v){
		ParseUser.logOut();
		
		Toast.makeText(getApplicationContext(), 
				"Logging out...", Toast.LENGTH_LONG).show();
		
		initWelcomeRegistration();
	}
	
	//Call the mainpage WelcomeRegistration again
	public void initWelcomeRegistration(){
		Intent intent = new Intent(this, WelcomeRegistration.class);
		startActivity(intent);
		finish();
	}
}
