package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MysteryShopperCheckup.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, d2 = {"Lcs6;", "Ln40;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "B0", "()Ljava/lang/String;", "cardTitle", "", "Luo0;", "b", "Ljava/util/List;", "a0", "()Ljava/util/List;", "cardBody", c.a, "k0", "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cs6  reason: default package */
/* loaded from: classes.dex */
public final class cs6 implements n40 {
    private final String a;
    private final List<uo0> b;
    private final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public cs6(String str, List<? extends uo0> list, String str2) {
        z65.h(str, "cardTitle");
        z65.h(list, "cardBody");
        z65.h(str2, "buttonTitle");
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    @Override // defpackage.n40
    public String B0() {
        return this.a;
    }

    @Override // defpackage.n40
    public List<uo0> a0() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs6)) {
            return false;
        }
        cs6 cs6Var = (cs6) obj;
        if (z65.c(this.a, cs6Var.a) && z65.c(this.b, cs6Var.b) && z65.c(this.c, cs6Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @Override // defpackage.n40
    public String k0() {
        return this.c;
    }

    public String toString() {
        String str = this.a;
        List<uo0> list = this.b;
        String str2 = this.c;
        return "MysteryShopperCheckupOnboarding(cardTitle=" + str + ", cardBody=" + list + ", buttonTitle=" + str2 + ")";
    }
}
