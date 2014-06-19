package com.github.kevinjava.pattern.behavior.state;

public class SplitVotestate implements VoteState {

	@Override
	public void vote(String user, VoteManager manager) {
		int voteCount = manager.getVoteCount(user);
		if(voteCount > 5 && voteCount <=8){
			System.out.println(user +":请不要恶意刷票");
		}else {
			manager.changeState(user, new BlackVoteState());
		}
		manager.addVoteCount(user, ++voteCount);
	}

}
