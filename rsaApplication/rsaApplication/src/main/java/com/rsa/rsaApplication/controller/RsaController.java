package com.rsa.rsaApplication.controller;


import com.rsa.rsaApplication.repository.RsaRepository;
import com.rsa.rsaApplication.service.Model;
import com.rsa.rsaApplication.service.RsaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.NoSuchAlgorithmException;

@RestController
public class RsaController {

    private RsaRepository rsaRepository;
    private RsaService rsaService;

    @PostMapping("/public/{id}/{message}")
    public String model(@PathVariable Integer id, @PathVariable String message) throws NoSuchAlgorithmException {
        return rsaRepository.model(id, message);
    }

    @PostMapping("/private/{id}/{message}")
    public String modelPri(@PathVariable Integer id, @PathVariable String message) throws NoSuchAlgorithmException {
        return rsaRepository.modelPri(id,message);
    }

    @GetMapping("/api/{message}")
    public Model model(@PathVariable String message) throws NoSuchAlgorithmException {
        return rsaService.model(message);
    }
}
