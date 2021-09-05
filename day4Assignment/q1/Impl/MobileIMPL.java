package com.hsbc.day4Assignment.q1.Impl;

import com.hsbc.day4Assignment.q1.ISmartMobille;
import com.hsbc.day4Assignment.q1.utility.IMPLFactory;

public class MobileIMPL implements ISmartMobille{
	
	
	ISmartMobille ism;
	
	public MobileIMPL() {
		ism = IMPLFactory.createImplObject();
	}

	@Override
	public void playMusic() {
		ism.playMusic();
		
	}

	@Override
	public void playVideo() {
		ism.playVideo();
		
	}

	@Override
	public void takePictures() {
		ism.takePictures();
		
	}

	@Override
	public void viewPictures() {
		ism.viewPictures();
		
	}

	@Override
	public void doAccessInternet() {
		
		ism.doAccessInternet();
		
	}

	@Override
	public void playGames() {
		ism.playGames();
		
	}

	@Override
	public void faceLock() {
		ism.faceLock();
		
	}

	@Override
	public void takeSelfie() {
		ism.takeSelfie();
		
	}

	@Override
	public void switchTorch() {
		ism.switchTorch();		
	}

	@Override
	public void makeCalls() {
		ism.makeCalls();
		
	}

	@Override
	public void makeVideoCalls() {
		ism.makeVideoCalls();
		
	}
	
	

}
