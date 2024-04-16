package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bi8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: SettingsCache.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 02\u00020\u0001:\u0001+B\u0015\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020&¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J1\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u001d\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lyfa;", "", "Lbi8;", "preferences", "", "l", "T", "Lbi8$a;", Action.KEY_ATTRIBUTE, "value", Image.TYPE_HIGH, "(Lbi8$a;Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "()Z", "g", "()Ljava/lang/Boolean;", "", "f", "()Ljava/lang/Double;", "", e.a, "()Ljava/lang/Integer;", "enabled", "n", "(Ljava/lang/Boolean;Lcv1;)Ljava/lang/Object;", "rate", "i", "(Ljava/lang/Double;Lcv1;)Ljava/lang/Object;", "timeoutInSeconds", Image.TYPE_MEDIUM, "(Ljava/lang/Integer;Lcv1;)Ljava/lang/Object;", "cacheDurationInSeconds", "j", "", "cacheUpdatedTime", "k", "(Ljava/lang/Long;Lcv1;)Ljava/lang/Object;", "Lnl2;", "a", "Lnl2;", "dataStore", "Lbea;", "b", "Lbea;", "sessionConfigs", "<init>", "(Lnl2;)V", com.huawei.hms.opendevice.c.a, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: yfa  reason: default package */
/* loaded from: classes2.dex */
public final class yfa {
    private static final b c = new b(null);
    @Deprecated
    private static final bi8.a<Boolean> d = ei8.a("firebase_sessions_enabled");
    @Deprecated
    private static final bi8.a<Double> e = ei8.b("firebase_sessions_sampling_rate");
    @Deprecated
    private static final bi8.a<Integer> f = ei8.d("firebase_sessions_restart_timeout");
    @Deprecated
    private static final bi8.a<Integer> g = ei8.d("firebase_sessions_cache_duration");
    @Deprecated
    private static final bi8.a<Long> h = ei8.e("firebase_sessions_cache_updated_time");
    private final nl2<bi8> a;
    private bea b;

    /* compiled from: SettingsCache.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: yfa$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        int b;

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
            yfa yfaVar;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    yfaVar = (yfa) this.a;
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                yfa yfaVar2 = yfa.this;
                oz3 data = yfaVar2.a.getData();
                this.a = yfaVar2;
                this.b = 1;
                Object u = wz3.u(data, this);
                if (u == d) {
                    return d;
                }
                yfaVar = yfaVar2;
                obj = u;
            }
            yfaVar.l(((bi8) obj).d());
            return Unit.a;
        }
    }

    /* compiled from: SettingsCache.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lyfa$b;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: yfa$b */
    /* loaded from: classes2.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsCache.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @nn2(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {112}, m = "updateConfigValue")
    /* renamed from: yfa$c */
    /* loaded from: classes2.dex */
    public static final class c<T> extends ev1 {
        /* synthetic */ Object a;
        int c;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return yfa.this.h(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsCache.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Luq6;", "preferences", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yfa$d */
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<uq6, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ T c;
        final /* synthetic */ bi8.a<T> d;
        final /* synthetic */ yfa e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T t, bi8.a<T> aVar, yfa yfaVar, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = t;
            this.d = aVar;
            this.e = yfaVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(this.c, this.d, this.e, cv1Var);
            dVar.b = obj;
            return dVar;
        }

        public final Object i(uq6 uq6Var, cv1<? super Unit> cv1Var) {
            return ((d) create(uq6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(uq6 uq6Var, cv1<? super Unit> cv1Var) {
            return i(uq6Var, cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                uq6 uq6Var = (uq6) this.b;
                T t = this.c;
                if (t != 0) {
                    uq6Var.i(this.d, t);
                } else {
                    uq6Var.h(this.d);
                }
                this.e.l(uq6Var);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
    }

    public yfa(nl2<bi8> nl2Var) {
        z65.h(nl2Var, "dataStore");
        this.a = nl2Var;
        rh0.b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object h(defpackage.bi8.a<T> r6, T r7, defpackage.cv1<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.yfa.c
            if (r0 == 0) goto L13
            r0 = r8
            yfa$c r0 = (defpackage.yfa.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yfa$c r0 = new yfa$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.vk9.b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.vk9.b(r8)
            nl2<bi8> r8 = r5.a     // Catch: java.io.IOException -> L29
            yfa$d r2 = new yfa$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = defpackage.fi8.a(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfa.h(bi8$a, java.lang.Object, cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(bi8 bi8Var) {
        this.b = new bea((Boolean) bi8Var.b(d), (Double) bi8Var.b(e), (Integer) bi8Var.b(f), (Integer) bi8Var.b(g), (Long) bi8Var.b(h));
    }

    public final boolean d() {
        bea beaVar = this.b;
        bea beaVar2 = null;
        if (beaVar == null) {
            z65.z("sessionConfigs");
            beaVar = null;
        }
        Long b2 = beaVar.b();
        bea beaVar3 = this.b;
        if (beaVar3 == null) {
            z65.z("sessionConfigs");
        } else {
            beaVar2 = beaVar3;
        }
        Integer a2 = beaVar2.a();
        if (b2 != null && a2 != null && (System.currentTimeMillis() - b2.longValue()) / 1000 < a2.intValue()) {
            return false;
        }
        return true;
    }

    public final Integer e() {
        bea beaVar = this.b;
        if (beaVar == null) {
            z65.z("sessionConfigs");
            beaVar = null;
        }
        return beaVar.d();
    }

    public final Double f() {
        bea beaVar = this.b;
        if (beaVar == null) {
            z65.z("sessionConfigs");
            beaVar = null;
        }
        return beaVar.e();
    }

    public final Boolean g() {
        bea beaVar = this.b;
        if (beaVar == null) {
            z65.z("sessionConfigs");
            beaVar = null;
        }
        return beaVar.c();
    }

    public final Object i(Double d2, cv1<? super Unit> cv1Var) {
        Object d3;
        Object h2 = h(e, d2, cv1Var);
        d3 = c75.d();
        if (h2 == d3) {
            return h2;
        }
        return Unit.a;
    }

    public final Object j(Integer num, cv1<? super Unit> cv1Var) {
        Object d2;
        Object h2 = h(g, num, cv1Var);
        d2 = c75.d();
        if (h2 == d2) {
            return h2;
        }
        return Unit.a;
    }

    public final Object k(Long l, cv1<? super Unit> cv1Var) {
        Object d2;
        Object h2 = h(h, l, cv1Var);
        d2 = c75.d();
        if (h2 == d2) {
            return h2;
        }
        return Unit.a;
    }

    public final Object m(Integer num, cv1<? super Unit> cv1Var) {
        Object d2;
        Object h2 = h(f, num, cv1Var);
        d2 = c75.d();
        if (h2 == d2) {
            return h2;
        }
        return Unit.a;
    }

    public final Object n(Boolean bool, cv1<? super Unit> cv1Var) {
        Object d2;
        Object h2 = h(d, bool, cv1Var);
        d2 = c75.d();
        if (h2 == d2) {
            return h2;
        }
        return Unit.a;
    }
}
