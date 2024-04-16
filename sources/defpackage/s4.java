package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import defpackage.s58;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: Action.java */
/* renamed from: s4  reason: default package */
/* loaded from: classes3.dex */
abstract class s4<T> {
    final s58 a;
    final gi9 b;
    final WeakReference<T> c;
    final boolean d;
    final int e;
    final int f;
    final int g;
    final Drawable h;
    final String i;
    final Object j;
    boolean k;
    boolean l;

    /* compiled from: Action.java */
    /* renamed from: s4$a */
    /* loaded from: classes3.dex */
    static class a<M> extends WeakReference<M> {
        final s4 a;

        a(s4 s4Var, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.a = s4Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s4(s58 s58Var, T t, gi9 gi9Var, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        a aVar;
        this.a = s58Var;
        this.b = gi9Var;
        if (t == null) {
            aVar = null;
        } else {
            aVar = new a(this, t, s58Var.j);
        }
        this.c = aVar;
        this.e = i;
        this.f = i2;
        this.d = z;
        this.g = i3;
        this.h = drawable;
        this.i = str;
        this.j = obj == null ? this : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Bitmap bitmap, s58.e eVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Exception exc);

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s58 g() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s58.f h() {
        return this.b.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public gi9 i() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object j() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T k() {
        WeakReference<T> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.k;
    }
}
