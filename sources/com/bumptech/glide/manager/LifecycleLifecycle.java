package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import androidx.lifecycle.j;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
final class LifecycleLifecycle implements fp5, np5 {
    @NonNull
    private final Set<mp5> a = new HashSet();
    @NonNull
    private final androidx.lifecycle.d b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleLifecycle(androidx.lifecycle.d dVar) {
        this.b = dVar;
        dVar.a(this);
    }

    @Override // defpackage.fp5
    public void a(@NonNull mp5 mp5Var) {
        this.a.add(mp5Var);
        if (this.b.b() == d.b.DESTROYED) {
            mp5Var.onDestroy();
        } else if (this.b.b().i(d.b.STARTED)) {
            mp5Var.onStart();
        } else {
            mp5Var.g();
        }
    }

    @Override // defpackage.fp5
    public void b(@NonNull mp5 mp5Var) {
        this.a.remove(mp5Var);
    }

    @j(d.a.ON_DESTROY)
    public void onDestroy(@NonNull op5 op5Var) {
        for (mp5 mp5Var : vub.k(this.a)) {
            mp5Var.onDestroy();
        }
        op5Var.getLifecycle().d(this);
    }

    @j(d.a.ON_START)
    public void onStart(@NonNull op5 op5Var) {
        for (mp5 mp5Var : vub.k(this.a)) {
            mp5Var.onStart();
        }
    }

    @j(d.a.ON_STOP)
    public void onStop(@NonNull op5 op5Var) {
        for (mp5 mp5Var : vub.k(this.a)) {
            mp5Var.g();
        }
    }
}
