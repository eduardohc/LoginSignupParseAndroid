package com.example.abogados;

import android.app.Activity;
import android.content.Intent;
//import android.com.ParseException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.LogInCallback;
import com.parse.ParseUser;

public class LogIn extends Activity{
	
	private EditText username;
	private EditText password;
	String usernametxt;
	String passwordtxt;
	Button login;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//Get the layout
		setContentView(R.layout.login);
		
		//Locate the EditText and Button in login.xml
		username = (EditText) findViewById(R.id.etUsername);
		password = (EditText) findViewById(R.id.etPassword);
		login = (Button) findViewById(R.id.bLogIn);
	}
	
	//Implements the method onClick to the Button login
	public void startLogIn(View v){
		//Get the text from username and password edittext
		usernametxt = username.getText().toString();
		passwordtxt = password.getText().toString();
		
		ParseUser.logInInBackground(usernametxt, passwordtxt,
				new LogInCallback(){

					@Override
					public void done(ParseUser user, ParseException e) {
						// TODO Auto-generated method stub
						if(user != null){
							//If user exist and authenticated, send user to welcome
							Intent intent = new Intent(LogIn.this, Welcome.class);
							startActivity(intent);
							Toast.makeText(getApplicationContext(), 
									"Successfuly logged in", Toast.LENGTH_SHORT).show();;
							finish();
						} else{
							Toast.makeText(getApplicationContext(), 
									"No such user exist, plase sign up", 
									Toast.LENGTH_LONG).show();
						}
					}
		});
	}
}
