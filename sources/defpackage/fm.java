package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.data.dto.response.CheckApiResponse;
import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: ApiCheckService.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\bB7\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b \u0010!J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lfm;", "", "", Image.TYPE_HIGH, "(Lcv1;)Ljava/lang/Object;", "Lb31;", "f", "Lbo;", "a", "Lbo;", "appInitializationStateProvider", "Lvc6;", "b", "Lvc6;", "memoryDataSource", "Landroid/content/Context;", com.huawei.hms.opendevice.c.a, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmh0;", DateTokenConverter.CONVERTER_KEY, "Lmh0;", "buildInfo", "Las8;", "Lru/dodopizza/app/domain/DodopizzaApi;", e.a, "Las8;", "dodoPizzaApiProvider", "kotlin.jvm.PlatformType", "g", "()Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "<init>", "(Lbo;Lvc6;Landroid/content/Context;Lmh0;Las8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: fm  reason: default package */
/* loaded from: classes4.dex */
public final class fm {
    public static final a f = new a(null);
    private static final long g = TimeUnit.SECONDS.toMillis(30);
    private final bo a;
    private final vc6 b;
    private final Context c;
    private final mh0 d;
    private final as8<DodopizzaApi> e;

    /* compiled from: ApiCheckService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lfm$a;", "", "", "TIMEOUT", "J", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fm$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ApiCheckService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.main.ApiCheckService", f = "ApiCheckService.kt", l = {45}, m = "checkApi")
    /* renamed from: fm$b */
    /* loaded from: classes4.dex */
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
            return fm.this.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ApiCheckService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lb31;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.ApiCheckService$checkApi$2", f = "ApiCheckService.kt", l = {49, 50}, m = "invokeSuspend")
    /* renamed from: fm$c */
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<? super b31>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super b31> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        vk9.b(obj);
                        return gm.b(fm.this.g().checkApi("3.73.0"));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                if (!nh0.b(fm.this.d) && !pw6.a.h(fm.this.c)) {
                    bo boVar = fm.this.a;
                    this.a = 1;
                    if (co.b(boVar, this) == d) {
                        return d;
                    }
                } else {
                    return gm.b(CheckApiResponse.Companion.getSUCCESS());
                }
            }
            fm fmVar = fm.this;
            this.a = 2;
            if (fmVar.h(this) == d) {
                return d;
            }
            return gm.b(fm.this.g().checkApi("3.73.0"));
        }
    }

    public fm(bo boVar, vc6 vc6Var, Context context, mh0 mh0Var, as8<DodopizzaApi> as8Var) {
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(vc6Var, "memoryDataSource");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(mh0Var, "buildInfo");
        z65.h(as8Var, "dodoPizzaApiProvider");
        this.a = boVar;
        this.b = vc6Var;
        this.c = context;
        this.d = mh0Var;
        this.e = as8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DodopizzaApi g() {
        return this.e.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(cv1<? super Unit> cv1Var) {
        Object d;
        Object a2 = wc6.a(this.b, cv1Var);
        d = c75.d();
        if (a2 == d) {
            return a2;
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cv1<? super defpackage.b31> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fm.b
            if (r0 == 0) goto L13
            r0 = r7
            fm$b r0 = (defpackage.fm.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fm$b r0 = new fm$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.vk9.b(r7)     // Catch: java.lang.Exception -> L29
            goto L47
        L29:
            r7 = move-exception
            goto L4a
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.vk9.b(r7)
            long r4 = defpackage.fm.g     // Catch: java.lang.Exception -> L29
            fm$c r7 = new fm$c     // Catch: java.lang.Exception -> L29
            r2 = 0
            r7.<init>(r2)     // Catch: java.lang.Exception -> L29
            r0.c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r7 = defpackage.zgb.c(r4, r7, r0)     // Catch: java.lang.Exception -> L29
            if (r7 != r1) goto L47
            return r1
        L47:
            b31 r7 = (defpackage.b31) r7     // Catch: java.lang.Exception -> L29
            goto L52
        L4a:
            boolean r0 = defpackage.gm.a(r7)
            if (r0 == 0) goto L53
            b31 r7 = defpackage.b31.b
        L52:
            return r7
        L53:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm.f(cv1):java.lang.Object");
    }
}
