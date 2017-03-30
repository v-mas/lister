package com.concisesoftware.lister.main.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.concisesoftware.lister.R;
import com.padakeji.android.ui.widget.AutoWrapLayoutManager;

public class WordsFragment extends Fragment {
	private RecyclerView recyclerView;

	public WordsFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_words, container, false);
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		recyclerView = (RecyclerView) view.findViewById(R.id.recycler);

		recyclerView.setLayoutManager(new AutoWrapLayoutManager(getActivity(), true));
	}
}
