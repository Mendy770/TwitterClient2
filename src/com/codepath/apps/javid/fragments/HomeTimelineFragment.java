package com.codepath.apps.javid.fragments;

import java.util.ArrayList;

import org.json.JSONArray;

import com.codepath.apps.javid.MyTwitterApp;
import com.codepath.apps.javid.R;
import com.codepath.apps.javid.Tweet;
import com.loopj.android.http.JsonHttpResponseHandler;

public class HomeTimelineFragment extends TweetsListFragment {
	
	

	public void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MyTwitterApp.getRestClient().getHomeTimeline(new JsonHttpResponseHandler() {
			
			@Override
			public void onSuccess(JSONArray jsonTweets) {
				getAdapter().addAll(Tweet.fromJson(jsonTweets));
			}
		});
	}
}
