package com.testapp.testoppli.service;

import com.testapp.testoppli.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IUserService {

PageInfo<User> query(String username, int pageNum, int pageSize);

    User selectById(Integer id);

    int save(User user);

    int update(User user);

    int deleteById(Integer id);

    int saveSafely(List<User> list);
}
