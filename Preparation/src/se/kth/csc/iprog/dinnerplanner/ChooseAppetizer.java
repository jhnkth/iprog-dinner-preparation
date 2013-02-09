package se.kth.csc.iprog.dinnerplanner;

import se.kth.csc.iprog.dinnerplanner.model.Dish;
import android.os.Bundle;

public class ChooseAppetizer extends ChooseDish 
{	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		// Set the title
		this.title.setText( getResources().getString(R.string.appetizersTitle));
		
		constructAdapter( Dish.STARTER );
	}
}