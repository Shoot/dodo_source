package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.firebase.messaging.FirebaseMessaging;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sk9;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: FirebaseServiceHandler.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lvx3;", "Lrt8;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", Image.TYPE_HIGH, "", "g", "(Landroid/content/Context;Lcv1;)Ljava/lang/Object;", "Lkotlin/Pair;", "", DateTokenConverter.CONVERTER_KEY, "", "logParent", "b", "i", "Lek6;", "Lek6;", "logger", "Lux3;", com.huawei.hms.opendevice.c.a, "Lux3;", "messageTransformer", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "notificationProvider", "Lol3;", "exceptionHandler", "<init>", "(Lek6;Lol3;)V", "mindbox-firebase_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vx3  reason: default package */
/* loaded from: classes.dex */
public final class vx3 extends rt8 {
    private final ek6 b;
    private final ux3 c;
    private final String d;

    /* compiled from: FirebaseServiceHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: vx3$a */
    /* loaded from: classes.dex */
    static final class a implements l77 {
        final /* synthetic */ fn0<String> a;

        /* JADX WARN: Multi-variable type inference failed */
        a(fn0<? super String> fn0Var) {
            this.a = fn0Var;
        }

        @Override // defpackage.l77
        public final void a() {
            fn0<String> fn0Var = this.a;
            sk9.a aVar = sk9.b;
            fn0Var.resumeWith(sk9.b(vk9.a(new CancellationException())));
        }
    }

    /* compiled from: FirebaseServiceHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "token", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vx3$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<String, Unit> {
        final /* synthetic */ fn0<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(fn0<? super String> fn0Var) {
            super(1);
            this.a = fn0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            this.a.resumeWith(sk9.b(str));
        }
    }

    /* compiled from: FirebaseServiceHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vx3$d */
    /* loaded from: classes.dex */
    static final class d implements a97 {
        private final /* synthetic */ Function1 a;

        d(Function1 function1) {
            z65.h(function1, "function");
            this.a = function1;
        }

        @Override // defpackage.a97
        public final /* synthetic */ void onSuccess(Object obj) {
            this.a.invoke(obj);
        }
    }

    public vx3(ek6 ek6Var, ol3 ol3Var) {
        z65.h(ek6Var, "logger");
        z65.h(ol3Var, "exceptionHandler");
        this.b = ek6Var;
        this.c = new ux3(ol3Var);
        this.d = "FCM";
    }

    @Override // defpackage.rt8
    public void b(Context context, Object obj) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(obj, "logParent");
    }

    @Override // defpackage.rt8
    public Pair<String, Boolean> d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        z65.g(advertisingIdInfo, "getAdvertisingIdInfo(context)");
        return lnb.a(advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
    }

    @Override // defpackage.rt8
    public String f() {
        return this.d;
    }

    @Override // defpackage.rt8
    protected Object g(Context context, cv1<? super String> cv1Var) {
        cv1 c2;
        Object d2;
        c2 = b75.c(cv1Var);
        final gn0 gn0Var = new gn0(c2, 1);
        gn0Var.w();
        FirebaseMessaging.l().o().a(new a(gn0Var)).g(new d(new b(gn0Var))).e(new a87() { // from class: vx3.c
            @Override // defpackage.a87
            /* renamed from: a */
            public final void onFailure(Throwable th) {
                z65.h(th, "p0");
                fn0<String> fn0Var = gn0Var;
                sk9.a aVar = sk9.b;
                fn0Var.resumeWith(sk9.b(vk9.a(th)));
            }
        });
        Object s = gn0Var.s();
        d2 = c75.d();
        if (s == d2) {
            io2.c(cv1Var);
        }
        return s;
    }

    @Override // defpackage.rt8
    public void h(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        qv3.q(context);
    }

    @Override // defpackage.rt8
    protected boolean i(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (com.google.android.gms.common.a.m().g(context) == 0) {
            return true;
        }
        return false;
    }
}
