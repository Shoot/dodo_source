package ru.dodopizza.app.presentation.mainscreen;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kp7;
import defpackage.ym;
import java.lang.reflect.Modifier;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter;
import ru.dodopizza.app.presentation.mainscreen.a;
import ru.dodopizza.mindbox.model.MindboxProperties;
/* compiled from: MainScreenPresenter.kt */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001By\b\u0007\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010g\u001a\u00020d\u0012\u0006\u0010j\u001a\u000208\u0012\u0006\u0010n\u001a\u00020k\u0012\u0006\u0010r\u001a\u00020o\u0012\u0006\u0010v\u001a\u00020s¢\u0006\u0004\b|\u0010}J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J!\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020#H\u0002J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020#H\u0002J \u0010)\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H\u0002J\u001a\u0010,\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020+H\u0002J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020.H\u0002J\u0010\u00101\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0010H\u0002J\u0018\u00102\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020.H\u0002J \u00104\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020.H\u0002J\b\u00105\u001a\u00020\u0003H\u0002J\b\u00106\u001a\u00020\u0003H\u0002J\b\u00107\u001a\u00020\u0003H\u0014J\u0016\u0010<\u001a\u00020\u00032\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:J\u000e\u0010>\u001a\u00020\u00032\u0006\u0010=\u001a\u000208J\u000e\u0010?\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010j\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001c\u0010{\u001a\n x*\u0004\u0018\u00010w0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006~"}, d2 = {"Lru/dodopizza/app/presentation/mainscreen/MainScreenPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lp56;", "", "E", "G", "b0", "N", "c0", "M", "d0", "Lvo2;", "deepLinkData", "S", "Lv27;", "sender", "", "menuItemId", "selectedProducts", "Y", "Lqd6;", "menuItem", "O", "leftHalf", "rightHalf", "V", "orderId", "", "ratingValue", "W", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Lgra;", "data", "T", "id", "Lcq8;", "F", "specialOfferId", "a0", "promoCodeValue", "promoCodeMessage", "Z", "personalOfferId", "Lh18;", "X", "categoryId", "Lqd;", "P", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "L", "I", "orderType", "R", "J", "U", "onFirstViewAttach", "Ln56;", "tab", "", "wasSelected", "K", "currentMenuTab", "H", "Q", "Lru/dodopizza/app/presentation/mainscreen/a;", "a", "Lru/dodopizza/app/presentation/mainscreen/a;", "interactor", "Lk63;", "b", "Lk63;", "domainEvents", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lwo2;", DateTokenConverter.CONVERTER_KEY, "Lwo2;", "deepLinkHandler", "Lzt6;", com.huawei.hms.push.e.a, "Lzt6;", "nativeChatUnreadMessagesCount", "Lwt6;", "f", "Lwt6;", "nativeChatStateChecker", "Lqt6;", "g", "Lqt6;", "nativeChatInteractor", "Lzb3;", Image.TYPE_HIGH, "Lzb3;", "easyBonusInteractor", "Ly18;", "i", "Ly18;", "personalToCollaborationVOConverter", "Lhq3;", "j", "Lhq3;", "featureService", "k", "Ln56;", "initialTab", "Lhl8;", "l", "Lhl8;", "productCardScreenFactory", "Lih4;", Image.TYPE_MEDIUM, "Lih4;", "googlePlayServicesHelper", "Ljo;", "n", "Ljo;", "appResourceLocalesFactory", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "o", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lru/dodopizza/app/presentation/mainscreen/a;Lk63;Lf63;Lwo2;Lzt6;Lwt6;Lqt6;Lzb3;Ly18;Lhq3;Ln56;Lhl8;Lih4;Ljo;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MainScreenPresenter extends BasePresenter<p56> {
    private final ru.dodopizza.app.presentation.mainscreen.a a;
    private final k63 b;
    private final f63 c;
    private final wo2 d;
    private final zt6 e;
    private final wt6 f;
    private final qt6 g;
    private final zb3 h;
    private final y18 i;
    private final hq3 j;
    private final n56 k;
    private final hl8 l;
    private final ih4 m;
    private final jo n;
    private final Logger o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Locale;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$actualizeState$1", f = "MainScreenPresenter.kt", l = {146}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function2<Locale, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Locale locale, cv1<? super Unit> cv1Var) {
            return ((a) create(locale, cv1Var)).invokeSuspend(Unit.a);
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
                ru.dodopizza.app.presentation.mainscreen.a aVar = MainScreenPresenter.this.a;
                this.a = 1;
                obj = aVar.t(this);
                if (obj == d) {
                    return d;
                }
            }
            a.InterfaceC0577a interfaceC0577a = (a.InterfaceC0577a) obj;
            if (interfaceC0577a instanceof a.InterfaceC0577a.c) {
                a.InterfaceC0577a.c cVar = (a.InterfaceC0577a.c) interfaceC0577a;
                if (cVar.b()) {
                    MainScreenPresenter.this.L(cVar.a());
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "domainEvent", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$subscribeOnDomainEvent$1", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a0 extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: MainScreenPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j63.values().length];
                try {
                    iArr[j63.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        a0(cv1<? super a0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a0 a0Var = new a0(cv1Var);
            a0Var.b = obj;
            return a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((a0) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (a.$EnumSwitchMapping$0[((j63) this.b).ordinal()] == 1) {
                    MainScreenPresenter.this.G();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Ljava/util/Locale;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$actualizeState$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements y84<pz3<? super Locale>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Locale> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = th;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                MainScreenPresenter.this.o.error("Failed to actualize state\n", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b0 implements oz3<j63> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$subscribeToCurrentUserUpdates$$inlined$filter$1$2", f = "MainScreenPresenter.kt", l = {223}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$b0$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0576a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0576a(cv1 cv1Var) {
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
            public final java.lang.Object emit(java.lang.Object r6, defpackage.cv1 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter.b0.a.C0576a
                    if (r0 == 0) goto L13
                    r0 = r7
                    ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$b0$a$a r0 = (ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter.b0.a.C0576a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$b0$a$a r0 = new ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$b0$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    r2 = r6
                    j63 r2 = (defpackage.j63) r2
                    j63 r4 = defpackage.j63.c
                    if (r2 == r4) goto L41
                    j63 r4 = defpackage.j63.l
                    if (r2 != r4) goto L4a
                L41:
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter.b0.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public b0(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super j63> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lce0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$applyEasyBonus$1", f = "MainScreenPresenter.kt", l = {330}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function1<cv1<? super ce0>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super ce0> cv1Var) {
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
                zb3 zb3Var = MainScreenPresenter.this.h;
                String str = this.c;
                this.a = 1;
                obj = zb3Var.e(str, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$subscribeToCurrentUserUpdates$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c0 extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;

        c0(cv1<? super c0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((c0) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                MainScreenPresenter.this.M();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lce0;", "specialOffer", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$applyEasyBonus$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<ce0, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ cq8 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(cq8 cq8Var, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.d = cq8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(this.d, cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ce0 ce0Var, cv1<? super Unit> cv1Var) {
            return ((d) create(ce0Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((p56) MainScreenPresenter.this.getViewState()).yb((ce0) this.b, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "messagesCount", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$subscribeToUnreadChatMessagesCount$1", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d0 extends f3b implements Function2<Integer, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ int b;

        d0(cv1<? super d0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d0 d0Var = new d0(cv1Var);
            d0Var.b = ((Number) obj).intValue();
            return d0Var;
        }

        public final Object i(int i, cv1<? super Unit> cv1Var) {
            return ((d0) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
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
                if (MainScreenPresenter.this.f.a() && i > 0) {
                    ((p56) MainScreenPresenter.this.getViewState()).h(i);
                } else {
                    ((p56) MainScreenPresenter.this.getViewState()).i();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$applyEasyBonus$3", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(this.d, cv1Var);
            eVar.b = obj;
            return eVar;
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
                Logger logger = MainScreenPresenter.this.o;
                String str = this.d;
                logger.error("Failed to apply EasyBonus with id=" + str, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$subscribeToUnreadChatMessagesCount$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e0 extends f3b implements y84<pz3<? super Integer>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e0(cv1<? super e0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Integer> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            e0 e0Var = new e0(cv1Var);
            e0Var.b = th;
            return e0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                MainScreenPresenter.this.o.error("Failed to process unread messages count", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "goodCount", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$applyGoodsCount$1", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<Integer, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ int b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = ((Number) obj).intValue();
            return fVar;
        }

        public final Object i(int i, cv1<? super Unit> cv1Var) {
            return ((f) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
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
                if (i > 0) {
                    ((p56) MainScreenPresenter.this.getViewState()).Pa(i);
                } else {
                    ((p56) MainScreenPresenter.this.getViewState()).yg();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$applyGoodsCount$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
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
                MainScreenPresenter.this.o.error("Error while showing goods' amount", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "orderType", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$goToActiveOrder$1", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<Integer, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ int b;
        final /* synthetic */ String d;
        final /* synthetic */ qd e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, qd qdVar, cv1<? super h> cv1Var) {
            super(2, cv1Var);
            this.d = str;
            this.e = qdVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(this.d, this.e, cv1Var);
            hVar.b = ((Number) obj).intValue();
            return hVar;
        }

        public final Object i(int i, cv1<? super Unit> cv1Var) {
            return ((h) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
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
                MainScreenPresenter.this.R(this.d, this.b, this.e);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$goToActiveOrder$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, cv1<? super i> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(this.d, cv1Var);
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
                Logger logger = MainScreenPresenter.this.o;
                String str = this.d;
                logger.warn("Can't get order type for orderId " + str, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkp7;", "response", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$handlePaidOrder$1", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j extends f3b implements Function2<kp7, cv1<? super Unit>, Object> {
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
        public final Object invoke(kp7 kp7Var, cv1<? super Unit> cv1Var) {
            return ((j) create(kp7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                kp7 kp7Var = (kp7) this.b;
                if (kp7Var instanceof kp7.a) {
                    MainScreenPresenter.this.I(((kp7.a) kp7Var).a(), ck1.e);
                } else if (kp7Var instanceof kp7.d) {
                    MainScreenPresenter.this.J();
                } else if (!(kp7Var instanceof kp7.c)) {
                    z65.c(kp7Var, kp7.b.a);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$handlePaidOrder$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k kVar = new k(cv1Var);
            kVar.b = obj;
            return kVar;
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
                MainScreenPresenter.this.o.error("Failed to wait for paid order.", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$initNativeChatUser$1", f = "MainScreenPresenter.kt", l = {203}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        l(cv1<? super l> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new l(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((l) create(cv1Var)).invokeSuspend(Unit.a);
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
                qt6 qt6Var = MainScreenPresenter.this.g;
                this.a = 1;
                if (qt6Var.g(null, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$initNativeChatUser$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((m) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                MainScreenPresenter.this.o.warn("Failed to init chat user", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$launchDeepLinksProcessing$1", f = "MainScreenPresenter.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new n(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((n) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                wo2 wo2Var = MainScreenPresenter.this.d;
                this.a = 1;
                if (wo2Var.A(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ru/dodopizza/app/presentation/mainscreen/MainScreenPresenter$o", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class o implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public o(boolean z, Function0 function0) {
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

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ru/dodopizza/app/presentation/mainscreen/MainScreenPresenter$p", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class p implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public p(boolean z, Function0 function0) {
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
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxj7;", "a", "()Lxj7;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class q extends ej5 implements Function0<xj7> {
        final /* synthetic */ ej7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(ej7 ej7Var) {
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
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljj7;", "a", "()Ljj7;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class r extends ej5 implements Function0<jj7> {
        final /* synthetic */ ej7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(ej7 ej7Var) {
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
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$registerMindbox$1", f = "MainScreenPresenter.kt", l = {441, 445}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class s extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        s(cv1<? super s> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new s(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((s) create(cv1Var)).invokeSuspend(Unit.a);
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
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                ru.dodopizza.app.presentation.mainscreen.a aVar = MainScreenPresenter.this.a;
                this.a = 1;
                obj = aVar.y(this);
                if (obj == d) {
                    return d;
                }
            }
            MindboxProperties mindboxProperties = (MindboxProperties) obj;
            if (!z65.c(mindboxProperties, MindboxProperties.Companion.getEMPTY())) {
                ((p56) MainScreenPresenter.this.getViewState()).Kc(mindboxProperties);
                ru.dodopizza.app.presentation.mainscreen.a aVar2 = MainScreenPresenter.this.a;
                this.a = 2;
                if (aVar2.D(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$registerMindbox$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class t extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        t(cv1<? super t> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t tVar = new t(cv1Var);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((t) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                MainScreenPresenter.this.o.warn("Failed to init mindbox lib", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lp08;", "personalOfferData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$showPersonalOffers$1", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class u extends f3b implements Function2<p08, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ h18 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(h18 h18Var, cv1<? super u> cv1Var) {
            super(2, cv1Var);
            this.d = h18Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            u uVar = new u(this.d, cv1Var);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(p08 p08Var, cv1<? super Unit> cv1Var) {
            return ((u) create(p08Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                p08 p08Var = (p08) this.b;
                if (!p08Var.b() || p08Var.a() == null) {
                    MainScreenPresenter.this.J();
                } else if (m08.b(p08Var.a())) {
                    ((p56) MainScreenPresenter.this.getViewState()).g4(MainScreenPresenter.this.i.a(p08Var.a()));
                } else {
                    ((p56) MainScreenPresenter.this.getViewState()).X5(p08Var.a(), this.d);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$showPersonalOffers$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class v extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((v) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                MainScreenPresenter.this.o.error("Failed when get personalOffer from deeplink", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqd6;", "menuItem", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$showProduct$1", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class w extends f3b implements Function2<qd6, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ v27 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(v27 v27Var, cv1<? super w> cv1Var) {
            super(2, cv1Var);
            this.d = v27Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            w wVar = new w(this.d, cv1Var);
            wVar.b = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(qd6 qd6Var, cv1<? super Unit> cv1Var) {
            return ((w) create(qd6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                MainScreenPresenter.this.O((qd6) this.b, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$showProduct$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class x extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, cv1<? super x> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            x xVar = new x(this.d, cv1Var);
            xVar.b = obj;
            return xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((x) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = MainScreenPresenter.this.o;
                String str = this.d;
                logger.error("Can`t find product with id=" + str, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lce0;", "specialOffer", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$showSpecialOffer$1", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class y extends f3b implements Function2<ce0, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ cq8 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(cq8 cq8Var, cv1<? super y> cv1Var) {
            super(2, cv1Var);
            this.d = cq8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            y yVar = new y(this.d, cv1Var);
            yVar.b = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ce0 ce0Var, cv1<? super Unit> cv1Var) {
            return ((y) create(ce0Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((p56) MainScreenPresenter.this.getViewState()).yb((ce0) this.b, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter$showSpecialOffer$2", f = "MainScreenPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class z extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, cv1<? super z> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z zVar = new z(this.d, cv1Var);
            zVar.b = obj;
            return zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((z) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = MainScreenPresenter.this.o;
                String str = this.d;
                logger.error("Can`t find specialOffer with id=" + str, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public MainScreenPresenter(ru.dodopizza.app.presentation.mainscreen.a aVar, k63 k63Var, f63 f63Var, wo2 wo2Var, zt6 zt6Var, wt6 wt6Var, qt6 qt6Var, zb3 zb3Var, y18 y18Var, hq3 hq3Var, n56 n56Var, hl8 hl8Var, ih4 ih4Var, jo joVar) {
        z65.h(aVar, "interactor");
        z65.h(k63Var, "domainEvents");
        z65.h(f63Var, "router");
        z65.h(wo2Var, "deepLinkHandler");
        z65.h(zt6Var, "nativeChatUnreadMessagesCount");
        z65.h(wt6Var, "nativeChatStateChecker");
        z65.h(qt6Var, "nativeChatInteractor");
        z65.h(zb3Var, "easyBonusInteractor");
        z65.h(y18Var, "personalToCollaborationVOConverter");
        z65.h(hq3Var, "featureService");
        z65.h(n56Var, "initialTab");
        z65.h(hl8Var, "productCardScreenFactory");
        z65.h(ih4Var, "googlePlayServicesHelper");
        z65.h(joVar, "appResourceLocalesFactory");
        this.a = aVar;
        this.b = k63Var;
        this.c = f63Var;
        this.d = wo2Var;
        this.e = zt6Var;
        this.f = wt6Var;
        this.g = qt6Var;
        this.h = zb3Var;
        this.i = y18Var;
        this.j = hq3Var;
        this.k = n56Var;
        this.l = hl8Var;
        this.m = ih4Var;
        this.n = joVar;
        this.o = LoggerFactory.getLogger("MainScreenPresenter");
    }

    private final void E() {
        o(wz3.h(wz3.F(this.n.a(), new a(null)), new b(null)));
    }

    private final void F(String str, cq8 cq8Var) {
        p(z77.a(y87.a(hy.a(new c(str, null)), new d(cq8Var, null)), new e(str, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        p(z77.a(y87.a(this.a.v(), new f(null)), new g(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String str, qd qdVar) {
        J();
        p(z77.a(y87.a(this.a.A(str), new h(str, qdVar, null)), new i(str, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        if (this.j.a(bq3.g7)) {
            this.c.e(vo8.a);
        } else {
            this.c.e(fo8.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(String str) {
        p(z77.a(y87.a(this.a.E(str), new j(null)), new k(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        if (!this.f.a()) {
            return;
        }
        p(z77.a(hy.a(new l(null)), new m(null)));
    }

    private final void N() {
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(qd6 qd6Var, v27 v27Var) {
        this.c.e(hl8.b(this.l, de6.b(qd6Var), qd6Var.f(), w27.a(v27Var), false, null, 24, null));
    }

    private final void P(String str, qd qdVar) {
        this.c.l(1, new FoodMenuPresenter.c(str, qdVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(String str, int i2, qd qdVar) {
        ej7 ej7Var = new ej7(str, qdVar, false, 4, null);
        if (this.m.a() && i2 == jk7.e.i() && this.j.a(bq3.r6)) {
            this.c.e(new o(false, new q(ej7Var)));
        } else {
            this.c.e(new p(false, new r(ej7Var)));
        }
    }

    private final void S(vo2 vo2Var) {
        if (vo2Var instanceof pl8) {
            pl8 pl8Var = (pl8) vo2Var;
            Y(pl8Var.c(), pl8Var.a(), pl8Var.b());
        } else if (vo2Var instanceof yk4) {
            yk4 yk4Var = (yk4) vo2Var;
            V(yk4Var.a(), yk4Var.b());
        } else if (vo2Var instanceof gra) {
            T((gra) vo2Var);
        } else if (vo2Var instanceof sp8) {
            sp8 sp8Var = (sp8) vo2Var;
            Z(sp8Var.c(), sp8Var.b(), sp8Var.a());
        } else if (vo2Var instanceof e69) {
            e69 e69Var = (e69) vo2Var;
            W(e69Var.a(), e69Var.b());
        } else if (vo2Var instanceof d5) {
            I(((d5) vo2Var).a(), ck1.j);
        } else if (vo2Var instanceof q08) {
            q08 q08Var = (q08) vo2Var;
            X(q08Var.a(), q08Var.b());
        } else if (vo2Var instanceof ut0) {
            ut0 ut0Var = (ut0) vo2Var;
            P(ut0Var.a(), ut0Var.b());
        } else if (vo2Var instanceof hw7) {
            L(((hw7) vo2Var).a());
        }
    }

    private final void T(gra graVar) {
        String b2 = graVar.b();
        cq8 a2 = graVar.a();
        if (graVar.c()) {
            F(b2, a2);
        } else {
            a0(b2, a2);
        }
    }

    private final void U() {
        p(z77.a(hy.a(new s(null)), new t(null)));
    }

    private final void V(String str, String str2) {
        this.c.e(new com.dodopizza.order.feature.halves.constructor.presentation.b(new ek4("", ym.d.e, new Pair(str, str2), ck1.j, false, 16, null)));
    }

    private final void W(String str, Integer num) {
        g69 g69Var;
        J();
        if (num == null) {
            g69Var = null;
        } else {
            g69Var = new g69(num.intValue());
        }
        g63.b(this.c, "order_rating_fragment", new eh7(str, g69Var, ck1.j));
    }

    private final void X(String str, h18 h18Var) {
        p(z77.a(y87.a(this.a.B(str), new u(h18Var, null)), new v(null)));
    }

    private final void Y(v27 v27Var, String str, String str2) {
        p(z77.a(y87.a(this.a.x(str, str2), new w(v27Var, null)), new x(str, null)));
    }

    private final void Z(cq8 cq8Var, String str, String str2) {
        Locale locale = Locale.getDefault();
        z65.g(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        z65.g(upperCase, "toUpperCase(...)");
        ((p56) getViewState()).A6(cq8Var, new ce0("", upperCase, str2, "", new xp(yp.d, str)));
    }

    private final void a0(String str, cq8 cq8Var) {
        p(z77.a(y87.a(this.a.C(str), new y(cq8Var, null)), new z(str, null)));
    }

    private final void b0() {
        o(wz3.F(this.b.c(), new a0(null)));
    }

    private final void c0() {
        o(wz3.F(new b0(this.b.c()), new c0(null)));
    }

    private final void d0() {
        o(wz3.h(wz3.F(this.e.a(), new d0(null)), new e0(null)));
    }

    public final void H(n56 n56Var) {
        z65.h(n56Var, "currentMenuTab");
        n56 n56Var2 = n56.a;
        if (n56Var != n56Var2) {
            ((p56) getViewState()).C7(n56Var2);
        } else {
            this.c.d();
        }
    }

    public final void K(n56 n56Var, boolean z2) {
        z65.h(n56Var, "tab");
        if (!z2) {
            ((p56) getViewState()).f8(n56Var);
        } else if (n56Var == n56.a) {
            ((p56) getViewState()).ad();
        }
    }

    public final void Q(vo2 vo2Var) {
        z65.h(vo2Var, "deepLinkData");
        try {
            S(vo2Var);
        } catch (Exception e2) {
            this.o.error("Failed to handle deeplink", (Throwable) e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        if (kq3.a(this.j)) {
            ((p56) getViewState()).g6();
        } else {
            ((p56) getViewState()).hd();
        }
        E();
        G();
        b0();
        ((p56) getViewState()).f8(this.k);
        ((p56) getViewState()).C7(this.k);
        U();
        N();
        M();
        c0();
        if (!this.j.a(bq3.J6)) {
            d0();
        }
    }
}
