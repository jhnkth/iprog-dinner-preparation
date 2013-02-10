package se.kth.csc.iprog.dinnerplanner.model;

import java.util.HashSet;
import java.util.Set;

public class DinnerModel implements IDinnerModel 
{
	Set<Dish> dishes = new HashSet<Dish>();
	
	int numGuests;
	
	// Currently selected dishes
	Set<Dish> selectedDishes = new HashSet<Dish>(); 
	
	/**
	 * The constructor of the overall model. Set the default values here
	 */
	public DinnerModel()
	{			
		//Adding some example data, you can add more
		Dish dish1 = new Dish("French toast",Dish.STARTER,"toast.jpg","In a large mixing bowl, beat the eggs. Add the milk, brown sugar and nutmeg; stir well to combine. Soak bread slices in the egg mixture until saturated. Heat a lightly oiled griddle or frying pan over medium high heat. Brown slices on both sides, sprinkle with cinnamon and serve hot.");
		Ingredient dish1ing1 = new Ingredient("eggs",0.5,"",1);
		Ingredient dish1ing2 = new Ingredient("milk",30,"ml",6);
		Ingredient dish1ing3 = new Ingredient("brown sugar",7,"g",1);
		Ingredient dish1ing4 = new Ingredient("ground nutmeg",0.5,"g",12);
		Ingredient dish1ing5 = new Ingredient("white bread",2,"slices",2);
		dish1.addIngredient(dish1ing1);
		dish1.addIngredient(dish1ing2);
		dish1.addIngredient(dish1ing3);
		dish1.addIngredient(dish1ing4);
		dish1.addIngredient(dish1ing5);
		dishes.add(dish1);
		
		Dish dish2 = new Dish("Meat balls",Dish.MAIN,"meatballs.jpg","Preheat an oven to 400 degrees F (200 degrees C). Place the beef into a mixing bowl, and season with salt, onion, garlic salt, Italian seasoning, oregano, red pepper flakes, hot pepper sauce, and Worcestershire sauce; mix well. Add the milk, Parmesan cheese, and bread crumbs. Mix until evenly blended, then form into 1 1/2-inch meatballs, and place onto a baking sheet. Bake in the preheated oven until no longer pink in the center, 20 to 25 minutes.");
		Ingredient dish2ing1 = new Ingredient("extra lean ground beef",115,"g",20);
		Ingredient dish2ing2 = new Ingredient("sea salt",0.7,"g",3);
		Ingredient dish2ing3 = new Ingredient("small onion, diced",0.25,"",2);
		Ingredient dish2ing4 = new Ingredient("garlic salt",0.6,"g",3);
		Ingredient dish2ing5 = new Ingredient("Italian seasoning",0.3,"g",3);
		Ingredient dish2ing6 = new Ingredient("dried oregano",0.3,"g",3);
		Ingredient dish2ing7 = new Ingredient("crushed red pepper flakes",0.6,"g",3);
		Ingredient dish2ing8 = new Ingredient("Worcestershire sauce",16,"ml",7);
		Ingredient dish2ing9 = new Ingredient("milk",20,"ml",4);
		Ingredient dish2ing10 = new Ingredient("grated Parmesan cheese",5,"g",8);
		Ingredient dish2ing11 = new Ingredient("seasoned bread crumbs",115,"g",4);
		dish2.addIngredient(dish2ing1);
		dish2.addIngredient(dish2ing2);
		dish2.addIngredient(dish2ing3);
		dish2.addIngredient(dish2ing4);
		dish2.addIngredient(dish2ing5);
		dish2.addIngredient(dish2ing6);
		dish2.addIngredient(dish2ing7);
		dish2.addIngredient(dish2ing8);
		dish2.addIngredient(dish2ing9);
		dish2.addIngredient(dish2ing10);
		dish2.addIngredient(dish2ing11);
		dishes.add(dish2);
		
		Dish dish3 = new Dish("Tandoori Chicken Pittas",Dish.STARTER,"pittas.jpg","In a bowl, combine the chicken pieces and lemon juice and mix well. Add the curry paste, garlic, ginger, half the chopped mint, 2 tablespoons of the yoghurt and season well. Leave for at least 34 hours, but overnight is even better. In another bowl, add the remaining yoghurt and mint and the grated cucumber, season well, and mix together thoroughly. Divide the marinated chicken between 8-10 medium-sized squares of foil, wrapping the foil tightly around the chicken. Place on top of the barbecue for about 15 minutes, or until the meat is cooked. Open up the pitta breads like pockets, then fill the bottoms with the mixed leaves and a few cubes of the chicken and top with a good dollop of the yoghurt dressing. Serve.");
		Ingredient dish3ing1 = new Ingredient("chicken breasts, skinned and cut into chunks",200,"g",5);
		Ingredient dish3ing2 = new Ingredient("lemon juice",5,"g",3);
		Ingredient dish3ing3 = new Ingredient("tandoori or Tikka Masala curry paste, diced",3,"tbsp",6);
		Ingredient dish3ing4 = new Ingredient("garlic paste or chopped fresh garlic",1,"tsp",3);
		Ingredient dish3ing5 = new Ingredient("ginger paste or chipped fresh ginger",1,"tsp",3);
		Ingredient dish3ing6 = new Ingredient("plain low-fat yoghurt",100,"g",2);
		Ingredient dish3ing7 = new Ingredient("crushed red pepper flakes",5,"g",3);
		Ingredient dish3ing8 = new Ingredient("pitta breads",12,"",7);
		Ingredient dish3ing9 = new Ingredient("mixed lettuce leaves",150,"g",4);
		dish3.addIngredient(dish3ing1);
		dish2.addIngredient(dish3ing2);
		dish3.addIngredient(dish3ing3);
		dish3.addIngredient(dish3ing4);
		dish3.addIngredient(dish3ing5);
		dish3.addIngredient(dish3ing6);
		dish3.addIngredient(dish3ing7);
		dish3.addIngredient(dish3ing8);
		dish3.addIngredient(dish3ing9);
		dishes.add(dish3);
		
		Dish dish4 = new Dish("Thai Fish Cakes",Dish.STARTER,"thai.jpg","Place the fish chunks, spring onions, chilli, curry paste, coriander, palm sugar, fish sauce, lime juice and a pinch of salt in a food processor and blend until finely minced. Transfer to a bowl and stir in the sliced green beans. Divide the mixture into 16 pieces, roll each one into a ball and then flatten into discs. Transfer the fish cakes to a plate, cover with cling film and place in the fridge for 30 minutes to 1 hour to firm up. Heat the oil in a large frying pan and when very hot fry the fish cakes for about 1-2 minute each side, until golden brown and cooked through.");
		Ingredient dish4ing1 = new Ingredient("skinless fish fillets (salmon, haddock, etc)",450,"g",50);
		Ingredient dish4ing2 = new Ingredient("spring onions, finely sliced",4,"",3);
		Ingredient dish4ing3 = new Ingredient("red chilli, deseeded and finely chopped, diced",1,"",3);
		Ingredient dish4ing4 = new Ingredient("Thai red curry paste",2,"tsp",5);
		Ingredient dish4ing5 = new Ingredient("fresh coriander leaves",2,"tbsp",4);
		Ingredient dish4ing6 = new Ingredient("fine green beans, finely sliced",50,"g",2);
		Ingredient dish4ing7 = new Ingredient("rice bran oil, for frying",1,"tbsp",3);
		Ingredient dish4ing8 = new Ingredient("pitta breads",12,"",7);
		Ingredient dish4ing9 = new Ingredient("mixed lettuce leaves",150,"g",4);
		dish4.addIngredient(dish4ing1);
		dish4.addIngredient(dish4ing2);
		dish4.addIngredient(dish4ing3);
		dish4.addIngredient(dish4ing4);
		dish4.addIngredient(dish4ing5);
		dish4.addIngredient(dish4ing6);
		dish4.addIngredient(dish4ing7);
		dish4.addIngredient(dish4ing8);
		dish4.addIngredient(dish4ing9);
		dishes.add(dish4);
		
		Dish dish5 = new Dish("Vanilla Bean and White Chocolate Pannacotta",Dish.DESSERT,"vanilla.jpg","Heat the soya cream in a pan over a medium heat. When it just begins to boil, reduce the heat and stir in the vanilla paste and chocolate. Whisk until the chocolate has melted, then remove from the heat. Soak the gelatine in cold water to soften, then squeeze dry. Put 4 tablespoons of boiling water in a bowl, add the gelatine and stir to melt. Add to the soya cream mixture, mix and pour equal amounts into 4 x 150ml moulds. Chill overnight. Dip the moulds in hot water and invert onto plates. Decorate with fresh berries.");
		Ingredient dish5ing1 = new Ingredient("soya cream",500,"ml",20);
		Ingredient dish5ing2 = new Ingredient("vanilla bean paste",1,"tbsp",3);
		Ingredient dish5ing3 = new Ingredient("white vanilla chocolate, broken up",50,"g",5);
		Ingredient dish5ing4 = new Ingredient("leaf gelatine",3,"sheets",6);
		dish5.addIngredient(dish5ing1);
		dish5.addIngredient(dish5ing2);
		dish5.addIngredient(dish5ing3);
		dish5.addIngredient(dish5ing4);
		dishes.add(dish5);
		
		Dish dish6 = new Dish("Hot Chocolate Fondant",Dish.DESSERT,"fondant.jpg"," Butter four ramekins (about 7.5cm in diameter), then dust liberally with cocoa, shaking out any excess. Slowly melt the chocolate and butter in a small bowl set over a pan of hot water, then take off the heat and stir until smooth. Leave to cool for 10 minutes. Using an electric whisk, whisk the whole egg, egg yolk and sugar together until pale and thick, then incorporate the chocolate mixture. Fold in the liqueur, followed by the flour. Divide the chocolate mixture between the ramekins and bake for 12 minutes. Turn the chocolate fondants out on to warmed plates. Dust the tops with icing sugar and serve with a dollop of creme fraiche or a scoop of vanilla ice cream.");
		Ingredient dish6ing1 = new Ingredient("unsalted butter, plus extra to grease",50,"g",10);
		Ingredient dish6ing2 = new Ingredient("cocoa powder, to dust",2,"tsp",6);
		Ingredient dish6ing3 = new Ingredient("good quality bitter chocolate",50,"g",3);
		Ingredient dish6ing4 = new Ingredient("egg",1,"",1);
		Ingredient dish6ing5 = new Ingredient("caster sugar",60,"g",3);
		Ingredient dish6ing6 = new Ingredient("plain flour, sifted",50,"g",2);
		Ingredient dish6ing7 = new Ingredient("rice bran oil, for frying",1,"tbsp",3);
		Ingredient dish6ing8 = new Ingredient("Creme fraiche or vanilla ice cream to serve",100,"g",1);
		dish6.addIngredient(dish6ing1);
		dish6.addIngredient(dish6ing2);
		dish6.addIngredient(dish6ing3);
		dish6.addIngredient(dish6ing4);
		dish6.addIngredient(dish6ing5);
		dish6.addIngredient(dish6ing6);
		dish6.addIngredient(dish6ing7);
		dish6.addIngredient(dish6ing8);
		dishes.add(dish6);
		
		// Set some default values to the attributes
		numGuests = 3;
		selectedDishes.add( dish1 );
		selectedDishes.add( dish3 );
	}
	
