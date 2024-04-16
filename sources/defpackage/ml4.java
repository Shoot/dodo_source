package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: HalvesProductCardData.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lml4;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lkotlin/Pair;", "a", "Lkotlin/Pair;", "()Lkotlin/Pair;", "chosenHalvesIds", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "menuItemId", "Lym$d;", c.a, "Lym$d;", "()Lym$d;", "screen", "<init>", "(Lkotlin/Pair;Ljava/lang/String;Lym$d;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ml4  reason: default package */
/* loaded from: classes2.dex */
public final class ml4 {
    private final Pair<String, String> a;
    private final String b;
    private final ym.d c;

    public ml4(Pair<String, String> pair, String str, ym.d dVar) {
        z65.h(pair, "chosenHalvesIds");
        z65.h(str, "menuItemId");
        z65.h(dVar, "screen");
        this.a = pair;
        this.b = str;
        this.c = dVar;
    }

    public final Pair<String, String> a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final ym.d c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml4)) {
            return false;
        }
        ml4 ml4Var = (ml4) obj;
        if (z65.c(this.a, ml4Var.a) && z65.c(this.b, ml4Var.b) && this.c == ml4Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        Pair<String, String> pair = this.a;
        String str = this.b;
        ym.d dVar = this.c;
        return "HalvesProductCardData(chosenHalvesIds=" + pair + ", menuItemId=" + str + ", screen=" + dVar + ")";
    }
}
