package com.zlincan.ruizi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlincan.ruizi.entity.AddressBook;
import com.zlincan.ruizi.mapper.AddressBookMapper;
import com.zlincan.ruizi.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
