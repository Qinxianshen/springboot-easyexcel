package com.qin.springbooteasyexcel.service.Impl;


import com.qin.springbooteasyexcel.dao.BookMapper;
import com.qin.springbooteasyexcel.domain.Book;
import com.qin.springbooteasyexcel.service.ExportAndInportService;
import com.qin.springbooteasyexcel.util.excel.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
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
        System.out.println(bookList.size()+"----------------");
        ExcelUtil.writeExcel(response, bookList, fileName, sheetName, new Book());
    }

    @Override
    public List<Object> inportAllBook(MultipartFile excel,int sheetNo, int headLineNum) {
        return ExcelUtil.readExcel(excel, new Book(), sheetNo, headLineNum);
    }
}
