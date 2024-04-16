package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.iw5;
import defpackage.ke4;
import defpackage.lba;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: GoogleGeoLocationProviderImpl.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u0014\u0010\t\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001f"}, d2 = {"Lqg4;", "Lie4;", "Lcom/google/android/gms/location/LocationRequest;", "Lcom/dodopizza/location/gms/GMSLocationRequest;", "gmsLocationRequest", "Lcom/google/android/gms/location/LocationSettingsRequest;", "i", "Law5;", "locationRequest", "n", "Loz3;", "Lke4;", "k", "l", "Laga;", Image.TYPE_MEDIUM, "Lcom/google/android/gms/common/api/ApiException;", "exception", "Liw5;", "j", com.huawei.hms.opendevice.c.a, "b", "a", "Lp94;", "Lp94;", "fusedLocationProviderClient", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "location-gms_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: qg4  reason: default package */
/* loaded from: classes2.dex */
public final class qg4 implements ie4 {
    private final p94 a;
    private final Context b;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    /* renamed from: qg4$a */
    /* loaded from: classes2.dex */
    public static final class a implements oz3<iw5> {
        final /* synthetic */ oz3 a;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
        /* renamed from: qg4$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0485a implements pz3<hw5> {
            final /* synthetic */ pz3 a;
            final /* synthetic */ a b;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@"}, d2 = {"T", "value", "Lcv1;", "", "continuation", "", "emit"}, k = 3, mv = {1, 4, 2})
            @nn2(c = "com.dodopizza.location.gms.GoogleGeoLocationProviderImpl$checkLocationSettings$$inlined$map$1$2", f = "GoogleGeoLocationProviderImpl.kt", l = {135}, m = "emit")
            /* renamed from: qg4$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0486a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0486a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0485a.this.emit(null, this);
                }
            }

            public C0485a(pz3 pz3Var, a aVar) {
                this.a = pz3Var;
                this.b = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(defpackage.hw5 r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.qg4.a.C0485a.C0486a
                    if (r0 == 0) goto L13
                    r0 = r6
                    qg4$a$a$a r0 = (defpackage.qg4.a.C0485a.C0486a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    qg4$a$a$a r0 = new qg4$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    hw5 r5 = (defpackage.hw5) r5
                    iw5$c r5 = defpackage.iw5.c.a
                    if (r5 == 0) goto L48
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                L48:
                    java.lang.NullPointerException r5 = new java.lang.NullPointerException
                    java.lang.String r6 = "null cannot be cast to non-null type com.dodopizza.location.geolocation.provider.LocationSettingsResult"
                    r5.<init>(r6)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qg4.a.C0485a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super iw5> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0485a(pz3Var, this), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: GoogleGeoLocationProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Law5;", "p1", "Lcom/google/android/gms/location/LocationRequest;", "Lcom/dodopizza/location/gms/GMSLocationRequest;", "b", "(Law5;)Lcom/google/android/gms/location/LocationRequest;"}, k = 3, mv = {1, 4, 2})
    /* renamed from: qg4$b */
    /* loaded from: classes2.dex */
    static final /* synthetic */ class b extends m94 implements Function1<aw5, LocationRequest> {
        b(qg4 qg4Var) {
            super(1, qg4Var, qg4.class, "toGmsLocationRequest", "toGmsLocationRequest(Lcom/dodopizza/location/geolocation/LocationRequest;)Lcom/google/android/gms/location/LocationRequest;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final LocationRequest invoke(aw5 aw5Var) {
            z65.h(aw5Var, "p1");
            return ((qg4) this.receiver).n(aw5Var);
        }
    }

    /* compiled from: GoogleGeoLocationProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/location/LocationRequest;", "Lcom/dodopizza/location/gms/GMSLocationRequest;", "p1", "Lcom/google/android/gms/location/LocationSettingsRequest;", "b", "(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/LocationSettingsRequest;"}, k = 3, mv = {1, 4, 2})
    /* renamed from: qg4$c */
    /* loaded from: classes2.dex */
    static final /* synthetic */ class c extends m94 implements Function1<LocationRequest, LocationSettingsRequest> {
        c(qg4 qg4Var) {
            super(1, qg4Var, qg4.class, "createLocationSettingsRequest", "createLocationSettingsRequest(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/LocationSettingsRequest;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final LocationSettingsRequest invoke(LocationRequest locationRequest) {
            z65.h(locationRequest, "p1");
            return ((qg4) this.receiver).i(locationRequest);
        }
    }

    /* compiled from: GoogleGeoLocationProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/android/gms/location/LocationSettingsRequest;", "kotlin.jvm.PlatformType", "p1", "Ly6b;", "Lhw5;", "b", "(Lcom/google/android/gms/location/LocationSettingsRequest;)Ly6b;"}, k = 3, mv = {1, 4, 2})
    /* renamed from: qg4$d */
    /* loaded from: classes2.dex */
    static final /* synthetic */ class d extends m94 implements Function1<LocationSettingsRequest, y6b<hw5>> {
        d(aga agaVar) {
            super(1, agaVar, aga.class, "checkLocationSettings", "checkLocationSettings(Lcom/google/android/gms/location/LocationSettingsRequest;)Lcom/google/android/gms/tasks/Task;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final y6b<hw5> invoke(LocationSettingsRequest locationSettingsRequest) {
            return ((aga) this.receiver).y(locationSettingsRequest);
        }
    }

    /* compiled from: GoogleGeoLocationProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly6b;", "Lhw5;", "kotlin.jvm.PlatformType", "p1", "Loz3;", "b", "(Ly6b;)Loz3;"}, k = 3, mv = {1, 4, 2})
    /* renamed from: qg4$e */
    /* loaded from: classes2.dex */
    static final /* synthetic */ class e extends m94 implements Function1<y6b<hw5>, oz3<? extends hw5>> {
        public static final e a = new e();

        e() {
            super(1, p7b.class, "toFlow", "toFlow(Lcom/google/android/gms/tasks/Task;)Lkotlinx/coroutines/flow/Flow;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final oz3<hw5> invoke(y6b<hw5> y6bVar) {
            z65.h(y6bVar, "p1");
            return p7b.b(y6bVar);
        }
    }

    /* compiled from: GoogleGeoLocationProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpz3;", "Liw5;", "", "exception", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @nn2(c = "com.dodopizza.location.gms.GoogleGeoLocationProviderImpl$checkLocationSettings$6", f = "GoogleGeoLocationProviderImpl.kt", l = {48}, m = "invokeSuspend")
    /* renamed from: qg4$f */
    /* loaded from: classes2.dex */
    static final class f extends f3b implements y84<pz3<? super iw5>, Throwable, cv1<? super Unit>, Object> {
        private /* synthetic */ Object a;
        private /* synthetic */ Object b;
        int c;

        f(cv1 cv1Var) {
            super(3, cv1Var);
        }

        public final cv1<Unit> create(pz3<? super iw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            z65.h(pz3Var, "$this$create");
            z65.h(th, "exception");
            z65.h(cv1Var, "continuation");
            f fVar = new f(cv1Var);
            fVar.a = pz3Var;
            fVar.b = th;
            return fVar;
        }

        @Override // defpackage.y84
        public final Object invoke(pz3<? super iw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(pz3Var, th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                pz3 pz3Var = (pz3) this.a;
                Throwable th = (Throwable) this.b;
                if (th instanceof ApiException) {
                    iw5 j = qg4.this.j((ApiException) th);
                    this.a = null;
                    this.c = 1;
                    if (pz3Var.emit(j, this) == d) {
                        return d;
                    }
                } else {
                    throw th;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GoogleGeoLocationProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldl8;", "Lke4;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @nn2(c = "com.dodopizza.location.gms.GoogleGeoLocationProviderImpl$requestLastLocation$1", f = "GoogleGeoLocationProviderImpl.kt", l = {86}, m = "invokeSuspend")
    /* renamed from: qg4$g */
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements Function2<dl8<? super ke4>, cv1<? super Unit>, Object> {
        private /* synthetic */ Object a;
        int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GoogleGeoLocationProviderImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly6b;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "result", "", "a", "(Ly6b;)V"}, k = 3, mv = {1, 4, 2})
        /* renamed from: qg4$g$a */
        /* loaded from: classes2.dex */
        public static final class a<TResult> implements n77<Location> {
            final /* synthetic */ dl8 a;

            a(dl8 dl8Var) {
                this.a = dl8Var;
            }

            @Override // defpackage.n77
            public final void a(y6b<Location> y6bVar) {
                z65.h(y6bVar, "result");
                if (!y6bVar.q()) {
                    dl8 dl8Var = this.a;
                    Throwable l = y6bVar.l();
                    if (l == null) {
                        l = new RuntimeException("Location request failure");
                    }
                    dl8Var.v(l);
                    return;
                }
                Location m = y6bVar.m();
                if (m != null) {
                    dw0.b(this.a, new ke4.b(m));
                }
                lba.a.a(this.a, null, 1, null);
            }
        }

        g(cv1 cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z65.h(cv1Var, "completion");
            g gVar = new g(cv1Var);
            gVar.a = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(dl8<? super ke4> dl8Var, cv1<? super Unit> cv1Var) {
            return ((g) create(dl8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                dl8 dl8Var = (dl8) this.a;
                qg4.this.a.y().c(new a(dl8Var));
                this.b = 1;
                if (bl8.b(dl8Var, null, this, 1, null) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: GoogleGeoLocationProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Law5;", "p1", "Lcom/google/android/gms/location/LocationRequest;", "Lcom/dodopizza/location/gms/GMSLocationRequest;", "b", "(Law5;)Lcom/google/android/gms/location/LocationRequest;"}, k = 3, mv = {1, 4, 2})
    /* renamed from: qg4$h */
    /* loaded from: classes2.dex */
    static final /* synthetic */ class h extends m94 implements Function1<aw5, LocationRequest> {
        h(qg4 qg4Var) {
            super(1, qg4Var, qg4.class, "toGmsLocationRequest", "toGmsLocationRequest(Lcom/dodopizza/location/geolocation/LocationRequest;)Lcom/google/android/gms/location/LocationRequest;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final LocationRequest invoke(aw5 aw5Var) {
            z65.h(aw5Var, "p1");
            return ((qg4) this.receiver).n(aw5Var);
        }
    }

    /* compiled from: GoogleGeoLocationProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/android/gms/location/LocationRequest;", "Lcom/dodopizza/location/gms/GMSLocationRequest;", "p1", "Loz3;", "Lke4;", "b", "(Lcom/google/android/gms/location/LocationRequest;)Loz3;"}, k = 3, mv = {1, 4, 2})
    /* renamed from: qg4$i */
    /* loaded from: classes2.dex */
    static final /* synthetic */ class i extends m94 implements Function1<LocationRequest, oz3<? extends ke4>> {
        i(qg4 qg4Var) {
            super(1, qg4Var, qg4.class, "requestLocationUpdates", "requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;)Lkotlinx/coroutines/flow/Flow;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final oz3<ke4> invoke(LocationRequest locationRequest) {
            z65.h(locationRequest, "p1");
            return ((qg4) this.receiver).l(locationRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GoogleGeoLocationProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldl8;", "Lke4;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @nn2(c = "com.dodopizza.location.gms.GoogleGeoLocationProviderImpl$requestLocationUpdates$3", f = "GoogleGeoLocationProviderImpl.kt", l = {117}, m = "invokeSuspend")
    /* renamed from: qg4$j */
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function2<dl8<? super ke4>, cv1<? super Unit>, Object> {
        private /* synthetic */ Object a;
        int b;
        final /* synthetic */ LocationRequest d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GoogleGeoLocationProviderImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly6b;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "result", "", "a", "(Ly6b;)V"}, k = 3, mv = {1, 4, 2})
        /* renamed from: qg4$j$a */
        /* loaded from: classes2.dex */
        public static final class a<TResult> implements n77<Void> {
            final /* synthetic */ dl8 a;

            a(dl8 dl8Var) {
                this.a = dl8Var;
            }

            @Override // defpackage.n77
            public final void a(y6b<Void> y6bVar) {
                z65.h(y6bVar, "result");
                if (!y6bVar.q()) {
                    dl8 dl8Var = this.a;
                    Throwable l = y6bVar.l();
                    if (l == null) {
                        l = new RuntimeException("Location request failure");
                    }
                    dl8Var.v(l);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GoogleGeoLocationProviderImpl.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
        /* renamed from: qg4$j$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<Unit> {
            final /* synthetic */ c b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(0);
                this.b = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                qg4.this.a.z(this.b);
            }
        }

        /* compiled from: GoogleGeoLocationProviderImpl.kt */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"qg4$j$c", "Lpv5;", "Lcom/google/android/gms/location/LocationResult;", "result", "", "b", "Lcom/google/android/gms/location/LocationAvailability;", "la", "a", "location-gms_release"}, k = 1, mv = {1, 4, 2})
        /* renamed from: qg4$j$c */
        /* loaded from: classes2.dex */
        public static final class c extends pv5 {
            final /* synthetic */ dl8 a;

            c(dl8<? super ke4> dl8Var) {
                this.a = dl8Var;
            }

            @Override // defpackage.pv5
            public void a(LocationAvailability locationAvailability) {
                if (locationAvailability == null || !locationAvailability.h()) {
                    this.a.v(new RuntimeException("Location is no longer available"));
                }
            }

            @Override // defpackage.pv5
            public void b(LocationResult locationResult) {
                Location h;
                if (locationResult != null && (h = locationResult.h()) != null && !this.a.w()) {
                    dw0.b(this.a, new ke4.b(h));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(LocationRequest locationRequest, cv1 cv1Var) {
            super(2, cv1Var);
            this.d = locationRequest;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z65.h(cv1Var, "completion");
            j jVar = new j(this.d, cv1Var);
            jVar.a = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(dl8<? super ke4> dl8Var, cv1<? super Unit> cv1Var) {
            return ((j) create(dl8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                dl8 dl8Var = (dl8) this.a;
                c cVar = new c(dl8Var);
                qg4.this.a.A(this.d, cVar, Looper.getMainLooper()).c(new a(dl8Var));
                b bVar = new b(cVar);
                this.b = 1;
                if (bl8.a(dl8Var, bVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public qg4(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.b = context;
        p94 a2 = dw5.a(context);
        z65.g(a2, "LocationServices.getFuse…onProviderClient(context)");
        this.a = a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationSettingsRequest i(LocationRequest locationRequest) {
        LocationSettingsRequest b2 = new LocationSettingsRequest.a().a(locationRequest).b();
        z65.g(b2, "LocationSettingsRequest.…onRequest)\n      .build()");
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final iw5 j(ApiException apiException) {
        iw5.a aVar;
        if (apiException instanceof ResolvableApiException) {
            PendingIntent c2 = ((ResolvableApiException) apiException).c();
            if (c2 != null) {
                return new iw5.b(new gj9(c2));
            }
            aVar = new iw5.a(apiException);
        } else {
            aVar = new iw5.a(apiException);
        }
        return aVar;
    }

    private final oz3<ke4> k() {
        return wz3.g(new g(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<ke4> l(LocationRequest locationRequest) {
        return wz3.g(new j(locationRequest, null));
    }

    private final aga m() {
        aga b2 = dw5.b(this.b);
        z65.g(b2, "LocationServices.getSettingsClient(context)");
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationRequest n(aw5 aw5Var) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.p(aw5Var.c());
        locationRequest.t(aw5Var.b());
        locationRequest.k(aw5Var.a());
        return locationRequest;
    }

    @Override // defpackage.ie4
    public oz3<ke4> a() {
        return k();
    }

    @Override // defpackage.ie4
    public oz3<ke4> b(aw5 aw5Var) {
        z65.h(aw5Var, "locationRequest");
        return (oz3) blb.c(blb.c(aw5Var, new h(this)), new i(this));
    }

    @Override // defpackage.ie4
    public oz3<iw5> c(aw5 aw5Var) {
        z65.h(aw5Var, "locationRequest");
        return wz3.h(new a((oz3) blb.c(blb.c(blb.c(blb.c(aw5Var, new b(this)), new c(this)), new d(m())), e.a)), new f(null));
    }
}
