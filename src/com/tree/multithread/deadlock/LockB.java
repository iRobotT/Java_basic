package com.tree.multithread.deadlock;
public class LockB {
	private LockB(){}
	public final static LockB lockB = new LockB();
}
