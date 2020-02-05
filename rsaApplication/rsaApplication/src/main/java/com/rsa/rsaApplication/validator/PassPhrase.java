package com.rsa.rsaApplication.validator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PassPhrase {

    @NotBlank
    @Size(min = 2,max = 5)
    private String message;
}
