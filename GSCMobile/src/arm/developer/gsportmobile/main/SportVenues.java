package arm.developer.gsportmobile.main;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import arm.developer.gsportmobile.R;
import arm.developer.gsportmobile.adapter.SportVenuesStableArrayAdapter;
import arm.developer.gsportmobile.venues.AerobicVenue;
import arm.developer.gsportmobile.venues.BadmintonVenue;
import arm.developer.gsportmobile.venues.FutsalVenue;
import arm.developer.gsportmobile.venues.GolfSimulatorVenue;
import arm.developer.gsportmobile.venues.GymVenue;
import arm.developer.gsportmobile.venues.PoolVenue;

import com.actionbarsherlock.app.SherlockActivity;

public class SportVenues extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_content_sport_venues_layout);

		final ListView listview = (ListView) findViewById(R.id.listview);
		String[] values = new String[] { "Golf Simulator", "Futsal",
				"Swimming Pool & Whirlpool", "Gym", "Badminton", "Aerobic" };

		final ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < values.length; ++i) {
			list.add(values[i]);
		}
		final SportVenuesStableArrayAdapter adapter = new SportVenuesStableArrayAdapter(
				this, android.R.layout.simple_list_item_1, list);
		listview.setAdapter(adapter);

		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) {
				final String item = (String) parent.getItemAtPosition(position);
				view.animate().setDuration(2000).alpha(0)
						.withEndAction(new Runnable() {
							@Override
							public void run() {
								list.remove(item);
								adapter.notifyDataSetChanged();
								view.setAlpha(1);
							}
						});
			}

		});

		listview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				switch (position) {
				case 0:
					Intent intent0 = new Intent(SportVenues.this,
							GolfSimulatorVenue.class);
					startActivity(intent0);
					break;
				case 1:
					Intent intent1 = new Intent(SportVenues.this,
							FutsalVenue.class);
					startActivity(intent1);
					break;
				case 2:
					Intent intent3 = new Intent(SportVenues.this,
							PoolVenue.class);
					startActivity(intent3);
					break;
				case 3:
					Intent intent4 = new Intent(SportVenues.this,
							GymVenue.class);
					startActivity(intent4);
					break;
				case 4:
					Intent intent5 = new Intent(SportVenues.this,
							BadmintonVenue.class);
					startActivity(intent5);
					break;
				case 5:
					Intent intent6 = new Intent(SportVenues.this,
							AerobicVenue.class);
					startActivity(intent6);
					break;

				default:
					break;
				}

			}
		});
	}

}
