package ru.dodopizza.app.application.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.eb0;
import defpackage.k17;
import defpackage.rs8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.application.notification.OrderTrackingNotificationDeleteTracker;
/* compiled from: OrderTrackingNotification.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 ,2\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\bI\u0010JJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u0017\u00102R\u001b\u00106\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u0016\u0010;\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:R\u0016\u0010=\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010B\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010AR\u0014\u0010E\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010DR\u0014\u0010F\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010DR\u0014\u0010H\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010D¨\u0006K"}, d2 = {"Lru/dodopizza/app/application/notification/a;", "Lvw1;", "Landroid/app/NotificationManager;", "notificationManager", "", "r", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", Image.TYPE_SMALL, "Landroid/widget/RemoteViews;", "i", "", "ratingValue", "Landroid/app/PendingIntent;", "j", "(Landroid/content/Context;Ljava/lang/Integer;)Landroid/app/PendingIntent;", "", "originalClickUrl", "k", Image.TYPE_HIGH, "b", "Lu27;", "a", "Lu27;", "notificationMessage", "Lgc;", "Lgc;", "analytics", "Ly27;", com.huawei.hms.opendevice.c.a, "Ly27;", "filter", "Leb0;", DateTokenConverter.CONVERTER_KEY, "Leb0;", "binaryFeedbackFeatureState", e.a, "Lrn5;", "n", "()I", "notificationId", "Lb37;", "f", "o", "()Lb37;", "notificationType", "Lj17;", "g", "Lj17;", "()Lj17;", "channelType", "q", "()Z", "isClickUrlRatingDeeplink", "Ljava/lang/String;", "orderId", "Lmi7;", "Lmi7;", "orderState", "Ljava/lang/Integer;", "finishedProgressBars", "l", "totalProgressBars", Image.TYPE_MEDIUM, "Z", "canMakeSound", "shouldCancelOnClick", "()Ljava/lang/String;", "clickUrl", "message", "p", "title", "<init>", "(Lu27;Lgc;Ly27;Leb0;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class a extends vw1 {
    public static final C0507a o = new C0507a(null);
    private final u27 a;
    private final gc b;
    private final y27 c;
    private final eb0 d;
    private final rn5 e;
    private final rn5 f;
    private final j17 g;
    private final rn5 h;
    private final String i;
    private final mi7 j;
    private final Integer k;
    private final Integer l;
    private final boolean m;
    private final boolean n;

    /* compiled from: OrderTrackingNotification.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/application/notification/a$a;", "", "", "CLICK_URL_KEY", "Ljava/lang/String;", "FINISHED_PROGRESS_BARS_KEY", "MESSAGE_KEY", "ORDER_ID_KEY", "ORDER_STATE", "SOURCE_KEY", "TITLE_KEY", "TOTAL_PROGRESS_BARS_KEY", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.application.notification.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0507a {
        private C0507a() {
        }

        public /* synthetic */ C0507a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OrderTrackingNotification.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function0<Boolean> {
        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(z65.c(Uri.parse(a.this.l()).getAuthority(), "orderRating"));
        }
    }

    /* compiled from: OrderTrackingNotification.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends ej5 implements Function0<Integer> {
        c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            String str = a.this.i;
            return Integer.valueOf(str != null ? str.hashCode() : a.this.o().i());
        }
    }

    /* compiled from: OrderTrackingNotification.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb37;", "a", "()Lb37;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    static final class d extends ej5 implements Function0<b37> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final b37 invoke() {
            if (a.this.j != mi7.l && !a.this.q()) {
                return b37.d;
            }
            return b37.c;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0061, code lost:
        r5 = defpackage.k0b.k(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(defpackage.u27 r3, defpackage.gc r4, defpackage.y27 r5, defpackage.eb0 r6) {
        /*
            r2 = this;
            java.lang.String r0 = "notificationMessage"
            defpackage.z65.h(r3, r0)
            java.lang.String r0 = "analytics"
            defpackage.z65.h(r4, r0)
            java.lang.String r0 = "filter"
            defpackage.z65.h(r5, r0)
            java.lang.String r0 = "binaryFeedbackFeatureState"
            defpackage.z65.h(r6, r0)
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r6
            ru.dodopizza.app.application.notification.a$c r4 = new ru.dodopizza.app.application.notification.a$c
            r4.<init>()
            rn5 r4 = defpackage.xn5.b(r4)
            r2.e = r4
            ru.dodopizza.app.application.notification.a$d r4 = new ru.dodopizza.app.application.notification.a$d
            r4.<init>()
            rn5 r4 = defpackage.xn5.b(r4)
            r2.f = r4
            j17 r4 = defpackage.j17.c
            r2.g = r4
            ru.dodopizza.app.application.notification.a$b r4 = new ru.dodopizza.app.application.notification.a$b
            r4.<init>()
            rn5 r4 = defpackage.xn5.b(r4)
            r2.h = r4
            java.util.Map r4 = r3.a()
            java.lang.String r5 = "orderId"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r2.i = r4
            java.util.Map r5 = r3.a()
            java.lang.String r6 = "orderState"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            if (r5 == 0) goto L72
            java.lang.Integer r5 = defpackage.c0b.k(r5)
            if (r5 == 0) goto L72
            int r5 = r5.intValue()
            mi7$a r0 = defpackage.mi7.b
            mi7 r5 = r0.a(r5)
            goto L73
        L72:
            r5 = r6
        L73:
            r2.j = r5
            java.util.Map r0 = r3.a()
            java.lang.String r1 = "finishedProgressBars"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L88
            java.lang.Integer r0 = defpackage.c0b.k(r0)
            goto L89
        L88:
            r0 = r6
        L89:
            r2.k = r0
            java.util.Map r3 = r3.a()
            java.lang.String r0 = "totalProgressBars"
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L9d
            java.lang.Integer r6 = defpackage.c0b.k(r3)
        L9d:
            r2.l = r6
            b37 r3 = r2.o()
            b37 r6 = defpackage.b37.c
            r0 = 0
            r1 = 1
            if (r3 == r6) goto Lb6
            if (r5 == 0) goto Lb6
            mi7 r3 = defpackage.mi7.j
            if (r5 == r3) goto Lb6
            mi7 r3 = defpackage.mi7.k
            if (r5 != r3) goto Lb4
            goto Lb6
        Lb4:
            r3 = 0
            goto Lb7
        Lb6:
            r3 = 1
        Lb7:
            r2.m = r3
            if (r4 == 0) goto Lc3
            b37 r3 = r2.o()
            b37 r4 = defpackage.b37.d
            if (r3 == r4) goto Lc4
        Lc3:
            r0 = 1
        Lc4:
            r2.n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.application.notification.a.<init>(u27, gc, y27, eb0):void");
    }

    private final PendingIntent h(Context context) {
        mi7 mi7Var;
        String str = this.i;
        if (str != null && (mi7Var = this.j) != null) {
            return OrderTrackingNotificationDeleteTracker.a.a(context, new OrderTrackingNotificationDeleteTracker.b(str, mi7Var));
        }
        return null;
    }

    private final RemoteViews i(Context context) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.order_tracking_notification);
        remoteViews.setTextViewText(R.id.notification_title, this.c.a(p()));
        remoteViews.setTextViewText(R.id.notification_message, this.c.a(m()));
        if (o() == b37.c && q() && !(this.d instanceof eb0.b)) {
            remoteViews.setViewVisibility(R.id.rating_stars, 0);
            remoteViews.setOnClickPendingIntent(R.id.rating_1_star, j(context, 1));
            remoteViews.setOnClickPendingIntent(R.id.rating_2_stars, j(context, 2));
            remoteViews.setOnClickPendingIntent(R.id.rating_3_stars, j(context, 3));
            remoteViews.setOnClickPendingIntent(R.id.rating_4_stars, j(context, 4));
            remoteViews.setOnClickPendingIntent(R.id.rating_5_stars, j(context, 5));
        } else if (o() == b37.d && this.k != null && this.l != null) {
            remoteViews.setViewVisibility(R.id.progress_bar, 0);
            remoteViews.setProgressBar(R.id.progress_bar, this.l.intValue(), this.k.intValue(), false);
        }
        return remoteViews;
    }

    private final PendingIntent j(Context context, Integer num) {
        String k;
        if (num == null) {
            k = l();
        } else {
            k = k(l(), num.intValue());
        }
        so9 d2 = new so9(context).f(k).e(p()).d(m());
        if (this.n) {
            d2.b("notification_id", String.valueOf(n()));
        }
        return new to9(context).a(d2.c(v27.d.getValue()).a());
    }

    private final String k(String str, int i) {
        String builder = Uri.parse(str).buildUpon().appendQueryParameter("ratingValue", String.valueOf(i)).toString();
        z65.g(builder, "toString(...)");
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String l() {
        String str = this.a.a().get("clickUrl");
        if (str == null) {
            return "";
        }
        return str;
    }

    private final String m() {
        String str = this.a.a().get("message");
        if (str == null) {
            return "";
        }
        return str;
    }

    private final int n() {
        return ((Number) this.e.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b37 o() {
        return (b37) this.f.getValue();
    }

    private final String p() {
        String str = this.a.a().get("title");
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    private final boolean r(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications;
        if (Build.VERSION.SDK_INT >= 23) {
            activeNotifications = notificationManager.getActiveNotifications();
            z65.g(activeNotifications, "getActiveNotifications(...)");
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getId() == n()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private final void s(Context context) {
        this.b.a(new rs8.c(l(), rs8.a.i(context), p(), m(), v27.d, this.i, this.j, null, 128, null));
    }

    @Override // defpackage.vw1
    public j17 a() {
        return this.g;
    }

    @Override // defpackage.vw1
    public void b(Context context, NotificationManager notificationManager) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(notificationManager, "notificationManager");
        k17.e v = c37.a.a(context, a()).I(RingtoneManager.getDefaultUri(2)).G(!this.m).J(new k17.f()).t(i(context)).l(this.n).p(j(context, null)).v(h(context));
        z65.g(v, "setDeleteIntent(...)");
        boolean r = r(notificationManager);
        notificationManager.notify(n(), v.b());
        if (n() == b37.c.i()) {
            notificationManager.cancel(b37.d.i());
        }
        if (this.i == null || !r) {
            s(context);
        }
    }
}
