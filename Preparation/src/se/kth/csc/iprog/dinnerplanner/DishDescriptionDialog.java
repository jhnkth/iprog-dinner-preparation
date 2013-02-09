package se.kth.csc.iprog.dinnerplanner;

import se.kth.csc.iprog.dinnerplanner.model.Dish;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;
import android.app.Dialog;
import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DishDescriptionDialog extends Dialog
{
	private TextView title;
	private TextView ingredients;
	private TextView description;
	private ImageView dishImage;
	private Button backButton;
	
	private Context context;
	
	public DishDescriptionDialog(Context context) 
	{
		super(context);
		this.context = context;
		setContentView(R.layout.dish_description_dialog);
		
		this.title = (TextView) findViewById(R.id.dish_dialog_title);
		this.dishImage = (ImageView) findViewById(R.id.dish_dialog_image);
		this.ingredients = (TextView) findViewById(R.id.dish_dialog_ingredients);
		this.description = (TextView) findViewById(R.id.dish_dialog_description);
		this.backButton = (Button) findViewById(R.id.dish_dialog_back_button );
	}

	// Updates the content according to the parameter dish
	public void setDish( Dish dish )
	{
		// Set Dialog Title
		title.setText( dish.getName() );
		
		// Set Dish Image
		String resourceName = ( dish.getImage().lastIndexOf('.') > 0) ? 
				dish.getImage().substring(0, dish.getImage().lastIndexOf('.')) : 
				dish.getImage();
 		
		dishImage.setImageResource( 
 				context.getResources().getIdentifier( resourceName, "drawable", context.getPackageName() ) );
 		
 		// Set the list of ingredients
		String ingredientsList = "";
 		for( Ingredient i: dish.getIngredients() )
 		{
 			ingredientsList += i.getName() + " (" + i.getQuantity() + " " + i.getUnit() + ")\n";
 		}
 		ingredients.setText( ingredientsList );
 		
 		// Set the description(preparation) of the dish
 		description.setText( dish.getDescription() );
	}
}
