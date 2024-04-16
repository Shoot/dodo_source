package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: FlowExtensions.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lbd8;", "T", "Li1;", "Lpz3;", "collector", "", e.a, "(Lpz3;Lcv1;)Ljava/lang/Object;", "Loz3;", "a", "Loz3;", "getSource", "()Loz3;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getProvider", "()Lkotlin/jvm/functions/Function1;", "provider", "<init>", "(Loz3;Lkotlin/jvm/functions/Function1;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bd8  reason: default package */
/* loaded from: classes4.dex */
public final class bd8<T> extends i1<T> {
    private final oz3<T> a;
    private final Function1<T, T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.infrastracture.functional.PlusFlow", f = "FlowExtensions.kt", l = {68, 69}, m = "collectSafely")
    /* renamed from: bd8$a */
    /* loaded from: classes4.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        final /* synthetic */ bd8<T> d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(bd8<T> bd8Var, cv1<? super a> cv1Var) {
            super(cv1Var);
            this.d = bd8Var;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.functional.PlusFlow$collectSafely$2", f = "FlowExtensions.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: bd8$b */
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<T, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ pz3<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pz3<? super T> pz3Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = pz3Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.c, cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(T t, cv1<? super Unit> cv1Var) {
            return ((b) create(t, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                this.a = 1;
                if (this.c.emit(obj2, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowExtensions.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "<anonymous parameter 0>", "value", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.functional.PlusFlow$collectSafely$3", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: bd8$c */
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements y84<T, T, cv1<? super T>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(T t, T t2, cv1<? super T> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = t2;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return this.b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bd8(oz3<? extends T> oz3Var, Function1<? super T, ? extends T> function1) {
        z65.h(oz3Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(function1, "provider");
        this.a = oz3Var;
        this.b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[RETURN] */
    @Override // defpackage.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.pz3<? super T> r7, defpackage.cv1<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bd8.a
            if (r0 == 0) goto L13
            r0 = r8
            bd8$a r0 = (defpackage.bd8.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bd8$a r0 = new bd8$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.vk9.b(r8)
            goto L75
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.b
            pz3 r7 = (defpackage.pz3) r7
            java.lang.Object r2 = r0.a
            bd8 r2 = (defpackage.bd8) r2
            defpackage.vk9.b(r8)
            goto L62
        L41:
            defpackage.vk9.b(r8)
            oz3<T> r8 = r6.a
            bd8$b r2 = new bd8$b
            r2.<init>(r7, r5)
            oz3 r8 = defpackage.wz3.F(r8, r2)
            bd8$c r2 = new bd8$c
            r2.<init>(r5)
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = defpackage.wz3.J(r8, r2, r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            r2 = r6
        L62:
            kotlin.jvm.functions.Function1<T, T> r2 = r2.b
            java.lang.Object r2 = r2.invoke(r8)
            r0.a = r8
            r0.b = r5
            r0.e = r3
            java.lang.Object r7 = r7.emit(r2, r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd8.e(pz3, cv1):java.lang.Object");
    }
}
