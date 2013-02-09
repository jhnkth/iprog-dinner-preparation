package se.kth.csc.iprog.dinnerplanner.controller;

import se.kth.csc.iprog.dinnerplanner.ChooseDessert;
import se.kth.csc.iprog.dinnerplanner.ChooseMainDish;
import se.kth.csc.iprog.dinnerplanner.DinnerPlannerApplication;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.app.Activity;
import android.content.Intent;

public class MainStateController 
{
	private Activity currentActivity;
	private DinnerModel model;
	private DinnerPlannerApplication application;
	
	public MainStateController( DinnerModel model, DinnerPlannerApplication application)
	{
		this.application = application;
		this.model = model;
	}
	
	public void setCurrentActivity( Activity activity )
	{
		this.currentActivity = activity;
	}

	// Switch to the previous activity(state)
	public void previous() 
	{
		// TODO: Take action according to the current Activity
	}

	// Switch to the next activity(state)
	public void next() 
	{
		Class nextActivity;
		if( currentActivity instanceof ChooseMainDish )
			nextActivity = ChooseDessert.class;
		
		/* Here goes else-if blocks for other states */
		else
			nextActivity = ChooseMainDish.class;
		
		Intent nextStateIntent = new Intent( currentActivity, nextActivity );
		currentActivity.startActivity( nextStateIntent );
	}

	// Open the dish description dialog
	public void dishDialog() 
	{
		// TODO: Open a dialog in the current activity with the selected dish
	}
}
