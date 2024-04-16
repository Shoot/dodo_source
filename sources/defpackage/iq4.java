package defpackage;

import ch.qos.logback.classic.spi.CallerData;
import com.huawei.hms.framework.common.ContainerUtils;
import com.inappstory.sdk.network.NetworkHandler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
/* compiled from: HttpGetRequest.java */
/* renamed from: iq4  reason: default package */
/* loaded from: classes2.dex */
public class iq4 {
    private final String a;
    private final Map<String, String> b;
    private final Map<String, String> c = new HashMap();

    public iq4(String str, Map<String, String> map) {
        this.a = str;
        this.b = map;
    }

    private String a(Map<String, String> map) throws UnsupportedEncodingException {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        if (next.getValue() == null) {
            str = "";
        } else {
            str = URLEncoder.encode(next.getValue(), "UTF-8");
        }
        sb.append(str);
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb.append(ContainerUtils.FIELD_DELIMITER);
            sb.append(next2.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            if (next2.getValue() == null) {
                str2 = "";
            } else {
                str2 = URLEncoder.encode(next2.getValue(), "UTF-8");
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    private String b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String a = a(map);
        if (a.isEmpty()) {
            return str;
        }
        if (str.contains(CallerData.NA)) {
            if (!str.endsWith(ContainerUtils.FIELD_DELIMITER)) {
                a = ContainerUtils.FIELD_DELIMITER + a;
            }
            return str + a;
        }
        return str + CallerData.NA + a;
    }

    private String e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    public pq4 c() throws IOException {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String e = null;
        inputStream = null;
        try {
            String b = b(this.a, this.b);
            rx5.f().i("GET Request URL: " + b);
            httpsURLConnection = (HttpsURLConnection) new URL(b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(NetworkHandler.GET);
                for (Map.Entry<String, String> entry : this.c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        e = e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new pq4(responseCode, e);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public iq4 d(String str, String str2) {
        this.c.put(str, str2);
        return this;
    }
}
