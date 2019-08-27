package Topics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class readingPropertyFiles {

	@Test
	public static void name() throws IOException {

//		File file = new File(System.getProperty("user.dir")+"/src/MyProperties/siteData.properties");
		FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir")+"/src/MyProperties/siteData.properties");
		Properties prop = new Properties();
		prop.load(fileInput);
		System.out.println(prop.getProperty("URL"));

	}
}
