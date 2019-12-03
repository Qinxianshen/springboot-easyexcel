package com.qin.springbooteasyexcel.service;

import com.qin.springbooteasyexcel.domain.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/* author:Qinzijing
*  date: 2019/12/2
*  description:数据导入导出业务层
*/
@Service
public interface ExportAndInportService {
    /*
    * 导出所有书籍
    * */
    void exportAllBook(HttpServletResponse response, String fileName, String sheetName);
    /*
    * 导入所有书籍
    * */
    List<Object> inportAllBook(MultipartFile excel,int sheetNo, int headLineNum);

    /*
    * 导出所有复杂对象
    * */
    void exportAllComplex(HttpServletResponse response, String fileName, String sheetName);

    /*
    * 横向导出对象
    * */
    void exportHorizonComplex(String fileName, String sheetName);
}
