package com.example.abogados;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LogIn extends Activity{
	
	private EditText login, password;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		login = (EditText) findViewById(R.id.etLogIn);
		password = (EditText) findViewById(R.id.etSignUp);
		
	}
	
	public void clickLogIn(View v){
		if(login.isClickable()){
			login.setText("");
		}
	}
	
	public void clickSignUp(View v){
		if(password.isClickable()){
			password.setText("");
		}
	}
	
}
