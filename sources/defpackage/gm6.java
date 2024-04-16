package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cga;
import defpackage.nx4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: MobileConfigRepositoryImpl.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206¢\u0006\u0004\bA\u0010BJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0013\u0010\u0012\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\fH\u0096@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013J\u0019\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013J\u0019\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0013R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, d2 = {"Lgm6;", "Lfm6;", "Loz3;", "Llx4;", Image.TYPE_SMALL, "Lnx4;", "configBlank", "", "Lqx4;", "p", "Lxw5;", "q", "", "", "Lya7;", "r", "Lk;", "n", "o", "(Lcv1;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "Luw5;", com.huawei.hms.opendevice.c.a, "Lab7;", "Lfb7;", "b", "Lfx4;", com.huawei.hms.push.e.a, "Lj;", "a", "Ldy4;", "Ldy4;", "inAppMapper", "Lhm6;", "Lhm6;", "mobileConfigSerializationManager", "Lsz4;", "Lsz4;", "inAppValidator", "Lko6;", "Lko6;", "monitoringValidator", "Ll;", "Ll;", "abTestValidator", "Lbb7;", "f", "Lbb7;", "operationNameValidator", "Lhb7;", "g", "Lhb7;", "operationValidator", "Lwc4;", Image.TYPE_HIGH, "Lwc4;", "gatewayManager", "Ljr6;", "i", "Ljr6;", "mutex", "Lg3b;", "Lg3b;", "inAppConfig", "<init>", "(Ldy4;Lhm6;Lsz4;Lko6;Ll;Lbb7;Lhb7;Lwc4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gm6  reason: default package */
/* loaded from: classes.dex */
public final class gm6 implements fm6 {
    private final dy4 a;
    private final hm6 b;
    private final sz4 c;
    private final ko6 d;
    private final l e;
    private final bb7 f;
    private final hb7 g;
    private final wc4 h;
    private final jr6 i;
    private final g3b<lx4> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MobileConfigRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.data.repositories.MobileConfigRepositoryImpl", f = "MobileConfigRepositoryImpl.kt", l = {46, 47}, m = "fetchMobileConfig")
    /* renamed from: gm6$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return gm6.this.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MobileConfigRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.data.repositories.MobileConfigRepositoryImpl", f = "MobileConfigRepositoryImpl.kt", l = {97}, m = "getABTests")
    /* renamed from: gm6$b */
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        /* synthetic */ Object a;
        int c;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return gm6.this.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MobileConfigRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.data.repositories.MobileConfigRepositoryImpl", f = "MobileConfigRepositoryImpl.kt", l = {95}, m = "getInAppsSection")
    /* renamed from: gm6$c */
    /* loaded from: classes.dex */
    public static final class c extends ev1 {
        /* synthetic */ Object a;
        int c;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return gm6.this.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MobileConfigRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.data.repositories.MobileConfigRepositoryImpl", f = "MobileConfigRepositoryImpl.kt", l = {91}, m = "getMonitoringSection")
    /* renamed from: gm6$d */
    /* loaded from: classes.dex */
    public static final class d extends ev1 {
        /* synthetic */ Object a;
        int c;

        d(cv1<? super d> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return gm6.this.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MobileConfigRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.data.repositories.MobileConfigRepositoryImpl", f = "MobileConfigRepositoryImpl.kt", l = {93}, m = "getOperations")
    /* renamed from: gm6$e */
    /* loaded from: classes.dex */
    public static final class e extends ev1 {
        /* synthetic */ Object a;
        int c;

        e(cv1<? super e> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return gm6.this.b(this);
        }
    }

    /* compiled from: MobileConfigRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Llx4;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.data.repositories.MobileConfigRepositoryImpl$inAppConfig$1", f = "MobileConfigRepositoryImpl.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: gm6$f */
    /* loaded from: classes.dex */
    static final class f extends f3b implements Function2<qx1, cv1<? super lx4>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super lx4> cv1Var) {
            return ((f) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 s = gm6.this.s();
                this.a = 1;
                obj = wz3.u(s, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gm6$g */
    /* loaded from: classes.dex */
    public static final class g implements oz3<lx4> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ gm6 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: gm6$g$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ gm6 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @nn2(c = "cloud.mindbox.mobile_sdk.inapp.data.repositories.MobileConfigRepositoryImpl$listenInAppConfig$$inlined$map$1$2", f = "MobileConfigRepositoryImpl.kt", l = {230, 223}, m = "emit")
            /* renamed from: gm6$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0336a extends ev1 {
                /* synthetic */ Object a;
                int b;
                Object c;
                Object e;
                Object f;
                Object g;

                public C0336a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, gm6 gm6Var) {
                this.a = pz3Var;
                this.b = gm6Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: all -> 0x0167, TryCatch #2 {all -> 0x0167, blocks: (B:20:0x006b, B:25:0x00a3, B:29:0x00b2, B:34:0x00ca, B:38:0x00d9, B:43:0x00f1, B:47:0x0100, B:52:0x0118, B:56:0x0127, B:55:0x011f, B:46:0x00f8, B:37:0x00d1, B:28:0x00aa, B:39:0x00dd, B:21:0x008d, B:48:0x0104, B:30:0x00b6), top: B:65:0x006b }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00d1 A[Catch: all -> 0x0167, TryCatch #2 {all -> 0x0167, blocks: (B:20:0x006b, B:25:0x00a3, B:29:0x00b2, B:34:0x00ca, B:38:0x00d9, B:43:0x00f1, B:47:0x0100, B:52:0x0118, B:56:0x0127, B:55:0x011f, B:46:0x00f8, B:37:0x00d1, B:28:0x00aa, B:39:0x00dd, B:21:0x008d, B:48:0x0104, B:30:0x00b6), top: B:65:0x006b }] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00f8 A[Catch: all -> 0x0167, TryCatch #2 {all -> 0x0167, blocks: (B:20:0x006b, B:25:0x00a3, B:29:0x00b2, B:34:0x00ca, B:38:0x00d9, B:43:0x00f1, B:47:0x0100, B:52:0x0118, B:56:0x0127, B:55:0x011f, B:46:0x00f8, B:37:0x00d1, B:28:0x00aa, B:39:0x00dd, B:21:0x008d, B:48:0x0104, B:30:0x00b6), top: B:65:0x006b }] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x011f A[Catch: all -> 0x0167, TryCatch #2 {all -> 0x0167, blocks: (B:20:0x006b, B:25:0x00a3, B:29:0x00b2, B:34:0x00ca, B:38:0x00d9, B:43:0x00f1, B:47:0x0100, B:52:0x0118, B:56:0x0127, B:55:0x011f, B:46:0x00f8, B:37:0x00d1, B:28:0x00aa, B:39:0x00dd, B:21:0x008d, B:48:0x0104, B:30:0x00b6), top: B:65:0x006b }] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0163 A[RETURN] */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, defpackage.cv1 r12) {
                /*
                    Method dump skipped, instructions count: 364
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gm6.g.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public g(oz3 oz3Var, gm6 gm6Var) {
            this.a = oz3Var;
            this.b = gm6Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super lx4> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    public gm6(dy4 dy4Var, hm6 hm6Var, sz4 sz4Var, ko6 ko6Var, l lVar, bb7 bb7Var, hb7 hb7Var, wc4 wc4Var) {
        z65.h(dy4Var, "inAppMapper");
        z65.h(hm6Var, "mobileConfigSerializationManager");
        z65.h(sz4Var, "inAppValidator");
        z65.h(ko6Var, "monitoringValidator");
        z65.h(lVar, "abTestValidator");
        z65.h(bb7Var, "operationNameValidator");
        z65.h(hb7Var, "operationValidator");
        z65.h(wc4Var, "gatewayManager");
        this.a = dy4Var;
        this.b = hm6Var;
        this.c = sz4Var;
        this.d = ko6Var;
        this.e = lVar;
        this.f = bb7Var;
        this.g = hb7Var;
        this.h = wc4Var;
        this.i = lr6.b(false, 1, null);
        this.j = h3b.a(mj6.a.K(), new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<k> n(nx4 nx4Var) {
        List<k> l;
        List<k> abtests;
        List<k> l2;
        List<k> l3;
        List<k> list = null;
        if (nx4Var != null) {
            try {
                abtests = nx4Var.getAbtests();
            } catch (Exception e2) {
                gk6.b(this, "Error parse abtests", e2);
                l = kc1.l();
                return l;
            }
        } else {
            abtests = null;
        }
        if (abtests == null) {
            l3 = kc1.l();
            return l3;
        }
        List<k> abtests2 = nx4Var.getAbtests();
        List<k> list2 = abtests2;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (k kVar : list2) {
                if (!this.e.b(kVar)) {
                    break;
                }
            }
        }
        list = abtests2;
        if (list == null) {
            l2 = kc1.l();
            return l2;
        }
        return list;
    }

    private final Object o(cv1<? super lx4> cv1Var) {
        return this.j.a(cv1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<qx4> p(nx4 nx4Var) {
        List<nx4.a> inApps;
        int w;
        if (nx4Var != null && (inApps = nx4Var.getInApps()) != null) {
            ArrayList<nx4.a> arrayList = new ArrayList();
            for (Object obj : inApps) {
                if (this.c.b((nx4.a) obj)) {
                    arrayList.add(obj);
                }
            }
            w = lc1.w(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (nx4.a aVar : arrayList) {
                arrayList2.add(this.a.g(aVar, this.b.b(aVar.getForm()), this.b.c(aVar.getTargeting())));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (this.c.a((qx4) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            return arrayList3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<xw5> q(nx4 nx4Var) {
        bo6 monitoring;
        List<yw5> logs;
        int w;
        if (nx4Var != null && (monitoring = nx4Var.getMonitoring()) != null && (logs = monitoring.getLogs()) != null) {
            ArrayList<yw5> arrayList = new ArrayList();
            for (Object obj : logs) {
                if (this.d.c((yw5) obj)) {
                    arrayList.add(obj);
                }
            }
            w = lc1.w(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (yw5 yw5Var : arrayList) {
                arrayList2.add(this.a.h(yw5Var));
            }
            return arrayList2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, ya7> r(nx4 nx4Var) {
        Map<String, ya7> h;
        cga settings;
        Map<String, cga.a> operations;
        Map<String, ya7> s;
        if (nx4Var != null && (settings = nx4Var.getSettings()) != null && (operations = settings.getOperations()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, cga.a> entry : operations.entrySet()) {
                cga.a value = entry.getValue();
                if (this.f.a(entry.getKey()) && this.g.a(value)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                cga.a aVar = (cga.a) entry2.getValue();
                z65.e(str);
                z65.e(aVar);
                String systemName = aVar.getSystemName();
                z65.e(systemName);
                arrayList.add(lnb.a(str, new ya7(systemName)));
            }
            s = g86.s(arrayList);
            if (s != null) {
                return s;
            }
        }
        h = g86.h();
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<lx4> s() {
        return new g(nk6.a.e(), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // defpackage.fm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.cv1<? super java.util.List<defpackage.j>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gm6.b
            if (r0 == 0) goto L13
            r0 = r5
            gm6$b r0 = (defpackage.gm6.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gm6$b r0 = new gm6$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.vk9.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.vk9.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.o(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            lx4 r5 = (defpackage.lx4) r5
            java.util.List r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm6.a(cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // defpackage.fm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.cv1<? super java.util.Map<defpackage.ab7, defpackage.fb7>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gm6.e
            if (r0 == 0) goto L13
            r0 = r5
            gm6$e r0 = (defpackage.gm6.e) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gm6$e r0 = new gm6$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.vk9.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.vk9.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.o(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            lx4 r5 = (defpackage.lx4) r5
            java.util.Map r5 = r5.d()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm6.b(cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // defpackage.fm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.cv1<? super java.util.List<defpackage.uw5>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gm6.d
            if (r0 == 0) goto L13
            r0 = r5
            gm6$d r0 = (defpackage.gm6.d) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gm6$d r0 = new gm6$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.vk9.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.vk9.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.o(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            lx4 r5 = (defpackage.lx4) r5
            java.util.List r5 = r5.c()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm6.c(cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    @Override // defpackage.fm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.cv1<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.gm6.a
            if (r0 == 0) goto L13
            r0 = r6
            gm6$a r0 = (defpackage.gm6.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gm6$a r0 = new gm6$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.a
            nk6 r0 = (defpackage.nk6) r0
            defpackage.vk9.b(r6)
            goto L67
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            java.lang.Object r2 = r0.a
            gm6 r2 = (defpackage.gm6) r2
            defpackage.vk9.b(r6)
            goto L55
        L40:
            defpackage.vk9.b(r6)
            in2 r6 = defpackage.in2.a
            oz3 r6 = r6.n()
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = defpackage.wz3.u(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            r2 = r5
        L55:
            cloud.mindbox.mobile_sdk.models.Configuration r6 = (cloud.mindbox.mobile_sdk.models.Configuration) r6
            nk6 r4 = defpackage.nk6.a
            wc4 r2 = r2.h
            r0.a = r4
            r0.d = r3
            java.lang.Object r6 = r2.n(r6, r0)
            if (r6 != r1) goto L66
            return r1
        L66:
            r0 = r4
        L67:
            java.lang.String r6 = (java.lang.String) r6
            r0.t(r6)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm6.d(cv1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // defpackage.fm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.cv1<? super java.util.List<defpackage.fx4>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gm6.c
            if (r0 == 0) goto L13
            r0 = r5
            gm6$c r0 = (defpackage.gm6.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gm6$c r0 = new gm6$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.vk9.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.vk9.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.o(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            lx4 r5 = (defpackage.lx4) r5
            java.util.List r5 = r5.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm6.e(cv1):java.lang.Object");
    }
}
