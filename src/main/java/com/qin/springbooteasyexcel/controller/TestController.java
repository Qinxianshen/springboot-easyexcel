package com.qin.springbooteasyexcel.controller;


import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.qin.springbooteasyexcel.service.FillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    public FillService fillService;

    @GetMapping("/fill")
    public void fill(HttpServletResponse response) throws IOException {
        fillService.horizontalFill();
    }

    @GetMapping("/fillandDownload")
    public ResponseEntity<org.springframework.core.io.Resource> horizontalFillAndDownload(HttpServletResponse response) throws IOException{
        try {
            return fillService.horizontalFillAndDownload();
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
