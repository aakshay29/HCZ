package UnitTest;

import org.junit.Test;

import Util.HCZApplicationStatusUtil;
import model.Hczapplicationstatus;

public class StatusCheck {

	@Test
	public void test() {
		
		long statusid = 221;
		Hczapplicationstatus chkstatus= HCZApplicationStatusUtil.getApplicationStatus(statusid);
		System.out.println("The status of the application is " + chkstatus.getStatus());
		
	}

}
