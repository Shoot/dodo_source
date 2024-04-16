package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k63;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: MenuUpdateInteractor.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u0010=\u001a\u00020<\u0012\b\b\u0001\u00104\u001a\u000201\u0012\b\b\u0001\u00107\u001a\u00020\r¢\u0006\u0004\b>\u0010?J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0002J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006@"}, d2 = {"Leh6;", "", "Ljk7;", "orderType", "Lfb8;", "placeReference", "", "t", "(Ljk7;Lfb8;Lcv1;)Ljava/lang/Object;", "", "menuUpdateResults", "", "o", "Lqx1;", "Lhs2;", "n", Image.TYPE_MEDIUM, Image.TYPE_SMALL, "p", "q", "r", "Ldt5;", "a", "Ldt5;", "locality", "Lah6;", "b", "Lah6;", "menuService", "Lhq3;", com.huawei.hms.opendevice.c.a, "Lhq3;", "featureService", "Lk63;", DateTokenConverter.CONVERTER_KEY, "Lk63;", "domainEvents", "Lbia;", com.huawei.hms.push.e.a, "Lbia;", "sharedTraces", "Lava;", "f", "Lava;", "stateProvider", "Lgc;", "g", "Lgc;", "analytics", "Lkx1;", Image.TYPE_HIGH, "Lkx1;", "ioDispatcher", "i", "Lqx1;", "processScope", "Lorg/slf4j/Logger;", "j", "Lorg/slf4j/Logger;", "logger", "Lih6;", "menuUpdater", "<init>", "(Ldt5;Lah6;Lhq3;Lk63;Lbia;Lava;Lgc;Lih6;Lkx1;Lqx1;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eh6  reason: default package */
/* loaded from: classes4.dex */
public final class eh6 {
    private final dt5 a;
    private final ah6 b;
    private final hq3 c;
    private final k63 d;
    private final bia e;
    private final ava f;
    private final gc g;
    private final kx1 h;
    private final qx1 i;
    private final Logger j;

    /* compiled from: MenuUpdateInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eh6$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<Boolean> {
        public static final a a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: MenuUpdateInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eh6$b */
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
            StateEntity e = eh6.this.f.e();
            eh6.this.r(fb8.d.a(eh6.this.a, e.getSelectedPizzeriaId()), jua.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuUpdateInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.menu.service.MenuUpdateInteractor$asyncUpdateMenu$1", f = "MenuUpdateInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: eh6$c */
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<Object>, Object> {
        int a;
        final /* synthetic */ jk7 c;
        final /* synthetic */ fb8 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(jk7 jk7Var, fb8 fb8Var, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = jk7Var;
            this.d = fb8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<Object> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Integer k;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                try {
                    ah6 ah6Var = eh6.this.b;
                    jk7 jk7Var = this.c;
                    fb8 fb8Var = this.d;
                    k = k0b.k(eh6.this.a.a());
                    ah6Var.c(jk7Var, fb8Var, ((Number) mh5.c(k, nf0.c(643))).intValue());
                    return hh6.a;
                } catch (Exception e) {
                    Logger logger = eh6.this.j;
                    fb8 fb8Var2 = this.d;
                    int i = this.c.i();
                    logger.error("Failed to load menu V4 while loading two menu, placeReference: " + fb8Var2 + ", orderTypeId: " + i + ", exception: " + e);
                    return gh6.a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuUpdateInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.menu.service.MenuUpdateInteractor$asyncUpdateMenuV5$1", f = "MenuUpdateInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: eh6$d */
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<qx1, cv1<Object>, Object> {
        int a;
        final /* synthetic */ jk7 c;
        final /* synthetic */ fb8 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(jk7 jk7Var, fb8 fb8Var, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = jk7Var;
            this.d = fb8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<Object> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Integer k;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                try {
                    ah6 ah6Var = eh6.this.b;
                    jk7 jk7Var = this.c;
                    fb8 fb8Var = this.d;
                    k = k0b.k(eh6.this.a.a());
                    ah6Var.g(jk7Var, fb8Var, ((Number) mh5.c(k, nf0.c(643))).intValue());
                    eh6.this.g.a(cd6.a.a());
                    return hh6.a;
                } catch (Exception e) {
                    Logger logger = eh6.this.j;
                    fb8 fb8Var2 = this.d;
                    int i = this.c.i();
                    logger.error("Failed to load menu V5 while loading two menu, placeReference: " + fb8Var2 + ", orderTypeId: " + i + ", exception: " + e);
                    return gh6.a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuUpdateInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.menu.service.MenuUpdateInteractor$update$1", f = "MenuUpdateInteractor.kt", l = {65}, m = "invokeSuspend")
    /* renamed from: eh6$e */
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ fb8 c;
        final /* synthetic */ jk7 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(fb8 fb8Var, jk7 jk7Var, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.c = fb8Var;
            this.d = jk7Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            try {
                if (i != 0) {
                    if (i == 1) {
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    Logger logger = eh6.this.j;
                    fb8 fb8Var = this.c;
                    logger.trace("updateMenu " + fb8Var);
                    if (!eh6.this.c.a(bq3.w6)) {
                        eh6.this.s(this.d, this.c);
                    } else {
                        eh6 eh6Var = eh6.this;
                        jk7 jk7Var = this.d;
                        fb8 fb8Var2 = this.c;
                        this.a = 1;
                        if (eh6Var.t(jk7Var, fb8Var2, this) == d) {
                            return d;
                        }
                    }
                }
            } catch (Exception e) {
                eh6.this.j.warn("Failed to update menu", (Throwable) e);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuUpdateInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.menu.service.MenuUpdateInteractor$updateMenuAndMenuV5Together$2", f = "MenuUpdateInteractor.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: eh6$f */
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ jk7 d;
        final /* synthetic */ fb8 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(jk7 jk7Var, fb8 fb8Var, cv1<? super f> cv1Var) {
            super(2, cv1Var);
            this.d = jk7Var;
            this.e = fb8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(this.d, this.e, cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((f) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                qx1 qx1Var = (qx1) this.b;
                hs2[] hs2VarArr = {eh6.this.m(qx1Var, this.d, this.e), eh6.this.n(qx1Var, this.d, this.e)};
                this.a = 1;
                obj = p40.b(hs2VarArr, this);
                if (obj == d) {
                    return d;
                }
            }
            if (eh6.this.o((List) obj)) {
                eh6.this.g.a(cd6.a.b());
            }
            k63.a.a(eh6.this.d, null, 1, null);
            return Unit.a;
        }
    }

    public eh6(dt5 dt5Var, ah6 ah6Var, hq3 hq3Var, k63 k63Var, bia biaVar, ava avaVar, gc gcVar, ih6 ih6Var, kx1 kx1Var, qx1 qx1Var) {
        z65.h(dt5Var, "locality");
        z65.h(ah6Var, "menuService");
        z65.h(hq3Var, "featureService");
        z65.h(k63Var, "domainEvents");
        z65.h(biaVar, "sharedTraces");
        z65.h(avaVar, "stateProvider");
        z65.h(gcVar, "analytics");
        z65.h(ih6Var, "menuUpdater");
        z65.h(kx1Var, "ioDispatcher");
        z65.h(qx1Var, "processScope");
        this.a = dt5Var;
        this.b = ah6Var;
        this.c = hq3Var;
        this.d = k63Var;
        this.e = biaVar;
        this.f = avaVar;
        this.g = gcVar;
        this.h = kx1Var;
        this.i = qx1Var;
        Logger logger = LoggerFactory.getLogger("MenuUpdateInteractor");
        z65.g(logger, "getLogger(...)");
        this.j = logger;
        ih6Var.c();
        ih6Var.a(a.a);
        ih6Var.b(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs2<Object> m(qx1 qx1Var, jk7 jk7Var, fb8 fb8Var) {
        hs2<Object> b2;
        b2 = sh0.b(qx1Var, null, null, new c(jk7Var, fb8Var, null), 3, null);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs2<Object> n(qx1 qx1Var, jk7 jk7Var, fb8 fb8Var) {
        hs2<Object> b2;
        b2 = sh0.b(qx1Var, null, null, new d(jk7Var, fb8Var, null), 3, null);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(List<Object> list) {
        Object Z;
        Object k0;
        if (list.size() == 2) {
            Z = sc1.Z(list);
            if (z65.c(Z, hh6.a)) {
                k0 = sc1.k0(list);
                if (z65.c(k0, gh6.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void p() {
        this.e.b("menu_shown");
    }

    private final void q() {
        this.e.b("menu_shown_two_menu");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(jk7 jk7Var, fb8 fb8Var) {
        Integer k;
        p();
        ah6 ah6Var = this.b;
        k = k0b.k(this.a.a());
        ah6Var.c(jk7Var, fb8Var, ((Number) mh5.c(k, 643)).intValue());
        k63.a.a(this.d, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(jk7 jk7Var, fb8 fb8Var, cv1<? super Unit> cv1Var) {
        Object d2;
        q();
        Object e2 = rx1.e(new f(jk7Var, fb8Var, null), cv1Var);
        d2 = c75.d();
        if (e2 == d2) {
            return e2;
        }
        return Unit.a;
    }

    public final void r(fb8 fb8Var, jk7 jk7Var) {
        z65.h(fb8Var, "placeReference");
        z65.h(jk7Var, "orderType");
        sh0.d(this.i, this.h, null, new e(fb8Var, jk7Var, null), 2, null);
    }
}
