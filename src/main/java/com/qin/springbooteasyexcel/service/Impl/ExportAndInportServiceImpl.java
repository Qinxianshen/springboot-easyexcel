package com.qin.springbooteasyexcel.service.Impl;


import com.qin.springbooteasyexcel.dao.BookMapper;
import com.qin.springbooteasyexcel.domain.Book;
import com.qin.springbooteasyexcel.domain.ComplexObject;
import com.qin.springbooteasyexcel.service.ExportAndInportService;
import com.qin.springbooteasyexcel.util.excel.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

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
}
