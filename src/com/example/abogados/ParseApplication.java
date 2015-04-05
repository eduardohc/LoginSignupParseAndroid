package com.example.abogados;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class ParseApplication extends Application{

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		//Add your initialization code here
		Parse.initialize(this, "JodxAS94NHNFOhTGnDoBSFebZ5TkpyivkrILcq0c", 
				"Nrx2nLAcieEcsjdF8xsfBpzIQXcHejsGzcRyr87w");
		
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
		
		//If you would like all object to be private by default, remove this line
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
	}
	
	
	
}
