package defpackage;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Html5Entities.java */
/* renamed from: sp4  reason: default package */
/* loaded from: classes3.dex */
public class sp4 {
    private static final Map<String, String> a = b();
    private static final Pattern b = Pattern.compile("^&#[Xx]?");

    public static String a(String str) {
        int i;
        Matcher matcher = b.matcher(str);
        if (matcher.find()) {
            if (matcher.end() == 2) {
                i = 10;
            } else {
                i = 16;
            }
            try {
                int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), i);
                if (parseInt == 0) {
                    return "�";
                }
                return new String(Character.toChars(parseInt));
            } catch (IllegalArgumentException unused) {
                return "�";
            }
        }
        String str2 = a.get(str.substring(1, str.length() - 1));
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    private static Map<String, String> b() {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(sp4.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.length() != 0) {
                        int indexOf = readLine.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                        hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                    }
                } else {
                    bufferedReader.close();
                    hashMap.put("NewLine", "\n");
                    return hashMap;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }
}
