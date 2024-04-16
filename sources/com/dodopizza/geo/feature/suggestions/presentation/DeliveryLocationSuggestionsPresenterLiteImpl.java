package com.dodopizza.geo.feature.suggestions.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.suggestions.presentation.b;
import com.dodopizza.geo.feature.suggestions.presentation.c;
import com.dodopizza.geo.feature.suggestions.presentation.g;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.yv5;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DeliveryLocationSuggestionsPresenterLiteImpl.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002Bk\u0012\u0006\u0010*\u001a\u00020\u0014\u0012\u0006\u0010.\u001a\u00020+\u0012\b\u00101\u001a\u0004\u0018\u00010\b\u0012\b\u00105\u001a\u0004\u0018\u000102\u0012\u0006\u00108\u001a\u000206\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010J\u001a\u00020H\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010P\u001a\u00020K¢\u0006\u0004\b^\u0010_J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\"\u0010\u000f\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0014J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020(H\u0016R\u0014\u0010*\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010MR\u001c\u0010T\u001a\n R*\u0004\u0018\u00010Q0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010SR\u0016\u0010U\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00100R\u0016\u0010W\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010MR\u0018\u0010Y\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00104R\u0016\u0010[\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010MR\u0016\u0010]\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010M¨\u0006`"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/DeliveryLocationSuggestionsPresenterLiteImpl;", "Lcom/dodopizza/geo/feature/suggestions/presentation/c;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lcom/dodopizza/geo/feature/suggestions/presentation/e;", "", "F", "I", "B", "", "caughtInput", "C", "Lkotlin/Pair;", "", "Le2b;", "result", "E", "H", "G", "Lcom/dodopizza/geo/feature/suggestions/presentation/g;", "location", "", "position", "D", "Le91;", "clientDeliveryLocation", "localityId", "A", "z", "view", "y", "onFirstViewAttach", "input", "f", "addressId", "n", "j", "onBackPressed", com.huawei.hms.push.e.a, "Lcom/dodopizza/geo/feature/suggestions/presentation/c$a;", "a", "Lyv5;", Image.TYPE_MEDIUM, "resultId", "Lgc;", "b", "Lgc;", "analytics", com.huawei.hms.opendevice.c.a, "Ljava/lang/String;", "currentAddress", "Lov5;", DateTokenConverter.CONVERTER_KEY, "Lov5;", "pinLocation", "Lsy2;", "Lsy2;", "deliveryLocationSuggestionsInteractor", "Ljz2;", "Ljz2;", "router", "Lwv5;", "g", "Lwv5;", "locationPermissionChecker", "Lew5;", Image.TYPE_HIGH, "Lew5;", "locationSettingsChecker", "Lhq3;", "i", "Lhq3;", "featureService", "Lck1;", "Lck1;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "k", "Z", "exitOnSelected", "l", "sendFragmentResult", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "currentInput", "o", "isProgress", "p", "userLocation", "q", "showIncompleteError", "r", "isShowDistance", "<init>", "(ILgc;Ljava/lang/String;Lov5;Lsy2;Ljz2;Lwv5;Lew5;Lhq3;Lck1;ZZ)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeliveryLocationSuggestionsPresenterLiteImpl extends BasePresenter<com.dodopizza.geo.feature.suggestions.presentation.e> implements com.dodopizza.geo.feature.suggestions.presentation.c {
    private final int a;
    private final gc b;
    private final String c;
    private final ov5 d;
    private final sy2 e;
    private final jz2 f;
    private final wv5 g;
    private final ew5 h;
    private final hq3 i;
    private final ck1 j;
    private final boolean k;
    private final boolean l;
    private final Logger m;
    private String n;
    private boolean o;
    private ov5 p;
    private boolean q;
    private boolean r;

    /* compiled from: DeliveryLocationSuggestionsPresenterLiteImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lkotlin/Pair;", "", "", "Le2b;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterLiteImpl$addressChanged$1", f = "DeliveryLocationSuggestionsPresenterLiteImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<pz3<? super Pair<? extends String, ? extends List<? extends e2b>>>, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super Pair<String, ? extends List<e2b>>> pz3Var, cv1<? super Unit> cv1Var) {
            return ((a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterLiteImpl.this.getViewState()).g2();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsPresenterLiteImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "Le2b;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterLiteImpl$addressChanged$2", f = "DeliveryLocationSuggestionsPresenterLiteImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<Pair<? extends String, ? extends List<? extends e2b>>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Pair<String, ? extends List<e2b>> pair, cv1<? super Unit> cv1Var) {
            return ((b) create(pair, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterLiteImpl.this.E((Pair) this.b);
                DeliveryLocationSuggestionsPresenterLiteImpl.this.B();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsPresenterLiteImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"Lpz3;", "Lkotlin/Pair;", "", "", "Le2b;", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterLiteImpl$addressChanged$3", f = "DeliveryLocationSuggestionsPresenterLiteImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements y84<pz3<? super Pair<? extends String, ? extends List<? extends e2b>>>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, cv1<? super c> cv1Var) {
            super(3, cv1Var);
            this.d = str;
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Pair<String, ? extends List<e2b>>> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            c cVar = new c(this.d, cv1Var);
            cVar.b = th;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterLiteImpl.this.m.error("Error getting suggestions", (Throwable) this.b);
                DeliveryLocationSuggestionsPresenterLiteImpl.this.B();
                ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterLiteImpl.this.getViewState()).j1();
                DeliveryLocationSuggestionsPresenterLiteImpl.this.C(this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationSuggestionsPresenterLiteImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterLiteImpl$initAddressFieldHint$1", f = "DeliveryLocationSuggestionsPresenterLiteImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<String, cv1<? super Unit>, Object> {
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
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((d) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterLiteImpl.this.getViewState()).Jf((String) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationSuggestionsPresenterLiteImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterLiteImpl$initAddressFieldHint$2", f = "DeliveryLocationSuggestionsPresenterLiteImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterLiteImpl.this.m.warn("Can't fetch hint", (Throwable) this.b);
                ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterLiteImpl.this.getViewState()).Jf(null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsPresenterLiteImpl.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterLiteImpl$onAddressSelected$1", f = "DeliveryLocationSuggestionsPresenterLiteImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterLiteImpl.this.H();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsPresenterLiteImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/g;", "selectedAddress", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterLiteImpl$onAddressSelected$2", f = "DeliveryLocationSuggestionsPresenterLiteImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class g extends f3b implements Function2<com.dodopizza.geo.feature.suggestions.presentation.g, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i, cv1<? super g> cv1Var) {
            super(2, cv1Var);
            this.d = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(this.d, cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(com.dodopizza.geo.feature.suggestions.presentation.g gVar, cv1<? super Unit> cv1Var) {
            return ((g) create(gVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterLiteImpl.this.G();
                DeliveryLocationSuggestionsPresenterLiteImpl.this.D((com.dodopizza.geo.feature.suggestions.presentation.g) this.b, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsPresenterLiteImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterLiteImpl$onAddressSelected$3", f = "DeliveryLocationSuggestionsPresenterLiteImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i, cv1<? super h> cv1Var) {
            super(2, cv1Var);
            this.d = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(this.d, cv1Var);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((h) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterLiteImpl.this.m.error("Error selecting address", (Throwable) this.b);
                ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterLiteImpl.this.getViewState()).Ma();
                DeliveryLocationSuggestionsPresenterLiteImpl.this.b.a(dx9.a.a(this.d));
                DeliveryLocationSuggestionsPresenterLiteImpl.this.G();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public DeliveryLocationSuggestionsPresenterLiteImpl(int i, gc gcVar, String str, ov5 ov5Var, sy2 sy2Var, jz2 jz2Var, wv5 wv5Var, ew5 ew5Var, hq3 hq3Var, ck1 ck1Var, boolean z, boolean z2) {
        z65.h(gcVar, "analytics");
        z65.h(sy2Var, "deliveryLocationSuggestionsInteractor");
        z65.h(jz2Var, "router");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(ew5Var, "locationSettingsChecker");
        z65.h(hq3Var, "featureService");
        z65.h(ck1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = i;
        this.b = gcVar;
        this.c = str;
        this.d = ov5Var;
        this.e = sy2Var;
        this.f = jz2Var;
        this.g = wv5Var;
        this.h = ew5Var;
        this.i = hq3Var;
        this.j = ck1Var;
        this.k = z;
        this.l = z2;
        this.m = LoggerFactory.getLogger("DeliveryLocationPresenter");
        this.n = "";
        this.p = ov5Var;
        this.r = hq3Var.a(bq3.b6);
    }

    private final void A(e91 e91Var, String str) {
        this.b.a(y6.a.e(this.j, true));
        this.f.b(this.a, new b.a(e91Var, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        if (this.q) {
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).b9();
            this.q = false;
            return;
        }
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).u8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(String str) {
        if (z65.c(this.n, str)) {
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).ma();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(com.dodopizza.geo.feature.suggestions.presentation.g gVar, int i) {
        if (gVar instanceof g.c) {
            this.b.a(dx9.a.a(i));
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).I7();
            G();
        } else if (gVar instanceof g.a) {
            this.b.a(dx9.a.c(i));
            G();
            if (this.k) {
                g.a aVar = (g.a) gVar;
                A(aVar.a(), aVar.b().getId());
            }
            if (this.l) {
                ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).W6((g.a) gVar);
            }
        } else if (gVar instanceof g.b) {
            this.b.a(dx9.a.d(i));
            String a2 = ((g.b) gVar).a();
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).m6(a2 + " ");
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).V();
            this.q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(Pair<String, ? extends List<e2b>> pair) {
        if (z65.c(pair.c(), this.n)) {
            if (pair.d().isEmpty()) {
                ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).B7();
            } else {
                ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).b7(pair.d(), this.r);
            }
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).ma();
        }
    }

    private final void F() {
        p(z77.a(y87.a(this.e.c(), new d(null)), new e(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        this.o = false;
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Ka();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        this.o = true;
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Sa();
    }

    private final void I() {
        if (this.g.a() == ry7.GRANTED && this.h.a()) {
            this.r = this.r;
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).k();
            return;
        }
        this.r = false;
    }

    private final void z() {
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).a();
        this.f.b(this.a, b.C0160b.a);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void a(c.a aVar) {
        z65.h(aVar, "result");
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void f(String str) {
        boolean y;
        z65.h(str, "input");
        if (str.length() > 0) {
            y = l0b.y(str);
            if (!y) {
                ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Rc(false);
                this.n = str;
                o(wz3.h(wz3.F(wz3.H(this.e.a(str, this.p), new a(null)), new b(null)), new c(str, null)));
                return;
            }
        }
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Rc(true);
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Tf();
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void j() {
        z();
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void m(yv5 yv5Var) {
        z65.h(yv5Var, "result");
        if (yv5Var instanceof yv5.b) {
            this.p = ((yv5.b) yv5Var).a();
        } else if (yv5Var instanceof yv5.a) {
            this.m.warn("Failed to request location. ", ((yv5.a) yv5Var).a());
        } else {
            boolean z = yv5Var instanceof yv5.c;
        }
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void n(String str, int i) {
        z65.h(str, "addressId");
        if (!this.o) {
            p(z77.a(y87.a(r77.a(this.e.d(str), new f(null)), new g(i, null)), new h(i, null)));
        }
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void onBackPressed() {
        z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).V();
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).ma();
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Ka();
        F();
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).c8(false);
        String str = this.c;
        if (str != null) {
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            ((com.dodopizza.geo.feature.suggestions.presentation.e) viewState).m6(str);
        }
        I();
    }

    @Override // moxy.MvpPresenter
    /* renamed from: y */
    public void attachView(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
        super.attachView(eVar);
        this.b.a(dx9.a.g());
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void e() {
    }
}
