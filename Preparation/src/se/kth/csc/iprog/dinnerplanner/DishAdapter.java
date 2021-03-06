package se.kth.csc.iprog.dinnerplanner;

import se.kth.csc.iprog.dinnerplanner.model.Dish;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DishAdapter extends ArrayAdapter<Dish>
{
	Context context; 
    int layoutResourceId;    
    Dish[] data;
    public DishAdapter(Context context, int layoutResourceId, Dish[] data)
    {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }
    
    @Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		View row = convertView;
		DishHolder holder = null;
		
		if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new DishHolder();
            holder.dishImage = (ImageView)row.findViewById(R.id.dishImage);
            holder.dishTitle = (TextView)row.findViewById(R.id.dishTitle);
            holder.dishInfo = (TextView)row.findViewById(R.id.dishInfo);
            
            row.setTag(holder);
        }
		
        else
        {
            holder = (DishHolder)row.getTag();
        }
		
		Dish dsh = data[position];
		
	    String resourceName = (dsh.getImage().lastIndexOf('.') > 0) ? dsh.getImage().substring(0, dsh.getImage().lastIndexOf('.')) : dsh.getImage();
		
		holder.dishImage.setImageResource(
				context.getResources().getIdentifier( resourceName, "drawable", context.getPackageName()) 
				);
        holder.dishTitle.setText(dsh.getName());
        holder.dishInfo.setText(dsh.getDescription().substring(0, 26)+"...");
        return row;
	}
    
	public static class DishHolder
	{
		ImageView dishImage;
		TextView dishTitle;
		TextView dishInfo;
	}
}

