package ru.dodopizza.app.presentation.phonenumberlogin;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.order.feature.shoppingcart.presentation.ShoppingCartPresenter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.fy5;
import defpackage.lz;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.domain.authorization.CantSendSmsForCountryPhoneCodeException;
import ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter;
import ru.dodopizza.app.presentation.phonenumberlogin.c;
import ru.dodopizza.app.presentation.pincodelogin.a;
/* compiled from: PhoneNumberLoginPresenter.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 j2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011Bc\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E0D\u0012\u0006\u0010L\u001a\u00020I\u0012\u0006\u0010P\u001a\u00020M\u0012\u0006\u0010T\u001a\u00020Q\u0012\u0006\u0010X\u001a\u00020U¢\u0006\u0004\bh\u0010iJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0014J\u0012\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0003J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0003J\u0006\u0010%\u001a\u00020\u0006J\u0006\u0010&\u001a\u00020\u0006J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0003J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*J\u000e\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001c\u0010]\u001a\n Z*\u0004\u0018\u00010Y0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010g\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010f¨\u0006k"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/PhoneNumberLoginPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "La48;", "", "title", RemoteMessageConst.Notification.URL, "", "I", "", "Lwo5;", "legalDocuments", "H", "T", "U", "Lru/dodopizza/app/presentation/phonenumberlogin/c;", "info", "a0", "Lru/dodopizza/app/presentation/phonenumberlogin/c$b;", "block", "Z", "G", "S", "M", "P", "onFirstViewAttach", "view", "F", "phone", "N", "L", "", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "O", "bodyPhone", "Q", "enteredText", "b0", "onBackPressed", "K", "R", "legalInfoUrl", "J", "Landroid/os/Bundle;", "outState", "W", "savedState", "V", "X", "Lf63;", "a", "Lf63;", "router", "Lgc;", "b", "Lgc;", "analytics", "Lr38;", com.huawei.hms.opendevice.c.a, "Lr38;", "interactor", "Lv28;", DateTokenConverter.CONVERTER_KEY, "Lv28;", "phoneInputHandler", "Lru/dodopizza/app/presentation/phonenumberlogin/e;", com.huawei.hms.push.e.a, "Lru/dodopizza/app/presentation/phonenumberlogin/e;", "phoneNumberRequest", "Lkotlin/Function1;", "Lg48;", "f", "Lkotlin/jvm/functions/Function1;", "phoneFilter", "Lr28;", "g", "Lr28;", "phoneHintFeatureChecker", "Lru/dodopizza/app/presentation/phonenumberlogin/a;", Image.TYPE_HIGH, "Lru/dodopizza/app/presentation/phonenumberlogin/a;", "analyticsSenderMapper", "Lay1;", "i", "Lay1;", "currentCountry", "Lhq3;", "j", "Lhq3;", "featureService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "k", "Lorg/slf4j/Logger;", "logger", "Lj28;", "l", "Lj28;", "currentPhoneFormat", Image.TYPE_MEDIUM, "Lru/dodopizza/app/presentation/phonenumberlogin/c;", "phoneNumberLoginInfo", "n", "Lg48;", "phoneOutput", "<init>", "(Lf63;Lgc;Lr38;Lv28;Lru/dodopizza/app/presentation/phonenumberlogin/e;Lkotlin/jvm/functions/Function1;Lr28;Lru/dodopizza/app/presentation/phonenumberlogin/a;Lay1;Lhq3;)V", "o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PhoneNumberLoginPresenter extends BasePresenter<a48> {
    public static final a o = new a(null);
    private static final j28 p = new j28("+7", "RU");
    private final f63 a;
    private final gc b;
    private final r38 c;
    private final v28 d;
    private final ru.dodopizza.app.presentation.phonenumberlogin.e e;
    private final Function1<g48, g48> f;
    private final r28 g;
    private final ru.dodopizza.app.presentation.phonenumberlogin.a h;
    private final ay1 i;
    private final hq3 j;
    private final Logger k;
    private j28 l;
    private ru.dodopizza.app.presentation.phonenumberlogin.c m;
    private g48 n;

    /* compiled from: PhoneNumberLoginPresenter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/PhoneNumberLoginPresenter$a;", "", "", "KEY_CURRENT_INTERNATIONAL_CODE", "Ljava/lang/String;", "Lj28;", "RU_FORMAT", "Lj28;", "", "SELECT_PHONE_PREFIX_RESULT", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$onNextButtonClicked$1", f = "PhoneNumberLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((a48) PhoneNumberLoginPresenter.this.getViewState()).Hg(true);
                ((a48) PhoneNumberLoginPresenter.this.getViewState()).Tg(false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$onNextButtonClicked$2", f = "PhoneNumberLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ g48 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g48 g48Var, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = g48Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((c) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PhoneNumberLoginPresenter.this.a.e(new ru.dodopizza.app.presentation.pincodelogin.c(new a.C0583a.C0584a(this.c.h(), this.c.e(), PhoneNumberLoginPresenter.this.m.b(), PhoneNumberLoginPresenter.this.G(), PhoneNumberLoginPresenter.this.e.a())));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$onNextButtonClicked$3", f = "PhoneNumberLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Throwable th = (Throwable) this.b;
                PhoneNumberLoginPresenter.this.k.error("Failed to send SMS", th);
                if ((th instanceof CantSendSmsForCountryPhoneCodeException) && PhoneNumberLoginPresenter.this.j.a(bq3.A5)) {
                    ((a48) PhoneNumberLoginPresenter.this.getViewState()).t2();
                } else {
                    ((a48) PhoneNumberLoginPresenter.this.getViewState()).e();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$onNextButtonClicked$4", f = "PhoneNumberLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((a48) PhoneNumberLoginPresenter.this.getViewState()).Hg(false);
                ((a48) PhoneNumberLoginPresenter.this.getViewState()).Tg(true);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj28;", "phoneFormat", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$requestCountryPrefixes$1", f = "PhoneNumberLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<j28, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j28 j28Var, cv1<? super Unit> cv1Var) {
            return ((f) create(j28Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                j28 j28Var = (j28) this.b;
                if (PhoneNumberLoginPresenter.this.l == null) {
                    PhoneNumberLoginPresenter.this.l = j28Var;
                }
                PhoneNumberLoginPresenter phoneNumberLoginPresenter = PhoneNumberLoginPresenter.this;
                v28 v28Var = phoneNumberLoginPresenter.d;
                j28 j28Var2 = PhoneNumberLoginPresenter.this.l;
                j28 j28Var3 = null;
                if (j28Var2 == null) {
                    z65.z("currentPhoneFormat");
                    j28Var2 = null;
                }
                phoneNumberLoginPresenter.n = v28Var.a(new u28("", j28Var2));
                ((a48) PhoneNumberLoginPresenter.this.getViewState()).l(false);
                a48 a48Var = (a48) PhoneNumberLoginPresenter.this.getViewState();
                j28 j28Var4 = PhoneNumberLoginPresenter.this.l;
                if (j28Var4 == null) {
                    z65.z("currentPhoneFormat");
                } else {
                    j28Var3 = j28Var4;
                }
                a48Var.D(j28Var3.b());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$requestCountryPrefixes$2", f = "PhoneNumberLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((a48) PhoneNumberLoginPresenter.this.getViewState()).l(false);
                PhoneNumberLoginPresenter.this.l = PhoneNumberLoginPresenter.p;
                PhoneNumberLoginPresenter.this.k.error("Failed to get countries phone prefix", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$requestPhoneNumberLoginInfo$1", f = "PhoneNumberLoginPresenter.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function1<cv1<? super ru.dodopizza.app.presentation.phonenumberlogin.c>, Object> {
        int a;

        h(cv1<? super h> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super ru.dodopizza.app.presentation.phonenumberlogin.c> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
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
                r38 r38Var = PhoneNumberLoginPresenter.this.c;
                this.a = 1;
                obj = r38Var.b(this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/c;", "info", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$requestPhoneNumberLoginInfo$2", f = "PhoneNumberLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements Function2<ru.dodopizza.app.presentation.phonenumberlogin.c, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ru.dodopizza.app.presentation.phonenumberlogin.c cVar, cv1<? super Unit> cv1Var) {
            return ((i) create(cVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ru.dodopizza.app.presentation.phonenumberlogin.c cVar = (ru.dodopizza.app.presentation.phonenumberlogin.c) this.b;
                PhoneNumberLoginPresenter.this.m = cVar;
                PhoneNumberLoginPresenter.this.a0(cVar);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneNumberLoginPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$requestPhoneNumberLoginInfo$3", f = "PhoneNumberLoginPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j(cv1<? super j> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(cv1Var);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((j) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PhoneNumberLoginPresenter.this.k.error("Failed to get phone number login info", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class k implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$showCountriesPhonePrefixList$$inlined$listenOnce$1$2", f = "PhoneNumberLoginPresenter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$k$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0579a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0579a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter.k.a.C0579a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$k$a$a r0 = (ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter.k.a.C0579a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$k$a$a r0 = new ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter$k$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof defpackage.j28
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter.k.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public k(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class l extends j6 implements Function2<j28, cv1<? super Unit>, Object> {
        public l(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(j28 j28Var, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, j28Var, cv1Var);
            return b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneNumberLoginPresenter(f63 f63Var, gc gcVar, r38 r38Var, v28 v28Var, ru.dodopizza.app.presentation.phonenumberlogin.e eVar, Function1<? super g48, g48> function1, r28 r28Var, ru.dodopizza.app.presentation.phonenumberlogin.a aVar, ay1 ay1Var, hq3 hq3Var) {
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(r38Var, "interactor");
        z65.h(v28Var, "phoneInputHandler");
        z65.h(eVar, "phoneNumberRequest");
        z65.h(function1, "phoneFilter");
        z65.h(r28Var, "phoneHintFeatureChecker");
        z65.h(aVar, "analyticsSenderMapper");
        z65.h(ay1Var, "currentCountry");
        z65.h(hq3Var, "featureService");
        this.a = f63Var;
        this.b = gcVar;
        this.c = r38Var;
        this.d = v28Var;
        this.e = eVar;
        this.f = function1;
        this.g = r28Var;
        this.h = aVar;
        this.i = ay1Var;
        this.j = hq3Var;
        this.k = LoggerFactory.getLogger("PhoneNumberLoginPresenter");
        this.m = ru.dodopizza.app.presentation.phonenumberlogin.c.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G() {
        if (z65.c(this.i.getCode(), "826")) {
            return this.i.n().b();
        }
        return null;
    }

    private final void H(List<wo5> list) {
        this.b.a(oo5.a.a(ck1.r));
        this.a.e(com.dodopizza.auth.features.legaldocuments.presentation.b.a(new qo5(list)));
    }

    private final void I(String str, String str2) {
        this.a.e(com.dodopizza.feature.webinfo.presentation.d.a(new com.dodopizza.feature.webinfo.presentation.a(str, str2, (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
    }

    private final void M() {
        a48 a48Var = (a48) getViewState();
        j28 j28Var = this.l;
        String str = null;
        if (j28Var == null) {
            z65.z("currentPhoneFormat");
            j28Var = null;
        }
        a48Var.D(j28Var.b());
        g48 g48Var = this.n;
        if (g48Var == null) {
            z65.z("phoneOutput");
            g48Var = null;
        }
        String a2 = g48Var.f().a();
        if (a2.length() != 0) {
            str = a2;
        }
        if (str != null) {
            Q(str);
        }
    }

    private final void P() {
        a48 a48Var = (a48) getViewState();
        g48 g48Var = this.n;
        g48 g48Var2 = null;
        if (g48Var == null) {
            z65.z("phoneOutput");
            g48Var = null;
        }
        a48Var.A(g48Var.d());
        a48 a48Var2 = (a48) getViewState();
        g48 g48Var3 = this.n;
        if (g48Var3 == null) {
            z65.z("phoneOutput");
        } else {
            g48Var2 = g48Var3;
        }
        a48Var2.Tg(g48Var2.g().a());
    }

    private final void S() {
        ((a48) getViewState()).l(true);
        p(z77.a(y87.a(this.c.a(), new f(null)), new g(null)));
    }

    private final void T() {
        if (this.g.a()) {
            ((a48) getViewState()).Fe();
        }
    }

    private final void U() {
        p(z77.a(y87.a(hy.a(new h(null)), new i(null)), new j(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(PhoneNumberLoginPresenter phoneNumberLoginPresenter, j28 j28Var) {
        z65.h(phoneNumberLoginPresenter, "this$0");
        z65.h(j28Var, "phoneFormat");
        phoneNumberLoginPresenter.l = j28Var;
        phoneNumberLoginPresenter.M();
    }

    private final void Z(c.b bVar) {
        if (bVar instanceof c.b.C0581b) {
            ((a48) getViewState()).fa();
        } else if (bVar instanceof c.b.d) {
            ((a48) getViewState()).qb();
        } else if (bVar instanceof c.b.C0582c) {
            ((a48) getViewState()).qb();
        } else if (bVar instanceof c.b.a) {
            c.b.a aVar = (c.b.a) bVar;
            ((a48) getViewState()).j2(aVar.b(), aVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(ru.dodopizza.app.presentation.phonenumberlogin.c cVar) {
        ((a48) getViewState()).Bf(cVar.b(), G());
        Z(cVar.c());
    }

    @Override // moxy.MvpPresenter
    /* renamed from: F */
    public void attachView(a48 a48Var) {
        super.attachView(a48Var);
        this.b.a(new lz.b(this.h.a(this.e.a())));
    }

    public final void J(String str) {
        z65.h(str, "legalInfoUrl");
        this.a.e(com.dodopizza.feature.webinfo.presentation.d.a(new com.dodopizza.feature.webinfo.presentation.a((String) null, str, (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
    }

    public final void K() {
        v28 v28Var = this.d;
        g48 g48Var = this.n;
        if (g48Var == null) {
            z65.z("phoneOutput");
            g48Var = null;
        }
        g48 c2 = v28Var.c(g48Var);
        p(o77.a(z77.a(y87.a(r77.a(this.c.c(c2.h()), new b(null)), new c(c2, null)), new d(null)), new e(null)));
        this.b.a(lz.c.a);
    }

    public final void L() {
        this.b.a(new qg3());
    }

    public final void N(String str) {
        z65.h(str, "phone");
        Q(str);
        K();
        this.b.a(new a7a());
    }

    public final void O(int i2) {
        this.b.a(new to3(i2));
    }

    public final void Q(String str) {
        z65.h(str, "bodyPhone");
        j28 j28Var = this.l;
        g48 g48Var = null;
        if (j28Var != null) {
            if (j28Var == null) {
                z65.z("currentPhoneFormat");
                j28Var = null;
            }
        } else {
            j28Var = p;
        }
        g48 a2 = this.d.a(new u28(str, j28Var));
        this.n = a2;
        Function1<g48, g48> function1 = this.f;
        if (a2 == null) {
            z65.z("phoneOutput");
        } else {
            g48Var = a2;
        }
        this.n = function1.invoke(g48Var);
        P();
    }

    public final void R(String str) {
        z65.h(str, "title");
        c.b c2 = this.m.c();
        if (c2 instanceof c.b.d) {
            I(str, ((c.b.d) c2).a());
        } else if (c2 instanceof c.b.C0582c) {
            H(((c.b.C0582c) c2).a());
        }
    }

    public final void V(Bundle bundle) {
        z65.h(bundle, "savedState");
        if (bundle.containsKey("key_current_international_code")) {
            Serializable serializable = bundle.getSerializable("key_current_international_code");
            z65.f(serializable, "null cannot be cast to non-null type com.dodopizza.phonenumber.format.PhoneFormat");
            this.l = (j28) serializable;
        }
    }

    public final void W(Bundle bundle) {
        z65.h(bundle, "outState");
        j28 j28Var = this.l;
        if (j28Var != null) {
            if (j28Var == null) {
                z65.z("currentPhoneFormat");
                j28Var = null;
            }
            bundle.putSerializable("key_current_international_code", j28Var);
        }
    }

    public final void X() {
        f63 f63Var = this.a;
        j28 j28Var = this.l;
        if (j28Var == null) {
            z65.z("currentPhoneFormat");
            j28Var = null;
        }
        f63Var.e(new s48(new b7a(j28Var.a(), this.i.f())));
        f63 f63Var2 = this.a;
        wz3.C(uz3.a.a(new k(f63Var2.k(R.id.select_phone_prefix_result)), new l(new wk9() { // from class: x38
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                PhoneNumberLoginPresenter.Y(PhoneNumberLoginPresenter.this, (j28) obj);
            }
        })), PresenterScopeKt.getPresenterScope(this));
    }

    public final void b0(String str) {
        z65.h(str, "enteredText");
        j28 j28Var = this.l;
        g48 g48Var = null;
        if (j28Var != null) {
            if (j28Var == null) {
                z65.z("currentPhoneFormat");
                j28Var = null;
            }
        } else {
            j28Var = p;
        }
        g48 b2 = this.d.b(new u28(str, j28Var));
        this.n = b2;
        Function1<g48, g48> function1 = this.f;
        if (b2 == null) {
            z65.z("phoneOutput");
            b2 = null;
        }
        this.n = function1.invoke(b2);
        j28 j28Var2 = this.l;
        if (j28Var2 != null) {
            if (j28Var2 == null) {
                z65.z("currentPhoneFormat");
                j28Var2 = null;
            }
            g48 g48Var2 = this.n;
            if (g48Var2 == null) {
                z65.z("phoneOutput");
                g48Var2 = null;
            }
            if (z65.c(j28Var2, g48Var2.c())) {
                P();
                return;
            }
        }
        g48 g48Var3 = this.n;
        if (g48Var3 == null) {
            z65.z("phoneOutput");
        } else {
            g48Var = g48Var3;
        }
        this.l = g48Var.c();
        M();
    }

    public final void onBackPressed() {
        this.a.i(ShoppingCartPresenter.z.d(), fy5.a.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        S();
        U();
        T();
    }
}
