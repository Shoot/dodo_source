package defpackage;

import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.a;
import org.json.JSONObject;
/* compiled from: RemoteSettings.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001\tB5\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u001fR\u001f\u0010#\u001a\u0004\u0018\u00010!8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Lpd9;", "Lfga;", "", Image.TYPE_SMALL, "f", "", "b", "(Lcv1;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Lew3;", "Lew3;", "firebaseInstallationsApi", "Lop;", com.huawei.hms.opendevice.c.a, "Lop;", "appInfo", "Lb22;", DateTokenConverter.CONVERTER_KEY, "Lb22;", "configsFetcher", "Lyfa;", e.a, "Lyfa;", "settingsCache", "Ljr6;", "Ljr6;", "fetchInProgress", "", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/a;", "()Lkotlin/time/a;", "sessionRestartTimeout", "", "()Ljava/lang/Double;", "samplingRate", "Lnl2;", "Lbi8;", "dataStore", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lew3;Lop;Lb22;Lnl2;)V", "g", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: pd9  reason: default package */
/* loaded from: classes2.dex */
public final class pd9 implements fga {
    private static final a g = new a(null);
    private final CoroutineContext a;
    private final ew3 b;
    private final op c;
    private final b22 d;
    private final yfa e;
    private final jr6 f;

    /* compiled from: RemoteSettings.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lpd9$a;", "", "", "FORWARD_SLASH_STRING", "Ljava/lang/String;", "TAG", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: pd9$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteSettings.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @nn2(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, 76, 94}, m = "updateSettings")
    /* renamed from: pd9$b */
    /* loaded from: classes2.dex */
    public static final class b extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return pd9.this.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteSettings.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lorg/json/JSONObject;", "it", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {125, 128, 131, 133, 134, SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend")
    /* renamed from: pd9$c */
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<JSONObject, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        int c;
        /* synthetic */ Object d;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(JSONObject jSONObject, cv1<? super Unit> cv1Var) {
            return ((c) create(jSONObject, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01a1 A[RETURN] */
        /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 440
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pd9.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteSettings.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", RemoteMessageConst.MessageBody.MSG, "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pd9$d */
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((d) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public pd9(CoroutineContext coroutineContext, ew3 ew3Var, op opVar, b22 b22Var, nl2<bi8> nl2Var) {
        z65.h(coroutineContext, "backgroundDispatcher");
        z65.h(ew3Var, "firebaseInstallationsApi");
        z65.h(opVar, "appInfo");
        z65.h(b22Var, "configsFetcher");
        z65.h(nl2Var, "dataStore");
        this.a = coroutineContext;
        this.b = ew3Var;
        this.c = opVar;
        this.d = b22Var;
        this.e = new yfa(nl2Var);
        this.f = lr6.b(false, 1, null);
    }

    private final String f(String str) {
        return new ec9("/").i(str, "");
    }

    @Override // defpackage.fga
    public Boolean a() {
        return this.e.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:44:0x00b4, B:46:0x00b8, B:50:0x00c4, B:36:0x0089, B:38:0x0091, B:41:0x009c), top: B:59:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:44:0x00b4, B:46:0x00b8, B:50:0x00c4, B:36:0x0089, B:38:0x0091, B:41:0x009c), top: B:59:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:44:0x00b4, B:46:0x00b8, B:50:0x00c4, B:36:0x0089, B:38:0x0091, B:41:0x009c), top: B:59:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // defpackage.fga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.cv1<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd9.b(cv1):java.lang.Object");
    }

    @Override // defpackage.fga
    public kotlin.time.a c() {
        Integer e = this.e.e();
        if (e != null) {
            a.C0415a c0415a = kotlin.time.a.b;
            return kotlin.time.a.g(kotlin.time.b.h(e.intValue(), l93.e));
        }
        return null;
    }

    @Override // defpackage.fga
    public Double d() {
        return this.e.f();
    }
}
