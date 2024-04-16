package ru.dodopizza.app.presentation.profile;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.dy0;
import defpackage.fy5;
import defpackage.h15;
import defpackage.js1;
import defpackage.l95;
import defpackage.xl6;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
import ru.dodopizza.app.presentation.profile.ProfilePresenter;
/* compiled from: ProfilePresenter.kt */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¥\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001JBª\u0001\u0012\u0006\u0010L\u001a\u00020I\u0012\u0006\u0010P\u001a\u00020M\u0012\u0006\u0010T\u001a\u00020Q\u0012\u0006\u0010X\u001a\u00020U\u0012\u0006\u0010\\\u001a\u00020Y\u0012\u0006\u0010`\u001a\u00020]\u0012\u0006\u0010d\u001a\u00020a\u0012\u0006\u0010h\u001a\u00020e\u0012\u0006\u0010l\u001a\u00020i\u0012\u0006\u0010p\u001a\u00020m\u0012\u0006\u0010t\u001a\u00020q\u0012\u000e\b\u0002\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00160u\u0012\u0006\u0010|\u001a\u00020y\u0012\u0007\u0010\u0080\u0001\u001a\u00020}\u0012\b\u0010\u0084\u0001\u001a\u00030\u0081\u0001\u0012\b\u0010\u0088\u0001\u001a\u00030\u0085\u0001\u0012\b\u0010\u008c\u0001\u001a\u00030\u0089\u0001\u0012\b\u0010¢\u0001\u001a\u00030¡\u0001¢\u0006\u0006\b£\u0001\u0010¤\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0003J\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0003J\u0016\u0010%\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030#H\u0002J\u0016\u0010&\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030#H\u0002J\b\u0010'\u001a\u00020\u0003H\u0002J\b\u0010(\u001a\u00020\u0003H\u0002J\b\u0010)\u001a\u00020\u0003H\u0002J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0002J\b\u0010-\u001a\u00020\u0003H\u0002J\b\u0010.\u001a\u00020\u0003H\u0002J\b\u0010/\u001a\u00020\u0003H\u0002J\b\u00100\u001a\u00020\u0003H\u0002J\b\u00101\u001a\u00020\u0003H\u0002J\u0010\u00104\u001a\u00020\u00032\u0006\u00103\u001a\u000202H\u0002J\u0010\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u000205H\u0002J\u0010\u0010:\u001a\u00020\u00032\u0006\u00109\u001a\u000208H\u0002J\u0010\u0010;\u001a\u00020\u00032\u0006\u00109\u001a\u000208H\u0002J\b\u0010<\u001a\u00020\u0003H\u0002J\b\u0010=\u001a\u00020\u0003H\u0002J\b\u0010>\u001a\u00020\u0003H\u0002J\b\u0010?\u001a\u00020\u0003H\u0002J\b\u0010@\u001a\u00020\u0003H\u0002J\b\u0010A\u001a\u00020\u0003H\u0002J\b\u0010C\u001a\u00020BH\u0002J\b\u0010D\u001a\u00020\u0003H\u0002J\b\u0010E\u001a\u00020\u0003H\u0002J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010G\u001a\u00020\u0003H\u0002J\b\u0010H\u001a\u00020\u0003H\u0002R\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00160u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\"\u0010\u0091\u0001\u001a\r \u008e\u0001*\u0005\u0018\u00010\u008d\u00010\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0097\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010%R\u001a\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R!\u0010 \u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006¦\u0001"}, d2 = {"Lru/dodopizza/app/presentation/profile/ProfilePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lxo8;", "", "onFirstViewAttach", "view", "V", "Y", "u0", "j0", "v0", "k0", "i0", "Lwl7;", BonusActionEntity.ORDER, "s0", "g0", "d0", "e0", "h0", "l0", "n0", "Lul6;", "missionVO", "p0", "o0", "q0", "", "id", "y0", "w0", "r0", "t0", "m0", "f0", "Lkotlin/Function0;", "action", "Z", "W", "c0", "A0", "x0", "", CrashHianalyticsData.TIME, "z0", "C0", "F0", "B0", "Q", "O0", "Lgub;", "data", "S", "Ln42;", "user", "T", "Lfub;", "toggles", "U", "E0", "K0", "P", "R", "J0", "G0", "H0", "Ll95;", "I0", "N0", "M0", "D0", "a0", "L0", "Lf63;", "a", "Lf63;", "router", "Lef4;", "b", "Lef4;", "getNumberCanceledOrderInteractor", "Lwg6;", com.huawei.hms.opendevice.c.a, "Lwg6;", "menuRefreshInteractor", "Ldf4;", DateTokenConverter.CONVERTER_KEY, "Ldf4;", "getDataAvailabilityInteractor", "Lk63;", com.huawei.hms.push.e.a, "Lk63;", "domainEvents", "Lkn8;", "f", "Lkn8;", "interactor", "Lzxa;", "g", "Lzxa;", "storiesInteractor", "Lhq3;", Image.TYPE_HIGH, "Lhq3;", "featureService", "Lf5b;", "i", "Lf5b;", "systemTimeProvider", "Lih4;", "j", "Lih4;", "googlePlatServicesHelper", "Lyo8;", "k", "Lyo8;", "widgetConverter", "Ll6;", "l", "Ll6;", "missionsDataSet", "Lps1;", Image.TYPE_MEDIUM, "Lps1;", "contactsInteractor", "Lmh0;", "n", "Lmh0;", "buildInfo", "Lgc;", "o", "Lgc;", "analytics", "Li00;", "p", "Li00;", "authorizationState", "Lzt6;", "q", "Lzt6;", "nativeChatUnreadMessagesCount", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "r", "Lorg/slf4j/Logger;", "logger", Image.TYPE_SMALL, "Ll95;", "activeOrdersFetching", "", "t", "isWidgetApplied", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "u", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfoData", "v", "Lrn5;", "b0", "()Z", "isNativeChatEnabled", "Lwt6;", "nativeChatStateChecker", "<init>", "(Lf63;Lef4;Lwg6;Ldf4;Lk63;Lkn8;Lzxa;Lhq3;Lf5b;Lih4;Lyo8;Ll6;Lps1;Lmh0;Lgc;Li00;Lzt6;Lwt6;)V", "w", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ProfilePresenter extends BasePresenter<xo8> {
    public static final a w = new a(null);
    private static final long x = TimeUnit.DAYS.toMillis(7);
    private final f63 a;
    private final ef4 b;
    private final wg6 c;
    private final df4 d;
    private final k63 e;
    private final kn8 f;
    private final zxa g;
    private final hq3 h;
    private final f5b i;
    private final ih4 j;
    private final yo8 k;
    private final l6<ul6> l;
    private final ps1 m;
    private final mh0 n;
    private final gc o;
    private final i00 p;
    private final zt6 q;
    private final Logger r;
    private l95 s;
    private boolean t;
    private com.dodopizza.profile.feature.profilesettings.presentation.a u;
    private final rn5 v;

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/profile/ProfilePresenter$a;", "", "", "NOT_SHOWN_SUBSCRIPTION_TIME", "J", "TIME_BETWEEN_SUBSCRIPTION_SHOWN", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onSubscribeToSmsClick$3", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        a0(cv1<? super a0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((a0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.z0(0L);
                ((xo8) ProfilePresenter.this.getViewState()).F5();
                ((xo8) ProfilePresenter.this.getViewState()).Q1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lgub;", "userData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$applyAuthorization$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<gub, cv1<? super Unit>, Object> {
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
        public final Object invoke(gub gubVar, cv1<? super Unit> cv1Var) {
            return ((b) create(gubVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((gub) this.b).d()) {
                    ((xo8) ProfilePresenter.this.getViewState()).la();
                    ((xo8) ProfilePresenter.this.getViewState()).A2();
                } else {
                    ((xo8) ProfilePresenter.this.getViewState()).b5();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onSubscribeToSmsClick$4", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        b0(cv1<? super b0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((b0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((xo8) ProfilePresenter.this.getViewState()).Xg();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$applyAuthorization$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.r.error("Can`t get user data", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$requestContactInfo$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c0(cv1<? super c0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c0 c0Var = new c0(cv1Var);
            c0Var.b = obj;
            return c0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Throwable th = (Throwable) this.b;
                ProfilePresenter.this.r.error(th.getMessage(), th);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$applyLoyaltyMissions$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((xo8) ProfilePresenter.this.getViewState()).q3();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "contactInfo", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$requestContactInfo$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d0 extends f3b implements Function2<com.dodopizza.profile.feature.profilesettings.presentation.a, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d0(cv1<? super d0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d0 d0Var = new d0(cv1Var);
            d0Var.b = obj;
            return d0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(com.dodopizza.profile.feature.profilesettings.presentation.a aVar, cv1<? super Unit> cv1Var) {
            return ((d0) create(aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.u = (com.dodopizza.profile.feature.profilesettings.presentation.a) this.b;
                ProfilePresenter.this.u.g().isEmpty();
                if (!ProfilePresenter.this.u.g().isEmpty()) {
                    ((xo8) ProfilePresenter.this.getViewState()).k0();
                }
                ProfilePresenter.this.A0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lem6;", "missionsInfoVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$applyLoyaltyMissions$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<em6, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(em6 em6Var, cv1<? super Unit> cv1Var) {
            return ((e) create(em6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                em6 em6Var = (em6) this.b;
                ProfilePresenter.this.l.r();
                if (!em6Var.b().isEmpty()) {
                    ProfilePresenter.this.l.addAll(em6Var.b());
                    ((xo8) ProfilePresenter.this.getViewState()).ne(ProfilePresenter.this.l);
                } else {
                    ((xo8) ProfilePresenter.this.getViewState()).We(em6Var.a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$saveInfoStoryId$1", f = "ProfilePresenter.kt", l = {331}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e0 extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(String str, cv1<? super e0> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e0(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((e0) create(cv1Var)).invokeSuspend(Unit.a);
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
                zxa zxaVar = ProfilePresenter.this.g;
                i15 i15Var = i15.c;
                String str = this.c;
                this.a = 1;
                if (zxaVar.c(i15Var, str, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$applyLoyaltyMissions$3", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                ProfilePresenter.this.r.error("Failed to get loyalty missions", (Throwable) this.b);
                ((xo8) ProfilePresenter.this.getViewState()).nb();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$saveInfoStoryId$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(String str, cv1<? super f0> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f0 f0Var = new f0(this.d, cv1Var);
            f0Var.b = obj;
            return f0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = ProfilePresenter.this.r;
                String str = this.d;
                logger.warn("Failed to save info story id: " + str, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Llp7;", "paidOrderState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$applyPaidOrderState$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<lp7, cv1<? super Unit>, Object> {
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
        public final Object invoke(lp7 lp7Var, cv1<? super Unit> cv1Var) {
            return ((g) create(lp7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((lp7) this.b) == lp7.b) {
                    ((xo8) ProfilePresenter.this.getViewState()).nc();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$saveSubscriptionTime$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g0(cv1<? super g0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g0 g0Var = new g0(cv1Var);
            g0Var.b = obj;
            return g0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.r.warn("Failed to save previous subscription time", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "previousTime", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$applyProfileSubscription$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<Long, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ long b;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(cv1Var);
            hVar.b = ((Number) obj).longValue();
            return hVar;
        }

        public final Object i(long j, cv1<? super Unit> cv1Var) {
            return ((h) create(Long.valueOf(j), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l, cv1<? super Unit> cv1Var) {
            return i(l.longValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (ProfilePresenter.this.i.b() - this.b >= ProfilePresenter.x) {
                    ((xo8) ProfilePresenter.this.getViewState()).Xg();
                    ((xo8) ProfilePresenter.this.getViewState()).H3();
                    ((xo8) ProfilePresenter.this.getViewState()).F5();
                } else {
                    ((xo8) ProfilePresenter.this.getViewState()).gb();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lh15;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$showInfoStoryIfNeed$1", f = "ProfilePresenter.kt", l = {440}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h0 extends f3b implements Function1<cv1<? super h15>, Object> {
        int a;

        h0(cv1<? super h0> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super h15> cv1Var) {
            return ((h0) create(cv1Var)).invokeSuspend(Unit.a);
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
                zxa zxaVar = ProfilePresenter.this.g;
                i15 i15Var = i15.c;
                this.a = 1;
                obj = zxaVar.a(i15Var, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$applyProfileSubscription$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                ProfilePresenter.this.r.warn("Failed to get previous subscription time", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lh15;", "infoStoryResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$showInfoStoryIfNeed$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i0 extends f3b implements Function2<h15, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i0(cv1<? super i0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i0 i0Var = new i0(cv1Var);
            i0Var.b = obj;
            return i0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(h15 h15Var, cv1<? super Unit> cv1Var) {
            return ((i0) create(h15Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                h15 h15Var = (h15) this.b;
                if (h15Var instanceof h15.e) {
                    ((xo8) ProfilePresenter.this.getViewState()).F(((h15.e) h15Var).b());
                } else {
                    ProfilePresenter.this.r.warn(h15Var.a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lul6;", "mission", "", "", "a", "(Lul6;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<ul6, List<? extends String>> {
        public static final j a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(ul6 ul6Var) {
            List<String> e;
            z65.h(ul6Var, "mission");
            ul6Var.k(false);
            e = jc1.e("update");
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$showInfoStoryIfNeed$3", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j0(cv1<? super j0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j0 j0Var = new j0(cv1Var);
            j0Var.b = obj;
            return j0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((j0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.r.warn("Failed to show info story!", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function0<Boolean> {
        final /* synthetic */ wt6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(wt6 wt6Var) {
            super(0);
            this.a = wt6Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.a.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul6;", "mission", "", "a", "(Lul6;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class k0 extends ej5 implements Function1<ul6, Boolean> {
        final /* synthetic */ ul6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(ul6 ul6Var) {
            super(1);
            this.a = ul6Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(ul6 ul6Var) {
            z65.h(ul6Var, "mission");
            return Boolean.valueOf(z65.c(ul6Var.getId(), this.a.getId()));
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class l extends m94 implements Function0<Unit> {
        l(Object obj) {
            super(0, obj, ProfilePresenter.class, "navigateToNativeChat", "navigateToNativeChat()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ProfilePresenter) this.receiver).c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lul6;", "mission", "", "", "a", "(Lul6;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class l0 extends ej5 implements Function1<ul6, List<? extends String>> {
        public static final l0 a = new l0();

        l0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(ul6 ul6Var) {
            List<String> e;
            z65.h(ul6Var, "mission");
            ul6Var.k(true);
            e = jc1.e("update");
            return e;
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onDeliveryAddressClick$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class m extends f3b implements Function2<com.dodopizza.geo.feature.selectdeliveryaddress.b, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m(cv1<? super m> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m mVar = new m(cv1Var);
            mVar.b = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(com.dodopizza.geo.feature.selectdeliveryaddress.b bVar, cv1<? super Unit> cv1Var) {
            return ((m) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                g63.b(ProfilePresenter.this.a, "select_delivery_address_fragment", (com.dodopizza.geo.feature.selectdeliveryaddress.b) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "domainEvent", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$subscribeGetUserAuthorized$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m0 extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m0(cv1<? super m0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m0 m0Var = new m0(cv1Var);
            m0Var.b = obj;
            return m0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((m0) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((j63) this.b) == j63.c) {
                    ProfilePresenter.this.A0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv2;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onDeliveryAddressClick$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class n extends f3b implements Function2<iv2, cv1<? super Unit>, Object> {
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
        public final Object invoke(iv2 iv2Var, cv1<? super Unit> cv1Var) {
            return ((n) create(iv2Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.a.e(new cw2((iv2) this.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lvv6;", "networkAvailabilityState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$subscribeOnDataAvailability$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n0 extends f3b implements Function2<vv6, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n0(cv1<? super n0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n0 n0Var = new n0(cv1Var);
            n0Var.b = obj;
            return n0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(vv6 vv6Var, cv1<? super Unit> cv1Var) {
            return ((n0) create(vv6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((vv6) this.b) == vv6.b) {
                    ((xo8) ProfilePresenter.this.getViewState()).S();
                } else {
                    ((xo8) ProfilePresenter.this.getViewState()).o0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onMissionButtonPressed$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class o extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ ul6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(ul6 ul6Var, cv1<? super o> cv1Var) {
            super(1, cv1Var);
            this.c = ul6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new o(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((o) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.D0(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "domainEvent", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$subscribeOnDomainEvents$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class o0 extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: ProfilePresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j63.values().length];
                try {
                    iArr[j63.c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        o0(cv1<? super o0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o0 o0Var = new o0(cv1Var);
            o0Var.b = obj;
            return o0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((o0) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (a.$EnumSwitchMapping$0[((j63) this.b).ordinal()] == 1) {
                    ProfilePresenter.this.P();
                    ProfilePresenter.this.O0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onMissionButtonPressed$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class p extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        p(cv1<? super p> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new p(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((p) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.Q();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "number", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$subscribeOnGetNumberCanceledOrder$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class p0 extends f3b implements Function2<Integer, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ int b;

        p0(cv1<? super p0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p0 p0Var = new p0(cv1Var);
            p0Var.b = ((Number) obj).intValue();
            return p0Var;
        }

        public final Object i(int i, cv1<? super Unit> cv1Var) {
            return ((p0) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, cv1<? super Unit> cv1Var) {
            return i(num.intValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((xo8) ProfilePresenter.this.getViewState()).N2(this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onMissionButtonPressed$3", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class q extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((q) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.a0();
                ((xo8) ProfilePresenter.this.getViewState()).D6();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lwl7;", "activeOrdersList", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$subscribeToActiveOrders$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class q0 extends f3b implements Function2<List<? extends wl7>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q0(cv1<? super q0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q0 q0Var = new q0(cv1Var);
            q0Var.b = obj;
            return q0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<wl7> list, cv1<? super Unit> cv1Var) {
            return ((q0) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List<wl7> list = (List) this.b;
                if (!list.isEmpty()) {
                    ((xo8) ProfilePresenter.this.getViewState()).C1(list);
                } else {
                    ((xo8) ProfilePresenter.this.getViewState()).F1();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ru/dodopizza/app/presentation/profile/ProfilePresenter$r", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class r implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public r(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(xj7.class.getModifiers())) {
                String name = xj7.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + xj7.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [xj7, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public xj7 a() {
            return (Fragment) this.c.invoke();
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.k6c
        public boolean d() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lwl7;", "activeOrdersList", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$subscribeToActiveOrders$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class r0 extends f3b implements Function2<List<? extends wl7>, cv1<? super Boolean>, Object> {
        int a;
        /* synthetic */ Object b;

        r0(cv1<? super r0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r0 r0Var = new r0(cv1Var);
            r0Var.b = obj;
            return r0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<wl7> list, cv1<? super Boolean> cv1Var) {
            return ((r0) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.a(!((List) this.b).isEmpty());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ru/dodopizza/app/presentation/profile/ProfilePresenter$s", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class s implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public s(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(jj7.class.getModifiers())) {
                String name = jj7.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + jj7.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [jj7, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public jj7 a() {
            return (Fragment) this.c.invoke();
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.k6c
        public boolean d() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lpz3;", "", "Lwl7;", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$subscribeToActiveOrders$3", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class s0 extends f3b implements y84<pz3<? super List<? extends wl7>>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        s0(cv1<? super s0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super List<wl7>> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            s0 s0Var = new s0(cv1Var);
            s0Var.b = th;
            return s0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.r.error("Failed when observe active orders", (Throwable) this.b);
                ((xo8) ProfilePresenter.this.getViewState()).F1();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxj7;", "a", "()Lxj7;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class t extends ej5 implements Function0<xj7> {
        final /* synthetic */ ej7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(ej7 ej7Var) {
            super(0);
            this.a = ej7Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final xj7 invoke() {
            return xj7.d5.a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "messagesCount", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$subscribeToUnreadChatMessagesCount$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class t0 extends f3b implements Function2<Integer, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ int b;

        t0(cv1<? super t0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t0 t0Var = new t0(cv1Var);
            t0Var.b = ((Number) obj).intValue();
            return t0Var;
        }

        public final Object i(int i, cv1<? super Unit> cv1Var) {
            return ((t0) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, cv1<? super Unit> cv1Var) {
            return i(num.intValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                int i = this.b;
                if (ProfilePresenter.this.p.b() && i > 0) {
                    ((xo8) ProfilePresenter.this.getViewState()).h(i);
                } else {
                    ((xo8) ProfilePresenter.this.getViewState()).i();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljj7;", "a", "()Ljj7;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class u extends ej5 implements Function0<jj7> {
        final /* synthetic */ ej7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(ej7 ej7Var) {
            super(0);
            this.a = ej7Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final jj7 invoke() {
            return jj7.A.a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$subscribeToUnreadChatMessagesCount$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class u0 extends f3b implements y84<pz3<? super Integer>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u0(cv1<? super u0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Integer> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            u0 u0Var = new u0(cv1Var);
            u0Var.b = th;
            return u0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.r.error("Failed to process unread messages count", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onReferralCardClick$1", f = "ProfilePresenter.kt", l = {363}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class v extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        v(cv1<? super v> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new v(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((v) create(cv1Var)).invokeSuspend(Unit.a);
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
                kn8 kn8Var = ProfilePresenter.this.f;
                this.a = 1;
                if (kn8Var.I(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$trackProfileFirstOpening$1", f = "ProfilePresenter.kt", l = {645}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class v0 extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        v0(cv1<? super v0> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new v0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((v0) create(cv1Var)).invokeSuspend(Unit.a);
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
                kn8 kn8Var = ProfilePresenter.this.f;
                this.a = 1;
                if (kn8Var.G(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onReferralCardClick$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class w extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        w(cv1<? super w> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            w wVar = new w(cv1Var);
            wVar.b = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((w) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.r.error("Can`t track referral screen open", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$trackProfileFirstOpening$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class w0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        w0(cv1<? super w0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            w0 w0Var = new w0(cv1Var);
            w0Var.b = obj;
            return w0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((w0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.r.error("Cannot track profile first opening event", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onRefreshClick$1", f = "ProfilePresenter.kt", l = {153}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class x extends f3b implements Function1<cv1<? super Object>, Object> {
        int a;

        x(cv1<? super x> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new x(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<Object> cv1Var) {
            return ((x) create(cv1Var)).invokeSuspend(Unit.a);
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
                wg6 wg6Var = ProfilePresenter.this.c;
                this.a = 1;
                obj = wg6Var.h(this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$trackProfileOpening$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class x0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        x0(cv1<? super x0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            x0 x0Var = new x0(cv1Var);
            x0Var.b = obj;
            return x0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((x0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ProfilePresenter.this.r.error("Cannot track profile opening event", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onSubscribeToSmsClick$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class y extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        y(cv1<? super y> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new y(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((y) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((xo8) ProfilePresenter.this.getViewState()).ca();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lgub;", "userData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$updateScreenData$1", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class y0 extends f3b implements Function2<gub, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        y0(cv1<? super y0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            y0 y0Var = new y0(cv1Var);
            y0Var.b = obj;
            return y0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(gub gubVar, cv1<? super Unit> cv1Var) {
            return ((y0) create(gubVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                gub gubVar = (gub) this.b;
                if (gubVar.d()) {
                    ProfilePresenter.this.S(gubVar);
                    ProfilePresenter.this.U(gubVar.c());
                    ProfilePresenter.this.K0();
                    ProfilePresenter.this.R();
                    ProfilePresenter.this.T(gubVar.b());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfilePresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfilePresenter$onSubscribeToSmsClick$2", f = "ProfilePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class z extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        z(cv1<? super z> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new z(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((z) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((xo8) ProfilePresenter.this.getViewState()).gb();
                ((xo8) ProfilePresenter.this.getViewState()).b0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ ProfilePresenter(f63 f63Var, ef4 ef4Var, wg6 wg6Var, df4 df4Var, k63 k63Var, kn8 kn8Var, zxa zxaVar, hq3 hq3Var, f5b f5bVar, ih4 ih4Var, yo8 yo8Var, l6 l6Var, ps1 ps1Var, mh0 mh0Var, gc gcVar, i00 i00Var, zt6 zt6Var, wt6 wt6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f63Var, ef4Var, wg6Var, df4Var, k63Var, kn8Var, zxaVar, hq3Var, f5bVar, ih4Var, yo8Var, (i2 & 2048) != 0 ? new l6(null, 1, null) : l6Var, ps1Var, mh0Var, gcVar, i00Var, zt6Var, wt6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        boolean z2;
        boolean z3 = true;
        if (!b0() && this.u.h().length() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        z3 = (!this.p.b() || this.u.d().length() <= 0) ? false : false;
        if (this.h.a(bq3.J6) && (z2 || z3)) {
            ((xo8) getViewState()).j7();
        } else {
            ((xo8) getViewState()).Kb();
        }
    }

    private final void B0() {
        ((xo8) getViewState()).id(this.n.h(), this.n.g(), this.n.c(), this.n.f(), this.n.i());
    }

    private final void C0() {
        p(z77.a(y87.a(hy.a(new h0(null)), new i0(null)), new j0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(ul6 ul6Var) {
        this.l.S(new k0(ul6Var), l0.a);
    }

    private final void E0(fub fubVar) {
        if (fubVar.d()) {
            ((xo8) getViewState()).k6();
            Q();
            return;
        }
        ((xo8) getViewState()).t8();
    }

    private final void F0() {
        ((xo8) getViewState()).U3();
    }

    private final void G0() {
        o(wz3.F(this.e.c(), new m0(null)));
    }

    private final void H0() {
        o(wz3.F(this.d.a(), new n0(null)));
    }

    private final l95 I0() {
        return o(wz3.F(this.e.c(), new o0(null)));
    }

    private final void J0() {
        o(wz3.F(this.b.c(), new p0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0() {
        l95 l95Var = this.s;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        this.s = o(wz3.h(wz3.M(wz3.F(this.f.D(), new q0(null)), new r0(null)), new s0(null)));
    }

    private final void L0() {
        o(wz3.h(wz3.F(this.q.a(), new t0(null)), new u0(null)));
    }

    private final void M0() {
        p(z77.a(hy.a(new v0(null)), new w0(null)));
    }

    private final void N0() {
        p(z77.a(this.f.H(), new x0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0() {
        ((xo8) getViewState()).gb();
        p(y87.a(this.f.z(), new y0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        p(z77.a(y87.a(this.f.z(), new b(null)), new c(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        p(z77.a(y87.a(r77.a(this.f.v(), new d(null)), new e(null)), new f(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        p(y87.a(this.f.w(), new g(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(gub gubVar) {
        ((xo8) getViewState()).ng(this.k.e(gubVar, !this.t));
        this.t = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(n42 n42Var) {
        if (this.h.a(bq3.u5) && !n42Var.n()) {
            p(z77.a(y87.a(this.f.x(), new h(null)), new i(null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(fub fubVar) {
        ((xo8) getViewState()).kd();
        ((xo8) getViewState()).H3();
        ((xo8) getViewState()).d7();
        if (fubVar.d()) {
            E0(fubVar);
        } else {
            ((xo8) getViewState()).T3();
        }
    }

    private final void W(final Function0<Unit> function0) {
        this.a.m(R.id.register_success_result, new wk9() { // from class: eo8
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                ProfilePresenter.X(ProfilePresenter.this, function0, obj);
            }
        });
        this.a.e(new y38(new ru.dodopizza.app.presentation.phonenumberlogin.e(e.a.g)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(ProfilePresenter profilePresenter, Function0 function0, Object obj) {
        z65.h(profilePresenter, "this$0");
        z65.h(function0, "$action");
        profilePresenter.a.j(R.id.register_success_result);
        if ((obj instanceof fy5.b) && profilePresenter.p.b()) {
            function0.invoke();
        }
    }

    private final void Z(Function0<Unit> function0) {
        if (this.p.b()) {
            function0.invoke();
        } else {
            W(function0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        this.l.w1(j.a);
    }

    private final boolean b0() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        this.a.e(ut6.a());
    }

    private final void x0() {
        p(y87.a(z77.a(this.m.a(), new c0(null)), new d0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(long j2) {
        p(z77.a(this.f.E(j2), new g0(null)));
    }

    @Override // moxy.MvpPresenter
    /* renamed from: V */
    public void attachView(xo8 xo8Var) {
        super.attachView(xo8Var);
        N0();
        O0();
        C0();
        x0();
        A0();
        if (this.h.a(bq3.J6)) {
            L0();
        }
    }

    @Override // moxy.MvpPresenter
    /* renamed from: Y */
    public void detachView(xo8 xo8Var) {
        super.detachView(xo8Var);
        l95 l95Var = this.s;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        this.s = null;
    }

    public final void d0() {
        Z(new l(this));
        this.o.a(dy0.a.a(ck1.q, dy0.a.b));
    }

    public final void e0() {
        String d2 = this.u.d();
        if (d2.length() <= 0) {
            d2 = null;
        }
        if (d2 != null) {
            this.a.e(zr3.a());
            this.o.a(new js1.a(ck1.q));
        }
    }

    public final void f0() {
        this.a.e(com.dodopizza.auth.features.legaldocuments.presentation.b.a(new qo5(this.u.g())));
        this.o.a(oo5.a.a(ck1.q));
    }

    public final void g0() {
        String h2 = this.u.h();
        if (h2.length() <= 0) {
            h2 = null;
        }
        if (h2 != null) {
            ((xo8) getViewState()).a0(h2);
            this.o.a(new h28(ck1.q));
        }
    }

    public final void h0() {
        if (this.u.m() || b0()) {
            ((xo8) getViewState()).hg(this.u, b0(), this.p.b());
        }
    }

    public final void i0() {
        if (this.h.a(bq3.Y5)) {
            p(y87.a(this.f.y(), new m(null)));
        } else {
            p(y87.a(this.f.u(), new n(null)));
        }
    }

    public final void j0() {
        g63.b(this.a, "registration_phone_fragment", new ru.dodopizza.app.presentation.phonenumberlogin.e(e.a.a));
    }

    public final void k0() {
        this.a.d();
    }

    public final void l0() {
        this.a.e(qf7.a);
    }

    public final void m0() {
        ((xo8) getViewState()).Lb();
    }

    public final void n0() {
        this.a.e(new w26(new e06(rba.b, null, 2, null)));
    }

    public final void o0(ul6 ul6Var) {
        z65.h(ul6Var, "missionVO");
        if (z65.c(ul6Var.i(), xl6.a.a) && z65.c(ul6Var.e(), gf4.a)) {
            p(z77.a(y87.a(r77.a(this.f.a(ul6Var.getId()), new o(ul6Var, null)), new p(null)), new q(null)));
        } else {
            p0(ul6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        P();
        J0();
        G0();
        H0();
        I0();
        B0();
        F0();
        M0();
    }

    public final void p0(ul6 ul6Var) {
        vl6 vl6Var;
        yw9 p16Var;
        z65.h(ul6Var, "missionVO");
        String id = ul6Var.getId();
        String c2 = ul6Var.c();
        long d2 = ul6Var.d();
        String f2 = ul6Var.f();
        String a2 = ul6Var.a();
        xl6 i2 = ul6Var.i();
        wl6 e2 = ul6Var.e();
        if (ul6Var.b() != null) {
            vl6Var = new vl6(ul6Var.b().a(), ul6Var.b().b());
        } else {
            vl6Var = null;
        }
        b16 b16Var = new b16(id, c2, d2, f2, a2, i2, e2, vl6Var);
        if (this.h.a(bq3.g7)) {
            p16Var = new q16(b16Var);
        } else {
            p16Var = new p16(b16Var);
        }
        this.a.e(p16Var);
    }

    public final void q0() {
        Q();
    }

    public final void r0() {
        z0(this.i.b());
        ((xo8) getViewState()).gb();
    }

    public final void s0(wl7 wl7Var) {
        z65.h(wl7Var, BonusActionEntity.ORDER);
        ej7 ej7Var = new ej7(wl7Var.a().t(), ck1.q, false, 4, null);
        if (this.j.a() && wl7Var.a().E() == jk7.e.i() && this.h.a(bq3.r6)) {
            this.a.e(new r(false, new t(ej7Var)));
        } else {
            this.a.e(new s(false, new u(ej7Var)));
        }
    }

    public final void t0() {
        this.a.e(ub9.a);
        p(z77.a(hy.a(new v(null)), new w(null)));
    }

    public final void u0() {
        p(hy.a(new x(null)));
    }

    public final void v0() {
        this.a.e(oo8.a);
    }

    public final void w0() {
        p(o77.a(z77.a(y87.a(r77.a(this.f.F(), new y(null)), new z(null)), new a0(null)), new b0(null)));
    }

    public final void y0(String str) {
        z65.h(str, "id");
        p(z77.a(hy.a(new e0(str, null)), new f0(str, null)));
    }

    public ProfilePresenter(f63 f63Var, ef4 ef4Var, wg6 wg6Var, df4 df4Var, k63 k63Var, kn8 kn8Var, zxa zxaVar, hq3 hq3Var, f5b f5bVar, ih4 ih4Var, yo8 yo8Var, l6<ul6> l6Var, ps1 ps1Var, mh0 mh0Var, gc gcVar, i00 i00Var, zt6 zt6Var, wt6 wt6Var) {
        rn5 b2;
        z65.h(f63Var, "router");
        z65.h(ef4Var, "getNumberCanceledOrderInteractor");
        z65.h(wg6Var, "menuRefreshInteractor");
        z65.h(df4Var, "getDataAvailabilityInteractor");
        z65.h(k63Var, "domainEvents");
        z65.h(kn8Var, "interactor");
        z65.h(zxaVar, "storiesInteractor");
        z65.h(hq3Var, "featureService");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(ih4Var, "googlePlatServicesHelper");
        z65.h(yo8Var, "widgetConverter");
        z65.h(l6Var, "missionsDataSet");
        z65.h(ps1Var, "contactsInteractor");
        z65.h(mh0Var, "buildInfo");
        z65.h(gcVar, "analytics");
        z65.h(i00Var, "authorizationState");
        z65.h(zt6Var, "nativeChatUnreadMessagesCount");
        z65.h(wt6Var, "nativeChatStateChecker");
        this.a = f63Var;
        this.b = ef4Var;
        this.c = wg6Var;
        this.d = df4Var;
        this.e = k63Var;
        this.f = kn8Var;
        this.g = zxaVar;
        this.h = hq3Var;
        this.i = f5bVar;
        this.j = ih4Var;
        this.k = yo8Var;
        this.l = l6Var;
        this.m = ps1Var;
        this.n = mh0Var;
        this.o = gcVar;
        this.p = i00Var;
        this.q = zt6Var;
        this.r = LoggerFactory.getLogger("ProfilePresenter");
        this.u = com.dodopizza.profile.feature.profilesettings.presentation.a.j.a();
        b2 = yn5.b(new k(wt6Var));
        this.v = b2;
    }
}
