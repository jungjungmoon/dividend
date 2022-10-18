package com.example.dividend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ScrapedResult {

    /**
     * 스크래핑한 회사 배당금
     */

    private Company company;

    private List<Dividend> dividendEntities;

    public ScrapedResult() {
        this.dividendEntities = new ArrayList<>();
    }
}
