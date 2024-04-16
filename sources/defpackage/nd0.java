package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: BlockStoreInteractor.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0001\u0010!\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R#\u0010&\u001a\n #*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b\u001c\u0010%¨\u0006)"}, d2 = {"Lnd0;", "", "", "g", "(Lcv1;)Ljava/lang/Object;", "", Image.TYPE_HIGH, "Lpd0;", "a", "Lpd0;", "blockStoreService", "Ljv5;", "b", "Ljv5;", "localityService", "Lg00;", com.huawei.hms.opendevice.c.a, "Lg00;", "authorizationService", "Ldq3;", DateTokenConverter.CONVERTER_KEY, "Ldq3;", "featureInteractor", "Lcva;", e.a, "Lcva;", "stateRepository", "Lkx1;", "f", "Lkx1;", "ioDispatcher", "Lqx1;", "Lqx1;", "processScope", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lpd0;Ljv5;Lg00;Ldq3;Lcva;Lkx1;Lqx1;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nd0  reason: default package */
/* loaded from: classes4.dex */
public final class nd0 {
    private final pd0 a;
    private final jv5 b;
    private final g00 c;
    private final dq3 d;
    private final cva e;
    private final kx1 f;
    private final qx1 g;
    private final rn5 h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BlockStoreInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.blockstore.BlockStoreInteractor$initUserData$2", f = "BlockStoreInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nd0$a */
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                boolean z = false;
                if (!nd0.this.a.a()) {
                    return nf0.a(false);
                }
                return nf0.a((nd0.this.b.c() || nd0.this.c.e() || nd0.this.e.f()) ? true : true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: BlockStoreInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nd0$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<Logger> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("BlockStoreInteractor");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BlockStoreInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isEnabled", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.blockstore.BlockStoreInteractor$startFeatureStateObserving$1", f = "BlockStoreInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nd0$c */
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
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
                nd0.this.a.b(this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BlockStoreInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.domain.blockstore.BlockStoreInteractor$startFeatureStateObserving$2", f = "BlockStoreInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nd0$d */
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements y84<pz3<? super Boolean>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Boolean> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = th;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                nd0.this.f().error("Failed to save BlockStore feature state", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public nd0(pd0 pd0Var, jv5 jv5Var, g00 g00Var, dq3 dq3Var, cva cvaVar, kx1 kx1Var, qx1 qx1Var) {
        rn5 b2;
        z65.h(pd0Var, "blockStoreService");
        z65.h(jv5Var, "localityService");
        z65.h(g00Var, "authorizationService");
        z65.h(dq3Var, "featureInteractor");
        z65.h(cvaVar, "stateRepository");
        z65.h(kx1Var, "ioDispatcher");
        z65.h(qx1Var, "processScope");
        this.a = pd0Var;
        this.b = jv5Var;
        this.c = g00Var;
        this.d = dq3Var;
        this.e = cvaVar;
        this.f = kx1Var;
        this.g = qx1Var;
        b2 = yn5.b(b.a);
        this.h = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger f() {
        return (Logger) this.h.getValue();
    }

    public final Object g(cv1<? super Boolean> cv1Var) {
        return qh0.g(this.f, new a(null), cv1Var);
    }

    public final void h() {
        wz3.C(wz3.B(wz3.h(wz3.F(this.d.h(bq3.D6), new c(null)), new d(null)), this.f), this.g);
    }
}
