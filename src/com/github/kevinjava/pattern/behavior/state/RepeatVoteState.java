package com.github.kevinjava.pattern.behavior.state;

public class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user, VoteManager manager) {
		int voteCount = manager.getVoteCount(user);
		if(voteCount > 0 && voteCount <=5){
			System.out.println(user +":请不要重复投票");
		}else {
			manager.changeState(user, new SplitVotestate());
		}
		manager.addVoteCount(user, ++voteCount);
	}

}
