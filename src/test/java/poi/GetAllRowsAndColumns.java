package poi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetAllRowsAndColumns {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("D:\\ExcelSheet\\LoginInfo.xlsx");
		XSSFWorkbook wo=new XSSFWorkbook(fs);
		XSSFSheet sh=wo.getSheet("TestDataForLogin");
		
		
		int rowcount=sh.getLastRowNum();
//		System.out.println("No of rows In Excel sheet is:  "+rowcount);
		
		for (int i = 0; i <= rowcount; i++) {
			  XSSFRow    r= sh.getRow(i);
			 int cellcount = r.getLastCellNum();
//			 System.out.println("Total no of cells in row: "+i+"is:  "+cellcount);
			 
			 for (int j = 0; j < cellcount; j++) {
				 
				 System.out.print(r.getCell(j).getStringCellValue()+"  ");
				
			}
			 System.out.println();
			
		}
		           
		
	}

}
