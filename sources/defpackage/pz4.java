package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: InAppStoryStateProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnz4;", "", "a", "(Lnz4;Lcv1;)Ljava/lang/Object;", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: pz4  reason: default package */
/* loaded from: classes4.dex */
public final class pz4 {

    /* compiled from: InAppStoryStateProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isInitialized", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.stories.InAppStoryStateProviderKt$waitUntilInitialized$2", f = "InAppStoryStateProvider.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pz4$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<Boolean, cv1<? super Boolean>, Object> {
        int a;
        /* synthetic */ boolean b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        public final Object i(boolean z, cv1<? super Boolean> cv1Var) {
            return ((a) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, cv1<? super Boolean> cv1Var) {
            return i(bool.booleanValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.a(!this.b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Object a(nz4 nz4Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object k = wz3.k(wz3.M(nz4Var.isInitialized(), new a(null)), cv1Var);
        d = c75.d();
        if (k == d) {
            return k;
        }
        return Unit.a;
    }
}
