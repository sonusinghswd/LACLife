package com.laclife.ui.login;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.laclife.ui.R;

public class UserHomeFragment extends BaseFragment {

	public static UserHomeFragment newInstance() {
		UserHomeFragment fragment = new UserHomeFragment();
		return fragment;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_add_risk, container,
				false);

		return view;
	}

}