package defpackage;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import cloud.mindbox.mobile_sdk.models.Configuration;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.JsonSyntaxException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
/* compiled from: Requests.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0080\b\u0018\u0000 C2\u00020\u0001:\u0001DBM\u0012\b\b\u0002\u0010#\u001a\u00020\u0019\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u001c\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010!¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u000f\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001d\u001a\u00020\u001cHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0003JQ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u001c2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010!HÆ\u0001J\t\u0010*\u001a\u00020\u0002HÖ\u0001J\t\u0010+\u001a\u00020\u0019HÖ\u0001J\u0013\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003R\u0017\u0010#\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b#\u0010/\u001a\u0004\b0\u00101R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\b3\u00104R\u0017\u0010%\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b6\u00107R\u0019\u0010&\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b&\u00108\u001a\u0004\b9\u0010:R\u001f\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b'\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010(\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b(\u0010>\u001a\u0004\b?\u0010@¨\u0006E"}, d2 = {"Lrk6;", "Lnb5;", "", "body", "", "isJsonObject", "Liw6;", "response", "", "logResponse", "json", "logBodyResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", com.huawei.hms.push.e.a, "logError", "logEndResponse", "", "getHeaders", "Lcom/android/volley/Response;", "Lorg/json/JSONObject;", "parseNetworkResponse", "Lcom/android/volley/VolleyError;", "volleyError", "parseNetworkError", "", "component1", "component2", "Lcloud/mindbox/mobile_sdk/models/Configuration;", "component3", "component4", "Lcom/android/volley/Response$Listener;", "component5", "Lcom/android/volley/Response$ErrorListener;", "component6", "methodType", "fullUrl", "configuration", "jsonRequest", "listener", "errorsListener", "copy", "toString", "hashCode", "", "other", "equals", "I", "getMethodType", "()I", "Ljava/lang/String;", "getFullUrl", "()Ljava/lang/String;", "Lcloud/mindbox/mobile_sdk/models/Configuration;", "getConfiguration", "()Lcloud/mindbox/mobile_sdk/models/Configuration;", "Lorg/json/JSONObject;", "getJsonRequest", "()Lorg/json/JSONObject;", "Lcom/android/volley/Response$Listener;", "getListener", "()Lcom/android/volley/Response$Listener;", "Lcom/android/volley/Response$ErrorListener;", "getErrorsListener", "()Lcom/android/volley/Response$ErrorListener;", "<init>", "(ILjava/lang/String;Lcloud/mindbox/mobile_sdk/models/Configuration;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rk6  reason: default package */
/* loaded from: classes.dex */
public final class rk6 extends nb5 {
    public static final a Companion = new a(null);
    private static final String DEFAULT_RESPONSE_CHARSET = "UTF-8";
    private static final String HEADER_ACCEPT = "Accept";
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String HEADER_INTEGRATION = "Mindbox-Integration";
    private static final String HEADER_INTEGRATION_VERSION = "Mindbox-Integration-Version";
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final String VALUE_ACCEPT = "application/json";
    private static final String VALUE_CONTENT_TYPE = "application/json; charset=utf-8";
    private static final String VALUE_INTEGRATION = "Android-SDK";
    private static final String VALUE_USER_AGENT = "mindbox.sdk/%1$1s (Android %2$1s; %3$1s; %4$1s) %5$1s/%6$1s(%7$1s)";
    private final Configuration configuration;
    private final Response.ErrorListener errorsListener;
    private final String fullUrl;
    private final JSONObject jsonRequest;
    private final Response.Listener<JSONObject> listener;
    private final int methodType;

