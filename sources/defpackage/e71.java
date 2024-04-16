package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.b;
import com.dodopizza.onboarding.feature.chooseordertype.presentation.a;
import com.dodopizza.order.feature.selectionmap.presentation.b;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hv0;
import defpackage.ny2;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: ChooseOrderTypeRouterImpl.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001.B'\u0012\u0006\u00101\u001a\u00020/\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00105\u001a\u000203\u0012\u0006\u00108\u001a\u000206¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J2\u0010\u0017\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u0019\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000eH\u0016J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\fH\u0096@¢\u0006\u0004\b#\u0010$J*\u0010(\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010+\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u000eH\u0016J\b\u0010,\u001a\u00020\u0010H\u0016J\b\u0010-\u001a\u00020\u0010H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bH\u0016R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00100R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00107¨\u0006;"}, d2 = {"Le71;", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a;", "Lqg1;", "result", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$d;", "o", "Ltl5;", "currentLanguage", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b$a$b;", "n", "", "isEmptyCart", "Ldt5;", "currentLocality", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "b", "j", "Lhv0$b;", "localitySelectionResult", "Lnaa;", MessageAttributes.TYPE, "i", "(Lhv0$b;Lnaa;Ljava/lang/String;ZLcv1;)Ljava/lang/Object;", "g", "(Ldt5;Ljava/lang/String;Lnaa;ZLcv1;)Ljava/lang/Object;", "Loz3;", "f", "k", "l", "locality", "language", DateTokenConverter.CONVERTER_KEY, "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$c;", com.huawei.hms.opendevice.c.a, "(Ldt5;Lcv1;)Ljava/lang/Object;", "pizzeriaId", "pizzeriaHasRestaurantOperationalType", "languageConfig", com.huawei.hms.push.e.a, "isFirstAppStart", "deviceLocalityCode", Image.TYPE_HIGH, Image.TYPE_MEDIUM, "onBackPressed", "a", "Lf63;", "Lf63;", "globalRouter", "onboardingRouter", "Lhq3;", "Lhq3;", "featureService", "Lih4;", "Lih4;", "googlePlayServicesHelper", "<init>", "(Lf63;Lf63;Lhq3;Lih4;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: e71  reason: default package */
/* loaded from: classes4.dex */
public final class e71 implements com.dodopizza.onboarding.feature.chooseordertype.presentation.a {
    public static final a e = new a(null);
    private final f63 a;
    private final f63 b;
    private final hq3 c;
    private final ih4 d;

    /* compiled from: ChooseOrderTypeRouterImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Le71$a;", "", "", "CHANGE_LOCALITY_REQUEST_ID", "I", "CHANGE_LOCALITY_RESULT_ID", "ONBOARDING_COMBINED_MAP_RESULT_ID", "PICKUP_ONBOARDING_FLOW_REQUEST_ID", "SELECT_LOCALITY_RESULT", "SELECT_PIZZERIA_RESULT", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e71$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ChooseOrderTypeRouterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e71$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[sz2.values().length];
            try {
                iArr[sz2.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sz2.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sz2.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sz2.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e71$c */
    /* loaded from: classes4.dex */
    public static final class c implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: e71$c$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.impl.onboarding.ChooseOrderTypeRouterImpl$listenForChangeLocalityRequest$$inlined$resultsFlowOf$1$2", f = "ChooseOrderTypeRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: e71$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0295a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0295a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.e71.c.a.C0295a
                    if (r0 == 0) goto L13
                    r0 = r6
                    e71$c$a$a r0 = (defpackage.e71.c.a.C0295a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    e71$c$a$a r0 = new e71$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof defpackage.hv0.b
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e71$d */
    /* loaded from: classes4.dex */
    public static final class d implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: e71$d$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.impl.onboarding.ChooseOrderTypeRouterImpl$listenForPickupFlowRequests$$inlined$resultsFlowOf$1$2", f = "ChooseOrderTypeRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: e71$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0296a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0296a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.e71.d.a.C0296a
                    if (r0 == 0) goto L13
                    r0 = r6
                    e71$d$a$a r0 = (defpackage.e71.d.a.C0296a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    e71$d$a$a r0 = new e71$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof kotlin.Unit
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.d.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public d(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e71$e */
    /* loaded from: classes4.dex */
    public static final class e implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: e71$e$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.impl.onboarding.ChooseOrderTypeRouterImpl$navigateToCombinedDeliveryScreen$$inlined$waitForResult$1$2", f = "ChooseOrderTypeRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: e71$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0297a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0297a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.e71.e.a.C0297a
                    if (r0 == 0) goto L13
                    r0 = r6
                    e71$e$a$a r0 = (defpackage.e71.e.a.C0297a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    e71$e$a$a r0 = new e71$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof defpackage.qg1
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.e.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public e(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChooseOrderTypeRouterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.impl.onboarding.ChooseOrderTypeRouterImpl", f = "ChooseOrderTypeRouterImpl.kt", l = {318}, m = "navigateToCombinedDeliveryScreen")
    /* renamed from: e71$f */
    /* loaded from: classes4.dex */
    public static final class f extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        f(cv1<? super f> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return e71.this.g(null, null, null, false, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e71$g */
    /* loaded from: classes4.dex */
    public static final class g implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: e71$g$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.impl.onboarding.ChooseOrderTypeRouterImpl$navigateToCombinedPizzeriaScreen$$inlined$waitForResult$1$2", f = "ChooseOrderTypeRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: e71$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0298a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0298a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.e71.g.a.C0298a
                    if (r0 == 0) goto L13
                    r0 = r6
                    e71$g$a$a r0 = (defpackage.e71.g.a.C0298a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    e71$g$a$a r0 = new e71$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof defpackage.qg1
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.g.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public g(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChooseOrderTypeRouterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.impl.onboarding.ChooseOrderTypeRouterImpl", f = "ChooseOrderTypeRouterImpl.kt", l = {318}, m = "navigateToCombinedPizzeriaScreen")
    /* renamed from: e71$h */
    /* loaded from: classes4.dex */
    public static final class h extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        h(cv1<? super h> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return e71.this.i(null, null, null, false, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e71$i */
    /* loaded from: classes4.dex */
    public static final class i implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: e71$i$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.impl.onboarding.ChooseOrderTypeRouterImpl$navigateToSelectPizzeria$$inlined$waitForResult$1$2", f = "ChooseOrderTypeRouterImpl.kt", l = {224}, m = "emit")
            /* renamed from: e71$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0299a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0299a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.e71.i.a.C0299a
                    if (r0 == 0) goto L13
                    r0 = r6
                    e71$i$a$a r0 = (defpackage.e71.i.a.C0299a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    e71$i$a$a r0 = new e71$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof defpackage.d98
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.i.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public i(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChooseOrderTypeRouterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.impl.onboarding.ChooseOrderTypeRouterImpl", f = "ChooseOrderTypeRouterImpl.kt", l = {318}, m = "navigateToSelectPizzeria")
    /* renamed from: e71$j */
    /* loaded from: classes4.dex */
    public static final class j extends ev1 {
        /* synthetic */ Object a;
        int c;

        j(cv1<? super j> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return e71.this.c(null, this);
        }
    }

    public e71(f63 f63Var, f63 f63Var2, hq3 hq3Var, ih4 ih4Var) {
        z65.h(f63Var, "globalRouter");
        z65.h(f63Var2, "onboardingRouter");
        z65.h(hq3Var, "featureService");
        z65.h(ih4Var, "googlePlayServicesHelper");
        this.a = f63Var;
        this.b = f63Var2;
        this.c = hq3Var;
        this.d = ih4Var;
    }

    private final b.a.C0154b n(tl5 tl5Var) {
        return new b.a.C0154b(new e91(ht4.a.a(), jx2.f, true), tl5Var);
    }

    private final a.d o(qg1 qg1Var) {
        a.EnumC0163a enumC0163a;
        if (qg1Var instanceof rz2) {
            int i2 = b.$EnumSwitchMapping$0[((rz2) qg1Var).a().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            enumC0163a = a.EnumC0163a.d;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        enumC0163a = a.EnumC0163a.c;
                    }
                } else {
                    enumC0163a = a.EnumC0163a.b;
                }
            } else {
                enumC0163a = a.EnumC0163a.a;
            }
            return new a.b(enumC0163a);
        } else if (qg1Var instanceof b.a) {
            b.a aVar = (b.a) qg1Var;
            return new a.c(true, aVar.a().getId(), aVar.a().w(), aVar.a().G().contains(ib7.e));
        } else {
            return new a.c(false, "", "", false);
        }
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public oz3<Unit> a() {
        return new d(this.a.k(R.id.pickup_onboarding_flow_request_id));
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public void b(boolean z, dt5 dt5Var, tl5 tl5Var, String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        g63.b(this.a, "select_delivery_address_fragment", new com.dodopizza.geo.feature.selectdeliveryaddress.b(n(tl5Var), zo9.S2.c(), z, false, dt5Var, str, jk7.d, ck1.v));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.dt5 r13, defpackage.cv1<? super com.dodopizza.onboarding.feature.chooseordertype.presentation.a.c> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.e71.j
            if (r0 == 0) goto L13
            r0 = r14
            e71$j r0 = (defpackage.e71.j) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            e71$j r0 = new e71$j
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.vk9.b(r14)
            goto L84
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            defpackage.vk9.b(r14)
            hq3 r14 = r12.c
            bq3 r2 = defpackage.bq3.e6
            boolean r14 = r14.a(r2)
            if (r14 == 0) goto L49
            ih4 r14 = r12.d
            boolean r14 = r14.a()
            if (r14 == 0) goto L49
            java.lang.String r14 = "select_pizzeria_with_google_maps"
            goto L58
        L49:
            hq3 r14 = r12.c
            bq3 r2 = defpackage.bq3.d6
            boolean r14 = r14.a(r2)
            if (r14 == 0) goto L56
            java.lang.String r14 = "select_pizzeria_combined_view"
            goto L58
        L56:
            java.lang.String r14 = "select_pizzeria"
        L58:
            f63 r2 = r12.b
            n8a r8 = defpackage.n8a.c
            gn3 r10 = defpackage.gn3.c
            x7a r11 = new x7a
            r5 = 2131362627(0x7f0a0343, float:1.834504E38)
            r6 = 0
            r9 = 0
            r4 = r11
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            defpackage.g63.b(r2, r14, r11)
            f63 r13 = r12.b
            r14 = 2131362627(0x7f0a0343, float:1.834504E38)
            oz3 r13 = r13.k(r14)
            e71$i r14 = new e71$i
            r14.<init>(r13)
            r0.c = r3
            java.lang.Object r14 = defpackage.wz3.u(r14, r0)
            if (r14 != r1) goto L84
            return r1
        L84:
            d98 r14 = (defpackage.d98) r14
            boolean r13 = r14 instanceof defpackage.d98.a
            if (r13 == 0) goto Lb0
            com.dodopizza.onboarding.feature.chooseordertype.presentation.a$c r13 = new com.dodopizza.onboarding.feature.chooseordertype.presentation.a$c
            d98$a r14 = (defpackage.d98.a) r14
            d88 r0 = r14.b()
            java.lang.String r0 = r0.getId()
            d88 r1 = r14.b()
            java.lang.String r1 = r1.w()
            d88 r14 = r14.b()
            java.util.List r14 = r14.G()
            ib7 r2 = defpackage.ib7.e
            boolean r14 = r14.contains(r2)
            r13.<init>(r3, r0, r1, r14)
            goto Lb8
        Lb0:
            com.dodopizza.onboarding.feature.chooseordertype.presentation.a$c r13 = new com.dodopizza.onboarding.feature.chooseordertype.presentation.a$c
            r14 = 0
            java.lang.String r0 = ""
            r13.<init>(r14, r0, r0, r14)
        Lb8:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.c(dt5, cv1):java.lang.Object");
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public void d(dt5 dt5Var, String str) {
        z65.h(dt5Var, "locality");
        z65.h(str, "language");
        g63.b(this.b, "landing_fragment", new pj5(dt5Var, str));
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public void e(String str, dt5 dt5Var, boolean z, tl5 tl5Var) {
        z65.h(str, "pizzeriaId");
        z65.h(dt5Var, "locality");
        this.b.l(R.id.change_locality_request_id, new hv0.c(new y58(str, dt5Var, z), tl5Var));
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public oz3<hv0.b> f() {
        return new c(this.b.k(R.id.geo_select_locality_result));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(defpackage.dt5 r22, java.lang.String r23, defpackage.naa r24, boolean r25, defpackage.cv1<? super com.dodopizza.onboarding.feature.chooseordertype.presentation.a.d> r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r26
            boolean r2 = r1 instanceof defpackage.e71.f
            if (r2 == 0) goto L17
            r2 = r1
            e71$f r2 = (defpackage.e71.f) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            e71$f r2 = new e71$f
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.b
            java.lang.Object r3 = defpackage.a75.d()
            int r4 = r2.d
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.a
            e71 r2 = (defpackage.e71) r2
            defpackage.vk9.b(r1)
            goto L83
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            defpackage.vk9.b(r1)
            f63 r1 = r0.b
            maa r12 = defpackage.maa.c
            e91$a r4 = defpackage.e91.d
            e91 r15 = r4.a()
            com.dodopizza.order.feature.selectionmap.presentation.f$a r17 = com.dodopizza.order.feature.selectionmap.presentation.f.a.a
            com.dodopizza.order.feature.selectionmap.presentation.f r4 = new com.dodopizza.order.feature.selectionmap.presentation.f
            r7 = 0
            r8 = 2131363150(0x7f0a054e, float:1.83461E38)
            r13 = 0
            r14 = 0
            r16 = 0
            r19 = 1
            r20 = 0
            r6 = r4
            r9 = r22
            r10 = r24
            r11 = r23
            r18 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            yw9 r4 = com.dodopizza.order.feature.combinedmap.presentation.b.a(r4)
            r1.e(r4)
            f63 r1 = r0.b
            r4 = 2131363150(0x7f0a054e, float:1.83461E38)
            oz3 r1 = r1.k(r4)
            e71$e r4 = new e71$e
            r4.<init>(r1)
            r2.a = r0
            r2.d = r5
            java.lang.Object r1 = defpackage.wz3.u(r4, r2)
            if (r1 != r3) goto L82
            return r3
        L82:
            r2 = r0
        L83:
            qg1 r1 = (defpackage.qg1) r1
            com.dodopizza.onboarding.feature.chooseordertype.presentation.a$d r1 = r2.o(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.g(dt5, java.lang.String, naa, boolean, cv1):java.lang.Object");
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public void h(boolean z, String str) {
        z65.h(str, "deviceLocalityCode");
        this.b.e(a5a.a(new n4a(z, str)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.hv0.b r22, defpackage.naa r23, java.lang.String r24, boolean r25, defpackage.cv1<? super com.dodopizza.onboarding.feature.chooseordertype.presentation.a.d> r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r26
            boolean r2 = r1 instanceof defpackage.e71.h
            if (r2 == 0) goto L17
            r2 = r1
            e71$h r2 = (defpackage.e71.h) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            e71$h r2 = new e71$h
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.b
            java.lang.Object r3 = defpackage.a75.d()
            int r4 = r2.d
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.a
            e71 r2 = (defpackage.e71) r2
            defpackage.vk9.b(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            defpackage.vk9.b(r1)
            f63 r1 = r0.b
            if (r22 == 0) goto L46
            dt5 r4 = r22.b()
        L44:
            r9 = r4
            goto L48
        L46:
            r4 = 0
            goto L44
        L48:
            maa r12 = defpackage.maa.c
            hn3 r14 = defpackage.hn3.c
            com.dodopizza.order.feature.selectionmap.presentation.f$a r17 = com.dodopizza.order.feature.selectionmap.presentation.f.a.a
            e91$a r4 = defpackage.e91.d
            e91 r15 = r4.a()
            com.dodopizza.order.feature.selectionmap.presentation.f r4 = new com.dodopizza.order.feature.selectionmap.presentation.f
            r7 = 0
            r8 = 2131363150(0x7f0a054e, float:1.83461E38)
            r13 = 0
            r16 = 0
            r19 = 513(0x201, float:7.19E-43)
            r20 = 0
            r6 = r4
            r10 = r23
            r11 = r24
            r18 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            yw9 r4 = com.dodopizza.order.feature.combinedmap.presentation.b.a(r4)
            r1.e(r4)
            f63 r1 = r0.b
            r4 = 2131363150(0x7f0a054e, float:1.83461E38)
            oz3 r1 = r1.k(r4)
            e71$g r4 = new e71$g
            r4.<init>(r1)
            r2.a = r0
            r2.d = r5
            java.lang.Object r1 = defpackage.wz3.u(r4, r2)
            if (r1 != r3) goto L8b
            return r3
        L8b:
            r2 = r0
        L8c:
            qg1 r1 = (defpackage.qg1) r1
            com.dodopizza.onboarding.feature.chooseordertype.presentation.a$d r1 = r2.o(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.i(hv0$b, naa, java.lang.String, boolean, cv1):java.lang.Object");
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public void j(String str, tl5 tl5Var) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(tl5Var, "currentLanguage");
        g63.b(this.b, "delivery_location_suggestions_fragment", ny2.a.b(ny2.K, R.id.change_locality_result_id, str, true, null, false, null, tl5Var, ck1.v, false, false, false, 1848, null));
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public void k() {
        this.b.c(null);
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public void l(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        g63.b(this.b, "locality_list_fragment", new ut5(str, R.id.geo_select_locality_result));
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public void m() {
        this.b.f(h56.c(null, 1, null));
    }

    @Override // com.dodopizza.onboarding.feature.chooseordertype.presentation.a
    public void onBackPressed() {
        this.b.d();
    }
}
