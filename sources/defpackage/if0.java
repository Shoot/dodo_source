package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PizzeriaMapHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0017"}, d2 = {"Lif0;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "D", "b", "()D", "north", "east", c.a, "south", DateTokenConverter.CONVERTER_KEY, "west", "<init>", "(DDDD)V", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: if0  reason: default package */
/* loaded from: classes4.dex */
public final class if0 {
    private final double a;
    private final double b;
    private final double c;
    private final double d;

    public if0(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final double a() {
        return this.b;
    }

    public final double b() {
        return this.a;
    }

    public final double c() {
        return this.c;
    }

    public final double d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if0)) {
            return false;
        }
        if0 if0Var = (if0) obj;
        if (Double.compare(this.a, if0Var.a) == 0 && Double.compare(this.b, if0Var.b) == 0 && Double.compare(this.c, if0Var.c) == 0 && Double.compare(this.d, if0Var.d) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((nkb.a(this.a) * 31) + nkb.a(this.b)) * 31) + nkb.a(this.c)) * 31) + nkb.a(this.d);
    }

    public String toString() {
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        double d4 = this.d;
        return "BoundingBox(north=" + d + ", east=" + d2 + ", south=" + d3 + ", west=" + d4 + ")";
    }

    public if0() {
        this(0.0d, 0.0d, 0.0d, 0.0d);
    }
}
