package arm.developer.gsportmobile.venues;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import arm.developer.gsportmobile.R;
import arm.developer.gsportmobile.bookvenues.BookGolf;
import arm.developer.gsportmobile.pricing.PricingGolf;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class GolfSimulatorVenue extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.venue_golf_simulator_layout);

		// Overlay
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 1; i++) {
			for (String dialog : DIALOGUE) {
				builder.append(dialog).append("\n\n");
			}

		}

		TextView desc = (TextView) findViewById(R.id.overlayGolf);
		desc.setText(builder.toString());

	}

	public static final String[] DIALOGUE = new String[] {
			"Merupakan yang pertama di Kota Padang dan Sumatera,"
					+ " luas area 175 M2, ruangan ber AC, sofa dan meja minuman,"
					+ " kualitas fitting studio dan sistim terbaik,"
					+ " tidak terhalang dengan faktor jarak,"
					+ " waktu dan cuaca jika dibandingkan dengan permainan golf dilapangan."
					+ " Untuk kenyamanan tamu atau member GSC tersedia beberapa Golf Club untuk dipinjamkan.",

			"The First Commercial Use in Indonesia: Full Swing Golf,"
					+ " PGA Certified Golf Simulators, more than 96% accuracy."
					+ " Simulator yang satu ini menawarkan permainan golf simulator"
					+ " yang hampir sama dengan permainan asli. Untuk pemasangan game"
					+ " simulator ini dibutuhkan ruangan dengan ukuran"
					+ " 6m(panjang) x 4m(lebar) x 3m(tinggi). Sedangkan untuk software"
					+ " menggunakan basis dari sistim operasi Windows dan penggunaan"
					+ " high definition video projector yang akan membuat permainan"
					+ " menjadi lebih realistis. Full Swing Golf Simulator juga"
					+ " mempunyai fitur Club Fitting untuk turnamen dan engine grafik"
					+ " termuktahir yang pernah ada saat ini."

	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getSupportMenuInflater();
		inflater.inflate(R.menu.venue_golf_simulator_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

		case R.id.action_pricingGolf:
			Intent openPricingGolf = new Intent(GolfSimulatorVenue.this,
					PricingGolf.class);
			startActivity(openPricingGolf);

			break;
		case R.id.action_bookGolf:
			Intent openBookGolf = new Intent(GolfSimulatorVenue.this,
					BookGolf.class);
			startActivity(openBookGolf);

			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
