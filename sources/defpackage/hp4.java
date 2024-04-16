package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.qd6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.dodopizza.backend.domain.menu.MenuAPI;
import ru.dodopizza.backend.domain.menu.dto.HotAndReadyItemDto;
import ru.dodopizza.backend.domain.menu.dtov5.HotAndReadyItemDtoV5;
/* compiled from: HotAndReadyService.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'¨\u0006-"}, d2 = {"Lhp4;", "Lgp4;", "", "pizzeriaId", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "g", Image.TYPE_HIGH, DateTokenConverter.CONVERTER_KEY, "", e.a, "Lbp4;", "a", "b", c.a, "Lava;", "Lava;", "stateProvider", "Lcp4;", "Lcp4;", "hotAndReadyRepository", "Lep4;", "Lep4;", "hotAndReadyRepositoryV5", "Lru/dodopizza/backend/domain/menu/MenuAPI;", "Lru/dodopizza/backend/domain/menu/MenuAPI;", "menuApi", "Lne6;", "Lne6;", "menuItemRepository", "Lpe6;", "f", "Lpe6;", "menuItemRepositoryV5", "Lk63;", "Lk63;", "domainEvents", "Lhq3;", "Lhq3;", "featureService", "Lip4;", "hotAndReadyUpdater", "<init>", "(Lava;Lcp4;Lep4;Lru/dodopizza/backend/domain/menu/MenuAPI;Lne6;Lpe6;Lip4;Lk63;Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hp4  reason: default package */
/* loaded from: classes4.dex */
public final class hp4 implements gp4 {
    private final ava a;
    private final cp4 b;
    private final ep4 c;
    private final MenuAPI d;
    private final ne6 e;
    private final pe6 f;
    private final k63 g;
    private final hq3 h;

    /* compiled from: HotAndReadyService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hp4$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(jua.c(hp4.this.a.e()) == jk7.g);
        }
    }

    /* compiled from: HotAndReadyService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hp4$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            hp4 hp4Var = hp4.this;
            String orderPizzeriaId = hp4Var.a.e().getOrderPizzeriaId();
            if (orderPizzeriaId == null) {
                orderPizzeriaId = "";
            }
            hp4Var.d(orderPizzeriaId, ((Number) mh5.c(hp4.this.a.e().getCountryCode(), 0)).intValue());
        }
    }

    public hp4(ava avaVar, cp4 cp4Var, ep4 ep4Var, MenuAPI menuAPI, ne6 ne6Var, pe6 pe6Var, ip4 ip4Var, k63 k63Var, hq3 hq3Var) {
        z65.h(avaVar, "stateProvider");
        z65.h(cp4Var, "hotAndReadyRepository");
        z65.h(ep4Var, "hotAndReadyRepositoryV5");
        z65.h(menuAPI, "menuApi");
        z65.h(ne6Var, "menuItemRepository");
        z65.h(pe6Var, "menuItemRepositoryV5");
        z65.h(ip4Var, "hotAndReadyUpdater");
        z65.h(k63Var, "domainEvents");
        z65.h(hq3Var, "featureService");
        this.a = avaVar;
        this.b = cp4Var;
        this.c = ep4Var;
        this.d = menuAPI;
        this.e = ne6Var;
        this.f = pe6Var;
        this.g = k63Var;
        this.h = hq3Var;
        ip4Var.c();
        ip4Var.a(new a());
        ip4Var.b(new b());
    }

    private final void g(String str, int i) {
        List<bp4> l;
        int w;
        List<HotAndReadyItemDto> products = this.d.getHotAndReady(str, i).getProducts();
        if (products == null) {
            l = kc1.l();
        } else {
            List<HotAndReadyItemDto> list = products;
            w = lc1.w(list, 10);
            l = new ArrayList<>(w);
            for (HotAndReadyItemDto hotAndReadyItemDto : list) {
                l.add(new bp4(hotAndReadyItemDto.getId()));
            }
        }
        List<bp4> a2 = a();
        if (!a2.containsAll(l) || a2.size() != l.size()) {
            this.b.b(l);
        }
    }

    private final void h(String str, int i) {
        List<String> l;
        int w;
        List<HotAndReadyItemDtoV5> items = this.d.getHotAndReadyV5(str, i).getItems();
        if (items == null) {
            l = kc1.l();
        } else {
            List<HotAndReadyItemDtoV5> list = items;
            w = lc1.w(list, 10);
            l = new ArrayList<>(w);
            for (HotAndReadyItemDtoV5 hotAndReadyItemDtoV5 : list) {
                l.add(hotAndReadyItemDtoV5.getProductId());
            }
        }
        List<String> a2 = this.c.a();
        if (!a2.containsAll(l) || a2.size() != l.size()) {
            this.c.b(l);
        }
    }

    @Override // defpackage.gp4
    public List<bp4> a() {
        return this.b.getAll();
    }

    @Override // defpackage.gp4
    public List<String> b() {
        return this.c.a();
    }

    @Override // defpackage.gp4
    public List<bp4> c() {
        int w;
        List<String> a2 = this.c.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f.b()) {
            if (((te6) obj).k() == se6.b) {
                arrayList.add(obj);
            }
        }
        ArrayList<te6> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            te6 te6Var = (te6) obj2;
            List<dxb> l = te6Var.l();
            if (!(l instanceof Collection) || !l.isEmpty()) {
                for (dxb dxbVar : l) {
                    if (!dxbVar.a().h().a()) {
                        break;
                    }
                }
            }
            List<dxb> l2 = te6Var.l();
            if (!(l2 instanceof Collection) || !l2.isEmpty()) {
                Iterator<T> it = l2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (a2.contains(((dxb) it.next()).a().c())) {
                            arrayList2.add(obj2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        w = lc1.w(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(w);
        for (te6 te6Var2 : arrayList2) {
            arrayList3.add(new bp4(te6Var2.e()));
        }
        return arrayList3;
    }

    @Override // defpackage.gp4
    public void d(String str, int i) {
        z65.h(str, "pizzeriaId");
        g(str, i);
        if (this.h.a(bq3.w6)) {
            h(str, i);
        }
        this.g.a(kl8.h);
    }

    @Override // defpackage.gp4
    public List<String> e() {
        int w;
        String str;
        List<bp4> all = this.b.getAll();
        w = lc1.w(all, 10);
        ArrayList<qd6> arrayList = new ArrayList(w);
        for (bp4 bp4Var : all) {
            arrayList.add(this.e.a(bp4Var.a()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (qd6 qd6Var : arrayList) {
            if (qd6Var instanceof qd6.e) {
                str = ((qd6.e) qd6Var).t().t();
            } else {
                str = null;
            }
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }
}
