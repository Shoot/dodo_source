package defpackage;

import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: PermissionFlow.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0002J+\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lly7;", "Lky7;", "", "", "permissions", "Loz3;", "Ldy7;", "f", "([Ljava/lang/String;)Loz3;", "permission", "g", "", "Lqy7;", e.a, "(Loz3;Ljava/util/List;Lcv1;)Ljava/lang/Object;", "a", "Loy7;", "b", "Loy7;", "impl", "<init>", "(Loy7;)V", "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ly7  reason: default package */
/* loaded from: classes2.dex */
public final class ly7 implements ky7 {
    private final oy7 b;

    /* compiled from: Collect.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__ReduceKt$fold$$inlined$collect$1"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ly7$a */
    /* loaded from: classes2.dex */
    public static final class a implements pz3<dy7> {
        final /* synthetic */ ea9 a;

        public a(ea9 ea9Var) {
            this.a = ea9Var;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [T, qy7] */
        @Override // defpackage.pz3
        public Object emit(dy7 dy7Var, cv1 cv1Var) {
            List<dy7> r0;
            ea9 ea9Var = this.a;
            qy7 qy7Var = (qy7) ea9Var.a;
            r0 = sc1.r0(qy7Var.b(), dy7Var);
            ea9Var.a = qy7Var.a(r0);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PermissionFlow.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @nn2(c = "com.dodopizza.permissions.PermissionFlowImpl", f = "PermissionFlow.kt", l = {100}, m = "aggregate")
    /* renamed from: ly7$b */
    /* loaded from: classes2.dex */
    public static final class b extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ly7.this.e(null, null, this);
        }
    }

    /* compiled from: PermissionFlow.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lqy7;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.dodopizza.permissions.PermissionFlowImpl$requestPermission$1", f = "PermissionFlow.kt", l = {76, 68}, m = "invokeSuspend")
    /* renamed from: ly7$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function2<pz3<? super qy7>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ String[] c;
        final /* synthetic */ ly7 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String[] strArr, ly7 ly7Var, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = strArr;
            this.d = ly7Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.c, this.d, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super qy7> pz3Var, cv1<? super Unit> cv1Var) {
            return ((c) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[RETURN] */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r10.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                defpackage.vk9.b(r11)
                goto Le4
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r1 = r10.b
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r11)
                goto Ld0
            L24:
                defpackage.vk9.b(r11)
                java.lang.Object r11 = r10.b
                r1 = r11
                pz3 r1 = (defpackage.pz3) r1
                java.lang.String[] r11 = r10.c
                ly7 r4 = r10.d
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = r11.length
                r5.<init>(r6)
                int r6 = r11.length
                r7 = 0
                r8 = 0
            L39:
                if (r8 >= r6) goto L47
                r9 = r11[r8]
                dy7 r9 = defpackage.ly7.d(r4, r9)
                r5.add(r9)
                int r8 = r8 + 1
                goto L39
            L47:
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r5 = r5.iterator()
            L55:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L70
                java.lang.Object r6 = r5.next()
                r8 = r6
                dy7 r8 = (defpackage.dy7) r8
                boolean r8 = r8.a()
                if (r8 == 0) goto L6c
                r11.add(r6)
                goto L55
            L6c:
                r4.add(r6)
                goto L55
            L70:
                kotlin.Pair r5 = new kotlin.Pair
                r5.<init>(r11, r4)
                ly7 r11 = r10.d
                java.lang.Object r4 = r5.a()
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r5 = r5.b()
                java.util.List r5 = (java.util.List) r5
                r6 = r4
                java.util.Collection r6 = (java.util.Collection) r6
                boolean r6 = r6.isEmpty()
                r6 = r6 ^ r3
                if (r6 == 0) goto Ld3
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r6 = new java.util.ArrayList
                r8 = 10
                int r8 = defpackage.ic1.w(r4, r8)
                r6.<init>(r8)
                java.util.Iterator r4 = r4.iterator()
            L9e:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto Lb2
                java.lang.Object r8 = r4.next()
                dy7 r8 = (defpackage.dy7) r8
                java.lang.String r8 = r8.c()
                r6.add(r8)
                goto L9e
            Lb2:
                java.lang.String[] r4 = new java.lang.String[r7]
                java.lang.Object[] r4 = r6.toArray(r4)
                java.lang.String[] r4 = (java.lang.String[]) r4
                int r6 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
                java.lang.String[] r4 = (java.lang.String[]) r4
                oz3 r4 = defpackage.ly7.c(r11, r4)
                r10.b = r1
                r10.a = r3
                java.lang.Object r11 = defpackage.ly7.b(r11, r4, r5, r10)
                if (r11 != r0) goto Ld0
                return r0
            Ld0:
                qy7 r11 = (defpackage.qy7) r11
                goto Ld8
            Ld3:
                qy7 r11 = new qy7
                r11.<init>(r5)
            Ld8:
                r3 = 0
                r10.b = r3
                r10.a = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto Le4
                return r0
            Le4:
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ly7.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ly7(oy7 oy7Var) {
        z65.h(oy7Var, "impl");
        this.b = oy7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, qy7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.oz3<defpackage.dy7> r5, java.util.List<defpackage.dy7> r6, defpackage.cv1<? super defpackage.qy7> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ly7.b
            if (r0 == 0) goto L13
            r0 = r7
            ly7$b r0 = (defpackage.ly7.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ly7$b r0 = new ly7$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.b
            ea9 r5 = (defpackage.ea9) r5
            java.lang.Object r6 = r0.a
            java.util.List r6 = (java.util.List) r6
            defpackage.vk9.b(r7)
            goto L5f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            defpackage.vk9.b(r7)
            qy7 r7 = new qy7
            java.util.List r2 = defpackage.ic1.l()
            r7.<init>(r2)
            ea9 r2 = new ea9
            r2.<init>()
            r2.a = r7
            ly7$a r7 = new ly7$a
            r7.<init>(r2)
            r0.a = r6
            r0.b = r2
            r0.e = r3
            java.lang.Object r5 = r5.collect(r7, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            r5 = r2
        L5f:
            T r5 = r5.a
            qy7 r5 = (defpackage.qy7) r5
            java.util.List r5 = r5.b()
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r5 = defpackage.ic1.q0(r5, r6)
            qy7 r6 = new qy7
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly7.e(oz3, java.util.List, cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<dy7> f(String... strArr) {
        List<String> c2;
        ny7 a2 = this.b.a();
        c2 = xr.c(strArr);
        return a2.h5(c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dy7 g(String str) {
        return this.b.a().n7(str);
    }

    @Override // defpackage.ky7
    public oz3<qy7> a(String... strArr) {
        z65.h(strArr, "permissions");
        return wz3.z(new c(strArr, this, null));
    }
}
