package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: AndroidTextStyle.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lrc8;", "", "", "hashCode", "other", "", "equals", "", "toString", "Lhc8;", "a", "Lhc8;", "()Lhc8;", "paragraphStyle", "Lkc8;", "spanStyle", "Lkc8;", "b", "()Lkc8;", "<init>", "(Lkc8;Lhc8;)V", "includeFontPadding", "(Z)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rc8  reason: default package */
/* loaded from: classes.dex */
public final class rc8 {
    private final hc8 a;

    public rc8(kc8 kc8Var, hc8 hc8Var) {
        this.a = hc8Var;
    }

    public final hc8 a() {
        return this.a;
    }

    public final kc8 b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc8)) {
            return false;
        }
        rc8 rc8Var = (rc8) obj;
        if (!z65.c(this.a, rc8Var.a)) {
            return false;
        }
        rc8Var.getClass();
        if (z65.c(null, null)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        hc8 hc8Var = this.a;
        if (hc8Var != null) {
            return hc8Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + ((Object) null) + ", paragraphSyle=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public rc8(boolean z) {
        this(null, new hc8(z));
    }
}
