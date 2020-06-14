package com.example.clientone.democlientone.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.clientone.democlientone.dao.UserMapper;
import com.example.clientone.democlientone.entity.User;
import com.example.clientone.democlientone.service.UserService;
import io.seata.rm.tcc.api.BusinessActionContext;
import org.springframework.stereotype.Service;

/**
 * @author jacksparrow414
 * @date 2020-03-07
 * @description: TODO
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public boolean prepare(BusinessActionContext actionContext, int a) {
        String xid = "prepare";//actionContext.getXid();
        System.out.println("TccActionOne prepare, xid:" + xid +  ", a:" + a);
        return true;
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        String xid = "commit";
                //actionContext.getXid();
        System.out.println("TccActionOne commit, xid:" + xid + ", a:" + actionContext.getActionContext("a"));
       // ResultHolder.setActionOneResult(xid, "T");
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        String xid = "rollback";//actionContext.getXid();
        System.out.println("TccActionOne rollback, xid:" + xid + ", a:" + actionContext.getActionContext("a"));
       // ResultHolder.setActionOneResult(xid, "R");
        return true;
    }
}
