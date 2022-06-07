package de.payback.utilities;

import org.apache.commons.lang3.RandomStringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtilities {

	public static String GetCurrentTimeStamp() 
	{
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// dd/MM/yyyy
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    return strDate;
	}


	public static String GetCurrentTimeStampAsString()
	{
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// dd/MM/yyyy
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    strDate=strDate.replace("-","").replace(" ", "").replace(":","");
	    return strDate;
	}

	public static String generateRandomNumber(int size) {
		return RandomStringUtils.randomNumeric(size);
	}

}
