package defpackage;

import androidx.lifecycle.d;
import androidx.lifecycle.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\b\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lip5;", "Lqx1;", "Lkotlin/Function2;", "Lcv1;", "", "", "block", "Ll95;", "b", "(Lkotlin/jvm/functions/Function2;)Ll95;", "Landroidx/lifecycle/d;", "a", "()Landroidx/lifecycle/d;", "lifecycle", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* renamed from: ip5  reason: default package */
/* loaded from: classes.dex */
public abstract class ip5 implements qx1 {

    /* compiled from: Lifecycle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", l = {356}, m = "invokeSuspend")
    /* renamed from: ip5$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Function2<qx1, cv1<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super qx1, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = function2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
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
                d a = ip5.this.a();
                Function2<qx1, cv1<? super Unit>, Object> function2 = this.c;
                this.a = 1;
                if (k.a(a, function2, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public abstract d a();

    public final l95 b(Function2<? super qx1, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(function2, "block");
        return qh0.d(this, null, null, new a(function2, null), 3, null);
    }
}
