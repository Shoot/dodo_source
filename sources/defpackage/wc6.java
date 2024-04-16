package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: MemoryDataSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvc6;", "", "a", "(Lvc6;Lcv1;)Ljava/lang/Object;", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: wc6  reason: default package */
/* loaded from: classes3.dex */
public final class wc6 {

    /* compiled from: MemoryDataSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lvv6;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.data.datasource.MemoryDataSourceKt$waitUntilNetworkIsAvailable$2", f = "MemoryDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wc6$a */
    /* loaded from: classes3.dex */
    static final class a extends f3b implements Function2<vv6, cv1<? super Boolean>, Object> {
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
        public final Object invoke(vv6 vv6Var, cv1<? super Boolean> cv1Var) {
            return ((a) create(vv6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((vv6) this.b) == vv6.b) {
                    z = true;
                } else {
                    z = false;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Object a(vc6 vc6Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object k = wz3.k(wz3.M(vc6Var.a(), new a(null)), cv1Var);
        d = c75.d();
        if (k == d) {
            return k;
        }
        return Unit.a;
    }
}
