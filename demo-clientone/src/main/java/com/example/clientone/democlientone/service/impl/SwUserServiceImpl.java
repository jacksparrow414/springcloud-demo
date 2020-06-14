package com.example.clientone.democlientone.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.clientone.democlientone.dao.SwUserMapper;
import com.example.clientone.democlientone.entity.SwUser;
import com.example.clientone.democlientone.service.SwUserService;
import org.springframework.stereotype.Service;

/**
 * @author jacksparrow414
 * @date 2020-06-14
 * @description: TODO
 */
@Service
public class SwUserServiceImpl extends ServiceImpl<SwUserMapper, SwUser> implements SwUserService {
}
