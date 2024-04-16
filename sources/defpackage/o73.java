package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aj\u0010\u0013\u001a\u00020\u0005*\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0012H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u000b\u001a!\u0010\u0017\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u001a\u0010 \u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d\"\u0017\u0010#\u001a\u00020!8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\"\"\u0017\u0010$\u001a\u00020!8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\"\"\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lr40;", "Lvd8;", "pointerId", "Lkotlin/Function1;", "Lwd8;", "", "onDrag", "", com.huawei.hms.push.e.a, "(Lr40;JLkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "b", "(Lr40;JLcv1;)Ljava/lang/Object;", "Lie8;", "Ls67;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "Lkotlin/Function2;", DateTokenConverter.CONVERTER_KEY, "(Lie8;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", com.huawei.hms.opendevice.c.a, "Lkd8;", "f", "(Lkd8;J)Z", "Ljd8;", "a", "Ljd8;", "getHorizontalPointerDirectionConfig", "()Ljd8;", "HorizontalPointerDirectionConfig", "getVerticalPointerDirectionConfig", "VerticalPointerDirectionConfig", "Li73;", "F", "mouseSlop", "defaultTouchSlop", "", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: o73  reason: default package */
/* loaded from: classes.dex */
public final class o73 {
    private static final jd8 a = new a();
    private static final jd8 b = new b();
    private static final float c;
    private static final float d;
    private static final float e;

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o73$a", "Ljd8;", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: o73$a */
    /* loaded from: classes.dex */
    public static final class a implements jd8 {
        a() {
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o73$b", "Ljd8;", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: o73$b */
    /* loaded from: classes.dex */
    public static final class b implements jd8 {
        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {876}, m = "awaitDragOrCancellation-rnUCldI")
    /* renamed from: o73$c */
    /* loaded from: classes.dex */
    public static final class c extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int d;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return o73.b(null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {808}, m = "awaitLongPressOrCancellation-rnUCldI")
    /* renamed from: o73$d */
    /* loaded from: classes.dex */
    public static final class d extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int d;

        d(cv1<? super d> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return o73.c(null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lr40;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {811, 828}, m = "invokeSuspend")
    /* renamed from: o73$e */
    /* loaded from: classes.dex */
    public static final class e extends rk9 implements Function2<r40, cv1<? super Unit>, Object> {
        Object b;
        int c;
        int d;
        private /* synthetic */ Object e;
        final /* synthetic */ ea9<wd8> f;
        final /* synthetic */ ea9<wd8> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ea9<wd8> ea9Var, ea9<wd8> ea9Var2, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.f = ea9Var;
            this.g = ea9Var2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(this.f, this.g, cv1Var);
            eVar.e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(r40 r40Var, cv1<? super Unit> cv1Var) {
            return ((e) create(r40Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
            r2 = 1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00d5 A[EDGE_INSN: B:67:0x00d5->B:42:0x00d5 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v7, types: [T, wd8] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b5 -> B:36:0x00b7). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.o73.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lr40;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {235, 236, 241}, m = "invokeSuspend")
    /* renamed from: o73$f */
    /* loaded from: classes.dex */
    static final class f extends rk9 implements Function2<r40, cv1<? super Unit>, Object> {
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ Function1<s67, Unit> d;
        final /* synthetic */ Function0<Unit> e;
        final /* synthetic */ Function0<Unit> f;
        final /* synthetic */ Function2<wd8, s67, Unit> g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DragGestureDetector.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwd8;", "it", "", "a", "(Lwd8;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: o73$f$a */
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function1<wd8, Unit> {
            final /* synthetic */ Function2<wd8, s67, Unit> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super wd8, ? super s67, Unit> function2) {
                super(1);
                this.a = function2;
            }

            public final void a(wd8 wd8Var) {
                z65.h(wd8Var, "it");
                this.a.invoke(wd8Var, s67.d(ld8.g(wd8Var)));
                wd8Var.a();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(wd8 wd8Var) {
                a(wd8Var);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super s67, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super wd8, ? super s67, Unit> function2, cv1<? super f> cv1Var) {
            super(2, cv1Var);
            this.d = function1;
            this.e = function0;
            this.f = function02;
            this.g = function2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(this.d, this.e, this.f, this.g, cv1Var);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(r40 r40Var, cv1<? super Unit> cv1Var) {
            return ((f) create(r40Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0086, B:35:0x008e, B:37:0x009d, B:39:0x00a9, B:40:0x00ac, B:41:0x00af, B:42:0x00b5, B:15:0x0028, B:27:0x005e, B:29:0x0062, B:18:0x0030, B:24:0x004d, B:21:0x0040), top: B:47:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008e A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0086, B:35:0x008e, B:37:0x009d, B:39:0x00a9, B:40:0x00ac, B:41:0x00af, B:42:0x00b5, B:15:0x0028, B:27:0x005e, B:29:0x0062, B:18:0x0030, B:24:0x004d, B:21:0x0040), top: B:47:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x0086, B:35:0x008e, B:37:0x009d, B:39:0x00a9, B:40:0x00ac, B:41:0x00af, B:42:0x00b5, B:15:0x0028, B:27:0x005e, B:29:0x0062, B:18:0x0030, B:24:0x004d, B:21:0x0040), top: B:47:0x0009 }] */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r11.b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r0 = r11.c
                r40 r0 = (defpackage.r40) r0
                defpackage.vk9.b(r12)     // Catch: java.util.concurrent.CancellationException -> L19
                goto L86
            L19:
                r12 = move-exception
                goto Lbd
            L1c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L24:
                java.lang.Object r1 = r11.c
                r40 r1 = (defpackage.r40) r1
                defpackage.vk9.b(r12)     // Catch: java.util.concurrent.CancellationException -> L19
                goto L5e
            L2c:
                java.lang.Object r1 = r11.c
                r40 r1 = (defpackage.r40) r1
                defpackage.vk9.b(r12)     // Catch: java.util.concurrent.CancellationException -> L19
                goto L4d
            L34:
                defpackage.vk9.b(r12)
                java.lang.Object r12 = r11.c
                r1 = r12
                r40 r1 = (defpackage.r40) r1
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r11.c = r1     // Catch: java.util.concurrent.CancellationException -> L19
                r11.b = r4     // Catch: java.util.concurrent.CancellationException -> L19
                r5 = r1
                r8 = r11
                java.lang.Object r12 = defpackage.m6b.c(r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L19
                if (r12 != r0) goto L4d
                return r0
            L4d:
                wd8 r12 = (defpackage.wd8) r12     // Catch: java.util.concurrent.CancellationException -> L19
                long r4 = r12.f()     // Catch: java.util.concurrent.CancellationException -> L19
                r11.c = r1     // Catch: java.util.concurrent.CancellationException -> L19
                r11.b = r3     // Catch: java.util.concurrent.CancellationException -> L19
                java.lang.Object r12 = defpackage.o73.c(r1, r4, r11)     // Catch: java.util.concurrent.CancellationException -> L19
                if (r12 != r0) goto L5e
                return r0
            L5e:
                wd8 r12 = (defpackage.wd8) r12     // Catch: java.util.concurrent.CancellationException -> L19
                if (r12 == 0) goto Lba
                kotlin.jvm.functions.Function1<s67, kotlin.Unit> r3 = r11.d     // Catch: java.util.concurrent.CancellationException -> L19
                long r4 = r12.g()     // Catch: java.util.concurrent.CancellationException -> L19
                s67 r4 = defpackage.s67.d(r4)     // Catch: java.util.concurrent.CancellationException -> L19
                r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L19
                long r3 = r12.f()     // Catch: java.util.concurrent.CancellationException -> L19
                o73$f$a r12 = new o73$f$a     // Catch: java.util.concurrent.CancellationException -> L19
                kotlin.jvm.functions.Function2<wd8, s67, kotlin.Unit> r5 = r11.g     // Catch: java.util.concurrent.CancellationException -> L19
                r12.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L19
                r11.c = r1     // Catch: java.util.concurrent.CancellationException -> L19
                r11.b = r2     // Catch: java.util.concurrent.CancellationException -> L19
                java.lang.Object r12 = defpackage.o73.e(r1, r3, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L19
                if (r12 != r0) goto L85
                return r0
            L85:
                r0 = r1
            L86:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> L19
                boolean r12 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L19
                if (r12 == 0) goto Lb5
                kd8 r12 = r0.a0()     // Catch: java.util.concurrent.CancellationException -> L19
                java.util.List r12 = r12.c()     // Catch: java.util.concurrent.CancellationException -> L19
                int r0 = r12.size()     // Catch: java.util.concurrent.CancellationException -> L19
                r1 = 0
            L9b:
                if (r1 >= r0) goto Laf
                java.lang.Object r2 = r12.get(r1)     // Catch: java.util.concurrent.CancellationException -> L19
                wd8 r2 = (defpackage.wd8) r2     // Catch: java.util.concurrent.CancellationException -> L19
                boolean r3 = defpackage.ld8.c(r2)     // Catch: java.util.concurrent.CancellationException -> L19
                if (r3 == 0) goto Lac
                r2.a()     // Catch: java.util.concurrent.CancellationException -> L19
            Lac:
                int r1 = r1 + 1
                goto L9b
            Laf:
                kotlin.jvm.functions.Function0<kotlin.Unit> r12 = r11.e     // Catch: java.util.concurrent.CancellationException -> L19
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L19
                goto Lba
            Lb5:
                kotlin.jvm.functions.Function0<kotlin.Unit> r12 = r11.f     // Catch: java.util.concurrent.CancellationException -> L19
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L19
            Lba:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            Lbd:
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r11.f
                r0.invoke()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.o73.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {109}, m = "drag-jO51t88")
    /* renamed from: o73$g */
    /* loaded from: classes.dex */
    public static final class g extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int d;

        g(cv1<? super g> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return o73.e(null, 0L, null, this);
        }
    }

    static {
        float o = i73.o((float) 0.125d);
        c = o;
        float o2 = i73.o(18);
        d = o2;
        e = o / o2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
        if (defpackage.ld8.i(r11) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.r40 r17, long r18, defpackage.cv1<? super defpackage.wd8> r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o73.b(r40, long, cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, wd8, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.r40 r9, long r10, defpackage.cv1<? super defpackage.wd8> r12) {
        /*
            boolean r0 = r12 instanceof defpackage.o73.d
            if (r0 == 0) goto L13
            r0 = r12
            o73$d r0 = (defpackage.o73.d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            o73$d r0 = new o73$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.b
            ea9 r9 = (defpackage.ea9) r9
            java.lang.Object r10 = r0.a
            wd8 r10 = (defpackage.wd8) r10
            defpackage.vk9.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L33
            goto La7
        L33:
            goto L9e
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            defpackage.vk9.b(r12)
            kd8 r12 = r9.a0()
            boolean r12 = f(r12, r10)
            if (r12 == 0) goto L4b
            return r4
        L4b:
            kd8 r12 = r9.a0()
            java.util.List r12 = r12.c()
            int r2 = r12.size()
            r5 = 0
        L58:
            if (r5 >= r2) goto L6f
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            wd8 r7 = (defpackage.wd8) r7
            long r7 = r7.f()
            boolean r7 = defpackage.vd8.d(r7, r10)
            if (r7 == 0) goto L6c
            goto L70
        L6c:
            int r5 = r5 + 1
            goto L58
        L6f:
            r6 = r4
        L70:
            r10 = r6
            wd8 r10 = (defpackage.wd8) r10
            if (r10 != 0) goto L76
            return r4
        L76:
            ea9 r11 = new ea9
            r11.<init>()
            ea9 r12 = new ea9
            r12.<init>()
            r12.a = r10
            xyb r2 = r9.getViewConfiguration()
            long r5 = r2.b()
            o73$e r2 = new o73$e     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r2.<init>(r12, r11, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r0.a = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r0.b = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r0.d = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            java.lang.Object r9 = r9.y(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            if (r9 != r1) goto La7
            return r1
        L9c:
            r9 = r11
        L9e:
            T r9 = r9.a
            wd8 r9 = (defpackage.wd8) r9
            if (r9 != 0) goto La6
            r4 = r10
            goto La7
        La6:
            r4 = r9
        La7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o73.c(r40, long, cv1):java.lang.Object");
    }

    public static final Object d(ie8 ie8Var, Function1<? super s67, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super wd8, ? super s67, Unit> function2, cv1<? super Unit> cv1Var) {
        Object d2;
        Object c2 = v44.c(ie8Var, new f(function1, function0, function02, function2, null), cv1Var);
        d2 = c75.d();
        if (c2 == d2) {
            return c2;
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.r40 r4, long r5, kotlin.jvm.functions.Function1<? super defpackage.wd8, kotlin.Unit> r7, defpackage.cv1<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof defpackage.o73.g
            if (r0 == 0) goto L13
            r0 = r8
            o73$g r0 = (defpackage.o73.g) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            o73$g r0 = new o73$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.b
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r0.a
            r40 r5 = (defpackage.r40) r5
            defpackage.vk9.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            defpackage.vk9.b(r8)
        L3e:
            r0.a = r4
            r0.b = r7
            r0.d = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            wd8 r8 = (defpackage.wd8) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = defpackage.nf0.a(r4)
            return r4
        L55:
            boolean r5 = defpackage.ld8.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = defpackage.nf0.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.f()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o73.e(r40, long, kotlin.jvm.functions.Function1, cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(kd8 kd8Var, long j) {
        wd8 wd8Var;
        List<wd8> c2 = kd8Var.c();
        int size = c2.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                wd8Var = c2.get(i);
                if (vd8.d(wd8Var.f(), j)) {
                    break;
                }
                i++;
            } else {
                wd8Var = null;
                break;
            }
        }
        wd8 wd8Var2 = wd8Var;
        if (wd8Var2 != null && wd8Var2.h()) {
            z = true;
        }
        return true ^ z;
    }
}
