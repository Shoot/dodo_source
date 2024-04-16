package defpackage;

import com.google.auto.value.AutoValue;
/* compiled from: Event.java */
@AutoValue
/* renamed from: pk3  reason: default package */
/* loaded from: classes2.dex */
public abstract class pk3<T> {
    public static <T> pk3<T> e(T t) {
        return new n20(null, t, xj8.DEFAULT, null);
    }

    public static <T> pk3<T> f(T t, ol8 ol8Var) {
        return new n20(null, t, xj8.DEFAULT, ol8Var);
    }

    public static <T> pk3<T> g(T t) {
        return new n20(null, t, xj8.HIGHEST, null);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract xj8 c();

    public abstract ol8 d();
}
