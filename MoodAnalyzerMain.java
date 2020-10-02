package com.BridgeLabz.MoodAnalyzer;

import java.util.Scanner;

public class MoodAnalyzerMain {

	public String analyseMood(String msg)
	{
		if(msg.contains("Sad"))
		{
			return "Sad";
		}
		else
		{
			return "Happy";
		}
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
     System.out.println("Welcome To Mood Analyzer Problem");
     Scanner sc = new Scanner(System.in);
     String msg = sc.nextLine();
     MoodAnalyzerMain Obj = new MoodAnalyzerMain();
     String result = Obj.analyseMood(msg);
	 System.out.println(result);
	}

}
