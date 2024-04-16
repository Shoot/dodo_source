package defpackage;

import defpackage.no6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActualAndroid.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lwx9;", "Lno6;", "R", "Lkotlin/Function1;", "", "onFrame", "S", "(Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wx9  reason: default package */
/* loaded from: classes.dex */
public final class wx9 implements no6 {
    public static final wx9 a = new wx9();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ActualAndroid.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lqx1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: wx9$a */
    /* loaded from: classes.dex */
    static final class a<R> extends f3b implements Function2<qx1, cv1<? super R>, Object> {
        int a;
        final /* synthetic */ Function1<Long, R> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Long, ? extends R> function1, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.b = function1;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.b, cv1Var);
        }

        public final Object invoke(qx1 qx1Var, cv1<? super R> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                this.a = 1;
                if (xt2.a(16L, this) == d) {
                    return d;
                }
            }
            return this.b.invoke(nf0.d(System.nanoTime()));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, Object obj) {
            return invoke(qx1Var, (cv1) ((cv1) obj));
        }
    }

    private wx9() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return no6.a.d(this, coroutineContext);
    }

    @Override // defpackage.no6
    public <R> Object S(Function1<? super Long, ? extends R> function1, cv1<? super R> cv1Var) {
        return qh0.g(v33.c(), new a(function1, null), cv1Var);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext T(CoroutineContext.b<?> bVar) {
        return no6.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E c(CoroutineContext.b<E> bVar) {
        return (E) no6.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.b getKey() {
        return mo6.a(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R m0(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) no6.a.a(this, r, function2);
    }
}
