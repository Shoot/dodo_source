package com.dodopizza.geo.feature.phonenumbercollector.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PhoneNumberCollectorPresenter.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B1\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b4\u00105J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0014J\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R#\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00067"}, d2 = {"Lcom/dodopizza/geo/feature/phonenumbercollector/presentation/PhoneNumberCollectorPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ll38;", "", "w", "r", Image.TYPE_SMALL, "onFirstViewAttach", "q", "", "bodyPhone", "t", "enteredText", "x", "onBackPressed", "u", RemoteMessageConst.Notification.URL, "v", "Lh38;", "a", "Lh38;", "router", "Lv28;", "b", "Lv28;", "phoneInputHandler", "Lgc;", c.a, "Lgc;", "analytics", "Lj28;", DateTokenConverter.CONVERTER_KEY, "Lj28;", "currentPhoneFormat", "Lg48;", e.a, "Lg48;", "phoneOutput", "", "f", "Z", "isNumberValid", "Lkotlin/Function1;", "g", "Lkotlin/jvm/functions/Function1;", "getPhoneNumberFilter", "()Lkotlin/jvm/functions/Function1;", "phoneNumberFilter", "Lxi8;", "phoneFilter", "Lmh0;", "buildInfo", "<init>", "(Lh38;Lxi8;Lv28;Lmh0;Lgc;)V", Image.TYPE_HIGH, "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PhoneNumberCollectorPresenter extends BasePresenter<l38> {
    public static final a h = new a(null);
    private static final j28 i = new j28("+971", "AE");
    private final h38 a;
    private final v28 b;
    private final gc c;
    private j28 d;
    private g48 e;
    private boolean f;
    private final Function1<g48, g48> g;

    /* compiled from: PhoneNumberCollectorPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/dodopizza/geo/feature/phonenumbercollector/presentation/PhoneNumberCollectorPresenter$a;", "", "Lj28;", "AE_FORMAT", "Lj28;", "", "AE_TERMS_LINK", "Ljava/lang/String;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PhoneNumberCollectorPresenter(h38 h38Var, xi8 xi8Var, v28 v28Var, mh0 mh0Var, gc gcVar) {
        Function1<g48, g48> d;
        z65.h(h38Var, "router");
        z65.h(xi8Var, "phoneFilter");
        z65.h(v28Var, "phoneInputHandler");
        z65.h(mh0Var, "buildInfo");
        z65.h(gcVar, "analytics");
        this.a = h38Var;
        this.b = v28Var;
        this.c = gcVar;
        this.f = true;
        if (mh0Var.i()) {
            d = xi8Var.c(new String[0]);
        } else {
            d = xi8Var.d(new String[0]);
        }
        this.g = d;
    }

    private final void r() {
        j28 j28Var = this.d;
        if (j28Var != null) {
            ((l38) getViewState()).D(j28Var.b());
        }
        g48 g48Var = this.e;
        if (g48Var != null) {
            String a2 = g48Var.f().a();
            if (a2.length() == 0) {
                a2 = null;
            }
            if (a2 != null) {
                t(a2);
            }
        }
    }

    private final void s() {
        g48 g48Var = this.e;
        if (g48Var != null) {
            ((l38) getViewState()).A(g48Var.d());
            this.f = g48Var.g().a();
        }
        ((l38) getViewState()).ke(this.f);
        if (this.f) {
            this.c.a(a7.a());
        }
    }

    private final void w() {
        ((l38) getViewState()).D(i.b());
    }

    public final void onBackPressed() {
        this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        w();
    }

    public final void q() {
        g48 g48Var = this.e;
        if (g48Var != null) {
            this.a.c(new g38(g48Var.h()));
        }
    }

    public final void t(String str) {
        z65.h(str, "bodyPhone");
        j28 j28Var = this.d;
        if (j28Var == null) {
            j28Var = i;
        }
        g48 a2 = this.b.a(new u28(str, j28Var));
        this.e = a2;
        if (a2 != null) {
            this.e = this.g.invoke(a2);
        }
        s();
    }

    public final void u() {
        v("https://drive.google.com/file/d/16SBImDU2Po226qhtT7y9tFcldfbv--nr/view?usp=sharing");
    }

    public final void v(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        this.a.b(str);
    }

    public final void x(String str) {
        z65.h(str, "enteredText");
        j28 j28Var = this.d;
        if (j28Var == null) {
            j28Var = i;
        }
        g48 b = this.b.b(new u28(str, j28Var));
        this.e = b;
        if (b != null) {
            this.e = this.g.invoke(b);
            j28 j28Var2 = this.d;
            if (j28Var2 != null && z65.c(j28Var2, b.c())) {
                s();
                return;
            }
            this.d = b.c();
            r();
        }
    }
}
