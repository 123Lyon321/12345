package com.hj.service.impl;

import com.hj.entity.User;
import com.hj.mapper.UserMapper;
import com.hj.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import java.util.List;

=======

import java.util.List;

import org.springframework.stereotype.Service;

>>>>>>> 5b27481 (init)
/**
 * <p>
 *  服务实现类
 * </p>
 *
<<<<<<< HEAD
 * @author Lyon
 * @since 2024-05-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public void add() {

    }

=======
 * @author cw
 * @since 2024-05-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
>>>>>>> 5b27481 (init)
}
