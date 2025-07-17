package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchtheData_From_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Convert physical File to java file
		FileInputStream fis = new FileInputStream("./src/test/resources/Mobiles.xlsx");
		
		//Creating/Fetching theWorkBook(Excel File)
		 Workbook wb = WorkbookFactory.create(fis);

		 //Fetch the Sheet
	     Sheet sh = wb.getSheet("Mobiles");
	     
	     //Fetch the row
	     Row r = sh.getRow(4);
	     
	     //Fetch the Cell
	     Cell c = r.getCell(1);
	     
	     //Fetch the data
	    // String data = c.getStringCellValue();
	     
	      double num = c.getNumericCellValue();
	    
	      System.out.println(num);
	     
	}

}
