package com.hsbc.day4Assignment.q1.view;

import com.hsbc.day4Assignment.q1.Impl.MobileIMPL;

public class Tester {
	
	/*
	 * main method
	 */
	public static void main(String args[]) {
		
		
		MobileIMPL mobileImpl = new MobileIMPL();
		
		mobileImpl.doAccessInternet();
		mobileImpl.makeCalls();
		mobileImpl.makeVideoCalls();
		mobileImpl.playGames();
		mobileImpl.playMusic();
		mobileImpl.playVideo();
		mobileImpl.switchTorch();
		mobileImpl.takePictures();
		mobileImpl.takeSelfie();
		mobileImpl.viewPictures();
	}

}
