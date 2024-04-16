package com.dodopizza.order.feature.combinedmap.presentation;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.suggestions.presentation.a;
import com.dodopizza.geo.feature.suggestions.presentation.b;
import com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter;
import com.dodopizza.order.feature.selectionmap.presentation.b;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk7;
import defpackage.ny2;
import defpackage.rz2;
import defpackage.w98;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CombinedSelectionMapPresenter.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BA\b\u0007\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0014J\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0003J\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0003J\u000e\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0012R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R#\u0010D\u001a\n ?*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010M¨\u0006T"}, d2 = {"Lcom/dodopizza/order/feature/combinedmap/presentation/CombinedSelectionMapPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lpg1;", "", "z", "Lt88;", "pizzeriaInfo", "Lo9a;", "B", "onFirstViewAttach", "J", "I", "M", "N", "Lev2;", "openSuggestionsData", "K", "x", "", "number", "w", "y", "G", "C", "Liv0;", "changeLocationResult", "D", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$a;", "newLocationResult", "F", "H", "E", "orderType", "P", "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "a", "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "data", "Lf63;", "b", "Lf63;", "router", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lla8;", DateTokenConverter.CONVERTER_KEY, "Lla8;", "pizzeriasFilterService", "Lpy1;", com.huawei.hms.push.e.a, "Lpy1;", "countryNameService", "Lhq3;", "f", "Lhq3;", "featureService", "Ljg1;", "g", "Ljg1;", "interactor", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lrn5;", "A", "()Lorg/slf4j/Logger;", "logger", "i", "Lt88;", "selectedPizzeriaInfo", "j", "Ljava/lang/String;", "lookingAddress", "", "k", "Z", "isPizzeriaFromSuggestion", "l", "isDeliveryFromSuggestion", "<init>", "(Lcom/dodopizza/order/feature/selectionmap/presentation/f;Lf63;Lgc;Lla8;Lpy1;Lhq3;Ljg1;)V", Image.TYPE_MEDIUM, "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CombinedSelectionMapPresenter extends BasePresenter<pg1> {
    public static final a m = new a(null);
    public static final int n = 8;
    private static final int o = gy8.pizzeria_suggestions_result;
    private static final int p = gy8.delivery_suggestions_result;
    private final com.dodopizza.order.feature.selectionmap.presentation.f a;
    private final f63 b;
    private final gc c;
    private final la8 d;
    private final py1 e;
    private final hq3 f;
    private final jg1 g;
    private final rn5 h;
    private t88 i;
    private String j;
    private boolean k;
    private boolean l;

    /* compiled from: CombinedSelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/dodopizza/order/feature/combinedmap/presentation/CombinedSelectionMapPresenter$a;", "", "", "DELIVERY_SUGGESTIONS_RESULT_ID", "I", "a", "()I", "PIZZERIA_SUGGESTIONS_RESULT_ID", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return CombinedSelectionMapPresenter.p;
        }
    }

    /* compiled from: CombinedSelectionMapPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[naa.values().length];
            try {
                iArr[naa.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[naa.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[naa.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[naa.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[hn3.values().length];
            try {
                iArr2[hn3.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[hn3.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[hn3.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CombinedSelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u008a@"}, d2 = {"", "Lru/dodopizza/app/domain/country/models/CountryIsoName;", "isoName", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$getCountry$1", f = "CombinedSelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((c) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = (String) this.b;
                ((pg1) CombinedSelectionMapPresenter.this.getViewState()).qg(CombinedSelectionMapPresenter.this.e.a(str), str);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CombinedSelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$getCountry$2", f = "CombinedSelectionMapPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                CombinedSelectionMapPresenter.this.A().error("Failed to get country name", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CombinedSelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<Logger> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("CombinedSelectionMapPresenter");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$openDeliverySuggestions$$inlined$listenOnce$1$2", f = "CombinedSelectionMapPresenter.kt", l = {224}, m = "emit")
            /* renamed from: com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0171a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0171a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter.f.a.C0171a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$f$a$a r0 = (com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter.f.a.C0171a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$f$a$a r0 = new com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$f$a$a
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
                    boolean r2 = r5 instanceof com.dodopizza.geo.feature.suggestions.presentation.b
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter.f.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public f(oz3 oz3Var) {
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

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class g extends j6 implements Function2<com.dodopizza.geo.feature.suggestions.presentation.b, cv1<? super Unit>, Object> {
        public g(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(com.dodopizza.geo.feature.suggestions.presentation.b bVar, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, bVar, cv1Var);
            return b;
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/dodopizza/order/feature/combinedmap/presentation/CombinedSelectionMapPresenter$h", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class h implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public h(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(com.dodopizza.geo.feature.suggestions.presentation.a.class.getModifiers())) {
                String name = com.dodopizza.geo.feature.suggestions.presentation.a.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + com.dodopizza.geo.feature.suggestions.presentation.a.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dodopizza.geo.feature.suggestions.presentation.a, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public com.dodopizza.geo.feature.suggestions.presentation.a a() {
            return (Fragment) this.c.invoke();
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.k6c
        public boolean d() {
            return this.b;
        }
    }

    /* compiled from: CombinedSelectionMapPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/a;", "a", "()Lcom/dodopizza/geo/feature/suggestions/presentation/a;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function0<com.dodopizza.geo.feature.suggestions.presentation.a> {
        final /* synthetic */ ev2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ev2 ev2Var) {
            super(0);
            this.b = ev2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.dodopizza.geo.feature.suggestions.presentation.a invoke() {
            String str;
            a.C0158a c0158a = com.dodopizza.geo.feature.suggestions.presentation.a.n;
            ny2.a aVar = ny2.K;
            int a = CombinedSelectionMapPresenter.m.a();
            String b = CombinedSelectionMapPresenter.this.a.b();
            String f = this.b.f();
            dt5 d = CombinedSelectionMapPresenter.this.a.d();
            if (d != null) {
                str = d.getId();
            } else {
                str = null;
            }
            return c0158a.a(ny2.a.d(aVar, a, b, f, str, this.b.j().d(), ck1.v, false, false, false, 448, null));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class j implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$showPizzeriasSuggestion$$inlined$listenOnce$1$2", f = "CombinedSelectionMapPresenter.kt", l = {224}, m = "emit")
            /* renamed from: com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$j$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0172a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0172a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter.j.a.C0172a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$j$a$a r0 = (com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter.j.a.C0172a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$j$a$a r0 = new com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter$j$a$a
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
                    boolean r2 = r5 instanceof defpackage.w98
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter.j.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public j(oz3 oz3Var) {
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

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class k extends j6 implements Function2<w98, cv1<? super Unit>, Object> {
        public k(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(w98 w98Var, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, w98Var, cv1Var);
            return b;
        }
    }

    public CombinedSelectionMapPresenter(com.dodopizza.order.feature.selectionmap.presentation.f fVar, f63 f63Var, gc gcVar, la8 la8Var, py1 py1Var, hq3 hq3Var, jg1 jg1Var) {
        rn5 b2;
        z65.h(fVar, "data");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(la8Var, "pizzeriasFilterService");
        z65.h(py1Var, "countryNameService");
        z65.h(hq3Var, "featureService");
        z65.h(jg1Var, "interactor");
        this.a = fVar;
        this.b = f63Var;
        this.c = gcVar;
        this.d = la8Var;
        this.e = py1Var;
        this.f = hq3Var;
        this.g = jg1Var;
        b2 = yn5.b(e.a);
        this.h = b2;
        this.j = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger A() {
        return (Logger) this.h.getValue();
    }

    private final o9a B(t88 t88Var) {
        int i2 = b.$EnumSwitchMapping$1[t88Var.c().ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (t88Var.b().G().contains(ib7.e)) {
                return o9a.b;
            }
            return o9a.a;
        }
        return o9a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(CombinedSelectionMapPresenter combinedSelectionMapPresenter, com.dodopizza.geo.feature.suggestions.presentation.b bVar) {
        z65.h(combinedSelectionMapPresenter, "this$0");
        z65.h(bVar, "result");
        if (bVar instanceof b.a) {
            combinedSelectionMapPresenter.l = true;
            b.a aVar = (b.a) bVar;
            ((pg1) combinedSelectionMapPresenter.getViewState()).pd(aVar.a(), aVar.b());
            return;
        }
        combinedSelectionMapPresenter.l = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(CombinedSelectionMapPresenter combinedSelectionMapPresenter, w98 w98Var) {
        z65.h(combinedSelectionMapPresenter, "this$0");
        z65.h(w98Var, "result");
        if (w98Var instanceof w98.b) {
            ((pg1) combinedSelectionMapPresenter.getViewState()).c5(null);
            w98.b bVar = (w98.b) w98Var;
            ((pg1) combinedSelectionMapPresenter.getViewState()).Y7(bVar.b().g(), bVar.c());
            combinedSelectionMapPresenter.j = bVar.a();
            combinedSelectionMapPresenter.k = true;
            return;
        }
        combinedSelectionMapPresenter.j = "";
        combinedSelectionMapPresenter.k = false;
        ((pg1) combinedSelectionMapPresenter.getViewState()).c5(null);
    }

    private final void z() {
        p(z77.a(y87.a(this.g.c(this.a.b()), new c(null)), new d(null)));
    }

    public final void C() {
        if (this.a.k() == naa.c) {
            this.d.b();
        }
        this.c.a(ix9.b());
        this.b.i(this.a.f(), b.C0202b.a);
    }

    public final void D(iv0 iv0Var) {
        z65.h(iv0Var, "changeLocationResult");
        this.b.l(this.a.f(), new rz2.a(iv0Var));
    }

    public final void E() {
        this.b.l(this.a.f(), new rz2.c(sz2.d));
    }

    public final void F(c.a.C0131a c0131a) {
        z65.h(c0131a, "newLocationResult");
        this.b.i(this.a.f(), new rz2.b(c0131a));
    }

    public final void G() {
        lk7.d dVar;
        t88 t88Var = this.i;
        if (t88Var != null) {
            if (this.k) {
                dVar = lk7.d.e;
            } else if (t88Var.e()) {
                dVar = lk7.d.b;
            } else {
                dVar = lk7.d.d;
            }
            this.c.a(lk7.a.c(t88Var.b(), dVar, Boolean.valueOf(t88Var.d())));
            this.b.l(this.a.f(), new b.a(t88Var.b(), B(t88Var), Boolean.valueOf(t88Var.d())));
        }
        if (this.a.k() == naa.c) {
            this.d.b();
        }
    }

    public final void H() {
        this.b.i(this.a.f(), new rz2.c(sz2.c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 != 4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            r2 = this;
            moxy.MvpView r0 = r2.getViewState()
            pg1 r0 = (defpackage.pg1) r0
            r0.D9()
            com.dodopizza.order.feature.selectionmap.presentation.f r0 = r2.a
            naa r0 = r0.k()
            int[] r1 = com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter.b.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L2e
            r1 = 2
            if (r0 == r1) goto L24
            r1 = 3
            if (r0 == r1) goto L2e
            r1 = 4
            if (r0 == r1) goto L24
            goto L39
        L24:
            moxy.MvpView r0 = r2.getViewState()
            pg1 r0 = (defpackage.pg1) r0
            r0.q4()
            goto L39
        L2e:
            moxy.MvpView r0 = r2.getViewState()
            pg1 r0 = (defpackage.pg1) r0
            boolean r1 = r2.l
            r0.Y5(r1)
        L39:
            moxy.MvpView r0 = r2.getViewState()
            pg1 r0 = (defpackage.pg1) r0
            r0.n1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter.I():void");
    }

    public final void J() {
        int i2 = b.$EnumSwitchMapping$0[this.a.k().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                }
            }
            ((pg1) getViewState()).C3();
            return;
        }
        ((pg1) getViewState()).V1();
        ((pg1) getViewState()).L9();
    }

    public final void K(ev2 ev2Var) {
        z65.h(ev2Var, "openSuggestionsData");
        this.b.e(new h(false, new i(ev2Var)));
        f63 f63Var = this.b;
        int i2 = p;
        wz3.C(uz3.a.a(new f(f63Var.k(i2)), new g(new wk9() { // from class: mg1
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                CombinedSelectionMapPresenter.L(CombinedSelectionMapPresenter.this, (com.dodopizza.geo.feature.suggestions.presentation.b) obj);
            }
        })), PresenterScopeKt.getPresenterScope(this));
    }

    public final void M(t88 t88Var) {
        z65.h(t88Var, "pizzeriaInfo");
        if (this.a.k() == naa.c || this.a.k() == naa.d) {
            ((pg1) getViewState()).l6();
        }
        this.i = t88Var;
        ((pg1) getViewState()).tb(t88Var);
    }

    public final void N() {
        this.b.e(x98.a(new i98(this.a.d(), this.j, this.a.b(), this.a.k(), this.a.c(), false, false, 96, null)));
        f63 f63Var = this.b;
        int i2 = o;
        wz3.C(uz3.a.a(new j(f63Var.k(i2)), new k(new wk9() { // from class: lg1
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                CombinedSelectionMapPresenter.O(CombinedSelectionMapPresenter.this, (w98) obj);
            }
        })), PresenterScopeKt.getPresenterScope(this));
    }

    public final void P(String str) {
        z65.h(str, "orderType");
        this.c.a(ix9.c(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        if (this.f.a(bq3.M6)) {
            ((pg1) getViewState()).x5();
        } else {
            ((pg1) getViewState()).T8();
        }
        if (this.a.k() == naa.b || this.a.k() == naa.a) {
            ((pg1) getViewState()).Oe();
        }
        int i2 = b.$EnumSwitchMapping$0[this.a.k().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                I();
            }
        } else {
            J();
        }
        z();
    }

    public final void w(String str) {
        z65.h(str, "number");
        ((pg1) getViewState()).K(str);
    }

    public final void x() {
        if (this.k) {
            N();
        } else if (this.a.k() != naa.b && this.a.k() != naa.a) {
            if (this.a.k() == naa.c || this.a.k() == naa.d) {
                ((pg1) getViewState()).D9();
            }
        } else {
            ((pg1) getViewState()).L9();
        }
        ((pg1) getViewState()).Wf();
    }

    public final void y() {
        this.b.e(a5a.a(new n4a(false, "")));
    }
}
