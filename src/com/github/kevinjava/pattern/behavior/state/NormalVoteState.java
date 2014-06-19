package com.github.kevinjava.pattern.behavior.state;

public class NormalVoteState implements VoteState {

	@Override
	public void vote(String user, VoteManager manager) {
		int voteCount = manager.getVoteCount(user);
		if(voteCount == 0){
			System.out.println(user +":投票成功");
			manager.addVoteCount(user, 1);
			manager.changeState(user, new RepeatVoteState());
		}
	}

}
