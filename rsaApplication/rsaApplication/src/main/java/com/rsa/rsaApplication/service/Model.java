package com.rsa.rsaApplication.service;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Model {

    private String pubkey;
    private String prikey;
    private String encrypt;
    private String decrypt;

}
