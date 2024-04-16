package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryAddressInfoVOData.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001\u0016BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.Jc\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lev2;", "Ljava/io/Serializable;", "", "addressMainFieldHint", "addressMainFieldText", "", "addressMainFieldIsEnabled", "warningIsVisible", "Ldi0;", "confirmButtonState", "", "warningTextResId", "errorIconIsVisible", "oneOfRequiredFieldsIsEmpty", "Ljx2;", "deliveryLocation", "b", "toString", "hashCode", "", "other", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "f", c.a, "Z", e.a, "()Z", Image.TYPE_MEDIUM, "Ldi0;", "i", "()Ldi0;", "I", "n", "()I", "g", "k", Image.TYPE_HIGH, "l", "Ljx2;", "j", "()Ljx2;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLdi0;IZZLjx2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ev2  reason: default package */
/* loaded from: classes2.dex */
public final class ev2 implements Serializable {
    public static final a j = new a(null);
    public static final int k = 8;
    private static final ev2 l = new ev2("", "", false, false, di0.c, -1, false, false, jx2.f);
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final di0 e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final jx2 i;

    /* compiled from: DeliveryAddressInfoVOData.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lev2$a;", "", "Lev2;", "EMPTY", "Lev2;", "a", "()Lev2;", "", "WRONG_RESOURCE_ID", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ev2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ev2 a() {
            return ev2.l;
        }
    }

    public ev2(String str, String str2, boolean z, boolean z2, di0 di0Var, int i, boolean z3, boolean z4, jx2 jx2Var) {
        z65.h(str, "addressMainFieldHint");
        z65.h(str2, "addressMainFieldText");
        z65.h(di0Var, "confirmButtonState");
        z65.h(jx2Var, "deliveryLocation");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = di0Var;
        this.f = i;
        this.g = z3;
        this.h = z4;
        this.i = jx2Var;
    }

    public static /* synthetic */ ev2 c(ev2 ev2Var, String str, String str2, boolean z, boolean z2, di0 di0Var, int i, boolean z3, boolean z4, jx2 jx2Var, int i2, Object obj) {
        String str3;
        String str4;
        boolean z5;
        boolean z6;
        di0 di0Var2;
        int i3;
        boolean z7;
        boolean z8;
        jx2 jx2Var2;
        if ((i2 & 1) != 0) {
            str3 = ev2Var.a;
        } else {
            str3 = str;
        }
        if ((i2 & 2) != 0) {
            str4 = ev2Var.b;
        } else {
            str4 = str2;
        }
        if ((i2 & 4) != 0) {
            z5 = ev2Var.c;
        } else {
            z5 = z;
        }
        if ((i2 & 8) != 0) {
            z6 = ev2Var.d;
        } else {
            z6 = z2;
        }
        if ((i2 & 16) != 0) {
            di0Var2 = ev2Var.e;
        } else {
            di0Var2 = di0Var;
        }
        if ((i2 & 32) != 0) {
            i3 = ev2Var.f;
        } else {
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            z7 = ev2Var.g;
        } else {
            z7 = z3;
        }
        if ((i2 & 128) != 0) {
            z8 = ev2Var.h;
        } else {
            z8 = z4;
        }
        if ((i2 & 256) != 0) {
            jx2Var2 = ev2Var.i;
        } else {
            jx2Var2 = jx2Var;
        }
        return ev2Var.b(str3, str4, z5, z6, di0Var2, i3, z7, z8, jx2Var2);
    }

    public final ev2 b(String str, String str2, boolean z, boolean z2, di0 di0Var, int i, boolean z3, boolean z4, jx2 jx2Var) {
        z65.h(str, "addressMainFieldHint");
        z65.h(str2, "addressMainFieldText");
        z65.h(di0Var, "confirmButtonState");
        z65.h(jx2Var, "deliveryLocation");
        return new ev2(str, str2, z, z2, di0Var, i, z3, z4, jx2Var);
    }

    public final String d() {
        return this.a;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev2)) {
            return false;
        }
        ev2 ev2Var = (ev2) obj;
        if (z65.c(this.a, ev2Var.a) && z65.c(this.b, ev2Var.b) && this.c == ev2Var.c && this.d == ev2Var.d && this.e == ev2Var.e && this.f == ev2Var.f && this.g == ev2Var.g && this.h == ev2Var.h && z65.c(this.i, ev2Var.i)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + a91.a(this.d)) * 31) + this.e.hashCode()) * 31) + this.f) * 31) + a91.a(this.g)) * 31) + a91.a(this.h)) * 31) + this.i.hashCode();
    }

    public final di0 i() {
        return this.e;
    }

    public final jx2 j() {
        return this.i;
    }

    public final boolean k() {
        return this.g;
    }

    public final boolean l() {
        return this.h;
    }

    public final boolean m() {
        return this.d;
    }

    public final int n() {
        return this.f;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        di0 di0Var = this.e;
        int i = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        jx2 jx2Var = this.i;
        return "DeliveryAddressInfoVOData(addressMainFieldHint=" + str + ", addressMainFieldText=" + str2 + ", addressMainFieldIsEnabled=" + z + ", warningIsVisible=" + z2 + ", confirmButtonState=" + di0Var + ", warningTextResId=" + i + ", errorIconIsVisible=" + z3 + ", oneOfRequiredFieldsIsEmpty=" + z4 + ", deliveryLocation=" + jx2Var + ")";
    }
}
