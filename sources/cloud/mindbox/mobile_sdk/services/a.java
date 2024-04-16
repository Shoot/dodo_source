package cloud.mindbox.mobile_sdk.services;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cloud.mindbox.mobile_sdk.services.MindboxNotificationWorker;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import defpackage.aa7;
import defpackage.or1;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: MindboxBackgroundWorkManager.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J~\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\u0018\u00010\u00132\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lcloud/mindbox/mobile_sdk/services/a;", "", "", "id", "", e.a, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "g", "Lua7;", DateTokenConverter.CONVERTER_KEY, "notificationId", "Lod9;", "remoteMessage", RemoteMessageConst.Notification.CHANNEL_ID, "channelName", "pushSmallIcon", "channelDescription", "", "Ljava/lang/Class;", "Landroid/app/Activity;", "activities", "defaultActivity", "", "delay", "Lyh6;", "state", "f", "b", "Ljava/lang/String;", "NOTIFICATION_WORKER_TAG", c.a, "WORKER_TAG", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();
    private static final String b;
    private static final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxBackgroundWorkManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lua7;", "a", "()Lua7;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: cloud.mindbox.mobile_sdk.services.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0092a extends ej5 implements Function0<ua7> {
        final /* synthetic */ int a;
        final /* synthetic */ od9 b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ int e;
        final /* synthetic */ String f;
        final /* synthetic */ Map<String, Class<? extends Activity>> g;
        final /* synthetic */ Class<? extends Activity> h;
        final /* synthetic */ yh6 i;
        final /* synthetic */ long j;
        final /* synthetic */ Context k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0092a(int i, od9 od9Var, String str, String str2, int i2, String str3, Map<String, ? extends Class<? extends Activity>> map, Class<? extends Activity> cls, yh6 yh6Var, long j, Context context) {
            super(0);
            this.a = i;
            this.b = od9Var;
            this.c = str;
            this.d = str2;
            this.e = i2;
            this.f = str3;
            this.g = map;
            this.h = cls;
            this.i = yh6Var;
            this.j = j;
            this.k = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ua7 invoke() {
            or1 a = new or1.a().b(ow6.CONNECTED).a();
            z65.g(a, "Builder()\n            .s…TED)\n            .build()");
            MindboxNotificationWorker.a aVar = MindboxNotificationWorker.d;
            androidx.work.b c = aVar.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            aa7.a aVar2 = new aa7.a(MindboxNotificationWorker.class);
            long j = this.j;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aa7 b = aVar2.g(j, timeUnit).a(a.b).h(c).f(a).e(aVar.b(), aVar.a(), timeUnit).b();
            z65.g(b, "OneTimeWorkRequestBuilde…   )\n            .build()");
            String e = a.a.e(this.a);
            return h7c.i(this.k).a(e, ym3.REPLACE, b).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxBackgroundWorkManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lua7;", "a", "()Lua7;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<ua7> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ua7 invoke() {
            aa7 b = new aa7.a(MindboxOneTimeEventWorker.class).g(120L, TimeUnit.SECONDS).a(a.c).f(new or1.a().b(ow6.CONNECTED).a()).b();
            z65.g(b, "OneTimeWorkRequestBuilde…   )\n            .build()");
            return h7c.i(this.a).a(a.c, ym3.KEEP, b).a();
        }
    }

    static {
        nk6 nk6Var;
        StringBuilder sb = new StringBuilder();
        sb.append("MindboxNotificationWorkManager-");
        sb.append(nk6.a.c());
        b = sb.toString();
        c = "MindboxBackgroundWorkManager-" + nk6Var.c();
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(int i) {
        return b + CoreConstants.DASH_CHAR + i;
    }

    public final ua7 d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ua7 c2 = h7c.i(context).c(c);
        z65.g(c2, "getInstance(context)\n   …lAllWorkByTag(WORKER_TAG)");
        return c2;
    }

    public final void f(Context context, int i, od9 od9Var, String str, String str2, int i2, String str3, Map<String, ? extends Class<? extends Activity>> map, Class<? extends Activity> cls, long j, yh6 yh6Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(od9Var, "remoteMessage");
        z65.h(str, RemoteMessageConst.Notification.CHANNEL_ID);
        z65.h(str2, "channelName");
        z65.h(cls, "defaultActivity");
        z65.h(yh6Var, "state");
        yx5.a.d(new C0092a(i, od9Var, str, str2, i2, str3, map, cls, yh6Var, j, context));
    }

    public final void g(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        yx5.a.d(new b(context));
    }
}
