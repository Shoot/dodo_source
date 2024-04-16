package defpackage;

import android.app.Application;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.monitoring.data.repositories.MonitoringRepositoryImpl;
import cloud.mindbox.mobile_sdk.monitoring.data.room.MonitoringDatabase;
import com.google.gson.Gson;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: MonitoringModule.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¨\u0006\b"}, d2 = {"Lwn;", "appContextModule", "Lnm;", "apiModule", "Lyk2;", "dataModule", "Lgo6;", "a", "sdk_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ho6  reason: default package */
/* loaded from: classes.dex */
public final class ho6 {

    /* compiled from: MonitoringModule.kt */
    @Metadata(d1 = {"\u0000¥\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\f\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0007\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0007\u001a\u0004\b#\u0010(R\u0014\u0010,\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010+R\u0014\u0010/\u001a\u00020-8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010.R\u0014\u00102\u001a\u0002008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u00101R\u0014\u00106\u001a\u0002038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"ho6$a", "Lgo6;", "Lwn;", "Lnm;", "Lyk2;", "Lfo6;", DateTokenConverter.CONVERTER_KEY, "Lrn5;", "l", "()Lfo6;", "monitoringMapper", "Lio6;", com.huawei.hms.push.e.a, "g", "()Lio6;", "monitoringRepository", "Lbx5;", "f", "b", "()Lbx5;", "logResponseDataManager", "Lvw5;", "a", "()Lvw5;", "logRequestDataManager", "Lfx5;", Image.TYPE_HIGH, "()Lfx5;", "logStoringDataChecker", "Lco6;", "i", com.huawei.hms.opendevice.c.a, "()Lco6;", "monitoringInteractor", "Lcloud/mindbox/mobile_sdk/monitoring/data/room/MonitoringDatabase;", "j", "k", "()Lcloud/mindbox/mobile_sdk/monitoring/data/room/MonitoringDatabase;", "monitoringDatabase", "Lzn6;", "()Lzn6;", "monitoringDao", "Landroid/app/Application;", "()Landroid/app/Application;", "appContext", "Lwc4;", "()Lwc4;", "gatewayManager", "Lox4;", "()Lox4;", "inAppContentFetcher", "Llm0;", "S0", "()Llm0;", "callbackRepository", "Lcom/google/gson/Gson;", "R0", "()Lcom/google/gson/Gson;", "gson", "Lwx4;", "U0", "()Lwx4;", "inAppGeoRepository", "Lwy4;", "T0", "()Lwy4;", "inAppRepository", "Lyy4;", "W0", "()Lyy4;", "inAppSegmentationRepository", "Lfm6;", "V0", "()Lfm6;", "mobileConfigRepository", "Lko6;", "X0", "()Lko6;", "monitoringValidator", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ho6$a */
    /* loaded from: classes.dex */
    public static final class a implements go6, wn, nm, yk2 {
        private final /* synthetic */ wn a;
        private final /* synthetic */ nm b;
        private final /* synthetic */ yk2 c;
        private final rn5 d;
        private final rn5 e;
        private final rn5 f;
        private final rn5 g;
        private final rn5 h;
        private final rn5 i;
        private final rn5 j;
        private final rn5 k;

        /* compiled from: MonitoringModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lww5;", "a", "()Lww5;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: ho6$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0350a extends ej5 implements Function0<ww5> {
            public static final C0350a a = new C0350a();

            C0350a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final ww5 invoke() {
                return new ww5();
            }
        }

        /* compiled from: MonitoringModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcx5;", "a", "()Lcx5;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: ho6$a$b */
        /* loaded from: classes.dex */
        static final class b extends ej5 implements Function0<cx5> {
            public static final b a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final cx5 invoke() {
                return new cx5();
            }
        }

        /* compiled from: MonitoringModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgx5;", "a", "()Lgx5;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: ho6$a$c */
        /* loaded from: classes.dex */
        static final class c extends ej5 implements Function0<gx5> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final gx5 invoke() {
                String F;
                StringBuilder sb = new StringBuilder();
                String absolutePath = a.this.h().getFilesDir().getAbsolutePath();
                z65.g(absolutePath, "appContext.filesDir.absolutePath");
                F = l0b.F(absolutePath, "files", "databases", false, 4, null);
                sb.append(F);
                sb.append("/MonitoringDatabase");
                return new gx5(new File(sb.toString()));
            }
        }

        /* compiled from: MonitoringModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzn6;", "a", "()Lzn6;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: ho6$a$d */
        /* loaded from: classes.dex */
        static final class d extends ej5 implements Function0<zn6> {
            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final zn6 invoke() {
                return a.this.k().E();
            }
        }

        /* compiled from: MonitoringModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcloud/mindbox/mobile_sdk/monitoring/data/room/MonitoringDatabase;", "a", "()Lcloud/mindbox/mobile_sdk/monitoring/data/room/MonitoringDatabase;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: ho6$a$e */
        /* loaded from: classes.dex */
        static final class e extends ej5 implements Function0<MonitoringDatabase> {
            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final MonitoringDatabase invoke() {
                return (MonitoringDatabase) tn9.a(a.this.h(), MonitoringDatabase.class, "MonitoringDatabase").e().b(MonitoringDatabase.p.a()).d();
            }
        }

        /* compiled from: MonitoringModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldo6;", "a", "()Ldo6;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: ho6$a$f */
        /* loaded from: classes.dex */
        static final class f extends ej5 implements Function0<do6> {
            f() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final do6 invoke() {
                return new do6(a.this.V0(), a.this.g(), a.this.b(), a.this.a());
            }
        }

        /* compiled from: MonitoringModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfo6;", "a", "()Lfo6;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: ho6$a$g */
        /* loaded from: classes.dex */
        static final class g extends ej5 implements Function0<fo6> {
            public static final g a = new g();

            g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final fo6 invoke() {
                return new fo6();
            }
        }

        /* compiled from: MonitoringModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcloud/mindbox/mobile_sdk/monitoring/data/repositories/MonitoringRepositoryImpl;", "a", "()Lcloud/mindbox/mobile_sdk/monitoring/data/repositories/MonitoringRepositoryImpl;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: ho6$a$h */
        /* loaded from: classes.dex */
        static final class h extends ej5 implements Function0<MonitoringRepositoryImpl> {
            h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final MonitoringRepositoryImpl invoke() {
                return new MonitoringRepositoryImpl(a.this.j(), a.this.l(), a.this.R0(), a.this.e(), a.this.X0(), a.this.d());
            }
        }

        a(wn wnVar, nm nmVar, yk2 yk2Var) {
            rn5 b2;
            rn5 b3;
            rn5 b4;
            rn5 b5;
            rn5 b6;
            rn5 b7;
            rn5 b8;
            rn5 b9;
            this.a = wnVar;
            this.b = nmVar;
            this.c = yk2Var;
            b2 = yn5.b(g.a);
            this.d = b2;
            b3 = yn5.b(new h());
            this.e = b3;
            b4 = yn5.b(b.a);
            this.f = b4;
            b5 = yn5.b(C0350a.a);
            this.g = b5;
            b6 = yn5.b(new c());
            this.h = b6;
            b7 = yn5.b(new f());
            this.i = b7;
            b8 = yn5.b(new e());
            this.j = b8;
            b9 = yn5.b(new d());
            this.k = b9;
        }

        @Override // defpackage.yk2
        public Gson R0() {
            return this.c.R0();
        }

        @Override // defpackage.yk2
        public lm0 S0() {
            return this.c.S0();
        }

        @Override // defpackage.yk2
        public wy4 T0() {
            return this.c.T0();
        }

        @Override // defpackage.yk2
        public wx4 U0() {
            return this.c.U0();
        }

        @Override // defpackage.yk2
        public fm6 V0() {
            return this.c.V0();
        }

        @Override // defpackage.yk2
        public yy4 W0() {
            return this.c.W0();
        }

        @Override // defpackage.yk2
        public ko6 X0() {
            return this.c.X0();
        }

        public vw5 a() {
            return (vw5) this.g.getValue();
        }

        public bx5 b() {
            return (bx5) this.f.getValue();
        }

        @Override // defpackage.go6
        public co6 c() {
            return (co6) this.i.getValue();
        }

        @Override // defpackage.nm
        public wc4 d() {
            return this.b.d();
        }

        public fx5 e() {
            return (fx5) this.h.getValue();
        }

        @Override // defpackage.go6
        public io6 g() {
            return (io6) this.e.getValue();
        }

        @Override // defpackage.wn
        public Application h() {
            return this.a.h();
        }

        @Override // defpackage.nm
        public ox4 i() {
            return this.b.i();
        }

        public zn6 j() {
            return (zn6) this.k.getValue();
        }

        public MonitoringDatabase k() {
            return (MonitoringDatabase) this.j.getValue();
        }

        public fo6 l() {
            return (fo6) this.d.getValue();
        }
    }

    public static final go6 a(wn wnVar, nm nmVar, yk2 yk2Var) {
        z65.h(wnVar, "appContextModule");
        z65.h(nmVar, "apiModule");
        z65.h(yk2Var, "dataModule");
        return new a(wnVar, nmVar, yk2Var);
    }
}
