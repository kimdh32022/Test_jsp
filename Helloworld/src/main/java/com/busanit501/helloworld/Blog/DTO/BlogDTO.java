package com.busanit501.helloworld.Blog.DTO;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
public class BlogDTO {
    private long Bno;
    private String title;
    private String content;
    private Date Bdate;


}
