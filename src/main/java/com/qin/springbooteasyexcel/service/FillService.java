package com.qin.springbooteasyexcel.service;


import com.qin.springbooteasyexcel.domain.FillData;
import org.springframework.stereotype.Service;

import java.util.List;

/* author:Qinzijing
*  date: 2019/12/3
*  description:填充服务
*/
@Service
public interface FillService {
    List<FillData> data();
    void horizontalFill();
}
