package defpackage;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: NetworkSchemeHandler.java */
/* renamed from: jw6  reason: default package */
/* loaded from: classes3.dex */
public class jw6 extends qw9 {
    jw6() {
    }

    static String c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(59);
        if (indexOf > -1) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    @NonNull
    public static jw6 d() {
        return new jw6();
    }

    @Override // defpackage.qw9
    @NonNull
    public ru4 a(@NonNull String str, @NonNull Uri uri) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                return ru4.d(c(httpURLConnection.getHeaderField("Content-Type")), new BufferedInputStream(httpURLConnection.getInputStream()));
            }
            throw new IOException("Bad response code: " + responseCode + ", url: " + str);
        } catch (IOException e) {
            throw new IllegalStateException("Exception obtaining network resource: " + str, e);
        }
    }

    @Override // defpackage.qw9
    @NonNull
    public Collection<String> b() {
        return Arrays.asList("http", "https");
    }
}
