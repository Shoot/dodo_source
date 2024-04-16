package defpackage;

import androidx.annotation.NonNull;
/* compiled from: SimpleResource.java */
/* renamed from: tla  reason: default package */
/* loaded from: classes.dex */
public class tla<T> implements nj9<T> {
    protected final T a;

    public tla(@NonNull T t) {
        this.a = (T) eh8.d(t);
    }

    @Override // defpackage.nj9
    public final int a() {
        return 1;
    }

    @Override // defpackage.nj9
    @NonNull
    public Class<T> c() {
        return (Class<T>) this.a.getClass();
    }

    @Override // defpackage.nj9
    @NonNull
    public final T get() {
        return this.a;
    }

    @Override // defpackage.nj9
    public void b() {
    }
}
