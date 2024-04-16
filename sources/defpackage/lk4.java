package defpackage;

import com.huawei.hms.push.e;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: HalvesConstructorInteractor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Llk4;", "Lox1;", "Lwx;", "Lxk4;", e.a, "Lxj4;", "halfPizzaModel", "Ltja;", "g", "", "f", "Lah6;", "a", "Lah6;", "menuService", "Le78;", "b", "Le78;", "pizzaConceptService", "Lqm8;", com.huawei.hms.opendevice.c.a, "Lqm8;", "tagService", "<init>", "(Lah6;Le78;Lqm8;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lk4  reason: default package */
/* loaded from: classes2.dex */
public final class lk4 implements ox1 {
    private final ah6 a;
    private final e78 b;
    private final qm8 c;

    /* compiled from: HalvesConstructorInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lxk4;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorInteractor$getHalves$1", f = "HalvesConstructorInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lk4$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super xk4>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super xk4> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Collection collection = (Collection) mh5.b(lk4.this.a.j().get(nf0.c(1)), "Halves with this dough not found");
                if (!collection.isEmpty()) {
                    gl4 f = lk4.this.a.f();
                    Collection<nk4> collection2 = collection;
                    lk4 lk4Var = lk4.this;
                    w = lc1.w(collection2, 10);
                    ArrayList arrayList = new ArrayList(w);
                    for (nk4 nk4Var : collection2) {
                        m78 m78Var = (m78) nk4Var.b().t0();
                        arrayList.add(new xj4(nk4Var.b().getId(), m78Var.u(), m78Var.m(), m78Var.l(), m78Var.q(), m78Var.getName(), nk4Var.b().h(), m78Var.s(), m78Var.d(), nk4Var.b().p(), m78Var.k(), lk4Var.c.a(yza.b(nk4Var.a()))));
                    }
                    return new xk4(f, arrayList, lk4.this.b.a());
                }
                throw new IllegalStateException("halves is empty");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: HalvesConstructorInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorInteractor$getOriginalPizzaDefaultShoppingItemId$1", f = "HalvesConstructorInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lk4$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super String>, Object> {
        int a;
        final /* synthetic */ xj4 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xj4 xj4Var, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = xj4Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Iterator<T> it = lk4.this.a.s(this.c.f()).iterator();
                while (true) {
                    str = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        m78 m78Var = (m78) ((tja) obj2).t0();
                        if (m78Var.w() && m78Var.q() == 1 && m78Var.u() == 3) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                tja tjaVar = (tja) obj2;
                if (tjaVar != null) {
                    str = tjaVar.getId();
                }
                if (str == null) {
                    return "";
                }
                return str;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: HalvesConstructorInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ltja;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorInteractor$getOriginalPizzaProduct$1", f = "HalvesConstructorInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lk4$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super tja>, Object> {
        int a;
        final /* synthetic */ xj4 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xj4 xj4Var, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = xj4Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super tja> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                xj4 xj4Var = this.c;
                Iterator<T> it = lk4.this.a.s(this.c.f()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        m78 m78Var = (m78) ((tja) obj2).t0();
                        if (m78Var.w() && m78Var.q() == xj4Var.a() && m78Var.u() == xj4Var.i()) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                return mh5.b(obj2, "can't find pizza");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public lk4(ah6 ah6Var, e78 e78Var, qm8 qm8Var) {
        z65.h(ah6Var, "menuService");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(qm8Var, "tagService");
        this.a = ah6Var;
        this.b = e78Var;
        this.c = qm8Var;
    }

    public <T> wx<T> d(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<xk4> e() {
        return d(new a(null));
    }

    public final wx<String> f(xj4 xj4Var) {
        z65.h(xj4Var, "halfPizzaModel");
        return d(new b(xj4Var, null));
    }

    public final wx<tja> g(xj4 xj4Var) {
        z65.h(xj4Var, "halfPizzaModel");
        return d(new c(xj4Var, null));
    }
}
