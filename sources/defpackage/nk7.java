package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeDiscount.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\tB'\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lnk7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "carryout", DateTokenConverter.CONVERTER_KEY, "restaurant", c.a, "Ljava/lang/String;", "()Ljava/lang/String;", "carryoutText", e.a, "restaurantText", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nk7  reason: default package */
/* loaded from: classes4.dex */
public final class nk7 {
    public static final a e = new a(null);
    private static final nk7 f = new nk7(0, 0, "", "");
    private final int a;
    private final int b;
    private final String c;
    private final String d;

    /* compiled from: OrderTypeDiscount.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lnk7$a;", "", "Lnk7;", "EMPTY", "Lnk7;", "a", "()Lnk7;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nk7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nk7 a() {
            return nk7.f;
        }
    }

    public nk7(int i, int i2, String str, String str2) {
        z65.h(str, "carryoutText");
        z65.h(str2, "restaurantText");
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk7)) {
            return false;
        }
        nk7 nk7Var = (nk7) obj;
        if (this.a == nk7Var.a && this.b == nk7Var.b && z65.c(this.c, nk7Var.c) && z65.c(this.d, nk7Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c;
        String str2 = this.d;
        return "OrderTypeDiscount(carryout=" + i + ", restaurant=" + i2 + ", carryoutText=" + str + ", restaurantText=" + str2 + ")";
    }
}
