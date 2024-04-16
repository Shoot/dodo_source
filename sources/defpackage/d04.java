package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Emitters.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u001aP\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000120\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aP\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\t\u001a\u0010\u0010\u000f\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0003H\u0000\u001a_\u0010\u0011\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"T", "Loz3;", "Lkotlin/Function2;", "Lpz3;", "Lcv1;", "", "", "action", "f", "(Loz3;Lkotlin/jvm/functions/Function2;)Loz3;", "Lkotlin/Function3;", "", DateTokenConverter.CONVERTER_KEY, "(Loz3;Ly84;)Loz3;", com.huawei.hms.push.e.a, "b", "cause", com.huawei.hms.opendevice.c.a, "(Lpz3;Ly84;Ljava/lang/Throwable;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: d04  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class d04 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Emitters.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {216}, m = "invokeSafely$FlowKt__EmittersKt")
    /* renamed from: d04$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends ev1 {
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
            return d04.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"d04$b", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: d04$b */
    /* loaded from: classes3.dex */
    public static final class b<T> implements oz3<T> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ y84 b;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 128}, m = "collect")
        /* renamed from: d04$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            /* synthetic */ Object a;
            int b;
            Object d;
            Object e;

            public a(cv1 cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(oz3 oz3Var, y84 y84Var) {
            this.a = oz3Var;
            this.b = y84Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // defpackage.oz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(defpackage.pz3<? super T> r9, defpackage.cv1<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof defpackage.d04.b.a
                if (r0 == 0) goto L13
                r0 = r10
                d04$b$a r0 = (defpackage.d04.b.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                d04$b$a r0 = new d04$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.d
                qs9 r9 = (defpackage.qs9) r9
                defpackage.vk9.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                defpackage.vk9.b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.e
                pz3 r9 = (defpackage.pz3) r9
                java.lang.Object r2 = r0.d
                d04$b r2 = (defpackage.d04.b) r2
                defpackage.vk9.b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                defpackage.vk9.b(r10)
                oz3 r10 = r8.a     // Catch: java.lang.Throwable -> L96
                r0.d = r8     // Catch: java.lang.Throwable -> L96
                r0.e = r9     // Catch: java.lang.Throwable -> L96
                r0.b = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                qs9 r10 = new qs9
                kotlin.coroutines.CoroutineContext r4 = r0.getContext()
                r10.<init>(r9, r4)
                y84 r9 = r2.b     // Catch: java.lang.Throwable -> L8e
                r0.d = r10     // Catch: java.lang.Throwable -> L8e
                r0.e = r6     // Catch: java.lang.Throwable -> L8e
                r0.b = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                defpackage.d35.a(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                defpackage.d35.a(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                qfb r10 = new qfb
                r10.<init>(r9)
                y84 r2 = r2.b
                r0.d = r9
                r0.e = r6
                r0.b = r4
                java.lang.Object r10 = defpackage.d04.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.d04.b.collect(pz3, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"d04$c", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: d04$c */
    /* loaded from: classes3.dex */
    public static final class c<T> implements oz3<T> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ Function2 b;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 122}, m = "collect")
        /* renamed from: d04$c$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            /* synthetic */ Object a;
            int b;
            Object d;
            Object e;
            Object f;

            public a(cv1 cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(oz3 oz3Var, Function2 function2) {
            this.a = oz3Var;
            this.b = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
        /* JADX WARN: Type inference failed for: r7v0, types: [pz3<? super T>, pz3, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v1, types: [qs9] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v7, types: [qs9] */
        @Override // defpackage.oz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(defpackage.pz3<? super T> r7, defpackage.cv1<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof defpackage.d04.c.a
                if (r0 == 0) goto L13
                r0 = r8
                d04$c$a r0 = (defpackage.d04.c.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                d04$c$a r0 = new d04$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r7 = r0.d
                qs9 r7 = (defpackage.qs9) r7
                defpackage.vk9.b(r8)     // Catch: java.lang.Throwable -> L30
                goto L94
            L30:
                r8 = move-exception
                goto L98
            L32:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3a:
                java.lang.Object r7 = r0.f
                aa9 r7 = (defpackage.aa9) r7
                java.lang.Object r2 = r0.e
                pz3 r2 = (defpackage.pz3) r2
                java.lang.Object r4 = r0.d
                d04$c r4 = (defpackage.d04.c) r4
                defpackage.vk9.b(r8)
                goto L6d
            L4a:
                defpackage.vk9.b(r8)
                aa9 r8 = new aa9
                r8.<init>()
                r8.a = r4
                oz3 r2 = r6.a
                d04$d r5 = new d04$d
                r5.<init>(r8, r7)
                r0.d = r6
                r0.e = r7
                r0.f = r8
                r0.b = r4
                java.lang.Object r2 = r2.collect(r5, r0)
                if (r2 != r1) goto L6a
                return r1
            L6a:
                r4 = r6
                r2 = r7
                r7 = r8
            L6d:
                boolean r7 = r7.a
                if (r7 == 0) goto L9c
                qs9 r7 = new qs9
                kotlin.coroutines.CoroutineContext r8 = r0.getContext()
                r7.<init>(r2, r8)
                kotlin.jvm.functions.Function2 r8 = r4.b     // Catch: java.lang.Throwable -> L30
                r0.d = r7     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r0.e = r2     // Catch: java.lang.Throwable -> L30
                r0.f = r2     // Catch: java.lang.Throwable -> L30
                r0.b = r3     // Catch: java.lang.Throwable -> L30
                r2 = 6
                defpackage.d35.a(r2)     // Catch: java.lang.Throwable -> L30
                java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L30
                r0 = 7
                defpackage.d35.a(r0)     // Catch: java.lang.Throwable -> L30
                if (r8 != r1) goto L94
                return r1
            L94:
                r7.releaseIntercepted()
                goto L9c
            L98:
                r7.releaseIntercepted()
                throw r8
            L9c:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.d04.c.collect(pz3, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Emitters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: d04$d */
    /* loaded from: classes3.dex */
    public static final class d<T> implements pz3 {
        final /* synthetic */ aa9 a;
        final /* synthetic */ pz3<T> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Emitters.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", l = {185}, m = "emit")
        /* renamed from: d04$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            /* synthetic */ Object a;
            final /* synthetic */ d<T> b;
            int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, cv1<? super a> cv1Var) {
                super(cv1Var);
                this.b = dVar;
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(aa9 aa9Var, pz3<? super T> pz3Var) {
            this.a = aa9Var;
            this.b = pz3Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // defpackage.pz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, defpackage.cv1<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof defpackage.d04.d.a
                if (r0 == 0) goto L13
                r0 = r6
                d04$d$a r0 = (defpackage.d04.d.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                d04$d$a r0 = new d04$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                defpackage.vk9.b(r6)
                goto L44
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                defpackage.vk9.b(r6)
                aa9 r6 = r4.a
                r2 = 0
                r6.a = r2
                pz3<T> r6 = r4.b
                r0.c = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.d04.d.emit(java.lang.Object, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"d04$e", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: d04$e */
    /* loaded from: classes3.dex */
    public static final class e<T> implements oz3<T> {
        final /* synthetic */ Function2 a;
        final /* synthetic */ oz3 b;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
        /* renamed from: d04$e$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            /* synthetic */ Object a;
            int b;
            Object d;
            Object e;
            Object f;

            public a(cv1 cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(Function2 function2, oz3 oz3Var) {
            this.a = function2;
            this.b = oz3Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        @Override // defpackage.oz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(defpackage.pz3<? super T> r7, defpackage.cv1<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof defpackage.d04.e.a
                if (r0 == 0) goto L13
                r0 = r8
                d04$e$a r0 = (defpackage.d04.e.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                d04$e$a r0 = new d04$e$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                defpackage.vk9.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f
                qs9 r7 = (defpackage.qs9) r7
                java.lang.Object r2 = r0.e
                pz3 r2 = (defpackage.pz3) r2
                java.lang.Object r4 = r0.d
                d04$e r4 = (defpackage.d04.e) r4
                defpackage.vk9.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                defpackage.vk9.b(r8)
                qs9 r8 = new qs9
                kotlin.coroutines.CoroutineContext r2 = r0.getContext()
                r8.<init>(r7, r2)
                kotlin.jvm.functions.Function2 r2 = r6.a     // Catch: java.lang.Throwable -> L86
                r0.d = r6     // Catch: java.lang.Throwable -> L86
                r0.e = r7     // Catch: java.lang.Throwable -> L86
                r0.f = r8     // Catch: java.lang.Throwable -> L86
                r0.b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                defpackage.d35.a(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                defpackage.d35.a(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                oz3 r7 = r4.b
                r8 = 0
                r0.d = r8
                r0.e = r8
                r0.f = r8
                r0.b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.d04.e.collect(pz3, cv1):java.lang.Object");
        }
    }

    public static final void b(pz3<?> pz3Var) {
        if (!(pz3Var instanceof qfb)) {
            return;
        }
        throw ((qfb) pz3Var).a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(defpackage.pz3<? super T> r4, defpackage.y84<? super defpackage.pz3<? super T>, ? super java.lang.Throwable, ? super defpackage.cv1<? super kotlin.Unit>, ? extends java.lang.Object> r5, java.lang.Throwable r6, defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof defpackage.d04.a
            if (r0 == 0) goto L13
            r0 = r7
            d04$a r0 = (defpackage.d04.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            d04$a r0 = new d04$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            defpackage.vk9.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            defpackage.vk9.b(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L2e
            r0.c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            defpackage.ul3.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d04.c(pz3, y84, java.lang.Throwable, cv1):java.lang.Object");
    }

    public static final <T> oz3<T> d(oz3<? extends T> oz3Var, y84<? super pz3<? super T>, ? super Throwable, ? super cv1<? super Unit>, ? extends Object> y84Var) {
        return new b(oz3Var, y84Var);
    }

    public static final <T> oz3<T> e(oz3<? extends T> oz3Var, Function2<? super pz3<? super T>, ? super cv1<? super Unit>, ? extends Object> function2) {
        return new c(oz3Var, function2);
    }

    public static final <T> oz3<T> f(oz3<? extends T> oz3Var, Function2<? super pz3<? super T>, ? super cv1<? super Unit>, ? extends Object> function2) {
        return new e(function2, oz3Var);
    }
}
