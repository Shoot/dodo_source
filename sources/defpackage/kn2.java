package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.l95;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: debounce.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a:\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\b"}, d2 = {"T", "Lqx1;", "", "waitMs", "Lkotlin/Function1;", "", "destinationFunction", "a", "async"}, k = 2, mv = {1, 9, 0})
/* renamed from: kn2  reason: default package */
/* loaded from: classes.dex */
public final class kn2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: debounce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", RemoteMessageConst.MessageBody.PARAM, "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kn2$a */
    /* loaded from: classes.dex */
    public static final class a<T> extends ej5 implements Function1<T, Unit> {
        final /* synthetic */ ea9<l95> a;
        final /* synthetic */ qx1 b;
        final /* synthetic */ long c;
        final /* synthetic */ Function1<T, Unit> d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: debounce.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.async.operators.DebounceKt$debounce$1$1", f = "debounce.kt", l = {16}, m = "invokeSuspend")
        /* renamed from: kn2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0410a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ long b;
            final /* synthetic */ Function1<T, Unit> c;
            final /* synthetic */ T d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0410a(long j, Function1<? super T, Unit> function1, T t, cv1<? super C0410a> cv1Var) {
                super(2, cv1Var);
                this.b = j;
                this.c = function1;
                this.d = t;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new C0410a(this.b, this.c, this.d, cv1Var);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((C0410a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    long j = this.b;
                    this.a = 1;
                    if (xt2.a(j, this) == d) {
                        return d;
                    }
                }
                this.c.invoke(this.d);
                return Unit.a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return invoke2(qx1Var, cv1Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ea9<l95> ea9Var, qx1 qx1Var, long j, Function1<? super T, Unit> function1) {
            super(1);
            this.a = ea9Var;
            this.b = qx1Var;
            this.c = j;
            this.d = function1;
        }

        public final void a(T t) {
            l95 d;
            l95 l95Var = this.a.a;
            if (l95Var != null) {
                l95.a.a(l95Var, null, 1, null);
            }
            ea9<l95> ea9Var = this.a;
            d = sh0.d(this.b, null, null, new C0410a(this.c, this.d, t, null), 3, null);
            ea9Var.a = (T) d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    public static final <T> Function1<T, Unit> a(qx1 qx1Var, long j, Function1<? super T, Unit> function1) {
        z65.h(qx1Var, "<this>");
        z65.h(function1, "destinationFunction");
        return new a(new ea9(), qx1Var, j, function1);
    }

    public static /* synthetic */ Function1 b(qx1 qx1Var, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        return a(qx1Var, j, function1);
    }
}
