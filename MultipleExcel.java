package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f=new FileInputStream("C://Users//DELL//Desktop//MultipleData.xlsx");
		int a=WorkbookFactory.create(f).getSheet("Sheet1").getLastRowNum();
		int b=WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getLastCellNum();
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				String d=WorkbookFactory.create(f).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.println(d);
			}
			System.out.println();
		}
	}

}
