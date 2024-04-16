package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
/* compiled from: TransportRuntime.java */
/* renamed from: lmb  reason: default package */
/* loaded from: classes2.dex */
public class lmb implements cmb {
    private static volatile mmb e;
    private final x91 a;
    private final x91 b;
    private final wv9 c;
    private final isb d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lmb(x91 x91Var, x91 x91Var2, wv9 wv9Var, isb isbVar, e7c e7cVar) {
        this.a = x91Var;
        this.b = x91Var2;
        this.c = wv9Var;
        this.d = isbVar;
        e7cVar.c();
    }

    private wk3 b(qba qbaVar) {
        return wk3.a().i(this.a.a()).k(this.b.a()).j(qbaVar.g()).h(new zg3(qbaVar.b(), qbaVar.d())).g(qbaVar.c().a()).d();
    }

    public static lmb c() {
        mmb mmbVar = e;
        if (mmbVar != null) {
            return mmbVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<eh3> d(k13 k13Var) {
        if (k13Var instanceof yg3) {
            return Collections.unmodifiableSet(((yg3) k13Var).a());
        }
        return Collections.singleton(eh3.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (lmb.class) {
                try {
                    if (e == null) {
                        e = wj2.c().b(context).a();
                    }
                } finally {
                }
            }
        }
    }

    @Override // defpackage.cmb
    public void a(qba qbaVar, omb ombVar) {
        this.c.a(qbaVar.f().f(qbaVar.c().c()), b(qbaVar), ombVar);
    }

    public isb e() {
        return this.d;
    }

    public xlb g(k13 k13Var) {
        return new ylb(d(k13Var), wlb.a().b(k13Var.getName()).c(k13Var.getExtras()).a(), this);
    }
}
