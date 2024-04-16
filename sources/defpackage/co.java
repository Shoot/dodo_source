package defpackage;

import defpackage.ao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: AppInitializationStateProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbo;", "", "a", "", "b", "(Lbo;Lcv1;)Ljava/lang/Object;", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: co  reason: default package */
/* loaded from: classes4.dex */
public final class co {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInitializationStateProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lao;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.application.AppInitializationStateProviderKt$waitUntilAppIsInitialized$2", f = "AppInitializationStateProvider.kt", l = {}, m = "invokeSuspend")
    /* renamed from: co$a */
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function2<ao, cv1<? super Boolean>, Object> {
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
        public final Object invoke(ao aoVar, cv1<? super Boolean> cv1Var) {
            return ((a) create(aoVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.a(!(((ao) this.b) instanceof ao.c));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final boolean a(bo boVar) {
        z65.h(boVar, "<this>");
        return boVar.getState().getValue() instanceof ao.c;
    }

    public static final Object b(bo boVar, cv1<? super Unit> cv1Var) {
        Object d;
        Object k = wz3.k(wz3.M(boVar.getState(), new a(null)), cv1Var);
        d = c75.d();
        if (k == d) {
            return k;
        }
        return Unit.a;
    }
}
