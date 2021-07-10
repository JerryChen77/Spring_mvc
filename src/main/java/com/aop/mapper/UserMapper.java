package com.aop.mapper;

import com.aop.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/8 12:52
 */
@Repository
public interface UserMapper {
    Integer insert(User user);

    Integer deleteByCardId(Integer cardId);

    Integer update(@Param("cardId") Integer cardId,@Param("balance") double balance);

    User findByCardId(Integer cardId);

    List<User> findAll();
}
