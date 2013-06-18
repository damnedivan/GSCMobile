package arm.developer.gsportmobile.pricing;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import arm.developer.gsportmobile.R;

public class PricingGolf extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pricing_oh_golf);

		// Overlay
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 1; i++) {
			for (String dialog : DIALOGUE) {
				builder.append(dialog).append("\n\n");
			}

		}

		TextView desc = (TextView) findViewById(R.id.overlayPricingGolf);
		desc.setText(builder.toString());
	}

	public static final String[] DIALOGUE = new String[] {

			"HARGA REGULER:",

			"07.00 WIB - 15.00 WIB : Rp. 103.000,-/jam"
					+ "\n16.00 WIB - 24.00 WIB : Rp. 203.000,-/jam",

			"HARGA VIP ROOM:",

			"07.00 WIB - 15.00 WIB : Rp. 128.000,-/jam"
					+ "\n16.00 WIB - 24.00 WIB : Rp. 253.000,-/jam" };

}
