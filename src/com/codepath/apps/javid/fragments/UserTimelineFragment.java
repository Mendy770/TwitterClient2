package com.codepath.apps.javid.fragments;

import org.json.JSONArray;

import android.os.Bundle;

import com.codepath.apps.javid.MyTwitterApp;
import com.codepath.apps.javid.Tweet;
import com.loopj.android.http.JsonHttpResponseHandler;

public class UserTimelineFragment extends TweetsListFragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		MyTwitterApp.getRestClient().getUserTimeline(new JsonHttpResponseHandler() {
			public void onSuccess(JSONArray jsonTweets) {
				getAdapter().addAll(Tweet.fromJson(jsonTweets));
			}
		});
	}
}
