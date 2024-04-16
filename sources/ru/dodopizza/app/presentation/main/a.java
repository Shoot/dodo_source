package ru.dodopizza.app.presentation.main;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.a79;
import defpackage.r75;
import defpackage.rs8;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: RawDeepLinksProcessor.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017BE\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020&\u0012\b\b\u0001\u0010+\u001a\u00020)\u0012\b\b\u0001\u0010.\u001a\u00020,¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0010\u001a\u00020\u00042\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R#\u00104\u001a\n 0*\u0004\u0018\u00010/0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t06058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00107R\u0014\u0010;\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010:¨\u0006>"}, d2 = {"Lru/dodopizza/app/presentation/main/a;", "Lr75;", "La79;", "rawDeepLinkData", "", "k", "deepLinkData", Image.TYPE_MEDIUM, "g", "Lru/dodopizza/app/presentation/main/a$a;", "command", com.huawei.hms.push.e.a, "f", "", "", "args", "o", "n", "Loz3;", "j", "i", "l", "Lgc;", "a", "Lgc;", "analytics", "Ly69;", "b", "Ly69;", "rawDeepLinkAnalyzer", "Lbv0;", com.huawei.hms.opendevice.c.a, "Lbv0;", "changeLocalityService", "Lok6;", DateTokenConverter.CONVERTER_KEY, "Lok6;", "mindboxPushInteractor", "Ln07;", "Ln07;", "notificationCancellation", "Lqx1;", "Lqx1;", "processScope", "Lkx1;", "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "Lfr6;", "", "Lfr6;", "commands", "", "()Z", "wasHandled", "<init>", "(Lgc;Ly69;Lbv0;Lok6;Ln07;Lqx1;Lkx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class a implements r75 {
    private final gc a;
    private final y69 b;
    private final bv0 c;
    private final ok6 d;
    private final n07 e;
    private final qx1 f;
    private final kx1 g;
    private final rn5 h;
    private final fr6<List<InterfaceC0572a>> i;

    /* compiled from: RawDeepLinksProcessor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/dodopizza/app/presentation/main/a$a;", "", "a", "b", "Lru/dodopizza/app/presentation/main/a$a$a;", "Lru/dodopizza/app/presentation/main/a$a$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.main.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0572a {

        /* compiled from: RawDeepLinksProcessor.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/main/a$a$a;", "Lru/dodopizza/app/presentation/main/a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "La79;", "a", "La79;", "()La79;", "data", "<init>", "(La79;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.main.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0573a implements InterfaceC0572a {
            private final a79 a;

            public C0573a(a79 a79Var) {
                z65.h(a79Var, "data");
                this.a = a79Var;
            }

            public final a79 a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0573a) && z65.c(this.a, ((C0573a) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                a79 a79Var = this.a;
                return "HandleDeepLink(data=" + a79Var + ")";
            }
        }

        /* compiled from: RawDeepLinksProcessor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/main/a$a$b;", "Lru/dodopizza/app/presentation/main/a$a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.main.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC0572a {
            public static final b a = new b();

            private b() {
            }
        }
    }

    /* compiled from: RawDeepLinksProcessor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("RawDeepLinksProcessor");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c implements oz3<InterfaceC0572a> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.main.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0574a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.main.RawDeepLinksProcessor$observeCommands$$inlined$map$1$2", f = "RawDeepLinksProcessor.kt", l = {223}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.main.a$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0575a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0575a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0574a.this.emit(null, this);
                }
            }

            public C0574a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.main.a.c.C0574a.C0575a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.main.a$c$a$a r0 = (ru.dodopizza.app.presentation.main.a.c.C0574a.C0575a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.main.a$c$a$a r0 = new ru.dodopizza.app.presentation.main.a$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Object r5 = defpackage.ic1.b0(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.main.a.c.C0574a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super InterfaceC0572a> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0574a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: RawDeepLinksProcessor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.RawDeepLinksProcessor$process$1", f = "RawDeepLinksProcessor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ a79 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a79 a79Var, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = a79Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                try {
                    a.this.k(this.c);
                } catch (Exception e) {
                    Logger h = a.this.h();
                    a79 a79Var = this.c;
                    h.error("Failed to process a deeplink: " + a79Var, (Throwable) e);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RawDeepLinksProcessor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.RawDeepLinksProcessor$sendPushTappedEvent$1", f = "RawDeepLinksProcessor.kt", l = {164}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(this.c, cv1Var);
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
                ok6 ok6Var = a.this.d;
                String str = this.c;
                this.a = 1;
                if (ok6Var.c(str, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RawDeepLinksProcessor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.main.RawDeepLinksProcessor$sendPushTappedEvent$2", f = "RawDeepLinksProcessor.kt", l = {}, m = "invokeSuspend")
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
                a.this.h().error("Can`t send push click event", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(gc gcVar, y69 y69Var, bv0 bv0Var, ok6 ok6Var, n07 n07Var, qx1 qx1Var, kx1 kx1Var) {
        rn5 b2;
        List l;
        z65.h(gcVar, "analytics");
        z65.h(y69Var, "rawDeepLinkAnalyzer");
        z65.h(bv0Var, "changeLocalityService");
        z65.h(ok6Var, "mindboxPushInteractor");
        z65.h(n07Var, "notificationCancellation");
        z65.h(qx1Var, "processScope");
        z65.h(kx1Var, "ioDispatcher");
        this.a = gcVar;
        this.b = y69Var;
        this.c = bv0Var;
        this.d = ok6Var;
        this.e = n07Var;
        this.f = qx1Var;
        this.g = kx1Var;
        b2 = yn5.b(b.a);
        this.h = b2;
        l = kc1.l();
        this.i = mua.a(l);
    }

    private final void e(InterfaceC0572a interfaceC0572a) {
        List<InterfaceC0572a> value;
        List<InterfaceC0572a> r0;
        fr6<List<InterfaceC0572a>> fr6Var = this.i;
        do {
            value = fr6Var.getValue();
            r0 = sc1.r0(value, interfaceC0572a);
        } while (!fr6Var.d(value, r0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = defpackage.k0b.k(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f(defpackage.a79 r2) {
        /*
            r1 = this;
            java.util.Map r2 = r2.a()
            java.lang.String r0 = "notification_id"
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L1d
            java.lang.Integer r2 = defpackage.c0b.k(r2)
            if (r2 == 0) goto L1d
            int r2 = r2.intValue()
            n07 r0 = r1.e
            r0.a(r2)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.main.a.f(a79):void");
    }

    private final void g() {
        List<InterfaceC0572a> l;
        fr6<List<InterfaceC0572a>> fr6Var = this.i;
        l = kc1.l();
        fr6Var.setValue(l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger h() {
        return (Logger) this.h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(a79 a79Var) {
        String str;
        g();
        gc gcVar = this.a;
        to2 to2Var = to2.a;
        String c2 = a79Var.c();
        a79.a b2 = a79Var.b();
        String str2 = null;
        if (b2 != null) {
            str = b2.a();
        } else {
            str = null;
        }
        a79.a b3 = a79Var.b();
        if (b3 != null) {
            str2 = b3.b();
        }
        gcVar.a(to2Var.a(c2, str, str2));
        m(a79Var);
        if (this.b.a(a79Var)) {
            f(a79Var);
            o(a79Var.a());
            n(a79Var);
        }
        e(new InterfaceC0572a.C0573a(a79Var));
    }

    private final void m(a79 a79Var) {
        String str = a79Var.f().get("localityId");
        String str2 = a79Var.f().get(LocalityEntity.FIELD_COUNTRY_CODE);
        if (str != null && str2 != null) {
            try {
                if (this.c.b(str, str2)) {
                    e(InterfaceC0572a.b.a);
                }
            } catch (Exception e2) {
                h().error("Failed to change a locality from a deeplink", (Throwable) e2);
            }
        }
    }

    private final void n(a79 a79Var) {
        Integer num;
        if (!z65.c(a79Var.d(), "orderRating")) {
            return;
        }
        String str = a79Var.f().get("ratingValue");
        if (str != null) {
            num = k0b.k(str);
        } else {
            num = null;
        }
        if (num != null) {
            this.a.a(rs8.a.k(num.intValue()));
        }
    }

    private final void o(Map<String, String> map) {
        String i0;
        String str = map.get("deeplink_uri_extra");
        String str2 = map.get("notification_title");
        String str3 = map.get("notification_text");
        String str4 = map.get("notification_sender");
        i0 = sc1.i0(map.entrySet(), ";", null, null, 0, null, null, 62, null);
        System.out.println((Object) ("sendPushTappedEvent " + i0));
        if (str != null && str4 != null) {
            this.a.a(new rs8.b(str, str2, str3, str4));
        }
        String str5 = map.get("mindbox_build_extra");
        if (str5 == null) {
            str5 = "";
        }
        if (str5.length() > 0) {
            wj1.b(z77.a(hy.a(new e(str5, null)), new f(null)), this.f);
        }
    }

    @Override // defpackage.r75
    public boolean a() {
        List<InterfaceC0572a> value = this.i.getValue();
        if ((value instanceof Collection) && value.isEmpty()) {
            return true;
        }
        for (InterfaceC0572a interfaceC0572a : value) {
            if (interfaceC0572a instanceof InterfaceC0572a.C0573a) {
                return false;
            }
        }
        return true;
    }

    public final void i(InterfaceC0572a interfaceC0572a) {
        List<InterfaceC0572a> value;
        List<InterfaceC0572a> p0;
        z65.h(interfaceC0572a, "command");
        fr6<List<InterfaceC0572a>> fr6Var = this.i;
        do {
            value = fr6Var.getValue();
            p0 = sc1.p0(value, interfaceC0572a);
        } while (!fr6Var.d(value, p0));
    }

    @Override // defpackage.r75
    public boolean invoke() {
        return r75.a.a(this);
    }

    public final oz3<InterfaceC0572a> j() {
        return wz3.t(wz3.o(new c(this.i)));
    }

    public final void l(a79 a79Var) {
        z65.h(a79Var, "rawDeepLinkData");
        sh0.d(this.f, this.g, null, new d(a79Var, null), 2, null);
    }
}
