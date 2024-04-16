package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.allsecure.InvalidParameterException;
import com.dodopizza.allsecure.TokenizationApiException;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.g54;
import defpackage.hi9;
import java.io.IOException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
/* compiled from: AllSecureApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00192\u00020\u0001:\u0002\t\u0010B-\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u001a"}, d2 = {"Lxb;", "", "Lorg/json/JSONObject;", "errorObject", "", c.a, "Lyo0;", "cardData", "Lji9;", "a", "Llib;", DateTokenConverter.CONVERTER_KEY, "Lb77;", "Lb77;", "httpClient", "", "b", "Ljava/lang/String;", "integrationKey", "gatewayHost", "tokenizationHost", "()Ljava/lang/String;", "tokenizationKey", "<init>", "(Lb77;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", e.a, "allsecure_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: xb  reason: default package */
/* loaded from: classes.dex */
public final class xb {
    public static final b e = new b(null);
    private final b77 a;
    private final String b;
    private final String c;
    private final String d;

    /* compiled from: AllSecureApi.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, d2 = {"Lxb$a;", "", "", "integrationKey", DateTokenConverter.CONVERTER_KEY, "gatewayHost", "b", "tokenizationHost", e.a, "Lb77;", "httpClient", c.a, "Lxb;", "a", "Ljava/lang/String;", "Lb77;", "<init>", "()V", "allsecure_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: xb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private String a;
        private String b;
        private String c;
        private b77 d;

        public final xb a() {
            if (this.a != null) {
                if (this.d == null) {
                    this.d = new b77();
                }
                if (this.b == null) {
                    this.b = "https://asxgw.com";
                }
                if (this.c == null) {
                    this.c = "https://secure.asxgw.com";
                }
                b77 b77Var = this.d;
                z65.e(b77Var);
                String str = this.a;
                z65.e(str);
                return new xb(b77Var, str, this.b, this.c, null);
            }
            throw new IllegalArgumentException("integrationKey needs to be defined".toString());
        }

        public final a b(String str) {
            this.b = str;
            return this;
        }

        public final a c(b77 b77Var) {
            this.d = b77Var;
            return this;
        }

        public final a d(String str) {
            this.a = str;
            return this;
        }

        public final a e(String str) {
            this.c = str;
            return this;
        }
    }

    /* compiled from: AllSecureApi.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lxb$b;", "", "Lxb$a;", "a", "", "GATEWAY_HOST", "Ljava/lang/String;", "TOKENIZATION_HOST", "<init>", "()V", "allsecure_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: xb$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return new a();
        }
    }

    public /* synthetic */ xb(b77 b77Var, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(b77Var, str, str2, str3);
    }

    private final ji9 a(yo0 yo0Var) {
        g54.a a2 = new g54.a(null, 1, null).a("cardHolder", yo0Var.a()).a("month", String.valueOf(yo0Var.c())).a("year", String.valueOf(yo0Var.d()));
        if (yo0Var.b().length() > 0) {
            a2.a("pan", yo0Var.e()).a("cvv", yo0Var.b());
        } else {
            a2.a("panonly", yo0Var.e());
        }
        return a2.c();
    }

