package com.dodopizza.geo.feature.editdeliveryaddressmap.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.a;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.d;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.fnb;
import defpackage.hv0;
import defpackage.k9a;
import defpackage.ox1;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
/* compiled from: EditDeliveryAddressMapInteractor.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00105\u001a\u000203\u0012\u0006\u00108\u001a\u000206\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=¢\u0006\u0004\bI\u0010JJ\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0016J\"\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001a\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016J$\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\u0006\u0010\u0016\u001a\u00020\bH\u0016R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010E\u001a\n B*\u0004\u0018\u00010A0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/f;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e;", "Lox1;", "Lqw1;", MessageAttributes.COORDINATES, "Lwx;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a;", "a", "Le91;", "location", "", DateTokenConverter.CONVERTER_KEY, "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b;", "f", "Lc66;", com.huawei.hms.opendevice.c.a, "Ljx2;", "deliveryLocation", "", "clientPhoneNumber", "Lcom/dodopizza/async/AsyncJob;", "b", "clientDeliveryLocation", "g", "Lk9a$b;", "request", "", "setDeliveryOrderType", "Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", com.huawei.hms.push.e.a, "Lk9a$a;", Image.TYPE_HIGH, "Lre4;", "Lre4;", "geocodeService", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lh7;", "Lh7;", "addressDetailsFieldDesignService", "Lx42;", "Lx42;", "customerAddressService", "Lk6a;", "Lk6a;", "selectLocationService", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;", "onDeliveryLocationSetToStateListener", "Lk9a;", "Lk9a;", "selectedDeliveryAddressHandler", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "data", "Li00;", "i", "Li00;", "authorizationState", "Lb7;", "j", "Lb7;", "addressCatcherSubscriptionService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "k", "Lorg/slf4j/Logger;", "logger", "l", "Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "<init>", "(Lre4;Lru/dodopizza/app/domain/country/CountryService;Lh7;Lx42;Lk6a;Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/d;Lk9a;Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;Li00;Lb7;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f implements com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e, ox1 {
    private final re4 a;
    private final CountryService b;
    private final h7 c;
    private final x42 d;
    private final k6a e;
    private final com.dodopizza.geo.feature.deliveryaddresslist.presentation.d f;
    private final k9a g;
    private final com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a h;
    private final i00 i;
    private final b7 j;
    private final Logger k;
    private final String l;

    /* compiled from: EditDeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lk9a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapInteractorImpl$checkSelectedDeliveryLocation$1", f = "EditDeliveryAddressMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super k9a.a>, Object> {
        int a;
        final /* synthetic */ e91 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e91 e91Var, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = e91Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super k9a.a> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return f.this.g.a(ru2.c(this.c));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapInteractorImpl$deleteDeliveryLocation$1", f = "EditDeliveryAddressMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ e91 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e91 e91Var, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = e91Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                f.this.d.f(ru2.c(this.c));
                if (f.this.h.i()) {
                    f.this.f.b();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapInteractorImpl$getAddress$1", f = "EditDeliveryAddressMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super e.a>, Object> {
        int a;
        final /* synthetic */ qw1 c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldm9;", "a", "()Ldm9;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<dm9> {
            final /* synthetic */ f a;
            final /* synthetic */ qw1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, qw1 qw1Var) {
                super(0);
                this.a = fVar;
                this.b = qw1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final dm9 invoke() {
                return this.a.a.a(this.b, this.a.l, this.a.b.h(this.a.l));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(qw1 qw1Var, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = qw1Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super e.a> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            e.a c;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                c = com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.g.c((dm9) fnb.a.a(new a(f.this, this.c)).b());
                return c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lc66;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapInteractorImpl$getCountryMapBounds$1", f = "EditDeliveryAddressMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function1<cv1<? super c66>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc66;", "a", "()Lc66;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<c66> {
            final /* synthetic */ f a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.a = fVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final c66 invoke() {
                return d66.b(this.a.b.c(this.a.l).j());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lc66;", "a", "(Ljava/lang/Throwable;)Lc66;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function1<Throwable, c66> {
            final /* synthetic */ f a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(f fVar) {
                super(1);
                this.a = fVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final c66 invoke(Throwable th) {
                z65.h(th, "it");
                this.a.k.error("Failed to get country map bounds", th);
                return c66.c.a();
            }
        }

        d(cv1<? super d> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super c66> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return fnb.a.a(new a(f.this)).a(new b(f.this));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapInteractorImpl$getInitialData$1", f = "EditDeliveryAddressMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class e extends f3b implements Function1<cv1<? super e.b>, Object> {
        int a;
        final /* synthetic */ qw1 b;
        final /* synthetic */ f c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "a", "()Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<AddressDetailsFieldDesignDto> {
            final /* synthetic */ f a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.a = fVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final AddressDetailsFieldDesignDto invoke() {
                return this.a.c.d(this.a.l);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ f a;
            final /* synthetic */ qw1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(f fVar, qw1 qw1Var) {
                super(0);
                this.a = fVar;
                this.b = qw1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return this.a.a.b(this.b, this.a.h.b());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(qw1 qw1Var, f fVar, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.b = qw1Var;
            this.c = fVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super e.b> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String str;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                fnb.a aVar = fnb.a;
                AddressDetailsFieldDesignDto addressDetailsFieldDesignDto = (AddressDetailsFieldDesignDto) aVar.a(new a(this.c)).b();
                if (qw1.c.c(this.b)) {
                    str = (String) aVar.a(new b(this.c, this.b)).b();
                } else {
                    str = null;
                }
                if (addressDetailsFieldDesignDto == null) {
                    return e.b.a.a;
                }
                return new e.b.c(addressDetailsFieldDesignDto, str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapInteractorImpl$saveDeliveryLocationToProfile$1", f = "EditDeliveryAddressMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0148f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ e91 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0148f(e91 e91Var, cv1<? super C0148f> cv1Var) {
            super(1, cv1Var);
            this.c = e91Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new C0148f(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((C0148f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                f.this.d.a(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lsk9;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/a$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapInteractorImpl$saveDeliveryLocationToProfileAndSetToState$1", f = "EditDeliveryAddressMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class g extends f3b implements Function1<cv1<? super sk9<? extends a.b>>, Object> {
        int a;
        final /* synthetic */ k9a.b b;
        final /* synthetic */ f c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k9a.b bVar, f fVar, boolean z, cv1<? super g> cv1Var) {
            super(1, cv1Var);
            this.b = bVar;
            this.c = fVar;
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(this.b, this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super sk9<a.b>> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object b;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                k9a.b bVar = this.b;
                e91 a = bVar.a();
                dt5 b2 = bVar.b();
                if (this.c.i.b()) {
                    this.c.d.a(a);
                }
                this.c.e.b(new hv0.a(b2, a, false, this.c.h.c()));
                Object a2 = this.c.f.a(a, this.d);
                if (sk9.i(a2)) {
                    b = sk9.b(new a.b(((d.a) a2).a()));
                } else {
                    b = sk9.b(a2);
                }
                return sk9.a(b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapInteractorImpl$subscribeDeliveryAddressUpdates$1", f = "EditDeliveryAddressMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class h extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ jx2 c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(jx2 jx2Var, String str, cv1<? super h> cv1Var) {
            super(1, cv1Var);
            this.c = jx2Var;
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                f.this.j.a(this.c, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public f(re4 re4Var, CountryService countryService, h7 h7Var, x42 x42Var, k6a k6aVar, com.dodopizza.geo.feature.deliveryaddresslist.presentation.d dVar, k9a k9aVar, com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a aVar, i00 i00Var, b7 b7Var) {
        z65.h(re4Var, "geocodeService");
        z65.h(countryService, "countryService");
        z65.h(h7Var, "addressDetailsFieldDesignService");
        z65.h(x42Var, "customerAddressService");
        z65.h(k6aVar, "selectLocationService");
        z65.h(dVar, "onDeliveryLocationSetToStateListener");
        z65.h(k9aVar, "selectedDeliveryAddressHandler");
        z65.h(aVar, "data");
        z65.h(i00Var, "authorizationState");
        z65.h(b7Var, "addressCatcherSubscriptionService");
        this.a = re4Var;
        this.b = countryService;
        this.c = h7Var;
        this.d = x42Var;
        this.e = k6aVar;
        this.f = dVar;
        this.g = k9aVar;
        this.h = aVar;
        this.i = i00Var;
        this.j = b7Var;
        this.k = LoggerFactory.getLogger(f.class);
        this.l = aVar.b();
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e
    public wx<e.a> a(qw1 qw1Var) {
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        return u(new c(qw1Var, null));
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e
    public wx<Unit> b(jx2 jx2Var, String str) {
        z65.h(jx2Var, "deliveryLocation");
        z65.h(str, "clientPhoneNumber");
        return v(new h(jx2Var, str, null));
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e
    public wx<c66> c() {
        return u(new d(null));
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e
    public wx<Unit> d(e91 e91Var) {
        z65.h(e91Var, "location");
        return u(new b(e91Var, null));
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e
    public wx<sk9<a.b>> e(k9a.b bVar, boolean z) {
        z65.h(bVar, "request");
        return u(new g(bVar, this, z, null));
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e
    public wx<e.b> f(qw1 qw1Var) {
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        return u(new e(qw1Var, this, null));
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e
    public wx<Unit> g(e91 e91Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        return v(new C0148f(e91Var, null));
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e
    public wx<k9a.a> h(e91 e91Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        return u(new a(e91Var, null));
    }

    public <T> wx<T> u(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> v(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }
}
