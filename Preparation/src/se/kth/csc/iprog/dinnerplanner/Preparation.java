package se.kth.csc.iprog.dinnerplanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;
import android.widget.TextView;

public class Preparation extends Activity {

	
	TextView title;
	TextView numGuests;
	TextView cost;
	DinnerModel model;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preparation);
		
		
		
		//views
		numGuests = (TextView) findViewById(R.id.numGuestsLabel);
		cost = (TextView) findViewById(R.id.priceLabel);
		
		// Get the model 
		model = ((DinnerPlannerApplication)this.getApplication()).getModel();
		
		// Get the Ingridients
		Set<Dish> dishes = model.getFullMenu();
		List<Dish> list = new ArrayList<Dish>(dishes);
        Dish[] dishArray = (Dish [])list.toArray(new Dish[list.size()]);
        
        //System.out.println(dishArray[0].getDescription());
        
        // Construct the adapter for the dish list
        PreparationAdapter adapter = new PreparationAdapter(this, R.layout.listview_item_row_preparation, dishArray);
        ListView dishList = (ListView) findViewById(R.id.prepList);
        dishList.setAdapter(adapter);
        dishList.setSelector(R.drawable.list_selection );
		
		
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_preparation, menu);
		return true;
	}

}
