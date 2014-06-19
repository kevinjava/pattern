package com.github.kevinjava.pattern.behavior.state;

import java.util.HashMap;

public class VoteManager {
	HashMap<String, Integer> voteInfo = new HashMap<>();
	HashMap<String, VoteState> voteStates = new HashMap<>();

	public void vote(String user) {
		VoteState state = voteStates.get(user);
		if (state == null) {
			state = new NormalVoteState();
		}
		
		state.vote(user, this);
	}

	public void changeState(String user, VoteState state) {
		System.out.println("change state to :" + state.getClass().getSimpleName());
		voteStates.put(user, state);
	}

	public int getVoteCount(String user) {
		return voteInfo.get(user) == null ? 0 : voteInfo.get(user).intValue();
	}
	
	public void addVoteCount(String user, int count){
		voteInfo.put(user, count);
	}
}
