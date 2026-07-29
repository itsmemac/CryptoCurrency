package com.rabbitcompany.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Number {

	public static boolean isNumeric(String str) {
		if (str == null || str.isEmpty()) return false;
		try {
			new BigDecimal(str.trim());
			return true;
		} catch (NumberFormatException ignored) {}
		return false;
	}

	public static int getInteger(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException ignored) {
		}
		return 0;
	}

	public static double roundDouble(double d, int places) {
		BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
		bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
		return bigDecimal.doubleValue();
	}
}
