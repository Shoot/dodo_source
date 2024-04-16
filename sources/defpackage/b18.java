package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: PersonalOffersInteractor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lb18;", "La18;", "Lox1;", "Lwx;", "", "Lp67;", "a", "offerVO", "", "b", "(Lp67;Lcv1;)Ljava/lang/Object;", "Lt52;", "Lt52;", "customerService", "Ll08;", "Ll08;", "personalOfferConverter", "Lkx1;", c.a, "Lkx1;", "ioDispatcher", "<init>", "(Lt52;Ll08;Lkx1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b18  reason: default package */
/* loaded from: classes2.dex */
public final class b18 implements a18, ox1 {
    private final t52 a;
    private final l08 b;
    private final kx1 c;

    /* compiled from: PersonalOffersInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lp67;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersInteractorImpl$getPersonalOffers$1", f = "PersonalOffersInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: b18$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super List<? extends p67>>, Object> {
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
        public final Object invoke(cv1<? super List<? extends p67>> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Collection<zz7> k = b18.this.a.k();
                l08 l08Var = b18.this.b;
                w = lc1.w(k, 10);
                ArrayList arrayList = new ArrayList(w);
                for (zz7 zz7Var : k) {
                    arrayList.add(l08Var.a(zz7Var));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PersonalOffersInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersInteractorImpl$openSecretAction$2", f = "PersonalOffersInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: b18$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ p67 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p67 p67Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = p67Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                b18.this.a.s(this.c.a());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b18(t52 t52Var, l08 l08Var, kx1 kx1Var) {
        z65.h(t52Var, "customerService");
        z65.h(l08Var, "personalOfferConverter");
        z65.h(kx1Var, "ioDispatcher");
        this.a = t52Var;
        this.b = l08Var;
        this.c = kx1Var;
    }

    @Override // defpackage.a18
    public wx<Collection<p67>> a() {
        return e(new a(null));
    }

    @Override // defpackage.a18
    public Object b(p67 p67Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object g = qh0.g(this.c, new b(p67Var, null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }

    public <T> wx<T> e(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
