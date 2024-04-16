package com.dodopizza.order.feature.assistant.welcome.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: AssistantWelcomePresenter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB)\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\b\u0010\u0006\u001a\u00020\u0003H\u0014J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R#\u0010 \u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/dodopizza/order/feature/assistant/welcome/presentation/AssistantWelcomePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lyw;", "", "y", "p", "onFirstViewAttach", "w", "x", "onBackPressed", "Lnw;", "b", "Lnw;", "data", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lsw;", com.huawei.hms.push.e.a, "Lsw;", "interactor", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lrn5;", "v", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lnw;Lf63;Lgc;Lsw;)V", "g", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantWelcomePresenter extends BasePresenter2<yw> {
    public static final b g = new b(null);
    public static final int h = 8;
    private final nw b;
    private final f63 c;
    private final gc d;
    private final sw e;
    private final rn5 f;

    /* compiled from: AssistantWelcomePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lys;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter$1", f = "AssistantWelcomePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<ys, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ys ysVar, cv1<? super Unit> cv1Var) {
            return ((a) create(ysVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AssistantWelcomePresenter.this.y();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AssistantWelcomePresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/order/feature/assistant/welcome/presentation/AssistantWelcomePresenter$b;", "", "", "ERROR_CODE_WELCOME_INFO", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AssistantWelcomePresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<Logger> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("AssistantWelcomePresenter");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class d implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter$special$$inlined$resultsFlowOf$1$2", f = "AssistantWelcomePresenter.kt", l = {224}, m = "emit")
            /* renamed from: com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0166a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0166a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter.d.a.C0166a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter$d$a$a r0 = (com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter.d.a.C0166a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter$d$a$a r0 = new com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof defpackage.ys
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter.d.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public d(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantWelcomePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends j6 implements Function2<ww, cv1<? super Unit>, Object> {
        e(Object obj) {
            super(2, obj, yw.class, "setupWelcomeInfo", "setupWelcomeInfo(Lcom/dodopizza/order/feature/assistant/welcome/presentation/AssistantWelcomeVO;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ww wwVar, cv1<? super Unit> cv1Var) {
            return AssistantWelcomePresenter.z((yw) this.receiver, wwVar, cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantWelcomePresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lww;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter$subscribeToWelcomeInfo$2", f = "AssistantWelcomePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements y84<pz3<? super ww>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super ww> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AssistantWelcomePresenter.this.v().error("Failed while observing welcome info", (Throwable) this.b);
                AssistantWelcomePresenter.this.c.e(zs.a(new us(10)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AssistantWelcomePresenter(nw nwVar, f63 f63Var, gc gcVar, sw swVar) {
        rn5 b2;
        z65.h(nwVar, "data");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(swVar, "interactor");
        this.b = nwVar;
        this.c = f63Var;
        this.d = gcVar;
        this.e = swVar;
        b2 = yn5.b(c.a);
        this.f = b2;
        wz3.C(wz3.F(new d(f63Var.k(10)), new a(null)), PresenterScopeKt.getPresenterScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger v() {
        return (Logger) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        wz3.C(wz3.h(wz3.F(this.e.f(), new e(getViewState())), new f(null)), PresenterScopeKt.getPresenterScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object z(yw ywVar, ww wwVar, cv1 cv1Var) {
        ywVar.Ae(wwVar);
        return Unit.a;
    }

    public final void onBackPressed() {
        this.d.a(ps.a.h(rv.b));
        this.c.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        this.d.a(ps.a.l(this.b.C()));
        y();
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void p() {
        this.d.a(ps.a.u());
    }

    public final void w() {
        this.c.e(vu.a(this.e.c()));
    }

    public final void x() {
        this.c.e(du.a(this.e.d()));
    }
}
