package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: GlobalSnapshotManager.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/r;", "", "", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class r {
    public static final r a = new r();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GlobalSnapshotManager.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        int c;
        final /* synthetic */ rv0<Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rv0<Unit> rv0Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.d = rv0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #1 {all -> 0x005b, blocks: (B:18:0x0043, B:20:0x004b), top: B:32:0x0043 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003d -> B:32:0x0043). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r6.c
                r2 = 1
                if (r1 == 0) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r6.b
                aw0 r1 = (defpackage.aw0) r1
                java.lang.Object r3 = r6.a
                a99 r3 = (defpackage.a99) r3
                defpackage.vk9.b(r7)     // Catch: java.lang.Throwable -> L1b
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r6
                goto L43
            L1b:
                r7 = move-exception
                goto L65
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                defpackage.vk9.b(r7)
                rv0<kotlin.Unit> r3 = r6.d
                aw0 r7 = r3.iterator()     // Catch: java.lang.Throwable -> L1b
                r1 = r7
                r7 = r6
            L30:
                r7.a = r3     // Catch: java.lang.Throwable -> L1b
                r7.b = r1     // Catch: java.lang.Throwable -> L1b
                r7.c = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.a(r7)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L3d
                return r0
            L3d:
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L43:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L5b
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L5b
                if (r7 == 0) goto L5e
                java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L5b
                kotlin.Unit r7 = (kotlin.Unit) r7     // Catch: java.lang.Throwable -> L5b
                yoa$a r7 = defpackage.yoa.e     // Catch: java.lang.Throwable -> L5b
                r7.g()     // Catch: java.lang.Throwable -> L5b
                r7 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L30
            L5b:
                r7 = move-exception
                r3 = r4
                goto L65
            L5e:
                r7 = 0
                defpackage.dw0.a(r4, r7)
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L65:
                throw r7     // Catch: java.lang.Throwable -> L66
            L66:
                r0 = move-exception
                defpackage.dw0.a(r3, r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GlobalSnapshotManager.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<Object, Unit> {
        final /* synthetic */ rv0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rv0<Unit> rv0Var) {
            super(1);
            this.a = rv0Var;
        }

        public final void a(Object obj) {
            z65.h(obj, "it");
            this.a.h(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    private r() {
    }

    public final void a() {
        if (b.compareAndSet(false, true)) {
            rv0 b2 = bw0.b(-1, null, null, 6, null);
            sh0.d(rx1.a(n.m.b()), null, null, new a(b2, null), 3, null);
            yoa.e.f(new b(b2));
        }
    }
}
