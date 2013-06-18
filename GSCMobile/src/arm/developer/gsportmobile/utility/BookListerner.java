package arm.developer.gsportmobile.utility;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

public class BookListerner implements OnClickListener {

	private String message, phoneNumber;
	private Context context;

	public BookListerner(Context context, String message, String phoneNumber) {
		this.context = context;
		this.message = message;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void onClick(View v) {
		BookHelper.sendSMS(context, phoneNumber, message);
	}

}
