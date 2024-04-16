package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.gu;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: AssistantWelcomeInteractor.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lsw;", "", "", e.a, "(Lcv1;)Ljava/lang/Object;", "Loz3;", "Lww;", "f", "Lmu;", c.a, "Let;", DateTokenConverter.CONVERTER_KEY, "Lnw;", "a", "Lnw;", "data", "Lwv;", "b", "Lwv;", "settingsInteractor", "Lsv;", "Lsv;", "settings", "<init>", "(Lnw;Lwv;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sw  reason: default package */
/* loaded from: classes2.dex */
public final class sw {
    private final nw a;
    private final wv b;
    private sv c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantWelcomeInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomeInteractor", f = "AssistantWelcomeInteractor.kt", l = {35}, m = "loadSettings")
    /* renamed from: sw$a */
    /* loaded from: classes2.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return sw.this.e(this);
        }
    }

    /* compiled from: AssistantWelcomeInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lww;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomeInteractor$observeWelcomeInfo$1", f = "AssistantWelcomeInteractor.kt", l = {25, 26, 29}, m = "invokeSuspend")
    /* renamed from: sw$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<pz3<? super ww>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super ww> pz3Var, cv1<? super Unit> cv1Var) {
            return ((b) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                defpackage.vk9.b(r6)
                goto L66
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                java.lang.Object r1 = r5.b
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r6)
                goto L57
            L25:
                java.lang.Object r1 = r5.b
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r6)
                goto L4a
            L2d:
                defpackage.vk9.b(r6)
                java.lang.Object r6 = r5.b
                pz3 r6 = (defpackage.pz3) r6
                sw r1 = defpackage.sw.this
                sv r1 = defpackage.sw.a(r1)
                if (r1 != 0) goto L58
                ww$a r1 = defpackage.ww.a.a
                r5.b = r6
                r5.a = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r6
            L4a:
                sw r6 = defpackage.sw.this
                r5.b = r1
                r5.a = r3
                java.lang.Object r6 = defpackage.sw.b(r6, r5)
                if (r6 != r0) goto L57
                return r0
            L57:
                r6 = r1
            L58:
                ww$b r1 = defpackage.ww.b.a
                r3 = 0
                r5.b = r3
                r5.a = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L66
                return r0
            L66:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.sw.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public sw(nw nwVar, wv wvVar) {
        z65.h(nwVar, "data");
        z65.h(wvVar, "settingsInteractor");
        this.a = nwVar;
        this.b = wvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cv1<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.sw.a
            if (r0 == 0) goto L13
            r0 = r5
            sw$a r0 = (defpackage.sw.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            sw$a r0 = new sw$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.a
            sw r0 = (defpackage.sw) r0
            defpackage.vk9.b(r5)
            goto L50
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            defpackage.vk9.b(r5)
            nw r5 = r4.a
            ss r5 = r5.C()
            java.lang.String r5 = r5.e()
            wv r2 = r4.b
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = r2.b(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
        L50:
            sv r5 = (defpackage.sv) r5
            r0.c = r5
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw.e(cv1):java.lang.Object");
    }

    public final mu c() {
        ss C = this.a.C();
        sv svVar = this.c;
        if (svVar == null) {
            z65.z("settings");
            svVar = null;
        }
        return new mu(C, svVar);
    }

    public final et d() {
        sv svVar = this.c;
        if (svVar == null) {
            z65.z("settings");
            svVar = null;
        }
        return new et(svVar, new gu.a(this.a.C()), false, 4, null);
    }

    public final oz3<ww> f() {
        return wz3.z(new b(null));
    }
}
