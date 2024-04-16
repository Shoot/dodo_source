package defpackage;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.main.a;
import ru.dodopizza.mindbox.model.MindboxPayload;
/* compiled from: DeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001#Ba\b\u0007\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00100\u001a\u00020.\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010@\u001a\u00020>\u0012\u0006\u0010C\u001a\u00020A\u0012\u0006\u0010F\u001a\u00020D¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010 \u001a\u00020\u0004H\u0086@¢\u0006\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER#\u0010K\u001a\n H*\u0004\u0018\u00010G0G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\b2\u0010J¨\u0006N"}, d2 = {"Lwo2;", "", "La79;", "rawDeepLinkData", "", "z", "B", "C", "", "host", "", "f", DateTokenConverter.CONVERTER_KEY, "y", "o", "k", Image.TYPE_SMALL, "l", "p", "n", "u", "v", Image.TYPE_HIGH, "g", "r", "w", "j", "x", "q", "t", "i", Image.TYPE_MEDIUM, "A", "(Lcv1;)Ljava/lang/Object;", "Lbo;", "a", "Lbo;", "appInitializationStateProvider", "Lru/dodopizza/app/presentation/main/a;", "b", "Lru/dodopizza/app/presentation/main/a;", "rawDeepLinksProcessor", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Li00;", "Li00;", "authorizationState", "Lwt6;", com.huawei.hms.push.e.a, "Lwt6;", "nativeChatStateChecker", "Lmk6;", "Lmk6;", "mindboxPayloadParser", "Lkz4;", "Lkz4;", "inAppStoryNavigator", "Ly69;", "Ly69;", "rawDeepLinkAnalyzer", "Lf1b;", "Lf1b;", "subscribeToNewsInteractor", "Lhq3;", "Lhq3;", "featureService", "Lwo2$a;", "Lwo2$a;", "kioskOrderStatusUrlBuilder", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lbo;Lru/dodopizza/app/presentation/main/a;Lf63;Li00;Lwt6;Lmk6;Lkz4;Ly69;Lf1b;Lhq3;Lwo2$a;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: wo2  reason: default package */
/* loaded from: classes3.dex */
public final class wo2 {
    private final bo a;
    private final ru.dodopizza.app.presentation.main.a b;
    private final f63 c;
    private final i00 d;
    private final wt6 e;
    private final mk6 f;
    private final kz4 g;
    private final y69 h;
    private final f1b i;
    private final hq3 j;
    private final a k;
    private final rn5 l;

