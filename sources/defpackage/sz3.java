package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: FlowCoroutine.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002$\b\u0001\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aP\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000020\b\u0001\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"R", "Lkotlin/Function2;", "Lqx1;", "Lcv1;", "", "block", "a", "(Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lpz3;", "", "Loz3;", "b", "(Ly84;)Loz3;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: sz3  reason: default package */
/* loaded from: classes3.dex */
public final class sz3 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"sz3$a", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: sz3$a */
    /* loaded from: classes3.dex */
    public static final class a<R> implements oz3<R> {
        final /* synthetic */ y84 a;

        public a(y84 y84Var) {
            this.a = y84Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super R> pz3Var, cv1<? super Unit> cv1Var) {
            Object d;
            Object a = sz3.a(new b(this.a, pz3Var, null), cv1Var);
            d = c75.d();
            if (a == d) {
                return a;
            }
            return Unit.a;
        }
    }

    /* compiled from: FlowCoroutine.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: sz3$b */
    /* loaded from: classes3.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ y84<qx1, pz3<? super R>, cv1<? super Unit>, Object> c;
        final /* synthetic */ pz3<R> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(y84<? super qx1, ? super pz3<? super R>, ? super cv1<? super Unit>, ? extends Object> y84Var, pz3<? super R> pz3Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = y84Var;
            this.d = pz3Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.c, this.d, cv1Var);
            bVar.b = obj;
            return bVar;
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
                y84<qx1, pz3<? super R>, cv1<? super Unit>, Object> y84Var = this.c;
                Object obj2 = this.d;
                this.a = 1;
                if (y84Var.invoke((qx1) this.b, obj2, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public static final <R> Object a(Function2<? super qx1, ? super cv1<? super R>, ? extends Object> function2, cv1<? super R> cv1Var) {
        Object d;
        rz3 rz3Var = new rz3(cv1Var.getContext(), cv1Var);
        Object d2 = kqb.d(rz3Var, rz3Var, function2);
        d = c75.d();
        if (d2 == d) {
            io2.c(cv1Var);
        }
        return d2;
    }

    public static final <R> oz3<R> b(y84<? super qx1, ? super pz3<? super R>, ? super cv1<? super Unit>, ? extends Object> y84Var) {
        return new a(y84Var);
    }
}
