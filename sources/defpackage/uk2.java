package defpackage;

import androidx.annotation.NonNull;
/* compiled from: DataFetcher.java */
/* renamed from: uk2  reason: default package */
/* loaded from: classes.dex */
public interface uk2<T> {

    /* compiled from: DataFetcher.java */
    /* renamed from: uk2$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        void c(@NonNull Exception exc);

        void f(T t);
    }

    @NonNull
    Class<T> a();

    void b();

    void cancel();

    void d(@NonNull yj8 yj8Var, @NonNull a<? super T> aVar);

    @NonNull
    dl2 e();
}
