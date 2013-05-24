package com.laclife.ui.products;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.laclife.LACLifeApplication;
import com.laclife.ui.R;

public class NumberVerificationActivity extends HomeBaseActivity implements
		OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_number_verification);

		String product = ((LACLifeApplication) getApplication())
				.getProductQuote();
		setActionBarTitle(product);

		TextView txtTitle = (TextView) findViewById(R.id.txtTitle);
		
		Button btnGetQuote = (Button) findViewById(R.id.btnGetQuote);
		btnGetQuote.setOnClickListener(this);
		
		txtTitle.setText(getString(R.string.des_verify_number_));
	}

	@Override
	public void onClick(View view) {
		Intent intent = new Intent(this, NumberVerificationActivity.class);
		startActivity(intent);
	}

}
