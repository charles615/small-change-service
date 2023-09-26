package com.smallchange.mapper;

import com.smallchange.entity.HistoryList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HistoryListMapper {

    List<HistoryList> selectList();

}
