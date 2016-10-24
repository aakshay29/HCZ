package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Util.HCZApplicationUtil;
import Util.HCZJobUtil;
import model.Hczapplication;
import model.Hczjob;

public class Insert {

	@Test
	public void test() {
		 Hczapplication hczapp =new Hczapplication();
		 Hczjob jb =HCZJobUtil.getJob(109);
		 hczapp.setApplicantname("DAve");
		 hczapp.setHczjob(jb);
		 HCZApplicationUtil.insert(hczapp);
		 System.out.println("Inserted");
		 
	}

}
