package com.qin.springbooteasyexcel.controller;

/* author:Qinzijing
*  date: 2019/12/2
*  description:导入导出控制层
*/

import com.qin.springbooteasyexcel.domain.Book;
import com.qin.springbooteasyexcel.service.ExportAndInportService;
import com.qin.springbooteasyexcel.util.excel.ExcelUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

@RestController
@RequestMapping("/api/book/v1.0/exportandinport")
public class ExportAndInportController {
    @Resource
    public ExportAndInportService exportAndInportService;

    @GetMapping("/exportAllBook")
    public void exportAllBook(HttpServletResponse response, String fileName, String sheetName) throws IOException {
        exportAndInportService.exportAllBook(response,fileName,sheetName);
    }

}
