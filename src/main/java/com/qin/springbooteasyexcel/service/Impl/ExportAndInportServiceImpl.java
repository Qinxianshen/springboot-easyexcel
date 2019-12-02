package com.qin.springbooteasyexcel.service.Impl;


import com.qin.springbooteasyexcel.dao.BookMapper;
import com.qin.springbooteasyexcel.domain.Book;
import com.qin.springbooteasyexcel.service.ExportAndInportService;
import com.qin.springbooteasyexcel.util.excel.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Book> exportAllBook(HttpServletResponse response) {
        List<Book> bookList = bookMapper.findAllBook();
        String fileName = "一个 Excel 文件";
        String sheetName = "第一个 sheet";

        ExcelUtil.writeExcel(response, bookList, fileName, sheetName, new Book());
        return null;
    }

    @Override
    public List<Book> exportAllBook() {
        return null;
    }

    @Override
    public List<Book> inportAllBook() {
        return null;
    }
}
