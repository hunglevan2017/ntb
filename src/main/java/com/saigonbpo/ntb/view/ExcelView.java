package com.saigonbpo.ntb.view;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-excel-csv-pdf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/02/18
 * Time: 20.59
 * To change this template use File | Settings | File Templates.
 */

public class ExcelView extends AbstractXlsView {
	

    @SuppressWarnings("resource")
	@Override
    protected void buildExcelDocument(Map<String, Object> model,
                                      Workbook workbook,
                                      HttpServletRequest request,
                                      HttpServletResponse response) throws IOException, EncryptedDocumentException, InvalidFormatException {

        // change the file name
        response.setHeader("Content-Disposition", "attachment; filename=\"my-xls-file.xls\"");
        
        
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("template/Certificate.xls").getFile());
        
        FileInputStream fis = new FileInputStream(file);
        
        org.apache.poi.ss.usermodel.Workbook poiWorkbook = WorkbookFactory.create(fis);
        

      //  workbook = poiWorkbook;
        
      //  XSSFWorkbook wb = new XSSFWorkbook(file);
        
        Sheet sheet =  workbook.createSheet("User Detail");
        
        sheet =  poiWorkbook.getSheetAt(0) ;
        
        
        
        
        int type_report = (int) model.get("type_report");
        
        if(  type_report== 1 )
        {
        	System.out.println("Say something");
        }

        
 
        
        /*
        //create excel xls sheet
        Sheet sheet = workbook.createSheet("User Detail");
        sheet.setDefaultColumnWidth(30);

        // create style for header cells
        CellStyle style = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setFontName("Arial");
        style.setFillForegroundColor(HSSFColor.BLUE.index);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        font.setBold(true);
        font.setColor(HSSFColor.WHITE.index);
        style.setFont(font);
        
     
   

        
        // create header row
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Firstname");
        header.getCell(0).setCellStyle(style);
        header.createCell(1).setCellValue("LastName");
        header.getCell(1).setCellStyle(style);
        header.createCell(2).setCellValue("Age");
        header.getCell(2).setCellStyle(style);
        header.createCell(3).setCellValue("Job Title");
        header.getCell(3).setCellStyle(style);
        header.createCell(4).setCellValue("Company");
        header.getCell(4).setCellStyle(style);
        header.createCell(5).setCellValue("Address");
        header.getCell(5).setCellStyle(style);
        header.createCell(6).setCellValue("City");
        header.getCell(6).setCellStyle(style);
        header.createCell(7).setCellValue("Country");
        header.getCell(7).setCellStyle(style);
        header.createCell(8).setCellValue("Phone Number");
        header.getCell(8).setCellStyle(style);

     
     @SuppressWarnings("unchecked")
        List<User> users = (List<User>) model.get("users");

        int rowCount = 1;

        for (User user : users) {
            Row userRow = sheet.createRow(rowCount++);
            userRow.createCell(0).setCellValue(user.getFirstName());
            userRow.createCell(1).setCellValue(user.getLastName());
            userRow.createCell(2).setCellValue(user.getAge());
            userRow.createCell(3).setCellValue(user.getJobTitle());
            userRow.createCell(4).setCellValue(user.getCompany());
            userRow.createCell(5).setCellValue(user.getAddress());
            userRow.createCell(6).setCellValue(user.getCity());
            userRow.createCell(7).setCellValue(user.getCountry());
            userRow.createCell(8).setCellValue(user.getPhoneNumber());

        }
        */

    }

}