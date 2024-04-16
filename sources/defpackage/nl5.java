package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.xl0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.landing.LandingApi;
/* compiled from: LandingService.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lnl5;", "Lml5;", "Lxl0;", "", "locationId", LocalityEntity.FIELD_COUNTRY_CODE, "Lxl0$a;", Image.TYPE_MEDIUM, "Lhj5;", "l", "getLandingInfo", "Lru/dodopizza/backend/domain/landing/LandingApi;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/landing/LandingApi;", "landingApi", "Ljj5;", e.a, "Ljj5;", "landingConverter", "Luk5;", "f", "Luk5;", "landingRepository", "Lml0;", "cacheInspector", "<init>", "(Lru/dodopizza/backend/domain/landing/LandingApi;Ljj5;Luk5;Lml0;)V", "g", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nl5  reason: default package */
/* loaded from: classes4.dex */
public final class nl5 extends xl0 implements ml5 {
    private static final a g = new a(null);
    private static final long h = TimeUnit.MINUTES.toMillis(10);
    private final LandingApi d;
    private final jj5 e;
    private final uk5 f;

    /* compiled from: LandingService.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lnl5$a;", "", "", "CACHE_LANDING_DURATION", "J", "", "CACHE_LANDING_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nl5$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LandingService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhj5;", "a", "()Lhj5;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nl5$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<hj5> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final hj5 invoke() {
            hj5 b = nl5.this.f.b(this.b, this.c);
            if (b == null) {
                return nl5.this.l(this.b, this.c);
            }
            return b;
        }
    }

    /* compiled from: LandingService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxl0$a;", "a", "()Lxl0$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nl5$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<xl0.a> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final xl0.a invoke() {
            return nl5.this.m(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhj5;", "a", "()Lhj5;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nl5$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function0<hj5> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final hj5 invoke() {
            return nl5.this.e.a(nl5.this.d.getLandingInfo(this.b, this.c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl5(LandingApi landingApi, jj5 jj5Var, uk5 uk5Var, ml0 ml0Var) {
        super(ml0Var);
        z65.h(landingApi, "landingApi");
        z65.h(jj5Var, "landingConverter");
        z65.h(uk5Var, "landingRepository");
        z65.h(ml0Var, "cacheInspector");
        this.d = landingApi;
        this.e = jj5Var;
        this.f = uk5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hj5 l(String str, String str2) {
        return this.f.a((hj5) fnb.a.a(new d(str, str2)).b(), str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xl0.a m(String str, String str2) {
        l(str, str2);
        return xl0.a.C0743a.a;
    }

    @Override // defpackage.ml5
    public hj5 getLandingInfo(String str, String str2) {
        z65.h(str, "locationId");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        b bVar = new b(str, str2);
        c cVar = new c(str, str2);
        return (hj5) f(bVar, cVar, new ql0("landing.tag" + str2 + str, h, false, 4, null));
    }
}
