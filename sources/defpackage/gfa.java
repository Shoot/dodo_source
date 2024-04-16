package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.a;
/* compiled from: SessionsSettings.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aB1\b\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u0019\u0010$B)\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u0019\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006("}, d2 = {"Lgfa;", "", "", "samplingRate", "", e.a, "Lkotlin/time/a;", "sessionRestartTimeout", "f", "(J)Z", "", "g", "(Lcv1;)Ljava/lang/Object;", "Lfga;", "a", "Lfga;", "localOverrideSettings", "b", "remoteSettings", DateTokenConverter.CONVERTER_KEY, "()Z", "sessionsEnabled", "()D", com.huawei.hms.opendevice.c.a, "()J", "<init>", "(Lfga;Lfga;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "backgroundDispatcher", "Lew3;", "firebaseInstallationsApi", "Lop;", "appInfo", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lew3;Lop;)V", "Lqv3;", "firebaseApp", "(Lqv3;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lew3;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: gfa  reason: default package */
/* loaded from: classes2.dex */
public final class gfa {
    public static final b c = new b(null);
    private static final k79<Context, nl2<bi8>> d = vh8.b(cea.a.b(), new ng9(a.a), null, null, 12, null);
    private final fga a;
    private final fga b;

    /* compiled from: SessionsSettings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/core/CorruptionException;", "ex", "Lbi8;", "a", "(Landroidx/datastore/core/CorruptionException;)Lbi8;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: gfa$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<CorruptionException, bi8> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bi8 invoke(CorruptionException corruptionException) {
            z65.h(corruptionException, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + ok8.a.e() + CoreConstants.DOT, corruptionException);
            return di8.a();
        }
    }

    /* compiled from: SessionsSettings.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lgfa$b;", "", "Landroid/content/Context;", "Lnl2;", "Lbi8;", "dataStore$delegate", "Lk79;", "b", "(Landroid/content/Context;)Lnl2;", "dataStore", "Lgfa;", com.huawei.hms.opendevice.c.a, "()Lgfa;", "instance", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: gfa$b */
    /* loaded from: classes2.dex */
    public static final class b {
        static final /* synthetic */ je5<Object>[] a = {bc9.g(new cr8(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final nl2<bi8> b(Context context) {
            return (nl2) gfa.d.a(context, a[0]);
        }

        public final gfa c() {
            Object j = hw3.a(kv3.a).j(gfa.class);
            z65.g(j, "Firebase.app[SessionsSettings::class.java]");
            return (gfa) j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SessionsSettings.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @nn2(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {138, 139}, m = "updateSettings")
    /* renamed from: gfa$c */
    /* loaded from: classes2.dex */
    public static final class c extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return gfa.this.g(this);
        }
    }

    public gfa(fga fgaVar, fga fgaVar2) {
        z65.h(fgaVar, "localOverrideSettings");
        z65.h(fgaVar2, "remoteSettings");
        this.a = fgaVar;
        this.b = fgaVar2;
    }

    private final boolean e(double d2) {
        if (0.0d > d2 || d2 > 1.0d) {
            return false;
        }
        return true;
    }

    private final boolean f(long j) {
        if (kotlin.time.a.J(j) && kotlin.time.a.E(j)) {
            return true;
        }
        return false;
    }

    public final double b() {
        Double d2 = this.a.d();
        if (d2 != null) {
            double doubleValue = d2.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double d3 = this.b.d();
        if (d3 != null) {
            double doubleValue2 = d3.doubleValue();
            if (e(doubleValue2)) {
                return doubleValue2;
            }
            return 1.0d;
        }
        return 1.0d;
    }

    public final long c() {
        kotlin.time.a c2 = this.a.c();
        if (c2 != null) {
            long N = c2.N();
            if (f(N)) {
                return N;
            }
        }
        kotlin.time.a c3 = this.b.c();
        if (c3 != null) {
            long N2 = c3.N();
            if (f(N2)) {
                return N2;
            }
        }
        a.C0415a c0415a = kotlin.time.a.b;
        return kotlin.time.b.h(30, l93.f);
    }

    public final boolean d() {
        Boolean a2 = this.a.a();
        if (a2 != null) {
            return a2.booleanValue();
        }
        Boolean a3 = this.b.a();
        if (a3 != null) {
            return a3.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cv1<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.gfa.c
            if (r0 == 0) goto L13
            r0 = r6
            gfa$c r0 = (defpackage.gfa.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gfa$c r0 = new gfa$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.vk9.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.a
            gfa r2 = (defpackage.gfa) r2
            defpackage.vk9.b(r6)
            goto L4d
        L3c:
            defpackage.vk9.b(r6)
            fga r6 = r5.a
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            fga r6 = r2.b
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfa.g(cv1):java.lang.Object");
    }

    private gfa(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, ew3 ew3Var, op opVar) {
        this(new fs5(context), new pd9(coroutineContext2, ew3Var, opVar, new qd9(opVar, coroutineContext, null, 4, null), c.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gfa(defpackage.qv3 r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.CoroutineContext r10, defpackage.ew3 r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            defpackage.z65.h(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            defpackage.z65.h(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            defpackage.z65.h(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            defpackage.z65.h(r11, r0)
            android.content.Context r2 = r8.k()
            java.lang.String r0 = "firebaseApp.applicationContext"
            defpackage.z65.g(r2, r0)
            hea r0 = defpackage.hea.a
            op r6 = r0.b(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfa.<init>(qv3, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, ew3):void");
    }
}
