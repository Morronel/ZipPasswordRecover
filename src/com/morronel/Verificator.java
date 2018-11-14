package com.morronel;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.exception.ZipExceptionConstants;
import net.lingala.zip4j.model.FileHeader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Verificator {
    private ZipFile zipFile;

    public Verificator(String path){
        try {
            zipFile = new ZipFile(new File(path));
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }

    public boolean verify(String password) {
        try {
            if (zipFile.isEncrypted()) {
                zipFile.setPassword(password);
            }
            List<FileHeader> fileHeaders = zipFile.getFileHeaders();

            for (FileHeader fileHeader : fileHeaders) {
                try {
                    InputStream is = zipFile.getInputStream(fileHeader);
                    byte[] b = new byte[4 * 4096];
                    while (is.read(b) != -1) {
                        //Do nothing as we just want to verify password
                    }
                    is.close();
                } catch (ZipException e) {
                    if (e.getCode() == ZipExceptionConstants.WRONG_PASSWORD) {
                        return false;
                    } else {
                        //Corrupt file
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    return false;
                }
            }

        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
