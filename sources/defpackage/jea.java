package defpackage;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SessionFirelogPublisher.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u000fB/\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ\b\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Ljea;", "Liea;", "Lgea;", "sessionEvent", "", "g", "", "j", "(Lcv1;)Ljava/lang/Object;", "", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "i", "Lfea;", "sessionDetails", "a", "Lqv3;", "b", "Lqv3;", "firebaseApp", "Lew3;", com.huawei.hms.opendevice.c.a, "Lew3;", "firebaseInstallations", "Lgfa;", DateTokenConverter.CONVERTER_KEY, "Lgfa;", "sessionSettings", "Luk3;", e.a, "Luk3;", "eventGDTLogger", "Lkotlin/coroutines/CoroutineContext;", "f", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lqv3;Lew3;Lgfa;Luk3;Lkotlin/coroutines/CoroutineContext;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: jea  reason: default package */
/* loaded from: classes2.dex */
public final class jea implements iea {
    public static final a g = new a(null);
    private static final double h = Math.random();
    private final qv3 b;
    private final ew3 c;
    private final gfa d;
    private final uk3 e;
    private final CoroutineContext f;

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ljea$a;", "", "", "TAG", "Ljava/lang/String;", "", "randomValueForSampling", "D", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: jea$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @nn2(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {111}, m = "getFirebaseInstallationId")
    /* renamed from: jea$b */
    /* loaded from: classes2.dex */
    public static final class b extends ev1 {
        /* synthetic */ Object a;
        int c;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return jea.this.h(this);
        }
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {64, 70, 71}, m = "invokeSuspend")
    /* renamed from: jea$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        int g;
        final /* synthetic */ fea i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fea feaVar, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.i = feaVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(this.i, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jea.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @nn2(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {93}, m = "shouldLogSession")
    /* renamed from: jea$d */
    /* loaded from: classes2.dex */
    public static final class d extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        d(cv1<? super d> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return jea.this.j(this);
        }
    }

    public jea(qv3 qv3Var, ew3 ew3Var, gfa gfaVar, uk3 uk3Var, CoroutineContext coroutineContext) {
        z65.h(qv3Var, "firebaseApp");
        z65.h(ew3Var, "firebaseInstallations");
        z65.h(gfaVar, "sessionSettings");
        z65.h(uk3Var, "eventGDTLogger");
        z65.h(coroutineContext, "backgroundDispatcher");
        this.b = qv3Var;
        this.c = ew3Var;
        this.d = gfaVar;
        this.e = uk3Var;
        this.f = coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(gea geaVar) {
        try {
            this.e.a(geaVar);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + geaVar.c().e());
        } catch (RuntimeException e) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cv1<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.jea.b
            if (r0 == 0) goto L13
            r0 = r5
            jea$b r0 = (defpackage.jea.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jea$b r0 = new jea$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.vk9.b(r5)     // Catch: java.lang.Exception -> L29
            goto L4a
        L29:
            r5 = move-exception
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.vk9.b(r5)
            ew3 r5 = r4.c     // Catch: java.lang.Exception -> L29
            y6b r5 = r5.getId()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "firebaseInstallations.id"
            defpackage.z65.g(r5, r2)     // Catch: java.lang.Exception -> L29
            r0.c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = defpackage.q7b.a(r5, r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L29
            goto L56
        L4d:
            java.lang.String r0 = "SessionFirelogPublisher"
            java.lang.String r1 = "Error getting Firebase Installation ID. Using an empty ID"
            android.util.Log.e(r0, r1, r5)
            java.lang.String r5 = ""
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jea.h(cv1):java.lang.Object");
    }

    private final boolean i() {
        if (h <= this.d.b()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.cv1<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.jea.d
            if (r0 == 0) goto L13
            r0 = r6
            jea$d r0 = (defpackage.jea.d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jea$d r0 = new jea$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.a
            jea r0 = (defpackage.jea) r0
            defpackage.vk9.b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            defpackage.vk9.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            gfa r6 = r5.d
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            gfa r6 = r0.d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = defpackage.nf0.a(r1)
            return r6
        L60:
            boolean r6 = r0.i()
            if (r6 != 0) goto L70
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = defpackage.nf0.a(r1)
            return r6
        L70:
            java.lang.Boolean r6 = defpackage.nf0.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jea.j(cv1):java.lang.Object");
    }

    @Override // defpackage.iea
    public void a(fea feaVar) {
        z65.h(feaVar, "sessionDetails");
        sh0.d(rx1.a(this.f), null, null, new c(feaVar, null), 3, null);
    }
}
