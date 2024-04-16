package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: Connection.java */
/* renamed from: nq1  reason: default package */
/* loaded from: classes3.dex */
public interface nq1 {

    /* compiled from: Connection.java */
    /* renamed from: nq1$a */
    /* loaded from: classes3.dex */
    public interface a<T extends a<T>> {
        URL b();

        Map<String, String> d();

        String f(String str);

        T g(URL url);

        T h(String str, String str2);
    }

    /* compiled from: Connection.java */
    /* renamed from: nq1$b */
    /* loaded from: classes3.dex */
    public interface b {
        String f();

        boolean g();

        String key();

        String value();

        InputStream z();
    }

    /* compiled from: Connection.java */
    /* renamed from: nq1$c */
    /* loaded from: classes3.dex */
    public enum c {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(false),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);
        
        private final boolean a;

        c(boolean z) {
            this.a = z;
        }

        public final boolean i() {
            return this.a;
        }
    }

    /* compiled from: Connection.java */
    /* renamed from: nq1$d */
    /* loaded from: classes3.dex */
    public interface d extends a<d> {
        String a();

        Collection<b> c();

        String i();
    }

    /* compiled from: Connection.java */
    /* renamed from: nq1$e */
    /* loaded from: classes3.dex */
    public interface e extends a<e> {
        h53 e() throws IOException;
    }

    nq1 a(boolean z);

    nq1 b(int i);

    nq1 c(SSLSocketFactory sSLSocketFactory);

    nq1 d(String str);

    nq1 e(String str);

    e execute() throws IOException;

    nq1 f(String str);

    nq1 g(boolean z);
}
