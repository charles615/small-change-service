package com.smallchange.mapper;

import com.smallchange.entity.HistoryList;
import com.smallchange.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    int insert(User user);
    User findByUsername(String username);



}
