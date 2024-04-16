package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.dk6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: InAppInteractorImpl.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0013\u0010\u0011\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcy4;", "Lby4;", "Ldk6;", "Loz3;", "Lqz4;", "i", "(Lcv1;)Ljava/lang/Object;", "", "id", "", "a", "inAppId", "f", "b", "", com.huawei.hms.opendevice.c.a, com.huawei.hms.push.e.a, DateTokenConverter.CONVERTER_KEY, "Lfm6;", "Lfm6;", "mobileConfigRepository", "Lwy4;", "Lwy4;", "inAppRepository", "Lyy4;", "Lyy4;", "inAppSegmentationRepository", "Lux4;", "Lux4;", "inAppFilteringManager", "Lrx4;", "Lrx4;", "inAppEventManager", "Ljx4;", "Ljx4;", "inAppChoosingManager", "Lgx4;", "g", "Lgx4;", "inAppABTestLogic", "<init>", "(Lfm6;Lwy4;Lyy4;Lux4;Lrx4;Ljx4;Lgx4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cy4  reason: default package */
/* loaded from: classes.dex */
public final class cy4 implements by4, dk6 {
    private final fm6 a;
    private final wy4 b;
    private final yy4 c;
    private final ux4 d;
    private final rx4 e;
    private final jx4 f;
    private final gx4 g;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* renamed from: cy4$a */
    /* loaded from: classes.dex */
    public static final class a implements oz3<tx4> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ cy4 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: cy4$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0277a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ cy4 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.InAppInteractorImpl$processEventAndConfig$$inlined$filter$1$2", f = "InAppInteractorImpl.kt", l = {223}, m = "emit")
            /* renamed from: cy4$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0278a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0278a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0277a.this.emit(null, this);
                }
            }

            public C0277a(pz3 pz3Var, cy4 cy4Var) {
                this.a = pz3Var;
                this.b = cy4Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, defpackage.cv1 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof defpackage.cy4.a.C0277a.C0278a
                    if (r0 == 0) goto L13
                    r0 = r7
                    cy4$a$a$a r0 = (defpackage.cy4.a.C0277a.C0278a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    cy4$a$a$a r0 = new cy4$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    r2 = r6
                    tx4 r2 = (defpackage.tx4) r2
                    cy4 r4 = r5.b
                    rx4 r4 = defpackage.cy4.k(r4)
                    boolean r2 = r4.a(r2)
                    if (r2 == 0) goto L4e
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cy4.a.C0277a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var, cy4 cy4Var) {
            this.a = oz3Var;
            this.b = cy4Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super tx4> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0277a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* renamed from: cy4$b */
    /* loaded from: classes.dex */
    public static final class b implements oz3<tx4> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ cy4 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: cy4$b$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ cy4 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.InAppInteractorImpl$processEventAndConfig$$inlined$filter$2$2", f = "InAppInteractorImpl.kt", l = {223}, m = "emit")
            /* renamed from: cy4$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0279a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0279a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, cy4 cy4Var) {
                this.a = pz3Var;
                this.b = cy4Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, defpackage.cv1 r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof defpackage.cy4.b.a.C0279a
                    if (r0 == 0) goto L13
                    r0 = r9
                    cy4$b$a$a r0 = (defpackage.cy4.b.a.C0279a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    cy4$b$a$a r0 = new cy4$b$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r9)
                    goto L61
                L29:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L31:
                    defpackage.vk9.b(r9)
                    pz3 r9 = r7.a
                    r2 = r8
                    tx4 r2 = (defpackage.tx4) r2
                    cy4 r2 = r7.b
                    boolean r2 = r2.c()
                    cy4 r4 = r7.b
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = "InApp shown: "
                    r5.append(r6)
                    r5.append(r2)
                    java.lang.String r5 = r5.toString()
                    defpackage.gk6.a(r4, r5)
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L61
                    r0.b = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L61
                    return r1
                L61:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cy4.b.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public b(oz3 oz3Var, cy4 cy4Var) {
            this.a = oz3Var;
            this.b = cy4Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super tx4> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* renamed from: cy4$c */
    /* loaded from: classes.dex */
    public static final class c implements oz3<qz4> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ cy4 b;
        final /* synthetic */ List c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: cy4$c$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ cy4 b;
            final /* synthetic */ List c;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.InAppInteractorImpl$processEventAndConfig$$inlined$map$1$2", f = "InAppInteractorImpl.kt", l = {227, 223}, m = "emit")
            /* renamed from: cy4$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0280a extends ev1 {
                /* synthetic */ Object a;
                int b;
                Object c;
                Object e;
                Object f;

                public C0280a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, cy4 cy4Var, List list) {
                this.a = pz3Var;
                this.b = cy4Var;
                this.c = list;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00c7 A[RETURN] */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, defpackage.cv1 r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof defpackage.cy4.c.a.C0280a
                    if (r0 == 0) goto L13
                    r0 = r10
                    cy4$c$a$a r0 = (defpackage.cy4.c.a.C0280a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    cy4$c$a$a r0 = new cy4$c$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L45
                    if (r2 == r4) goto L35
                    if (r2 != r3) goto L2d
                    defpackage.vk9.b(r10)
                    goto Lc8
                L2d:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L35:
                    java.lang.Object r9 = r0.f
                    tx4 r9 = (defpackage.tx4) r9
                    java.lang.Object r2 = r0.e
                    pz3 r2 = (defpackage.pz3) r2
                    java.lang.Object r4 = r0.c
                    cy4$c$a r4 = (defpackage.cy4.c.a) r4
                    defpackage.vk9.b(r10)
                    goto L90
                L45:
                    defpackage.vk9.b(r10)
                    pz3 r2 = r8.a
                    tx4 r9 = (defpackage.tx4) r9
                    cy4 r10 = r8.b
                    ux4 r10 = defpackage.cy4.l(r10)
                    java.util.List r5 = r8.c
                    java.util.List r10 = r10.a(r5, r9)
                    cy4 r5 = r8.b
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "Event: "
                    r6.append(r7)
                    java.lang.String r7 = r9.getName()
                    r6.append(r7)
                    java.lang.String r7 = " combined with "
                    r6.append(r7)
                    r6.append(r10)
                    java.lang.String r6 = r6.toString()
                    defpackage.gk6.a(r5, r6)
                    cy4 r5 = r8.b
                    jx4 r5 = defpackage.cy4.j(r5)
                    r0.c = r8
                    r0.e = r2
                    r0.f = r9
                    r0.b = r4
                    java.lang.Object r10 = r5.a(r10, r9, r0)
                    if (r10 != r1) goto L8f
                    return r1
                L8f:
                    r4 = r8
                L90:
                    r5 = r10
                    qz4 r5 = (defpackage.qz4) r5
                    if (r5 != 0) goto L9e
                    cy4 r5 = r4.b
                    java.lang.String r6 = "No innaps to show found"
                    defpackage.gk6.a(r5, r6)
                    kotlin.Unit r5 = kotlin.Unit.a
                L9e:
                    tx4$a r5 = defpackage.tx4.a.INSTANCE
                    boolean r9 = defpackage.z65.c(r9, r5)
                    if (r9 == 0) goto Lad
                    v25 r9 = defpackage.v25.a
                    v25$a r5 = defpackage.v25.a.APP_STARTED
                    r9.b(r5)
                Lad:
                    cy4 r9 = r4.b
                    yy4 r9 = defpackage.cy4.m(r9)
                    fm8 r4 = defpackage.fm8.SEGMENTATION_NOT_FETCHED
                    r9.d(r4)
                    r9 = 0
                    r0.c = r9
                    r0.e = r9
                    r0.f = r9
                    r0.b = r3
                    java.lang.Object r9 = r2.emit(r10, r0)
                    if (r9 != r1) goto Lc8
                    return r1
                Lc8:
                    kotlin.Unit r9 = kotlin.Unit.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cy4.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var, cy4 cy4Var, List list) {
            this.a = oz3Var;
            this.b = cy4Var;
            this.c = list;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super qz4> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b, this.c), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppInteractorImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.InAppInteractorImpl", f = "InAppInteractorImpl.kt", l = {31, 33, 46}, m = "processEventAndConfig")
    /* renamed from: cy4$d */
    /* loaded from: classes.dex */
    public static final class d extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        /* synthetic */ Object e;
        int g;

        d(cv1<? super d> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return cy4.this.i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ltx4;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.InAppInteractorImpl$processEventAndConfig$3", f = "InAppInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: cy4$e */
    /* loaded from: classes.dex */
    public static final class e extends f3b implements Function2<tx4, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(tx4 tx4Var, cv1<? super Unit> cv1Var) {
            return ((e) create(tx4Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                cy4 cy4Var = cy4.this;
                gk6.a(cy4Var, "Event triggered: " + ((tx4) this.b).getName());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public cy4(fm6 fm6Var, wy4 wy4Var, yy4 yy4Var, ux4 ux4Var, rx4 rx4Var, jx4 jx4Var, gx4 gx4Var) {
        z65.h(fm6Var, "mobileConfigRepository");
        z65.h(wy4Var, "inAppRepository");
        z65.h(yy4Var, "inAppSegmentationRepository");
        z65.h(ux4Var, "inAppFilteringManager");
        z65.h(rx4Var, "inAppEventManager");
        z65.h(jx4Var, "inAppChoosingManager");
        z65.h(gx4Var, "inAppABTestLogic");
        this.a = fm6Var;
        this.b = wy4Var;
        this.c = yy4Var;
        this.d = ux4Var;
        this.e = rx4Var;
        this.f = jx4Var;
        this.g = gx4Var;
    }

    @Override // defpackage.by4
    public void a(String str) {
        z65.h(str, "id");
        this.b.a(str);
    }

    @Override // defpackage.by4
    public void b(String str) {
        z65.h(str, "inAppId");
        this.b.b(str);
    }

    @Override // defpackage.by4
    public boolean c() {
        return this.b.c();
    }

    @Override // defpackage.by4
    public Object d(cv1<? super Unit> cv1Var) {
        Object d2;
        Object d3 = this.a.d(cv1Var);
        d2 = c75.d();
        if (d3 == d2) {
            return d3;
        }
        return Unit.a;
    }

    @Override // defpackage.by4
    public void e() {
        this.b.e();
    }

    @Override // defpackage.by4
    public void f(String str) {
        z65.h(str, "inAppId");
        this.b.f(str);
    }

    @Override // defpackage.dk6
    public void g(String str, Throwable th) {
        dk6.a.d(this, str, th);
    }

    @Override // defpackage.dk6
    public void h(String str, Throwable th) {
        dk6.a.a(this, str, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[LOOP:2: B:23:0x0083->B:25:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2 A[LOOP:1: B:31:0x00cc->B:33:0x00d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d A[LOOP:0: B:41:0x0147->B:43:0x014d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013e -> B:40:0x0141). Please submit an issue!!! */
    @Override // defpackage.by4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.cv1<? super defpackage.oz3<? extends defpackage.qz4>> r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy4.i(cv1):java.lang.Object");
    }

    public void n(String str) {
        dk6.a.c(this, str);
    }
}
