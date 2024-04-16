package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MindboxMessageHandler.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lhk6;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lxj6;", "a", "Lxj6;", "()Lxj6;", "imageFailureHandler", "Lyj6;", "b", "Lyj6;", "()Lyj6;", "imageLoader", "<init>", "(Lxj6;Lyj6;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hk6  reason: default package */
/* loaded from: classes.dex */
public final class hk6 {
    private final xj6 a;
    private final yj6 b;

    public hk6() {
        this(null, null, 3, null);
    }

    public final xj6 a() {
        return this.a;
    }

    public final yj6 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk6)) {
            return false;
        }
        hk6 hk6Var = (hk6) obj;
        if (z65.c(this.a, hk6Var.a) && z65.c(this.b, hk6Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MindboxMessageHandler(imageFailureHandler=" + this.a + ", imageLoader=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public hk6(xj6 xj6Var, yj6 yj6Var) {
        z65.h(xj6Var, "imageFailureHandler");
        z65.h(yj6Var, "imageLoader");
        this.a = xj6Var;
        this.b = yj6Var;
    }

    public /* synthetic */ hk6(xj6 xj6Var, yj6 yj6Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ku4.a(xj6.a) : xj6Var, (i & 2) != 0 ? ak6.a(yj6.a) : yj6Var);
    }
}
