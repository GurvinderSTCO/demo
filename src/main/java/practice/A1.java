package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Guru1.xlsx");
Workbook wb=WorkbookFactory.create(fis);
org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Guru");
Row rw= sh.getRow(0);
Cell cl=rw.getCell(0);
String data=cl.getStringCellValue();
System.out.println(data);
wb.close();
	}

}
