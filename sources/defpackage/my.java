package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: performOn.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lmy;", "T", "Lwx;", "Lvr1;", "consumer", "", "a", "(Lvr1;Lcv1;)Ljava/lang/Object;", "Lwx;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lwx;Lkotlin/coroutines/CoroutineContext;)V", "async"}, k = 1, mv = {1, 9, 0})
/* renamed from: my  reason: default package */
/* loaded from: classes.dex */
public final class my<T> implements wx<T> {
    private final wx<T> a;
    private final CoroutineContext b;

    /* compiled from: performOn.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.async.operators.AsyncWithCoroutineContext$consume$2", f = "performOn.kt", l = {25}, m = "invokeSuspend")
    /* renamed from: my$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ my<T> b;
        final /* synthetic */ CoroutineContext c;
        final /* synthetic */ vr1<T> d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: performOn.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "value", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.async.operators.AsyncWithCoroutineContext$consume$2$1", f = "performOn.kt", l = {26}, m = "invokeSuspend")
        /* renamed from: my$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0446a extends f3b implements Function2<T, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ CoroutineContext c;
            final /* synthetic */ vr1<T> d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: performOn.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            @nn2(c = "com.dodopizza.async.operators.AsyncWithCoroutineContext$consume$2$1$1", f = "performOn.kt", l = {27}, m = "invokeSuspend")
            /* renamed from: my$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0447a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ vr1<T> b;
                final /* synthetic */ T c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0447a(vr1<? super T> vr1Var, T t, cv1<? super C0447a> cv1Var) {
                    super(2, cv1Var);
                    this.b = vr1Var;
                    this.c = t;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new C0447a(this.b, this.c, cv1Var);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((C0447a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                        vr1<T> vr1Var = this.b;
                        T t = this.c;
                        this.a = 1;
                        if (vr1Var.a(t, this) == d) {
                            return d;
                        }
                    }
                    return Unit.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return invoke2(qx1Var, cv1Var);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0446a(CoroutineContext coroutineContext, vr1<? super T> vr1Var, cv1<? super C0446a> cv1Var) {
                super(2, cv1Var);
                this.c = coroutineContext;
                this.d = vr1Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0446a c0446a = new C0446a(this.c, this.d, cv1Var);
                c0446a.b = obj;
                return c0446a;
            }

            public final Object i(T t, cv1<? super Unit> cv1Var) {
                return ((C0446a) create(t, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, cv1<? super Unit> cv1Var) {
                return i(obj, cv1Var);
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
                    Object obj2 = this.b;
                    CoroutineContext coroutineContext = this.c;
                    C0447a c0447a = new C0447a(this.d, obj2, null);
                    this.a = 1;
                    if (qh0.g(coroutineContext, c0447a, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(my<T> myVar, CoroutineContext coroutineContext, vr1<? super T> vr1Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.b = myVar;
            this.c = coroutineContext;
            this.d = vr1Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.b, this.c, this.d, cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
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
                wx wxVar = ((my) this.b).a;
                C0446a c0446a = new C0446a(this.c, this.d, null);
                this.a = 1;
                if (wj1.a(wxVar, c0446a, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return invoke2(qx1Var, cv1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public my(wx<? extends T> wxVar, CoroutineContext coroutineContext) {
        z65.h(wxVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(coroutineContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = wxVar;
        this.b = coroutineContext;
    }

    @Override // defpackage.wx
    public Object a(vr1<? super T> vr1Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object g = qh0.g(this.b, new a(this, cv1Var.getContext(), vr1Var, null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }
}
