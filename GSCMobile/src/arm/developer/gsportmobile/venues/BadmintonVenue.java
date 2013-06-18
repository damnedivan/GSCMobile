package arm.developer.gsportmobile.venues;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import arm.developer.gsportmobile.R;

public class BadmintonVenue extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.venue_badminton_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.badminton_venue, menu);
		return true;
	}

}
