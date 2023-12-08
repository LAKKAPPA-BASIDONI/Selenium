package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry  implements IRetryAnalyzer{
	int count =0;
	int max=5;
	

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<max) {
			count++;
			return true;
		}
		return false;
	}

}

//<dependency>
//<groupId>org.testng</groupId>
//<artifactId>testng</artifactId>
//<version>7.8.0</version>
//<scope>test</scope>
//</dependency>
