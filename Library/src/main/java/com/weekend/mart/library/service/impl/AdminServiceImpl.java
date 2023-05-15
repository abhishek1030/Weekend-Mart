package com.weekend.mart.library.service.impl;

import com.weekend.mart.library.dto.AdminDto;
import com.weekend.mart.library.model.Admin;
import com.weekend.mart.library.repository.AdminRepository;
import com.weekend.mart.library.repository.RoleRepository;
import com.weekend.mart.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Admin findByUserName(String userName) {
        return adminRepository.findByUserName(userName);
    }

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setUserName(adminDto.getUserName());
        admin.setPassword(adminDto.getPassword());
        admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));

        return adminRepository.save(admin);
    }
}
