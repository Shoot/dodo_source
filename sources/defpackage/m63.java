package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.Gson;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: DomainModule.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"Lyk2;", "dataModule", "Lnm;", "apiModule", "Ll63;", "a", "sdk_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: m63  reason: default package */
/* loaded from: classes.dex */
public final class m63 {

    /* compiled from: DomainModule.kt */
    @Metadata(d1 = {"\u0000\u0091\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u001b\u0010\t\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u00100R\u0014\u00105\u001a\u0002028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010?R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"m63$a", "Ll63;", "Lyk2;", "Lnm;", "Lby4;", com.huawei.hms.opendevice.c.a, "Lrn5;", "b", "()Lby4;", "inAppInteractor", "Ljm0;", DateTokenConverter.CONVERTER_KEY, e.a, "()Ljm0;", "callbackInteractor", "Ljx4;", "g", "()Ljx4;", "inAppChoosingManager", "Llm0;", "S0", "()Llm0;", "callbackRepository", "Lcom/google/gson/Gson;", "R0", "()Lcom/google/gson/Gson;", "gson", "Lwx4;", "U0", "()Lwx4;", "inAppGeoRepository", "Lwy4;", "T0", "()Lwy4;", "inAppRepository", "Lyy4;", "W0", "()Lyy4;", "inAppSegmentationRepository", "Lfm6;", "V0", "()Lfm6;", "mobileConfigRepository", "Lko6;", "X0", "()Lko6;", "monitoringValidator", "Lwc4;", "()Lwc4;", "gatewayManager", "Lox4;", "i", "()Lox4;", "inAppContentFetcher", "Lrx4;", Image.TYPE_HIGH, "()Lrx4;", "inAppEventManager", "Lux4;", "j", "()Lux4;", "inAppFilteringManager", "Lgx4;", "()Lgx4;", "inAppABTestLogic", "Lo42;", "a", "()Lo42;", "customerAbMixer", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: m63$a */
    /* loaded from: classes.dex */
    public static final class a implements l63, yk2, nm {
        private final /* synthetic */ yk2 a;
        private final /* synthetic */ nm b;
        private final rn5 c;
        private final rn5 d;
        private final rn5 e;

        /* compiled from: DomainModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkm0;", "a", "()Lkm0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: m63$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0432a extends ej5 implements Function0<km0> {
            C0432a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final km0 invoke() {
                return new km0(a.this.S0());
            }
        }

        /* compiled from: DomainModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkx4;", "a", "()Lkx4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: m63$a$b */
        /* loaded from: classes.dex */
        static final class b extends ej5 implements Function0<kx4> {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final kx4 invoke() {
                return new kx4(a.this.U0(), a.this.W0(), a.this.i());
            }
        }

        /* compiled from: DomainModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcy4;", "a", "()Lcy4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: m63$a$c */
        /* loaded from: classes.dex */
        static final class c extends ej5 implements Function0<cy4> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final cy4 invoke() {
                return new cy4(a.this.V0(), a.this.T0(), a.this.W0(), a.this.j(), a.this.h(), a.this.g(), a.this.c());
            }
        }

        a(yk2 yk2Var, nm nmVar) {
            rn5 b2;
            rn5 b3;
            rn5 b4;
            this.a = yk2Var;
            this.b = nmVar;
            b2 = yn5.b(new c());
            this.c = b2;
            b3 = yn5.b(new C0432a());
            this.d = b3;
            b4 = yn5.b(new b());
            this.e = b4;
        }

        @Override // defpackage.yk2
        public Gson R0() {
            return this.a.R0();
        }

        @Override // defpackage.yk2
        public lm0 S0() {
            return this.a.S0();
        }

        @Override // defpackage.yk2
        public wy4 T0() {
            return this.a.T0();
        }

        @Override // defpackage.yk2
        public wx4 U0() {
            return this.a.U0();
        }

        @Override // defpackage.yk2
        public fm6 V0() {
            return this.a.V0();
        }

        @Override // defpackage.yk2
        public yy4 W0() {
            return this.a.W0();
        }

        @Override // defpackage.yk2
        public ko6 X0() {
            return this.a.X0();
        }

        public o42 a() {
            return new q42();
        }

        @Override // defpackage.l63
        public by4 b() {
            return (by4) this.c.getValue();
        }

        public gx4 c() {
            return new gx4(a(), V0());
        }

        @Override // defpackage.nm
        public wc4 d() {
            return this.b.d();
        }

        @Override // defpackage.l63
        public jm0 e() {
            return (jm0) this.d.getValue();
        }

        public jx4 g() {
            return (jx4) this.e.getValue();
        }

        public rx4 h() {
            return new sx4();
        }

        @Override // defpackage.nm
        public ox4 i() {
            return this.b.i();
        }

        public ux4 j() {
            return new vx4(T0());
        }
    }

    public static final l63 a(yk2 yk2Var, nm nmVar) {
        z65.h(yk2Var, "dataModule");
        z65.h(nmVar, "apiModule");
        return new a(yk2Var, nmVar);
    }
}
