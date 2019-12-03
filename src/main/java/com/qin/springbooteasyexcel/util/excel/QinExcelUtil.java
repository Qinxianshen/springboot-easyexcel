package com.qin.springbooteasyexcel.util.excel;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.enums.WriteDirectionEnum;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.qin.springbooteasyexcel.util.TestFileUtil;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* author:Qinzijing
*  date: 2019/12/2
*  description:新版本下的Excel工具类
*/
public class QinExcelUtil {

    /*
    * 横向填充导出
    * */
    public static void writeHorizonExcel(List<?> list,String fileName, String sheetName) {

        // 模板注意 用{} 来表示你要用的变量 如果本来就有"{","}" 特殊字符 用"\{","\}"代替
        // {} 代表普通变量 {.} 代表是list的变量
        //模板名
        String templateFileName = "horizontalTemplate.xlsx";

        String filePath = fileName + ".xlsx";
        ExcelWriter excelWriter = EasyExcel.write(filePath).withTemplate(templateFileName).build();
        WriteSheet writeSheet = EasyExcel.writerSheet().build();
        writeSheet.setSheetName(sheetName);
        FillConfig fillConfig = FillConfig.builder().direction(WriteDirectionEnum.HORIZONTAL).build();
        excelWriter.fill(list,fillConfig, writeSheet);
        excelWriter.finish();
    }

    /*
    * 简单填充
    * */
    /*
     * 横向填充导出
     * */
    public static void simpleHorizonExcel(String fileName, String sheetName) {

        // 模板注意 用{} 来表示你要用的变量 如果本来就有"{","}" 特殊字符 用"\{","\}"代替
        // {} 代表普通变量 {.} 代表是list的变量
        //模板名
        String templateFileName = "horizontalTemplate.xlsx";

        String filePath = fileName + ".xlsx";
        ExcelWriter excelWriter = EasyExcel.write(filePath).withTemplate(templateFileName).build();
        WriteSheet writeSheet = EasyExcel.writerSheet().build();
        writeSheet.setSheetName(sheetName);
        FillConfig fillConfig = FillConfig.builder().direction(WriteDirectionEnum.HORIZONTAL).build();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("modelStuff", "张三");
        EasyExcel.write(fileName).withTemplate(templateFileName).sheet().doFill(map);
        //excelWriter.fill(map,fillConfig, writeSheet);
        excelWriter.finish();
    }

    /* author:Qinzijing
     *  date: 2019/12/2
     *  description:此处修改了返回头 导出的bug
     */
    private static OutputStream getOutputStream(String fileName, HttpServletResponse response) {
        //创建本地文件
        String filePath = fileName + ".xlsx";
        File dbfFile = new File(filePath);
        try {
            if (!dbfFile.exists() || dbfFile.isDirectory()) {
                dbfFile.createNewFile();
            }
            /*
             * 设置返回头
             * */
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            String fileNameEncode = URLEncoder.encode(fileName, "UTF-8");
            response.setHeader("Content-disposition", "attachment;filename=" + fileNameEncode + ".xlsx");
            return response.getOutputStream();
        } catch (IOException e) {
            throw new ExcelException("创建文件失败！");
        }
    }

}
