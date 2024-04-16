package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: FlowExtensions.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR0\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lyl5;", "T", "Li1;", "Lpz3;", "collector", "", e.a, "(Lpz3;Lcv1;)Ljava/lang/Object;", "Loz3;", "a", "Loz3;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lkotlin/Function2;", "Lcv1;", "", "b", "Lkotlin/jvm/functions/Function2;", "lastValueConsumer", "<init>", "(Loz3;Lkotlin/jvm/functions/Function2;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yl5  reason: default package */
/* loaded from: classes4.dex */
public final class yl5<T> extends i1<T> {
    private final oz3<T> a;
    private final Function2<T, cv1<? super Unit>, Object> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.infrastracture.functional.LastFlow", f = "FlowExtensions.kt", l = {80, 85}, m = "collectSafely")
    /* renamed from: yl5$a */
    /* loaded from: classes4.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        final /* synthetic */ yl5<T> d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(yl5<T> yl5Var, cv1<? super a> cv1Var) {
            super(cv1Var);
            this.d = yl5Var;
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
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yl5$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements pz3 {
        final /* synthetic */ pz3<T> a;
        final /* synthetic */ ea9<T> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FlowExtensions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @nn2(c = "ru.dodopizza.app.infrastracture.functional.LastFlow$collectSafely$2", f = "FlowExtensions.kt", l = {81}, m = "emit")
        /* renamed from: yl5$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends ev1 {
            Object a;
            Object b;
            /* synthetic */ Object c;
            final /* synthetic */ b<T> d;
            int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, cv1<? super a> cv1Var) {
                super(cv1Var);
                this.d = bVar;
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return this.d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(pz3<? super T> pz3Var, ea9<T> ea9Var) {
            this.a = pz3Var;
            this.b = ea9Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        @Override // defpackage.pz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, defpackage.cv1<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof defpackage.yl5.b.a
                if (r0 == 0) goto L13
                r0 = r6
                yl5$b$a r0 = (defpackage.yl5.b.a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                yl5$b$a r0 = new yl5$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.c
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.b
                java.lang.Object r0 = r0.a
                yl5$b r0 = (defpackage.yl5.b) r0
                defpackage.vk9.b(r6)
                goto L4a
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                defpackage.vk9.b(r6)
                pz3<T> r6 = r4.a
                r0.a = r4
                r0.b = r5
                r0.e = r3
                java.lang.Object r6 = r6.emit(r5, r0)
                if (r6 != r1) goto L49
                return r1
            L49:
                r0 = r4
            L4a:
                ea9<T> r6 = r0.b
                r6.a = r5
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yl5.b.emit(java.lang.Object, cv1):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yl5(oz3<? extends T> oz3Var, Function2<? super T, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(oz3Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(function2, "lastValueConsumer");
        this.a = oz3Var;
        this.b = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    @Override // defpackage.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.pz3<? super T> r7, defpackage.cv1<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yl5.a
            if (r0 == 0) goto L13
            r0 = r8
            yl5$a r0 = (defpackage.yl5.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            yl5$a r0 = new yl5$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.vk9.b(r8)
            goto L72
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.b
            ea9 r7 = (defpackage.ea9) r7
            java.lang.Object r2 = r0.a
            yl5 r2 = (defpackage.yl5) r2
            defpackage.vk9.b(r8)
            goto L5e
        L40:
            defpackage.vk9.b(r8)
            ea9 r8 = new ea9
            r8.<init>()
            oz3<T> r2 = r6.a
            yl5$b r5 = new yl5$b
            r5.<init>(r7, r8)
            r0.a = r6
            r0.b = r8
            r0.e = r4
            java.lang.Object r7 = r2.collect(r5, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
            r7 = r8
        L5e:
            T r7 = r7.a
            if (r7 == 0) goto L72
            kotlin.jvm.functions.Function2<T, cv1<? super kotlin.Unit>, java.lang.Object> r8 = r2.b
            r0.a = r7
            r2 = 0
            r0.b = r2
            r0.e = r3
            java.lang.Object r7 = r8.invoke(r7, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl5.e(pz3, cv1):java.lang.Object");
    }
}
