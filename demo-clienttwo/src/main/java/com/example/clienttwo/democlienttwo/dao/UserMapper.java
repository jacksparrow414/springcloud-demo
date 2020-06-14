package com.example.clienttwo.democlienttwo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.clienttwo.democlienttwo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jacksparrow414
 * @date 2020-03-07
 * @description: TODO
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
