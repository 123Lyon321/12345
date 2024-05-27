package com.hj.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

    public static String getMd5(String pw) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(pw.getBytes());
            StringBuilder msg = new StringBuilder();
            for (byte b : digest) {
                msg.append(String.format("%02X", b));
            }
            return msg.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }


}
