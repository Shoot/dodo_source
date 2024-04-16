package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: AppInitializer.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b4\u00105J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0006\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR#\u0010#\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010.\u001a\b\u0012\u0004\u0012\u00020%0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u00100\u001a\n \u001e*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010/R\u001c\u00103\u001a\n \u001e*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Ldo;", "Lbo;", "", "o", "(Lcv1;)Ljava/lang/Object;", "p", "q", "", "n", Image.TYPE_MEDIUM, "k", "l", "j", "Las8;", "Ln80;", "a", "Las8;", "baseUrlInteractorProvider", "Lnd0;", "b", "blockStoreInteractorProvider", "Lhp;", com.huawei.hms.opendevice.c.a, "Lhp;", "appStateProvider", "Lqx1;", DateTokenConverter.CONVERTER_KEY, "Lqx1;", "processScope", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", com.huawei.hms.push.e.a, "Lrn5;", "i", "()Lorg/slf4j/Logger;", "logger", "Lfr6;", "Lao;", "f", "Lfr6;", "_state", "Lkua;", "g", "Lkua;", "getState", "()Lkua;", "state", "()Ln80;", "baseUrlInteractor", Image.TYPE_HIGH, "()Lnd0;", "blockStoreInteractor", "<init>", "(Las8;Las8;Lhp;Lqx1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: do  reason: invalid class name and default package */
/* loaded from: classes.dex */
public final class Cdo implements bo {
    private final as8<n80> a;
    private final as8<nd0> b;
    private final hp c;
    private final qx1 d;
    private final rn5 e;
    private final fr6<ao> f;
    private final kua<ao> g;

