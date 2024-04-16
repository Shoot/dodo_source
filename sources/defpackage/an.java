package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.l95;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: AppBackgroundStateDetector.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lan;", "", "Lkotlin/Function0;", "", "handleDetectedState", "Lan$a;", c.a, "Lqx1;", "a", "Lqx1;", "coroutineScope", "Lhp;", "b", "Lhp;", "appStateProvider", "<init>", "(Lqx1;Lhp;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: an  reason: default package */
/* loaded from: classes.dex */
public final class an {
    private final qx1 a;
    private final hp b;

    /* compiled from: AppBackgroundStateDetector.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0006"}, d2 = {"Lan$a;", "", "Lkotlin/Function0;", "", "action", "a", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: an$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(Function0<Unit> function0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppBackgroundStateDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.android.applicationstate.AppBackgroundStateDetector$onDetected$1$appBackgroundStateDetection$1", f = "AppBackgroundStateDetector.kt", l = {26}, m = "invokeSuspend")
    /* renamed from: an$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Function0<Unit> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppBackgroundStateDetector.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lep;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.android.applicationstate.AppBackgroundStateDetector$onDetected$1$appBackgroundStateDetection$1$1", f = "AppBackgroundStateDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: an$b$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<ep, cv1<? super Boolean>, Object> {
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
            public final Object invoke(ep epVar, cv1<? super Boolean> cv1Var) {
                return ((a) create(epVar, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                boolean z;
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    if (((ep) this.b) == ep.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return nf0.a(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = function0;
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
                if (an.this.b.getState().getValue() == ep.b) {
                    return Unit.a;
                }
                kua<ep> state = an.this.b.getState();
                a aVar = new a(null);
                this.a = 1;
                if (wz3.v(state, aVar, this) == d) {
                    return d;
                }
            }
            this.c.invoke();
            return Unit.a;
        }
    }

    public an(qx1 qx1Var, hp hpVar) {
        z65.h(qx1Var, "coroutineScope");
        z65.h(hpVar, "appStateProvider");
        this.a = qx1Var;
        this.b = hpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(an anVar, Function0 function0, Function0 function02) {
        l95 d;
        z65.h(anVar, "this$0");
        z65.h(function0, "$handleDetectedState");
        z65.h(function02, "performWrappedAction");
        d = sh0.d(anVar.a, null, null, new b(function0, null), 3, null);
        try {
            function02.invoke();
        } finally {
            l95.a.a(d, null, 1, null);
        }
    }

    public final a c(final Function0<Unit> function0) {
        z65.h(function0, "handleDetectedState");
        return new a() { // from class: zm
            @Override // defpackage.an.a
            public final void a(Function0 function02) {
                an.d(an.this, function0, function02);
            }
        };
    }
}