	/**
	 * Returns the set of dishes 
	 */
	public Set<Dish> getDishes(){
		return dishes;
	}
	
	/**
	 * Returns the set of dishes of specific type. (1 = starter, 2 = main, 3 = desert).
	 */
	public Set<Dish> getDishesOfType(int type){
		Set<Dish> result = new HashSet<Dish>();
		for(Dish d : dishes)
		{
			if(d.getType() == type){
				result.add(d);
			}
		}
		return result;
	}
	
	/**
	 * Returns the set of dishes of specific type, that contain filter in their name
	 * or name of any ingredient. 
	 */
	public Set<Dish> filterDishesOfType(int type, String filter)
	{
		Set<Dish> result = new HashSet<Dish>();
		for(Dish d : dishes){
			if(d.getType() == type && d.contains(filter)){
				result.add(d);
			}
		}
		return result;
	}

	// IDinnerModel Implementation methods
	// They need to be 
	
	@Override
	public int getNumberOfGuests() 
	{
		//return numGuests;
		return 3;
	}

	@Override
	public void setNumberOfGuests(int numberOfGuests) 
	{
		this.numGuests = numberOfGuests;
	}

	@Override
	public Dish getSelectedDish(int type) 
	{
		for( Dish d: selectedDishes )
		{
			if( d != null && d.getType() == type )
			{
				return d;
			}
		}
		
		return null;
	}
	
	public void selectDish( Dish dish )
	{
		// If a dish with the current type is already selected
		// Remove the previous one and add the new dish
		for( Dish d: selectedDishes )
		{
			if( d != null && d.getType() == dish.getType() )
			{
				selectedDishes.remove( d );
				break;
			}
		}
		
		selectedDishes.add(dish);
	}

	@Override
	public Set<Dish> getFullMenu() 
	{
		// Return a copy of the selected dishes
		return new HashSet<Dish>( selectedDishes );
	}

	@Override
	public Set<Ingredient> getAllIngredients() 
	{
		Set<Ingredient> ingredients = new HashSet<Ingredient>();
		
		for( Dish d : selectedDishes )
		{
			ingredients.addAll( d.getIngredients() );
		}
		
		return ingredients;
	}

	@Override
	public float getTotalMenuPrice() 
	{
		int pricePerGuest = 0;
		Set<Ingredient> ingredients = getAllIngredients();
		
		for( Ingredient i: ingredients )
		{
			pricePerGuest += i.getPrice() * i.getQuantity(); 
		}
		
		return pricePerGuest * getNumberOfGuests();
	}
}
