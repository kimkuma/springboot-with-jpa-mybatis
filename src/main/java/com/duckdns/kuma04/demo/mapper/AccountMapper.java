package com.duckdns.kuma04.demo.mapper;

import com.duckdns.kuma04.demo.accounts.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {

    Account findById(Integer id);

    List<Account> findAll();

}
