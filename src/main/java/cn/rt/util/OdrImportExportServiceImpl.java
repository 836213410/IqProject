package cn.rt.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OdrImportExportServiceImpl {

	/**
	 * 批量导入
	 */
	public static List<String[]> importXlsx(File upload, String fileName) throws Exception {
		// 准备一个List,来作为返回值
		List<String[]> list = new ArrayList<>();
		// 准备一个读取的文件
		FileInputStream fis = new FileInputStream(upload);
		// 创建一个工作薄，并把读取的文件传入
		Workbook wb = null;
		boolean flag = true;
		if (fileName.endsWith("xls")) {
			wb = new HSSFWorkbook(fis);
		} else if (fileName.endsWith("xlsx")) {
			wb = new XSSFWorkbook(fis);
			flag = false;
		}

		// 获取第一个表
		Sheet sheet = wb.getSheetAt(0);
		// 获取总行数
		int lastRowNum = sheet.getLastRowNum();
		// 遍历总行数
		for (int i = 1; i <= lastRowNum; i++) {
			// 拿到每一行
			Row row = sheet.getRow(i);

			// 查询每一行有多少列
			short lastCellNum = row.getLastCellNum();
			// 准备一个数组
			String[] strings = new String[lastCellNum];
			for (int j = 0; j < lastCellNum; j++) {
				// 拿到每一个格子
				Cell cell = row.getCell(j);
				// 把格子里面的数装到数组里面去
				if (flag) {
					strings[j] = getCellString(cell);

				} else {
					strings[j] = getCellString2(cell);

				}

			}
			// 把一行的数据装入集合中去
			list.add(strings);
		}

		return list;
	}

	// 对List转数据进行判断的方法,EXCEL Cell原有数据转换成String类型
	private static String getCellString(Cell cell) {
		if (cell == null)
			return "";

		String cellSring = "";
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_STRING: // 字符串
			cellSring = cell.getStringCellValue();
			break;
		case HSSFCell.CELL_TYPE_NUMERIC: // 数字
			System.out.println("数字");
			Object inputValue = null;
			long longVal = Math.round(cell.getNumericCellValue());
		    if(Double.parseDouble(longVal + ".0") == cell.getNumericCellValue())  
		    	inputValue = longVal; 
		    else
		        inputValue = cell.getNumericCellValue();  
		    cellSring = String.valueOf(inputValue);
			break;
		case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
			cellSring = String.valueOf(cell.getBooleanCellValue());
			break;
		case HSSFCell.CELL_TYPE_FORMULA: // 公式
			cellSring = String.valueOf(cell.getCellFormula());
			break;
		case HSSFCell.CELL_TYPE_BLANK: // 空值
			cellSring = "";
			break;
		case HSSFCell.CELL_TYPE_ERROR: // 故障
			cellSring = "";
			break;
		default:
			cellSring = "ERROR";
			break;
		}
		return cellSring;
	}

	// 对List转数据进行判断的方法,EXCEL Cell原有数据转换成String类型
	private static String getCellString2(Cell cell) {
		if (cell == null)
			return "";

		String cellSring = "";
		switch (cell.getCellType()) {
		case XSSFCell.CELL_TYPE_STRING: // 字符串
			cellSring = cell.getStringCellValue();
			break;
		case XSSFCell.CELL_TYPE_NUMERIC: // 数字
			//cellSring = String.valueOf(cell.getNumericCellValue());
			System.out.println("数字");
			Object inputValue = null;
			long longVal = Math.round(cell.getNumericCellValue());
		    if(Double.parseDouble(longVal + ".0") == cell.getNumericCellValue())  
		    	inputValue = longVal; 
		    else
		        inputValue = cell.getNumericCellValue();  
		    cellSring = String.valueOf(inputValue);
			break;
		case XSSFCell.CELL_TYPE_BOOLEAN: // Boolean
			cellSring = String.valueOf(cell.getBooleanCellValue());
			break;
		case XSSFCell.CELL_TYPE_FORMULA: // 公式
			cellSring = String.valueOf(cell.getCellFormula());
			break;
		case XSSFCell.CELL_TYPE_BLANK: // 空值
			cellSring = "";
			break;
		case XSSFCell.CELL_TYPE_ERROR: // 故障
			cellSring = "";
			break;
		default:
			cellSring = "ERROR";
			break;
		}
		return cellSring;
	}

}
