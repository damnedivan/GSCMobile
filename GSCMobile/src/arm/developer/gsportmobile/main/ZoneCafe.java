package arm.developer.gsportmobile.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import arm.developer.gsportmobile.R;

public class ZoneCafe extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_content_zonecafe_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.zone_cafe, menu);
		return true;
	}

}