    private final String b() throws IOException, TokenizationApiException {
        ik9 execute = FirebasePerfOkHttpClient.execute(this.a.a(new hi9.a().v(new URL(this.c + "/integrated/getTokenizationKey/" + this.b)).b()));
        try {
            if (execute.isSuccessful()) {
                if (execute.b() != null) {
                    kk9 b2 = execute.b();
                    z65.e(b2);
                    JSONObject jSONObject = new JSONObject(b2.string());
                    if (jSONObject.has("tokenizationKey")) {
                        String string = jSONObject.getString("tokenizationKey");
                        z65.g(string, "parsedResponse.getString(\"tokenizationKey\")");
                        aa1.a(execute, null);
                        return string;
                    }
                    throw new TokenizationApiException(TokenizationApiException.a.INVALID_RESPONSE, "Missing tokenizationKey in response");
                }
                throw new TokenizationApiException(TokenizationApiException.a.INVALID_RESPONSE, "Empty response body");
            }
            throw new TokenizationApiException(TokenizationApiException.a.INVALID_PUBLIC_INTEGRATION_KEY, "Invalid public integration key");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(execute, th);
                throw th2;
            }
        }
    }

    private final void c(JSONObject jSONObject) throws TokenizationApiException, InvalidParameterException {
        InvalidParameterException.c cVar;
        InvalidParameterException.a aVar;
        InvalidParameterException.b bVar;
        if (jSONObject != null) {
            InvalidParameterException.b bVar2 = null;
            if (jSONObject.has("pan")) {
                String string = jSONObject.getJSONArray("pan").getString(0);
                z65.g(string, "errorObject.getJSONArray…            .getString(0)");
                cVar = InvalidParameterException.c.valueOf(string);
            } else {
                cVar = null;
            }
            if (jSONObject.has("cvv")) {
                String string2 = jSONObject.getJSONArray("cvv").getString(0);
                z65.g(string2, "errorObject.getJSONArray…            .getString(0)");
                aVar = InvalidParameterException.a.valueOf(string2);
            } else {
                aVar = null;
            }
            if (jSONObject.has("month")) {
                String string3 = jSONObject.getJSONArray("month").getString(0);
                z65.g(string3, "errorObject.getJSONArray…            .getString(0)");
                bVar = InvalidParameterException.b.valueOf(string3);
            } else {
                bVar = null;
            }
            if (jSONObject.has("year")) {
                String string4 = jSONObject.getJSONArray("year").getString(0);
                z65.g(string4, "errorObject.getJSONArray…            .getString(0)");
                bVar2 = InvalidParameterException.b.valueOf(string4);
            }
            throw new InvalidParameterException(cVar, aVar, bVar, bVar2);
        }
        throw new TokenizationApiException(TokenizationApiException.a.INVALID_RESPONSE, "Error messages missing");
    }

    public final lib d(yo0 yo0Var) throws TokenizationApiException, InvalidParameterException, IOException {
        if (yo0Var != null) {
            String b2 = b();
            ik9 execute = FirebasePerfOkHttpClient.execute(this.a.a(new hi9.a().v(new URL(this.d + "/v1/" + b2 + "/tokenize/creditcard")).m(a(yo0Var)).b()));
            try {
                if (execute.j() != 401 && execute.j() != 418) {
                    if (execute.isSuccessful()) {
                        if (execute.b() != null) {
                            kk9 b3 = execute.b();
                            z65.e(b3);
                            JSONObject jSONObject = new JSONObject(b3.string());
                            if (jSONObject.has("success")) {
                                if (!jSONObject.getBoolean("success")) {
                                    c(jSONObject.getJSONObject("errors"));
                                }
                                if (jSONObject.has("token") && jSONObject.has("fingerprint")) {
                                    String string = jSONObject.getString("token");
                                    String string2 = jSONObject.getString("fingerprint");
                                    z65.g(string, "token");
                                    z65.g(string2, "fingerprint");
                                    lib libVar = new lib(string, string2);
                                    aa1.a(execute, null);
                                    return libVar;
                                }
                                throw new TokenizationApiException(TokenizationApiException.a.INVALID_RESPONSE, "Expected token and fingerprint in response");
                            }
                            throw new TokenizationApiException(TokenizationApiException.a.INVALID_RESPONSE, "Expected success in reponse");
                        }
                        throw new TokenizationApiException(TokenizationApiException.a.INVALID_RESPONSE, "Empty response body");
                    }
                    TokenizationApiException.a aVar = TokenizationApiException.a.INVALID_RESPONSE;
                    throw new TokenizationApiException(aVar, "Unexpected response code: " + execute.j());
                }
                throw new TokenizationApiException(TokenizationApiException.a.INVALID_TOKEN_KEY, "Invalid token key");
            } finally {
            }
        } else {
            throw new IllegalArgumentException("cardData must not be null".toString());
        }
    }

    private xb(b77 b77Var, String str, String str2, String str3) {
        this.a = b77Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
