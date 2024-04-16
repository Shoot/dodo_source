package defpackage;

import androidx.annotation.NonNull;
/* compiled from: Pools.java */
/* renamed from: nf8  reason: default package */
/* loaded from: classes.dex */
public class nf8<T> extends lf8<T> {
    private final Object c;

    public nf8(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.lf8, defpackage.jf8
    public boolean a(@NonNull T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // defpackage.lf8, defpackage.jf8
    public T b() {
        T t;
        synchronized (this.c) {
            t = (T) super.b();
        }
        return t;
    }
}
