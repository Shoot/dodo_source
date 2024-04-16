package androidx.lifecycle;

import androidx.lifecycle.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: PausingDispatcher.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aI\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "Landroidx/lifecycle/d;", "Lkotlin/Function2;", "Lqx1;", "Lcv1;", "", "block", "a", "(Landroidx/lifecycle/d;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "Landroidx/lifecycle/d$b;", "minState", "b", "(Landroidx/lifecycle/d;Landroidx/lifecycle/d$b;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PausingDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a<T> extends f3b implements Function2<qx1, cv1<? super T>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ d c;
        final /* synthetic */ d.b d;
        final /* synthetic */ Function2<qx1, cv1<? super T>, Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d dVar, d.b bVar, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = dVar;
            this.d = bVar;
            this.e = function2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.c, this.d, this.e, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        public final Object invoke(qx1 qx1Var, cv1<? super T> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            e eVar;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    eVar = (e) this.b;
                    try {
                        vk9.b(obj);
                    } catch (Throwable th) {
                        th = th;
                        eVar.b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                l95 l95Var = (l95) ((qx1) this.b).getCoroutineContext().c(l95.M);
                if (l95Var != null) {
                    js7 js7Var = new js7();
                    e eVar2 = new e(this.c, this.d, js7Var.c, l95Var);
                    try {
                        Function2<qx1, cv1<? super T>, Object> function2 = this.e;
                        this.b = eVar2;
                        this.a = 1;
                        obj = qh0.g(js7Var, function2, this);
                        if (obj == d) {
                            return d;
                        }
                        eVar = eVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        eVar = eVar2;
                        eVar.b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            }
            eVar.b();
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, Object obj) {
            return invoke(qx1Var, (cv1) ((cv1) obj));
        }
    }

    public static final <T> Object a(d dVar, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2, cv1<? super T> cv1Var) {
        return b(dVar, d.b.STARTED, function2, cv1Var);
    }

    public static final <T> Object b(d dVar, d.b bVar, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2, cv1<? super T> cv1Var) {
        return qh0.g(v33.c().p0(), new a(dVar, bVar, function2, null), cv1Var);
    }
}
