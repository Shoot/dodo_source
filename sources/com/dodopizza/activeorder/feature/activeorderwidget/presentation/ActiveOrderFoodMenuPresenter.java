package com.dodopizza.activeorder.feature.activeorderwidget.presentation;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.activeorder.feature.activeorderwidget.presentation.e;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.presentation.presenters.BasePresenter2;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ActiveOrderFoodMenuPresenter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u0010\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0014J\u0006\u0010\n\u001a\u00020\u0003R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/ActiveOrderFoodMenuPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/d;", "", "A", "(Lcv1;)Ljava/lang/Object;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e;", "activeOrderVO", "z", "p", "y", "Lg5;", "b", "Lg5;", "activeOrderFoodMenuInteractor", "Lhq3;", com.huawei.hms.opendevice.c.a, "Lhq3;", "featureService", "Lf63;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "router", "Lih4;", com.huawei.hms.push.e.a, "Lih4;", "googlePlayServicesHelper", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lg5;Lhq3;Lf63;Lih4;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ActiveOrderFoodMenuPresenter extends BasePresenter2<com.dodopizza.activeorder.feature.activeorderwidget.presentation.d> {
    private final g5 b;
    private final hq3 c;
    private final f63 d;
    private final ih4 e;
    private final Logger f;

    /* compiled from: ActiveOrderFoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuPresenter$onOrderPressed$1", f = "ActiveOrderFoodMenuPresenter.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function1<cv1<? super Pair<? extends Boolean, ? extends String>>, Object> {
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
        public final Object invoke(cv1<? super Pair<Boolean, String>> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
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
                g5 g5Var = ActiveOrderFoodMenuPresenter.this.b;
                this.a = 1;
                obj = g5Var.a(this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* compiled from: ActiveOrderFoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", BonusActionEntity.ORDER, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuPresenter$onOrderPressed$2", f = "ActiveOrderFoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function2<Pair<? extends Boolean, ? extends String>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ActiveOrderFoodMenuPresenter.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxj7;", "a", "()Lxj7;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function0<xj7> {
            final /* synthetic */ ej7 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ej7 ej7Var) {
                super(0);
                this.a = ej7Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final xj7 invoke() {
                return xj7.d5.a(this.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ActiveOrderFoodMenuPresenter.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljj7;", "a", "()Ljj7;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuPresenter$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0106b extends ej5 implements Function0<jj7> {
            final /* synthetic */ ej7 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0106b(ej7 ej7Var) {
                super(0);
                this.a = ej7Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final jj7 invoke() {
                return jj7.A.a(this.a);
            }
        }

        /* compiled from: FragmentScreen.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/dodopizza/activeorder/feature/activeorderwidget/presentation/ActiveOrderFoodMenuPresenter$b$c", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes.dex */
        public static final class c implements s64, k6c {
            private final String a;
            private final boolean b;
            final /* synthetic */ Function0 c;

            public c(boolean z, Function0 function0) {
                this.c = function0;
                if (Modifier.isFinal(xj7.class.getModifiers())) {
                    String name = xj7.class.getName();
                    z65.g(name, "getName(...)");
                    this.a = name;
                    this.b = z;
                    return;
                }
                throw new IllegalArgumentException(("creator`s return type is " + xj7.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [xj7, androidx.fragment.app.Fragment] */
            @Override // defpackage.s64
            public xj7 a() {
                return (Fragment) this.c.invoke();
            }

            @Override // defpackage.yw9
            public String b() {
                return this.a;
            }

            @Override // defpackage.k6c
            public boolean d() {
                return this.b;
            }
        }

        /* compiled from: FragmentScreen.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/dodopizza/activeorder/feature/activeorderwidget/presentation/ActiveOrderFoodMenuPresenter$b$d", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes.dex */
        public static final class d implements s64, k6c {
            private final String a;
            private final boolean b;
            final /* synthetic */ Function0 c;

            public d(boolean z, Function0 function0) {
                this.c = function0;
                if (Modifier.isFinal(jj7.class.getModifiers())) {
                    String name = jj7.class.getName();
                    z65.g(name, "getName(...)");
                    this.a = name;
                    this.b = z;
                    return;
                }
                throw new IllegalArgumentException(("creator`s return type is " + jj7.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [jj7, androidx.fragment.app.Fragment] */
            @Override // defpackage.s64
            public jj7 a() {
                return (Fragment) this.c.invoke();
            }

            @Override // defpackage.yw9
            public String b() {
                return this.a;
            }

            @Override // defpackage.k6c
            public boolean d() {
                return this.b;
            }
        }

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Pair<Boolean, String> pair, cv1<? super Unit> cv1Var) {
            return ((b) create(pair, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Pair pair = (Pair) this.b;
                ej7 ej7Var = new ej7((String) pair.d(), ck1.e, false, 4, null);
                if (ActiveOrderFoodMenuPresenter.this.e.a() && ((Boolean) pair.c()).booleanValue() && ActiveOrderFoodMenuPresenter.this.c.a(bq3.r6)) {
                    ActiveOrderFoodMenuPresenter.this.d.e(new c(false, new a(ej7Var)));
                } else {
                    ActiveOrderFoodMenuPresenter.this.d.e(new d(false, new C0106b(ej7Var)));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ActiveOrderFoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuPresenter$onOrderPressed$3", f = "ActiveOrderFoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ActiveOrderFoodMenuPresenter.this.f.warn("Can't get last order id", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ActiveOrderFoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuPresenter$onViewAttached$1", f = "ActiveOrderFoodMenuPresenter.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                ActiveOrderFoodMenuPresenter activeOrderFoodMenuPresenter = ActiveOrderFoodMenuPresenter.this;
                this.a = 1;
                if (activeOrderFoodMenuPresenter.A(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveOrderFoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e;", "activeOrderVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuPresenter$subscribeOnActiveOrdersDomainEvents$2", f = "ActiveOrderFoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends f3b implements Function2<com.dodopizza.activeorder.feature.activeorderwidget.presentation.e, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(com.dodopizza.activeorder.feature.activeorderwidget.presentation.e eVar, cv1<? super Unit> cv1Var) {
            return ((e) create(eVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ActiveOrderFoodMenuPresenter.this.z((com.dodopizza.activeorder.feature.activeorderwidget.presentation.e) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveOrderFoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e;", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuPresenter$subscribeOnActiveOrdersDomainEvents$3", f = "ActiveOrderFoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends f3b implements y84<pz3<? super com.dodopizza.activeorder.feature.activeorderwidget.presentation.e>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super com.dodopizza.activeorder.feature.activeorderwidget.presentation.e> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ActiveOrderFoodMenuPresenter.this.f.warn("Can't get last order", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ActiveOrderFoodMenuPresenter(g5 g5Var, hq3 hq3Var, f63 f63Var, ih4 ih4Var) {
        z65.h(g5Var, "activeOrderFoodMenuInteractor");
        z65.h(hq3Var, "featureService");
        z65.h(f63Var, "router");
        z65.h(ih4Var, "googlePlayServicesHelper");
        this.b = g5Var;
        this.c = hq3Var;
        this.d = f63Var;
        this.e = ih4Var;
        this.f = LoggerFactory.getLogger("ActiveOrderFoodMenuPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(cv1<? super Unit> cv1Var) {
        Object d2;
        Object k = wz3.k(wz3.h(wz3.F(this.b.b(), new e(null)), new f(null)), cv1Var);
        d2 = c75.d();
        if (k == d2) {
            return k;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(com.dodopizza.activeorder.feature.activeorderwidget.presentation.e eVar) {
        if (eVar instanceof e.d) {
            ((com.dodopizza.activeorder.feature.activeorderwidget.presentation.d) getViewState()).W9((e.d) eVar);
        } else if (eVar instanceof e.c) {
            ((com.dodopizza.activeorder.feature.activeorderwidget.presentation.d) getViewState()).e1((e.c) eVar);
        } else if (eVar instanceof e.b) {
            ((com.dodopizza.activeorder.feature.activeorderwidget.presentation.d) getViewState()).hc((e.b) eVar);
        }
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void p() {
        sh0.d(o(), null, null, new d(null), 3, null);
    }

    public final void y() {
        wj1.b(z77.a(y87.a(hy.a(new a(null)), new b(null)), new c(null)), PresenterScopeKt.getPresenterScope(this));
    }
}