    /* compiled from: DeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lwo2$a;", "", "", "countryId", "orderId", "", "orderNumber", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "Ls80;", "Ls80;", "baseUrlService", "<init>", "(Ls80;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wo2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final s80 a;

        public a(s80 s80Var) {
            z65.h(s80Var, "baseUrlService");
            this.a = s80Var;
        }

        public final String a(String str, String str2, Integer num) {
            z65.h(str, "countryId");
            z65.h(str2, "orderId");
            Uri.Builder appendQueryParameter = Uri.parse(this.a.a()).buildUpon().path("order-status.html").appendQueryParameter("countryId", str).appendQueryParameter("orderId", str2);
            if (num != null) {
                appendQueryParameter.appendQueryParameter("orderNumber", num.toString());
            }
            String uri = appendQueryParameter.build().toString();
            z65.g(uri, "toString(...)");
            return uri;
        }
    }

    /* compiled from: DeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wo2$b */
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("DeepLinkHandler");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wo2$c */
    /* loaded from: classes3.dex */
    public static final class c implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: wo2$c$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.application.subnavigation.routing.DeepLinkHandler$processDeepLinks$$inlined$filterIsInstance$1$2", f = "DeepLinkHandler.kt", l = {224}, m = "emit")
            /* renamed from: wo2$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0725a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0725a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof defpackage.wo2.c.a.C0725a
                    if (r0 == 0) goto L13
                    r0 = r6
                    wo2$c$a$a r0 = (defpackage.wo2.c.a.C0725a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    wo2$c$a$a r0 = new wo2$c$a$a
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
                    boolean r2 = r5 instanceof ru.dodopizza.app.presentation.main.a.InterfaceC0572a.C0573a
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wo2.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.application.subnavigation.routing.DeepLinkHandler", f = "DeepLinkHandler.kt", l = {75, 86}, m = "processDeepLinks")
    /* renamed from: wo2$d */
    /* loaded from: classes3.dex */
    public static final class d extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        d(cv1<? super d> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return wo2.this.A(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/presentation/main/a$a$a;", "command", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.application.subnavigation.routing.DeepLinkHandler$processDeepLinks$2", f = "DeepLinkHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wo2$e */
    /* loaded from: classes3.dex */
    public static final class e extends f3b implements Function2<a.InterfaceC0572a.C0573a, cv1<? super Unit>, Object> {
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
        public final Object invoke(a.InterfaceC0572a.C0573a c0573a, cv1<? super Unit> cv1Var) {
            return ((e) create(c0573a, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.InterfaceC0572a.C0573a c0573a = (a.InterfaceC0572a.C0573a) this.b;
                wo2.this.z(c0573a.a());
                wo2.this.b.i(c0573a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lru/dodopizza/app/presentation/main/a$a$a;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.application.subnavigation.routing.DeepLinkHandler$processDeepLinks$3", f = "DeepLinkHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wo2$f */
    /* loaded from: classes3.dex */
    public static final class f extends f3b implements y84<pz3<? super a.InterfaceC0572a.C0573a>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super a.InterfaceC0572a.C0573a> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                wo2.this.e().error("Failed to handle a deep link", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public wo2(bo boVar, ru.dodopizza.app.presentation.main.a aVar, f63 f63Var, i00 i00Var, wt6 wt6Var, mk6 mk6Var, kz4 kz4Var, y69 y69Var, f1b f1bVar, hq3 hq3Var, a aVar2) {
        rn5 b2;
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(aVar, "rawDeepLinksProcessor");
        z65.h(f63Var, "router");
        z65.h(i00Var, "authorizationState");
        z65.h(wt6Var, "nativeChatStateChecker");
        z65.h(mk6Var, "mindboxPayloadParser");
        z65.h(kz4Var, "inAppStoryNavigator");
        z65.h(y69Var, "rawDeepLinkAnalyzer");
        z65.h(f1bVar, "subscribeToNewsInteractor");
        z65.h(hq3Var, "featureService");
        z65.h(aVar2, "kioskOrderStatusUrlBuilder");
        this.a = boVar;
        this.b = aVar;
        this.c = f63Var;
        this.d = i00Var;
        this.e = wt6Var;
        this.f = mk6Var;
        this.g = kz4Var;
        this.h = y69Var;
        this.i = f1bVar;
        this.j = hq3Var;
        this.k = aVar2;
        b2 = yn5.b(b.a);
        this.l = b2;
    }

    private final void B(a79 a79Var) {
        String d2 = a79Var.d();
        switch (d2.hashCode()) {
            case -2008328827:
                if (d2.equals("subscribePersonalPromo")) {
                    x();
                    return;
                }
                break;
            case -1715380185:
                if (d2.equals("referralProgram")) {
                    u();
                    return;
                }
                break;
            case -1615925444:
                if (d2.equals("payment-success")) {
                    q(a79Var);
                    return;
                }
                break;
            case -1279757021:
                if (d2.equals("specialOffer")) {
                    v(a79Var);
                    return;
                }
                break;
            case -1173302852:
                if (d2.equals("kioskOrderTracking")) {
                    m(a79Var);
                    return;
                }
                break;
            case -309474065:
                if (d2.equals("product")) {
                    s(a79Var);
                    return;
                }
                break;
            case -309425751:
                if (d2.equals("profile")) {
                    t();
                    return;
                }
                break;
            case 3046176:
                if (d2.equals("cart")) {
                    i();
                    return;
                }
                break;
            case 3052376:
                if (d2.equals("chat")) {
                    k();
                    return;
                }
                break;
            case 3347807:
                if (d2.equals("menu")) {
                    o();
                    return;
                }
                break;
            case 50511102:
                if (d2.equals("category")) {
                    j(a79Var);
                    return;
                }
                break;
            case 106006350:
                if (d2.equals(BonusActionEntity.ORDER)) {
                    g(a79Var);
                    return;
                }
                break;
            case 109770997:
                if (d2.equals("story")) {
                    w(a79Var);
                    return;
                }
                break;
            case 367039479:
                if (d2.equals("personalOffers")) {
                    r(a79Var);
                    return;
                }
                break;
            case 1113071289:
                if (d2.equals("pizzahalves")) {
                    l(a79Var);
                    return;
                }
                break;
            case 1256110789:
                if (d2.equals("loyaltyMenu")) {
                    n(a79Var);
                    return;
                }
                break;
            case 1584460427:
                if (d2.equals("orderRating")) {
                    p(a79Var);
                    return;
                }
                break;
            case 1671155662:
                if (d2.equals("applypromocode")) {
                    h(a79Var);
                    return;
                }
                break;
        }
        y();
    }

    private final void C(a79 a79Var) {
        if (f(a79Var.d())) {
            this.c.e(com.dodopizza.feature.webinfo.presentation.d.a(new com.dodopizza.feature.webinfo.presentation.a(d(a79Var), a79Var.c(), (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
        }
    }

    private final String d(a79 a79Var) {
        MindboxPayload a2;
        String str = a79Var.a().get("mindbox_payload_extra");
        if (str != null && (a2 = this.f.a(str)) != null) {
            return a2.getWebViewTitle();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger e() {
        return (Logger) this.l.getValue();
    }

    private final boolean f(String str) {
        String[] a2;
        boolean u;
        for (String str2 : uo2.a.a()) {
            if (!z65.c(str, str2)) {
                u = l0b.u(str, "." + str2, false, 2, null);
                if (!u) {
                }
            }
            return true;
        }
        return false;
    }

    private final void g(a79 a79Var) {
        this.c.c(h56.a(new d5(a79Var.e())));
    }

    private final void h(a79 a79Var) {
        String e2 = a79Var.e();
        String str = a79Var.a().get("mindbox_message_extra");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = a79Var.a().get("notification_sender");
        if (str3 != null) {
            str2 = str3;
        }
        cq8 a2 = cq8.b.a(str2, cq8.c);
        this.c.c(i56.a(n56.a));
        this.c.c(h56.a(new sp8(a2, e2, str)));
    }

    private final void i() {
        this.c.c(i56.a(n56.c));
    }

    private final void j(a79 a79Var) {
        String e2 = a79Var.e();
        String str = a79Var.a().get("notification_sender");
        if (str == null) {
            str = "";
        }
        v27 a2 = v27.b.a(str, v27.c);
        this.c.c(i56.a(n56.a));
        this.c.c(h56.a(new ut0(e2, a2)));
    }

    private final void k() {
        if (this.d.b() && this.e.a()) {
            this.c.e(ut6.a());
        }
    }

    private final void l(a79 a79Var) {
        String str = a79Var.f().get(ElementGenerator.TEXT_ALIGN_LEFT);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = a79Var.f().get(ElementGenerator.TEXT_ALIGN_RIGHT);
        if (str3 != null) {
            str2 = str3;
        }
        this.c.c(i56.a(n56.a));
        this.c.c(h56.a(new yk4(str, str2)));
    }

    private final void m(a79 a79Var) {
        Integer num;
        a.b bVar;
        String str = a79Var.f().get("countryId");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = a79Var.f().get("orderId");
        if (str3 != null) {
            str2 = str3;
        }
        if (this.j.a(bq3.C6) && str.length() != 0 && str2.length() != 0) {
            String str4 = a79Var.f().get("orderNumber");
            if (str4 != null) {
                num = k0b.k(str4);
            } else {
                num = null;
            }
            if (num != null) {
                bVar = new a.b.c(num.intValue());
            } else {
                bVar = a.b.C0126b.a;
            }
            a.b bVar2 = bVar;
            this.c.e(com.dodopizza.feature.webinfo.presentation.d.a(new com.dodopizza.feature.webinfo.presentation.a(this.k.a(str, str2, num), bVar2, (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
            return;
        }
        t();
    }

    private final void n(a79 a79Var) {
        String str = a79Var.f().get("categoryId");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = a79Var.a().get("notification_sender");
        if (str3 != null) {
            str2 = str3;
        }
        this.c.e(new w26(new e06(sba.b(v27.b.a(str2, v27.f)), str)));
    }

    private final void o() {
        this.c.c(i56.a(n56.a));
    }

    private final void p(a79 a79Var) {
        Integer k;
        String str = a79Var.f().get("orderId");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = a79Var.f().get("ratingValue");
        if (str3 != null) {
            str2 = str3;
        }
        k = k0b.k(str2);
        this.c.c(h56.a(new e69(str, k)));
    }

    private final void q(a79 a79Var) {
        String str = a79Var.f().get("workflow");
        if (str == null) {
            str = "";
        }
        this.c.c(new g8c("checkout_dialog_fragment", new hw7(str), false, 4, null));
    }

    private final void r(a79 a79Var) {
        String str = a79Var.a().get("notification_sender");
        if (str == null) {
            str = "";
        }
        v27 a2 = v27.b.a(str, v27.f);
        String e2 = a79Var.e();
        this.c.c(i56.a(n56.a));
        this.c.c(h56.a(new q08(e2, i18.a(a2))));
    }

    private final void s(a79 a79Var) {
        String e2 = a79Var.e();
        String str = a79Var.f().get("selectProducts");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = a79Var.a().get("notification_sender");
        if (str3 != null) {
            str2 = str3;
        }
        v27 a2 = v27.b.a(str2, v27.h);
        this.c.c(i56.a(n56.a));
        this.c.c(h56.a(new pl8(a2, e2, str)));
    }

    private final void t() {
        if (this.j.a(bq3.g7)) {
            this.c.e(vo8.a);
        } else {
            this.c.e(fo8.a);
        }
    }

    private final void u() {
        if (this.j.a(bq3.k6) && this.d.b()) {
            this.c.e(ub9.a);
        } else {
            t();
        }
    }

    private final void v(a79 a79Var) {
        cq8 cq8Var;
        String e2 = a79Var.e();
        boolean parseBoolean = Boolean.parseBoolean(a79Var.f().get("easyBonus"));
        if (this.h.a(a79Var)) {
            cq8Var = cq8.c;
        } else {
            cq8Var = cq8.d;
        }
        this.c.c(i56.a(n56.a));
        this.c.c(h56.a(new gra(e2, parseBoolean, cq8Var)));
    }

    private final void w(a79 a79Var) {
        this.c.e(new mz4(this.g, a79Var.e()));
    }

    private final void x() {
        this.i.e(zx6.e);
    }

    private final void y() {
        this.c.c(i56.a(n56.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(a79 a79Var) {
        String g = a79Var.g();
        if (z65.c(g, "dodo")) {
            B(a79Var);
        } else if (z65.c(g, "https")) {
            C(a79Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wo2.d
            if (r0 == 0) goto L13
            r0 = r7
            wo2$d r0 = (defpackage.wo2.d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wo2$d r0 = new wo2$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.vk9.b(r7)
            goto L76
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.a
            wo2 r2 = (defpackage.wo2) r2
            defpackage.vk9.b(r7)
            goto L4d
        L3c:
            defpackage.vk9.b(r7)
            bo r7 = r6.a
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = defpackage.co.b(r7, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r6
        L4d:
            ru.dodopizza.app.presentation.main.a r7 = r2.b
            oz3 r7 = r7.j()
            wo2$c r4 = new wo2$c
            r4.<init>(r7)
            wo2$e r7 = new wo2$e
            r5 = 0
            r7.<init>(r5)
            oz3 r7 = defpackage.wz3.F(r4, r7)
            wo2$f r4 = new wo2$f
            r4.<init>(r5)
            oz3 r7 = defpackage.wz3.h(r7, r4)
            r0.a = r5
            r0.d = r3
            java.lang.Object r7 = defpackage.wz3.k(r7, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo2.A(cv1):java.lang.Object");
    }
}
