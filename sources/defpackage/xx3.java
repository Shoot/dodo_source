package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FirebaseSessions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lxx3;", "", "Lqv3;", "a", "Lqv3;", "firebaseApp", "Lgfa;", "b", "Lgfa;", "settings", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lqv3;Lgfa;Lkotlin/coroutines/CoroutineContext;)V", c.a, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: xx3  reason: default package */
/* loaded from: classes2.dex */
public final class xx3 {
    public static final b c = new b(null);
    private final qv3 a;
    private final gfa b;

    /* compiled from: FirebaseSessions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {44, 48}, m = "invokeSuspend")
    /* renamed from: xx3$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ CoroutineContext c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CoroutineContext coroutineContext, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = coroutineContext;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r5.a
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                defpackage.vk9.b(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                defpackage.vk9.b(r6)
                goto L2e
            L20:
                defpackage.vk9.b(r6)
                zx3 r6 = defpackage.zx3.a
                r5.a = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L99
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L99
                java.lang.Object r1 = r6.next()
                dfa r1 = (defpackage.dfa) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L48
                xx3 r6 = defpackage.xx3.this
                gfa r6 = defpackage.xx3.b(r6)
                r5.a = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L69
                return r0
            L69:
                xx3 r6 = defpackage.xx3.this
                gfa r6 = defpackage.xx3.b(r6)
                boolean r6 = r6.d()
                if (r6 != 0) goto L7b
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto L9e
            L7b:
                mea r6 = new mea
                kotlin.coroutines.CoroutineContext r0 = r5.c
                r6.<init>(r0)
                r6.i()
                ffa r0 = defpackage.ffa.a
                r0.a(r6)
                xx3 r6 = defpackage.xx3.this
                qv3 r6 = defpackage.xx3.a(r6)
                wx3 r0 = new wx3
                r0.<init>()
                r6.h(r0)
                goto L9e
            L99:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
            L9e:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xx3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FirebaseSessions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lxx3$b;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: xx3$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public xx3(qv3 qv3Var, gfa gfaVar, CoroutineContext coroutineContext) {
        z65.h(qv3Var, "firebaseApp");
        z65.h(gfaVar, "settings");
        z65.h(coroutineContext, "backgroundDispatcher");
        this.a = qv3Var;
        this.b = gfaVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = qv3Var.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(ffa.a);
            sh0.d(rx1.a(coroutineContext), null, null, new a(coroutineContext, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + CoreConstants.DOT);
    }
}
