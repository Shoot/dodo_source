package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PhoneOutput.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&J1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010!\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\u001a¨\u0006'"}, d2 = {"Lg48;", "", "Lf28;", "phone", "Lj28;", "format", "", "formattedPhoneBody", "Lc58;", "phoneValidity", "a", "toString", "", "hashCode", "other", "", "equals", "Lf28;", "f", "()Lf28;", "b", "Lj28;", c.a, "()Lj28;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Lc58;", "g", "()Lc58;", e.a, "full", Image.TYPE_HIGH, "serverPhone", "<init>", "(Lf28;Lj28;Ljava/lang/String;Lc58;)V", "Lu28;", "phoneInput", "(Lu28;)V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: g48  reason: default package */
/* loaded from: classes2.dex */
public final class g48 {
    private final f28 a;
    private final j28 b;
    private final String c;
    private final c58 d;

    public g48(f28 f28Var, j28 j28Var, String str, c58 c58Var) {
        z65.h(f28Var, "phone");
        z65.h(j28Var, "format");
        z65.h(str, "formattedPhoneBody");
        z65.h(c58Var, "phoneValidity");
        this.a = f28Var;
        this.b = j28Var;
        this.c = str;
        this.d = c58Var;
    }

    public static /* synthetic */ g48 b(g48 g48Var, f28 f28Var, j28 j28Var, String str, c58 c58Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f28Var = g48Var.a;
        }
        if ((i & 2) != 0) {
            j28Var = g48Var.b;
        }
        if ((i & 4) != 0) {
            str = g48Var.c;
        }
        if ((i & 8) != 0) {
            c58Var = g48Var.d;
        }
        return g48Var.a(f28Var, j28Var, str, c58Var);
    }

    public final g48 a(f28 f28Var, j28 j28Var, String str, c58 c58Var) {
        z65.h(f28Var, "phone");
        z65.h(j28Var, "format");
        z65.h(str, "formattedPhoneBody");
        z65.h(c58Var, "phoneValidity");
        return new g48(f28Var, j28Var, str, c58Var);
    }

    public final j28 c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        String b = this.b.b();
        String str = this.c;
        return b + " " + str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g48)) {
            return false;
        }
        g48 g48Var = (g48) obj;
        if (z65.c(this.a, g48Var.a) && z65.c(this.b, g48Var.b) && z65.c(this.c, g48Var.c) && z65.c(this.d, g48Var.d)) {
            return true;
        }
        return false;
    }

    public final f28 f() {
        return this.a;
    }

    public final c58 g() {
        return this.d;
    }

    public final String h() {
        String b = this.b.b();
        String a = this.a.a();
        return b + a;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        f28 f28Var = this.a;
        j28 j28Var = this.b;
        String str = this.c;
        c58 c58Var = this.d;
        return "PhoneOutput(phone=" + f28Var + ", format=" + j28Var + ", formattedPhoneBody=" + str + ", phoneValidity=" + c58Var + ")";
    }

    public /* synthetic */ g48(f28 f28Var, j28 j28Var, String str, c58 c58Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f28Var, j28Var, str, (i & 8) != 0 ? new c58(false, false, 3, null) : c58Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g48(u28 u28Var) {
        this(new f28(u28Var.a().b(), u28Var.b()), u28Var.a(), u28Var.b(), null, 8, null);
        z65.h(u28Var, "phoneInput");
    }
}
