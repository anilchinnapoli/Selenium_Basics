package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackDatatoExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//Convert Physical object to JAVA Object
		FileInputStream fis = new FileInputStream
				("./src/test/resources/Mobiles1.xlsx");

		//Fetch the WorkBook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Fetch the Sheet
		Sheet sh = wb.getSheet("Mobiles1");
		
		//Fetch the Row
		//Row r = sh.getRow(5);
		
		//Create the row
		Row r1 = sh.createRow(6);
		
		//create the Cell
		Cell c = r1.createCell(1);
		
		//Set the data
		c.setCellValue("selenium");
		 
		//Converting java to physical file
		FileOutputStream fos =new FileOutputStream
				("./src/test/resources/Mobiles1.xlsx");

		wb.write(fos);
		
		wb.close();
	}

}
