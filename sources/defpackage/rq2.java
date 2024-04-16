package defpackage;

import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
/* compiled from: DefaultLottieFetchResult.java */
/* renamed from: rq2  reason: default package */
/* loaded from: classes.dex */
public class rq2 implements pz5 {
    @NonNull
    private final HttpURLConnection a;

    public rq2(@NonNull HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.disconnect();
    }

    @Override // defpackage.pz5
    public String f() {
        return this.a.getContentType();
    }

    @Override // defpackage.pz5
    public String g() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.a.getURL() + ". Failed with " + this.a.getResponseCode() + "\n" + a(this.a);
        } catch (IOException e) {
            ox5.d("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // defpackage.pz5
    @NonNull
    public InputStream i0() throws IOException {
        return this.a.getInputStream();
    }

    @Override // defpackage.pz5
    public boolean isSuccessful() {
        try {
            if (this.a.getResponseCode() / 100 != 2) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
