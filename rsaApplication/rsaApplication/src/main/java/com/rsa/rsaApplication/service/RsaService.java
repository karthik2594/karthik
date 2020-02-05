package com.rsa.rsaApplication.service;
import org.springframework.stereotype.Service;
import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;


@Service
public class RsaService {

    public Model model(String message) throws NoSuchAlgorithmException {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(512);
        KeyPair rsaKeyPair = kpg.genKeyPair();
        byte[] txt = message.getBytes();

        String originalMessage = new String(txt);

        Cipher cipher;
        try {
            cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, rsaKeyPair.getPublic());
            txt = cipher.doFinal(txt);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        String publicKey = String.valueOf(rsaKeyPair.getPublic());
        String encryptedMessage = new String(txt);
        System.out.println("Encrypted message: " +encryptedMessage);

        try {
            cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.DECRYPT_MODE, rsaKeyPair.getPrivate());
            txt = cipher.doFinal(txt);
        }  catch (Throwable e) {
            e.printStackTrace();
        }

        System.out.println("Decrypted message: " + new String(txt));
        String privateKey = String.valueOf(rsaKeyPair.getPrivate());
        String decryptedMessage = new String(txt);

        return new Model(publicKey, privateKey, encryptedMessage,decryptedMessage);
    }
}
