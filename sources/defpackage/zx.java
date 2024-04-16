package defpackage;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: AsyncDrawableLoaderBuilder.java */
/* renamed from: zx  reason: default package */
/* loaded from: classes3.dex */
class zx {
    ExecutorService a;
    final Map<String, qw9> b = new HashMap(3);
    final Map<String, kc6> c = new HashMap(3);
    kc6 d;
    boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zx() {
        b(vl2.c());
        b(jw6.d());
        if (n3b.a()) {
            a(m3b.c());
        }
        if (wf4.a()) {
            a(uf4.c());
        }
        this.d = tq2.c();
    }

    private void d() {
        if (!this.e) {
            return;
        }
        throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
    }

    void a(@NonNull kc6 kc6Var) {
        d();
        for (String str : kc6Var.b()) {
            this.c.put(str, kc6Var);
        }
    }

    void b(@NonNull qw9 qw9Var) {
        d();
        for (String str : qw9Var.b()) {
            this.b.put(str, qw9Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public yx c() {
        d();
        this.e = true;
        if (this.a == null) {
            this.a = Executors.newCachedThreadPool();
        }
        return new ay(this);
    }
}
