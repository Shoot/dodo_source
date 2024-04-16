package defpackage;

import android.app.Activity;
import com.dodopizza.captcha.provider.CaptchaException;
import com.huawei.hms.push.e;
import defpackage.sk9;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
/* compiled from: AbstractCaptchaTokenProvider.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 \u00182\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH$R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lz0;", "Lso0;", "Landroid/app/Activity;", "f", "(Lcv1;)Ljava/lang/Object;", "Lro0;", "settings", "", "a", "(Lro0;Lcv1;)Ljava/lang/Object;", "activity", "Lfn0;", "cont", "", e.a, "Lbo0;", "Lbo0;", "captchaActivityHolder", "Lorg/slf4j/Logger;", com.huawei.hms.opendevice.c.a, "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lbo0;)V", "b", "captcha_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: z0  reason: default package */
/* loaded from: classes.dex */
public abstract class z0 implements so0 {
    public static final a b = new a(null);
    private static final long c = TimeUnit.SECONDS.toMillis(30);
    private final bo0 a;

    /* compiled from: AbstractCaptchaTokenProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lz0$a;", "", "", "MAX_TIME_TO_WAIT", "J", "WAIT_ACTIVITY_DELAY_MS", "<init>", "()V", "captcha_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: z0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractCaptchaTokenProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.dodopizza.captcha.provider.AbstractCaptchaTokenProvider$getToken$2", f = "AbstractCaptchaTokenProvider.kt", l = {21, 70}, m = "invokeSuspend")
    /* renamed from: z0$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super String>, Object> {
        Object a;
        Object b;
        Object c;
        int d;
        final /* synthetic */ ro0 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ro0 ro0Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.f = ro0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.f, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super String> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            cv1 c;
            Object d2;
            d = c75.d();
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ro0 ro0Var = (ro0) this.c;
                        z0 z0Var = (z0) this.b;
                        Activity activity = (Activity) this.a;
                        vk9.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                z0 z0Var2 = z0.this;
                this.d = 1;
                obj = z0Var2.f(this);
                if (obj == d) {
                    return d;
                }
            }
            Activity activity2 = (Activity) obj;
            z0 z0Var3 = z0.this;
            ro0 ro0Var2 = this.f;
            this.a = activity2;
            this.b = z0Var3;
            this.c = ro0Var2;
            this.d = 2;
            c = b75.c(this);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            if (activity2 == null) {
                z0Var3.c().error("Unable to get captcha: no activity");
                sk9.a aVar = sk9.b;
                gn0Var.resumeWith(sk9.b(vk9.a(new CaptchaException("No activity provided"))));
            } else {
                z0Var3.e(ro0Var2, activity2, gn0Var);
            }
            obj = gn0Var.s();
            d2 = c75.d();
            if (obj == d2) {
                io2.c(this);
            }
            if (obj == d) {
                return d;
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractCaptchaTokenProvider.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @nn2(c = "com.dodopizza.captcha.provider.AbstractCaptchaTokenProvider", f = "AbstractCaptchaTokenProvider.kt", l = {58}, m = "tryWaitActivity")
    /* renamed from: z0$c */
    /* loaded from: classes.dex */
    public static final class c extends ev1 {
        Object a;
        Object b;
        long c;
        int d;
        /* synthetic */ Object e;
        int g;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return z0.this.f(this);
        }
    }

    public z0(bo0 bo0Var) {
        z65.h(bo0Var, "captchaActivityHolder");
        this.a = bo0Var;
    }

    static /* synthetic */ Object d(z0 z0Var, ro0 ro0Var, cv1<? super String> cv1Var) {
        return qh0.g(v33.c(), new b(ro0Var, null), cv1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r2 < r6) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:21:0x0062). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cv1<? super android.app.Activity> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.z0.c
            if (r0 == 0) goto L13
            r0 = r13
            z0$c r0 = (defpackage.z0.c) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            z0$c r0 = new z0$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.e
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.g
            r3 = 100
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 != r5) goto L37
            int r2 = r0.d
            long r6 = r0.c
            java.lang.Object r8 = r0.b
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.Object r9 = r0.a
            z0 r9 = (defpackage.z0) r9
            defpackage.vk9.b(r13)
            goto L62
        L37:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3f:
            defpackage.vk9.b(r13)
            long r6 = defpackage.z0.c
            long r6 = r6 / r3
            r13 = 0
            r2 = 0
            r9 = r12
        L48:
            bo0 r13 = r9.a
            android.app.Activity r8 = r13.a()
            if (r8 == 0) goto L51
            goto L68
        L51:
            r0.a = r9
            r0.b = r8
            r0.c = r6
            r0.d = r2
            r0.g = r5
            java.lang.Object r13 = defpackage.xt2.a(r3, r0)
            if (r13 != r1) goto L62
            return r1
        L62:
            int r2 = r2 + r5
            long r10 = (long) r2
            int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r13 < 0) goto L48
        L68:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z0.f(cv1):java.lang.Object");
    }

    @Override // defpackage.so0
    public Object a(ro0 ro0Var, cv1<? super String> cv1Var) {
        return d(this, ro0Var, cv1Var);
    }

    protected abstract Logger c();

    protected abstract void e(ro0 ro0Var, Activity activity, fn0<? super String> fn0Var);
}
