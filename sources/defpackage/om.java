package defpackage;

import android.app.Application;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.android.volley.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ApiModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"Lwn;", "appContextModule", "Lnm;", "a", "sdk_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: om  reason: default package */
/* loaded from: classes.dex */
public final class om {

    /* compiled from: ApiModule.kt */
    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u0004\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\n\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"om$a", "Lnm;", "Lwn;", "Lwc4;", "b", "Lrn5;", DateTokenConverter.CONVERTER_KEY, "()Lwc4;", "gatewayManager", "Lgl6;", com.huawei.hms.opendevice.c.a, "()Lgl6;", "mindboxServiceGenerator", "Lcom/android/volley/e;", "()Lcom/android/volley/e;", "requestQueue", "Landroid/app/Application;", Image.TYPE_HIGH, "()Landroid/app/Application;", "appContext", "Lox4;", "i", "()Lox4;", "inAppContentFetcher", "Lay4;", "a", "()Lay4;", "inAppImageLoader", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: om$a */
    /* loaded from: classes.dex */
    public static final class a implements nm, wn {
        private final /* synthetic */ wn a;
        private final rn5 b;
        private final rn5 c;
        private final rn5 d;

        /* compiled from: ApiModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwc4;", "a", "()Lwc4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: om$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0462a extends ej5 implements Function0<wc4> {
            C0462a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final wc4 invoke() {
                return new wc4(a.this.b());
            }
        }

        /* compiled from: ApiModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgl6;", "a", "()Lgl6;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: om$a$b */
        /* loaded from: classes.dex */
        static final class b extends ej5 implements Function0<gl6> {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final gl6 invoke() {
                return new gl6(a.this.c());
            }
        }

        /* compiled from: ApiModule.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/android/volley/e;", "a", "()Lcom/android/volley/e;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: om$a$c */
        /* loaded from: classes.dex */
        static final class c extends ej5 implements Function0<e> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final e invoke() {
                e a = i2c.a(a.this.h());
                z65.g(a, "newRequestQueue(appContext)");
                return a;
            }
        }

        a(wn wnVar) {
            rn5 b2;
            rn5 b3;
            rn5 b4;
            this.a = wnVar;
            b2 = yn5.b(new C0462a());
            this.b = b2;
            b3 = yn5.b(new b());
            this.c = b3;
            b4 = yn5.b(new c());
            this.d = b4;
        }

        public ay4 a() {
            return new yx4(h());
        }

        public gl6 b() {
            return (gl6) this.c.getValue();
        }

        public e c() {
            return (e) this.d.getValue();
        }

        @Override // defpackage.nm
        public wc4 d() {
            return (wc4) this.b.getValue();
        }

        @Override // defpackage.wn
        public Application h() {
            return this.a.h();
        }

        @Override // defpackage.nm
        public ox4 i() {
            return new px4(a());
        }
    }

    public static final nm a(wn wnVar) {
        z65.h(wnVar, "appContextModule");
        return new a(wnVar);
    }
}
