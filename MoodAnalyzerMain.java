package com.BridgeLabz.MoodAnalyzer;

public class MoodAnalyzerMain {
    private String msg;
	
	public MoodAnalyzerMain() {
		
	}
	
	public MoodAnalyzerMain(String msg) {
		this.msg=msg;
	}
	
	public String analyseMood(String msg) {
		this.msg=msg;
		return analyseMood();
	}
	
	public String analyseMood()
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
}


