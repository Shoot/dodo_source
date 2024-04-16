package defpackage;

import android.util.Log;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.inapp.domain.models.CustomerSegmentationError;
import cloud.mindbox.mobile_sdk.inapp.domain.models.GeoError;
import cloud.mindbox.mobile_sdk.inapp.domain.models.ProductSegmentationError;
import cloud.mindbox.mobile_sdk.models.Configuration;
import cloud.mindbox.mobile_sdk.models.Event;
import cloud.mindbox.mobile_sdk.models.EventType;
import cloud.mindbox.mobile_sdk.models.MindboxError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sk9;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: GatewayManager.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 P2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010B\u001a\u00020?¢\u0006\u0004\bN\u0010OJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0002J8\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0014\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0002J7\u0010&\u001a\n %*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010!2\u0006\u0010\"\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b)\u0010*J:\u0010,\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017JN\u0010-\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00180\u0017J\u001b\u0010/\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u00100J#\u00104\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0086@ø\u0001\u0000¢\u0006\u0004\b4\u00105J#\u00109\u001a\u0002082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0086@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0016\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010>\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b>\u00100R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010L\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lwc4;", "", "Lcloud/mindbox/mobile_sdk/models/Configuration;", "configuration", "", "p", Image.TYPE_SMALL, "o", "deviceUuid", "", "shouldCountOffset", "Lcloud/mindbox/mobile_sdk/models/Event;", "event", Image.TYPE_HIGH, "Lcloud/mindbox/mobile_sdk/models/EventType;", "eventType", "", "t", "", "timeMls", "u", "Lcom/android/volley/VolleyError;", "volleyError", "Lkotlin/Function1;", "", "onSuccess", "Lcloud/mindbox/mobile_sdk/models/MindboxError;", "onError", "Ll95;", "v", "body", "Lorg/json/JSONObject;", "l", "T", "data", "Ljava/lang/Class;", "classOfT", "kotlin.jvm.PlatformType", Image.TYPE_MEDIUM, "(Ljava/lang/String;Ljava/lang/Class;Lcv1;)Ljava/lang/Object;", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "w", "(Ljava/lang/Integer;)Z", "isSentListener", "x", "y", "Lqe4;", "j", "(Lcloud/mindbox/mobile_sdk/models/Configuration;Lcv1;)Ljava/lang/Object;", "Lgm8;", "segmentation", "Lim8;", "k", "(Lcloud/mindbox/mobile_sdk/models/Configuration;Lgm8;Lcv1;)Ljava/lang/Object;", "Lv3a;", "segmentationCheckRequest", "Lw3a;", "i", "(Lcloud/mindbox/mobile_sdk/models/Configuration;Lv3a;Lcv1;)Ljava/lang/Object;", "Ldx5;", "logs", "B", "n", "Lgl6;", "a", "Lgl6;", "mindboxServiceGenerator", "Lcom/google/gson/Gson;", "b", "Lrn5;", "r", "()Lcom/google/gson/Gson;", "gson", "Lqx1;", com.huawei.hms.opendevice.c.a, "q", "()Lqx1;", "gatewayScope", "<init>", "(Lgl6;)V", DateTokenConverter.CONVERTER_KEY, "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wc4  reason: default package */
/* loaded from: classes.dex */
public final class wc4 {
    public static final a d = new a(null);
    private final gl6 a;
    private final rn5 b;
    private final rn5 c;

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lwc4$a;", "", "", "MAX_RETRIES", "I", "MONITORING_DELAY", "TIMEOUT_DELAY", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: wc4$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "response", "", "a", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wc4$b */
    /* loaded from: classes.dex */
    static final class b<T> implements Response.Listener {
        final /* synthetic */ cv1<w3a> a;
        final /* synthetic */ wc4 b;

        /* JADX WARN: Multi-variable type inference failed */
        b(cv1<? super w3a> cv1Var, wc4 wc4Var) {
            this.a = cv1Var;
            this.b = wc4Var;
        }

