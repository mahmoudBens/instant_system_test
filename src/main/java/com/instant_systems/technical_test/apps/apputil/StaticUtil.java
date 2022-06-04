/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.instant_systems.technical_test.apps.apputil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author MEZIANE Tarek
 */
public abstract class StaticUtil {

    public static final String ADMINISTRATION_ADM_SCHEMA = "APPL_ADM";
    public static final String ADMINISTRATION_ASS_SCHEMA = "APPL_ASS";
    public static final String ADMINISTRATION_ACC_SCHEMA = "APPL_ACC";
    public static final String ADMINISTRATION_PERSIST_NAME = "ERP-ejbPU";
    public static final String PARKING = "";



    public static String getEncryptPassword(String password) {

        byte[] uniqueKey = password.getBytes();
        byte[] hash = null;

        try {
            hash = MessageDigest.getInstance("SHA-256").digest(uniqueKey);
        } catch (NoSuchAlgorithmException e) {
            throw new Error("No SHA-256 support in this VM.");
        }

        StringBuilder hashString = new StringBuilder();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(hash[i]);
            if (hex.length() == 1) {
                hashString.append('0');
                hashString.append(hex.charAt(hex.length() - 1));
            } else {
                hashString.append(hex.substring(hex.length() - 2));
            }
        }
        return hashString.toString();
    }
}
