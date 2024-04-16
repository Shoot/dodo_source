package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: BuyMoreInfoInteractor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lti0;", "Lox1;", "", "menuItemId", "Lwx;", "Lsi0;", "f", "Lgj0;", "a", "Lgj0;", "buyMoreService", "Lava;", "b", "Lava;", "stateProvider", "Luja;", c.a, "Luja;", "shoppingItemRepository", "Lah6;", DateTokenConverter.CONVERTER_KEY, "Lah6;", "menuService", "<init>", "(Lgj0;Lava;Luja;Lah6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ti0  reason: default package */
/* loaded from: classes4.dex */
public final class ti0 implements ox1 {
    private final gj0 a;
    private final ava b;
    private final uja c;
    private final ah6 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyMoreInfoInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lsi0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.BuyMoreInfoInteractor$getBuyMoreProductsVO$1", f = "BuyMoreInfoInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ti0$a */
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function1<cv1<? super si0>, Object> {
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
        public final Object invoke(cv1<? super si0> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object Y;
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Y = sc1.Y(ti0.this.d.s(this.c));
                String id = ((tja) Y).getId();
                ti0 ti0Var = ti0.this;
                ArrayList<tja> arrayList = new ArrayList();
                for (String str : ti0.this.a.a(id, ti0.this.b.e().getSelectedPizzeriaId(), jua.c(ti0.this.b.e()))) {
                    tja a = ti0Var.c.a(str);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                w = lc1.w(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(w);
                for (tja tjaVar : arrayList) {
                    arrayList2.add(new vi0(tjaVar.getId(), tjaVar.Y().getName(), tjaVar.h(), tjaVar.Y().n()));
                }
                return new si0(arrayList2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ti0(gj0 gj0Var, ava avaVar, uja ujaVar, ah6 ah6Var) {
        z65.h(gj0Var, "buyMoreService");
        z65.h(avaVar, "stateProvider");
        z65.h(ujaVar, "shoppingItemRepository");
        z65.h(ah6Var, "menuService");
        this.a = gj0Var;
        this.b = avaVar;
        this.c = ujaVar;
        this.d = ah6Var;
    }

    public <T> wx<T> e(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<si0> f(String str) {
        z65.h(str, "menuItemId");
        return e(new a(str, null));
    }
}
