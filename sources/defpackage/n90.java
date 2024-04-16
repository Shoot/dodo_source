package defpackage;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
/* compiled from: BasicNetwork.java */
/* renamed from: n90  reason: default package */
/* loaded from: classes.dex */
public class n90 implements sv6 {
    @Deprecated
    protected final rq4 a;
    private final n70 b;
    protected final oj0 c;

    public n90(n70 n70Var) {
        this(n70Var, new oj0(4096));
    }

    @Override // defpackage.sv6
    public iw6 a(Request<?> request) throws VolleyError {
        IOException iOException;
        qq4 qq4Var;
        byte[] bArr;
        qq4 a;
        int d;
        List<en4> c;
        byte[] bArr2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                a = this.b.a(request, kq4.c(request.getCacheEntry()));
                try {
                    d = a.d();
                    c = a.c();
                    break;
                } catch (IOException e) {
                    bArr = null;
                    qq4Var = a;
                    iOException = e;
                }
            } catch (IOException e2) {
                iOException = e2;
                qq4Var = null;
                bArr = null;
            }
            ox6.a(request, ox6.e(request, iOException, elapsedRealtime, qq4Var, bArr));
        }
        if (d == 304) {
            return ox6.b(request, SystemClock.elapsedRealtime() - elapsedRealtime, c);
        }
        InputStream a2 = a.a();
        if (a2 != null) {
            bArr2 = ox6.c(a2, a.b(), this.c);
        } else {
            bArr2 = new byte[0];
        }
        ox6.d(SystemClock.elapsedRealtime() - elapsedRealtime, request, bArr2, d);
        if (d >= 200 && d <= 299) {
            return new iw6(d, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, c);
        }
        throw new IOException();
    }

    public n90(n70 n70Var, oj0 oj0Var) {
        this.b = n70Var;
        this.a = n70Var;
        this.c = oj0Var;
    }
}
