package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
/* loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ik9 ik9Var, gw6 gw6Var, long j, long j2) throws IOException {
        hi9 K = ik9Var.K();
        if (K == null) {
            return;
        }
        gw6Var.t(K.l().y().toString());
        gw6Var.j(K.h());
        if (K.a() != null) {
            long contentLength = K.a().contentLength();
            if (contentLength != -1) {
                gw6Var.m(contentLength);
            }
        }
        kk9 b = ik9Var.b();
        if (b != null) {
            long contentLength2 = b.contentLength();
            if (contentLength2 != -1) {
                gw6Var.p(contentLength2);
            }
            qc6 contentType = b.contentType();
            if (contentType != null) {
                gw6Var.o(contentType.toString());
            }
        }
        gw6Var.k(ik9Var.j());
        gw6Var.n(j);
        gw6Var.r(j2);
        gw6Var.b();
    }

    @Keep
    public static void enqueue(cm0 cm0Var, fm0 fm0Var) {
        Timer timer = new Timer();
        cm0Var.I0(new d(fm0Var, jmb.k(), timer, timer.e()));
    }

    @Keep
    public static ik9 execute(cm0 cm0Var) throws IOException {
        gw6 c = gw6.c(jmb.k());
        Timer timer = new Timer();
        long e = timer.e();
        try {
            ik9 execute = cm0Var.execute();
            a(execute, c, e, timer.c());
            return execute;
        } catch (IOException e2) {
            hi9 request = cm0Var.request();
            if (request != null) {
                sq4 l = request.l();
                if (l != null) {
                    c.t(l.y().toString());
                }
                if (request.h() != null) {
                    c.j(request.h());
                }
            }
            c.n(e);
            c.r(timer.c());
            hw6.d(c);
            throw e2;
        }
    }
}
