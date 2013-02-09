package se.kth.csc.iprog.dinnerplanner;

import se.kth.csc.iprog.dinnerplanner.model.Dish;
import android.os.Bundle;

public class ChooseMainDish extends ChooseDish 
{	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		// Set the title
		this.title.setText( getResources().getString(R.string.title_activity_choose_main_dish));
				
		constructAdapter( Dish.MAIN );
	}
}
