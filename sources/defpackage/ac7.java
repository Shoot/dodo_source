package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
/* compiled from: Options.java */
/* renamed from: ac7  reason: default package */
/* loaded from: classes.dex */
public final class ac7 implements se5 {
    private final lr<mb7<?>, Object> b = new yl0();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void g(@NonNull mb7<T> mb7Var, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        mb7Var.g(obj, messageDigest);
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.b.size(); i++) {
            g(this.b.k(i), this.b.o(i), messageDigest);
        }
    }

    public <T> T c(@NonNull mb7<T> mb7Var) {
        if (this.b.containsKey(mb7Var)) {
            return (T) this.b.get(mb7Var);
        }
        return mb7Var.c();
    }

    public void d(@NonNull ac7 ac7Var) {
        this.b.l(ac7Var.b);
    }

    public ac7 e(@NonNull mb7<?> mb7Var) {
        this.b.remove(mb7Var);
        return this;
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (obj instanceof ac7) {
            return this.b.equals(((ac7) obj).b);
        }
        return false;
    }

    @NonNull
    public <T> ac7 f(@NonNull mb7<T> mb7Var, @NonNull T t) {
        this.b.put(mb7Var, t);
        return this;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.b + CoreConstants.CURLY_RIGHT;
    }
}
