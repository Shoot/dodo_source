package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.pja;
import defpackage.ym;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComboAnalytics.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-JR\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u00022\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0016\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J:\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u00022\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J:\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u00022\u0016\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\t\u0010\u0016\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0017\u0010!\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\u0012\u0010\"R'\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%R'\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%¨\u0006."}, d2 = {"Lrg1;", "Ldc;", "", "", "Lejb;", "toppings", "Lul8;", "removedIngredients", "", "index", "", "", "", c.a, "b", DateTokenConverter.CONVERTER_KEY, "Lbc;", "", "isCustomized", e.a, "Lqc;", "a", "toString", "hashCode", "other", "equals", "Lpja$a;", "Lpja$a;", "item", "Lym$d;", "Lym$d;", "screen", "Z", "isHero", "()Z", "Ljava/util/List;", "getToppings", "()Ljava/util/List;", "f", "getRemovedIngredients", "Ldj1;", "g", "getProducts", "products", "<init>", "(Lpja$a;Lym$d;ZZLjava/util/List;Ljava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rg1  reason: default package */
/* loaded from: classes4.dex */
public final class rg1 implements dc {
    private final pja.a a;
    private final ym.d b;
    private final boolean c;
    private final boolean d;
    private final List<Collection<ejb>> e;
    private final List<Collection<ul8>> f;
    private final List<dj1> g;

    /* JADX WARN: Multi-variable type inference failed */
    public rg1(pja.a aVar, ym.d dVar, boolean z, boolean z2, List<? extends Collection<ejb>> list, List<? extends Collection<ul8>> list2) {
        z65.h(aVar, "item");
        z65.h(dVar, "screen");
        this.a = aVar;
        this.b = dVar;
        this.c = z;
        this.d = z2;
        this.e = list;
        this.f = list2;
        this.g = ((zi1) aVar.a().t0()).s(aVar.c());
    }

    private final List<Map<String, Object>> b(List<? extends Collection<ejb>> list, int i) {
        List l;
        List list2;
        int w;
        Map k;
        if (list == null || (list2 = list.get(i)) == null) {
            l = kc1.l();
            list2 = l;
        }
        Collection<ejb> collection = list2;
        w = lc1.w(collection, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ejb ejbVar : collection) {
            k = g86.k(lnb.a("toppingId", ejbVar.d()), lnb.a(Action.NAME_ATTRIBUTE, ejbVar.getName()), lnb.a("price", Double.valueOf(ejbVar.h().a())), lnb.a("quantity", 1), lnb.a(MessageAttributes.TYPE, "added"));
            arrayList.add(k);
        }
        return arrayList;
    }

    private final List<Map<String, Object>> c(List<? extends Collection<ejb>> list, List<? extends Collection<ul8>> list2, int i) {
        List<Map<String, Object>> I0;
        I0 = sc1.I0(b(list, i));
        I0.addAll(d(list2, i));
        return I0;
    }

    private final List<Map<String, Object>> d(List<? extends Collection<ul8>> list, int i) {
        List l;
        List list2;
        int w;
        Map k;
        if (list == null || (list2 = list.get(i)) == null) {
            l = kc1.l();
            list2 = l;
        }
        Collection<ul8> collection = list2;
        w = lc1.w(collection, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ul8 ul8Var : collection) {
            k = g86.k(lnb.a("toppingId", ul8Var.getId()), lnb.a(Action.NAME_ATTRIBUTE, ul8Var.getName()), lnb.a("price", 0), lnb.a("quantity", 1), lnb.a(MessageAttributes.TYPE, "deleted"));
            arrayList.add(k);
        }
        return arrayList;
    }

    private final bc e(bc bcVar, boolean z) {
        if (z) {
            return bc.e(bcVar, MessageAttributes.TYPE, "customization", false, 4, null);
        }
        return bcVar;
    }

    @Override // defpackage.dc
    public qc a() {
        int w;
        Map k;
        od odVar = new od(this.a.a().Y().getName(), this.a.a().Y().getId(), Double.valueOf(this.a.h().a()), this.a.h().c(), vc.f(this.a.a().Y().e()), null, null, 96, null);
        bc a = pd.a(new bc("add_to_cart"), odVar);
        double d = 0.0d;
        for (dj1 dj1Var : this.g) {
            d += dj1Var.e().a();
        }
        bc e = bc.e(a, "rawPrice", Double.valueOf(d), false, 4, null);
        List<dj1> list = this.g;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kc1.v();
            }
            dj1 dj1Var2 = (dj1) obj;
            k = g86.k(lnb.a("productName", dj1Var2.g().getName()), lnb.a(ShoppingInfoEntity.FIELD_PRODUCT_ID, dj1Var2.g().getId()), vc.k(dj1Var2.g().e()), lnb.a("variant", uc.a.e(dj1Var2.g())), lnb.a("rawPrice", Double.valueOf(dj1Var2.e().a())), lnb.a("toppings", c(this.e, this.f, i)));
            arrayList.add(k);
            i = i2;
        }
        return nv3.c(e(bc.e(vc.A(bc.e(e, "products", arrayList, false, 4, null), lx9.a(this.b).getValue()), "is_hero", Boolean.valueOf(this.c), false, 4, null), this.d), odVar).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg1)) {
            return false;
        }
        rg1 rg1Var = (rg1) obj;
        if (z65.c(this.a, rg1Var.a) && this.b == rg1Var.b && this.c == rg1Var.c && this.d == rg1Var.d && z65.c(this.e, rg1Var.e) && z65.c(this.f, rg1Var.f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + a91.a(this.d)) * 31;
        List<Collection<ejb>> list = this.e;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        List<Collection<ul8>> list2 = this.f;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        pja.a aVar = this.a;
        ym.d dVar = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        List<Collection<ejb>> list = this.e;
        List<Collection<ul8>> list2 = this.f;
        return "AddComboTemplateToCart(item=" + aVar + ", screen=" + dVar + ", isHero=" + z + ", isCustomized=" + z2 + ", toppings=" + list + ", removedIngredients=" + list2 + ")";
    }

    public /* synthetic */ rg1(pja.a aVar, ym.d dVar, boolean z, boolean z2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, dVar, z, z2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2);
    }
}
