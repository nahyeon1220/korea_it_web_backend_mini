package com.korit.BoardStudy.controller;

import com.korit.BoardStudy.dto.account.ChangePasswordReqDto;
import com.korit.BoardStudy.security.model.PrincipalUser;
import com.korit.BoardStudy.service.AccountServide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServide accountServide;

    @PostMapping("/change/password")
    public ResponseEntity<?> changePAssworkd(@RequestBody ChangePasswordReqDto changePasswordReqDto, PrincipalUser principalUser){
        return ResponseEntity.ok(accountServide.changePassword(changePasswordReqDto, principalUser));
    }
}
