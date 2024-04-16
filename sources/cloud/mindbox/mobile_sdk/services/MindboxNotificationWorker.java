package cloud.mindbox.mobile_sdk.services;

import android.app.Activity;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: MindboxNotificationWorker.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcloud/mindbox/mobile_sdk/services/MindboxNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker$a;", "a", "(Lcv1;)Ljava/lang/Object;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", DateTokenConverter.CONVERTER_KEY, "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MindboxNotificationWorker extends CoroutineWorker {
    public static final a d = new a(null);
    private static final f60 e = f60.EXPONENTIAL;
    private static final long f = 30000;
    private static final Gson g = new Gson();

    /* compiled from: MindboxNotificationWorker.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0002*\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jn\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0018\u00010\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u0013R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010$R\u0014\u0010)\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010$R\u0014\u0010+\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010$R\u0014\u0010,\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010$R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\"R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcloud/mindbox/mobile_sdk/services/MindboxNotificationWorker$a;", "", "T", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/String;", "", "notificationId", "Lod9;", "remoteMessage", RemoteMessageConst.Notification.CHANNEL_ID, "channelName", "pushSmallIcon", "channelDescription", "", "Ljava/lang/Class;", "Landroid/app/Activity;", "activities", "defaultActivity", "Lyh6;", "state", "Landroidx/work/b;", c.a, "Lf60;", "defaultBackoffPolicy", "Lf60;", "b", "()Lf60;", "", "defaultBackoffDelayMillis", "J", "a", "()J", "EMPTY_INT", "I", "KEY_ACTIVITIES", "Ljava/lang/String;", "KEY_ACTIVITY_DEFAULT", "KEY_CHANNEL_DESCRIPTION", "KEY_CHANNEL_ID", "KEY_CHANNEL_NAME", "KEY_NOTIFICATION_ID", "KEY_REMOTE_MESSAGE", "KEY_SMALL_ICON_RES", "KEY_STATE", "MAX_RETRY_COUNT", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MindboxNotificationWorker.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: cloud.mindbox.mobile_sdk.services.MindboxNotificationWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0090a extends ej5 implements Function0<String> {
            final /* synthetic */ T a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0090a(T t) {
                super(0);
                this.a = t;
            }

            public final String a() {
                return MindboxNotificationWorker.g.t(this.a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ String invoke() {
                return a();
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final <T> String d(T t) {
            return (String) yx5.a.b(null, new C0090a(t));
        }

        public final long a() {
            return MindboxNotificationWorker.f;
        }

        public final f60 b() {
            return MindboxNotificationWorker.e;
        }

        public final androidx.work.b c(int i, od9 od9Var, String str, String str2, int i2, String str3, Map<String, ? extends Class<? extends Activity>> map, Class<? extends Activity> cls, yh6 yh6Var) {
            String str4;
            int e;
            z65.h(od9Var, "remoteMessage");
            z65.h(str, RemoteMessageConst.Notification.CHANNEL_ID);
            z65.h(str2, "channelName");
            z65.h(cls, "defaultActivity");
            z65.h(yh6Var, "state");
            String d = d(od9Var);
            if (map != null) {
                e = f86.e(map.size());
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ((Class) entry.getValue()).getCanonicalName());
                }
                str4 = d(linkedHashMap);
            } else {
                str4 = null;
            }
            String canonicalName = cls.getCanonicalName();
            androidx.work.b a = new b.a().g("notification_id", i).h("remote_message", d).h("channel_id", str).h("channel_name", str2).g("small_icon_res", i2).h("channel_description", str3).h("activities", str4).h("activity_default", canonicalName).h("state", d(yh6Var)).a();
            z65.g(a, "Builder()\n              …\n                .build()");
            return a;
        }
    }

    /* compiled from: MindboxNotificationWorker.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/work/ListenableWorker$a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.services.MindboxNotificationWorker$doWork$2", f = "MindboxNotificationWorker.kt", l = {126}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function1<cv1<? super ListenableWorker.a>, Object> {
        Object a;
        int b;
        final /* synthetic */ MindboxNotificationWorker c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MindboxNotificationWorker.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "", "Ljava/lang/Class;", "Landroid/app/Activity;", "a", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function0<Pair<? extends String, ? extends Class<? extends Activity>>> {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2) {
                super(0);
                this.a = str;
                this.b = str2;
            }

            public final Pair<String, Class<? extends Activity>> a() {
                String str = this.a;
                Class<?> cls = Class.forName(this.b);
                z65.f(cls, "null cannot be cast to non-null type java.lang.Class<out android.app.Activity>");
                return lnb.a(str, cls);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Pair<? extends String, ? extends Class<? extends Activity>> invoke() {
                return a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MindboxNotificationWorker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/lang/Class;", "Landroid/app/Activity;", "a", "()Ljava/lang/Class;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: cloud.mindbox.mobile_sdk.services.MindboxNotificationWorker$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0091b extends ej5 implements Function0<Class<? extends Activity>> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0091b(String str) {
                super(0);
                this.a = str;
            }

            public final Class<? extends Activity> a() {
                Class cls = Class.forName(this.a);
                z65.f(cls, "null cannot be cast to non-null type java.lang.Class<out android.app.Activity>");
                return cls;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Class<? extends Activity> invoke() {
                return a();
            }
        }

        /* compiled from: MindboxNotificationWorker.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class c extends ej5 implements Function0<od9> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(0);
                this.a = str;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [od9, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final od9 invoke() {
                return MindboxNotificationWorker.g.k(this.a, od9.class);
            }
        }

        /* compiled from: MindboxNotificationWorker.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class d extends ej5 implements Function0<Map<String, ? extends String>> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(0);
                this.a = str;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends String> invoke() {
                return MindboxNotificationWorker.g.k(this.a, Map.class);
            }
        }

        /* compiled from: MindboxNotificationWorker.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class e extends ej5 implements Function0<yh6> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str) {
                super(0);
                this.a = str;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [yh6, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final yh6 invoke() {
                return MindboxNotificationWorker.g.k(this.a, yh6.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MindboxNotificationWorker mindboxNotificationWorker, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = mindboxNotificationWorker;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        public final Object i(cv1<? super ListenableWorker.a> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(cv1<? super ListenableWorker.a> cv1Var) {
            return i(cv1Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01b0  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 504
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.services.MindboxNotificationWorker.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MindboxNotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        z65.h(context, "appContext");
        z65.h(workerParameters, "workerParams");
    }

    @Override // androidx.work.CoroutineWorker
    public Object a(cv1<? super ListenableWorker.a> cv1Var) {
        yx5 yx5Var = yx5.a;
        ListenableWorker.a a2 = ListenableWorker.a.a();
        z65.g(a2, "failure()");
        return yx5Var.e(a2, new b(this, null), cv1Var);
    }
}
