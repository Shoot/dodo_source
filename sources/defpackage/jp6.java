package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
/* compiled from: MultiClassKey.java */
/* renamed from: jp6  reason: default package */
/* loaded from: classes.dex */
public class jp6 {
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;

    public jp6() {
    }

    public void a(@NonNull Class<?> cls, @NonNull Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jp6 jp6Var = (jp6) obj;
        if (this.a.equals(jp6Var.a) && this.b.equals(jp6Var.b) && vub.e(this.c, jp6Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class<?> cls = this.c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + CoreConstants.CURLY_RIGHT;
    }

    public jp6(@NonNull Class<?> cls, @NonNull Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
