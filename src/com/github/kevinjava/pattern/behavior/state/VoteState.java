package com.github.kevinjava.pattern.behavior.state;

public interface VoteState {
	void vote(String user, VoteManager manager);
}
