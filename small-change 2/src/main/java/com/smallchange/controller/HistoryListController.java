package com.smallchange.controller;

import com.smallchange.entity.HistoryList;
import com.smallchange.mapper.HistoryListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/portfolio")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HistoryListController {
    @Autowired
    private HistoryListMapper historyListMapper;
    @GetMapping("history-list")
    public List<HistoryList> test() {
        return historyListMapper.selectList();
    }
}
