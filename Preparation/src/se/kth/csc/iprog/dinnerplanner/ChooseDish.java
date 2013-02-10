package se.kth.csc.iprog.dinnerplanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.controller.ChooseDishController;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public abstract class ChooseDish extends Activity 
{
	protected TextView title;
	private TextView numGuests;
	private TextView cost;
	protected DinnerModel model;
	
	private ImageButton backButton;
	private ImageButton nextButton;
	private ImageButton descriptionButton;
	private ChooseDishController controller;
	
	private int selectedDishPos = -1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_dish);
		
		// Get the views
		title = (TextView) findViewById(R.id.dishSelectTitle);
		numGuests = (TextView) findViewById(R.id.numGuestsLabel);
		cost = (TextView) findViewById(R.id.priceLabel);
		
		// Get the buttons
		this.backButton = (( ImageButton ) findViewById( R.id.backButton ));
		this.nextButton = (( ImageButton ) findViewById( R.id.nextButton ));
		this.descriptionButton = (( ImageButton ) findViewById( R.id.ingredientsButton ));
		
		// Get the model 
		model = ((DinnerPlannerApplication)this.getApplication()).getModel();
		
		// Create a controller
		controller = new ChooseDishController(this);
		backButton.setOnClickListener( controller );
		nextButton.setOnClickListener( controller );
		descriptionButton.setOnClickListener( controller );
	}
	
	@Override
	protected void onResume()
	{
		super.onResume();
		((DinnerPlannerApplication)this.getApplication()).getMainController().setCurrentActivity(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_choose_appetizer, menu);
		return true;
	}
	
	protected void constructAdapter( int type )
	{
		// Get the starters
		Set<Dish> dishSet = model.getDishesOfType(type);
		
		// Convert the set into an array
		List<Dish> list = new ArrayList<Dish>(dishSet);
        Dish[] dishArray = (Dish [])list.toArray(new Dish[list.size()]);
        
        // Construct the adapter for the dish list
        DishAdapter adapter = new DishAdapter(this, R.layout.listview_item_row, dishArray);
        ListView dishList = (ListView) findViewById(R.id.dishList);
        dishList.setAdapter(adapter);
        dishList.setSelector( R.drawable.list_selection );
        
        dishList.setOnItemClickListener(new OnItemClickListener() 
        {
            public void onItemClick(AdapterView<?> adView, View target, int position, long id) 
            {
                selectedDishPos = position;            
            }
        });
	}

	public ImageButton getBackButton() {
		return backButton;
	}

	public ImageButton getNextButton() {
		return nextButton;
	}
	public ImageButton getDescriptionButton() {
		return descriptionButton;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
		// Override the back button so that it is handled it with state controller
	    if ((keyCode == KeyEvent.KEYCODE_BACK)) 
	    {
	    	((DinnerPlannerApplication)this.getApplication()).getMainController().previous();
	    	
	    	return true;
	    }
	    
	    return super.onKeyDown(keyCode, event);
	}
	public Dish getSelectedDish()
	{
		ListView lv = (ListView) this.findViewById(R.id.dishList);
		Log.d( "ASD", selectedDishPos + " " );
		return (Dish)lv.getItemAtPosition( selectedDishPos );
	}
	
}