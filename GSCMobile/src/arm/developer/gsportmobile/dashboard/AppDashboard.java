package arm.developer.gsportmobile.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import arm.developer.gsportmobile.R;
import arm.developer.gsportmobile.main.ClassesContent;
import arm.developer.gsportmobile.main.GProShop;
import arm.developer.gsportmobile.main.SportVenues;
import arm.developer.gsportmobile.main.ZoneCafe;

import com.actionbarsherlock.app.SherlockActivity;

public class AppDashboard extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_layout);

		// Declare bung!
		Button btnSportVenues = (Button) findViewById(R.id.btn_sportVenues);
		Button btnClasses = (Button) findViewById(R.id.btn_classes);
		Button btnGproshop = (Button) findViewById(R.id.btn_gproshop);
		Button btnZoneCafe = (Button) findViewById(R.id.btn_zoneCafe);

		// button listener cuy!
		btnSportVenues.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Eksekusi
				Intent i = new Intent(getApplicationContext(),
						SportVenues.class);
				startActivity(i);

			}
		});

		btnClasses.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Eksekusi
				Intent i = new Intent(getApplicationContext(),
						ClassesContent.class);
				startActivity(i);

			}
		});

		btnGproshop.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Eksekusi
				Intent i = new Intent(getApplicationContext(), GProShop.class);
				startActivity(i);

			}
		});

		btnZoneCafe.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Eksekusi
				Intent i = new Intent(getApplicationContext(), ZoneCafe.class);
				startActivity(i);

			}
		});

	}

}
