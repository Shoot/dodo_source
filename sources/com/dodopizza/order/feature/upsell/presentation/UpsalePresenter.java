package com.dodopizza.order.feature.upsell.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.atb;
import defpackage.l95;
import defpackage.lsb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: UpsalePresenter.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b>\u0010?J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J*\u0010\u0012\u001a\u00020\u00032\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\rR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\n 0*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u0012R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/dodopizza/order/feature/upsell/presentation/UpsalePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lotb;", "", "G", "E", "A", "", "Latb;", "products", "F", "", "Lkotlin/Pair;", "", "Latb$a;", "shownProducts", "Lnsb;", "upsaleExperimentInfo", "I", "position", "product", "H", "view", "B", "C", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "z", "D", "Lrsb;", "a", "Lrsb;", "upsaleInteractor", "Lhq3;", "b", "Lhq3;", "featureService", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lk63;", DateTokenConverter.CONVERTER_KEY, "Lk63;", "domainEvents", com.huawei.hms.push.e.a, "Lnsb;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "g", "previousScrollPosition", "Ll95;", Image.TYPE_HIGH, "Ll95;", "domainEventSubscribeJob", "Lltb;", "i", "Lltb;", "upsellVO", "<init>", "(Lrsb;Lhq3;Lgc;Lk63;Lnsb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class UpsalePresenter extends BasePresenter<otb> {
    private final rsb a;
    private final hq3 b;
    private final gc c;
    private final k63 d;
    private nsb e;
    private final Logger f;
    private int g;
    private l95 h;
    private ltb i;

    /* compiled from: UpsalePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.upsell.presentation.UpsalePresenter$addUpsale$1", f = "UpsalePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((a) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                UpsalePresenter.this.f.error("Failed to add upsale product to cart", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UpsalePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lltb;", "upsaleVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.upsell.presentation.UpsalePresenter$applyUpsale$1", f = "UpsalePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<ltb, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

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
        public final Object invoke(ltb ltbVar, cv1<? super Unit> cv1Var) {
            return ((b) create(ltbVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ltb ltbVar = (ltb) this.b;
                ArrayList arrayList = new ArrayList();
                UpsalePresenter.this.e = ltbVar.a();
                arrayList.addAll(ltbVar.b());
                UpsalePresenter.this.e = nsb.b(ltbVar.a(), arrayList.size(), null, 2, null);
                if (!arrayList.isEmpty()) {
                    UpsalePresenter.this.E();
                    UpsalePresenter.this.F(arrayList);
                    if (!z65.c(ltbVar, UpsalePresenter.this.i) && (!ltbVar.b().isEmpty())) {
                        Collection<atb.a> b = ltbVar.b();
                        w = lc1.w(b, 10);
                        ArrayList arrayList2 = new ArrayList(w);
                        int i = 0;
                        for (Object obj2 : b) {
                            int i2 = i + 1;
                            if (i < 0) {
                                kc1.v();
                            }
                            arrayList2.add(lnb.a(nf0.c(i), (atb.a) obj2));
                            i = i2;
                        }
                        UpsalePresenter upsalePresenter = UpsalePresenter.this;
                        upsalePresenter.I(arrayList2, upsalePresenter.e);
                    }
                } else {
                    ((otb) UpsalePresenter.this.getViewState()).e8();
                }
                UpsalePresenter.this.i = ltbVar;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UpsalePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.upsell.presentation.UpsalePresenter$applyUpsale$2", f = "UpsalePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                UpsalePresenter.this.f.error("Failed to get upsale products", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UpsalePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "domainEvent", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.upsell.presentation.UpsalePresenter$subscribeOnDomainEvents$1", f = "UpsalePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: UpsalePresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j63.values().length];
                try {
                    iArr[j63.e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((d) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (a.$EnumSwitchMapping$0[((j63) this.b).ordinal()] == 1) {
                    UpsalePresenter.this.A();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UpsalePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.upsell.presentation.UpsalePresenter$trackUpsaleProductItemsShown$1", f = "UpsalePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                UpsalePresenter.this.f.error("Failed to track upsale shown event", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ UpsalePresenter(rsb rsbVar, hq3 hq3Var, gc gcVar, k63 k63Var, nsb nsbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rsbVar, hq3Var, gcVar, k63Var, (i & 16) != 0 ? new nsb(0, null, 3, null) : nsbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        p(z77.a(y87.a(this.a.a(), new b(null)), new c(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        if (kq3.a(this.b)) {
            ((otb) getViewState()).ud();
        } else {
            ((otb) getViewState()).jg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Collection<? extends atb> collection) {
        ((otb) getViewState()).L1(collection);
    }

    private final void G() {
        l95 l95Var = this.h;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        this.h = o(wz3.F(this.d.c(), new d(null)));
    }

    private final void H(int i, atb.a aVar) {
        lsb.b.a.EnumC0428a enumC0428a;
        if (this.b.a(bq3.z5)) {
            int i2 = this.g;
            if (i > i2) {
                enumC0428a = lsb.b.a.EnumC0428a.c;
            } else if (i < i2) {
                enumC0428a = lsb.b.a.EnumC0428a.b;
            } else {
                enumC0428a = lsb.b.a.EnumC0428a.d;
            }
            if (enumC0428a != lsb.b.a.EnumC0428a.d) {
                this.c.a(new lsb.b(aVar.b(), enumC0428a, i, this.e.d()));
            }
        }
        this.g = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(List<Pair<Integer, atb.a>> list, nsb nsbVar) {
        p(z77.a(this.a.b(list, nsbVar), new e(null)));
    }

    @Override // moxy.MvpPresenter
    /* renamed from: B */
    public void attachView(otb otbVar) {
        super.attachView(otbVar);
        A();
        G();
    }

    @Override // moxy.MvpPresenter
    /* renamed from: C */
    public void detachView(otb otbVar) {
        super.detachView(otbVar);
        l95 l95Var = this.h;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        this.h = null;
    }

    public final void D(atb.a aVar, int i) {
        z65.h(aVar, "product");
        H(i, aVar);
    }

    public final void z(String str) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        ((otb) getViewState()).m2(str);
        p(z77.a(this.a.c(), new a(null)));
    }

    public UpsalePresenter(rsb rsbVar, hq3 hq3Var, gc gcVar, k63 k63Var, nsb nsbVar) {
        z65.h(rsbVar, "upsaleInteractor");
        z65.h(hq3Var, "featureService");
        z65.h(gcVar, "analytics");
        z65.h(k63Var, "domainEvents");
        z65.h(nsbVar, "upsaleExperimentInfo");
        this.a = rsbVar;
        this.b = hq3Var;
        this.c = gcVar;
        this.d = k63Var;
        this.e = nsbVar;
        this.f = LoggerFactory.getLogger("UpsalePresenter");
        this.g = -1;
    }
}
