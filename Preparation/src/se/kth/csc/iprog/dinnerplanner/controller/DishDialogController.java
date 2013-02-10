package se.kth.csc.iprog.dinnerplanner.controller;

import se.kth.csc.iprog.dinnerplanner.ChooseDish;
import se.kth.csc.iprog.dinnerplanner.DinnerPlannerApplication;
import se.kth.csc.iprog.dinnerplanner.DishDescriptionDialog;
import android.view.View;
import android.view.View.OnClickListener;

public class DishDialogController implements OnClickListener {

	DishDescriptionDialog dialog;
	MainStateController mainController;
	
	public DishDialogController( DishDescriptionDialog dialog )
	{
		this.dialog = dialog;
		this.mainController = ((DinnerPlannerApplication) dialog.getActivity().getApplication() ).getMainController();
	}
	
	@Override
	public void onClick(View button) {
		// TODO Auto-generated method stub
		if( button == dialog.getBackButton() )
		{
			mainController.closeDishDialog( dialog );
		}
	}

}
