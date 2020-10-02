package com.BridegLabz.MoodAnalyzer;

import org.junit.Test;

import com.BridgeLabz.MoodAnalyzer.MoodAnalyzerMain;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MoodAnalyzerTest {

	@Test
	public void MoodReturnSad()
	{
		MoodAnalyzerMain Obj1 = new MoodAnalyzerMain();
		String msg = Obj1.analyseMood("I am in Sad Mood");
		Assert.assertEquals("Sad", msg);
	}
}
