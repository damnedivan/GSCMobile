package arm.developer.gsportmobile.bookvenues;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import arm.developer.gsportmobile.R;
import arm.developer.gsportmobile.receiver.DeliveryReceiver;
import arm.developer.gsportmobile.receiver.SentReceiver;
import arm.developer.gsportmobile.utility.BookHelper;

import com.actionbarsherlock.app.SherlockActivity;

public class BookGolf extends SherlockActivity {
	private static final String TAG = BookGolf.class.getSimpleName();
	public static final String SMS_SENT = "SMS_SENT";
	public static final String SMS_DELIVERED = "SMS_DELIVERED";
	private final BroadcastReceiver sentReceiver = new SentReceiver();
	private final BroadcastReceiver deliveryReceiver = new DeliveryReceiver();

	Button btnGolf;
	EditText namaGolf, alamatGolf, telpGolf;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.book_golf_layout);

		btnGolf = (Button) findViewById(R.id.btn_golfBook);
		namaGolf = (EditText) findViewById(R.id.text_golfNama);
		alamatGolf = (EditText) findViewById(R.id.text_golfAlamat);
		telpGolf = (EditText) findViewById(R.id.text_golfTelp);

		String namaG = namaGolf.getText().toString();
		String alamatG = alamatGolf.getText().toString();
		String telpG = telpGolf.getText().toString();

		final String smsMessage = String.format("%s\n%s\n%s", namaG, alamatG,
				telpG);

		btnGolf.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				try {
					BookHelper.sendSMS(getApplicationContext(),
							"+6287792021743", smsMessage);
				} catch (Exception e) {
					Toast.makeText(getApplicationContext(),
							"SMS faild, please try again later!",
							Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}

			}
		});

	}

	@Override
	protected void onPause() {
		try {
			unregisterReceiver(sentReceiver);
			unregisterReceiver(deliveryReceiver);
		} catch (RuntimeException e) {
			Log.e(TAG, "Receiver not Registered");
		}
		super.onPause();
	}

	@Override
	protected void onResume() {
		super.onResume();
		registerReceiver(sentReceiver, new IntentFilter(SMS_SENT));
		registerReceiver(sentReceiver, new IntentFilter(SMS_DELIVERED));
		Log.d(TAG, "onResume");
	}

}
