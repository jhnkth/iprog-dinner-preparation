package se.kth.csc.iprog.dinnerplanner;

import se.kth.csc.iprog.dinnerplanner.controller.MainStateController;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.app.Application;

public class DinnerPlannerApplication extends Application {
	
	private DinnerModel model = new DinnerModel();
	private MainStateController controller;
	
	public DinnerPlannerApplication()
	{
		super();
		controller = new MainStateController(model, this);
	}

	public MainStateController getMainController() 
	{
		return controller;
	}

	public DinnerModel getModel() {
		return model;
	}

	public void setModel(DinnerModel model) {
		this.model = model;
	}


}
