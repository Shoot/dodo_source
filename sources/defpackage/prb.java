package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: UpdateCountriesInteractor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR#\u0010\u0016\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lprb;", "", "", e.a, "(Lcv1;)Ljava/lang/Object;", "Lru/dodopizza/app/domain/country/CountryService;", "a", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ls80;", "b", "Ls80;", "baseUrlService", "Lkx1;", c.a, "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lru/dodopizza/app/domain/country/CountryService;Ls80;Lkx1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: prb  reason: default package */
/* loaded from: classes.dex */
public final class prb {
    private final CountryService a;
    private final s80 b;
    private final kx1 c;
    private final rn5 d;

    /* compiled from: UpdateCountriesInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: prb$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("UpdateCountriesInteractor");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UpdateCountriesInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.countries.presentation.UpdateCountriesInteractor$update$2", f = "UpdateCountriesInteractor.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: prb$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: UpdateCountriesInteractor.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Ldl8;", "", "Lay1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.core.feature.countries.presentation.UpdateCountriesInteractor$update$2$countries$1", f = "UpdateCountriesInteractor.kt", l = {}, m = "invokeSuspend")
        /* renamed from: prb$b$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<dl8<? super List<? extends ay1>>, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ prb c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: UpdateCountriesInteractor.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            @nn2(c = "com.dodopizza.core.feature.countries.presentation.UpdateCountriesInteractor$update$2$countries$1$1", f = "UpdateCountriesInteractor.kt", l = {38}, m = "invokeSuspend")
            /* renamed from: prb$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0481a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ prb b;
                final /* synthetic */ String c;
                final /* synthetic */ dl8<List<ay1>> d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0481a(prb prbVar, String str, dl8<? super List<ay1>> dl8Var, cv1<? super C0481a> cv1Var) {
                    super(2, cv1Var);
                    this.b = prbVar;
                    this.c = str;
                    this.d = dl8Var;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new C0481a(this.b, this.c, this.d, cv1Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((C0481a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    Object d;
                    d = c75.d();
                    int i = this.a;
                    try {
                        if (i != 0) {
                            if (i == 1) {
                                vk9.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            vk9.b(obj);
                            List<ay1> a = this.b.a.a(this.c);
                            dl8<List<ay1>> dl8Var = this.d;
                            this.a = 1;
                            if (dl8Var.p(a, this) == d) {
                                return d;
                            }
                        }
                    } catch (Exception e) {
                        q95.k(getContext());
                        Logger d2 = this.b.d();
                        String str = this.c;
                        d2.warn("Failed to update countries from: " + str, (Throwable) e);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(prb prbVar, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.c = prbVar;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                a aVar = new a(this.c, cv1Var);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(dl8<? super List<ay1>> dl8Var, cv1<? super Unit> cv1Var) {
                return ((a) create(dl8Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    dl8 dl8Var = (dl8) this.b;
                    for (String str : this.c.b.d()) {
                        sh0.d(dl8Var, null, null, new C0481a(this.c, str, dl8Var, null), 3, null);
                    }
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oz3 j = wz3.j(new a(prb.this, null));
                this.a = 1;
                obj = wz3.w(j, this);
                if (obj == d) {
                    return d;
                }
            }
            List<ay1> list = (List) obj;
            if (list != null) {
                prb.this.a.i(list);
            } else {
                z = false;
            }
            return nf0.a(z);
        }
    }

    public prb(CountryService countryService, s80 s80Var, kx1 kx1Var) {
        rn5 b2;
        z65.h(countryService, "countryService");
        z65.h(s80Var, "baseUrlService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = countryService;
        this.b = s80Var;
        this.c = kx1Var;
        b2 = yn5.b(a.a);
        this.d = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger d() {
        return (Logger) this.d.getValue();
    }

    public final Object e(cv1<? super Boolean> cv1Var) {
        return qh0.g(this.c, new b(null), cv1Var);
    }
}
