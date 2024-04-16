package com.dodopizza.profile.feature.profilesettings.presentation;

import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import java.text.DateFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ProfileSettingsPresenter.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\b\u0007\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010Q\u001a\u00020N¢\u0006\u0004\bj\u0010kJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J-\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0003H\u0014J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0003J\u0006\u0010\u0019\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u000fJ\u000e\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u000fJ\u001e\u0010&\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tJ\u000e\u0010'\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\tJ\u0006\u0010(\u001a\u00020\u0003J\u0006\u0010)\u001a\u00020\u0003J\u0006\u0010*\u001a\u00020\u0003J\u0006\u0010+\u001a\u00020\u0003J\u0006\u0010,\u001a\u00020\u0003R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010V\u001a\n S*\u0004\u0018\u00010R0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\u0010R\u0016\u0010^\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\u0010R\u0016\u0010`\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u0010R\u0016\u0010b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010\u001cR\u0016\u0010f\u001a\u00020c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001c\u0010i\u001a\n S*\u0004\u0018\u00010>0>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lcom/dodopizza/profile/feature/profilesettings/presentation/ProfileSettingsPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lqo8;", "", "E", "H", "b0", "G", "c0", "", "dayCount", "monthCount", "yearCount", "d0", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "I", "(IILjava/lang/Integer;)Ljava/lang/String;", "onFirstViewAttach", "view", "F", "U", "O", "N", "L", "M", "", "isSubscribedToSms", "Z", "Q", "onBackPressed", "userName", "a0", "email", "V", "day", "month", "year", "P", "S", "R", "Y", "T", "W", "X", "Lf63;", "a", "Lf63;", "router", "Llo8;", "b", "Llo8;", "interactor", "Ldo;", com.huawei.hms.opendevice.c.a, "Ldo;", "appInitializer", "Lps1;", DateTokenConverter.CONVERTER_KEY, "Lps1;", "contactsInteractor", "Las8;", "Lh48;", com.huawei.hms.push.e.a, "Las8;", "phoneParserProvider", "Ljo;", "f", "Ljo;", "appResourceLocalesFactory", "Lmh0;", "g", "Lmh0;", "buildInfo", "Lhq3;", Image.TYPE_HIGH, "Lhq3;", "featureService", "Lgc;", "i", "Lgc;", "analytics", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "j", "Lorg/slf4j/Logger;", "logger", "Ln42;", "k", "Ln42;", "tempCustomer", "l", "dayDraft", Image.TYPE_MEDIUM, "monthDraft", "n", "yearDraft", "o", "exitStarted", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "p", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfoData", "K", "()Lh48;", "phoneParser", "<init>", "(Lf63;Llo8;Ldo;Lps1;Las8;Ljo;Lmh0;Lhq3;Lgc;)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ProfileSettingsPresenter extends BasePresenter<qo8> {
    private final f63 a;
    private final lo8 b;
    private final Cdo c;
    private final ps1 d;
    private final as8<h48> e;
    private final jo f;
    private final mh0 g;
    private final hq3 h;
    private final gc i;
    private final Logger j;
    private n42 k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private com.dodopizza.profile.feature.profilesettings.presentation.a p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ln42;", "profile", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$applyProfile$1", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function2<n42, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(n42 n42Var, cv1<? super Unit> cv1Var) {
            return ((a) create(n42Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                n42 n42Var = (n42) this.b;
                ProfileSettingsPresenter.this.k = n42Var;
                f28 m = n42Var.m();
                h48 K = ProfileSettingsPresenter.this.K();
                z65.g(K, "access$getPhoneParser(...)");
                ((qo8) ProfileSettingsPresenter.this.getViewState()).t3(nvb.b(m, K));
                ProfileSettingsPresenter.this.d0(n42Var.d(), n42Var.e(), n42Var.f());
                ((qo8) ProfileSettingsPresenter.this.getViewState()).v4(n42Var.h());
                ((qo8) ProfileSettingsPresenter.this.getViewState()).t6(n42Var.n());
                ((qo8) ProfileSettingsPresenter.this.getViewState()).Ba(n42Var.g());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$applyProfile$2", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((b) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter.this.j.error("Can`t load customer", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lk4;", "accountDeletionInfo", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$checkAccountDeletionStatus$1", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<k4, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(k4 k4Var, cv1<? super Unit> cv1Var) {
            return ((c) create(k4Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                k4 k4Var = (k4) this.b;
                if (k4Var != null) {
                    ((qo8) ProfileSettingsPresenter.this.getViewState()).Y1();
                    ((qo8) ProfileSettingsPresenter.this.getViewState()).ue(k4Var.f());
                } else {
                    ((qo8) ProfileSettingsPresenter.this.getViewState()).Cb();
                    ((qo8) ProfileSettingsPresenter.this.getViewState()).k1();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lk4;", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$checkAccountDeletionStatus$2", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements y84<pz3<? super k4>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super k4> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = th;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter.this.j.error("Can`t get account deletion status", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onAccountDeletionCancelPressed$1", f = "ProfileSettingsPresenter.kt", l = {128}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class e extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
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
                ((qo8) ProfileSettingsPresenter.this.getViewState()).Qe();
                lo8 lo8Var = ProfileSettingsPresenter.this.b;
                this.a = 1;
                if (lo8Var.j(this) == d) {
                    return d;
                }
            }
            ((qo8) ProfileSettingsPresenter.this.getViewState()).h6();
            ((qo8) ProfileSettingsPresenter.this.getViewState()).Cb();
            ((qo8) ProfileSettingsPresenter.this.getViewState()).k1();
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onAccountDeletionCancelPressed$2", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter.this.j.error("Failed cancel deletion account", (Throwable) this.b);
                ((qo8) ProfileSettingsPresenter.this.getViewState()).Z5();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onAccountDeletionCancelPressed$3", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class g extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new g(cv1Var);
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
                ((qo8) ProfileSettingsPresenter.this.getViewState()).Jd();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onAccountDeletionConfirmPressed$1", f = "ProfileSettingsPresenter.kt", l = {104}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class h extends f3b implements Function1<cv1<? super Unit>, Object> {
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
        public final Object invoke(cv1<? super Unit> cv1Var) {
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
                ((qo8) ProfileSettingsPresenter.this.getViewState()).m9();
                lo8 lo8Var = ProfileSettingsPresenter.this.b;
                this.a = 1;
                obj = lo8Var.n(this);
                if (obj == d) {
                    return d;
                }
            }
            long f = ((k4) obj).f();
            ((qo8) ProfileSettingsPresenter.this.getViewState()).Y1();
            ((qo8) ProfileSettingsPresenter.this.getViewState()).ue(f);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onAccountDeletionConfirmPressed$2", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter.this.j.error("Failed when try deleting account", (Throwable) this.b);
                ((qo8) ProfileSettingsPresenter.this.getViewState()).Z5();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onAccountDeletionConfirmPressed$3", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class j extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        j(cv1<? super j> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new j(cv1Var);
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
                ((qo8) ProfileSettingsPresenter.this.getViewState()).Oc();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onBackPressed$1", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class k extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new k(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((k) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter.this.a.d();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onBackPressed$2", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class l extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l lVar = new l(cv1Var);
            lVar.b = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((l) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter.this.o = false;
                ProfileSettingsPresenter.this.j.error("Error saving profile. ", (Throwable) this.b);
                ((qo8) ProfileSettingsPresenter.this.getViewState()).g7();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onBirthdayConfirmed$1", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class m extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        m(cv1<? super m> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new m(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((m) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter profileSettingsPresenter = ProfileSettingsPresenter.this;
                profileSettingsPresenter.k = n42.c(profileSettingsPresenter.k, null, null, null, null, nf0.c(ProfileSettingsPresenter.this.l), nf0.c(ProfileSettingsPresenter.this.m), nf0.c(ProfileSettingsPresenter.this.n), 0, 0.0d, null, false, 1935, null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onBirthdayConfirmed$2", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class n extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n nVar = new n(cv1Var);
            nVar.b = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((n) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter profileSettingsPresenter = ProfileSettingsPresenter.this;
                profileSettingsPresenter.k = n42.c(profileSettingsPresenter.k, null, null, null, null, nf0.c(0), nf0.c(0), nf0.c(0), 0, 0.0d, null, false, 1935, null);
                ProfileSettingsPresenter.this.j.error("Failed to set birthday", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onBirthdayConfirmed$3", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class o extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        o(cv1<? super o> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new o(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((o) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter profileSettingsPresenter = ProfileSettingsPresenter.this;
                profileSettingsPresenter.d0(profileSettingsPresenter.k.d(), ProfileSettingsPresenter.this.k.e(), ProfileSettingsPresenter.this.k.f());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onClickLogout$1", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class p extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        p(cv1<? super p> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new p(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((p) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((qo8) ProfileSettingsPresenter.this.getViewState()).J4();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onClickLogout$2", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class q extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        q(cv1<? super q> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new q(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((q) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter.this.a.d();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onClickLogout$3", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class r extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        r(cv1<? super r> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r rVar = new r(cv1Var);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((r) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter.this.j.error("Failed to logout. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onClickLogout$4", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class s extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        s(cv1<? super s> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new s(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((s) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((qo8) ProfileSettingsPresenter.this.getViewState()).g5();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Locale;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$onGoToAppSettings$1", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class t extends f3b implements Function2<Locale, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ Locale c;
        final /* synthetic */ ProfileSettingsPresenter d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Locale locale, ProfileSettingsPresenter profileSettingsPresenter, cv1<? super t> cv1Var) {
            super(2, cv1Var);
            this.c = locale;
            this.d = profileSettingsPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t tVar = new t(this.c, this.d, cv1Var);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Locale locale, cv1<? super Unit> cv1Var) {
            return ((t) create(locale, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (!z65.c((Locale) this.b, this.c)) {
                    this.d.c.l();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$requestContactInfo$1", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u(cv1<? super u> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            u uVar = new u(cv1Var);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((u) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Throwable th = (Throwable) this.b;
                ProfileSettingsPresenter.this.j.error(th.getMessage(), th);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileSettingsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfo", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter$requestContactInfo$2", f = "ProfileSettingsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends f3b implements Function2<com.dodopizza.profile.feature.profilesettings.presentation.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        v(cv1<? super v> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            v vVar = new v(cv1Var);
            vVar.b = obj;
            return vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(com.dodopizza.profile.feature.profilesettings.presentation.a aVar, cv1<? super Unit> cv1Var) {
            return ((v) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfileSettingsPresenter.this.p = (com.dodopizza.profile.feature.profilesettings.presentation.a) this.b;
                ProfileSettingsPresenter.this.p.g().isEmpty();
                if (!ProfileSettingsPresenter.this.p.g().isEmpty()) {
                    ((qo8) ProfileSettingsPresenter.this.getViewState()).k0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ProfileSettingsPresenter(f63 f63Var, lo8 lo8Var, Cdo cdo, ps1 ps1Var, as8<h48> as8Var, jo joVar, mh0 mh0Var, hq3 hq3Var, gc gcVar) {
        z65.h(f63Var, "router");
        z65.h(lo8Var, "interactor");
        z65.h(cdo, "appInitializer");
        z65.h(ps1Var, "contactsInteractor");
        z65.h(as8Var, "phoneParserProvider");
        z65.h(joVar, "appResourceLocalesFactory");
        z65.h(mh0Var, "buildInfo");
        z65.h(hq3Var, "featureService");
        z65.h(gcVar, "analytics");
        this.a = f63Var;
        this.b = lo8Var;
        this.c = cdo;
        this.d = ps1Var;
        this.e = as8Var;
        this.f = joVar;
        this.g = mh0Var;
        this.h = hq3Var;
        this.i = gcVar;
        this.j = LoggerFactory.getLogger("ProfileSettingsPresenter");
        this.k = n42.l.a();
        this.p = com.dodopizza.profile.feature.profilesettings.presentation.a.j.a();
    }

    private final void E() {
        p(z77.a(y87.a(this.b.o(), new a(null)), new b(null)));
    }

    private final void G() {
        if (this.h.a(bq3.x6)) {
            wz3.C(wz3.h(wz3.F(this.b.q(), new c(null)), new d(null)), PresenterScopeKt.getPresenterScope(this));
            return;
        }
        ((qo8) getViewState()).Y1();
        ((qo8) getViewState()).Cb();
    }

    private final void H() {
        ((qo8) getViewState()).l7();
    }

    private final String I(int i2, int i3, Integer num) {
        String str = DateFormatSymbols.getInstance(Locale.getDefault()).getMonths()[i3 - 1];
        if (num != null) {
            return i2 + " " + str + " " + num;
        }
        return i2 + " " + str;
    }

    static /* synthetic */ String J(ProfileSettingsPresenter profileSettingsPresenter, int i2, int i3, Integer num, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        return profileSettingsPresenter.I(i2, i3, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h48 K() {
        return this.e.get();
    }

    private final void b0() {
        p(y87.a(z77.a(this.d.a(), new u(null)), new v(null)));
    }

    private final void c0() {
        ((qo8) getViewState()).qa(this.g.h(), this.g.g(), this.g.c(), this.g.f(), this.g.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(Integer num, Integer num2, Integer num3) {
        if (num2 != null && num != null) {
            if (num3 != null) {
                ((qo8) getViewState()).P3(I(num.intValue(), num2.intValue(), num3));
                return;
            } else {
                ((qo8) getViewState()).b6(J(this, num.intValue(), num2.intValue(), null, 4, null));
                return;
            }
        }
        ((qo8) getViewState()).ya();
    }

    @Override // moxy.MvpPresenter
    /* renamed from: F */
    public void attachView(qo8 qo8Var) {
        super.attachView(qo8Var);
        b0();
    }

    public final void L() {
        this.i.a(ed.b(false));
    }

    public final void M() {
        wj1.b(o77.a(z77.a(hy.a(new e(null)), new f(null)), new g(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void N() {
        this.i.a(ed.b(true));
        wj1.b(o77.a(z77.a(hy.a(new h(null)), new i(null)), new j(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void O() {
        this.i.a(ed.a());
        ((qo8) getViewState()).y4();
    }

    public final void P(int i2, int i3, int i4) {
        this.m = i3;
        this.l = i2;
        this.n = i4;
        ((qo8) getViewState()).F7(I(i2, i3, Integer.valueOf(i4)));
    }

    public final void Q() {
        p(o77.a(z77.a(y87.a(this.b.s(new mb0(this.l, this.m, this.n)), new m(null)), new n(null)), new o(null)));
    }

    public final void R() {
        boolean z;
        if (this.k.e() != null && this.k.d() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.k.f() != null) {
            ((qo8) getViewState()).o5();
        } else if (z) {
            ((qo8) getViewState()).u7();
        } else {
            ((qo8) getViewState()).ed();
        }
    }

    public final void S(int i2) {
        P(((Number) mh5.b(this.k.d(), "Birth day can`t be null in this method")).intValue(), ((Number) mh5.b(this.k.e(), "Birth month can`t be null in this method")).intValue(), i2);
    }

    public final void T() {
        this.a.e(com.dodopizza.auth.features.legaldocuments.presentation.b.a(new qo5(this.p.g())));
        this.i.a(oo5.a.a(ck1.d));
    }

    public final void U() {
        p(o77.a(z77.a(y87.a(r77.a(this.b.p(), new p(null)), new q(null)), new r(null)), new s(null)));
    }

    public final void V(String str) {
        z65.h(str, "email");
        if (str.length() == 0 || hbb.c(str)) {
            this.k = n42.c(this.k, null, null, null, null, null, null, null, 0, 0.0d, str, false, 1535, null);
            ((qo8) getViewState()).aa();
            return;
        }
        ((qo8) getViewState()).i5();
    }

    public final void W() {
        this.i.a(ed.e());
        o(wz3.F(this.f.a(), new t(this.f.a().getValue(), this, null)));
    }

    public final void X() {
        this.i.a(ed.d());
    }

    public final void Y() {
        if (Build.VERSION.SDK_INT >= 33) {
            ((qo8) getViewState()).X1();
        } else {
            this.a.e(un8.a());
        }
    }

    public final void Z(boolean z) {
        this.k = n42.c(this.k, null, null, null, null, null, null, null, 0, 0.0d, null, z, 1023, null);
    }

    public final void a0(String str) {
        boolean y;
        z65.h(str, "userName");
        y = l0b.y(str);
        if (!y) {
            this.k = n42.c(this.k, null, null, str, null, null, null, null, 0, 0.0d, null, false, 2043, null);
            ((qo8) getViewState()).x2();
            return;
        }
        ((qo8) getViewState()).ef();
    }

    public final void onBackPressed() {
        if (this.o) {
            return;
        }
        this.o = true;
        p(z77.a(y87.a(this.b.r(this.k), new k(null)), new l(null)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        E();
        H();
        G();
        c0();
        this.i.a(ed.c(true));
    }
}
