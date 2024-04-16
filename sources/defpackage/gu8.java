package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: QRCodeSquare.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000f\u0010\u001c¨\u0006 "}, d2 = {"Lgu8;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", c.a, "(Z)V", "dark", "b", "I", "getRow", "()I", "row", "getCol", "col", DateTokenConverter.CONVERTER_KEY, "getModuleSize", "moduleSize", "Lhu8;", e.a, "Lhu8;", "()Lhu8;", "squareInfo", "<init>", "(ZIIILhu8;)V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: gu8  reason: default package */
/* loaded from: classes3.dex */
public final class gu8 {
    private boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final hu8 e;

    public gu8(boolean z, int i, int i2, int i3, hu8 hu8Var) {
        z65.h(hu8Var, "squareInfo");
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = hu8Var;
    }

    public final boolean a() {
        return this.a;
    }

    public final hu8 b() {
        return this.e;
    }

    public final void c(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu8)) {
            return false;
        }
        gu8 gu8Var = (gu8) obj;
        if (this.a == gu8Var.a && this.b == gu8Var.b && this.c == gu8Var.c && this.d == gu8Var.d && z65.c(this.e, gu8Var.e)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((r0 * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "QRCodeSquare(dark=" + this.a + ", row=" + this.b + ", col=" + this.c + ", moduleSize=" + this.d + ", squareInfo=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ gu8(boolean z, int i, int i2, int i3, hu8 hu8Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, i2, i3, (i4 & 16) != 0 ? new hu8(iu8.DEFAULT, eu8.UNKNOWN) : hu8Var);
    }
}
