package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: AppStateProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhp;", "", "a", "(Lhp;Lcv1;)Ljava/lang/Object;", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ip  reason: default package */
/* loaded from: classes.dex */
public final class ip {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppStateProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lep;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.android.applicationstate.AppStateProviderKt$waitForForegroundState$2", f = "AppStateProvider.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ip$a */
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
                if (((ep) this.b) != ep.a) {
                    z = true;
                } else {
                    z = false;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Object a(hp hpVar, cv1<? super Unit> cv1Var) {
        Object d;
        Object k = wz3.k(wz3.M(hpVar.getState(), new a(null)), cv1Var);
        d = c75.d();
        if (k == d) {
            return k;
        }
        return Unit.a;
    }
}
