package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Permission.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\t\u0010\u0016¨\u0006\u001c"}, d2 = {"Ldy7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lry7;", "b", "Lry7;", DateTokenConverter.CONVERTER_KEY, "()Lry7;", "status", "Z", e.a, "()Z", "wasRequested", "granted", "denied", "<init>", "(Ljava/lang/String;Lry7;Z)V", "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: dy7  reason: default package */
/* loaded from: classes2.dex */
public final class dy7 {
    private final String a;
    private final ry7 b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public dy7(String str, ry7 ry7Var, boolean z) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(ry7Var, "status");
        this.a = str;
        this.b = ry7Var;
        this.c = z;
        ry7 ry7Var2 = ry7.GRANTED;
        this.d = ry7Var == ry7Var2;
        this.e = ry7Var != ry7Var2;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final ry7 d() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy7)) {
            return false;
        }
        dy7 dy7Var = (dy7) obj;
        if (z65.c(this.a, dy7Var.a) && this.b == dy7Var.b && this.c == dy7Var.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "Permission(name=" + this.a + ", status=" + this.b + ", wasRequested=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ dy7(String str, ry7 ry7Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? ry7.GRANTED : ry7Var, (i & 4) != 0 ? false : z);
    }
}
