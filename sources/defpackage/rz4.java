package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.qz4;
import kotlin.Metadata;
/* compiled from: InAppTypeWrapper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lrz4;", "Lqz4;", "T", "", "inAppType", "Lh87;", "onInAppClick", "Li87;", "onInAppShown", "a", "(Lqz4;Lh87;Li87;)Lrz4;", "", "toString", "", "hashCode", "other", "", "equals", "Lqz4;", c.a, "()Lqz4;", "b", "Lh87;", DateTokenConverter.CONVERTER_KEY, "()Lh87;", "Li87;", e.a, "()Li87;", "<init>", "(Lqz4;Lh87;Li87;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rz4  reason: default package */
/* loaded from: classes.dex */
public final class rz4<T extends qz4> {
    private final T a;
    private final h87 b;
    private final i87 c;

    public rz4(T t, h87 h87Var, i87 i87Var) {
        z65.h(t, "inAppType");
        z65.h(h87Var, "onInAppClick");
        z65.h(i87Var, "onInAppShown");
        this.a = t;
        this.b = h87Var;
        this.c = i87Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ rz4 b(rz4 rz4Var, qz4 qz4Var, h87 h87Var, i87 i87Var, int i, Object obj) {
        if ((i & 1) != 0) {
            qz4Var = rz4Var.a;
        }
        if ((i & 2) != 0) {
            h87Var = rz4Var.b;
        }
        if ((i & 4) != 0) {
            i87Var = rz4Var.c;
        }
        return rz4Var.a(qz4Var, h87Var, i87Var);
    }

    public final rz4<T> a(T t, h87 h87Var, i87 i87Var) {
        z65.h(t, "inAppType");
        z65.h(h87Var, "onInAppClick");
        z65.h(i87Var, "onInAppShown");
        return new rz4<>(t, h87Var, i87Var);
    }

    public final T c() {
        return this.a;
    }

    public final h87 d() {
        return this.b;
    }

    public final i87 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz4)) {
            return false;
        }
        rz4 rz4Var = (rz4) obj;
        if (z65.c(this.a, rz4Var.a) && z65.c(this.b, rz4Var.b) && z65.c(this.c, rz4Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "InAppTypeWrapper(inAppType=" + this.a + ", onInAppClick=" + this.b + ", onInAppShown=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
