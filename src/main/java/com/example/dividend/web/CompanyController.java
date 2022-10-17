package com.example.dividend.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {

    /**
     * 배당금 검색
     */
    @GetMapping("/autocomplete")
    public ResponseEntity<?> autocomplete(@RequestParam String keyword) {
        return null;
    }

    /**
     * 회사 API 조회
     */
    @GetMapping
    public ResponseEntity<?> searchCompany() {
        return null;
    }

    /**
     * 회사 배당금 데이터 저장
     */
    @PostMapping
    public ResponseEntity<?> addCompany() {
        return null;
    }

    /**
     * 회사 배당금 데이터 삭제
     */
    @DeleteMapping
    public ResponseEntity<?> deleteCompany() {
        return null;
    }
}
