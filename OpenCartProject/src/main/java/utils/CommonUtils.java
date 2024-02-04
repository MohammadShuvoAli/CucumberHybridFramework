package utils;

import java.util.Date;

public class CommonUtils {

	public static String randomEmailGenerator() {

		Date date = new Date();
		return "shuvo" + date.toString().replace(" ", "_").replace(":", "_") + "@gmail.com";

	}

}
