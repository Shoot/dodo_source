package defpackage;

import com.dodopizza.captcha.provider.CaptchaCancelledException;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hf4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AnalyticsCaptchaListener.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB\u0017\b\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R \u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00030\u0003*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lhc;", "Loo0;", "Lhf4;", "", Image.TYPE_HIGH, "Lpo0;", "captchaMode", "f", "Lik9;", "originalResponse", "Lro0;", "captchaSettings", "", "b", "getTokenResult", "a", "Las8;", "Lgc;", "Las8;", "analytics", "kotlin.jvm.PlatformType", "g", "(Lik9;)Ljava/lang/String;", RemoteMessageConst.Notification.URL, "<init>", "(Las8;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hc  reason: default package */
/* loaded from: classes.dex */
public final class hc implements oo0 {
    public static final a b = new a(null);
    private final as8<gc> a;

    /* compiled from: AnalyticsCaptchaListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lhc$a;", "", "", "CAPTCHA_SHOWN", "Ljava/lang/String;", "CAPTCHA_SOLVED", "PARAM_MODE", "PARAM_RESULT", "PARAM_URL", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hc$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AnalyticsCaptchaListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hc$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[po0.values().length];
            try {
                iArr[po0.INVISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[po0.COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[po0.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AnalyticsCaptchaListener.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hc$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ ik9 b;
        final /* synthetic */ ro0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ik9 ik9Var, ro0 ro0Var) {
            super(1);
            this.b = ik9Var;
            this.c = ro0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, RemoteMessageConst.Notification.URL, hc.this.g(this.b), false, 4, null);
            return bc.e(bcVar, "mode", hc.this.f(this.c.a()), false, 4, null);
        }
    }

    /* compiled from: AnalyticsCaptchaListener.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hc$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ ik9 b;
        final /* synthetic */ ro0 c;
        final /* synthetic */ hf4 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ik9 ik9Var, ro0 ro0Var, hf4 hf4Var) {
            super(1);
            this.b = ik9Var;
            this.c = ro0Var;
            this.d = hf4Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, RemoteMessageConst.Notification.URL, hc.this.g(this.b), false, 4, null);
            bc.e(bcVar, "mode", hc.this.f(this.c.a()), false, 4, null);
            return bc.e(bcVar, "result", hc.this.h(this.d), false, 4, null);
        }
    }

    public hc(as8<gc> as8Var) {
        z65.h(as8Var, "analytics");
        this.a = as8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(po0 po0Var) {
        int i = b.$EnumSwitchMapping$0[po0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "normal";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "compact";
        }
        return "invisible";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(ik9 ik9Var) {
        return ik9Var.K().l().y().getPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h(hf4 hf4Var) {
        if (hf4Var instanceof hf4.a) {
            return "success";
        }
        if ((hf4Var instanceof hf4.b) && (((hf4.b) hf4Var).a() instanceof CaptchaCancelledException)) {
            return "closed";
        }
        return "failure";
    }

    @Override // defpackage.oo0
    public void a(ik9 ik9Var, ro0 ro0Var, hf4 hf4Var) {
        z65.h(ik9Var, "originalResponse");
        z65.h(ro0Var, "captchaSettings");
        z65.h(hf4Var, "getTokenResult");
        dc a2 = ec.a("captcha_solved", new d(ik9Var, ro0Var, hf4Var));
        gc gcVar = this.a.get();
        z65.g(gcVar, "get(...)");
        gcVar.a(a2);
    }

    @Override // defpackage.oo0
    public void b(ik9 ik9Var, ro0 ro0Var) {
        z65.h(ik9Var, "originalResponse");
        z65.h(ro0Var, "captchaSettings");
        dc a2 = ec.a("captcha_shown", new c(ik9Var, ro0Var));
        gc gcVar = this.a.get();
        z65.g(gcVar, "get(...)");
        gcVar.a(a2);
    }
}
