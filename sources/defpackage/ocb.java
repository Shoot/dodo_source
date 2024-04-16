package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: TextSelectionMouseDetector.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lie8;", "Lep6;", "observer", "", c.a, "(Lie8;Lep6;Lcv1;)Ljava/lang/Object;", "Lr40;", "Lkd8;", "b", "(Lr40;Lcv1;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ocb  reason: default package */
/* loaded from: classes.dex */
public final class ocb {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextSelectionMouseDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", f = "TextSelectionMouseDetector.kt", l = {125}, m = "awaitMouseEventDown")
    /* renamed from: ocb$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int c;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return ocb.b(null, this);
        }
    }

    /* compiled from: TextSelectionMouseDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lr40;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", l = {89, 96, 111}, m = "invokeSuspend")
    /* renamed from: ocb$b */
    /* loaded from: classes.dex */
    static final class b extends rk9 implements Function2<r40, cv1<? super Unit>, Object> {
        Object b;
        int c;
        private /* synthetic */ Object d;
        final /* synthetic */ ep6 e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextSelectionMouseDetector.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwd8;", "it", "", "a", "(Lwd8;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: ocb$b$a */
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function1<wd8, Unit> {
            final /* synthetic */ ep6 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ep6 ep6Var) {
                super(1);
                this.a = ep6Var;
            }

            public final void a(wd8 wd8Var) {
                z65.h(wd8Var, "it");
                if (this.a.c(wd8Var.g())) {
                    wd8Var.a();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(wd8 wd8Var) {
                a(wd8Var);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextSelectionMouseDetector.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwd8;", "it", "", "a", "(Lwd8;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: ocb$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0459b extends ej5 implements Function1<wd8, Unit> {
            final /* synthetic */ ep6 a;
            final /* synthetic */ t9a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0459b(ep6 ep6Var, t9a t9aVar) {
                super(1);
                this.a = ep6Var;
                this.b = t9aVar;
            }

            public final void a(wd8 wd8Var) {
                z65.h(wd8Var, "it");
                if (this.a.a(wd8Var.g(), this.b)) {
                    wd8Var.a();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(wd8 wd8Var) {
                a(wd8Var);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ep6 ep6Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.e = ep6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.e, cv1Var);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(r40 r40Var, cv1<? super Unit> cv1Var) {
            return ((b) create(r40Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d6 -> B:14:0x0045). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r12.c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                java.lang.Object r1 = r12.b
                d91 r1 = (defpackage.d91) r1
                java.lang.Object r5 = r12.d
                r40 r5 = (defpackage.r40) r5
                defpackage.vk9.b(r13)
                r13 = r5
                goto L44
            L27:
                java.lang.Object r1 = r12.b
                d91 r1 = (defpackage.d91) r1
                java.lang.Object r5 = r12.d
                r40 r5 = (defpackage.r40) r5
                defpackage.vk9.b(r13)
                r6 = r12
                goto L56
            L34:
                defpackage.vk9.b(r13)
                java.lang.Object r13 = r12.d
                r40 r13 = (defpackage.r40) r13
                d91 r1 = new d91
                xyb r5 = r13.getViewConfiguration()
                r1.<init>(r5)
            L44:
                r5 = r12
            L45:
                r5.d = r13
                r5.b = r1
                r5.c = r4
                java.lang.Object r6 = defpackage.ocb.a(r13, r5)
                if (r6 != r0) goto L52
                return r0
            L52:
                r11 = r5
                r5 = r13
                r13 = r6
                r6 = r11
            L56:
                kd8 r13 = (defpackage.kd8) r13
                r1.d(r13)
                java.util.List r7 = r13.c()
                r8 = 0
                java.lang.Object r7 = r7.get(r8)
                wd8 r7 = (defpackage.wd8) r7
                boolean r13 = defpackage.uab.a(r13)
                if (r13 == 0) goto L93
                ep6 r13 = r6.e
                long r8 = r7.g()
                boolean r13 = r13.d(r8)
                if (r13 == 0) goto Ld6
                r7.a()
                long r7 = r7.f()
                ocb$b$a r13 = new ocb$b$a
                ep6 r9 = r6.e
                r13.<init>(r9)
                r6.d = r5
                r6.b = r1
                r6.c = r3
                java.lang.Object r13 = defpackage.o73.e(r5, r7, r13, r6)
                if (r13 != r0) goto Ld6
                return r0
            L93:
                int r13 = r1.a()
                if (r13 == r4) goto La9
                if (r13 == r3) goto La2
                t9a$a r13 = defpackage.t9a.a
                t9a r13 = r13.c()
                goto Laf
            La2:
                t9a$a r13 = defpackage.t9a.a
                t9a r13 = r13.d()
                goto Laf
            La9:
                t9a$a r13 = defpackage.t9a.a
                t9a r13 = r13.b()
            Laf:
                ep6 r8 = r6.e
                long r9 = r7.g()
                boolean r8 = r8.b(r9, r13)
                if (r8 == 0) goto Ld6
                r7.a()
                long r7 = r7.f()
                ocb$b$b r9 = new ocb$b$b
                ep6 r10 = r6.e
                r9.<init>(r10, r13)
                r6.d = r5
                r6.b = r1
                r6.c = r2
                java.lang.Object r13 = defpackage.o73.e(r5, r7, r9, r6)
                if (r13 != r0) goto Ld6
                return r0
            Ld6:
                r13 = r5
                r5 = r6
                goto L45
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ocb.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.r40 r9, defpackage.cv1<? super defpackage.kd8> r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ocb.a
            if (r0 == 0) goto L13
            r0 = r10
            ocb$a r0 = (defpackage.ocb.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ocb$a r0 = new ocb$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.a
            r40 r9 = (defpackage.r40) r9
            defpackage.vk9.b(r10)
            goto L45
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.vk9.b(r10)
        L38:
            md8 r10 = defpackage.md8.Main
            r0.a = r9
            r0.c = r3
            java.lang.Object r10 = r9.Y(r10, r0)
            if (r10 != r1) goto L45
            return r1
        L45:
            kd8 r10 = (defpackage.kd8) r10
            int r2 = r10.b()
            boolean r2 = defpackage.od8.b(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r10.c()
            int r4 = r2.size()
            r5 = 0
        L5a:
            if (r5 >= r4) goto L7b
            java.lang.Object r6 = r2.get(r5)
            wd8 r6 = (defpackage.wd8) r6
            int r7 = r6.l()
            ke8$a r8 = defpackage.ke8.a
            int r8 = r8.b()
            boolean r7 = defpackage.ke8.g(r7, r8)
            if (r7 == 0) goto L38
            boolean r6 = defpackage.ld8.a(r6)
            if (r6 == 0) goto L38
            int r5 = r5 + 1
            goto L5a
        L7b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocb.b(r40, cv1):java.lang.Object");
    }

    public static final Object c(ie8 ie8Var, ep6 ep6Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object c = v44.c(ie8Var, new b(ep6Var, null), cv1Var);
        d = c75.d();
        if (c == d) {
            return c;
        }
        return Unit.a;
    }
}
