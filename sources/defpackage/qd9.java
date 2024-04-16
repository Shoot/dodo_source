package defpackage;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.network.NetworkHandler;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
/* compiled from: RemoteSettingsFetcher.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000eB!\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002Jo\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lqd9;", "Lb22;", "Ljava/net/URL;", c.a, "", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lcv1;", "", "", "onSuccess", "onFailure", "a", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "Lop;", "Lop;", "appInfo", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "Ljava/lang/String;", "baseUrl", "<init>", "(Lop;Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: qd9  reason: default package */
/* loaded from: classes2.dex */
public final class qd9 implements b22 {
    public static final a d = new a(null);
    private final op a;
    private final CoroutineContext b;
    private final String c;

    /* compiled from: RemoteSettingsFetcher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lqd9$a;", "", "", "FIREBASE_PLATFORM", "Ljava/lang/String;", "FIREBASE_SESSIONS_BASE_URL_STRING", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: qd9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RemoteSettingsFetcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
    /* renamed from: qd9$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Map<String, String> c;
        final /* synthetic */ Function2<JSONObject, cv1<? super Unit>, Object> d;
        final /* synthetic */ Function2<String, cv1<? super Unit>, Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, Function2<? super JSONObject, ? super cv1<? super Unit>, ? extends Object> function2, Function2<? super String, ? super cv1<? super Unit>, ? extends Object> function22, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = map;
            this.d = function2;
            this.e = function22;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, this.d, this.e, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            try {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            vk9.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        vk9.b(obj);
                    }
                } else {
                    vk9.b(obj);
                    URLConnection openConnection = qd9.this.c().openConnection();
                    z65.f(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod(NetworkHandler.GET);
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry<String, String> entry : this.c.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        ea9 ea9Var = new ea9();
                        while (true) {
                            ?? readLine = bufferedReader.readLine();
                            ea9Var.a = readLine;
                            if (readLine == 0) {
                                break;
                            }
                            sb.append((String) readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        Function2<JSONObject, cv1<? super Unit>, Object> function2 = this.d;
                        this.a = 1;
                        if (function2.invoke(jSONObject, this) == d) {
                            return d;
                        }
                    } else {
                        Function2<String, cv1<? super Unit>, Object> function22 = this.e;
                        String str = "Bad response code: " + responseCode;
                        this.a = 2;
                        if (function22.invoke(str, this) == d) {
                            return d;
                        }
                    }
                }
            } catch (Exception e) {
                Function2<String, cv1<? super Unit>, Object> function23 = this.e;
                String message = e.getMessage();
                if (message == null) {
                    message = e.toString();
                }
                this.a = 3;
                if (function23.invoke(message, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public qd9(op opVar, CoroutineContext coroutineContext, String str) {
        z65.h(opVar, "appInfo");
        z65.h(coroutineContext, "blockingDispatcher");
        z65.h(str, "baseUrl");
        this.a = opVar;
        this.b = coroutineContext;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.a.b()).appendPath("settings").appendQueryParameter("build_version", this.a.a().a()).appendQueryParameter("display_version", this.a.a().f()).build().toString());
    }

    @Override // defpackage.b22
    public Object a(Map<String, String> map, Function2<? super JSONObject, ? super cv1<? super Unit>, ? extends Object> function2, Function2<? super String, ? super cv1<? super Unit>, ? extends Object> function22, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g = qh0.g(this.b, new b(map, function2, function22, null), cv1Var);
        d2 = c75.d();
        if (g == d2) {
            return g;
        }
        return Unit.a;
    }

    public /* synthetic */ qd9(op opVar, CoroutineContext coroutineContext, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(opVar, coroutineContext, (i & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
