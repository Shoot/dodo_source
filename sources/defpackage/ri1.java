package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ox1;
import defpackage.qd6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ComboTemplateConstructorInteractor.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lri1;", "Lqi1;", "Lox1;", "", "menuItemId", "Lzi1;", Image.TYPE_HIGH, "product", "", "Lqd6$f;", "variableMenuItems", "i", "Ldj1;", "slot", "g", "menuId", "", "slotPosition", ShoppingInfoEntity.FIELD_PRODUCT_ID, "comboProduct", "", "a", "Lwx;", "Lwg1;", "b", "Lah6;", "Lah6;", "menuService", "Lc62;", "Lc62;", "customizationService", "Lmxa;", c.a, "Lmxa;", "stopRepository", "Lgp4;", DateTokenConverter.CONVERTER_KEY, "Lgp4;", "hotAndReadyService", "Lhq3;", e.a, "Lhq3;", "featureService", "<init>", "(Lah6;Lc62;Lmxa;Lgp4;Lhq3;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ri1  reason: default package */
/* loaded from: classes4.dex */
public final class ri1 implements qi1, ox1 {
    private final ah6 a;
    private final c62 b;
    private final mxa c;
    private final gp4 d;
    private final hq3 e;

    /* compiled from: ComboTemplateConstructorInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lwg1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorInteractorImpl$getPresetComboConstructor$1", f = "ComboTemplateConstructorInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ri1$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super wg1>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super wg1> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return new wg1(ri1.this.h(this.c), ri1.this.c.b(), ri1.this.d.e());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ri1(ah6 ah6Var, c62 c62Var, mxa mxaVar, gp4 gp4Var, hq3 hq3Var) {
        z65.h(ah6Var, "menuService");
        z65.h(c62Var, "customizationService");
        z65.h(mxaVar, "stopRepository");
        z65.h(gp4Var, "hotAndReadyService");
        z65.h(hq3Var, "featureService");
        this.a = ah6Var;
        this.b = c62Var;
        this.c = mxaVar;
        this.d = gp4Var;
        this.e = hq3Var;
    }

    private final dj1 g(dj1 dj1Var, List<qd6.f> list) {
        int w;
        fl8 g = dj1Var.g();
        if (g instanceof swb) {
            fl8 fl8Var = g;
            for (qd6.f fVar : list) {
                Collection<qja> t = fVar.t();
                w = lc1.w(t, 10);
                ArrayList arrayList = new ArrayList(w);
                for (qja qjaVar : t) {
                    arrayList.add(qjaVar.t());
                }
                if (arrayList.contains(fl8Var.getId())) {
                    z65.f(fl8Var, "null cannot be cast to non-null type com.dodopizza.common.product.VariableProduct");
                    fl8Var = r8.o((r28 & 1) != 0 ? r8.a : null, (r28 & 2) != 0 ? r8.b : null, (r28 & 4) != 0 ? r8.c : null, (r28 & 8) != 0 ? r8.d : null, (r28 & 16) != 0 ? r8.e : null, (r28 & 32) != 0 ? r8.f : null, (r28 & 64) != 0 ? r8.g : null, (r28 & 128) != 0 ? r8.h : null, (r28 & 256) != 0 ? r8.i : null, (r28 & 512) != 0 ? r8.j : fVar.f(), (r28 & 1024) != 0 ? r8.k : null, (r28 & 2048) != 0 ? r8.l : null, (r28 & 4096) != 0 ? ((swb) fl8Var).m : null);
                }
            }
            return dj1.b(dj1Var, null, 0, fl8Var, null, null, 27, null);
        }
        return dj1.b(dj1Var, null, 0, g, null, null, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zi1 h(String str) {
        Object Y;
        List<qd6.f> arrayList = new ArrayList<>();
        for (Object obj : this.a.r()) {
            if (obj instanceof qd6.f) {
                arrayList.add(obj);
            }
        }
        Y = sc1.Y(this.a.s(str));
        zi1 zi1Var = (zi1) ((tja) Y).t0();
        if (this.e.a(bq3.P5)) {
            return i(zi1Var, arrayList);
        }
        return zi1Var;
    }

    private final zi1 i(zi1 zi1Var, List<qd6.f> list) {
        int w;
        int w2;
        List<cj1> r = zi1Var.r();
        w = lc1.w(r, 10);
        ArrayList arrayList = new ArrayList(w);
        for (cj1 cj1Var : r) {
            List<dj1> h = cj1Var.h();
            w2 = lc1.w(h, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (dj1 dj1Var : h) {
                arrayList2.add(g(dj1Var, list));
            }
            arrayList.add(cj1.b(cj1Var, null, null, 0, null, arrayList2, 15, null));
        }
        return zi1.q(zi1Var, null, null, null, null, null, arrayList, 31, null);
    }

    @Override // defpackage.qi1
    public void a(String str, int i, String str2, zi1 zi1Var) {
        int w;
        String id;
        z65.h(str, "menuId");
        z65.h(str2, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(zi1Var, "comboProduct");
        List<dj1> u = zi1Var.u(this.b.k(str));
        w = lc1.w(u, 10);
        ArrayList arrayList = new ArrayList(w);
        int i2 = 0;
        for (Object obj : u) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kc1.v();
            }
            dj1 dj1Var = (dj1) obj;
            if (i2 == i) {
                id = str2;
            } else {
                id = dj1Var.g().getId();
            }
            arrayList.add(id);
            i2 = i3;
        }
        this.b.i(str, arrayList);
    }

    @Override // defpackage.qi1
    public wx<wg1> b(String str) {
        z65.h(str, "menuItemId");
        return f(new a(str, null));
    }

    public <T> wx<T> f(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
