package com.hsbc.day4Assignment.q2_6.utility;

import com.hsbc.day4Assignment.q2_6.exception.InvalidStorageTypeException;
import com.hsbc.day4Assignment.q2_6.storage.Storage;
import com.hsbc.day4Assignment.q2_6.storage.StorageArrayImpl;
import com.hsbc.day4Assignment.q2_6.storage.StorageImpl;
import com.hsbc.day4Assignment.q2_6.storage.StorageMapImpl;
import com.hsbc.day4Assignment.q2_6.storage.StorageSortedImpl;

public class StorageFactory {
	
	
	/*
	 * storage factory constructor
	 */
	private StorageFactory() {
		
	}
	
	/*
	 * createStorageObject() method
	 * return StorageImpl
	 */

	public static Storage getStorage(int code) throws InvalidStorageTypeException {
		
		
		if(code == 2) {
			return new StorageImpl();
		}
		else if(code == 1) {
			return new StorageArrayImpl();
		}
		else if(code == 3) {
			return new StorageSortedImpl();
		}
		else if(code == 4) {
			return new StorageMapImpl();
		}
		else {
			throw new InvalidStorageTypeException();
		}
		
		
	}
	
}
