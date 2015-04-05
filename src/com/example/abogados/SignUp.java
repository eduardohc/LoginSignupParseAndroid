package com.example.abogados;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SignUp extends Activity{
	
	private EditText username;
	private EditText pass;
	private EditText confPass;
	
	//Variables that will make reference to the EditText variables
	String usertxt;
	String passtxt;
	String confpasstxt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
		
		username = (EditText) findViewById(R.id.etNewUsername);
		pass = (EditText) findViewById(R.id.etNewPass);
		confPass = (EditText) findViewById(R.id.etConfNewPass);
		
	} 
	
	public void startSignUp(View v){
		
		super.onBackPressed();
		usertxt = username.getText().toString();
		passtxt = pass.getText().toString();
		confpasstxt = confPass.getText().toString();
		
		//Force user to fill up the form
		if(usertxt.equals("") && passtxt.equals("") && confpasstxt.equals("")){
			Toast.makeText(getApplicationContext(), 
					"Please complete all the forms", Toast.LENGTH_LONG).show();
			
		} /*else if(passtxt == confpasstxt){ //Confirm that passwords are equals
			Toast.makeText(getApplicationContext(), 
					"Password different", Toast.LENGTH_LONG).show();
		} */else{
			//Create a new user into Parse.com Data Storage
			ParseUser user = new ParseUser();
			user.setUsername(usertxt); 
			user.setPassword(passtxt);
			
			user.signUpInBackground(new SignUpCallback(){
				public void done(ParseException e){
					if(e == null){
						//Show a simple Toast message upon successful registration
						Toast.makeText(getApplicationContext(), 
								"Successfully Signed up", Toast.LENGTH_LONG).show();
						welcome();
					} else {
						Toast.makeText(getApplicationContext(), 
								"Sign up Error", Toast.LENGTH_LONG).show();
						
					}
				}
			});
		}
		
	}
	
	//Return to the last activity
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)  {
	    if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        // do something on back.
	    	Intent intent = new Intent(this, WelcomeRegistration.class);
			startActivity(intent);
			finish();
	        return true;
	    }

	    return super.onKeyDown(keyCode, event);
	}
	
	public void welcome(){
		Intent intent = new Intent(this, Welcome.class);
		startActivity(intent);
		finish();
	}

}
