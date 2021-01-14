package com.duckdns.kuma04.demo.controller;

import com.duckdns.kuma04.demo.accounts.Account;
import com.duckdns.kuma04.demo.accounts.AccountRepository;
import com.duckdns.kuma04.demo.mapper.AccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final AccountRepository accountRepository;

    private final AccountMapper accountMapper;

    @GetMapping(value = "/selectTest")
    public List<Account> selectTest() {
        return accountRepository.findAll();
    }

    @GetMapping(value = "/selectMybatisTest")
    public List<Account> selectTestMybatis() {
        return accountMapper.findAll();
    }

    @GetMapping(value = "/selectMybatisTest/{id}")
    public Account selectByAccountId(@PathVariable(name = "id") Integer id) {
        return accountMapper.findById(id);
    }

}
