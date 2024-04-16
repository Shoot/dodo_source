package com.dodopizza.controlling.feature.couriertipscard.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CourierTipsCardPresenter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/dodopizza/controlling/feature/couriertipscard/presentation/CourierTipsCardPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Loz1;", "Lsz1;", "tipsOptions", "", "v", "view", "u", "Lcom/dodopizza/controlling/feature/couriertipscard/presentation/a;", "tips", "", "isSelected", "w", "Lez1;", "a", "Lez1;", "data", "Lgc;", "b", "Lgc;", "analytics", "Liz1;", com.huawei.hms.opendevice.c.a, "Liz1;", "interactor", "Lfz1;", DateTokenConverter.CONVERTER_KEY, "Lfz1;", "delegate", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", e.a, "Lorg/slf4j/Logger;", "logger", "f", "Lcom/dodopizza/controlling/feature/couriertipscard/presentation/a;", "selectedTips", "<init>", "(Lez1;Lgc;Liz1;Lfz1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CourierTipsCardPresenter extends BasePresenter<oz1> {
    private final ez1 a;
    private final gc b;
    private final iz1 c;
    private final fz1 d;
    private final Logger e;
    private com.dodopizza.controlling.feature.couriertipscard.presentation.a f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CourierTipsCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lsz1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.couriertipscard.presentation.CourierTipsCardPresenter$attachView$1", f = "CourierTipsCardPresenter.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function1<cv1<? super sz1>, Object> {
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
        public final Object invoke(cv1<? super sz1> cv1Var) {
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
                iz1 iz1Var = CourierTipsCardPresenter.this.c;
                String b = CourierTipsCardPresenter.this.a.b();
                this.a = 1;
                obj = iz1Var.c(b, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CourierTipsCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lsz1;", "tipsOptions", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.couriertipscard.presentation.CourierTipsCardPresenter$attachView$2", f = "CourierTipsCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<sz1, cv1<? super Unit>, Object> {
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
        public final Object invoke(sz1 sz1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(sz1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CourierTipsCardPresenter.this.v((sz1) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CourierTipsCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.couriertipscard.presentation.CourierTipsCardPresenter$attachView$3", f = "CourierTipsCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
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
                CourierTipsCardPresenter.this.e.warn("Failed to load courier tips options", (Throwable) this.b);
                CourierTipsCardPresenter.this.v(sz1.f.a());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public CourierTipsCardPresenter(ez1 ez1Var, gc gcVar, iz1 iz1Var, fz1 fz1Var) {
        z65.h(ez1Var, "data");
        z65.h(gcVar, "analytics");
        z65.h(iz1Var, "interactor");
        z65.h(fz1Var, "delegate");
        this.a = ez1Var;
        this.b = gcVar;
        this.c = iz1Var;
        this.d = fz1Var;
        this.e = LoggerFactory.getLogger("CourierTipsCardPresenter");
        this.f = com.dodopizza.controlling.feature.couriertipscard.presentation.a.d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(sz1 sz1Var) {
        int w;
        if (sz1Var.c()) {
            this.d.i(true);
            this.b.a(cz1.a.b(this.a.b(), this.a.a()));
            List<v1b> b2 = sz1Var.b();
            w = lc1.w(b2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (v1b v1bVar : b2) {
                arrayList.add(new com.dodopizza.controlling.feature.couriertipscard.presentation.a(v1bVar.a(), v1bVar.b(), z65.c(v1bVar.b(), this.f.c())));
            }
            ((oz1) getViewState()).Na(arrayList);
            ((oz1) getViewState()).Yc();
            return;
        }
        this.d.i(false);
        ((oz1) getViewState()).b2();
    }

    @Override // moxy.MvpPresenter
    /* renamed from: u */
    public void attachView(oz1 oz1Var) {
        super.attachView(oz1Var);
        p(z77.a(y87.a(hy.a(new a(null)), new b(null)), new c(null)));
    }

    public final void w(com.dodopizza.controlling.feature.couriertipscard.presentation.a aVar, boolean z) {
        z65.h(aVar, "tips");
        if (z) {
            this.b.a(cz1.a.a(this.a.b(), aVar.b(), this.a.a()));
            this.f = aVar;
            this.d.l(new v1b(aVar.b(), aVar.c()));
            return;
        }
        this.b.a(cz1.a.a(this.a.b(), 0, this.a.a()));
        this.f = com.dodopizza.controlling.feature.couriertipscard.presentation.a.d.a();
        this.d.l(null);
    }
}
