package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MenuSubcategoryVO.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\nB7\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001c"}, d2 = {"Ldh6;", "", "", e.a, "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "id", "b", "categoryId", DateTokenConverter.CONVERTER_KEY, Action.NAME_ATTRIBUTE, "Z", "f", "()Z", "isHeroProduct", "analyticsName", "g", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dh6  reason: default package */
/* loaded from: classes2.dex */
public final class dh6 {
    public static final a g = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final String e;
    private final boolean f;

    /* compiled from: MenuSubcategoryVO.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Ldh6$a;", "", "", "categoryId", "", "isSelected", "Ldh6;", "a", "ALL_SUB_CATEGORY_ANALYTICS_NAME", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dh6$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dh6 a(String str, boolean z) {
            z65.h(str, "categoryId");
            return new dh6(str, str, "", false, "All", z);
        }
    }

    public dh6(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        z65.h(str, "id");
        z65.h(str2, "categoryId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "analyticsName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = z2;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return z65.c(this.a, this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh6)) {
            return false;
        }
        dh6 dh6Var = (dh6) obj;
        if (z65.c(this.a, dh6Var.a) && z65.c(this.b, dh6Var.b) && z65.c(this.c, dh6Var.c) && this.d == dh6Var.d && z65.c(this.e, dh6Var.e) && this.f == dh6Var.f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a91.a(this.d)) * 31) + this.e.hashCode()) * 31) + a91.a(this.f);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        boolean z = this.d;
        String str4 = this.e;
        boolean z2 = this.f;
        return "MenuSubcategoryVO(id=" + str + ", categoryId=" + str2 + ", name=" + str3 + ", isHeroProduct=" + z + ", analyticsName=" + str4 + ", isSelected=" + z2 + ")";
    }
}
