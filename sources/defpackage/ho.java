package defpackage;

import android.app.Application;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: AppModule.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¨\u0006\u000e"}, d2 = {"Lwn;", "applicationContextModule", "Ll63;", "domainModule", "Lgo6;", "monitoringModule", "Lyi8;", "presentationModule", "Lyk2;", "dataModule", "Lnm;", "apiModule", "Lgo;", "a", "sdk_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ho  reason: default package */
/* loaded from: classes.dex */
public final class ho {

    /* compiled from: AppModule.kt */
    @Metadata(d1 = {"\u0000¯\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"ho$a", "Lgo;", "Lwn;", "Ll63;", "Lgo6;", "Lyi8;", "Lyk2;", "Lnm;", "", "f", "Landroid/app/Application;", Image.TYPE_HIGH, "()Landroid/app/Application;", "appContext", "Ljm0;", e.a, "()Ljm0;", "callbackInteractor", "Lby4;", "b", "()Lby4;", "inAppInteractor", "Lco6;", c.a, "()Lco6;", "monitoringInteractor", "Lio6;", "g", "()Lio6;", "monitoringRepository", "Ln5;", "j", "()Ln5;", "activityManager", "Lq91;", "getClipboardManager", "()Lq91;", "clipboardManager", "Ley4;", "a", "()Ley4;", "inAppMessageManager", "Llm0;", "S0", "()Llm0;", "callbackRepository", "Lcom/google/gson/Gson;", "R0", "()Lcom/google/gson/Gson;", "gson", "Lwx4;", "U0", "()Lwx4;", "inAppGeoRepository", "Lwy4;", "T0", "()Lwy4;", "inAppRepository", "Lyy4;", "W0", "()Lyy4;", "inAppSegmentationRepository", "Lfm6;", "V0", "()Lfm6;", "mobileConfigRepository", "Lko6;", "X0", "()Lko6;", "monitoringValidator", "Lwc4;", DateTokenConverter.CONVERTER_KEY, "()Lwc4;", "gatewayManager", "Lox4;", "i", "()Lox4;", "inAppContentFetcher", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ho$a */
    /* loaded from: classes.dex */
    public static final class a implements go, wn, l63, go6, yi8, yk2, nm {
        private final /* synthetic */ wn a;
        private final /* synthetic */ l63 b;
        private final /* synthetic */ go6 c;
        private final /* synthetic */ yi8 d;
        private final /* synthetic */ yk2 e;
        private final /* synthetic */ nm f;
        final /* synthetic */ wn g;

        /* compiled from: AppModule.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: ho$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0349a extends ej5 implements Function0<Boolean> {
            final /* synthetic */ wn a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0349a(wn wnVar) {
                super(0);
                this.a = wnVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf((this.a.h().getApplicationInfo().flags & 2) != 0);
            }
        }

        a(wn wnVar, l63 l63Var, go6 go6Var, yi8 yi8Var, yk2 yk2Var, nm nmVar) {
            this.g = wnVar;
            this.a = wnVar;
            this.b = l63Var;
            this.c = go6Var;
            this.d = yi8Var;
            this.e = yk2Var;
            this.f = nmVar;
        }

        @Override // defpackage.yk2
        public Gson R0() {
            return this.e.R0();
        }

        @Override // defpackage.yk2
        public lm0 S0() {
            return this.e.S0();
        }

        @Override // defpackage.yk2
        public wy4 T0() {
            return this.e.T0();
        }

        @Override // defpackage.yk2
        public wx4 U0() {
            return this.e.U0();
        }

        @Override // defpackage.yk2
        public fm6 V0() {
            return this.e.V0();
        }

        @Override // defpackage.yk2
        public yy4 W0() {
            return this.e.W0();
        }

        @Override // defpackage.yk2
        public ko6 X0() {
            return this.e.X0();
        }

        @Override // defpackage.yi8
        public ey4 a() {
            return this.d.a();
        }

        @Override // defpackage.l63
        public by4 b() {
            return this.b.b();
        }

        @Override // defpackage.go6
        public co6 c() {
            return this.c.c();
        }

        @Override // defpackage.nm
        public wc4 d() {
            return this.f.d();
        }

        @Override // defpackage.l63
        public jm0 e() {
            return this.b.e();
        }

        @Override // defpackage.go
        public boolean f() {
            return ((Boolean) yx5.a.b(Boolean.FALSE, new C0349a(this.g))).booleanValue();
        }

        @Override // defpackage.go6
        public io6 g() {
            return this.c.g();
        }

        @Override // defpackage.yi8
        public q91 getClipboardManager() {
            return this.d.getClipboardManager();
        }

        @Override // defpackage.wn
        public Application h() {
            return this.a.h();
        }

        @Override // defpackage.nm
        public ox4 i() {
            return this.f.i();
        }

        @Override // defpackage.yi8
        public n5 j() {
            return this.d.j();
        }
    }

    public static final go a(wn wnVar, l63 l63Var, go6 go6Var, yi8 yi8Var, yk2 yk2Var, nm nmVar) {
        z65.h(wnVar, "applicationContextModule");
        z65.h(l63Var, "domainModule");
        z65.h(go6Var, "monitoringModule");
        z65.h(yi8Var, "presentationModule");
        z65.h(yk2Var, "dataModule");
        z65.h(nmVar, "apiModule");
        return new a(wnVar, l63Var, go6Var, yi8Var, yk2Var, nmVar);
    }
}
