package ru.dodopizza.app.presentation.payment.card.secure3d;

import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.payment.card.secure3d.Secure3dPresenter;
/* compiled from: Secure3dPresenter.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b4\u00105J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u000bH\u0014J\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u000bJ\u0016\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010/\u001a\n ,*\u0004\u0018\u00010+0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020'008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00067"}, d2 = {"Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3dPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ll3a;", "", "jsonUrl", "Lkotlin/Pair;", "x", "Lrs7;", "paymentAuthorization3DS", "paRes", "md", "", "r", "onFirstViewAttach", "t", "", "progress", "u", "failingUrl", "description", Image.TYPE_SMALL, "onBackPressed", "jsonString", "w", "a", "Lrs7;", "authorizationParams", "Lj2c;", "b", "Lj2c;", "vpnChecker", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lf63;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "dodoRouter", "", e.a, "Z", "isAuthorizationCompleted", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "Lfr6;", "g", "Lfr6;", "is3DSWebPageLoadingFlow", "<init>", "(Lrs7;Lj2c;Lgc;Lf63;)V", Image.TYPE_HIGH, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Secure3dPresenter extends BasePresenter<l3a> {
    public static final a h = new a(null);
    private final rs7 a;
    private final j2c b;
    private final gc c;
    private final f63 d;
    private boolean e;
    private final Logger f;
    private final fr6<Boolean> g;

    /* compiled from: Secure3dPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/payment/card/secure3d/Secure3dPresenter$a;", "", "", "ONE_HUNDRED_PERCENT_PROGRESS", "I", "REQUEST_SECURE_3D", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Secure3dPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "loading", "", "a", "(Z)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<Boolean, Long> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final Long a(boolean z) {
            long j;
            if (z) {
                j = 0;
            } else {
                j = 500;
            }
            return Long.valueOf(j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Long invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* compiled from: Secure3dPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "loading", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.payment.card.secure3d.Secure3dPresenter$onFirstViewAttach$2", f = "Secure3dPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ boolean b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = ((Boolean) obj).booleanValue();
            return cVar;
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((c) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, cv1<? super Unit> cv1Var) {
            return i(bool.booleanValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (this.b) {
                    ((l3a) Secure3dPresenter.this.getViewState()).b();
                } else {
                    ((l3a) Secure3dPresenter.this.getViewState()).U9();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public Secure3dPresenter(rs7 rs7Var, j2c j2cVar, gc gcVar, f63 f63Var) {
        z65.h(rs7Var, "authorizationParams");
        z65.h(j2cVar, "vpnChecker");
        z65.h(gcVar, "analytics");
        z65.h(f63Var, "dodoRouter");
        this.a = rs7Var;
        this.b = j2cVar;
        this.c = gcVar;
        this.d = f63Var;
        this.f = LoggerFactory.getLogger("Secure3dPresenter");
        this.g = mua.a(Boolean.TRUE);
    }

    private final void r(rs7 rs7Var, String str, String str2) {
        this.e = true;
        this.d.i(R.id.secure_3d_authorization_data, new j3a(rs7Var.a(), rs7Var, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Secure3dPresenter secure3dPresenter) {
        z65.h(secure3dPresenter, "this$0");
        if (!secure3dPresenter.e) {
            secure3dPresenter.d.i(R.id.secure_3d_authorization_data, null);
        }
    }

    private final Pair<String, String> x(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new Pair<>(jSONObject.getString("paRes"), jSONObject.getString("md"));
    }

    public final void onBackPressed() {
        new Handler().postDelayed(new Runnable() { // from class: i3a
            @Override // java.lang.Runnable
            public final void run() {
                Secure3dPresenter.v(Secure3dPresenter.this);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        ((l3a) getViewState()).X8(this.a);
        o(wz3.F(wz3.n(this.g, b.a), new c(null)));
    }

    public final void s(String str, String str2) {
        z65.h(str, "failingUrl");
        z65.h(str2, "description");
        this.e = true;
        this.c.a(ps7.a.f(this.b.a(), str, str2));
        this.d.i(R.id.secure_3d_authorization_data, "Не удалось загрузить страницу банка, попробуйте позже");
    }

    public final void t() {
        this.g.setValue(Boolean.TRUE);
        this.c.a(ps7.a.h(this.b.a()));
    }

    public final void u(int i) {
        boolean z;
        if (i == 100) {
            z = true;
        } else {
            z = false;
        }
        this.g.setValue(Boolean.valueOf(!z));
        if (z) {
            this.c.a(ps7.a.g(this.b.a()));
        }
    }

    public final void w(rs7 rs7Var, String str) {
        z65.h(rs7Var, "paymentAuthorization3DS");
        z65.h(str, "jsonString");
        this.g.setValue(Boolean.TRUE);
        try {
            Pair<String, String> x = x(str);
            r(rs7Var, x.c(), x.d());
        } catch (Exception e) {
            Logger logger = this.f;
            logger.warn("Exception parsing a payment result data\n" + e);
            String c2 = rs7Var.c();
            String a2 = rs7Var.a();
            s(c2, "Error while parsing payment with paymentId: " + a2);
        }
    }
}
