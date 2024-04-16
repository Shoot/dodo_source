package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: suspend.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aH\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"A", "B", "Lkotlin/Function1;", "Lkotlin/Function2;", "Lcv1;", "", "a", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function2;", "functional"}, k = 2, mv = {1, 4, 2})
/* renamed from: e3b  reason: default package */
/* loaded from: classes.dex */
public final class e3b {

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* compiled from: suspend.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "B", "A", "a", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @nn2(c = "com.dodopizza.core.functional.SuspendKt$asSuspend$1", f = "suspend.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e3b$a */
    /* loaded from: classes.dex */
    static final class a<A, B> extends f3b implements Function2<A, cv1<? super B>, Object> {
        private /* synthetic */ Object a;
        int b;
        final /* synthetic */ Function1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, cv1 cv1Var) {
            super(2, cv1Var);
            this.c = function1;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z65.h(cv1Var, "completion");
            a aVar = new a(this.c, cv1Var);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create(obj, (cv1) obj2)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.b == 0) {
                vk9.b(obj);
                return this.c.invoke(this.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <A, B> Function2<A, cv1<? super B>, Object> a(Function1<? super A, ? extends B> function1) {
        z65.h(function1, "$this$asSuspend");
        return new a(function1, null);
    }
}
