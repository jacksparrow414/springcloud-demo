package com.example.clienttwo.democlienttwo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.clienttwo.democlienttwo.dao.UserMapper;
import com.example.clienttwo.democlienttwo.entity.User;
import com.example.clienttwo.democlienttwo.service.UserService;
import io.seata.rm.tcc.api.BusinessActionContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jacksparrow414
 * @date 2020-03-07
 * @description: TODO
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public boolean prepare(BusinessActionContext actionContext, String b, List list) {
        String xid = "prepare";//actionContext.getXid();
        System.out.println("TccActionTwo prepare, xid:" + xid + ", b:" + b + ", c:" + list.get(1));
        return true;
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        String xid = "commit";//actionContext.getXid();
        System.out.println("TccActionTwo commit, xid:" + xid + ", b:" + actionContext.getActionContext("b") + ", c:" + actionContext.getActionContext("c"));
       // ResultHolder.setActionTwoResult(xid, "T");
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        String xid = "rollback";//actionContext.getXid();
        System.out.println("TccActionTwo rollback, xid:" + xid  + ", b:" + actionContext.getActionContext("b") + ", c:" + actionContext.getActionContext("c"));
       // ResultHolder.setActionTwoResult(xid, "R");
        return true;
    }

}
