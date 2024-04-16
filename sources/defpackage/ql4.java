package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.gl8;
import defpackage.m78;
import defpackage.ox1;
import defpackage.pja;
import defpackage.ym;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: HalvesProductCardInteractor.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J \u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000e0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lql4;", "", "Lox1;", "Lhl4;", "halvesInfoVO", "Lym$d;", "screen", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", "g", "Lkotlin/Pair;", "", "chosenHalvesId", "", "j", "Lah6;", "a", "Lah6;", "menuService", "Lds0;", "b", "Lds0;", "cartService", "Lsq0;", c.a, "Lsq0;", "cartItemDataFactory", "Lg78;", DateTokenConverter.CONVERTER_KEY, "Lg78;", "doughFormatter", "Le78;", e.a, "Le78;", "pizzaConceptService", "Lgc;", "f", "Lgc;", "analytics", "<init>", "(Lah6;Lds0;Lsq0;Lg78;Le78;Lgc;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ql4  reason: default package */
/* loaded from: classes4.dex */
public final class ql4 implements ox1 {
    private final ah6 a;
    private final ds0 b;
    private final sq0 c;
    private final g78 d;
    private final e78 e;
    private final gc f;

    /* compiled from: HalvesProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.halves.HalvesProductCardInteractor$addToCart$1", f = "HalvesProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ql4$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ hl4 b;
        final /* synthetic */ ql4 c;
        final /* synthetic */ ym.d d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(hl4 hl4Var, ql4 ql4Var, ym.d dVar, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.b = hl4Var;
            this.c = ql4Var;
            this.d = dVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.b, this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            tja tjaVar;
            List l;
            List l2;
            Set e;
            List o;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Map<Integer, il4> e2 = this.c.a.e(this.b.c().getId(), this.b.g().getId());
                il4 il4Var = e2.get(nf0.c(this.b.a()));
                tja tjaVar2 = null;
                if (il4Var != null) {
                    tjaVar = il4Var.b();
                } else {
                    tjaVar = null;
                }
                tja tjaVar3 = (tja) mh5.b(tjaVar, "This halves not found");
                il4 il4Var2 = e2.get(nf0.c(this.b.a()));
                if (il4Var2 != null) {
                    tjaVar2 = il4Var2.c();
                }
                tja tjaVar4 = (tja) mh5.b(tjaVar2, "This halves not found");
                String G0 = tjaVar3.G0();
                hn6 f = rn6.f(tjaVar3.h(), tjaVar4.h());
                rl8 i = tjaVar3.Y().i();
                l = kc1.l();
                List list = l;
                l2 = kc1.l();
                List list2 = l2;
                km8 m = tjaVar3.Y().m();
                e = sfa.e();
                m78 m78Var = new m78("", tjaVar3.Y().getName() + " " + tjaVar4.Y().getName(), tjaVar3.Y().f() + " " + tjaVar4.Y().f(), "", "", i, list, list2, m, "", e, fna.c(fna.d.a(), 3, null, null, 6, null), w63.c(w63.d.a(), this.b.a(), null, null, 6, null), m78.a.a);
                String G02 = tjaVar3.G0();
                o = kc1.o(tjaVar3, tjaVar4);
                pja.b bVar = new pja.b(new a42(G0, f, m78Var, null, G02, o, false, 64, null), tjaVar3, tjaVar4);
                this.c.b.a(this.c.c.a(bVar));
                this.c.f.a(new gl8.c(bVar, this.d, false, 4, null));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: HalvesProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lhl4;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.halves.HalvesProductCardInteractor$getHalvesInfo$1", f = "HalvesProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ql4$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super List<? extends hl4>>, Object> {
        int a;
        final /* synthetic */ Pair<String, String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Pair<String, String> pair, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = pair;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<hl4>> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Map<Integer, il4> e = ql4.this.a.e(this.c.c(), this.c.d());
                ql4 ql4Var = ql4.this;
                ArrayList arrayList = new ArrayList(e.size());
                for (Map.Entry<Integer, il4> entry : e.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    il4 value = entry.getValue();
                    String name = value.b().Y().getName();
                    String name2 = value.c().Y().getName();
                    arrayList.add(new hl4(name + " + " + name2, (m78) value.b().t0(), (m78) value.c().t0(), rn6.f(value.b().h(), value.c().h()), intValue, value.a().f(), ql4Var.d.b(value.d().e(), value.a().e()), ql4Var.e.a()));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ql4(ah6 ah6Var, ds0 ds0Var, sq0 sq0Var, g78 g78Var, e78 e78Var, gc gcVar) {
        z65.h(ah6Var, "menuService");
        z65.h(ds0Var, "cartService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(g78Var, "doughFormatter");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(gcVar, "analytics");
        this.a = ah6Var;
        this.b = ds0Var;
        this.c = sq0Var;
        this.d = g78Var;
        this.e = e78Var;
        this.f = gcVar;
    }

    public final wx<Unit> g(hl4 hl4Var, ym.d dVar) {
        z65.h(hl4Var, "halvesInfoVO");
        z65.h(dVar, "screen");
        return i(new a(hl4Var, this, dVar, null));
    }

    public <T> wx<T> h(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> i(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<List<hl4>> j(Pair<String, String> pair) {
        z65.h(pair, "chosenHalvesId");
        return h(new b(pair, null));
    }
}
