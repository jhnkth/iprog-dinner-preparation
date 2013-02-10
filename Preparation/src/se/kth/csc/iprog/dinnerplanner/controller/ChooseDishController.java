package se.kth.csc.iprog.dinnerplanner.controller;

import se.kth.csc.iprog.dinnerplanner.ChooseDish;
import se.kth.csc.iprog.dinnerplanner.DinnerPlannerApplication;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.view.View;
import android.view.View.OnClickListener;

public class ChooseDishController implements OnClickListener
{
	ChooseDish activity;
	DinnerModel model;
	MainStateController mainController;

	public ChooseDishController( ChooseDish activity )
	{
		this.activity = activity;
		this.model = ((DinnerPlannerApplication) activity.getApplication()).getModel();
		this.mainController = ((DinnerPlannerApplication) activity.getApplication()).getMainController();
	}
	
	@Override
	public void onClick(View button) 
	{
		if( button == activity.getBackButton() )
		{
			mainController.previous();
		}
		
		else if( button == activity.getNextButton() )
		{
			// Do nothing or create a toast if not any dish is selected
			
			// If a dish is selected, put it into the model
			
			mainController.next();
		}
		
		else if( button == activity.getDescriptionButton() )
		{
			mainController.dishDialog();
		}
	}
}
