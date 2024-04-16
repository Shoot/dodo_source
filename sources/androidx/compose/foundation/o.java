package androidx.compose.foundation;

import defpackage.nd8;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J-\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u0005H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0005H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u0006\u0010\u0014\u001a\u00020\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/o;", "Lfe8;", "Lsm6$c;", "Loq6;", "interactionSource", "", "i1", "Lkd8;", "pointerEvent", "Lmd8;", "pass", "Lw55;", "bounds", "v", "(Lkd8;Lmd8;J)V", "h0", "Q0", "f1", "(Lcv1;)Ljava/lang/Object;", "g1", "h1", "n", "Loq6;", "Lop4;", "o", "Lop4;", "hoverInteraction", "<init>", "(Loq6;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class o extends sm6.c implements fe8 {
    private oq6 n;
    private op4 o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hoverable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {108}, m = "emitEnter")
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return o.this.f1(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hoverable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {116}, m = "emitExit")
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return o.this.g1(this);
        }
    }

    /* compiled from: Hoverable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {91}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                o oVar = o.this;
                this.a = 1;
                if (oVar.f1(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: Hoverable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                o oVar = o.this;
                this.a = 1;
                if (oVar.g1(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public o(oq6 oq6Var) {
        z65.h(oq6Var, "interactionSource");
        this.n = oq6Var;
    }

    @Override // defpackage.fe8
    public /* synthetic */ boolean B() {
        return ee8.a(this);
    }

    @Override // defpackage.sm6.c
    public void Q0() {
        h1();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f1(defpackage.cv1<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.o.a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.o$a r0 = (androidx.compose.foundation.o.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.compose.foundation.o$a r0 = new androidx.compose.foundation.o$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.b
            op4 r1 = (defpackage.op4) r1
            java.lang.Object r0 = r0.a
            androidx.compose.foundation.o r0 = (androidx.compose.foundation.o) r0
            defpackage.vk9.b(r5)
            goto L56
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            defpackage.vk9.b(r5)
            op4 r5 = r4.o
            if (r5 != 0) goto L58
            op4 r5 = new op4
            r5.<init>()
            oq6 r2 = r4.n
            r0.a = r4
            r0.b = r5
            r0.e = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r1 = r5
        L56:
            r0.o = r1
        L58:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.o.f1(cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g1(defpackage.cv1<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.o.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.o$b r0 = (androidx.compose.foundation.o.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.o$b r0 = new androidx.compose.foundation.o$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.a
            androidx.compose.foundation.o r0 = (androidx.compose.foundation.o) r0
            defpackage.vk9.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            defpackage.vk9.b(r5)
            op4 r5 = r4.o
            if (r5 == 0) goto L52
            pp4 r2 = new pp4
            r2.<init>(r5)
            oq6 r5 = r4.n
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            r5 = 0
            r0.o = r5
        L52:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.o.g1(cv1):java.lang.Object");
    }

    @Override // defpackage.fe8
    public void h0() {
        h1();
    }

    public final void h1() {
        op4 op4Var = this.o;
        if (op4Var != null) {
            this.n.c(new pp4(op4Var));
            this.o = null;
        }
    }

    public final void i1(oq6 oq6Var) {
        z65.h(oq6Var, "interactionSource");
        if (!z65.c(this.n, oq6Var)) {
            h1();
            this.n = oq6Var;
        }
    }

    @Override // defpackage.fe8
    public /* synthetic */ void j0() {
        ee8.b(this);
    }

    @Override // defpackage.fe8
    public void v(kd8 kd8Var, md8 md8Var, long j) {
        z65.h(kd8Var, "pointerEvent");
        z65.h(md8Var, "pass");
        if (md8Var == md8.Main) {
            int e = kd8Var.e();
            nd8.a aVar = nd8.a;
            if (nd8.i(e, aVar.a())) {
                sh0.d(F0(), null, null, new c(null), 3, null);
            } else if (nd8.i(e, aVar.b())) {
                sh0.d(F0(), null, null, new d(null), 3, null);
            }
        }
    }

    @Override // defpackage.fe8
    public /* synthetic */ boolean v0() {
        return ee8.d(this);
    }

    @Override // defpackage.fe8
    public /* synthetic */ void x0() {
        ee8.c(this);
    }
}
