package com.github.kevinjava.pattern.behavior.state;

public class BlackVoteState implements VoteState {

	@Override
	public void vote(String user, VoteManager manager) {
		System.out.println(user +":黑名单用户");
	}

}
