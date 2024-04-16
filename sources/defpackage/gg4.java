package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
/* compiled from: GlideUrl.java */
/* renamed from: gg4  reason: default package */
/* loaded from: classes.dex */
public class gg4 implements se5 {
    private final fn4 b;
    private final URL c;
    private final String d;
    private String e;
    private URL f;
    private volatile byte[] g;
    private int h;

    public gg4(URL url) {
        this(url, fn4.b);
    }

    private byte[] d() {
        if (this.g == null) {
            this.g = c().getBytes(se5.a);
        }
        return this.g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) eh8.d(this.c)).toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    private URL g() throws MalformedURLException {
        if (this.f == null) {
            this.f = new URL(f());
        }
        return this.f;
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.d;
        if (str == null) {
            return ((URL) eh8.d(this.c)).toString();
        }
        return str;
    }

    public Map<String, String> e() {
        return this.b.a();
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (!(obj instanceof gg4)) {
            return false;
        }
        gg4 gg4Var = (gg4) obj;
        if (!c().equals(gg4Var.c()) || !this.b.equals(gg4Var.b)) {
            return false;
        }
        return true;
    }

    public URL h() throws MalformedURLException {
        return g();
    }

    @Override // defpackage.se5
    public int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = (hashCode * 31) + this.b.hashCode();
        }
        return this.h;
    }

    public String toString() {
        return c();
    }

    public gg4(String str) {
        this(str, fn4.b);
    }

    public gg4(URL url, fn4 fn4Var) {
        this.c = (URL) eh8.d(url);
        this.d = null;
        this.b = (fn4) eh8.d(fn4Var);
    }

    public gg4(String str, fn4 fn4Var) {
        this.c = null;
        this.d = eh8.b(str);
        this.b = (fn4) eh8.d(fn4Var);
    }
}
