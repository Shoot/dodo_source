package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\n\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Ljp9;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "F", c.a, "()F", "f", "(F)V", "weight", "b", "Z", "()Z", e.a, "(Z)V", "fill", "Lv22;", "Lv22;", "()Lv22;", DateTokenConverter.CONVERTER_KEY, "(Lv22;)V", "crossAxisAlignment", "<init>", "(FZLv22;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jp9  reason: default package */
/* loaded from: classes.dex */
public final class jp9 {
    private float a;
    private boolean b;
    private v22 c;

    public jp9() {
        this(0.0f, false, null, 7, null);
    }

    public final v22 a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final float c() {
        return this.a;
    }

    public final void d(v22 v22Var) {
        this.c = v22Var;
    }

    public final void e(boolean z) {
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp9)) {
            return false;
        }
        jp9 jp9Var = (jp9) obj;
        if (Float.compare(this.a, jp9Var.a) == 0 && this.b == jp9Var.b && z65.c(this.c, jp9Var.c)) {
            return true;
        }
        return false;
    }

    public final void f(float f) {
        this.a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (floatToIntBits + i) * 31;
        v22 v22Var = this.c;
        if (v22Var == null) {
            hashCode = 0;
        } else {
            hashCode = v22Var.hashCode();
        }
        return i2 + hashCode;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public jp9(float f, boolean z, v22 v22Var) {
        this.a = f;
        this.b = z;
        this.c = v22Var;
    }

    public /* synthetic */ jp9(float f, boolean z, v22 v22Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : v22Var);
    }
}
