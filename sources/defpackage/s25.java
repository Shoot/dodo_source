package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: InitialValueFlow.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¨\u0006\u0007"}, d2 = {"", "T", "Loz3;", "Lkotlin/Function0;", "initialValue", "Lr25;", "a", "flowbinding-common_release"}, k = 2, mv = {1, 5, 1})
/* renamed from: s25  reason: default package */
/* loaded from: classes3.dex */
public final class s25 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: InitialValueFlow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"", "T", "Lpz3;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @nn2(c = "reactivecircus.flowbinding.common.InitialValueFlowKt$asInitialValueFlow$1", f = "InitialValueFlow.kt", l = {17}, m = "invokeSuspend")
    /* renamed from: s25$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends f3b implements Function2<pz3<? super T>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ Function0<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends T> function0, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = function0;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.c, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
            return ((a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
                T invoke = this.c.invoke();
                this.a = 1;
                if (((pz3) this.b).emit(invoke, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public static final <T> r25<T> a(oz3<? extends T> oz3Var, Function0<? extends T> function0) {
        z65.h(oz3Var, "<this>");
        z65.h(function0, "initialValue");
        return new r25<>(wz3.H(oz3Var, new a(function0, null)));
    }
}
