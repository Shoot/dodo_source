package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HuaweiServiceHandler.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lxq4;", "Lrt8;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "kotlin.jvm.PlatformType", Image.TYPE_MEDIUM, "", Image.TYPE_HIGH, "g", "(Landroid/content/Context;Lcv1;)Ljava/lang/Object;", "Lkotlin/Pair;", "", DateTokenConverter.CONVERTER_KEY, "", "logParent", "b", "i", "Lek6;", "Lek6;", "logger", "Lwq4;", c.a, "Lwq4;", "messageTransformer", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "notificationProvider", "Lol3;", "exceptionHandler", "<init>", "(Lek6;Lol3;)V", e.a, "a", "mindbox-huawei_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xq4  reason: default package */
/* loaded from: classes.dex */
public final class xq4 extends rt8 {
    public static final a e = new a(null);
    private final ek6 b;
    private final wq4 c;
    private final String d;

    /* compiled from: HuaweiServiceHandler.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lxq4$a;", "", "", "HMS_APP_ID_KEY", "Ljava/lang/String;", "HMS_TOKEN_SCOPE", "", "TOKEN_ACQUISITION_DELAY", "J", "<init>", "()V", "mindbox-huawei_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: xq4$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HuaweiServiceHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mindbox_huawei.HuaweiServiceHandler", f = "HuaweiServiceHandler.kt", l = {43}, m = "getToken")
    /* renamed from: xq4$b */
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return xq4.this.g(null, this);
        }
    }

    public xq4(ek6 ek6Var, ol3 ol3Var) {
        z65.h(ek6Var, "logger");
        z65.h(ol3Var, "exceptionHandler");
        this.b = ek6Var;
        this.c = new wq4(ol3Var);
        this.d = HmsMessaging.DEFAULT_TOKEN_SCOPE;
    }

    private final String m(Context context) {
        return new y().a(context).a("client/app_id");
    }

    @Override // defpackage.rt8
    public void b(Context context, Object obj) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(obj, "logParent");
    }

    @Override // defpackage.rt8
    public Pair<String, Boolean> d(Context context) {
        String str;
        boolean z;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        if (advertisingIdInfo == null) {
            ek6 ek6Var = this.b;
            ek6Var.a(this, "Cannot retrieve " + f() + " AdvertisingIdClient.Info");
        }
        if (advertisingIdInfo != null) {
            str = advertisingIdInfo.getId();
        } else {
            str = null;
        }
        if (advertisingIdInfo != null) {
            z = advertisingIdInfo.isLimitAdTrackingEnabled();
        } else {
            z = false;
        }
        return lnb.a(str, Boolean.valueOf(z));
    }

    @Override // defpackage.rt8
    public String f() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    @Override // defpackage.rt8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object g(android.content.Context r7, defpackage.cv1<? super java.lang.String> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.xq4.b
            if (r0 == 0) goto L13
            r0 = r8
            xq4$b r0 = (defpackage.xq4.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            xq4$b r0 = new xq4$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            java.lang.String r3 = "HCM"
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r7 = r0.b
            com.huawei.hms.aaid.HmsInstanceId r7 = (com.huawei.hms.aaid.HmsInstanceId) r7
            java.lang.Object r0 = r0.a
            java.lang.String r0 = (java.lang.String) r0
            defpackage.vk9.b(r8)
            goto L66
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            defpackage.vk9.b(r8)
            java.lang.String r8 = r6.m(r7)
            com.huawei.hms.aaid.HmsInstanceId r7 = com.huawei.hms.aaid.HmsInstanceId.getInstance(r7)
            java.lang.String r2 = r7.getToken(r8, r3)
            if (r2 == 0) goto L56
            int r5 = r2.length()
            if (r5 <= 0) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            if (r2 != 0) goto L6a
        L56:
            r0.a = r8
            r0.b = r7
            r0.e = r4
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = defpackage.xt2.a(r4, r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            r0 = r8
        L66:
            java.lang.String r2 = r7.getToken(r0, r3)
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq4.g(android.content.Context, cv1):java.lang.Object");
    }

    @Override // defpackage.rt8
    public void h(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        HmsMessaging.getInstance(context).setAutoInitEnabled(true);
        HmsInstanceId.getInstance(context).getToken(m(context), HmsMessaging.DEFAULT_TOKEN_SCOPE);
    }

    @Override // defpackage.rt8
    protected boolean i(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context) == 0) {
            return true;
        }
        return false;
    }
}
