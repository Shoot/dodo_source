package com.dodopizza.order.feature.assistant.mood.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter2;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: AssistantMoodPresenter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u0003R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R#\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/dodopizza/order/feature/assistant/mood/presentation/AssistantMoodPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lyu;", "", "w", "p", "Lju;", "selectedMood", "v", "u", "onBackPressed", "Lf63;", "b", "Lf63;", "router", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lqu;", DateTokenConverter.CONVERTER_KEY, "Lqu;", "interactor", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", e.a, "Lrn5;", "t", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lf63;Lgc;Lqu;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantMoodPresenter extends BasePresenter2<yu> {
    private final f63 b;
    private final gc c;
    private final qu d;
    private final rn5 e;

    /* compiled from: AssistantMoodPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("AssistantMoodPresenter");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantMoodPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends j6 implements Function2<wu, cv1<? super Unit>, Object> {
        b(Object obj) {
            super(2, obj, yu.class, "setupMoods", "setupMoods(Lcom/dodopizza/order/feature/assistant/mood/presentation/AssistantMoodVO;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(wu wuVar, cv1<? super Unit> cv1Var) {
            return AssistantMoodPresenter.x((yu) this.receiver, wuVar, cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantMoodPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lwu;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.mood.presentation.AssistantMoodPresenter$subscribeToMoods$2", f = "AssistantMoodPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements y84<pz3<? super wu>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super wu> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = th;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AssistantMoodPresenter.this.t().error("Failed to setup moods", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AssistantMoodPresenter(f63 f63Var, gc gcVar, qu quVar) {
        rn5 b2;
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(quVar, "interactor");
        this.b = f63Var;
        this.c = gcVar;
        this.d = quVar;
        b2 = yn5.b(a.a);
        this.e = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger t() {
        return (Logger) this.e.getValue();
    }

    private final void w() {
        wz3.C(wz3.h(wz3.F(this.d.c(), new b(getViewState())), new c(null)), o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object x(yu yuVar, wu wuVar, cv1 cv1Var) {
        yuVar.o4(wuVar);
        return Unit.a;
    }

    public final void onBackPressed() {
        this.b.d();
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void p() {
        this.c.a(ps.a.r());
        w();
    }

    public final void u() {
        this.b.e(nv.a(this.d.b()));
    }

    public final void v(ju juVar) {
        z65.h(juVar, "selectedMood");
        this.d.d(juVar);
    }
}
