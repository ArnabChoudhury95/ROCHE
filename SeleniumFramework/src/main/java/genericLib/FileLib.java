package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
    public String getPropertyValue(String key) throws IOException {
    	FileInputStream fis=new FileInputStream("./SeleniumFramework/src/test/resources/poperties/OrgSetup.properties");
    	Properties pobj=new Properties();
    	pobj.load(fis);
    	String data=pobj.getProperty(key);
    	return data;
    }
    
    public String getExcel(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
    	FileInputStream fis=new FileInputStream("./SeleniumFramework/src/main/resources/excel/Account.xlsx");
    	Workbook wb=WorkbookFactory.create(fis);
    	Sheet sh=wb.getSheet(sheetName) ;
    	Row row=sh.getRow(rowNum);
    	Cell cl=row.getCell(cellNum);
    	String data=cl.getStringCellValue();
    	wb.close();
    	return data;	
    }
    public void setExcelData(String sheetName,int rowNum,int cellNum,String data) throws EncryptedDocumentException, IOException {
    	FileInputStream fis=new FileInputStream("./SeleniumFramework/src/main/resources/excel/Account.xlsx");
    	Workbook wb=WorkbookFactory.create(fis);
    	Sheet sh=wb.getSheet(sheetName);
    	Row row=sh.getRow(rowNum);
    	Cell cl=row.createCell(cellNum);
    	cl.setCellValue(data);
    	FileOutputStream fos=new FileOutputStream("./SeleniumFramework/src/main/resources/excel/Account.xlsx");
    	wb.write(fos);
    	wb.close();
    }
}
