package UnitTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Util.HCZJobUtil;
import model.Hczjob;

public class Job {

	@Test
	public void test() {
		List <Hczjob> jobs =HCZJobUtil.getJobs();
		
		for( Hczjob s : jobs) {
			System.out.println("Job Name: "+ s.getJobname());
			
		}
	}

}
