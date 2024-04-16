package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalOffersData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\n\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011¨\u0006!"}, d2 = {"Lo08;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "blockTitle", "Z", e.a, "()Z", "showLoadingState", c.a, DateTokenConverter.CONVERTER_KEY, "showDescription", "I", "()I", "blockTitleTextAppearance", "Lh18;", "Lh18;", "()Lh18;", "analyticsSender", "f", "isCollaborationActionAvailable", "<init>", "(Ljava/lang/String;ZZILh18;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o08  reason: default package */
/* loaded from: classes2.dex */
public final class o08 implements Serializable {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final h18 e;
    private final boolean f;

    public o08(String str, boolean z, boolean z2, int i, h18 h18Var, boolean z3) {
        z65.h(str, "blockTitle");
        z65.h(h18Var, "analyticsSender");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = h18Var;
        this.f = z3;
    }

    public final h18 a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o08)) {
            return false;
        }
        o08 o08Var = (o08) obj;
        if (z65.c(this.a, o08Var.a) && this.b == o08Var.b && this.c == o08Var.c && this.d == o08Var.d && this.e == o08Var.e && this.f == o08Var.f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + a91.a(this.c)) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + a91.a(this.f);
    }

    public String toString() {
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        int i = this.d;
        h18 h18Var = this.e;
        boolean z3 = this.f;
        return "PersonalOffersData(blockTitle=" + str + ", showLoadingState=" + z + ", showDescription=" + z2 + ", blockTitleTextAppearance=" + i + ", analyticsSender=" + h18Var + ", isCollaborationActionAvailable=" + z3 + ")";
    }

    public /* synthetic */ o08(String str, boolean z, boolean z2, int i, h18 h18Var, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? s19.TextAppearance_MaterialComponents_Headline6 : i, h18Var, (i2 & 32) != 0 ? true : z3);
    }
}
