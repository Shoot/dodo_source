package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.n40;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MysteryShopperCheckup.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lds6;", "Ln40;", "Ln40$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "B0", "()Ljava/lang/String;", "cardTitle", "", "Luo0;", "b", "Ljava/util/List;", "a0", "()Ljava/util/List;", "cardBody", c.a, "k0", "buttonTitle", "Lgs6;", DateTokenConverter.CONVERTER_KEY, "Lgs6;", "i0", "()Lgs6;", "formInfo", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lgs6;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ds6  reason: default package */
/* loaded from: classes.dex */
public final class ds6 implements n40, n40.a {
    private final String a;
    private final List<uo0> b;
    private final String c;
    private final gs6 d;

    /* JADX WARN: Multi-variable type inference failed */
    public ds6(String str, List<? extends uo0> list, String str2, gs6 gs6Var) {
        z65.h(str, "cardTitle");
        z65.h(list, "cardBody");
        z65.h(str2, "buttonTitle");
        z65.h(gs6Var, "formInfo");
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = gs6Var;
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
        if (!(obj instanceof ds6)) {
            return false;
        }
        ds6 ds6Var = (ds6) obj;
        if (z65.c(this.a, ds6Var.a) && z65.c(this.b, ds6Var.b) && z65.c(this.c, ds6Var.c) && z65.c(this.d, ds6Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // defpackage.n40.a
    public gs6 i0() {
        return this.d;
    }

    @Override // defpackage.n40
    public String k0() {
        return this.c;
    }

    public String toString() {
        String str = this.a;
        List<uo0> list = this.b;
        String str2 = this.c;
        gs6 gs6Var = this.d;
        return "MysteryShopperCheckupReadyForFilling(cardTitle=" + str + ", cardBody=" + list + ", buttonTitle=" + str2 + ", formInfo=" + gs6Var + ")";
    }
}
