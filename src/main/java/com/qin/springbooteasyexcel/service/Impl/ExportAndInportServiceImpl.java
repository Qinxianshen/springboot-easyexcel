package com.qin.springbooteasyexcel.service.Impl;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.enums.WriteDirectionEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.qin.springbooteasyexcel.dao.BookMapper;
import com.qin.springbooteasyexcel.domain.*;
import com.qin.springbooteasyexcel.service.ExportAndInportService;
import com.qin.springbooteasyexcel.util.excel.ExcelUtil;
import com.qin.springbooteasyexcel.util.excel.QinExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* author:Qinzijing
*  date: 2019/12/2
*  description:导入导出实体类
*/
@Service
public class ExportAndInportServiceImpl implements ExportAndInportService {

    @Autowired
    private BookMapper bookMapper;


    @Override
    public void exportAllBook(HttpServletResponse response,String fileName,String sheetName) {
        List<Book> bookList = bookMapper.findAllBook();
        ExcelUtil.writeExcel(response, bookList, fileName, sheetName, new Book());
    }

    @Override
    public List<Object> inportAllBook(MultipartFile excel,int sheetNo, int headLineNum) {
        return ExcelUtil.readExcel(excel, new Book(), sheetNo, headLineNum);
    }

    @Override
    public void exportAllComplex(HttpServletResponse response, String fileName, String sheetName) {
        List<ComplexObject> complexList = new ArrayList<>();
        ComplexObject complexObject = new ComplexObject();
        complexObject.setModelCnName("模型一");
        complexObject.setModelEnName("model No.1");
        complexObject.setModelNumber("HB1235879530");
        complexObject.setModelStuff("小明");
        complexObject.setDevStuff("小芳");
        complexObject.setModelState("开发中");
        complexObject.setMinspace("100MB");
        complexObject.setMintime("2 days");
        complexObject.setRequiretime("4 days");
        complexObject.setOnlyexpression("说明一：这是一个说明");
        complexObject.setMainIndex("A分区 索引一");
        complexObject.setModelState("A");
        complexObject.setModelLevel("A");
        complexObject.setModeldependance("nokia Type one");
        complexObject.setId(1);
        complexObject.setKeys(1003);
        complexObject.setCnMark("标识一");
        complexObject.setEnMark("mark one");
        complexObject.setType("NUMBER");
        complexObject.setLenght("1024");
        complexObject.setUnit("cm");
        complexObject.setDefaut("1024");
        complexObject.setAttributesExpression("属性一");
        complexObject.setDatasource("数据源表一");
        complexObject.setDatasourceText("数据源表字段一");
        complexObject.setAlgorithmExpression("算法描述一");
        complexObject.setFunction("函数一");
        complexObject.setDatabase("Oracle");
        complexObject.setDatabaseName("库名一");
        complexObject.setStorageCycle("两天");
        complexList.add(complexObject);
        ExcelUtil.writeExcel(response, complexList, fileName, sheetName, new ComplexObject());
    }

    @Override
    public ResponseEntity<Resource> exportHorizonComplex(String fileName, String sheetName) throws IOException {
        //填充文件
        // 模板注意 用{} 来表示你要用的变量 如果本来就有"{","}" 特殊字符 用"\{","\}"代替
        // {} 代表普通变量 {.} 代表是list的变量
        String templateFileName = "complexTemplate.xlsx";
        fileName = fileName+".xlsx";
        ExcelWriter excelWriter = EasyExcel.write(fileName).withTemplate(templateFileName).build();
        WriteSheet writeSheet = EasyExcel.writerSheet().build();
        writeSheet.setSheetName(sheetName);

        //横向写
        FillConfig fillConfig = FillConfig.builder().direction(WriteDirectionEnum.HORIZONTAL).build();
        excelWriter.fill(data1(), fillConfig, writeSheet);
        excelWriter.fill(data2(),writeSheet);
        excelWriter.fill(data3(),writeSheet);
        excelWriter.fill(data4(),writeSheet);

        // 别忘记关闭流
        excelWriter.finish();

        //下载文件
        File dbfFile = new File(fileName);
        if (!dbfFile.exists() || dbfFile.isDirectory()) {
            dbfFile.createNewFile();
        }
        InputStreamResource resource = new InputStreamResource(new FileInputStream(dbfFile));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-disposition", "attachment;filename="+ fileName);

        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(dbfFile.length())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(resource);
    }

    private QinComplexObject data1(){
        QinComplexObject complexObject = new QinComplexObject();
        complexObject.setModelCnName("模型一");
        complexObject.setModelEnName("model No.1");
        complexObject.setModelNumber("HB1235879530");
        complexObject.setModelStuff("小明");
        complexObject.setDevStuff("小芳");
        complexObject.setModelState("开发中");
        complexObject.setMinspace("100MB");
        complexObject.setMintime("2 days");
        complexObject.setRequiretime("4 days");
        complexObject.setOnlyexpression("说明一：这是一个说明");
        complexObject.setMainIndex("A分区 索引一");
        complexObject.setModelState("A");
        complexObject.setModelLevel("A");
        return complexObject;
    }
    private List<DepenceModel> data2(){
        List<DepenceModel> depenceModels = new ArrayList<>();
        DepenceModel depenceModel1 = new DepenceModel();
        DepenceModel depenceModel2 = new DepenceModel();
        depenceModel1.setModelEnName("Model 1");
        depenceModel1.setRelateDescription("这是一个相关描述一");
        depenceModel2.setModelEnName("Model 2");
        depenceModel2.setRelateDescription("这是一个相关描述二");
        depenceModels.add(depenceModel1);
        depenceModels.add(depenceModel2);
        return depenceModels;
    }
    private List<Detail> data3(){
        List<Detail> details = new ArrayList<>();
        Detail detail1 = new Detail();
        detail1.setId(1);
        detail1.setKeys(1003);
        detail1.setCnMark("标识一");
        detail1.setEnMark("mark one");
        detail1.setType("NUMBER");
        detail1.setLenght("1024");
        detail1.setUnit("cm");
        detail1.setDefaut("1024");
        detail1.setAttributesExpression("属性一");
        detail1.setDatasource("数据源表一");
        detail1.setDatasourceText("数据源表字段一");
        detail1.setAlgorithmExpression("算法描述一");
        detail1.setFunction("函数一");
        Detail detail2 = new Detail();
        detail2.setId(2);
        detail2.setKeys(1004);
        detail2.setCnMark("标识二");
        detail2.setEnMark("mark two");
        detail2.setType("NUMBER");
        detail2.setLenght("1024");
        detail2.setUnit("cm");
        detail2.setDefaut("1024");
        detail2.setAttributesExpression("属性二");
        detail2.setDatasource("数据源表二");
        detail2.setDatasourceText("数据源表字段二");
        detail2.setAlgorithmExpression("算法描述二");
        detail2.setFunction("函数二");
        details.add(detail1);
        details.add(detail2);
        return details;
    }
    private StoageDatabase data4(){
        StoageDatabase stoageDatabase = new StoageDatabase();
        stoageDatabase.setDatabase("MySql");
        stoageDatabase.setDatabaseName("名字一");
        stoageDatabase.setStorageCycle("两天");
        return stoageDatabase;
    }

}
