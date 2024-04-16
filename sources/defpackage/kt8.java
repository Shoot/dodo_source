package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.k17;
import defpackage.sk9;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Marker;
/* compiled from: PushNotificationManager.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bR\u0010SJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0080\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0092\u0001\u0010 \u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\bH\u0002J\u0082\u0001\u0010!\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\u0082\u0001\u0010#\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0002J\u009c\u0001\u0010-\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\b\u0010*\u001a\u0004\u0018\u00010\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00042\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015H\u0002J*\u0010.\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002JR\u00105\u001a\u0004\u0018\u0001042\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u0006\u00100\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u000f2\u0006\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000fH\u0002Jf\u00108\u001a\u000206*\u0002062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u000207\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015H\u0002Jj\u00109\u001a\u000206*\u0002062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u000207\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015H\u0002JH\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u000207\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0018\u00010\u00142\b\u0010:\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015H\u0002J(\u0010<\u001a\u000206*\u0002062\b\u0010\"\u001a\u0004\u0018\u00010\u001d2\u0006\u0010%\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u000fH\u0002J&\u0010>\u001a\u000206*\u0002062\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u000fH\u0002J\u0016\u0010?\u001a\u00020\u001b*\u0002062\b\u0010&\u001a\u0004\u0018\u00010\u000fH\u0002JJ\u0010A\u001a\u00020@2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u00100\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u000f2\u0006\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u000f2\b\u00103\u001a\u0004\u0018\u00010\u000fH\u0002J\u001f\u0010D\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\bF\u0010GJ\u0085\u0001\u0010H\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u0006\u0010\t\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\bH\u0010IR\"\u0010Q\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"Lkt8;", "", "Landroid/app/NotificationManager;", "notificationManager", "", "notificationId", "", "o", "Lyh6;", "state", "p", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lod9;", "remoteMessage", "", RemoteMessageConst.Notification.CHANNEL_ID, "channelName", "pushSmallIcon", "channelDescription", "", "Ljava/lang/Class;", "Landroid/app/Activity;", "activities", "defaultActivity", "", "delay", "", "t", "Landroid/graphics/Bitmap;", "imagePlaceholder", "currentState", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, ElementGenerator.TYPE_IMAGE, "r", "uniqueKey", "title", "text", "", "Lqs8;", "pushActions", "pushLink", "payload", "Landroid/app/Notification;", "g", Image.TYPE_HIGH, "activity", "id", "pushKey", RemoteMessageConst.Notification.URL, "pushButtonKey", "Landroid/app/PendingIntent;", "i", "Lk17$e;", "Lec9;", "n", Image.TYPE_MEDIUM, ElementGenerator.TYPE_LINK, Image.TYPE_SMALL, "v", "imageBitmap", "u", "w", "Landroid/content/Intent;", "k", "message", "log", "f", "(Lod9;Ljava/lang/String;)Ljava/lang/String;", "q", "(Landroid/content/Context;)Z", "x", "(ILandroid/content/Context;Lod9;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/Class;Lyh6;Lcv1;)Ljava/lang/Object;", "Lhk6;", "b", "Lhk6;", "l", "()Lhk6;", "setMessageHandler$sdk_release", "(Lhk6;)V", "messageHandler", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: kt8  reason: default package */
/* loaded from: classes.dex */
public final class kt8 {
    public static final kt8 a = new kt8();
    private static hk6 b = new hk6(null, null, 3, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kt8$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ NotificationManager c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, NotificationManager notificationManager, String str3) {
            super(0);
            this.a = str;
            this.b = str2;
            this.c = notificationManager;
            this.d = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (Build.VERSION.SDK_INT >= 26) {
                jt8.a();
                NotificationChannel a = it8.a(this.a, this.b, 4);
                a.setDescription(this.d);
                a.setLockscreenVisibility(0);
                this.c.createNotificationChannel(a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/app/PendingIntent;", "a", "()Landroid/app/PendingIntent;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kt8$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<PendingIntent> {
        final /* synthetic */ Context a;
        final /* synthetic */ Class<? extends Activity> b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, Class<? extends Activity> cls, int i, String str, String str2, String str3, String str4) {
            super(0);
            this.a = context;
            this.b = cls;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PendingIntent invoke() {
            int i;
            Intent k = kt8.a.k(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            if (Build.VERSION.SDK_INT > 23) {
                i = 201326592;
            } else {
                i = 134217728;
            }
            return PendingIntent.getActivity(this.a, b49.a.c(), k, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kt8$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<Boolean> {
        final /* synthetic */ NotificationManager a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(NotificationManager notificationManager, int i) {
            super(0);
            this.a = notificationManager;
            this.b = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            StatusBarNotification[] activeNotifications;
            StatusBarNotification statusBarNotification;
            activeNotifications = this.a.getActiveNotifications();
            z65.g(activeNotifications, "notificationManager.activeNotifications");
            int i = this.b;
            int length = activeNotifications.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    statusBarNotification = null;
                    break;
                }
                statusBarNotification = activeNotifications[i2];
                if (statusBarNotification.getId() == i) {
                    break;
                }
                i2++;
            }
            return Boolean.valueOf(statusBarNotification != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kt8$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function0<Boolean> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.a = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(t27.d(this.a).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kt8$e */
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ Bitmap a;
        final /* synthetic */ k17.e b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bitmap bitmap, k17.e eVar, String str, String str2) {
            super(0);
            this.a = bitmap;
            this.b = eVar;
            this.c = str;
            this.d = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                kt8.a.u(this.b, bitmap, this.c, this.d);
            } else {
                kt8.a.w(this.b, this.d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kt8$f */
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ k17.e a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k17.e eVar, String str) {
            super(1);
            this.a = eVar;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            z65.h(th, "it");
            kt8.a.w(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk17$e;", "a", "()Lk17$e;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kt8$g */
    /* loaded from: classes.dex */
    public static final class g extends ej5 implements Function0<k17.e> {
        final /* synthetic */ k17.e a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k17.e eVar, String str) {
            super(0);
            this.a = eVar;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final k17.e invoke() {
            return this.a.J(new k17.c().q(this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.pushes.PushNotificationManager", f = "PushNotificationManager.kt", l = {131}, m = "tryNotifyRemoteMessage$sdk_release")
    /* renamed from: kt8$h */
    /* loaded from: classes.dex */
    public static final class h extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        Object g;
        Object h;
        Object i;
        Object j;
        Object k;
        int l;
        int m;
        /* synthetic */ Object n;
        int p;

        h(cv1<? super h> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.n = obj;
            this.p |= Integer.MIN_VALUE;
            return kt8.this.x(0, null, null, null, null, 0, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PushNotificationManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lsk9;", "Landroid/graphics/Bitmap;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.pushes.PushNotificationManager$tryNotifyRemoteMessage$image$1", f = "PushNotificationManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kt8$i */
    /* loaded from: classes.dex */
    public static final class i extends f3b implements Function2<qx1, cv1<? super sk9<? extends Bitmap>>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ od9 c;
        final /* synthetic */ Context d;
        final /* synthetic */ yh6 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(od9 od9Var, Context context, yh6 yh6Var, cv1<? super i> cv1Var) {
            super(2, cv1Var);
            this.c = od9Var;
            this.d = context;
            this.e = yh6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(this.c, this.d, this.e, cv1Var);
            iVar.b = obj;
            return iVar;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super sk9<Bitmap>> cv1Var) {
            return ((i) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object b;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qx1 qx1Var = (qx1) this.b;
                od9 od9Var = this.c;
                Context context = this.d;
                yh6 yh6Var = this.e;
                try {
                    sk9.a aVar = sk9.b;
                    kt8 kt8Var = kt8.a;
                    yj6 b2 = kt8Var.l().b();
                    fk6 fk6Var = fk6.a;
                    fk6Var.d(kt8Var, kt8Var.f(od9Var, "Image loading started, imageLoader=" + b2));
                    Bitmap a = b2.a(context, od9Var, yh6Var);
                    fk6Var.d(kt8Var, kt8Var.f(od9Var, "Image loading complete, bitmap=" + a));
                    b = sk9.b(a);
                } catch (Throwable th) {
                    sk9.a aVar2 = sk9.b;
                    b = sk9.b(vk9.a(th));
                }
                return sk9.a(b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super sk9<? extends Bitmap>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super sk9<Bitmap>>) cv1Var);
        }
    }

    private kt8() {
    }

    private final void d(Context context, NotificationManager notificationManager, od9 od9Var, String str, String str2, String str3, int i2, int i3, Map<String, ? extends Class<? extends Activity>> map, Class<? extends Activity> cls, long j, Bitmap bitmap, yh6 yh6Var) {
        h(notificationManager, str, str2, str3);
        notificationManager.notify(i2, g(context, i2, od9Var.g(), od9Var.f(), od9Var.a(), od9Var.d(), od9Var.e(), od9Var.c(), bitmap, str, i3, map, cls));
        cloud.mindbox.mobile_sdk.services.a.a.f(context, i2, od9Var, str, str2, i3, str3, map, cls, j, yh6.b(yh6Var, 0, true, 1, null));
    }

    private final void e(Context context, NotificationManager notificationManager, od9 od9Var, String str, String str2, String str3, int i2, int i3, Map<String, ? extends Class<? extends Activity>> map, Class<? extends Activity> cls, Bitmap bitmap) {
        h(notificationManager, str, str2, str3);
        notificationManager.notify(i2, g(context, i2, od9Var.g(), od9Var.f(), od9Var.a(), od9Var.d(), od9Var.e(), od9Var.c(), bitmap, str, i3, map, cls));
    }

    private final Notification g(Context context, int i2, String str, String str2, String str3, List<qs8> list, String str4, String str5, Bitmap bitmap, String str6, int i3, Map<String, ? extends Class<? extends Activity>> map, Class<? extends Activity> cls) {
        LinkedHashMap linkedHashMap;
        int e2;
        String F;
        if (map != null) {
            e2 = f86.e(map.size());
            linkedHashMap = new LinkedHashMap(e2);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                F = l0b.F((String) entry.getKey(), Marker.ANY_MARKER, ".*", false, 4, null);
                linkedHashMap.put(new ec9(F), entry.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        k17.e M = new k17.e(context, str6).r(str2).q(str3).H(i3).E(1).u(-1).l(true).D(true).M(0);
        z65.g(M, "Builder(context, channel…ompat.VISIBILITY_PRIVATE)");
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        Notification b2 = v(m(n(M, context, i2, str, str5, str4, linkedHashMap2, cls), context, i2, str, str5, list, linkedHashMap2, cls), bitmap, str2, str3).b();
        z65.g(b2, "Builder(context, channel…   )\n            .build()");
        return b2;
    }

    private final void h(NotificationManager notificationManager, String str, String str2, String str3) {
        yx5.a.d(new a(str, str2, notificationManager, str3));
    }

    private final PendingIntent i(Context context, Class<? extends Activity> cls, int i2, String str, String str2, String str3, String str4) {
        return (PendingIntent) yx5.a.b(null, new b(context, cls, i2, str, str2, str3, str4));
    }

    static /* synthetic */ PendingIntent j(kt8 kt8Var, Context context, Class cls, int i2, String str, String str2, String str3, String str4, int i3, Object obj) {
        String str5;
        if ((i3 & 64) != 0) {
            str5 = null;
        } else {
            str5 = str4;
        }
        return kt8Var.i(context, cls, i2, str, str2, str3, str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent k(Context context, Class<?> cls, int i2, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("push_payload", str);
        intent.putExtra("isOpenedFromPush", true);
        intent.putExtra("notification_id", i2);
        intent.putExtra("uniq_push_key", str2);
        intent.putExtra("uniq_push_button_key", str4);
        if (str3 != null) {
            intent.putExtra("push_url", str3);
        }
        intent.setPackage(context.getPackageName());
        return intent;
    }

    private final k17.e m(k17.e eVar, Context context, int i2, String str, String str2, List<qs8> list, Map<ec9, ? extends Class<? extends Activity>> map, Class<? extends Activity> cls) {
        List<qs8> B0;
        try {
            sk9.a aVar = sk9.b;
            B0 = sc1.B0(list, 3);
            for (qs8 qs8Var : B0) {
                kt8 kt8Var = a;
                PendingIntent i3 = kt8Var.i(context, kt8Var.s(map, qs8Var.c(), cls), i2, str2, str, qs8Var.c(), qs8Var.b());
                if (i3 != null) {
                    String a2 = qs8Var.a();
                    if (a2 == null) {
                        a2 = "";
                    }
                    eVar.a(0, a2, i3);
                }
            }
            sk9.b(Unit.a);
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            sk9.b(vk9.a(th));
        }
        return eVar;
    }

    private final k17.e n(k17.e eVar, Context context, int i2, String str, String str2, String str3, Map<ec9, ? extends Class<? extends Activity>> map, Class<? extends Activity> cls) {
        kt8 kt8Var = a;
        PendingIntent j = j(kt8Var, context, kt8Var.s(map, str3, cls), i2, str2, str, str3, null, 64, null);
        if (j != null) {
            eVar.p(j);
        }
        return eVar;
    }

    private final boolean o(NotificationManager notificationManager, int i2) {
        return ((Boolean) yx5.a.b(Boolean.FALSE, new c(notificationManager, i2))).booleanValue();
    }

    private final boolean p(NotificationManager notificationManager, int i2, yh6 yh6Var) {
        if (Build.VERSION.SDK_INT >= 23 && yh6Var.c() > 1 && yh6Var.d() && !o(notificationManager, i2)) {
            return true;
        }
        return false;
    }

    private final void r(Context context, NotificationManager notificationManager, od9 od9Var, String str, String str2, String str3, int i2, int i3, Map<String, ? extends Class<? extends Activity>> map, Class<? extends Activity> cls, Bitmap bitmap) {
        h(notificationManager, str, str2, str3);
        notificationManager.notify(i2, g(context, i2, od9Var.g(), od9Var.f(), od9Var.a(), od9Var.d(), od9Var.e(), od9Var.c(), bitmap, str, i3, map, cls));
    }

    private final Class<? extends Activity> s(Map<ec9, ? extends Class<? extends Activity>> map, String str, Class<? extends Activity> cls) {
        Class<? extends Activity> cls2;
        Set<ec9> keySet;
        Object obj = null;
        if (str != null && map != null && (keySet = map.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ec9) next).f(str)) {
                    obj = next;
                    break;
                }
            }
            obj = (ec9) obj;
        }
        if (map != null && (cls2 = map.get(obj)) != null) {
            return cls2;
        }
        return cls;
    }

    private final void t(Context context, int i2, od9 od9Var, String str, String str2, int i3, String str3, Map<String, ? extends Class<? extends Activity>> map, Class<? extends Activity> cls, yh6 yh6Var, long j) {
        cloud.mindbox.mobile_sdk.services.a.a.f(context, i2, od9Var, str, str2, i3, str3, map, cls, j, yh6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k17.e u(k17.e eVar, Bitmap bitmap, String str, String str2) {
        eVar.z(bitmap);
        k17.b s = new k17.b().r(bitmap).q(null).s(str);
        z65.g(s, "BigPictureStyle()\n      …setBigContentTitle(title)");
        if (str2 != null) {
            s.t(str2);
        }
        k17.e J = eVar.J(s);
        z65.g(J, "setStyle(style)");
        return J;
    }

    private final k17.e v(k17.e eVar, Bitmap bitmap, String str, String str2) {
        yx5.a.c(new e(bitmap, eVar, str, str2), new f(eVar, str2));
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(k17.e eVar, String str) {
        yx5.a.d(new g(eVar, str));
    }

    public final String f(od9 od9Var, String str) {
        z65.h(od9Var, "message");
        z65.h(str, "log");
        return "Notify message " + od9Var.g() + ": " + str;
    }

    public final hk6 l() {
        return b;
    }

    public final boolean q(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return ((Boolean) yx5.a.b(Boolean.TRUE, new d(context))).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(int r28, android.content.Context r29, defpackage.od9 r30, java.lang.String r31, java.lang.String r32, int r33, java.lang.String r34, java.util.Map<java.lang.String, ? extends java.lang.Class<? extends android.app.Activity>> r35, java.lang.Class<? extends android.app.Activity> r36, defpackage.yh6 r37, defpackage.cv1<? super kotlin.Unit> r38) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt8.x(int, android.content.Context, od9, java.lang.String, java.lang.String, int, java.lang.String, java.util.Map, java.lang.Class, yh6, cv1):java.lang.Object");
    }
}
