package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.HttpException;
import ru.dodopizza.app.domain.authorization.AuthorizationException;
import ru.dodopizza.app.domain.authorization.CantSendSmsForCountryPhoneCodeException;
import ru.dodopizza.app.domain.authorization.TooManyRequestsException;
import ru.dodopizza.app.domain.authorization.WrongCredentialsException;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
import ru.dodopizza.backend.domain.authorization.SendPinCodeRequestDto;
import ru.dodopizza.backend.domain.authorization.dto.AuthorizeRequestDto;
import ru.dodopizza.backend.domain.authorization.dto.AuthorizeResponseDto;
/* compiled from: AuthorizationService.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 52\u00020\u0001:\u0002\u0012\tB?\b\u0007\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b3\u00104J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u0007J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0005R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u001c\u0010-\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010/R\u001c\u00102\u001a\n +*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u00101¨\u00066"}, d2 = {"Lg00;", "", "", "token", "customerId", "", "isNew", "", "g", "b", "phoneNumber", "Ldt5;", "locality", Image.TYPE_HIGH, "pin", "Ln42;", "customer", "Lg00$a;", "a", "f", c.a, e.a, "Las8;", "Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;", "Las8;", "authorizationApiProvider", "Lb00;", "Lb00;", "authorizationConfig", "Lgc;", "Lgc;", "analytics", "Lpq;", DateTokenConverter.CONVERTER_KEY, "Lpq;", "appsFlyerService", "Le00;", "Le00;", "repository", "Lk63;", "Lk63;", "domainEvents", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "", "J", "lastVerificationTime", "()Lru/dodopizza/backend/domain/authorization/AuthorizationAPI;", "authorizationAPI", "<init>", "(Las8;Lb00;Lgc;Lpq;Le00;Lk63;)V", "i", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: g00  reason: default package */
/* loaded from: classes4.dex */
public final class g00 {
    public static final b i = new b(null);
    private final as8<AuthorizationAPI> a;
    private final b00 b;
    private final gc c;
    private final pq d;
    private final e00 e;
    private final k63 f;
    private final Logger g;
    private volatile long h;

    /* compiled from: AuthorizationService.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lg00$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "isNewUser", "<init>", "(Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: g00$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.a == ((a) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return a91.a(this.a);
        }

        public String toString() {
            boolean z = this.a;
            return "AuthorizationResult(isNewUser=" + z + ")";
        }
    }

    /* compiled from: AuthorizationService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lg00$b;", "", "", "WRONG_COUNTRY_CODE", "I", "WRONG_PIN_ERROR_CODE", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: g00$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g00(as8<AuthorizationAPI> as8Var, b00 b00Var, gc gcVar, pq pqVar, e00 e00Var, k63 k63Var) {
        z65.h(as8Var, "authorizationApiProvider");
        z65.h(b00Var, "authorizationConfig");
        z65.h(gcVar, "analytics");
        z65.h(pqVar, "appsFlyerService");
        z65.h(e00Var, "repository");
        z65.h(k63Var, "domainEvents");
        this.a = as8Var;
        this.b = b00Var;
        this.c = gcVar;
        this.d = pqVar;
        this.e = e00Var;
        this.f = k63Var;
        this.g = LoggerFactory.getLogger("AuthorizationServiceImpl");
    }

    private final void b() throws TooManyRequestsException {
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        if (currentTimeMillis >= this.b.a()) {
            return;
        }
        throw new TooManyRequestsException(this.b.a() - currentTimeMillis);
    }

    private final AuthorizationAPI d() {
        return this.a.get();
    }

    private final void g(String str, String str2, boolean z) {
        this.e.d(str);
        this.f.b(j63.c);
        this.c.a(new jka(str2));
    }

    public final a a(String str, String str2, n42 n42Var, dt5 dt5Var) {
        z65.h(str, "pin");
        z65.h(str2, "phoneNumber");
        z65.h(n42Var, "customer");
        z65.h(dt5Var, "locality");
        b();
        try {
            AuthorizeResponseDto token = d().getToken(new AuthorizeRequestDto(str2, str, dt5Var.a(), dt5Var.getId(), this.d.a()));
            if (token.getResultCode() == 1) {
                g(token.getToken(), n42Var.i(), token.isNew());
                a aVar = new a(token.isNew());
                this.h = System.currentTimeMillis();
                return aVar;
            }
            throw new AuthorizationException("Unknown authorization error", null, 2, null);
        } catch (Throwable th) {
            try {
                this.g.error("Failed to get token\n", (Throwable) th);
                if ((th instanceof HttpException) && th.code() == 400) {
                    throw new WrongCredentialsException();
                }
                throw new AuthorizationException("Unknown authorization error", th);
            } catch (Throwable th2) {
                this.h = System.currentTimeMillis();
                throw th2;
            }
        }
    }

    public final String c() {
        return this.e.b();
    }

    public final boolean e() {
        return this.e.c();
    }

    public final void f() {
        this.e.a();
        this.f.b(j63.c);
    }

    public final void h(String str, dt5 dt5Var) {
        z65.h(str, "phoneNumber");
        z65.h(dt5Var, "locality");
        try {
            d().sendPin(new SendPinCodeRequestDto(str), dt5Var.a());
        } catch (Throwable th) {
            if ((th instanceof HttpException) && th.code() == 422) {
                throw new CantSendSmsForCountryPhoneCodeException();
            }
            throw th;
        }
    }
}
