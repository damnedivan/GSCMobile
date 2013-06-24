package arm.developer.gsportmobile.bookvenues;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import arm.developer.gsportmobile.R;
import arm.developer.gsportmobile.adapter.AdapterJam;

import com.actionbarsherlock.app.SherlockActivity;

public class BookGolf extends SherlockActivity {

	private Button btnGolf, btnTglGolf;
	private EditText namaGolf, alamatGolf, telpGolf;
	private TextView tanggalGolf;
	private int mYear;
	private int mMonth;
	private int mDay;
	private Spinner spnJamBook;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.book_golf_layout);

		btnGolf = (Button) findViewById(R.id.btn_golfBook);
		btnTglGolf = (Button) findViewById(R.id.btn_golfTanggal);
		namaGolf = (EditText) findViewById(R.id.text_golfNama);
		alamatGolf = (EditText) findViewById(R.id.text_golfAlamat);
		telpGolf = (EditText) findViewById(R.id.text_golfTelp);
		spnJamBook = (Spinner) findViewById(R.id.spinnerJamGolf);
		// TODO===========================DATEPICKER===================================
		tanggalGolf = (TextView) findViewById(R.id.tv_golfTanggal);
		// TODO===========================ENDDATEPICKER===================================
		setAdapter();
		
		
		btnGolf.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String namaG = namaGolf.getText().toString();
				String alamatG = alamatGolf.getText().toString();
				String telpG = telpGolf.getText().toString();
				AdapterJam aj = (AdapterJam) spnJamBook.getSelectedItem();
				// TODO===========================DATEPICKER===================================
				String tanggalG = tanggalGolf.getText().toString();
				// TODO===========================ENDDATEPICKER===================================

				final String smsMessage = String.format("%s\n%s\n%s\n%s\n%s",
						namaG, alamatG, telpG, tanggalG, aj);

				try {

					SmsManager smsM = SmsManager.getDefault();
					smsM.sendTextMessage("+6287792021743", null, smsMessage,
							null, null);
					Toast.makeText(getApplicationContext(), "Request Dikirim",
							Toast.LENGTH_LONG).show();
				} catch (Exception e) {
					Toast.makeText(getApplicationContext(),
							"SMS failed, please try again later!",
							Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}

			}
		});

		// TODO===========================DATEPICKER===================================

		btnTglGolf.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				new DatePickerDialog(BookGolf.this, mDateSetListener, mYear,
						mMonth, mDay).show();

			}
		});

		final Calendar c = Calendar.getInstance();
		mYear = c.get(Calendar.YEAR);
		mMonth = c.get(Calendar.MONTH);
		mDay = c.get(Calendar.DAY_OF_MONTH);
		updateDisplay();
		// TODO===========================ENDDATEPICKER===================================

	}

	// TODO===========================DATEPICKER================================

	private void updateDisplay() {
		tanggalGolf.setText(new StringBuilder()
				// Month is 0 based so add 1
				.append(mMonth + 1).append("-").append(mDay).append("-")
				.append(mYear).append(" "));
	}

	private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			mYear = year;
			mMonth = monthOfYear;
			mDay = dayOfMonth;
			updateDisplay();
		}
	};
	// TODO===========================ENDDATEPICKER===================================

	private void setAdapter() {
		ArrayAdapter<AdapterJam> spnJamAdapter = new ArrayAdapter<AdapterJam>(
				this, android.R.layout.simple_spinner_item,
				AdapterJam.values());
		spnJamAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spnJamBook.setAdapter(spnJamAdapter);
		
	}
}
