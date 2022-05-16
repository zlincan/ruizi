package com.zlincan.ruizi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlincan.ruizi.entity.Employee;
import com.zlincan.ruizi.mapper.EmployeeMapper;
import com.zlincan.ruizi.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
