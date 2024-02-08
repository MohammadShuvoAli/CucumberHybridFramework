package utils;

import java.util.Date;

public class CommonUtils {

	public static final int IMPLICIT_WAIT_TIME=10;
	public static final int PAGE_LOAD_TIME=10;
	public static final int EXPLICIT_WAIT_BASIC_TIME=10;
	
	public static String randomEmailGenerator() {

		Date date = new Date();
		return "shuvo" + date.toString().replace(" ", "_").replace(":", "_") + "@gmail.com";

	}

}
