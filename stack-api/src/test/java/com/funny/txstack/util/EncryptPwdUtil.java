package com.funny.txstack.util;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class EncryptPwdUtil {

    @Autowired
    StringEncryptor stringEncryptor;

    @Test
    public void encrypt() {
        final String pwd = "q@6Rx6Z@MH#yvzWm#m1D";
        System.out.println(stringEncryptor.encrypt(pwd));
    }

}
