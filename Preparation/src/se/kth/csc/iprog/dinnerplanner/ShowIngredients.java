package se.kth.csc.iprog.dinnerplanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ShowIngredients extends Activity {

	
	
	TextView numGuests;
	TextView cost;
	DinnerModel model;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_show_ingredients);
		
		//views
		numGuests = (TextView) findViewById(R.id.numGuestsLabel);
		cost = (TextView) findViewById(R.id.priceLabel);
		
		// Get the model 
		model = ((DinnerPlannerApplication)this.getApplication()).getModel();
		
		// Get the Ingridients
		Set<Ingredient> Ingridients = model.getAllIngredients();
		
		List<Ingredient> list = new ArrayList<Ingredient>(Ingridients);
		Ingredient[] IngredientArray = (Ingredient [])list.toArray(new Ingredient[list.size()]);

		
		
		//define table element
		TableLayout t1;

		TableLayout tl = (TableLayout) findViewById(R.id.main_table);
		
		
		//loop for adding rows 
		for (int i=0; i < IngredientArray.length; i++){
			
		//fetch data from Array	
		String ingName = IngredientArray[i].getName();
		String ingUnit = IngredientArray[i].getUnit();
		Double ingQuant = IngredientArray[i].getQuantity();
		Double ingPrice = IngredientArray[i].getPrice();
		
	
		
		//create table row
		TableRow tr = new TableRow(this);
		tr.setId(100+i);
		if(i%2!=0) tr.setBackgroundColor(Color.LTGRAY);
		tr.setLayoutParams(new LayoutParams(
				LayoutParams.FILL_PARENT,
				LayoutParams.WRAP_CONTENT));
		
		//Create two columns to add as table data
		 // Create a TextView to add date
		TextView lableName = new TextView(this);
		lableName.setId(200+i); 
		lableName.setText(ingName);
		lableName.setPadding(2, 0, 5, 0);
		lableName.setWidth(200);
		lableName.setTextColor(Color.BLACK);
		tr.addView(lableName);
		
		TextView lableQuant = new TextView(this);
		lableQuant.setId(400+i); 
		lableQuant.setText(ingQuant + "" + ingUnit);
		lableQuant.setPadding(2, 0, 5, 0);
		lableQuant.setTextColor(Color.BLACK);
		tr.addView(lableQuant);
		
		TextView lablePrice = new TextView(this);
		lablePrice.setId(600+i); 
		lablePrice.setText(ingPrice.toString() + " $");
		lablePrice.setPadding(2, 0, 5, 0);
		lablePrice.setTextColor(Color.BLACK);
		tr.addView(lablePrice);
		
		tl.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.FILL_PARENT,
                LayoutParams.WRAP_CONTENT));
      
    }
				
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_ingredients, menu);
		return true;
	}

}
