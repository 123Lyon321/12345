package com.hj.controller;

<<<<<<< HEAD
=======
import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
>>>>>>> 5b27481 (init)
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hj.entity.Dept;
import com.hj.entity.User;
import com.hj.service.IUserService;
<<<<<<< HEAD
import com.hj.service.IDeptFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
=======
import com.hj.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> 5b27481 (init)
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

<<<<<<< HEAD
import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @Autowired
    IDeptFeignService deptService;
    @Value("${server.port}")
    String port;
    @Value("${my.key}")
    String myKey;
=======
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;
    @Value("${server.port}")
    String port;
>>>>>>> 5b27481 (init)
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/list")
    public Object list(String name) {
<<<<<<< HEAD
        System.out.println("端口号" + port);
=======

        System.out.println(port);

>>>>>>> 5b27481 (init)
        QueryWrapper<User> query = new QueryWrapper<>();
        query.like("username", name);
        return userService.list(query);
    }

    public static void main(String[] args) throws InterruptedException {
<<<<<<< HEAD
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println(i + "：" + (i % 2));
            TimeUnit.SECONDS.sleep(1);
        }
    }

    @GetMapping("/add")
    public Object add(User user) {
        //String deptListStr = restTemplate.getForObject("http://DEPT-SERVICE/dept/list", String.class);
        //System.out.println(deptListStr);
        List<Dept> deptList =deptService.findAll();
        System.out.println(deptList);


        //userService.save(user);

        return "ok";
    }

//    int index = 0;
//    @GetMapping("/add")
//    public Object add(User user) {
//        user.setPassword(MD5Util.getMd5(user.getPassword()));
//
//        //打印部门列表
//        String url = "http://localhost:8081/dept/list";
//        String url1 = "http://localhost:8082/dept/list";
//        String[] urls = {url, url1};
//        String url2 = urls[index % 2];
//        index++;
//        String deptListStr = restTemplate.getForObject(url2, String.class);
//        System.out.println(deptListStr);
//        System.out.println(JSON.parseArray(deptListStr, Dept.class));
//
//
//        userService.save(user);
//        return "ok";
//    }

=======
    	for (int i = 0; i < Integer.MAX_VALUE; i++) {
        	System.out.println(i + " : " + (i % 2));
        	TimeUnit.SECONDS.sleep(1);
		}
	}
    
    int index = 0;
    String[] urls = {"http://localhost:8081/dept/list", "http://localhost:8082/dept/list"};
    @GetMapping("/add")
    public Object add(User user) {
        user.setPassword(MD5Util.getMd5(user.getPassword()));
        
        String url = urls[index % urls.length];
        index++;
        String deptListStr;
        try {
        	deptListStr = restTemplate.getForObject(url, String.class);
		} catch (Exception e) {
			e.printStackTrace();
			for (String u : urls) {
				if (!url.equals(u)) {
					urls = new String[1];
					urls[0] = u;
				}
			}
			url = urls[index % urls.length];
			deptListStr = restTemplate.getForObject(url, String.class);
		}
        // 打印部门列表
        System.out.println(deptListStr);
        System.out.println(JSON.parseArray(deptListStr, Dept.class));
        
        userService.save(user);
        return "ok";
    }

>>>>>>> 5b27481 (init)
}
