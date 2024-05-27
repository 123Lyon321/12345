package com.hj.controller;

<<<<<<< HEAD
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hj.entity.User;
import com.hj.service.IDeptService;
import com.hj.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.stream.Collectors;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hj.entity.User;
import com.hj.service.IDeptService;

import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
>>>>>>> 5b27481 (init)

/**
 * <p>
 *  前端控制器
 * </p>
 *
<<<<<<< HEAD
 * @author Lyon
 * @since 2024-05-23
=======
 * @author cw
 * @since 2024-05-21
>>>>>>> 5b27481 (init)
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
<<<<<<< HEAD

    @Resource
    IDeptService deptService;
    @Value("${server.port:8888}")
    String port;

    @GetMapping("/list")
    public Object list(String name) {
        return deptService.list().stream().map((d) -> {
            d.setName(d.getName() +"："+ port);
            return d;
        }).collect(Collectors.toList());
    }



=======
	
	@Resource
	IDeptService deptService;
	
	
	@GetMapping("/list")
    public Object list(String name) {
		return deptService.list().stream().map((d) -> {
			d.setName(d.getName() + " : "+ d.getPid());
			return d;
		}).collect(Collectors.toList());
    }

>>>>>>> 5b27481 (init)
}
