package androidx.lifecycle;

import androidx.lifecycle.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.l95;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: RepeatOnLifecycle.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lop5;", "<anonymous parameter 0>", "Landroidx/lifecycle/d$a;", "event", "", DateTokenConverter.CONVERTER_KEY, "(Lop5;Landroidx/lifecycle/d$a;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements g {
    final /* synthetic */ d.a a;
    final /* synthetic */ ea9<l95> b;
    final /* synthetic */ qx1 c;
    final /* synthetic */ d.a d;
    final /* synthetic */ fn0<Unit> e;
    final /* synthetic */ jr6 f;
    final /* synthetic */ Function2<qx1, cv1<? super Unit>, Object> g;

    /* compiled from: RepeatOnLifecycle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        int c;
        final /* synthetic */ jr6 d;
        final /* synthetic */ Function2<qx1, cv1<? super Unit>, Object> e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RepeatOnLifecycle.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0036a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ Function2<qx1, cv1<? super Unit>, Object> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0036a(Function2<? super qx1, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super C0036a> cv1Var) {
                super(2, cv1Var);
                this.c = function2;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0036a c0036a = new C0036a(this.c, cv1Var);
                c0036a.b = obj;
                return c0036a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((C0036a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    Function2<qx1, cv1<? super Unit>, Object> function2 = this.c;
                    this.a = 1;
                    if (function2.invoke((qx1) this.b, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(jr6 jr6Var, Function2<? super qx1, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.d = jr6Var;
            this.e = function2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.d, this.e, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            jr6 jr6Var;
            Function2<qx1, cv1<? super Unit>, Object> function2;
            jr6 jr6Var2;
            Throwable th;
            d = c75.d();
            int i = this.c;
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            jr6Var2 = (jr6) this.a;
                            try {
                                vk9.b(obj);
                                Unit unit = Unit.a;
                                jr6Var2.b(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                jr6Var2.b(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function2 = (Function2) this.b;
                    vk9.b(obj);
                    jr6Var = (jr6) this.a;
                } else {
                    vk9.b(obj);
                    jr6Var = this.d;
                    function2 = this.e;
                    this.a = jr6Var;
                    this.b = function2;
                    this.c = 1;
                    if (jr6Var.c(null, this) == d) {
                        return d;
                    }
                }
                C0036a c0036a = new C0036a(function2, null);
                this.a = jr6Var;
                this.b = null;
                this.c = 2;
                if (rx1.e(c0036a, this) == d) {
                    return d;
                }
                jr6Var2 = jr6Var;
                Unit unit2 = Unit.a;
                jr6Var2.b(null);
                return Unit.a;
            } catch (Throwable th3) {
                jr6Var2 = jr6Var;
                th = th3;
                jr6Var2.b(null);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [T, l95] */
    @Override // androidx.lifecycle.g
    public final void d(op5 op5Var, d.a aVar) {
        ?? d;
        z65.h(op5Var, "<anonymous parameter 0>");
        z65.h(aVar, "event");
        if (aVar == this.a) {
            ea9<l95> ea9Var = this.b;
            d = sh0.d(this.c, null, null, new a(this.f, this.g, null), 3, null);
            ea9Var.a = d;
            return;
        }
        if (aVar == this.d) {
            l95 l95Var = this.b.a;
            if (l95Var != null) {
                l95.a.a(l95Var, null, 1, null);
            }
            this.b.a = null;
        }
        if (aVar == d.a.ON_DESTROY) {
            fn0<Unit> fn0Var = this.e;
            sk9.a aVar2 = sk9.b;
            fn0Var.resumeWith(sk9.b(Unit.a));
        }
    }
}
