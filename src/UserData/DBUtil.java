package UserData;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Util.MD5Util;

public class DBUtil {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("HCZ");

	public static EntityManagerFactory getEmFactory() {
		return emf;
	}
	public static String getGravatarURL(String email, Integer size){
		 String url = "http://www.gravatar.com/avatar/" +
		 MD5Util.md5Hex(email) + "?s=" + size.toString();
		 return url;
		 }
}



