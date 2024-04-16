package com.dodopizza.activeorder.feature.ordersummary.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.activeorder.feature.ordersummary.presentation.b;
import com.dodopizza.controlling.feature.orderrating.presentation.c;
import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.presentation.presenters.BasePresenter2;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ao3;
import defpackage.dy0;
import defpackage.h37;
import defpackage.l95;
import defpackage.ym;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: OrderSummaryPresenter.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u0098\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0099\u0001Bu\b\u0007\u0012\u0006\u0010O\u001a\u00020M\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010b\u001a\u00020`\u0012\u0006\u0010e\u001a\u00020c\u0012\u0006\u0010i\u001a\u00020f\u0012\u0006\u0010m\u001a\u00020j\u0012\u0006\u0010p\u001a\u00020n\u0012\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001\u0012\u0006\u0010t\u001a\u00020q\u0012\u0006\u0010x\u001a\u00020u¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010.\u001a\u00020\u0005H\u0002J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u00100\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u00101\u001a\u00020\u0005H\u0014J\b\u00102\u001a\u00020\u0005H\u0014J\u0010\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\tH\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00103\u001a\u00020\tH\u0016J\u0006\u00106\u001a\u00020\u0005J\u0006\u00107\u001a\u00020\u0005J\u0006\u00108\u001a\u00020\u0005J\u000e\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u000209J\u0006\u0010<\u001a\u00020\u0005J\u0006\u0010=\u001a\u00020\u0005J\u0006\u0010>\u001a\u00020\u0005J\u000e\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?J\u0006\u0010B\u001a\u00020\u0005J\u0006\u0010C\u001a\u00020\u0005J\u0006\u0010D\u001a\u00020\u0005J\u0006\u0010E\u001a\u00020\u0005J\u0006\u0010F\u001a\u00020\u0005J\u0006\u0010G\u001a\u00020\u0005J\u0010\u0010I\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u000eH\u0016J\u0010\u0010K\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0010H\u0016J\u0006\u0010L\u001a\u00020\u0005R\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u007fR!\u0010\u0084\u0001\u001a\r \u0082\u0001*\u0005\u0018\u00010\u0081\u00010\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010\u0083\u0001R \u0010\u0089\u0001\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010BR\u0018\u0010\u008d\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010BR\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0093\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010B¨\u0006\u009a\u0001"}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lfk7;", "Ltr6;", "Lh37$a;", "", "d0", "(Lcv1;)Ljava/lang/Object;", "e0", "Lry7;", "notificationsStatus", "n0", "Ldk7;", BonusActionEntity.ORDER, "", "k0", "", "orderId", "o0", "l0", "m0", "orderVO", "g0", "f0", "viewState", "i0", "h0", "", "Ltv5;", "icons", "K", "q0", "prevOrder", "newOrder", "p0", "Lpi7;", "previousState", "newState", "N", "O", "j0", "D", "F", "J", "H", "I", "E", "G", "M", "p", "q", "status", "g", Image.TYPE_HIGH, "Q", "R", "onBackPressed", "Lm86;", "marker", "Y", "W", "X", "S", "Lcom/dodopizza/controlling/feature/orderrating/presentation/c;", "result", "b0", "Z", "P", "V", "U", "T", "c0", "available", "k", RemoteMessageConst.Notification.URL, "b", "a0", "Lej7;", "Lej7;", "data", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lfj7;", DateTokenConverter.CONVERTER_KEY, "Lfj7;", "externalRouter", "Lmj7;", com.huawei.hms.push.e.a, "Lmj7;", "interactor", "Lpr5;", "f", "Lpr5;", "liveActivityInteractor", "Lm37;", "Lm37;", "notificationsStatusInteractor", "Lhq3;", "Lhq3;", "featureService", "Lgc;", "i", "Lgc;", "analytics", "Ljgb;", "j", "Ljgb;", "timeFormatter", "Li00;", "Li00;", "authorizationState", "Lah7;", "l", "Lah7;", "orderRatingAutoSubmitFeatureState", "Ldq3;", Image.TYPE_MEDIUM, "Ldq3;", "featureInteractor", "n", "Ldk7;", "Lcom/dodopizza/activeorder/feature/ordersummary/presentation/b;", "o", "Lcom/dodopizza/activeorder/feature/ordersummary/presentation/b;", "orderTrackingPhoneVO", "Ljava/lang/String;", "websiteNoGloves", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "r", "Lrn5;", "L", "()Z", "isNativeChatEnabled", Image.TYPE_SMALL, "canRequestNotificationsPermission", "t", "isDelivery", "Ll95;", "u", "Ll95;", "courierDeliveryJob", "v", "canShowFeedbackButtons", "Lwt6;", "nativeChatStateChecker", "<init>", "(Lej7;Lf63;Lfj7;Lmj7;Lpr5;Lm37;Lhq3;Lgc;Ljgb;Li00;Lwt6;Lah7;Ldq3;)V", "w", "a", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OrderSummaryPresenter extends BasePresenter2<fk7> implements tr6, h37.a {
    public static final a w = new a(null);
    private final ej7 b;
    private final f63 c;
    private final fj7 d;
    private final mj7 e;
    private final pr5 f;
    private final m37 g;
    private final hq3 h;
    private final gc i;
    private final jgb j;
    private final i00 k;
    private final ah7 l;
    private final dq3 m;
    private dk7 n;
    private com.dodopizza.activeorder.feature.ordersummary.presentation.b o;
    private String p;
    private final Logger q;
    private final rn5 r;
    private boolean s;
    private boolean t;
    private l95 u;
    private boolean v;

    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/presentation/OrderSummaryPresenter$a;", "", "", "FIRST_ICONS", "I", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[mi7.values().length];
            try {
                iArr[mi7.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mi7.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mi7.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mi7.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mi7.m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mi7.i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mi7.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mi7.h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mi7.j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mi7.k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mi7.n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[mi7.l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[b.a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[b.a.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$backToProfile$1", f = "OrderSummaryPresenter.kt", l = {565}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
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
                dq3 dq3Var = OrderSummaryPresenter.this.m;
                bq3 bq3Var = bq3.g7;
                this.a = 1;
                obj = dq3Var.f(bq3Var, this);
                if (obj == d) {
                    return d;
                }
            }
            OrderSummaryPresenter.this.d.a(((Boolean) obj).booleanValue());
            OrderSummaryPresenter.this.i.a(new aj7(OrderSummaryPresenter.this.b.a()));
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$backToProfile$2", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
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
                OrderSummaryPresenter.this.q.error("Failed when backTo profile", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lik8;", "level", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$configureNiceBonusBanner$1", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends f3b implements Function2<ik8, cv1<? super Unit>, Object> {
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
        public final Object invoke(ik8 ik8Var, cv1<? super Unit> cv1Var) {
            return ((e) create(ik8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean y;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ik8 ik8Var = (ik8) this.b;
                if (ik8Var != null) {
                    y = l0b.y(ik8Var.a());
                    if (!y) {
                        ((fk7) OrderSummaryPresenter.this.getViewState()).Yb(ik8Var);
                        return Unit.a;
                    }
                }
                ((fk7) OrderSummaryPresenter.this.getViewState()).Y2();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$configureNiceBonusBanner$2", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
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
                OrderSummaryPresenter.this.q.warn("Failed to get nice bonus current level.", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function0<Boolean> {
        final /* synthetic */ wt6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(wt6 wt6Var) {
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
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$onClickConfirmCancelOrder$1", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends f3b implements Function1<cv1<? super Unit>, Object> {
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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((fk7) OrderSummaryPresenter.this.getViewState()).Ag();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$onClickConfirmCancelOrder$2", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((i) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderSummaryPresenter.this.E();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$onClickConfirmCancelOrder$3", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
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
                OrderSummaryPresenter.this.q.error("Can`t cancel order", (Throwable) this.b);
                ((fk7) OrderSummaryPresenter.this.getViewState()).dd(dn0.d.i());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$onClickConfirmCancelOrder$4", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((k) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((fk7) OrderSummaryPresenter.this.getViewState()).a3();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ldk7;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$onViewAttached$1", f = "OrderSummaryPresenter.kt", l = {113}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class l extends f3b implements Function2<dk7, cv1<? super Unit>, Object> {
        int a;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new l(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(dk7 dk7Var, cv1<? super Unit> cv1Var) {
            return ((l) create(dk7Var, cv1Var)).invokeSuspend(Unit.a);
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
                OrderSummaryPresenter orderSummaryPresenter = OrderSummaryPresenter.this;
                this.a = 1;
                if (orderSummaryPresenter.d0(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ldk7;", BonusActionEntity.ORDER, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$onViewAttached$2", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class m extends f3b implements Function2<dk7, cv1<? super Unit>, Object> {
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
        public final Object invoke(dk7 dk7Var, cv1<? super Unit> cv1Var) {
            return ((m) create(dk7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                dk7 dk7Var = (dk7) this.b;
                if (dk7Var.e().length() == 0) {
                    OrderSummaryPresenter.this.E();
                } else if (OrderSummaryPresenter.this.k0(dk7Var)) {
                    OrderSummaryPresenter.this.o0(dk7Var.e());
                } else {
                    OrderSummaryPresenter.this.l0(dk7Var);
                    OrderSummaryPresenter.this.m0(dk7Var);
                    OrderSummaryPresenter.this.e0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Ldk7;", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$onViewAttached$3", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class n extends f3b implements y84<pz3<? super dk7>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n(cv1<? super n> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super dk7> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            n nVar = new n(cv1Var);
            nVar.b = th;
            return nVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderSummaryPresenter.this.q.error("Failed when observe order summary", (Throwable) this.b);
                OrderSummaryPresenter.this.E();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter", f = "OrderSummaryPresenter.kt", l = {133}, m = "playFullscreenAnimation")
    /* loaded from: classes.dex */
    public static final class o extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        o(cv1<? super o> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return OrderSummaryPresenter.this.d0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lxf8;", "positionCourierVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$setCourierOnMap$2", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends f3b implements Function2<xf8, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ tv5 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(tv5 tv5Var, cv1<? super p> cv1Var) {
            super(2, cv1Var);
            this.d = tv5Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p pVar = new p(this.d, cv1Var);
            pVar.b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(xf8 xf8Var, cv1<? super Unit> cv1Var) {
            return ((p) create(xf8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                xf8 xf8Var = (xf8) this.b;
                if (xf8Var != null) {
                    OrderSummaryPresenter orderSummaryPresenter = OrderSummaryPresenter.this;
                    tv5 tv5Var = this.d;
                    Double a = xf8Var.a();
                    if (a != null) {
                        a.doubleValue();
                        if (xf8Var.b() == null) {
                            a = null;
                        }
                        if (a != null) {
                            a.doubleValue();
                            ((fk7) orderSummaryPresenter.getViewState()).w2(xf8Var, tv5Var);
                            ((fk7) orderSummaryPresenter.getViewState()).Xc(true);
                        }
                    }
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lxf8;", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$setCourierOnMap$3", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class q extends f3b implements y84<pz3<? super xf8>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q(cv1<? super q> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super xf8> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            q qVar = new q(cv1Var);
            qVar.b = th;
            return qVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderSummaryPresenter.this.q.error("Failed when observe courier location", (Throwable) this.b);
                OrderSummaryPresenter.this.E();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderSummaryPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$trackThisOrder$1", f = "OrderSummaryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class r extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                OrderSummaryPresenter.this.q.warn("Failed to track order screen event. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public OrderSummaryPresenter(ej7 ej7Var, f63 f63Var, fj7 fj7Var, mj7 mj7Var, pr5 pr5Var, m37 m37Var, hq3 hq3Var, gc gcVar, jgb jgbVar, i00 i00Var, wt6 wt6Var, ah7 ah7Var, dq3 dq3Var) {
        rn5 b2;
        z65.h(ej7Var, "data");
        z65.h(f63Var, "router");
        z65.h(fj7Var, "externalRouter");
        z65.h(mj7Var, "interactor");
        z65.h(pr5Var, "liveActivityInteractor");
        z65.h(m37Var, "notificationsStatusInteractor");
        z65.h(hq3Var, "featureService");
        z65.h(gcVar, "analytics");
        z65.h(jgbVar, "timeFormatter");
        z65.h(i00Var, "authorizationState");
        z65.h(wt6Var, "nativeChatStateChecker");
        z65.h(ah7Var, "orderRatingAutoSubmitFeatureState");
        z65.h(dq3Var, "featureInteractor");
        this.b = ej7Var;
        this.c = f63Var;
        this.d = fj7Var;
        this.e = mj7Var;
        this.f = pr5Var;
        this.g = m37Var;
        this.h = hq3Var;
        this.i = gcVar;
        this.j = jgbVar;
        this.k = i00Var;
        this.l = ah7Var;
        this.m = dq3Var;
        this.q = LoggerFactory.getLogger("OrderPresenter");
        b2 = yn5.b(new g(wt6Var));
        this.r = b2;
        this.s = true;
    }

    private final void D(dk7 dk7Var) {
        if (dk7Var.h().length() > 0) {
            ((fk7) getViewState()).P7();
        } else {
            ((fk7) getViewState()).G2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        wj1.b(z77.a(hy.a(new c(null)), new d(null)), PresenterScopeKt.getPresenterScope(this));
    }

    private final void F(dk7 dk7Var) {
        if (dk7Var.w()) {
            ((fk7) getViewState()).J7();
        } else {
            ((fk7) getViewState()).V5();
        }
    }

    private final void G(dk7 dk7Var) {
        if (this.h.a(bq3.U5) && M(dk7Var)) {
            wj1.b(z77.a(y87.a(this.e.a(dk7Var.q()), new e(null)), new f(null)), PresenterScopeKt.getPresenterScope(this));
        } else {
            ((fk7) getViewState()).Y2();
        }
    }

    private final void H(dk7 dk7Var) {
        if (dk7Var.y()) {
            if (!this.v) {
                ((fk7) getViewState()).K6(new pq3(dk7Var.e(), ck1.w));
                this.v = true;
                return;
            }
            return;
        }
        ((fk7) getViewState()).Md();
        this.v = false;
    }

    private final void I(dk7 dk7Var) {
        boolean z;
        boolean z2 = false;
        if (this.o != null) {
            z = true;
        } else {
            z = false;
        }
        ((fk7) getViewState()).u4(z);
        ((fk7) getViewState()).Hc(L());
        z2 = (z || L()) ? true : true;
        if ((dk7Var.l().h() || this.h.a(bq3.N5)) && z2) {
            ((fk7) getViewState()).s5();
            return;
        }
        ((fk7) getViewState()).H1();
        ((fk7) getViewState()).Z4();
    }

    private final void J(dk7 dk7Var) {
        String v = dk7Var.v();
        if (v.length() > 0) {
            ((fk7) getViewState()).he();
            ((fk7) getViewState()).Ga(v);
            return;
        }
        ((fk7) getViewState()).p1();
    }

    private final tv5 K(List<tv5> list) {
        Object c0;
        c0 = sc1.c0(list, 0);
        tv5 tv5Var = (tv5) c0;
        if (tv5Var != null) {
            return new tv5(tv5Var.b(), tv5Var.c(), tv5Var.a());
        }
        return null;
    }

    private final boolean L() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    private final boolean M(dk7 dk7Var) {
        mi7 i2 = dk7Var.l().i();
        if (i2 != mi7.c && i2 != mi7.m) {
            return true;
        }
        return false;
    }

    private final boolean N(pi7 pi7Var, pi7 pi7Var2) {
        if (pi7Var.i() == pi7Var2.i() && pi7Var.g() == pi7Var2.g() && pi7Var.b() == pi7Var2.b()) {
            return false;
        }
        return true;
    }

    private final void O() {
        if (this.k.b()) {
            this.c.e(ut6.a());
            this.i.a(new aj7(this.b.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(defpackage.cv1<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter.o
            if (r0 == 0) goto L13
            r0 = r5
            com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$o r0 = (com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter.o) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$o r0 = new com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter$o
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.a
            com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter r0 = (com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter) r0
            defpackage.vk9.b(r5)
            goto L50
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            defpackage.vk9.b(r5)
            ej7 r5 = r4.b
            boolean r5 = r5.c()
            if (r5 == 0) goto L61
            dq3 r5 = r4.m
            bq3 r2 = defpackage.bq3.z6
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = r5.f(r2, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
        L50:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L61
            moxy.MvpView r5 = r0.getViewState()
            fk7 r5 = (defpackage.fk7) r5
            r5.B6()
        L61:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryPresenter.d0(cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        if (this.b.c() && this.s) {
            this.s = false;
            ((fk7) getViewState()).K8(ck1.w);
        }
    }

    private final void f0(dk7 dk7Var) {
        if (dk7Var.l().f()) {
            ((fk7) getViewState()).Cc(dk7Var.p());
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            i0((fk7) viewState, dk7Var);
        } else if (dk7Var.l().c()) {
            ((fk7) getViewState()).x4();
        } else {
            ((fk7) getViewState()).s6();
        }
    }

    private final void g0(dk7 dk7Var) {
        if (this.h.a(bq3.g)) {
            if (dk7Var.l().d()) {
                ((fk7) getViewState()).H6(this.j.c(dk7Var.k()));
            } else {
                ((fk7) getViewState()).ce();
            }
        }
    }

    private final void h0(dk7 dk7Var) {
        tv5 K = K(dk7Var.b());
        int i2 = b.$EnumSwitchMapping$0[dk7Var.l().i().ordinal()];
        if (i2 != 6) {
            switch (i2) {
                case 10:
                case 11:
                    if (!this.t) {
                        this.u = wz3.C(wz3.h(wz3.F(this.e.c(dk7Var.u()), new p(K, null)), new q(null)), o());
                        this.t = true;
                        return;
                    }
                    return;
                case 12:
                    l95 l95Var = this.u;
                    if (l95Var != null) {
                        l95.a.a(l95Var, null, 1, null);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        gg7 t = dk7Var.t();
        if (t != null) {
            ((fk7) getViewState()).d8(t, K);
        }
    }

    private final void i0(fk7 fk7Var, dk7 dk7Var) {
        if (dk7Var.r() == jk7.e) {
            fk7Var.Ja();
        } else {
            fk7Var.e6();
        }
    }

    private final void j0(dk7 dk7Var) {
        ((fk7) getViewState()).Y4(new sr6(dk7Var.e(), dk7Var.l().i(), ck1.w));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k0(dk7 dk7Var) {
        if (dk7Var.l().i() == mi7.l) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(dk7 dk7Var) {
        dk7 dk7Var2 = this.n;
        if (dk7Var2 != null) {
            if (dk7Var2 == null) {
                z65.z(BonusActionEntity.ORDER);
                dk7Var2 = null;
            }
            p0(dk7Var2, dk7Var);
        } else {
            q0(dk7Var);
        }
        this.n = dk7Var;
        this.o = dk7Var.m();
        this.p = dk7Var.h();
        ((fk7) getViewState()).Ob(dk7Var.i(), this.j.c(dk7Var.j()));
        ((fk7) getViewState()).T5(dk7Var.g(), dk7Var.q());
        ((fk7) getViewState()).Vg(dk7Var.f());
        ((fk7) getViewState()).C4(dk7Var.r().i(), dk7Var.a());
        D(dk7Var);
        Integer o2 = dk7Var.o();
        if (o2 != null) {
            ((fk7) getViewState()).r3(o2.intValue());
        }
        dta n2 = dk7Var.n();
        if (n2 != null) {
            ((fk7) getViewState()).f3(n2.a());
        } else {
            ((fk7) getViewState()).B1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(dk7 dk7Var) {
        ((fk7) getViewState()).Ff();
        ((fk7) getViewState()).G4(dk7Var.l().e(), dk7Var.l().a());
        ((fk7) getViewState()).V7(dk7Var.l().g(), dk7Var.l().b());
        tv5 K = K(dk7Var.c());
        tv5 K2 = K(dk7Var.s());
        ((fk7) getViewState()).v9();
        gg7 d2 = dk7Var.d();
        if (d2 != null) {
            ((fk7) getViewState()).T7(d2, K);
        }
        gg7 t = dk7Var.t();
        if (t != null) {
            ((fk7) getViewState()).Xd(t, K2);
        }
        ((fk7) getViewState()).Xc(false);
        h0(dk7Var);
        f0(dk7Var);
        g0(dk7Var);
        I(dk7Var);
        F(dk7Var);
        G(dk7Var);
        j0(dk7Var);
        mi7 i2 = dk7Var.l().i();
        switch (b.$EnumSwitchMapping$0[i2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                ((fk7) getViewState()).Md();
                ((fk7) getViewState()).p1();
                return;
            case 7:
            case 8:
                ((fk7) getViewState()).Md();
                J(dk7Var);
                return;
            case 9:
            case 10:
            case 11:
                H(dk7Var);
                ((fk7) getViewState()).p1();
                return;
            default:
                Logger logger = this.q;
                logger.error("Unsupported order state: " + i2);
                this.c.d();
                this.i.a(new aj7(this.b.a()));
                return;
        }
    }

    private final void n0(ry7 ry7Var) {
        if (this.b.c() && ry7Var == ry7.GRANTED) {
            this.f.d(this.b.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(String str) {
        this.c.g(vc7.a(new ic7(str, this.b.b())));
    }

    private final void p0(dk7 dk7Var, dk7 dk7Var2) {
        if (N(dk7Var.l(), dk7Var2.l())) {
            this.i.a(new dc7(dk7Var2.e(), dk7Var2.r(), dk7Var2.x(), dk7Var2.l().i()));
        }
    }

    private final void q0(dk7 dk7Var) {
        wj1.b(z77.a(this.e.e(dk7Var.e(), this.b.b()), new r(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void P() {
        this.i.a(new fc7(ym.d.m));
    }

    public final void Q() {
        fk7 fk7Var = (fk7) getViewState();
        dk7 dk7Var = this.n;
        if (dk7Var == null) {
            z65.z(BonusActionEntity.ORDER);
            dk7Var = null;
        }
        fk7Var.G7(String.valueOf(dk7Var.i()));
    }

    public final void R() {
        mj7 mj7Var = this.e;
        dk7 dk7Var = this.n;
        if (dk7Var == null) {
            z65.z(BonusActionEntity.ORDER);
            dk7Var = null;
        }
        wj1.b(o77.a(z77.a(y87.a(r77.a(mj7Var.b(dk7Var.e()), new h(null)), new i(null)), new j(null)), new k(null)), PresenterScopeKt.getPresenterScope(this));
    }

    public final void S() {
        this.c.e(kd7.a(new zc7(this.b.a())));
    }

    public final void T() {
        ((fk7) getViewState()).Z4();
        O();
        this.i.a(dy0.a.a(ck1.w, dy0.a.b));
    }

    public final void U() {
        String str;
        com.dodopizza.activeorder.feature.ordersummary.presentation.b bVar = this.o;
        if (bVar == null) {
            return;
        }
        ((fk7) getViewState()).Z4();
        ((fk7) getViewState()).ec(bVar.a());
        int i2 = b.$EnumSwitchMapping$1[bVar.b().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str = "pizzeria";
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            str = " call_center";
        }
        this.i.a(new g28(ym.d.m, str));
    }

    public final void V() {
        ((fk7) getViewState()).Xf();
        this.i.a(new yi7(ym.d.m));
    }

    public final void W() {
        this.i.a(new xi7(this.b.a()));
    }

    public final void X() {
        this.i.a(new dj7(this.b.a()));
    }

    public final void Y(m86 m86Var) {
        cj7 cj7Var;
        z65.h(m86Var, "marker");
        cj7[] values = cj7.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                cj7Var = values[i2];
                if (z65.c(cj7Var.getValue(), m86Var.d())) {
                    break;
                }
                i2++;
            } else {
                cj7Var = null;
                break;
            }
        }
        if (cj7Var != null) {
            this.i.a(new zi7(this.b.a(), cj7Var));
        }
    }

    public final void Z() {
        String str = this.p;
        if (str != null) {
            this.i.a(new ao3.a(str, ym.d.m));
            ((fk7) getViewState()).d(str);
        }
    }

    public final void a0() {
        this.i.a(new bj7(this.b.a()));
        this.d.c(this.b.a());
        this.i.a(new aj7(this.b.a()));
    }

    @Override // defpackage.tr6
    public void b(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        this.c.e(com.dodopizza.feature.webinfo.presentation.d.a(new com.dodopizza.feature.webinfo.presentation.a((String) null, str, (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
        this.i.a(new aj7(this.b.a()));
    }

    public final void b0(com.dodopizza.controlling.feature.orderrating.presentation.c cVar) {
        z65.h(cVar, "result");
        if (cVar instanceof c.a) {
            if (!bh7.a(this.l)) {
                ((fk7) getViewState()).wa();
            }
        } else if (z65.c(cVar, c.b.a)) {
            ((fk7) getViewState()).zc();
        }
    }

    public final void c0() {
        dk7 dk7Var = this.n;
        if (dk7Var == null) {
            z65.z(BonusActionEntity.ORDER);
            dk7Var = null;
        }
        m0(dk7Var);
    }

    @Override // defpackage.h37.a
    public void g(ry7 ry7Var) {
        z65.h(ry7Var, "status");
        this.g.f(ck1.w);
        n0(ry7Var);
    }

    @Override // defpackage.h37.a
    public void h(ry7 ry7Var) {
        z65.h(ry7Var, "status");
        n0(ry7Var);
    }

    @Override // defpackage.tr6
    public void k(boolean z) {
        ((fk7) getViewState()).l1(z);
    }

    public final void onBackPressed() {
        if (this.b.c()) {
            this.d.b();
        } else {
            this.c.d();
        }
        this.i.a(new aj7(this.b.a()));
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void p() {
        wz3.C(wz3.h(wz3.F(uz3.a.a(this.e.d(this.b.a()), new l(null)), new m(null)), new n(null)), o());
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void q() {
        this.t = false;
    }
}
