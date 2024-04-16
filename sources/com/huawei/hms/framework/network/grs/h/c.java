package com.huawei.hms.framework.network.grs.h;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public class c {
    private static final String a = "c";

    public static String a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = null;
        try {
            try {
                if (!new File(str).isDirectory()) {
                    inputStream = context.getAssets().open(str);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            byteArrayOutputStream.flush();
                            String str2 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                            IoUtils.closeSecure(inputStream);
                            return str2;
                        }
                    }
                }
            } catch (IOException unused) {
                Logger.w(a, "local config file is not exist.filename is {%s}", str);
            }
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStream);
            return "";
        } catch (Throwable th) {
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStream);
            throw th;
        }
    }
}
