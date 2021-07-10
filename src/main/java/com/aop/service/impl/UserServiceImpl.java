package com.aop.service.impl;

import com.aop.entity.User;
import com.aop.mapper.UserMapper;
import com.aop.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/8 12:57
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    @Transactional(rollbackFor =Exception.class )
    public Integer save(User user) {
        userMapper.insert(user);
        System.out.println("Service插入用户信息");
        return 1;
    }

    @Override
    @Transactional(rollbackFor =Exception.class )
    public Integer delete(Integer id) {
        userMapper.deleteByCardId(id);
        System.out.println("Service删除用户信息");
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer update(Integer fromCardId,Integer toCardId,double money) {
        User fromCardUser = userMapper.findByCardId(fromCardId);
        User toCardIdUser = userMapper.findByCardId(toCardId);
            if (fromCardUser!=null&&toCardIdUser!=null){
                if (fromCardUser.getAccountBalance()>=money){
                    double fromCardUserBalance=fromCardUser.getAccountBalance()-money;
                    double toCardUserBalance=toCardIdUser.getAccountBalance()+money;
                    userMapper.update(fromCardId,fromCardUserBalance);
                    userMapper.update(toCardId,toCardUserBalance);
//                    System.out.println(10/0);
                    System.out.println("Service更新用户信息");
                    return 1;
                }else{
                    throw new RuntimeException("余额不足");
                }
            }else{
                throw new RuntimeException("账号不存在");
            }


    }

    @Override
    public User select(Integer id) {
        User user = userMapper.findByCardId(id);
        System.out.println("Service查询用户信息");
        return user;
    }

    @Override
    public List<User> selectAll() {
        List<User> all = userMapper.findAll();
        System.out.println("Service查询所有用户信息");
        return all;
    }
}
