package com.example.abogados;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
//import com.example.abogados.LogIn;

public class WelcomeRegistration extends Activity{
	
	//private LogIn objectLogIn = new LogIn();
	private ImageView image;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		image = (ImageView) findViewById(R.drawable.logolawyer);
	}
	
	//Methods that send the layour login and sign up in case to be clickable
	public void initializeLogIn(View v){
		setContentView(R.layout.login);
	}
	
	public void initializeSignUp(View v){
		setContentView(R.layout.signup);
	}
}
