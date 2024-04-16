package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.presentation.selectlocation.landing.b;
/* compiled from: LandingInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Lsj5;", "Lrj5;", "Lox1;", "Loz3;", "Lru/dodopizza/app/presentation/selectlocation/landing/b;", "a", "", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "b", "f", "locationId", "Lml5;", "Lml5;", e.a, "()Lml5;", "landingService", "Luj5;", DateTokenConverter.CONVERTER_KEY, "Luj5;", "()Luj5;", "landingMapper", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lml5;Luj5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: sj5  reason: default package */
/* loaded from: classes4.dex */
public final class sj5 implements rj5, ox1 {
    private final String a;
    private final String b;
    private final ml5 c;
    private final uj5 d;

    /* compiled from: LandingInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lru/dodopizza/app/presentation/selectlocation/landing/b;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: sj5$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<oz3<? extends b>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LandingInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lru/dodopizza/app/presentation/selectlocation/landing/b;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.LandingInteractorImpl$getLandingContent$1$1", f = "LandingInteractor.kt", l = {21}, m = "invokeSuspend")
        /* renamed from: sj5$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0666a extends f3b implements Function2<pz3<? super b>, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ sj5 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0666a(sj5 sj5Var, cv1<? super C0666a> cv1Var) {
                super(2, cv1Var);
                this.c = sj5Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0666a c0666a = new C0666a(this.c, cv1Var);
                c0666a.b = obj;
                return c0666a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(pz3<? super b> pz3Var, cv1<? super Unit> cv1Var) {
                return ((C0666a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
                    b a = this.c.d().a(this.c.e().getLandingInfo(this.c.f(), this.c.c()));
                    this.a = 1;
                    if (((pz3) this.b).emit(a, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<b> invoke() {
            return wz3.z(new C0666a(sj5.this, null));
        }
    }

    public sj5(String str, String str2, ml5 ml5Var, uj5 uj5Var) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "locationId");
        z65.h(ml5Var, "landingService");
        z65.h(uj5Var, "landingMapper");
        this.a = str;
        this.b = str2;
        this.c = ml5Var;
        this.d = uj5Var;
    }

    @Override // defpackage.rj5
    public oz3<b> a() {
        return b(new a());
    }

    public <T> oz3<T> b(Function0<? extends oz3<? extends T>> function0) {
        return ox1.a.d(this, function0);
    }

    public final String c() {
        return this.a;
    }

    public final uj5 d() {
        return this.d;
    }

    public final ml5 e() {
        return this.c;
    }

    public final String f() {
        return this.b;
    }
}
