package com.dodopizza.geo.feature.suggestions.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.suggestions.presentation.c;
import com.dodopizza.geo.feature.suggestions.presentation.g;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hv0;
import defpackage.iv0;
import defpackage.y6;
import defpackage.yv5;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DeliveryLocationSuggestionsPresenter.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0083\u0001\u0012\u0006\u0010,\u001a\u00020\u0015\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010=\u001a\u00020\t\u0012\u0006\u0010A\u001a\u00020>\u0012\b\u0010C\u001a\u0004\u0018\u00010\t\u0012\b\u0010G\u001a\u0004\u0018\u00010D\u0012\u0006\u0010J\u001a\u00020H\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010U\u001a\u00020S\u0012\u0006\u0010V\u001a\u00020O\u0012\u0006\u0010X\u001a\u00020O¢\u0006\u0004\bj\u0010kJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\"\u0010\u0010\u001a\u00020\u00042\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010 \u001a\u00020\u0004H\u0014J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\tH\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020*H\u0016R\u0014\u0010,\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0017R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010:R\u0014\u0010=\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010<R\u0016\u0010G\u001a\u0004\u0018\u00010D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010TR\u0014\u0010V\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010QR\u0014\u0010X\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010QR\u001c\u0010]\u001a\n Z*\u0004\u0018\u00010Y0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010<R\u0016\u0010a\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010QR\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010QR\u0016\u0010i\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010Q¨\u0006l"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/DeliveryLocationSuggestionsPresenterImpl;", "Lcom/dodopizza/geo/feature/suggestions/presentation/c;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lcom/dodopizza/geo/feature/suggestions/presentation/e;", "", "K", "N", "H", "F", "", "caughtInput", "G", "Lkotlin/Pair;", "", "Le2b;", "result", "J", "M", "L", "Lcom/dodopizza/geo/feature/suggestions/presentation/g;", "location", "", "position", "I", "Lcom/dodopizza/geo/feature/suggestions/presentation/g$a;", "B", "Liv0;", "changeLocationResult", "E", "D", "view", "C", "onFirstViewAttach", "input", "f", "addressId", "n", "Lcom/dodopizza/geo/feature/suggestions/presentation/c$a;", "a", "j", "onBackPressed", com.huawei.hms.push.e.a, "Lyv5;", Image.TYPE_MEDIUM, "resultId", "Lsy2;", "b", "Lsy2;", "deliveryLocationSuggestionsInteractor", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Ljz2;", DateTokenConverter.CONVERTER_KEY, "Ljz2;", "router", "Lhq3;", "Lhq3;", "featureService", "Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Lih4;", "g", "Lih4;", "googlePlayServicesHelper", Image.TYPE_HIGH, "currentAddress", "Ltl5;", "i", "Ltl5;", "currentLanguage", "Lwv5;", "Lwv5;", "locationPermissionChecker", "Lew5;", "k", "Lew5;", "locationSettingsChecker", "", "l", "Z", "forceChangeLocality", "Lck1;", "Lck1;", KustoStorage.KustoTable.COLUMN_SOURCE, "exitOnSelected", "o", "sendFragmentResult", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "p", "Lorg/slf4j/Logger;", "logger", "q", "currentInput", "r", "isProgress", "Lov5;", Image.TYPE_SMALL, "Lov5;", "userLocation", "t", "showIncompleteError", "u", "isShowDistance", "<init>", "(ILsy2;Lgc;Ljz2;Lhq3;Ljava/lang/String;Lih4;Ljava/lang/String;Ltl5;Lwv5;Lew5;ZLck1;ZZ)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeliveryLocationSuggestionsPresenterImpl extends BasePresenter<com.dodopizza.geo.feature.suggestions.presentation.e> implements com.dodopizza.geo.feature.suggestions.presentation.c {
    private final int a;
    private final sy2 b;
    private final gc c;
    private final jz2 d;
    private final hq3 e;
    private final String f;
    private final ih4 g;
    private final String h;
    private final tl5 i;
    private final wv5 j;
    private final ew5 k;
    private final boolean l;
    private final ck1 m;
    private final boolean n;
    private final boolean o;
    private final Logger p;
    private String q;
    private boolean r;
    private ov5 s;
    private boolean t;
    private boolean u;

    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lkotlin/Pair;", "", "", "Le2b;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$addressChanged$1", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
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
                ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterImpl.this.getViewState()).g2();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "Le2b;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$addressChanged$2", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
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
                DeliveryLocationSuggestionsPresenterImpl.this.J((Pair) this.b);
                DeliveryLocationSuggestionsPresenterImpl.this.F();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"Lpz3;", "Lkotlin/Pair;", "", "", "Le2b;", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$addressChanged$3", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
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
                DeliveryLocationSuggestionsPresenterImpl.this.p.error("Error getting suggestions", (Throwable) this.b);
                DeliveryLocationSuggestionsPresenterImpl.this.F();
                ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterImpl.this.getViewState()).j1();
                DeliveryLocationSuggestionsPresenterImpl.this.G(this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$applyNewDeliverableLocation$1", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterImpl.this.M();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "changeLocalityResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$applyNewDeliverableLocation$2", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<iv0, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ g.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g.a aVar, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.d = aVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(this.d, cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(iv0 iv0Var, cv1<? super Unit> cv1Var) {
            return ((e) create(iv0Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                iv0 iv0Var = (iv0) this.b;
                DeliveryLocationSuggestionsPresenterImpl.this.L();
                if (DeliveryLocationSuggestionsPresenterImpl.this.n) {
                    DeliveryLocationSuggestionsPresenterImpl.this.E(iv0Var);
                }
                if (DeliveryLocationSuggestionsPresenterImpl.this.o) {
                    ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterImpl.this.getViewState()).W6(this.d);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$applyNewDeliverableLocation$3", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterImpl.this.p.error("Error select new delivery location", (Throwable) this.b);
                DeliveryLocationSuggestionsPresenterImpl.this.L();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$initAddressFieldHint$1", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((g) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterImpl.this.getViewState()).Jf((String) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$initAddressFieldHint$2", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(cv1Var);
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
                DeliveryLocationSuggestionsPresenterImpl.this.p.warn("Can't fetch hint", (Throwable) this.b);
                ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterImpl.this.getViewState()).Jf(null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$onAddressSelected$1", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class i extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((i) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterImpl.this.M();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/g;", "selectedAddress", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$onAddressSelected$2", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class j extends f3b implements Function2<com.dodopizza.geo.feature.suggestions.presentation.g, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i, cv1<? super j> cv1Var) {
            super(2, cv1Var);
            this.d = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(this.d, cv1Var);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(com.dodopizza.geo.feature.suggestions.presentation.g gVar, cv1<? super Unit> cv1Var) {
            return ((j) create(gVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterImpl.this.L();
                DeliveryLocationSuggestionsPresenterImpl.this.I((com.dodopizza.geo.feature.suggestions.presentation.g) this.b, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsPresenterImpl$onAddressSelected$3", f = "DeliveryLocationSuggestionsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class k extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i, cv1<? super k> cv1Var) {
            super(2, cv1Var);
            this.d = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k kVar = new k(this.d, cv1Var);
            kVar.b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((k) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                DeliveryLocationSuggestionsPresenterImpl.this.p.error("Error selecting address", (Throwable) this.b);
                ((com.dodopizza.geo.feature.suggestions.presentation.e) DeliveryLocationSuggestionsPresenterImpl.this.getViewState()).Ma();
                DeliveryLocationSuggestionsPresenterImpl.this.c.a(dx9.a.a(this.d));
                DeliveryLocationSuggestionsPresenterImpl.this.L();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public DeliveryLocationSuggestionsPresenterImpl(int i2, sy2 sy2Var, gc gcVar, jz2 jz2Var, hq3 hq3Var, String str, ih4 ih4Var, String str2, tl5 tl5Var, wv5 wv5Var, ew5 ew5Var, boolean z, ck1 ck1Var, boolean z2, boolean z3) {
        z65.h(sy2Var, "deliveryLocationSuggestionsInteractor");
        z65.h(gcVar, "analytics");
        z65.h(jz2Var, "router");
        z65.h(hq3Var, "featureService");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(ih4Var, "googlePlayServicesHelper");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(ew5Var, "locationSettingsChecker");
        z65.h(ck1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = i2;
        this.b = sy2Var;
        this.c = gcVar;
        this.d = jz2Var;
        this.e = hq3Var;
        this.f = str;
        this.g = ih4Var;
        this.h = str2;
        this.i = tl5Var;
        this.j = wv5Var;
        this.k = ew5Var;
        this.l = z;
        this.m = ck1Var;
        this.n = z2;
        this.o = z3;
        this.p = LoggerFactory.getLogger("DeliveryLocationPresenter");
        this.q = "";
        this.u = hq3Var.a(bq3.b6);
    }

    private final void B(g.a aVar) {
        p(z77.a(y87.a(r77.a(this.b.b(new hv0.a(aVar.b(), aVar.a(), this.l, this.i)), new d(null)), new e(aVar, null)), new f(null)));
    }

    private final void D() {
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).a();
        this.d.c(this.a, iv0.b.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(iv0 iv0Var) {
        this.c.a(y6.a.e(this.m, true));
        this.d.c(this.a, iv0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        if (this.t) {
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).b9();
            this.t = false;
            return;
        }
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).u8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(String str) {
        if (z65.c(this.q, str)) {
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).ma();
        }
    }

    private final void H() {
        boolean z;
        if (this.e.a(bq3.W4) && this.g.a()) {
            z = true;
        } else {
            z = false;
        }
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).c8(z);
        if (z) {
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Nd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(com.dodopizza.geo.feature.suggestions.presentation.g gVar, int i2) {
        if (gVar instanceof g.c) {
            this.c.a(dx9.a.a(i2));
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).I7();
            L();
        } else if (gVar instanceof g.a) {
            this.c.a(dx9.a.c(i2));
            g.a aVar = (g.a) gVar;
            if (aVar.c()) {
                ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).E4(aVar);
            } else {
                B(aVar);
            }
        } else if (gVar instanceof g.b) {
            this.c.a(dx9.a.d(i2));
            String a2 = ((g.b) gVar).a();
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).m6(a2 + " ");
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).V();
            this.t = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Pair<String, ? extends List<e2b>> pair) {
        if (z65.c(pair.c(), this.q)) {
            if (pair.d().isEmpty()) {
                ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).B7();
            } else {
                ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).b7(pair.d(), this.u);
            }
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).ma();
        }
    }

    private final void K() {
        p(z77.a(y87.a(this.b.c(), new g(null)), new h(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        this.r = false;
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Ka();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        this.r = true;
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Sa();
    }

    private final void N() {
        if (this.j.a() == ry7.GRANTED && this.k.a()) {
            this.u = this.u;
            ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).k();
            return;
        }
        this.u = false;
    }

    @Override // moxy.MvpPresenter
    /* renamed from: C */
    public void attachView(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
        super.attachView(eVar);
        this.c.a(dx9.a.g());
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void a(c.a aVar) {
        z65.h(aVar, "result");
        if (aVar instanceof c.a.b) {
            this.c.a(y6.a.g(y6.b.b));
            B(((c.a.b) aVar).a());
            return;
        }
        this.c.a(y6.a.g(y6.b.c));
        L();
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void e() {
        this.d.a(this.f, this.m);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void f(String str) {
        boolean y;
        z65.h(str, "input");
        if (str.length() > 0) {
            y = l0b.y(str);
            if (!y) {
                ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Rc(false);
                this.q = str;
                o(wz3.h(wz3.F(wz3.H(this.b.a(str, this.s), new a(null)), new b(null)), new c(str, null)));
                return;
            }
        }
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Rc(true);
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Tf();
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void j() {
        D();
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void m(yv5 yv5Var) {
        z65.h(yv5Var, "result");
        if (yv5Var instanceof yv5.b) {
            this.s = ((yv5.b) yv5Var).a();
        } else if (yv5Var instanceof yv5.a) {
            this.p.warn("Failed to request location. ", ((yv5.a) yv5Var).a());
        } else {
            boolean z = yv5Var instanceof yv5.c;
        }
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void n(String str, int i2) {
        z65.h(str, "addressId");
        if (!this.r) {
            p(z77.a(y87.a(r77.a(this.b.d(str), new i(null)), new j(i2, null)), new k(i2, null)));
        }
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.c
    public void onBackPressed() {
        D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).V();
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).ma();
        ((com.dodopizza.geo.feature.suggestions.presentation.e) getViewState()).Ka();
        H();
        K();
        String str = this.h;
        if (str != null) {
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            ((com.dodopizza.geo.feature.suggestions.presentation.e) viewState).m6(str);
        }
        N();
    }
}
