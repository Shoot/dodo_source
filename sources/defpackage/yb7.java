package defpackage;

import androidx.annotation.NonNull;
import defpackage.gs2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OptionalProvider.java */
/* renamed from: yb7  reason: default package */
/* loaded from: classes2.dex */
public class yb7<T> implements bs8<T>, gs2<T> {
    private static final gs2.a<Object> c = new gs2.a() { // from class: vb7
        @Override // defpackage.gs2.a
        public final void a(bs8 bs8Var) {
            yb7.f(bs8Var);
        }
    };
    private static final bs8<Object> d = new bs8() { // from class: wb7
        @Override // defpackage.bs8
        public final Object get() {
            Object g;
            g = yb7.g();
            return g;
        }
    };
    private gs2.a<T> a;
    private volatile bs8<T> b;

    private yb7(gs2.a<T> aVar, bs8<T> bs8Var) {
        this.a = aVar;
        this.b = bs8Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> yb7<T> e() {
        return new yb7<>(c, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(gs2.a aVar, gs2.a aVar2, bs8 bs8Var) {
        aVar.a(bs8Var);
        aVar2.a(bs8Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> yb7<T> i(bs8<T> bs8Var) {
        return new yb7<>(null, bs8Var);
    }

    @Override // defpackage.gs2
    public void a(@NonNull final gs2.a<T> aVar) {
        bs8<T> bs8Var;
        bs8<T> bs8Var2;
        bs8<T> bs8Var3 = this.b;
        bs8<Object> bs8Var4 = d;
        if (bs8Var3 != bs8Var4) {
            aVar.a(bs8Var3);
            return;
        }
        synchronized (this) {
            bs8Var = this.b;
            if (bs8Var != bs8Var4) {
                bs8Var2 = bs8Var;
            } else {
                final gs2.a<T> aVar2 = this.a;
                this.a = new gs2.a() { // from class: xb7
                    @Override // defpackage.gs2.a
                    public final void a(bs8 bs8Var5) {
                        yb7.h(gs2.a.this, aVar, bs8Var5);
                    }
                };
                bs8Var2 = null;
            }
        }
        if (bs8Var2 != null) {
            aVar.a(bs8Var);
        }
    }

    @Override // defpackage.bs8
    public T get() {
        return this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(bs8<T> bs8Var) {
        gs2.a<T> aVar;
        if (this.b == d) {
            synchronized (this) {
                aVar = this.a;
                this.a = null;
                this.b = bs8Var;
            }
            aVar.a(bs8Var);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(bs8 bs8Var) {
    }
}
