package com.hsbc.day4Assignment.q1.utility;

import com.hsbc.day4Assignment.q1.ISmartMobille;
import com.hsbc.day4Assignment.q1.Mobile;

public class IMPLFactory {
	
	private IMPLFactory() {
		
	}

	public static ISmartMobille createImplObject()
 {
		return new Mobile();
		}
 }
