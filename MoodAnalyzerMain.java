package com.BridgeLabz.MoodAnalyzer;

public class MoodAnalyzerMain {
    private String msg;
	
	public MoodAnalyzerMain() {
		
	}
	
	public MoodAnalyzerMain(String msg) {
		this.msg=msg;
	}
	
	public String analyseMood() throws MoodAnalysisException
	{
		try {
			if(msg.contains("Sad"))
				return "Sad";
			else
				return "Happy";
			}
		catch(Exception e) {
			if(msg==null)
				throw new MoodAnalysisException("Please provide valid details, dont provide null in arguments");
			else
				throw new MoodAnalysisException("Please provide valid details, dont keep empty in arguments");
		}
	}
}


