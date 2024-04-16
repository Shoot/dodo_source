package defpackage;
/* compiled from: Lazy.java */
/* renamed from: qn5  reason: default package */
/* loaded from: classes2.dex */
public class qn5<T> implements bs8<T> {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile bs8<T> b;

    public qn5(bs8<T> bs8Var) {
        this.b = bs8Var;
    }

    @Override // defpackage.bs8
    public T get() {
        T t = (T) this.a;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.a;
                    if (t == obj) {
                        t = this.b.get();
                        this.a = t;
                        this.b = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }
}
