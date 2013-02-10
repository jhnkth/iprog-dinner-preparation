package se.kth.csc.iprog.dinnerplanner.controller;

import se.kth.csc.iprog.dinnerplanner.ChooseDish;
import se.kth.csc.iprog.dinnerplanner.DinnerPlannerApplication;
import android.view.View;
import android.view.View.OnClickListener;

public class DishDialogController implements OnClickListener {

	ChooseDish activity;
	MainStateController mainController;
	
	public DishDialogController( ChooseDish activity )
	{
		this.activity = activity;
		this.mainController = ((DinnerPlannerApplication) activity.getApplication()).getMainController();
	}
	
	@Override
	public void onClick(View button) {
		// TODO Auto-generated method stub
		if( button == activity.getBackButton() )
		{
			mainController.closeDishDialog();
		}
	}

}
