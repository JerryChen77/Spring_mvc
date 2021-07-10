package com.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Cjl
 * @date 2021/7/8 12:41
 */
@Component("user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer cardId;
    private String username;
    private String accountPassword;
    private double accountBalance;
    private Integer UserId;
}
