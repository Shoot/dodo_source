package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ym;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ComboAnalytics.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Ltg1;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "templateId", "b", "templateName", "Ltja;", c.a, "Ltja;", "shoppingItem", "", DateTokenConverter.CONVERTER_KEY, "D", "price", e.a, "currency", "", "Lfl8;", "f", "Ljava/util/List;", "products", "Lym$d;", "g", "Lym$d;", "screen", Image.TYPE_HIGH, "I", "positionInMenu", "i", "Z", "isHeroProduct", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltja;DLjava/lang/String;Ljava/util/List;Lym$d;IZ)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tg1  reason: default package */
/* loaded from: classes4.dex */
public final class tg1 implements dc {
    private final String a;
    private final String b;
    private final tja c;
    private final double d;
    private final String e;
    private final List<fl8> f;
    private final ym.d g;
    private final int h;
    private final boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public tg1(String str, String str2, tja tjaVar, double d, String str3, List<? extends fl8> list, ym.d dVar, int i, boolean z) {
        z65.h(str, "templateId");
        z65.h(str2, "templateName");
        z65.h(tjaVar, "shoppingItem");
        z65.h(str3, "currency");
        z65.h(list, "products");
        z65.h(dVar, "screen");
        this.a = str;
        this.b = str2;
        this.c = tjaVar;
        this.d = d;
        this.e = str3;
        this.f = list;
        this.g = dVar;
        this.h = i;
        this.i = z;
    }

    @Override // defpackage.dc
    public qc a() {
        List e;
        int w;
        Map k;
        bc e2 = bc.e(new bc("open_product_card"), ShoppingInfoEntity.FIELD_PRODUCT_ID, this.a, false, 4, null);
        e = jc1.e(this.c);
        bc e3 = bc.e(bc.e(bc.e(vc.y(e2, e), Action.NAME_ATTRIBUTE, this.b, false, 4, null), "price", Double.valueOf(this.d), false, 4, null), "currency", this.e, false, 4, null);
        List<fl8> list = this.f;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (fl8 fl8Var : list) {
            k = g86.k(vc.k(fl8Var.e()), lnb.a(Action.NAME_ATTRIBUTE, fl8Var.getName()), lnb.a(ShoppingInfoEntity.FIELD_PRODUCT_ID, fl8Var.getId()), lnb.a("variant", uc.a.e(fl8Var)));
            arrayList.add(k);
        }
        return bc.e(bc.e(vc.A(vc.i(bc.e(e3, "products", arrayList, false, 4, null), kl8.i), this.g.i()), "position", Integer.valueOf(this.h), false, 4, null), "is_hero", Boolean.valueOf(this.i), false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg1)) {
            return false;
        }
        tg1 tg1Var = (tg1) obj;
        if (z65.c(this.a, tg1Var.a) && z65.c(this.b, tg1Var.b) && z65.c(this.c, tg1Var.c) && Double.compare(this.d, tg1Var.d) == 0 && z65.c(this.e, tg1Var.e) && z65.c(this.f, tg1Var.f) && this.g == tg1Var.g && this.h == tg1Var.h && this.i == tg1Var.i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + nkb.a(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + a91.a(this.i);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        tja tjaVar = this.c;
        double d = this.d;
        String str3 = this.e;
        List<fl8> list = this.f;
        ym.d dVar = this.g;
        int i = this.h;
        boolean z = this.i;
        return "OpenProductCardCombo(templateId=" + str + ", templateName=" + str2 + ", shoppingItem=" + tjaVar + ", price=" + d + ", currency=" + str3 + ", products=" + list + ", screen=" + dVar + ", positionInMenu=" + i + ", isHeroProduct=" + z + ")";
    }
}
