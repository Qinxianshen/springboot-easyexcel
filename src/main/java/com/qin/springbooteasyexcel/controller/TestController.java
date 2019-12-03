package com.qin.springbooteasyexcel.controller;


import com.qin.springbooteasyexcel.service.FillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    public FillService fillService;

    @GetMapping("/fill")
    public void fill(){
        fillService.horizontalFill();
    }

}
