package com.example.abogados;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.ParseAnonymousUtils;
import com.parse.ParseUser;

public class mainActivity extends Activity{
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//Determine whether the current user is an anonymous user
		if(ParseAnonymousUtils.isLinked(ParseUser.getCurrentUser())){
			//If user is anonymous, send the user to loginSinupActivity.class
			Intent intent = new Intent(this, SignUp.class);
			startActivity(intent);
			finish();
		} else{
			//If current user in NOT anonymous user, get current user data from Parse.com
			ParseUser currentUser = ParseUser.getCurrentUser();
			}
		
	}
	
}
