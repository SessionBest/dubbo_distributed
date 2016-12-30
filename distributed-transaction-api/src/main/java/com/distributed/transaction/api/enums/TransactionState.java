package com.distributed.transaction.api.enums;

/**
 * 
 * @author yubing
 *
 */
public enum TransactionState {
	COMMIT(1),
	ROLLBACK_SUCCESS(2),
	ROLLBACK_FAIL(3);
	
	private TransactionState(int value){
		this.value = value;
	}
	
	private final int value;
	
	public int getValue(){
		return value;
	}

}
