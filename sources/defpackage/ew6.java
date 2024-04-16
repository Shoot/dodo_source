package defpackage;

import android.net.NetworkInfo;
import defpackage.hi9;
import defpackage.ll0;
import defpackage.s58;
import defpackage.si9;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NetworkRequestHandler.java */
/* renamed from: ew6  reason: default package */
/* loaded from: classes3.dex */
public class ew6 extends si9 {
    private final z63 a;
    private final pwa b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NetworkRequestHandler.java */
    /* renamed from: ew6$a */
    /* loaded from: classes3.dex */
    public static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    /* compiled from: NetworkRequestHandler.java */
    /* renamed from: ew6$b */
    /* loaded from: classes3.dex */
    static final class b extends IOException {
        final int a;
        final int b;

        b(int i, int i2) {
            super("HTTP " + i);
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ew6(z63 z63Var, pwa pwaVar) {
        this.a = z63Var;
        this.b = pwaVar;
    }

    private static hi9 j(gi9 gi9Var, int i) {
        ll0 ll0Var;
        if (i != 0) {
            if (dw6.a(i)) {
                ll0Var = ll0.p;
            } else {
                ll0.a aVar = new ll0.a();
                if (!dw6.i(i)) {
                    aVar.k();
                }
                if (!dw6.k(i)) {
                    aVar.l();
                }
                ll0Var = aVar.a();
            }
        } else {
            ll0Var = null;
        }
        hi9.a u = new hi9.a().u(gi9Var.d.toString());
        if (ll0Var != null) {
            u.c(ll0Var);
        }
        return u.b();
    }

    @Override // defpackage.si9
    public boolean c(gi9 gi9Var) {
        String scheme = gi9Var.d.getScheme();
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.si9
    int e() {
        return 2;
    }

    @Override // defpackage.si9
    public si9.a f(gi9 gi9Var, int i) throws IOException {
        s58.e eVar;
        ik9 a2 = this.a.a(j(gi9Var, i));
        kk9 b2 = a2.b();
        if (a2.isSuccessful()) {
            if (a2.e() == null) {
                eVar = s58.e.NETWORK;
            } else {
                eVar = s58.e.DISK;
            }
            if (eVar == s58.e.DISK && b2.contentLength() == 0) {
                b2.close();
                throw new a("Received response with 0 content-length header.");
            }
            if (eVar == s58.e.NETWORK && b2.contentLength() > 0) {
                this.b.f(b2.contentLength());
            }
            return new si9.a(b2.source(), eVar);
        }
        b2.close();
        throw new b(a2.j(), gi9Var.c);
    }

    @Override // defpackage.si9
    boolean h(boolean z, NetworkInfo networkInfo) {
        if (networkInfo != null && !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.si9
    boolean i() {
        return true;
    }
}
