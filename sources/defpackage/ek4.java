package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ym;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HalvesConstructorFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0018\u0012\b\b\u0002\u0010 \u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010 \u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006#"}, d2 = {"Lek4;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "menuItemId", "Lym$d;", "b", "Lym$d;", "()Lym$d;", "fromScreen", "Lkotlin/Pair;", "Lkotlin/Pair;", "()Lkotlin/Pair;", "halvesIdsPair", "Lck1;", DateTokenConverter.CONVERTER_KEY, "Lck1;", "()Lck1;", "sender", e.a, "Z", "()Z", "isHero", "<init>", "(Ljava/lang/String;Lym$d;Lkotlin/Pair;Lck1;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ek4  reason: default package */
/* loaded from: classes2.dex */
public final class ek4 implements Serializable {
    private final String a;
    private final ym.d b;
    private final Pair<String, String> c;
    private final ck1 d;
    private final boolean e;

    public ek4(String str, ym.d dVar, Pair<String, String> pair, ck1 ck1Var, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(dVar, "fromScreen");
        z65.h(pair, "halvesIdsPair");
        z65.h(ck1Var, "sender");
        this.a = str;
        this.b = dVar;
        this.c = pair;
        this.d = ck1Var;
        this.e = z;
    }

    public final ym.d a() {
        return this.b;
    }

    public final Pair<String, String> b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final ck1 d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek4)) {
            return false;
        }
        ek4 ek4Var = (ek4) obj;
        if (z65.c(this.a, ek4Var.a) && this.b == ek4Var.b && z65.c(this.c, ek4Var.c) && this.d == ek4Var.d && this.e == ek4Var.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e);
    }

    public String toString() {
        String str = this.a;
        ym.d dVar = this.b;
        Pair<String, String> pair = this.c;
        ck1 ck1Var = this.d;
        boolean z = this.e;
        return "HalvesConstructorData(menuItemId=" + str + ", fromScreen=" + dVar + ", halvesIdsPair=" + pair + ", sender=" + ck1Var + ", isHero=" + z + ")";
    }

    public /* synthetic */ ek4(String str, ym.d dVar, Pair pair, ck1 ck1Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dVar, (i & 4) != 0 ? new Pair("", "") : pair, (i & 8) != 0 ? ck1.e : ck1Var, (i & 16) != 0 ? false : z);
    }
}