        @Override // com.android.volley.Response.Listener
        /* renamed from: a */
        public final void onResponse(JSONObject jSONObject) {
            cv1<w3a> cv1Var = this.a;
            sk9.a aVar = sk9.b;
            cv1Var.resumeWith(sk9.b(this.b.r().k(jSONObject.toString(), w3a.class)));
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "Lcom/android/volley/VolleyError;", "kotlin.jvm.PlatformType", "onErrorResponse"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wc4$c */
    /* loaded from: classes.dex */
    static final class c implements Response.ErrorListener {
        final /* synthetic */ cv1<w3a> a;

        /* JADX WARN: Multi-variable type inference failed */
        c(cv1<? super w3a> cv1Var) {
            this.a = cv1Var;
        }

        @Override // com.android.volley.Response.ErrorListener
        public final void onErrorResponse(VolleyError volleyError) {
            cv1<w3a> cv1Var = this.a;
            sk9.a aVar = sk9.b;
            z65.g(volleyError, "error");
            cv1Var.resumeWith(sk9.b(vk9.a(new CustomerSegmentationError(volleyError))));
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "jsonObject", "", "a", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wc4$d */
    /* loaded from: classes.dex */
    static final class d<T> implements Response.Listener {
        final /* synthetic */ cv1<qe4> a;
        final /* synthetic */ wc4 b;

        /* JADX WARN: Multi-variable type inference failed */
        d(cv1<? super qe4> cv1Var, wc4 wc4Var) {
            this.a = cv1Var;
            this.b = wc4Var;
        }

        @Override // com.android.volley.Response.Listener
        /* renamed from: a */
        public final void onResponse(JSONObject jSONObject) {
            cv1<qe4> cv1Var = this.a;
            sk9.a aVar = sk9.b;
            cv1Var.resumeWith(sk9.b(this.b.r().k(jSONObject.toString(), qe4.class)));
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "Lcom/android/volley/VolleyError;", "kotlin.jvm.PlatformType", "onErrorResponse"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wc4$e */
    /* loaded from: classes.dex */
    static final class e implements Response.ErrorListener {
        final /* synthetic */ cv1<qe4> a;

        /* JADX WARN: Multi-variable type inference failed */
        e(cv1<? super qe4> cv1Var) {
            this.a = cv1Var;
        }

        @Override // com.android.volley.Response.ErrorListener
        public final void onErrorResponse(VolleyError volleyError) {
            cv1<qe4> cv1Var = this.a;
            sk9.a aVar = sk9.b;
            z65.g(volleyError, "error");
            cv1Var.resumeWith(sk9.b(vk9.a(new GeoError(volleyError))));
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "response", "", "a", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wc4$f */
    /* loaded from: classes.dex */
    static final class f<T> implements Response.Listener {
        final /* synthetic */ cv1<im8> a;
        final /* synthetic */ wc4 b;

        /* JADX WARN: Multi-variable type inference failed */
        f(cv1<? super im8> cv1Var, wc4 wc4Var) {
            this.a = cv1Var;
            this.b = wc4Var;
        }

        @Override // com.android.volley.Response.Listener
        /* renamed from: a */
        public final void onResponse(JSONObject jSONObject) {
            cv1<im8> cv1Var = this.a;
            sk9.a aVar = sk9.b;
            cv1Var.resumeWith(sk9.b(this.b.r().k(jSONObject.toString(), im8.class)));
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "Lcom/android/volley/VolleyError;", "kotlin.jvm.PlatformType", "onErrorResponse"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wc4$g */
    /* loaded from: classes.dex */
    static final class g implements Response.ErrorListener {
        final /* synthetic */ cv1<im8> a;

        /* JADX WARN: Multi-variable type inference failed */
        g(cv1<? super im8> cv1Var) {
            this.a = cv1Var;
        }

        @Override // com.android.volley.Response.ErrorListener
        public final void onErrorResponse(VolleyError volleyError) {
            cv1<im8> cv1Var = this.a;
            sk9.a aVar = sk9.b;
            z65.g(volleyError, "error");
            cv1Var.resumeWith(sk9.b(vk9.a(new ProductSegmentationError(volleyError))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.managers.GatewayManager$convertJsonToBody$2", f = "GatewayManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wc4$h */
    /* loaded from: classes.dex */
    public static final class h<T> extends f3b implements Function2<qx1, cv1<? super T>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ Class<T> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, Class<T> cls, cv1<? super h> cv1Var) {
            super(2, cv1Var);
            this.c = str;
            this.d = cls;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(this.c, this.d, cv1Var);
        }

        public final Object invoke(qx1 qx1Var, cv1<? super T> cv1Var) {
            return ((h) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return wc4.this.r().k(this.c, this.d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, Object obj) {
            return invoke(qx1Var, (cv1) ((cv1) obj));
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "response", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wc4$i */
    /* loaded from: classes.dex */
    static final class i<T> implements Response.Listener {
        final /* synthetic */ cv1<String> a;

        /* JADX WARN: Multi-variable type inference failed */
        i(cv1<? super String> cv1Var) {
            this.a = cv1Var;
        }

        @Override // com.android.volley.Response.Listener
        /* renamed from: a */
        public final void onResponse(String str) {
            this.a.resumeWith(sk9.b(str));
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "Lcom/android/volley/VolleyError;", "kotlin.jvm.PlatformType", "onErrorResponse"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wc4$j */
    /* loaded from: classes.dex */
    static final class j implements Response.ErrorListener {
        final /* synthetic */ cv1<String> a;

        /* JADX WARN: Multi-variable type inference failed */
        j(cv1<? super String> cv1Var) {
            this.a = cv1Var;
        }

        @Override // com.android.volley.Response.ErrorListener
        public final void onErrorResponse(VolleyError volleyError) {
            cv1<String> cv1Var = this.a;
            sk9.a aVar = sk9.b;
            z65.g(volleyError, "error");
            cv1Var.resumeWith(sk9.b(vk9.a(volleyError)));
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqx1;", "a", "()Lqx1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wc4$k */
    /* loaded from: classes.dex */
    static final class k extends ej5 implements Function0<qx1> {
        public static final k a = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final qx1 invoke() {
            bl1 b;
            CoroutineContext P = k2b.b(null, 1, null).P(v33.c());
            b = s95.b(null, 1, null);
            return rx1.a(P.P(b));
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wc4$l */
    /* loaded from: classes.dex */
    static final class l extends ej5 implements Function0<Gson> {
        public static final l a = new l();

        l() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.managers.GatewayManager$handleError$1", f = "GatewayManager.kt", l = {221}, m = "invokeSuspend")
    /* renamed from: wc4$m */
    /* loaded from: classes.dex */
    public static final class m extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        int b;
        int c;
        private /* synthetic */ Object d;
        final /* synthetic */ VolleyError e;
        final /* synthetic */ Function1<MindboxError, Unit> f;
        final /* synthetic */ Function1<String, Unit> g;
        final /* synthetic */ wc4 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(VolleyError volleyError, Function1<? super MindboxError, Unit> function1, Function1<? super String, Unit> function12, wc4 wc4Var, cv1<? super m> cv1Var) {
            super(2, cv1Var);
            this.e = volleyError;
            this.f = function1;
            this.g = function12;
            this.h = wc4Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m mVar = new m(this.e, this.f, this.g, this.h, cv1Var);
            mVar.d = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((m) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: Exception -> 0x001a, TryCatch #1 {Exception -> 0x001a, blocks: (B:6:0x0016, B:25:0x0068, B:28:0x0071, B:31:0x0078, B:32:0x007c, B:54:0x00ee, B:34:0x0081, B:37:0x008a, B:38:0x00a3, B:44:0x00b5, B:41:0x00ac, B:45:0x00c8, B:48:0x00d1, B:50:0x00db, B:51:0x00df, B:52:0x00e6, B:55:0x010a, B:56:0x0122), top: B:62:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: Exception -> 0x001a, TryCatch #1 {Exception -> 0x001a, blocks: (B:6:0x0016, B:25:0x0068, B:28:0x0071, B:31:0x0078, B:32:0x007c, B:54:0x00ee, B:34:0x0081, B:37:0x008a, B:38:0x00a3, B:44:0x00b5, B:41:0x00ac, B:45:0x00c8, B:48:0x00d1, B:50:0x00db, B:51:0x00df, B:52:0x00e6, B:55:0x010a, B:56:0x0122), top: B:62:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0122 A[Catch: Exception -> 0x001a, TRY_LEAVE, TryCatch #1 {Exception -> 0x001a, blocks: (B:6:0x0016, B:25:0x0068, B:28:0x0071, B:31:0x0078, B:32:0x007c, B:54:0x00ee, B:34:0x0081, B:37:0x008a, B:38:0x00a3, B:44:0x00b5, B:41:0x00ac, B:45:0x00c8, B:48:0x00d1, B:50:0x00db, B:51:0x00df, B:52:0x00e6, B:55:0x010a, B:56:0x0122), top: B:62:0x0016 }] */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wc4.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wc4$n */
    /* loaded from: classes.dex */
    static final class n extends ej5 implements Function1<String, Unit> {
        final /* synthetic */ Function1<Boolean, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(Function1<? super Boolean, Unit> function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "it");
            this.a.invoke(Boolean.TRUE);
        }
    }

    /* compiled from: GatewayManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/MindboxError;", "error", "", "a", "(Lcloud/mindbox/mobile_sdk/models/MindboxError;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wc4$o */
    /* loaded from: classes.dex */
    static final class o extends ej5 implements Function1<MindboxError, Unit> {
        final /* synthetic */ Function1<Boolean, Unit> a;
        final /* synthetic */ wc4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(Function1<? super Boolean, Unit> function1, wc4 wc4Var) {
            super(1);
            this.a = function1;
            this.b = wc4Var;
        }

        public final void a(MindboxError mindboxError) {
            z65.h(mindboxError, "error");
            this.a.invoke(Boolean.valueOf(this.b.w(mindboxError.getStatusCode())));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MindboxError mindboxError) {
            a(mindboxError);
            return Unit.a;
        }
    }

    public wc4(gl6 gl6Var) {
        rn5 b2;
        rn5 b3;
        z65.h(gl6Var, "mindboxServiceGenerator");
        this.a = gl6Var;
        b2 = yn5.b(l.a);
        this.b = b2;
        b3 = yn5.b(k.a);
        this.c = b3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(wc4 wc4Var, Function1 function1, Function1 function12, VolleyError volleyError) {
        z65.h(wc4Var, "this$0");
        z65.h(function1, "$onSuccess");
        z65.h(function12, "$onError");
        z65.g(volleyError, "volleyError");
        wc4Var.v(volleyError, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(JSONObject jSONObject) {
        Log.d("Success", "Sending logs success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(VolleyError volleyError) {
        Log.e("Error", "Sending logs was failure with exception", volleyError);
    }

    private final String h(Configuration configuration, String str, boolean z, Event event) {
        HashMap j2;
        j2 = g86.j(lnb.a(ytb.DEVICE_UUID.getValue(), str));
        EventType eventType = event.getEventType();
        if ((eventType instanceof EventType.b) || (eventType instanceof EventType.c) || (eventType instanceof EventType.a) || (eventType instanceof EventType.e) || (eventType instanceof EventType.d)) {
            j2.put(ytb.ENDPOINT_ID.getValue(), configuration.getEndpointId());
            j2.put(ytb.OPERATION.getValue(), event.getEventType().getOperation());
            j2.put(ytb.TRANSACTION_ID.getValue(), event.getTransactionId());
            j2.put(ytb.DATE_TIME_OFFSET.getValue(), u(event.getEnqueueTimestamp(), z));
        } else if (eventType instanceof EventType.f) {
            j2.put(ytb.ENDPOINT_ID.getValue(), configuration.getEndpointId());
            String value = ytb.UNIQ_KEY.getValue();
            HashMap<String, String> additionalFields = event.getAdditionalFields();
            j2.put(value, (additionalFields == null || (r1 = additionalFields.get(dl3.UNIQ_KEY.getFieldName())) == null) ? "" : "");
            j2.put(ytb.TRANSACTION_ID.getValue(), event.getTransactionId());
            j2.put(ytb.DATE_TIME_OFFSET.getValue(), u(event.getEnqueueTimestamp(), z));
        } else if (eventType instanceof EventType.h) {
            j2.put(ytb.TRANSACTION_ID.getValue(), event.getTransactionId());
            j2.put(ytb.DATE_TIME_OFFSET.getValue(), u(event.getEnqueueTimestamp(), z));
        } else if (eventType instanceof EventType.g) {
            j2.put(ytb.ENDPOINT_ID.getValue(), configuration.getEndpointId());
            j2.put(ytb.OPERATION.getValue(), event.getEventType().getOperation());
        }
        return "https://" + configuration.getDomain() + event.getEventType().getEndpoint() + vn3.k(j2);
    }

    private final JSONObject l(String str) {
        if (str != null) {
            try {
            } catch (JSONException unused) {
                return null;
            }
        }
        return new JSONObject(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object m(String str, Class<T> cls, cv1<? super T> cv1Var) {
        return qh0.g(v33.a(), new h(str, cls, null), cv1Var);
    }

    private final String o(Configuration configuration) {
        return "https://" + configuration.getDomain() + "/mobile/byendpoint/" + configuration.getEndpointId() + ".json";
    }

    private final String p(Configuration configuration) {
        return "https://" + configuration.getDomain() + "/v3/operations/sync?endpointId=" + configuration.getEndpointId() + "&operation=Tracker.CheckCustomerSegments&deviceUUID=" + nk6.a.b();
    }

    private final qx1 q() {
        return (qx1) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson r() {
        return (Gson) this.b.getValue();
    }

    private final String s(Configuration configuration) {
        return "https://" + configuration.getDomain() + "/v3/operations/sync?endpointId=" + configuration.getEndpointId() + "&operation=Tracker.CheckProductSegments&transactionId=" + UUID.randomUUID();
    }

    private final int t(EventType eventType) {
        if ((eventType instanceof EventType.b) || (eventType instanceof EventType.c) || (eventType instanceof EventType.a) || (eventType instanceof EventType.e) || (eventType instanceof EventType.h) || (eventType instanceof EventType.d) || (eventType instanceof EventType.g)) {
            return 1;
        }
        if (eventType instanceof EventType.f) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String u(long j2, boolean z) {
        if (z) {
            return String.valueOf(System.currentTimeMillis() - j2);
        }
        return "0";
    }

    private final l95 v(VolleyError volleyError, Function1<? super String, Unit> function1, Function1<? super MindboxError, Unit> function12) {
        l95 d2;
        d2 = sh0.d(q(), null, null, new m(volleyError, function12, function1, this, null), 3, null);
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w(Integer num) {
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        if (intValue >= 300 && (400 > intValue || intValue >= 500)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(wc4 wc4Var, Function1 function1, JSONObject jSONObject) {
        z65.h(wc4Var, "this$0");
        z65.h(function1, "$onSuccess");
        fk6.a.d(wc4Var, "Event from background successful sent");
        String jSONObject2 = jSONObject.toString();
        z65.g(jSONObject2, "it.toString()");
        function1.invoke(jSONObject2);
    }

    public final void B(dx5 dx5Var, Configuration configuration) {
        z65.h(dx5Var, "logs");
        z65.h(configuration, "configuration");
        try {
            rk6 rk6Var = new rk6(1, "https://" + configuration.getDomain() + "/v3/operations/async?endpointId=" + configuration.getEndpointId() + "&operation=MobileSdk.Logs&deviceUUID=" + nk6.a.b() + "&transactionId=" + UUID.randomUUID(), configuration, l(r().t(dx5Var)), new Response.Listener() { // from class: uc4
                @Override // com.android.volley.Response.Listener
                public final void onResponse(Object obj) {
                    wc4.C((JSONObject) obj);
                }
            }, new Response.ErrorListener() { // from class: vc4
                @Override // com.android.volley.Response.ErrorListener
                public final void onErrorResponse(VolleyError volleyError) {
                    wc4.D(volleyError);
                }
            });
            rk6Var.setShouldCache(false);
            rk6Var.setRetryPolicy(new lr2(Level.TRACE_INT, 0, 1.0f));
            this.a.d(rk6Var);
        } catch (Exception e2) {
            Log.e("Error", "Sending event was failure with exception", e2);
        }
    }

    public final Object i(Configuration configuration, v3a v3aVar, cv1<? super w3a> cv1Var) {
        cv1 c2;
        Object d2;
        c2 = b75.c(cv1Var);
        ts9 ts9Var = new ts9(c2);
        gl6 gl6Var = this.a;
        String p = p(configuration);
        JSONObject l2 = l(r().u(v3aVar, v3a.class));
        z65.e(l2);
        gl6Var.d(new rk6(1, p, configuration, l2, new b(ts9Var, this), new c(ts9Var)));
        Object a2 = ts9Var.a();
        d2 = c75.d();
        if (a2 == d2) {
            io2.c(cv1Var);
        }
        return a2;
    }

    public final Object j(Configuration configuration, cv1<? super qe4> cv1Var) {
        cv1 c2;
        Object d2;
        c2 = b75.c(cv1Var);
        ts9 ts9Var = new ts9(c2);
        gl6 gl6Var = this.a;
        gl6Var.d(new rk6(0, "https://" + configuration.getDomain() + "/geo", configuration, null, new d(ts9Var, this), new e(ts9Var)));
        Object a2 = ts9Var.a();
        d2 = c75.d();
        if (a2 == d2) {
            io2.c(cv1Var);
        }
        return a2;
    }

    public final Object k(Configuration configuration, gm8 gm8Var, cv1<? super im8> cv1Var) {
        cv1 c2;
        Object d2;
        c2 = b75.c(cv1Var);
        ts9 ts9Var = new ts9(c2);
        gl6 gl6Var = this.a;
        String s = s(configuration);
        JSONObject l2 = l(r().u(gm8Var, gm8.class));
        z65.e(l2);
        gl6Var.d(new rk6(1, s, configuration, l2, new f(ts9Var, this), new g(ts9Var)));
        Object a2 = ts9Var.a();
        d2 = c75.d();
        if (a2 == d2) {
            io2.c(cv1Var);
        }
        return a2;
    }

    public final Object n(Configuration configuration, cv1<? super String> cv1Var) {
        cv1 c2;
        Object d2;
        c2 = b75.c(cv1Var);
        ts9 ts9Var = new ts9(c2);
        this.a.e(new sza(0, o(configuration), new i(ts9Var), new j(ts9Var)));
        Object a2 = ts9Var.a();
        d2 = c75.d();
        if (a2 == d2) {
            io2.c(cv1Var);
        }
        return a2;
    }

    public final void x(Configuration configuration, String str, Event event, boolean z, Function1<? super Boolean, Unit> function1) {
        z65.h(configuration, "configuration");
        z65.h(str, "deviceUuid");
        z65.h(event, "event");
        z65.h(function1, "isSentListener");
        y(configuration, str, event, z, new n(function1), new o(function1, this));
    }

    public final void y(Configuration configuration, String str, Event event, boolean z, final Function1<? super String, Unit> function1, final Function1<? super MindboxError, Unit> function12) {
        z65.h(configuration, "configuration");
        z65.h(str, "deviceUuid");
        z65.h(event, "event");
        z65.h(function1, "onSuccess");
        z65.h(function12, "onError");
        try {
            rk6 rk6Var = new rk6(t(event.getEventType()), h(configuration, str, z, event), configuration, l(event.getBody()), new Response.Listener() { // from class: sc4
                @Override // com.android.volley.Response.Listener
                public final void onResponse(Object obj) {
                    wc4.z(wc4.this, function1, (JSONObject) obj);
                }
            }, new Response.ErrorListener() { // from class: tc4
                @Override // com.android.volley.Response.ErrorListener
                public final void onErrorResponse(VolleyError volleyError) {
                    wc4.A(wc4.this, function1, function12, volleyError);
                }
            });
            rk6Var.setShouldCache(false);
            rk6Var.setRetryPolicy(new lr2(60000, 0, 1.0f));
            this.a.d(rk6Var);
        } catch (Exception e2) {
            fk6.a.f(this, "Sending event was failure with exception", e2);
            function12.invoke(new MindboxError.Unknown(e2));
        }
    }
}
