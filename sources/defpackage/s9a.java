package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: Selection.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\tJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\t\u0010\u0012¨\u0006\u0014"}, d2 = {"Ls9a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "handlesCrossed", "Ls9a$a;", "start", "Ls9a$a;", c.a, "()Ls9a$a;", "end", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s9a  reason: default package */
/* loaded from: classes.dex */
public final class s9a {
    private final boolean a;

    /* compiled from: Selection.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls9a$a;", "", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: s9a$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public final a a() {
        return null;
    }

    public final boolean b() {
        return this.a;
    }

    public final a c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9a)) {
            return false;
        }
        s9a s9aVar = (s9a) obj;
        s9aVar.getClass();
        if (z65.c(null, null) && z65.c(null, null) && this.a == s9aVar.a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "Selection(start=" + ((Object) null) + ", end=" + ((Object) null) + ", handlesCrossed=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
