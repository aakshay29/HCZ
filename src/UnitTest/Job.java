package UnitTest;

import static org.junit.Assert.*;


import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.Test;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import Util.HCZApplicationUtil;
import Util.HCZJobUtil;
import model.Hczapplication;
import model.Hczjob;

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


