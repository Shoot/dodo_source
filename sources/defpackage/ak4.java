package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: HalvesAnalyticsEvents.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¨\u0006\f"}, d2 = {"Lfka;", "halvesPosition", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "productName", "rawPrice", "Ldc;", "a", "Lxj4;", "leftHalf", "rightHalf", "b", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ak4  reason: default package */
/* loaded from: classes2.dex */
public final class ak4 {

    /* compiled from: HalvesAnalyticsEvents.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ak4$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ fka a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fka fkaVar, String str, String str2, String str3) {
            super(1);
            this.a = fkaVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "halvesPosition", qhb.a(this.a.name()), false, 4, null);
            bc.e(bcVar, ShoppingInfoEntity.FIELD_PRODUCT_ID, this.b, false, 4, null);
            bc.e(bcVar, "productName", this.c, false, 4, null);
            return bc.e(bcVar, "rawPrice", this.d, false, 4, null);
        }
    }

    /* compiled from: HalvesAnalyticsEvents.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ak4$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ List<Map<String, String>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends Map<String, String>> list) {
            super(1);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "products", this.a, false, 4, null);
        }
    }

    public static final dc a(fka fkaVar, String str, String str2, String str3) {
        z65.h(fkaVar, "halvesPosition");
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(str2, "productName");
        z65.h(str3, "rawPrice");
        return ec.a("halves_click", new a(fkaVar, str, str2, str3));
    }

    public static final dc b(xj4 xj4Var, xj4 xj4Var2) {
        Map k;
        Map k2;
        List o;
        z65.h(xj4Var, "leftHalf");
        z65.h(xj4Var2, "rightHalf");
        k = g86.k(lnb.a(ShoppingInfoEntity.FIELD_PRODUCT_ID, xj4Var.b()), lnb.a(Action.NAME_ATTRIBUTE, xj4Var.e()), lnb.a("price", String.valueOf(xj4Var.g().a())));
        k2 = g86.k(lnb.a(ShoppingInfoEntity.FIELD_PRODUCT_ID, xj4Var2.b()), lnb.a(Action.NAME_ATTRIBUTE, xj4Var2.e()), lnb.a("price", String.valueOf(xj4Var2.g().a())));
        o = kc1.o(k, k2);
        return ec.a("halves_union_click", new b(o));
    }
}
