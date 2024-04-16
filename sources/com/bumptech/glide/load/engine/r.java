package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import defpackage.po3;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LockedResource.java */
/* loaded from: classes.dex */
public final class r<Z> implements nj9<Z>, po3.f {
    private static final jf8<r<?>> e = po3.d(20, new a());
    private final eva a = eva.a();
    private nj9<Z> b;
    private boolean c;
    private boolean d;

    /* compiled from: LockedResource.java */
    /* loaded from: classes.dex */
    class a implements po3.d<r<?>> {
        a() {
        }

        @Override // defpackage.po3.d
        /* renamed from: b */
        public r<?> a() {
            return new r<>();
        }
    }

    r() {
    }

    private void d(nj9<Z> nj9Var) {
        this.d = false;
        this.c = true;
        this.b = nj9Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static <Z> r<Z> e(nj9<Z> nj9Var) {
        r<Z> rVar = (r) eh8.d(e.b());
        rVar.d(nj9Var);
        return rVar;
    }

    private void f() {
        this.b = null;
        e.a(this);
    }

    @Override // defpackage.nj9
    public int a() {
        return this.b.a();
    }

    @Override // defpackage.nj9
    public synchronized void b() {
        this.a.c();
        this.d = true;
        if (!this.c) {
            this.b.b();
            f();
        }
    }

    @Override // defpackage.nj9
    @NonNull
    public Class<Z> c() {
        return this.b.c();
    }

    @Override // defpackage.po3.f
    @NonNull
    public eva g() {
        return this.a;
    }

    @Override // defpackage.nj9
    @NonNull
    public Z get() {
        return this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void h() {
        this.a.c();
        if (this.c) {
            this.c = false;
            if (this.d) {
                b();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