    /* compiled from: AppInitializer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.startup.presentation.AppInitializer$initApplication$1", f = "AppInitializer.kt", l = {46, 47, 54, 56}, m = "invokeSuspend")
    /* renamed from: do$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        boolean a;
        boolean b;
        int c;

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

        /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r6.c
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L39
                if (r1 == r5) goto L35
                if (r1 == r4) goto L2f
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                boolean r0 = r6.b
                boolean r1 = r6.a
                defpackage.vk9.b(r7)
                goto L94
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                boolean r1 = r6.b
                boolean r3 = r6.a
                defpackage.vk9.b(r7)
                r7 = r1
                r1 = r3
                goto L83
            L2f:
                boolean r1 = r6.a
                defpackage.vk9.b(r7)
                goto L61
            L35:
                defpackage.vk9.b(r7)
                goto L4e
            L39:
                defpackage.vk9.b(r7)
                wta r7 = defpackage.wta.a
                fxa r1 = defpackage.fxa.j
                r7.d(r1)
                do r7 = defpackage.Cdo.this
                r6.c = r5
                java.lang.Object r7 = defpackage.Cdo.d(r7, r6)
                if (r7 != r0) goto L4e
                return r0
            L4e:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r1 = r7.booleanValue()
                do r7 = defpackage.Cdo.this
                r6.a = r1
                r6.c = r4
                java.lang.Object r7 = defpackage.Cdo.e(r7, r6)
                if (r7 != r0) goto L61
                return r0
            L61:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                do r4 = defpackage.Cdo.this
                nd0 r4 = defpackage.Cdo.b(r4)
                r4.h()
                do r4 = defpackage.Cdo.this
                hp r4 = defpackage.Cdo.a(r4)
                r6.a = r1
                r6.b = r7
                r6.c = r3
                java.lang.Object r3 = defpackage.ip.a(r4, r6)
                if (r3 != r0) goto L83
                return r0
            L83:
                do r3 = defpackage.Cdo.this
                r6.a = r1
                r6.b = r7
                r6.c = r2
                java.lang.Object r2 = defpackage.Cdo.f(r3, r6)
                if (r2 != r0) goto L92
                return r0
            L92:
                r0 = r7
                r7 = r2
            L94:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r1 != 0) goto Lbb
                if (r7 == 0) goto L9f
                goto Lbb
            L9f:
                if (r0 == 0) goto Lad
                do r7 = defpackage.Cdo.this
                fr6 r7 = defpackage.Cdo.c(r7)
                ao$a r0 = defpackage.ao.a.a
                r7.setValue(r0)
                goto Lc6
            Lad:
                do r7 = defpackage.Cdo.this
                fr6 r7 = defpackage.Cdo.c(r7)
                ao$d r0 = defpackage.ao.d.a
                ao$c r1 = defpackage.ao.c.a
                r7.d(r0, r1)
                goto Lc6
            Lbb:
                do r7 = defpackage.Cdo.this
                fr6 r7 = defpackage.Cdo.c(r7)
                ao$b r0 = defpackage.ao.b.a
                r7.setValue(r0)
            Lc6:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.Cdo.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInitializer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.core.feature.startup.presentation.AppInitializer", f = "AppInitializer.kt", l = {74}, m = "initBaseUrlFromBlockStore")
    /* renamed from: do$b */
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return Cdo.this.o(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInitializer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.core.feature.startup.presentation.AppInitializer", f = "AppInitializer.kt", l = {84}, m = "initUserDataFromBlockStore")
    /* renamed from: do$c */
    /* loaded from: classes.dex */
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
            return Cdo.this.p(this);
        }
    }

    /* compiled from: AppInitializer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: do$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<Logger> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("AppInitializer");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInitializer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.core.feature.startup.presentation.AppInitializer", f = "AppInitializer.kt", l = {94}, m = "updateBaseUrl")
    /* renamed from: do$e */
    /* loaded from: classes.dex */
    public static final class e extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        e(cv1<? super e> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return Cdo.this.q(this);
        }
    }

    public Cdo(as8<n80> as8Var, as8<nd0> as8Var2, hp hpVar, qx1 qx1Var) {
        rn5 b2;
        z65.h(as8Var, "baseUrlInteractorProvider");
        z65.h(as8Var2, "blockStoreInteractorProvider");
        z65.h(hpVar, "appStateProvider");
        z65.h(qx1Var, "processScope");
        this.a = as8Var;
        this.b = as8Var2;
        this.c = hpVar;
        this.d = qx1Var;
        b2 = yn5.b(d.a);
        this.e = b2;
        fr6<ao> a2 = mua.a(ao.d.a);
        this.f = a2;
        this.g = wz3.d(a2);
    }

    private final n80 g() {
        return this.a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nd0 h() {
        return this.b.get();
    }

    private final Logger i() {
        return (Logger) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.cv1<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.Cdo.b
            if (r0 == 0) goto L13
            r0 = r5
            do$b r0 = (defpackage.Cdo.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            do$b r0 = new do$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.a
            do r1 = (defpackage.Cdo) r1
            defpackage.vk9.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L4a
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            defpackage.vk9.b(r5)
            n80 r5 = r4.g()     // Catch: java.lang.Exception -> L51
            r0.a = r4     // Catch: java.lang.Exception -> L51
            r0.d = r3     // Catch: java.lang.Exception -> L51
            java.lang.Object r5 = r5.d(r0)     // Catch: java.lang.Exception -> L51
            if (r5 != r1) goto L49
            return r1
        L49:
            r1 = r4
        L4a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L2d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L2d
            goto L64
        L51:
            r5 = move-exception
            r1 = r4
        L53:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            defpackage.q95.k(r0)
            org.slf4j.Logger r0 = r1.i()
            java.lang.String r1 = "Failed to init base url from BlockStore"
            r0.error(r1, r5)
            r5 = 0
        L64:
            java.lang.Boolean r5 = defpackage.nf0.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Cdo.o(cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.cv1<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.Cdo.c
            if (r0 == 0) goto L13
            r0 = r5
            do$c r0 = (defpackage.Cdo.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            do$c r0 = new do$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.a
            do r1 = (defpackage.Cdo) r1
            defpackage.vk9.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L4a
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            defpackage.vk9.b(r5)
            nd0 r5 = r4.h()     // Catch: java.lang.Exception -> L51
            r0.a = r4     // Catch: java.lang.Exception -> L51
            r0.d = r3     // Catch: java.lang.Exception -> L51
            java.lang.Object r5 = r5.g(r0)     // Catch: java.lang.Exception -> L51
            if (r5 != r1) goto L49
            return r1
        L49:
            r1 = r4
        L4a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L2d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L2d
            goto L64
        L51:
            r5 = move-exception
            r1 = r4
        L53:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            defpackage.q95.k(r0)
            org.slf4j.Logger r0 = r1.i()
            java.lang.String r1 = "Failed to init user data from BlockStore"
            r0.error(r1, r5)
            r5 = 0
        L64:
            java.lang.Boolean r5 = defpackage.nf0.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Cdo.p(cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.cv1<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.Cdo.e
            if (r0 == 0) goto L13
            r0 = r5
            do$e r0 = (defpackage.Cdo.e) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            do$e r0 = new do$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.a
            do r1 = (defpackage.Cdo) r1
            defpackage.vk9.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L4a
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            defpackage.vk9.b(r5)
            n80 r5 = r4.g()     // Catch: java.lang.Exception -> L51
            r0.a = r4     // Catch: java.lang.Exception -> L51
            r0.d = r3     // Catch: java.lang.Exception -> L51
            java.lang.Object r5 = r5.f(r0)     // Catch: java.lang.Exception -> L51
            if (r5 != r1) goto L49
            return r1
        L49:
            r1 = r4
        L4a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L2d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L2d
            goto L64
        L51:
            r5 = move-exception
            r1 = r4
        L53:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            defpackage.q95.k(r0)
            org.slf4j.Logger r0 = r1.i()
            java.lang.String r1 = "Failed to update the base url"
            r0.error(r1, r5)
            r5 = 0
        L64:
            java.lang.Boolean r5 = defpackage.nf0.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Cdo.q(cv1):java.lang.Object");
    }

    @Override // defpackage.bo
    public kua<ao> getState() {
        return this.g;
    }

    public final void j() {
        this.f.d(ao.a.a, ao.c.a);
    }

    public final void k() {
        this.f.setValue(ao.b.a);
    }

    public final void l() {
        this.f.setValue(ao.a.a);
    }

    public final void m() {
        this.f.setValue(ao.a.a);
    }

    public final void n() {
        sh0.d(this.d, null, null, new a(null), 3, null);
    }
}
