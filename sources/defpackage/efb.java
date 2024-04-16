package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.media.RingtoneManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.push.e;
import defpackage.rs8;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.PushMessageAttributes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: ThreadsLibNotification.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0003\u000e\f\u0005B+\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0003J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000e\u0010\u001cR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lefb;", "Lvw1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", com.huawei.hms.opendevice.c.a, "Lefb$c;", "", DateTokenConverter.CONVERTER_KEY, "Landroid/app/NotificationManager;", "notificationManager", "", "b", "Lbfb;", "a", "Lbfb;", "threadsLibInitializer", "Lkfb;", "Lkfb;", "threadsLibUnreadMessagesCounter", "Lgc;", "Lgc;", "analytics", "I", "notificationId", "Lj17;", e.a, "Lj17;", "()Lj17;", "channelType", "f", "Lefb$c;", "messageType", "Lu27;", "message", "<init>", "(Lbfb;Lkfb;Lgc;Lu27;)V", "g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: efb  reason: default package */
/* loaded from: classes3.dex */
public final class efb extends vw1 {
    public static final a g = new a(null);
    private final bfb a;
    private final kfb b;
    private final gc c;
    private final int d;
    private final j17 e;
    private final c f;

    /* compiled from: ThreadsLibNotification.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lefb$a;", "", "Lu27;", "message", "", "a", "", "CHAT_DEEP_LINK", "Ljava/lang/String;", "DATA_PARAM_NAME_ORIGIN", "DATA_PARAM_NAME_TYPE", "DATA_PARAM_VALUE_THREADS", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: efb$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(u27 u27Var) {
            z65.h(u27Var, "message");
            return z65.c(u27Var.a().get(PushMessageAttributes.ORIGIN), "threads");
        }
    }

    /* compiled from: ThreadsLibNotification.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lefb$b;", "", "Lu27;", "message", "Lefb;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: efb$b */
    /* loaded from: classes3.dex */
    public interface b {
        efb a(u27 u27Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThreadsLibNotification.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lefb$c;", "", "", "a", "Ljava/lang/String;", "typeValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: efb$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public static final a b;
        public static final c c = new c("SURVEY", 0, "SURVEY");
        public static final c d = new c(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1, null);
        private static final /* synthetic */ c[] e;
        private static final /* synthetic */ kj3 f;
        private final String a;

        /* compiled from: ThreadsLibNotification.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lefb$c$a;", "", "", "typeValue", "Lefb$c;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: efb$c$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar;
                c[] values = c.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        cVar = values[i];
                        if (z65.c(cVar.a, str)) {
                            break;
                        }
                        i++;
                    } else {
                        cVar = null;
                        break;
                    }
                }
                return (c) mh5.c(cVar, c.d);
            }
        }

        static {
            c[] a2 = a();
            e = a2;
            f = lj3.a(a2);
            b = new a(null);
        }

        private c(String str, int i, String str2) {
            this.a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{c, d};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }
    }

    /* compiled from: ThreadsLibNotification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: efb$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public efb(bfb bfbVar, kfb kfbVar, gc gcVar, u27 u27Var) {
        z65.h(bfbVar, "threadsLibInitializer");
        z65.h(kfbVar, "threadsLibUnreadMessagesCounter");
        z65.h(gcVar, "analytics");
        z65.h(u27Var, "message");
        this.a = bfbVar;
        this.b = kfbVar;
        this.c = gcVar;
        this.d = b37.e.i();
        this.e = j17.d;
        this.f = c.b.a(u27Var.a().get(MessageAttributes.TYPE));
    }

    private final String c(Context context) {
        String string = context.getString(d(this.f));
        z65.g(string, "getString(...)");
        return string;
    }

    private final int d(c cVar) {
        int i = d.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return R.string.notification_chat_new_message_title;
            }
            throw new NoWhenBranchMatchedException();
        }
        return R.string.notification_chat_rate_agent_title;
    }

    @Override // defpackage.vw1
    public j17 a() {
        return this.e;
    }

    @Override // defpackage.vw1
    public void b(Context context, NotificationManager notificationManager) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(notificationManager, "notificationManager");
        String c2 = c(context);
        so9 e = new so9(context).e(c2);
        v27 v27Var = v27.g;
        PendingIntent a2 = new to9(context).a(e.c(v27Var.getValue()).f("dodo://chat").a());
        Notification b2 = c37.a.a(context, a()).p(a2).r(c2).I(RingtoneManager.getDefaultUri(2)).l(true).b();
        z65.g(b2, "build(...)");
        notificationManager.notify(this.d, b2);
        this.a.b();
        this.b.a();
        this.c.a(new rs8.c("dodo://chat", rs8.a.i(context), c2, "", v27Var, null, null, null, 224, null));
    }
}
