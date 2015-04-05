package com.example.abogados;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WelcomeRegistration extends Activity{
	
	private ImageView image;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcomeregistration);
		
		image = (ImageView) findViewById(R.drawable.logolawyer);
	}
	
	//Methods that open the classes login and sign up in case to be clickable
	public void initializeSignUp(View v){
		Intent intent = new Intent(this, SignUp.class);
		startActivity(intent);
		finish();
	}
	
	public void initializeLogIn(View v){
		Intent intent = new Intent(this, LogIn.class);
		startActivity(intent);
		finish();
	}
}
