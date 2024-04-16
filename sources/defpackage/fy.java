package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: onError.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR0\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lfy;", "T", "Lwx;", "Lvr1;", "consumer", "", "a", "(Lvr1;Lcv1;)Ljava/lang/Object;", "Lwx;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lkotlin/Function2;", "", "Lcv1;", "", "b", "Lkotlin/jvm/functions/Function2;", "errorConsumer", "<init>", "(Lwx;Lkotlin/jvm/functions/Function2;)V", "async"}, k = 1, mv = {1, 9, 0})
/* renamed from: fy  reason: default package */
/* loaded from: classes.dex */
public final class fy<T> implements wx<T> {
    private final wx<T> a;
    private final Function2<Throwable, cv1<? super Unit>, Object> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: onError.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.async.operators.AsyncErrorConsumer", f = "onError.kt", l = {18, 32}, m = "consume")
    /* renamed from: fy$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        final /* synthetic */ fy<T> d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fy<T> fyVar, cv1<? super a> cv1Var) {
            super(cv1Var);
            this.d = fyVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: onError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "value", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.async.operators.AsyncErrorConsumer$consume$2", f = "onError.kt", l = {20}, m = "invokeSuspend")
    /* renamed from: fy$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<T, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ vr1<T> c;
        final /* synthetic */ ea9<Throwable> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(vr1<? super T> vr1Var, ea9<Throwable> ea9Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = vr1Var;
            this.d = ea9Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.c, this.d, cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(T t, cv1<? super Unit> cv1Var) {
            return ((b) create(t, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable, T] */
        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            try {
                if (i != 0) {
                    if (i == 1) {
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    Object obj2 = this.b;
                    this.a = 1;
                    if (this.c.a(obj2, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            } catch (Throwable r4) {
                r4 = (T) th;
                this.d.a = r4;
                throw r4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fy(wx<? extends T> wxVar, Function2<? super Throwable, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(wxVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(function2, "errorConsumer");
        this.a = wxVar;
        this.b = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    @Override // defpackage.wx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.vr1<? super T> r9, defpackage.cv1<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.fy.a
            if (r0 == 0) goto L13
            r0 = r10
            fy$a r0 = (defpackage.fy.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            fy$a r0 = new fy$a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.vk9.b(r10)
            goto L82
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.b
            ea9 r9 = (defpackage.ea9) r9
            java.lang.Object r2 = r0.a
            fy r2 = (defpackage.fy) r2
            defpackage.vk9.b(r10)     // Catch: java.lang.Throwable -> L41
            goto L82
        L41:
            r10 = move-exception
            goto L64
        L43:
            defpackage.vk9.b(r10)
            ea9 r10 = new ea9
            r10.<init>()
            wx<T> r2 = r8.a     // Catch: java.lang.Throwable -> L5f
            fy$b r6 = new fy$b     // Catch: java.lang.Throwable -> L5f
            r6.<init>(r9, r10, r5)     // Catch: java.lang.Throwable -> L5f
            r0.a = r8     // Catch: java.lang.Throwable -> L5f
            r0.b = r10     // Catch: java.lang.Throwable -> L5f
            r0.e = r4     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r9 = defpackage.wj1.a(r2, r6, r0)     // Catch: java.lang.Throwable -> L5f
            if (r9 != r1) goto L82
            return r1
        L5f:
            r9 = move-exception
            r2 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L64:
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            defpackage.q95.k(r4)
            T r9 = r9.a
            boolean r9 = defpackage.z65.c(r10, r9)
            if (r9 != 0) goto L85
            kotlin.jvm.functions.Function2<java.lang.Throwable, cv1<? super kotlin.Unit>, java.lang.Object> r9 = r2.b
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r9 = r9.invoke(r10, r0)
            if (r9 != r1) goto L82
            return r1
        L82:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L85:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy.a(vr1, cv1):java.lang.Object");
    }
}
