package arm.developer.gsportmobile.venues;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import arm.developer.gsportmobile.R;

public class GymVenue extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.venue_gym_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.venue_gym_menu, menu);
		return true;
	}

}
