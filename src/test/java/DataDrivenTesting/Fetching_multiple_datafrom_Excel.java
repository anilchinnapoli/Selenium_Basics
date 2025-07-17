package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching_multiple_datafrom_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Convert physical file to java object
		FileInputStream fis = new FileInputStream("./src/test/resources/Mobiles1.xlsx");

		// Create/Fetching the Workbook (The Excel File)
		Workbook wb = WorkbookFactory.create(fis);

		// Fetch the Sheet
		Sheet sh = wb.getSheet("Mobiles1");

		// Fetch the multiple values

		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
				String s = sh.getRow(i).getCell(j).toString();
				// We can fetch the data without tostring() method
				// Cell c =sh.getRow(i).getCell(j);
				System.out.print(s + " ");
			}
			System.out.println();
		}

		wb.close();
	}

}
