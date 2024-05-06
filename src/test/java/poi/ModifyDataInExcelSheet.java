package poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModifyDataInExcelSheet {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("D:\\ExcelSheet\\LoginInfo.xlsx");
		XSSFWorkbook wo=new XSSFWorkbook(fs);
		XSSFSheet   sh= wo.getSheet("TestDataForLogin");
		sh.getRow(1).getCell(1).setCellValue("4321@kumar");
		FileOutputStream fo=new FileOutputStream("D:\\ExcelSheet\\LoginInfo.xlsx");
		wo.write(fo);
		
	}

}
