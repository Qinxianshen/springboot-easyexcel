package com.qin.springbooteasyexcel.dao;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.qin.springbooteasyexcel.domain.Book;
import java.util.List;

/* author:Qinzijing
*  date: 2019/12/2
*  description:书籍数据层接口
*/
@Repository
public interface BookMapper {
    List<Book> findAllBook();
}
