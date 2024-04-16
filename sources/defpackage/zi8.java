package defpackage;

import android.app.Application;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: PresentationModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\n"}, d2 = {"Ll63;", "domainModule", "Lgo6;", "monitoringModule", "Lnm;", "apiModule", "Lwn;", "appContextModule", "Lyi8;", "a", "sdk_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: zi8  reason: default package */
/* loaded from: classes.dex */
public final class zi8 {

    /* compiled from: PresentationModule.kt */
    @Metadata(d1 = {"\u0000q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005R\u001b\u0010\u000b\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010$R\u0014\u0010)\u001a\u00020&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010/R\u0014\u00103\u001a\u0002018\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u00102¨\u00064"}, d2 = {"zi8$a", "Lyi8;", "Lnm;", "Ll63;", "Lgo6;", "Lwn;", "Lky4;", e.a, "Lrn5;", "l", "()Lky4;", "inAppMessageViewDisplayer", "Lfy4;", "f", "k", "()Lfy4;", "inAppMessageManager", "Lq91;", "g", "getClipboardManager", "()Lq91;", "clipboardManager", "Ln5;", Image.TYPE_HIGH, "j", "()Ln5;", "activityManager", "Lwc4;", DateTokenConverter.CONVERTER_KEY, "()Lwc4;", "gatewayManager", "Lox4;", "i", "()Lox4;", "inAppContentFetcher", "Ljm0;", "()Ljm0;", "callbackInteractor", "Lby4;", "b", "()Lby4;", "inAppInteractor", "Lco6;", com.huawei.hms.opendevice.c.a, "()Lco6;", "monitoringInteractor", "Lio6;", "()Lio6;", "monitoringRepository", "Landroid/app/Application;", "()Landroid/app/Application;", "appContext", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zi8$a */
    /* loaded from: classes.dex */
    public static final class a implements yi8, nm, l63, go6, wn {
        private final /* synthetic */ nm a;
        private final /* synthetic */ l63 b;
        private final /* synthetic */ go6 c;
        private final /* synthetic */ wn d;
        private final rn5 e;
        private final rn5 f;
        private final rn5 g;
        private final rn5 h;

        /* compiled from: PresentationModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo5;", "a", "()Lo5;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: zi8$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0765a extends ej5 implements Function0<o5> {
            C0765a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final o5 invoke() {
                return new o5(a.this.e(), a.this.h());
            }
        }

        /* compiled from: PresentationModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls91;", "a", "()Ls91;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: zi8$a$b */
        /* loaded from: classes.dex */
        static final class b extends ej5 implements Function0<s91> {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final s91 invoke() {
                return new s91(a.this.h());
            }
        }

        /* compiled from: PresentationModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfy4;", "a", "()Lfy4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: zi8$a$c */
        /* loaded from: classes.dex */
        static final class c extends ej5 implements Function0<fy4> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final fy4 invoke() {
                return new fy4(a.this.l(), a.this.b(), v33.b(), a.this.c());
            }
        }

        /* compiled from: PresentationModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lky4;", "a", "()Lky4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: zi8$a$d */
        /* loaded from: classes.dex */
        static final class d extends ej5 implements Function0<ky4> {
            public static final d a = new d();

            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final ky4 invoke() {
                return new ky4();
            }
        }

        a(nm nmVar, l63 l63Var, go6 go6Var, wn wnVar) {
            rn5 b2;
            rn5 b3;
            rn5 b4;
            rn5 b5;
            this.a = nmVar;
            this.b = l63Var;
            this.c = go6Var;
            this.d = wnVar;
            b2 = yn5.b(d.a);
            this.e = b2;
            b3 = yn5.b(new c());
            this.f = b3;
            b4 = yn5.b(new b());
            this.g = b4;
            b5 = yn5.b(new C0765a());
            this.h = b5;
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
            return this.a.d();
        }

        @Override // defpackage.l63
        public jm0 e() {
            return this.b.e();
        }

        @Override // defpackage.go6
        public io6 g() {
            return this.c.g();
        }

        @Override // defpackage.yi8
        public q91 getClipboardManager() {
            return (q91) this.g.getValue();
        }

        @Override // defpackage.wn
        public Application h() {
            return this.d.h();
        }

        @Override // defpackage.nm
        public ox4 i() {
            return this.a.i();
        }

        @Override // defpackage.yi8
        public n5 j() {
            return (n5) this.h.getValue();
        }

        @Override // defpackage.yi8
        /* renamed from: k */
        public fy4 a() {
            return (fy4) this.f.getValue();
        }

        public ky4 l() {
            return (ky4) this.e.getValue();
        }
    }

    public static final yi8 a(l63 l63Var, go6 go6Var, nm nmVar, wn wnVar) {
        z65.h(l63Var, "domainModule");
        z65.h(go6Var, "monitoringModule");
        z65.h(nmVar, "apiModule");
        z65.h(wnVar, "appContextModule");
        return new a(nmVar, l63Var, go6Var, wnVar);
    }
}
