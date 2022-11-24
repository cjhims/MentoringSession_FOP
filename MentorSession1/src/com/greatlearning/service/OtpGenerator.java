package com.greatlearning.service;

public class OtpGenerator {
	
	public static int generateOtp() //utility methods are usually made static
	{
		int otp=(int)(Math.random()*9000)+1000;
		return otp;
	}
}
