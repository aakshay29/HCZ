package UnitTest;

import static org.junit.Assert.*;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import Util.HCZJobUtil;
import model.Hczapplication;
import model.Hczjob;

public class Job {

	@Test
	public void test() {

	 	String pattern = "dd-MM-YYYY";
	 	Date dt = new Date();
	    SimpleDateFormat format = new SimpleDateFormat(pattern);
	    try {
	      Date date = (Date) format.parse("12-31-2006");
	      System.out.println(date);
	    } catch (ParseException e) {
	      e.printStackTrace();
	    } catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Hczapplication app =new Hczapplication();
		app.setBirthday(dt);
		
		
		}
	}


