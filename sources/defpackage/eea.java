package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.bi8;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SessionDatastore.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u000f\u0013B\u0017\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Leea;", "Ldea;", "Lbi8;", "preferences", "Lyx3;", "i", "", "sessionId", "", "b", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", com.huawei.hms.opendevice.c.a, "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Ljava/util/concurrent/atomic/AtomicReference;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicReference;", "currentSessionFromDatastore", "Loz3;", com.huawei.hms.push.e.a, "Loz3;", "firebaseSessionDataFlow", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: eea  reason: default package */
/* loaded from: classes2.dex */
public final class eea implements dea {
    private static final c f = new c(null);
    @Deprecated
    private static final k79<Context, nl2<bi8>> g = vh8.b(cea.a.a(), new ng9(b.a), null, null, 12, null);
    private final Context b;
    private final CoroutineContext c;
    private final AtomicReference<yx3> d;
    private final oz3<yx3> e;

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: eea$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SessionDatastore.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyx3;", "it", "", "b", "(Lyx3;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: eea$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0301a<T> implements pz3 {
            final /* synthetic */ eea a;

            C0301a(eea eeaVar) {
                this.a = eeaVar;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(yx3 yx3Var, cv1<? super Unit> cv1Var) {
                this.a.d.set(yx3Var);
                return Unit.a;
            }
        }

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oz3 oz3Var = eea.this.e;
                C0301a c0301a = new C0301a(eea.this);
                this.a = 1;
                if (oz3Var.collect(c0301a, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/core/CorruptionException;", "ex", "Lbi8;", "a", "(Landroidx/datastore/core/CorruptionException;)Lbi8;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: eea$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<CorruptionException, bi8> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bi8 invoke(CorruptionException corruptionException) {
            z65.h(corruptionException, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + ok8.a.e() + CoreConstants.DOT, corruptionException);
            return di8.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Leea$c;", "", "Landroid/content/Context;", "Lnl2;", "Lbi8;", "dataStore$delegate", "Lk79;", "b", "(Landroid/content/Context;)Lnl2;", "dataStore", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: eea$c */
    /* loaded from: classes2.dex */
    public static final class c {
        static final /* synthetic */ je5<Object>[] a = {bc9.g(new cr8(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final nl2<bi8> b(Context context) {
            return (nl2) eea.g.a(context, a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Leea$d;", "", "Lbi8$a;", "", "b", "Lbi8$a;", "a", "()Lbi8$a;", "SESSION_ID", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: eea$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public static final d a = new d();
        private static final bi8.a<String> b = ei8.f("session_id");

        private d() {
        }

        public final bi8.a<String> a() {
            return b;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lbi8;", "", "exception", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {75}, m = "invokeSuspend")
    /* renamed from: eea$e */
    /* loaded from: classes2.dex */
    static final class e extends f3b implements y84<pz3<? super bi8>, Throwable, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        /* synthetic */ Object c;

        e(cv1<? super e> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super bi8> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = pz3Var;
            eVar.c = th;
            return eVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.c);
                bi8 a = di8.a();
                this.b = null;
                this.a = 1;
                if (((pz3) this.b).emit(a, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    /* renamed from: eea$f */
    /* loaded from: classes2.dex */
    public static final class f implements oz3<yx3> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ eea b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: eea$f$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ eea b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @nn2(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {224}, m = "emit")
            /* renamed from: eea$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0302a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0302a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, eea eeaVar) {
                this.a = pz3Var;
                this.b = eeaVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.eea.f.a.C0302a
                    if (r0 == 0) goto L13
                    r0 = r6
                    eea$f$a$a r0 = (defpackage.eea.f.a.C0302a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    eea$f$a$a r0 = new eea$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    bi8 r5 = (defpackage.bi8) r5
                    eea r2 = r4.b
                    yx3 r5 = defpackage.eea.h(r2, r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.eea.f.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public f(oz3 oz3Var, eea eeaVar) {
            this.a = oz3Var;
            this.b = eeaVar;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super yx3> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {87}, m = "invokeSuspend")
    /* renamed from: eea$g */
    /* loaded from: classes2.dex */
    static final class g extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SessionDatastore.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Luq6;", "preferences", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @nn2(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        /* renamed from: eea$g$a */
        /* loaded from: classes2.dex */
        public static final class a extends f3b implements Function2<uq6, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.c = str;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                a aVar = new a(this.c, cv1Var);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(uq6 uq6Var, cv1<? super Unit> cv1Var) {
                return ((a) create(uq6Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    ((uq6) this.b).i(d.a.a(), this.c);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, cv1<? super g> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new g(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((g) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                nl2 b = eea.f.b(eea.this.b);
                a aVar = new a(this.c, null);
                this.a = 1;
                if (fi8.a(b, aVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public eea(Context context, CoroutineContext coroutineContext) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(coroutineContext, "backgroundDispatcher");
        this.b = context;
        this.c = coroutineContext;
        this.d = new AtomicReference<>();
        this.e = new f(wz3.h(f.b(context).getData(), new e(null)), this);
        sh0.d(rx1.a(coroutineContext), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yx3 i(bi8 bi8Var) {
        return new yx3((String) bi8Var.b(d.a.a()));
    }

    @Override // defpackage.dea
    public String a() {
        yx3 yx3Var = this.d.get();
        if (yx3Var != null) {
            return yx3Var.a();
        }
        return null;
    }

    @Override // defpackage.dea
    public void b(String str) {
        z65.h(str, "sessionId");
        sh0.d(rx1.a(this.c), null, null, new g(str, null), 3, null);
    }
}