    /* compiled from: Requests.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lrk6$a;", "", "", "DEFAULT_RESPONSE_CHARSET", "Ljava/lang/String;", "HEADER_ACCEPT", "HEADER_CONTENT_TYPE", "HEADER_INTEGRATION", "HEADER_INTEGRATION_VERSION", "HEADER_USER_AGENT", "VALUE_ACCEPT", "VALUE_CONTENT_TYPE", "VALUE_INTEGRATION", "VALUE_USER_AGENT", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: rk6$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Requests.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rk6$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ Map<String, String> $params;
        final /* synthetic */ rk6 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map<String, String> map, rk6 rk6Var) {
            super(0);
            this.$params = map;
            this.this$0 = rk6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$params.put(rk6.HEADER_CONTENT_TYPE, rk6.VALUE_CONTENT_TYPE);
            Map<String, String> map = this.$params;
            pza pzaVar = pza.a;
            String format = String.format(rk6.VALUE_USER_AGENT, Arrays.copyOf(new Object[]{"2.7.0", Build.VERSION.RELEASE, Build.MANUFACTURER, Build.MODEL, this.this$0.getConfiguration().getPackageName(), this.this$0.getConfiguration().getVersionName(), this.this$0.getConfiguration().getVersionCode()}, 7));
            z65.g(format, "format(format, *args)");
            map.put(rk6.HEADER_USER_AGENT, format);
            this.$params.put(rk6.HEADER_INTEGRATION, rk6.VALUE_INTEGRATION);
            this.$params.put(rk6.HEADER_INTEGRATION_VERSION, "2.7.0");
            this.$params.put(rk6.HEADER_ACCEPT, rk6.VALUE_ACCEPT);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Requests.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rk6$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ String $json;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.$json = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            fk6.a.d(rk6.this, String.valueOf(this.$json));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Requests.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rk6$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            fk6.a.d(rk6.this, "<--- End of response");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Requests.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rk6$e */
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ Exception $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Exception exc) {
            super(0);
            this.$e = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String b;
            fk6 fk6Var = fk6.a;
            rk6 rk6Var = rk6.this;
            String message = this.$e.getMessage();
            if (message == null) {
                message = "Empty message";
            }
            fk6Var.d(rk6Var, message);
            rk6 rk6Var2 = rk6.this;
            b = vl3.b(this.$e);
            fk6Var.d(rk6Var2, b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Requests.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rk6$f */
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ iw6 $response;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Requests.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Len4;", "kotlin.jvm.PlatformType", "header", "", "invoke", "(Len4;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: rk6$f$a */
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function1<en4, CharSequence> {
            public static final a INSTANCE = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(en4 en4Var) {
                return en4Var.a() + ": " + en4Var.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(iw6 iw6Var) {
            super(0);
            this.$response = iw6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<en4> list;
            String i0;
            fk6 fk6Var = fk6.a;
            rk6 rk6Var = rk6.this;
            StringBuilder sb = new StringBuilder();
            sb.append("<--- ");
            iw6 iw6Var = this.$response;
            sb.append(iw6Var != null ? Integer.valueOf(iw6Var.a) : null);
            sb.append(' ');
            sb.append(rk6.this.getFullUrl());
            fk6Var.d(rk6Var, sb.toString());
            iw6 iw6Var2 = this.$response;
            if (iw6Var2 == null || (list = iw6Var2.d) == null) {
                return null;
            }
            List<en4> list2 = list;
            String property = System.getProperty("line.separator");
            if (property == null) {
                property = "\n";
            }
            i0 = sc1.i0(list2, property, null, null, 0, null, a.INSTANCE, 30, null);
            if (i0 != null) {
                fk6Var.d(rk6.this, i0);
                return Unit.a;
            }
            return null;
        }
    }

    /* compiled from: Requests.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rk6$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ VolleyError $volleyError;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Requests.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Len4;", "kotlin.jvm.PlatformType", "header", "", "invoke", "(Len4;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: rk6$g$a */
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function1<en4, CharSequence> {
            public static final a INSTANCE = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(en4 en4Var) {
                return en4Var.a() + ": " + en4Var.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(VolleyError volleyError) {
            super(0);
            this.$volleyError = volleyError;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Map<String, String> h;
            List<en4> list;
            String i0;
            fk6 fk6Var = fk6.a;
            rk6 rk6Var = rk6.this;
            StringBuilder sb = new StringBuilder();
            sb.append("<--- Error ");
            iw6 iw6Var = this.$volleyError.a;
            sb.append(iw6Var != null ? Integer.valueOf(iw6Var.a) : null);
            sb.append(' ');
            sb.append(rk6.this.getFullUrl());
            sb.append(" TimeMls:");
            sb.append(this.$volleyError.a());
            sb.append("; ");
            fk6Var.e(rk6Var, sb.toString());
            try {
                try {
                    iw6 iw6Var2 = this.$volleyError.a;
                    if (iw6Var2 != null && (list = iw6Var2.d) != null) {
                        List<en4> list2 = list;
                        String property = System.getProperty("line.separator");
                        if (property == null) {
                            property = "\n";
                        }
                        i0 = sc1.i0(list2, property, null, null, 0, null, a.INSTANCE, 30, null);
                        if (i0 != null) {
                            fk6Var.d(rk6.this, i0);
                        }
                    }
                    iw6 iw6Var3 = this.$volleyError.a;
                    byte[] bArr = iw6Var3 != null ? iw6Var3.b : null;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    if (iw6Var3 == null || (h = iw6Var3.c) == null) {
                        h = g86.h();
                    }
                    Charset forName = Charset.forName(kq4.f(h));
                    z65.g(forName, "forName(\n               …  )\n                    )");
                    rk6.this.logBodyResponse(new String(bArr, forName));
                } catch (Exception e) {
                    rk6.this.logError(e);
                }
                rk6.this.logEndResponse();
            } catch (Throwable th) {
                rk6.this.logEndResponse();
                throw th;
            }
        }
    }

    /* compiled from: Requests.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/android/volley/Response;", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rk6$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function0<Response<JSONObject>> {
        final /* synthetic */ iw6 $response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(iw6 iw6Var) {
            super(0);
            this.$response = iw6Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Response<JSONObject> invoke() {
            Response<JSONObject> a;
            rk6.this.logResponse(this.$response);
            try {
                try {
                    iw6 iw6Var = this.$response;
                    byte[] bArr = iw6Var != null ? iw6Var.b : null;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    Charset forName = Charset.forName(kq4.g(iw6Var != null ? iw6Var.c : null, rk6.DEFAULT_RESPONSE_CHARSET));
                    z65.g(forName, "forName(\n               …                        )");
                    String str = new String(bArr, forName);
                    rk6.this.logBodyResponse(str);
                    if (str.length() == 0) {
                        str = "{data: null}";
                    } else if (!rk6.this.isJsonObject(str)) {
                        str = "{data: " + str + CoreConstants.CURLY_RIGHT;
                    }
                    iw6 iw6Var2 = this.$response;
                    a = Response.c(new JSONObject(str), iw6Var2 != null ? kq4.e(iw6Var2) : null);
                } catch (JsonSyntaxException e) {
                    a = Response.a(new ParseError(e));
                } catch (UnsupportedEncodingException e2) {
                    a = Response.a(new ParseError(e2));
                }
                rk6.this.logEndResponse();
                return a;
            } catch (Throwable th) {
                rk6.this.logEndResponse();
                throw th;
            }
        }
    }

    /* compiled from: Requests.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/android/volley/Response;", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", com.huawei.hms.push.e.a, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: rk6$i */
    /* loaded from: classes.dex */
    static final class i extends ej5 implements Function1<Throwable, Response<JSONObject>> {
        public static final i INSTANCE = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Response<JSONObject> invoke(Throwable th) {
            z65.h(th, com.huawei.hms.push.e.a);
            return Response.a(new ParseError(th));
        }
    }

    public /* synthetic */ rk6(int i2, String str, Configuration configuration, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i2, (i3 & 2) != 0 ? "" : str, configuration, (i3 & 8) != 0 ? null : jSONObject, (i3 & 16) != 0 ? null : listener, (i3 & 32) != 0 ? null : errorListener);
    }

    public static /* synthetic */ rk6 copy$default(rk6 rk6Var, int i2, String str, Configuration configuration, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = rk6Var.methodType;
        }
        if ((i3 & 2) != 0) {
            str = rk6Var.fullUrl;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            configuration = rk6Var.configuration;
        }
        Configuration configuration2 = configuration;
        if ((i3 & 8) != 0) {
            jSONObject = rk6Var.jsonRequest;
        }
        JSONObject jSONObject2 = jSONObject;
        Response.Listener<JSONObject> listener2 = listener;
        if ((i3 & 16) != 0) {
            listener2 = rk6Var.listener;
        }
        Response.Listener listener3 = listener2;
        if ((i3 & 32) != 0) {
            errorListener = rk6Var.errorsListener;
        }
        return rk6Var.copy(i2, str2, configuration2, jSONObject2, listener3, errorListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isJsonObject(String str) {
        boolean J;
        boolean u;
        J = l0b.J(str, "{", false, 2, null);
        if (J) {
            u = l0b.u(str, "}", false, 2, null);
            if (!u) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logBodyResponse(String str) {
        yx5.a.d(new c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEndResponse() {
        yx5.a.d(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logError(Exception exc) {
        yx5.a.d(new e(exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logResponse(iw6 iw6Var) {
        yx5.a.d(new f(iw6Var));
    }

    public final int component1() {
        return this.methodType;
    }

    public final String component2() {
        return this.fullUrl;
    }

    public final Configuration component3() {
        return this.configuration;
    }

    public final JSONObject component4() {
        return this.jsonRequest;
    }

    public final Response.Listener<JSONObject> component5() {
        return this.listener;
    }

    public final Response.ErrorListener component6() {
        return this.errorsListener;
    }

    public final rk6 copy(int i2, String str, Configuration configuration, JSONObject jSONObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        z65.h(str, "fullUrl");
        z65.h(configuration, "configuration");
        return new rk6(i2, str, configuration, jSONObject, listener, errorListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk6)) {
            return false;
        }
        rk6 rk6Var = (rk6) obj;
        if (this.methodType == rk6Var.methodType && z65.c(this.fullUrl, rk6Var.fullUrl) && z65.c(this.configuration, rk6Var.configuration) && z65.c(this.jsonRequest, rk6Var.jsonRequest) && z65.c(this.listener, rk6Var.listener) && z65.c(this.errorsListener, rk6Var.errorsListener)) {
            return true;
        }
        return false;
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final Response.ErrorListener getErrorsListener() {
        return this.errorsListener;
    }

    public final String getFullUrl() {
        return this.fullUrl;
    }

    @Override // com.android.volley.Request
    public Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap();
        yx5.a.d(new b(hashMap, this));
        return hashMap;
    }

    public final JSONObject getJsonRequest() {
        return this.jsonRequest;
    }

    public final Response.Listener<JSONObject> getListener() {
        return this.listener;
    }

    public final int getMethodType() {
        return this.methodType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.methodType * 31) + this.fullUrl.hashCode()) * 31) + this.configuration.hashCode()) * 31;
        JSONObject jSONObject = this.jsonRequest;
        int i2 = 0;
        if (jSONObject == null) {
            hashCode = 0;
        } else {
            hashCode = jSONObject.hashCode();
        }
        int i3 = (hashCode3 + hashCode) * 31;
        Response.Listener<JSONObject> listener = this.listener;
        if (listener == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = listener.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        Response.ErrorListener errorListener = this.errorsListener;
        if (errorListener != null) {
            i2 = errorListener.hashCode();
        }
        return i4 + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public VolleyError parseNetworkError(VolleyError volleyError) {
        z65.h(volleyError, "volleyError");
        yx5.a.d(new g(volleyError));
        return volleyError;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nb5, defpackage.ac5, com.android.volley.Request
    public Response<JSONObject> parseNetworkResponse(iw6 iw6Var) {
        Object c2 = yx5.a.c(new h(iw6Var), i.INSTANCE);
        z65.g(c2, "override fun parseNetwor…ror(e)) }\n        )\n    }");
        return (Response) c2;
    }

    @Override // com.android.volley.Request
    public String toString() {
        return "MindboxRequest(methodType=" + this.methodType + ", fullUrl=" + this.fullUrl + ", configuration=" + this.configuration + ", jsonRequest=" + this.jsonRequest + ", listener=" + this.listener + ", errorsListener=" + this.errorsListener + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk6(int i2, String str, Configuration configuration, JSONObject jSONObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(i2, str, jSONObject, listener, errorListener);
        z65.h(str, "fullUrl");
        z65.h(configuration, "configuration");
        this.methodType = i2;
        this.fullUrl = str;
        this.configuration = configuration;
        this.jsonRequest = jSONObject;
        this.listener = listener;
        this.errorsListener = errorListener;
    }
}
