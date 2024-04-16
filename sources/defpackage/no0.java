package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.hf4;
import defpackage.hi9;
import defpackage.k65;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CaptchaInterceptor.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\u000eB#\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082\u0010J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001c\u0010\u001b\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001e"}, d2 = {"Lno0;", "Lk65;", "Lk65$a;", "chain", "Lik9;", "originalResponse", DateTokenConverter.CONVERTER_KEY, "Lro0;", "captchaSettings", e.a, "Lhf4;", c.a, "intercept", "Lqo0;", "a", "Lqo0;", "captchaProviderFactory", "Ldo0;", "b", "Ldo0;", "captchaContractAdapter", "Loo0;", "Loo0;", "captchaListener", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lqo0;Ldo0;Loo0;)V", "captcha_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: no0  reason: default package */
/* loaded from: classes.dex */
public final class no0 implements k65 {
    public static final a e = new a(null);
    private final qo0 a;
    private final do0 b;
    private final oo0 c;
    private final Logger d;

    /* compiled from: CaptchaInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lno0$a;", "", "", "CODE_OF_NEED_CAPTCHA", "I", "<init>", "()V", "captcha_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: no0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CaptchaInterceptor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lhf4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.dodopizza.captcha.retrofit.CaptchaInterceptor$getTokenResult$1", f = "CaptchaInterceptor.kt", l = {102}, m = "invokeSuspend")
    /* renamed from: no0$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super hf4>, Object> {
        int a;
        final /* synthetic */ ro0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ro0 ro0Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = ro0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super hf4> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            try {
                if (i != 0) {
                    if (i == 1) {
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    so0 a = no0.this.a.a(this.c.c());
                    ro0 ro0Var = this.c;
                    this.a = 1;
                    obj = a.a(ro0Var, this);
                    if (obj == d) {
                        return d;
                    }
                }
                return new hf4.a((String) obj);
            } catch (Exception e) {
                no0.this.d.warn("Failed to get token. ", (Throwable) e);
                return new hf4.b(e);
            }
        }
    }

    public no0(qo0 qo0Var, do0 do0Var, oo0 oo0Var) {
        z65.h(qo0Var, "captchaProviderFactory");
        z65.h(do0Var, "captchaContractAdapter");
        this.a = qo0Var;
        this.b = do0Var;
        this.c = oo0Var;
        this.d = LoggerFactory.getLogger("CaptchaInterceptor");
    }

    private final hf4 c(ro0 ro0Var) {
        return (hf4) qh0.f(null, new b(ro0Var, null), 1, null);
    }

    private final ik9 d(k65.a aVar, ik9 ik9Var) {
        boolean y;
        while (true) {
            String string = ik9Var.x(Long.MAX_VALUE).string();
            if (string != null) {
                ro0 ro0Var = null;
                try {
                    ro0 c = this.b.c(string);
                    y = l0b.y(c.b());
                    if (!y) {
                        ro0Var = c;
                    }
                } catch (Exception unused) {
                }
                if (ro0Var != null && this.b.b(ik9Var)) {
                    ik9Var.close();
                    ik9 e2 = e(aVar, ik9Var, ro0Var);
                    if (e2.isSuccessful()) {
                        return e2;
                    }
                    if (e2.j() != 418) {
                        this.d.error("Captcha request error", ik9Var.s() + "; Body" + string);
                    }
                    ik9Var = e2;
                } else {
                    return ik9Var;
                }
            } else {
                throw new IllegalArgumentException("No body provided".toString());
            }
        }
    }

    private final ik9 e(k65.a aVar, ik9 ik9Var, ro0 ro0Var) {
        oo0 oo0Var = this.c;
        if (oo0Var != null) {
            oo0Var.b(ik9Var, ro0Var);
        }
        hf4 c = c(ro0Var);
        oo0 oo0Var2 = this.c;
        if (oo0Var2 != null) {
            oo0Var2.a(ik9Var, ro0Var, c);
        }
        if (c instanceof hf4.a) {
            hi9.a i = aVar.request().i();
            do0 do0Var = this.b;
            z65.g(i, "this");
            do0Var.a(i, ((hf4.a) c).a(), ro0Var.b());
            ik9 b2 = aVar.b(i.b());
            z65.g(b2, "{\n        val newRequest…oceed(newRequest)\n      }");
            return b2;
        } else if (c instanceof hf4.b) {
            throw ((hf4.b) c).a();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        z65.h(aVar, "chain");
        ik9 b2 = aVar.b(aVar.request());
        if (b2.isSuccessful()) {
            z65.g(b2, "{\n      response\n    }");
            return b2;
        }
        z65.g(b2, "response");
        return d(aVar, b2);
    }
}
