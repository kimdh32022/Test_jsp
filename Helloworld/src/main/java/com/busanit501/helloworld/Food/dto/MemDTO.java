package com.busanit501.helloworld.Food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class MemDTO {
    private String mid;
    private String mpw;
    private String mname;
    private String uuid;
}