package com.weekend.mart.library.service;

import com.weekend.mart.library.dto.AdminDto;
import com.weekend.mart.library.model.Admin;

public interface AdminService {

    Admin findByUserName(String userName);

    Admin save(AdminDto adminDto);
}
