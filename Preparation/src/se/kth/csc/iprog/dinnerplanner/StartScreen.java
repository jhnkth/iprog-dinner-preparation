package se.kth.csc.iprog.dinnerplanner;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class StartScreen extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_startscreen);
	}

	
	public void onClick(View v){}
	
	public void alertbtn(View v){
		
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		new AlertDialog.Builder(this);
		final EditText input = new EditText(this);
		alert.setView(input);

		alert.setTitle("Guests");
		alert.setMessage("Select numer of guests");
		alert.setNeutralButton("OK", null);
		alert.show();
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_startscreen, menu);
		return true;
	}

}
