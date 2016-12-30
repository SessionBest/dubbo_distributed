package com.distributed.transaction.api.enums;

/**
 * 
 * @author SessionBest
 *
 */
public enum ParticipantType {
	
	ROOT(1),
	PAREANT(2),
	CHILD(3);
	
	
	private final int value;

	private ParticipantType(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
}
