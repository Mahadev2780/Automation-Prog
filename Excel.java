package Automation;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {

	

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		FileInputStream f=new FileInputStream("C:/Users/DELL/Desktop/Sheet1.xlsx");
		Sheet s=WorkbookFactory.create(f).getSheet("Sheet1");
		
 String a=s.getRow(3).getCell(3).getStringCellValue();
 double b=s.getRow(4).getCell(3).getNumericCellValue();
 
 System.out.println(a);
 System.out.println(b);
	}

}

