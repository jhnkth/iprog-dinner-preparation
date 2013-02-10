package se.kth.csc.iprog.dinnerplanner.controller;

import se.kth.csc.iprog.dinnerplanner.ChooseAppetizer;
import se.kth.csc.iprog.dinnerplanner.ChooseDish;
import se.kth.csc.iprog.dinnerplanner.DinnerPlannerApplication;
import se.kth.csc.iprog.dinnerplanner.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

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
			// Do nothing or create a toast if no dish is selected
			if( activity.getSelectedDish() == null )
			{
				Toast.makeText(activity, R.string.toastMessage, Toast.LENGTH_LONG).show();
			}
			
			// If a dish is selected, put it into the model
			else
			{
				this.model.selectDish(activity.getSelectedDish());
				mainController.next();
			}
		}
		
		else if( button == activity.getDescriptionButton() )
		{
			mainController.dishDialog();
		}
	}
}
