package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.LatLng;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Coordinates.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u0016\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u000bJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lqw1;", "Ljava/io/Serializable;", MessageAttributes.COORDINATES, "", e.a, "", "lat", "lon", DateTokenConverter.CONVERTER_KEY, "Lov5;", "i", "Lcom/google/android/gms/maps/model/LatLng;", "f", "", "toString", "", "hashCode", "", "other", "equals", "a", "D", "b", "()D", c.a, "<init>", "(DD)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qw1  reason: default package */
/* loaded from: classes4.dex */
public final class qw1 implements Serializable {
    public static final a c = new a(null);
    private static final qw1 d = new qw1(0.0d, 0.0d);
    private final double a;
    private final double b;

    /* compiled from: Coordinates.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lqw1$a;", "", "Lqw1;", "", "b", c.a, "EMPTY", "Lqw1;", "a", "()Lqw1;", "", "DELTA", "D", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qw1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qw1 a() {
            return qw1.d;
        }

        public final boolean b(qw1 qw1Var) {
            z65.h(qw1Var, "<this>");
            return z65.c(qw1Var, a());
        }

        public final boolean c(qw1 qw1Var) {
            z65.h(qw1Var, "<this>");
            return !b(qw1Var);
        }
    }

    public qw1(double d2, double d3) {
        this.a = d2;
        this.b = d3;
    }

    public final double b() {
        return this.a;
    }

    public final double c() {
        return this.b;
    }

    public final boolean d(double d2, double d3) {
        if (Math.abs(this.a - d2) < 1.0E-5d && Math.abs(this.b - d3) < 1.0E-5d) {
            return true;
        }
        return false;
    }

    public final boolean e(qw1 qw1Var) {
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        return d(qw1Var.a, qw1Var.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw1)) {
            return false;
        }
        qw1 qw1Var = (qw1) obj;
        if (Double.compare(this.a, qw1Var.a) == 0 && Double.compare(this.b, qw1Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final LatLng f() {
        return new LatLng(this.a, this.b);
    }

    public int hashCode() {
        return (nkb.a(this.a) * 31) + nkb.a(this.b);
    }

    public final ov5 i() {
        return new ov5(this.a, this.b, null, null, 12, null);
    }

    public String toString() {
        double d2 = this.a;
        double d3 = this.b;
        return "Coordinates(lat=" + d2 + ", lon=" + d3 + ")";
    }
}
