package com.example.dividend.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Company {

    private String ticker;
    private String name;
}


