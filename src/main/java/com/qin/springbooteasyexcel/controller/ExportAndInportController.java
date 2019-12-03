package com.qin.springbooteasyexcel.controller;

/* author:Qinzijing
*  date: 2019/12/2
*  description:导入导出控制层
*/

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.qin.springbooteasyexcel.domain.Book;
import com.qin.springbooteasyexcel.service.ExportAndInportService;
import com.qin.springbooteasyexcel.util.excel.ExcelUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/book/v1.0/exportandinport")
public class ExportAndInportController {
    @Resource
    public ExportAndInportService exportAndInportService;

    @GetMapping("/exportAllBook")
    public void exportAllBook(HttpServletResponse response, String fileName, String sheetName) throws IOException {
        exportAndInportService.exportAllBook(response,fileName,sheetName);
    }

    @PostMapping("/inportBook")
    public List<Object> inportBook(MultipartFile excel, @RequestParam(defaultValue = "1")int sheetNo,
                                 @RequestParam(defaultValue = "1") int headLineNum){
        return  exportAndInportService.inportAllBook(excel,sheetNo,headLineNum);
    }

    @GetMapping("/exportComplex")
    public void exportAllComplex(HttpServletResponse response, String fileName, String sheetName){
        exportAndInportService.exportAllComplex(response,fileName,sheetName);
    }


    /*
    * 导出复杂对象
    * */
    @GetMapping("/exportComplexWithHorizen")
    public ResponseEntity<org.springframework.core.io.Resource> exportComplex(HttpServletResponse response,String fileName, String sheetName) throws IOException{

        try {
            return exportAndInportService.exportHorizonComplex(fileName,sheetName);
        } catch (IOException e) {
            // 重置response
            response.reset();
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            Map<String, String> map = new HashMap<String, String>();
            map.put("status", "failure");
            map.put("message", "下载文件失败" + e.getMessage());
            response.getWriter().println(JSON.toJSONString(map));
        }
        return null;
    }
}
