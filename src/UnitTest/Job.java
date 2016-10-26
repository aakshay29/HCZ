package UnitTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import Util.HCZApplicationUtil;
import model.Hczapplication;

public class Job {

	@Test
	public void test() throws java.text.ParseException  {

		String bd ="10-05-2010";
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		Date dt = formatter.parse(bd);
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		Hczapplication app =new Hczapplication();
		app.setBirthday(sqlDate);
		HCZApplicationUtil.update(app);
		System.out.println("Date " +sqlDate);
		
		
		}
	}


