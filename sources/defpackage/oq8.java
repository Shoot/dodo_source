package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
/* compiled from: Prop.java */
/* renamed from: oq8  reason: default package */
/* loaded from: classes3.dex */
public class oq8<T> {
    private final String a;

    oq8(@NonNull String str) {
        this.a = str;
    }

    @NonNull
    public static <T> oq8<T> c(@NonNull String str) {
        return new oq8<>(str);
    }

    public T a(@NonNull dg9 dg9Var) {
        return (T) dg9Var.a(this);
    }

    @NonNull
    public T b(@NonNull dg9 dg9Var, @NonNull T t) {
        return (T) dg9Var.b(this, t);
    }

    @NonNull
    public T d(@NonNull dg9 dg9Var) {
        T a = a(dg9Var);
        if (a != null) {
            return a;
        }
        throw new NullPointerException(this.a);
    }

    public void e(@NonNull dg9 dg9Var, T t) {
        dg9Var.c(this, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((oq8) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}
