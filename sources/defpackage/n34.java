package defpackage;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.util.List;
/* compiled from: FontRequest.java */
/* renamed from: n34  reason: default package */
/* loaded from: classes.dex */
public final class n34 {
    private final String a;
    private final String b;
    private final String c;
    private final List<List<byte[]>> d;
    private final int e = 0;
    private final String f;

    public n34(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.a = (String) kh8.f(str);
        this.b = (String) kh8.f(str2);
        this.c = (String) kh8.f(str3);
        this.d = (List) kh8.f(list);
        this.f = a(str, str2, str3);
    }

    private String a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public String d() {
        return this.f;
    }

    @NonNull
    public String e() {
        return this.a;
    }

    @NonNull
    public String f() {
        return this.b;
    }

    @NonNull
    public String g() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
