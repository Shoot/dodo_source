package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.push.e;
import defpackage.qd6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
/* compiled from: ShoppingItemRepositoryImpl.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006'"}, d2 = {"Lvja;", "Luja;", "", "Lqja;", "shoppingInfoItems", "Ltja;", com.huawei.hms.opendevice.c.a, "", "id", "a", "menuItemId", "b", "Lgk2;", "Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;", "Lgk2;", "shoppingInfoDao", "Lyl8;", "Lyl8;", "productRepository", "Lne6;", "Lne6;", "menuItemRepository", "Lmxa;", DateTokenConverter.CONVERTER_KEY, "Lmxa;", "stopRepository", "Lzf6;", e.a, "Lzf6;", "menuPersonalPriceInfoRepository", "Lkotlin/Function1;", "Lixa;", "f", "Lkotlin/jvm/functions/Function1;", "shoppingItemTransform", "g", "shoppingInfoToShoppingItem", "<init>", "(Lgk2;Lyl8;Lne6;Lmxa;Lzf6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vja  reason: default package */
/* loaded from: classes4.dex */
public final class vja implements uja {
    private final gk2<ShoppingInfoEntity> a;
    private final yl8 b;
    private final ne6 c;
    private final mxa d;
    private final zf6 e;
    private final Function1<ShoppingInfoEntity, ixa> f;
    private final Function1<qja, ixa> g;

    /* compiled from: ShoppingItemRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;", SearchIntents.EXTRA_QUERY, "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vja$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<vu8<ShoppingInfoEntity>, vu8<ShoppingInfoEntity>> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<ShoppingInfoEntity> invoke(vu8<ShoppingInfoEntity> vu8Var) {
            z65.h(vu8Var, SearchIntents.EXTRA_QUERY);
            return vu8Var.b(ShoppingInfoEntity.FIELD_EXTERNAL_ID, this.a);
        }
    }

    /* compiled from: ShoppingItemRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqja;", "shoppingInfo", "Lixa;", "a", "(Lqja;)Lixa;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vja$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<qja, ixa> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ixa invoke(qja qjaVar) {
            z65.h(qjaVar, "shoppingInfo");
            fl8 a = vja.this.b.a(qjaVar.t());
            if (a != null) {
                return new ixa(qjaVar.getId(), qjaVar.h(), a, qjaVar.v(), qjaVar.G0(), qjaVar.p());
            }
            String t = qjaVar.t();
            throw new IllegalArgumentException("Product with id " + t + " not found");
        }
    }

    /* compiled from: ShoppingItemRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;", "shoppingInfoEntity", "Lixa;", "a", "(Lcom/dodopizza/persistence/entity/menu/ShoppingInfoEntity;)Lixa;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vja$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<ShoppingInfoEntity, ixa> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ixa invoke(ShoppingInfoEntity shoppingInfoEntity) {
            l18 l18Var;
            z65.h(shoppingInfoEntity, "shoppingInfoEntity");
            qja invoke = xja.f(vja.this.d.b()).invoke(shoppingInfoEntity);
            fl8 a = vja.this.b.a(invoke.t());
            String t = invoke.t();
            fl8 fl8Var = (fl8) mh5.b(a, "Product with id " + t + " not found");
            vf6 find = vja.this.e.find(shoppingInfoEntity.getProductId());
            if (find != null) {
                l18Var = ph6.b(find);
            } else {
                l18Var = null;
            }
            String id = invoke.getId();
            hn6 h = invoke.h();
            if (l18Var == null) {
                l18Var = invoke.v();
            }
            return new ixa(id, h, fl8Var, l18Var, shoppingInfoEntity.getShoppingId(), invoke.p());
        }
    }

    public vja(gk2<ShoppingInfoEntity> gk2Var, yl8 yl8Var, ne6 ne6Var, mxa mxaVar, zf6 zf6Var) {
        z65.h(gk2Var, "shoppingInfoDao");
        z65.h(yl8Var, "productRepository");
        z65.h(ne6Var, "menuItemRepository");
        z65.h(mxaVar, "stopRepository");
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        this.a = gk2Var;
        this.b = yl8Var;
        this.c = ne6Var;
        this.d = mxaVar;
        this.e = zf6Var;
        this.f = new c();
        this.g = new b();
    }

    @Override // defpackage.uja
    public tja a(String str) {
        z65.h(str, "id");
        ShoppingInfoEntity d = this.a.d(new a(str));
        if (d != null) {
            return this.f.invoke(d);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uja
    public Collection<tja> b(String str) {
        List l;
        List e;
        List list;
        List e2;
        int w;
        List e3;
        z65.h(str, "menuItemId");
        qd6 a2 = this.c.a(str);
        if (a2 != null) {
            if (a2 instanceof qd6.c) {
                e3 = jc1.e(((qd6.c) a2).u());
                list = e3;
            } else if (a2 instanceof qd6.d) {
                list = ((qd6.d) a2).v();
            } else if (a2 instanceof qd6.e) {
                e2 = jc1.e(((qd6.e) a2).t());
                list = e2;
            } else if (a2 instanceof qd6.f) {
                list = ((qd6.f) a2).t();
            } else if (a2 instanceof qd6.b) {
                e = jc1.e(((qd6.b) a2).u());
                list = e;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (list != null) {
                Collection<qja> collection = list;
                Function1<qja, ixa> function1 = this.g;
                w = lc1.w(collection, 10);
                ArrayList arrayList = new ArrayList(w);
                for (Object obj : collection) {
                    arrayList.add(function1.invoke(obj));
                }
                return arrayList;
            }
        }
        l = kc1.l();
        return l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uja
    public Collection<tja> c(Collection<? extends qja> collection) {
        int w;
        z65.h(collection, "shoppingInfoItems");
        Collection<? extends qja> collection2 = collection;
        Function1<qja, ixa> function1 = this.g;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Object obj : collection2) {
            arrayList.add(function1.invoke(obj));
        }
        return arrayList;
    }
}
