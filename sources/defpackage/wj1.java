package defpackage;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: common.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t¨\u0006\r"}, d2 = {"T", "Lwx;", "Lkotlin/Function2;", "Lcv1;", "", "", "consumer", "a", "(Lwx;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "Lqx1;", Action.SCOPE_ATTRIBUTE, "Ll95;", "b", "async"}, k = 2, mv = {1, 9, 0})
/* renamed from: wj1  reason: default package */
/* loaded from: classes.dex */
public final class wj1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: common.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"wj1$a", "Lvr1;", "value", "", "a", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "async"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wj1$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements vr1<T> {
        final /* synthetic */ Function2<T, cv1<? super Unit>, Object> a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super T, ? super cv1<? super Unit>, ? extends Object> function2) {
            this.a = function2;
        }

        @Override // defpackage.vr1
        public Object a(T t, cv1<? super Unit> cv1Var) {
            Object d;
            Object invoke = this.a.invoke(t, cv1Var);
            d = c75.d();
            if (invoke == d) {
                return invoke;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: common.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.async.operators.CommonKt$launchIn$1", f = "common.kt", l = {22}, m = "invokeSuspend")
    /* renamed from: wj1$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ wx<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wx<? extends T> wxVar, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.b = wxVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.b, cv1Var);
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
                wx<T> wxVar = this.b;
                vr1<Object> a = yr1.a();
                this.a = 1;
                if (wxVar.a(a, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public static final <T> Object a(wx<? extends T> wxVar, Function2<? super T, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super Unit> cv1Var) {
        Object d;
        Object a2 = wxVar.a(new a(function2), cv1Var);
        d = c75.d();
        if (a2 == d) {
            return a2;
        }
        return Unit.a;
    }

    public static final <T> l95 b(wx<? extends T> wxVar, qx1 qx1Var) {
        l95 d;
        z65.h(wxVar, "<this>");
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        d = sh0.d(qx1Var, null, null, new b(wxVar, null), 3, null);
        return d;
    }
}
