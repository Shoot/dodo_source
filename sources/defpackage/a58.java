package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PhonePrefixVO.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001f"}, d2 = {"La58;", "Ljava/io/Serializable;", "", "countryIsoName", "", "phonePrefix", "countryName", "", "isSelected", "isLastSuggested", "a", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "b", "Ljava/lang/CharSequence;", e.a, "()Ljava/lang/CharSequence;", DateTokenConverter.CONVERTER_KEY, "Z", "g", "()Z", "f", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a58  reason: default package */
/* loaded from: classes4.dex */
public final class a58 implements Serializable {
    private final String a;
    private final CharSequence b;
    private final CharSequence c;
    private final boolean d;
    private final boolean e;

    public a58(String str, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        z65.h(str, "countryIsoName");
        z65.h(charSequence, "phonePrefix");
        z65.h(charSequence2, "countryName");
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z;
        this.e = z2;
    }

    public static /* synthetic */ a58 b(a58 a58Var, String str, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = a58Var.a;
        }
        if ((i & 2) != 0) {
            charSequence = a58Var.b;
        }
        CharSequence charSequence3 = charSequence;
        if ((i & 4) != 0) {
            charSequence2 = a58Var.c;
        }
        CharSequence charSequence4 = charSequence2;
        if ((i & 8) != 0) {
            z = a58Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = a58Var.e;
        }
        return a58Var.a(str, charSequence3, charSequence4, z3, z2);
    }

    public final a58 a(String str, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        z65.h(str, "countryIsoName");
        z65.h(charSequence, "phonePrefix");
        z65.h(charSequence2, "countryName");
        return new a58(str, charSequence, charSequence2, z, z2);
    }

    public final String c() {
        return this.a;
    }

    public final CharSequence d() {
        return this.c;
    }

    public final CharSequence e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a58)) {
            return false;
        }
        a58 a58Var = (a58) obj;
        if (z65.c(this.a, a58Var.a) && z65.c(this.b, a58Var.b) && z65.c(this.c, a58Var.c) && this.d == a58Var.d && this.e == a58Var.e) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.d;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d)) * 31) + a91.a(this.e);
    }

    public String toString() {
        String str = this.a;
        CharSequence charSequence = this.b;
        CharSequence charSequence2 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        return "PhonePrefixVO(countryIsoName=" + str + ", phonePrefix=" + ((Object) charSequence) + ", countryName=" + ((Object) charSequence2) + ", isSelected=" + z + ", isLastSuggested=" + z2 + ")";
    }
}
