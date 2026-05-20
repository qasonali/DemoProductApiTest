package utilities;

import java.util.UUID;

public class TestDataUtil {

	public static String getUniqueUsername() {

		return "user" + System.currentTimeMillis();
	}
	
	public static String getUniqueLname() {

		return "last" + System.currentTimeMillis();
	}
	
	public static String getUniqueFirstname() {

		return "firstname" + UUID.randomUUID().toString();
	}
	
	public static String getUniquePassword() {

		return "pass" + UUID.randomUUID().toString();
	}
}
