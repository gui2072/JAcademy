package br.unipe.cc.mpl3.jacademy.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author bruno
 */
public class Criptografia {

    public String criptografar(String senha) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        MessageDigest md = null;
        md = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = null;
        messageDigest = md.digest(senha.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();

        for (byte b : messageDigest) {
            sb.append(String.format("%02x", 0xFF & b));
        }

        String senhaHex = sb.toString();
        
        return senhaHex;
    }
}