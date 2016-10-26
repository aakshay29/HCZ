package UnitTest;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;






public class Status {

	@Test
	public void test() throws IOException {
		 
		 
		
		 	String name ="Neha";
		 	String email ="nehajamwal89@gmail.com";
		 
			FileWriter filewriter = new FileWriter("/home/oracle/workspace/HCZ/src/UnitTest/Resume.txt", true);
			filewriter.write("Name: "+ name + "\n");
			filewriter.write("Email: "+ email + "\n");
			
			filewriter.flush();
			filewriter.close();
	}

}
