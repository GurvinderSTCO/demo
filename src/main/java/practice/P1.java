package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class P1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\MatharuGurvinderSing\\eclipse-workspace\\practice\\src\\test\\resources\\properties");
		Properties p=new Properties();
		p.load(fis);
		String BROWSER=p.getProperty("browser");
		System.out.println(BROWSER);
		String USERNAME=p.getProperty("name");
		System.out.println(USERNAME);

	}

}
