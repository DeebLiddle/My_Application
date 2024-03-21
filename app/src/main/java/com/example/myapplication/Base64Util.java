package com.example.myapplication;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Base64Util {
    public static String getFileContentAsBase64(String path,boolean urlEncode) throws IOException {
        String base64 = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            byte[] b = Files.readAllBytes(Paths.get(path));
            base64 = Base64.getEncoder().encodeToString(b);
            if (urlEncode) {
                base64 = URLEncoder.encode(base64, "utf-8");
            }
        }
        return base64;
    }
}


