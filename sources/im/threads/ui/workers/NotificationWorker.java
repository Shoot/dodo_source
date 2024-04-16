package im.threads.ui.workers;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.widget.RemoteViews;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.aa7;
import defpackage.k17;
import im.threads.R;
import im.threads.business.config.BaseConfig;
import im.threads.business.formatters.MessageFormatter;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.imageLoading.ImageModifications;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.utils.FileUtils;
import im.threads.business.utils.WorkerUtils;
import im.threads.ui.ChatStyle;
import im.threads.ui.activities.QuickAnswerActivity;
import im.threads.ui.config.Config;
import im.threads.ui.fragments.ChatFragment;
import im.threads.ui.workers.NotificationWorker;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: NotificationWorker.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 D2\u00020\u0001:\u0001DB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J,\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\"\u0010\u001a\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J \u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J(\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\nH\u0002J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J:\u0010%\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0003J\u0014\u0010(\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010\u0011H\u0002J\"\u0010*\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\"\u0010,\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u001c\u0010.\u001a\u0004\u0018\u00010-2\b\u0010)\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u00100\u001a\u00020/H\u0002J\b\u00102\u001a\u000201H\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u001c\u00106\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010\u0014\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006E"}, d2 = {"Lim/threads/ui/workers/NotificationWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "createNotificationChannel", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/Notification;", RemoteMessageConst.NOTIFICATION, "", "notificationId", "notifyUnreadMessagesCountChanged", "Landroidx/work/b;", "inputData", "Lim/threads/business/formatters/MessageFormatter$MessageContent;", "messageContent", "", "message", "Lim/threads/ui/config/Config;", "config", "getPreNStyleNotification", "operatorAvatarUrl", "Landroid/widget/RemoteViews;", "pushSmall", "pushBig", "showPreNStyleOperatorAvatar", "Lim/threads/ui/ChatStyle;", "chatStyle", "showPreNStyleSmallIcon", "Landroid/graphics/drawable/Drawable;", "drawable", "pushContainerResId", "onImageLoaded", "onImageLoadError", "Lxr1;", "completionHandler", "getNStyleNotification", RemoteMessageConst.Notification.URL, "Landroid/graphics/Bitmap;", "getBitmapFromUrl", "appMarker", "notifyAboutUnsent", "campaign", "notifyAboutCampaign", "Landroid/app/PendingIntent;", "getChatIntent", "", "needsShowNotification", "Landroidx/work/ListenableWorker$a;", "doWork", "Landroid/content/Context;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "Lim/threads/business/config/BaseConfig;", "config$delegate", "Lrn5;", "getConfig", "()Lim/threads/business/config/BaseConfig;", "Landroid/app/NotificationChannel;", "notificationChannel", "Landroid/app/NotificationChannel;", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class NotificationWorker extends Worker {
    private static final String ACTION_ADD_CAMPAIGN_MESSAGE = "im.threads.internal.workers.NotificationWorker.ACTION_ADD_CAMPAIGN_MESSAGE";
    private static final String ACTION_ADD_UNREAD_MESSAGE = "im.threads.internal.workers.NotificationWorker.ACTION_ADD_UNREAD_MESSAGE";
    private static final String ACTION_ADD_UNREAD_MESSAGE_LIST = "im.threads.internal.workers.NotificationWorker.ACTION_ADD_UNREAD_MESSAGE_LIST";
    private static final String ACTION_ADD_UNSENT_MESSAGE = "im.threads.internal.workers.NotificationWorker.ACTION_ADD_UNSENT_MESSAGE";
    private static final String ACTION_REMOVE_NOTIFICATION = "im.threads.internal.workers.NotificationWorker.ACTION_REMOVE_NOTIFICATION";
    private static final int CAMPAIGN_MESSAGE_PUSH_ID = 2;
    private static final String CHANNEL_ID = "im.threads.internal.workers.NotificationWorker.CHANNEL_ID";
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_APP_MARKER = "im.threads.internal.workers.NotificationWorker.EXTRA_APP_MARKER";
    public static final String EXTRA_CAMPAIGN_MESSAGE = "im.threads.internal.workers.NotificationWorker.EXTRA_CAMPAIGN_MESSAGE";
    public static final String EXTRA_MESSAGE = "im.threads.internal.workers.NotificationWorker.EXTRA_MESSAGE";
    public static final String EXTRA_MESSAGE_CONTENT = "im.threads.internal.workers.NotificationWorker.EXTRA_MESSAGE_CONTENT";
    public static final String EXTRA_NOTIFICATION_ID = "im.threads.internal.workers.NotificationWorker.EXTRA_NOTIFICATION_ID";
    public static final String EXTRA_OPERATOR_URL = "im.threads.internal.workers.NotificationWorker.EXTRA_OPERATOR_URL";
    public static final String GROUP_KEY_PUSH = "im.threads.internal.workers.NotificationWorker.UNREAD_MESSAGE_GROUP";
    private static final String NOTIFICATION_ACTION = "im.threads.internal.workers.NotificationWorker.Action";
    private static final int UNREAD_MESSAGE_GROUP_PUSH_ID = 0;
    private static final int UNSENT_MESSAGE_PUSH_ID = 1;
    private static final String WORKER_NAME = "im.threads.internal.workers.NotificationWorker";
    private final rn5 config$delegate;
    private final Context context;
    private final ExecutorService executor;
    private NotificationChannel notificationChannel;

    /* compiled from: NotificationWorker.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J6\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0007J\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0007R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0014\u0010\"\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0014\u0010#\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u0014\u0010$\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u0014\u0010%\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0017R\u0014\u0010'\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0014\u0010(\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u0014\u0010)\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0017¨\u0006,"}, d2 = {"Lim/threads/ui/workers/NotificationWorker$Companion;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/b$a;", "inputData", "", "startWorker", "removeNotification", "", "notificationId", "", "message", "operatorUrl", "appMarker", "addUnreadMessage", "Lim/threads/business/formatters/MessageFormatter$MessageContent;", "messageContent", "addUnreadMessageList", "addUnsentMessage", "campaign", "addCampaignMessage", "ACTION_ADD_CAMPAIGN_MESSAGE", "Ljava/lang/String;", "ACTION_ADD_UNREAD_MESSAGE", "ACTION_ADD_UNREAD_MESSAGE_LIST", "ACTION_ADD_UNSENT_MESSAGE", "ACTION_REMOVE_NOTIFICATION", "CAMPAIGN_MESSAGE_PUSH_ID", "I", "CHANNEL_ID", "EXTRA_APP_MARKER", "EXTRA_CAMPAIGN_MESSAGE", "EXTRA_MESSAGE", "EXTRA_MESSAGE_CONTENT", "EXTRA_NOTIFICATION_ID", "EXTRA_OPERATOR_URL", "GROUP_KEY_PUSH", "NOTIFICATION_ACTION", "UNREAD_MESSAGE_GROUP_PUSH_ID", "UNSENT_MESSAGE_PUSH_ID", "WORKER_NAME", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void startWorker(Context context, b.a aVar) {
            aa7 b = new aa7.a(NotificationWorker.class).h(aVar.a()).b();
            z65.g(b, "OneTimeWorkRequestBuilde…\n                .build()");
            h7c.i(context).f(NotificationWorker.WORKER_NAME, ym3.KEEP, b);
        }

        public final void addCampaignMessage(Context context, String str) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            b.a h = new b.a().h(NotificationWorker.NOTIFICATION_ACTION, NotificationWorker.ACTION_ADD_CAMPAIGN_MESSAGE).h(NotificationWorker.EXTRA_CAMPAIGN_MESSAGE, str);
            z65.g(h, "Builder()\n              …MPAIGN_MESSAGE, campaign)");
            startWorker(context, h);
        }

        public final void addUnreadMessage(Context context, int i, String str, String str2, String str3) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            b.a g = new b.a().h(NotificationWorker.NOTIFICATION_ACTION, NotificationWorker.ACTION_ADD_UNREAD_MESSAGE).h(NotificationWorker.EXTRA_APP_MARKER, str3).h(NotificationWorker.EXTRA_OPERATOR_URL, str2).h(NotificationWorker.EXTRA_MESSAGE, str).g(NotificationWorker.EXTRA_NOTIFICATION_ID, i);
            z65.g(g, "Builder()\n              …ATION_ID, notificationId)");
            startWorker(context, g);
        }

        public final void addUnreadMessageList(Context context, String str, MessageFormatter.MessageContent messageContent) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(messageContent, "messageContent");
            b.a f = new b.a().h(NotificationWorker.NOTIFICATION_ACTION, NotificationWorker.ACTION_ADD_UNREAD_MESSAGE_LIST).h(NotificationWorker.EXTRA_APP_MARKER, str).f(NotificationWorker.EXTRA_MESSAGE_CONTENT, WorkerUtils.INSTANCE.marshall(messageContent));
            z65.g(f, "Builder()\n              …marshall(messageContent))");
            startWorker(context, f);
        }

        public final void addUnsentMessage(Context context, String str) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            b.a h = new b.a().h(NotificationWorker.NOTIFICATION_ACTION, NotificationWorker.ACTION_ADD_UNSENT_MESSAGE).h(NotificationWorker.EXTRA_APP_MARKER, str);
            z65.g(h, "Builder()\n              …RA_APP_MARKER, appMarker)");
            startWorker(context, h);
        }

        public final void removeNotification(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            b.a h = new b.a().h(NotificationWorker.NOTIFICATION_ACTION, NotificationWorker.ACTION_REMOVE_NOTIFICATION);
            z65.g(h, "Builder()\n              …TION_REMOVE_NOTIFICATION)");
            startWorker(context, h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        rn5 b;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(workerParameters, "workerParameters");
        this.context = context;
        this.executor = Executors.newSingleThreadExecutor();
        b = yn5.b(NotificationWorker$config$2.INSTANCE);
        this.config$delegate = b;
    }

    public static final void addCampaignMessage(Context context, String str) {
        Companion.addCampaignMessage(context, str);
    }

    public static final void addUnreadMessage(Context context, int i, String str, String str2, String str3) {
        Companion.addUnreadMessage(context, i, str, str2, str3);
    }

    public static final void addUnreadMessageList(Context context, String str, MessageFormatter.MessageContent messageContent) {
        Companion.addUnreadMessageList(context, str, messageContent);
    }

    public static final void addUnsentMessage(Context context, String str) {
        Companion.addUnsentMessage(context, str);
    }

    private final void createNotificationChannel(Context context) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        if (this.notificationChannel == null && (notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)) != null) {
            notificationChannel = notificationManager.getNotificationChannel(CHANNEL_ID);
            this.notificationChannel = notificationChannel;
            if (notificationChannel == null) {
                jt8.a();
                NotificationChannel a = it8.a(CHANNEL_ID, context.getString(R.string.ecc_channel_name), getConfig().getNotificationImportance());
                this.notificationChannel = a;
                notificationManager.createNotificationChannel(a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doWork$lambda$3$lambda$0(NotificationWorker notificationWorker, NotificationManager notificationManager, int i, Notification notification) {
        z65.h(notificationWorker, "this$0");
        z65.h(notificationManager, "$notificationManager");
        z65.h(notification, RemoteMessageConst.NOTIFICATION);
        notificationWorker.notifyUnreadMessagesCountChanged(notificationManager, notification, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doWork$lambda$3$lambda$2(NotificationWorker notificationWorker, NotificationManager notificationManager, Notification notification) {
        z65.h(notificationWorker, "this$0");
        z65.h(notificationManager, "$notificationManager");
        z65.h(notification, RemoteMessageConst.NOTIFICATION);
        notificationWorker.notifyUnreadMessagesCountChanged(notificationManager, notification, new Date().hashCode());
    }

    private final Bitmap getBitmapFromUrl(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return ImageLoader.Companion.get().load(str).modifications(ImageModifications.CircleCropModification.INSTANCE).getBitmapSync(this.context);
        } catch (IOException e) {
            LoggerEdna.error("getBitmapFromUrl: " + e);
            return null;
        }
    }

    private final PendingIntent getChatIntent(String str, Config config) {
        return config.getPendingIntentCreator().create(this.context, str);
    }

    private final BaseConfig getConfig() {
        return (BaseConfig) this.config$delegate.getValue();
    }

    @TargetApi(24)
    private final void getNStyleNotification(b bVar, final MessageFormatter.MessageContent messageContent, final xr1<Notification> xr1Var, String str, Config config) {
        int color;
        boolean z;
        String str2;
        final k17.e eVar = new k17.e(this.context, CHANNEL_ID);
        eVar.p(getChatIntent(bVar.m(EXTRA_APP_MARKER), config));
        eVar.F(true);
        eVar.x(GROUP_KEY_PUSH);
        color = this.context.getColor(config.getChatStyle().nougatPushAccentColorResId);
        eVar.n(color);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            str2 = FileUtils.convertRelativeUrlToAbsolute(bVar.m(EXTRA_OPERATOR_URL));
            eVar.q(str);
            eVar.H(config.getChatStyle().defPushIconResId);
            eVar.a(0, this.context.getString(R.string.ecc_answer), QuickAnswerActivity.createPendingIntent(this.context));
        } else if (messageContent != null) {
            str2 = FileUtils.convertRelativeUrlToAbsolute(messageContent.getAvatarPath());
            eVar.r(messageContent.getTitleText());
            if (messageContent.getHasImage() || messageContent.getHasPlainFiles() || messageContent.getPhrasesCount() <= 1) {
                eVar.q(messageContent.getContentText());
            }
            if (messageContent.isNeedAnswer()) {
                eVar.a(0, this.context.getString(R.string.ecc_answer), QuickAnswerActivity.createPendingIntent(this.context));
            }
            if (!messageContent.getHasImage() && !messageContent.getHasPlainFiles()) {
                eVar.H(config.getChatStyle().defPushIconResId);
            } else if (messageContent.getHasPlainFiles()) {
                eVar.H(R.drawable.ecc_attach_file_grey_48x48);
            } else {
                eVar.H(R.drawable.ecc_insert_photo_grey_48x48);
            }
        } else {
            str2 = null;
        }
        final String str3 = str2;
        this.executor.execute(new Runnable() { // from class: e37
            @Override // java.lang.Runnable
            public final void run() {
                NotificationWorker.getNStyleNotification$lambda$8(MessageFormatter.MessageContent.this, this, eVar, str3, xr1Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getNStyleNotification$lambda$8(MessageFormatter.MessageContent messageContent, NotificationWorker notificationWorker, k17.e eVar, String str, xr1 xr1Var) {
        z65.h(notificationWorker, "this$0");
        z65.h(eVar, "$builder");
        z65.h(xr1Var, "$completionHandler");
        if (messageContent != null && messageContent.getHasImage() && !messageContent.getHasPlainFiles() && messageContent.getImagesCount() == 1) {
            k17.b bVar = new k17.b();
            bVar.r(notificationWorker.getBitmapFromUrl(messageContent.getLastImagePath()));
            eVar.J(bVar);
        }
        eVar.z(notificationWorker.getBitmapFromUrl(str));
        xr1Var.accept(eVar.b());
    }

    private final Notification getPreNStyleNotification(b bVar, MessageFormatter.MessageContent messageContent, String str, Config config) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        k17.e eVar = new k17.e(this.context, CHANNEL_ID);
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.ecc_remote_push_small);
        RemoteViews remoteViews2 = new RemoteViews(this.context.getPackageName(), R.layout.ecc_remote_push_expanded);
        eVar.r(this.context.getString(config.getChatStyle().defTitleResId));
        eVar.x(GROUP_KEY_PUSH);
        int i3 = R.id.title;
        remoteViews.setTextViewText(i3, this.context.getString(config.getChatStyle().defTitleResId));
        remoteViews2.setTextViewText(i3, this.context.getString(config.getChatStyle().defTitleResId));
        int i4 = R.id.icon_large_bg;
        int i5 = R.drawable.ecc_ic_circle_40dp;
        remoteViews.setImageViewResource(i4, i5);
        remoteViews2.setImageViewResource(i4, i5);
        eVar.n(this.context.getResources().getColor(config.getChatStyle().pushBackgroundColorResId));
        remoteViews.setInt(i4, "setColorFilter", this.context.getResources().getColor(config.getChatStyle().pushBackgroundColorResId));
        remoteViews2.setInt(i4, "setColorFilter", this.context.getResources().getColor(config.getChatStyle().pushBackgroundColorResId));
        int i6 = R.id.text;
        remoteViews.setInt(i6, "setTextColor", this.context.getResources().getColor(config.getChatStyle().incomingMessageTextColor));
        remoteViews2.setInt(i6, "setTextColor", this.context.getResources().getColor(config.getChatStyle().incomingMessageTextColor));
        eVar.H(config.getChatStyle().defPushIconResId);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            String m = bVar.m(EXTRA_OPERATOR_URL);
            if (m != null && m.length() != 0) {
                showPreNStyleOperatorAvatar(FileUtils.convertRelativeUrlToAbsolute(m), remoteViews, remoteViews2);
                showPreNStyleSmallIcon(remoteViews, remoteViews2, config.getChatStyle());
            } else {
                Bitmap decodeResource = BitmapFactory.decodeResource(this.context.getResources(), config.getChatStyle().defPushIconResId);
                int i7 = R.id.icon_large;
                remoteViews.setImageViewBitmap(i7, decodeResource);
                remoteViews2.setImageViewBitmap(i7, decodeResource);
                int i8 = R.id.icon_small_corner;
                remoteViews.setImageViewBitmap(i8, null);
                remoteViews2.setImageViewBitmap(i8, null);
                int i9 = R.id.consult_name;
                remoteViews.setViewVisibility(i9, 8);
                remoteViews2.setViewVisibility(i9, 8);
                int i10 = R.id.attach_image;
                remoteViews.setViewVisibility(i10, 8);
                remoteViews2.setViewVisibility(i10, 8);
            }
            remoteViews.setTextViewText(i6, str);
            remoteViews2.setTextViewText(i6, str);
        } else if (messageContent != null) {
            String avatarPath = messageContent.getAvatarPath();
            if (avatarPath != null && avatarPath.length() != 0) {
                showPreNStyleOperatorAvatar(FileUtils.convertRelativeUrlToAbsolute(messageContent.getAvatarPath()), remoteViews, remoteViews2);
                showPreNStyleSmallIcon(remoteViews, remoteViews2, config.getChatStyle());
            } else {
                Bitmap decodeResource2 = BitmapFactory.decodeResource(this.context.getResources(), config.getChatStyle().defPushIconResId);
                int i11 = R.id.icon_large;
                remoteViews.setImageViewBitmap(i11, decodeResource2);
                remoteViews2.setImageViewBitmap(i11, decodeResource2);
                int i12 = R.id.icon_small_corner;
                remoteViews.setImageViewBitmap(i12, null);
                remoteViews2.setImageViewBitmap(i12, null);
            }
            remoteViews.setTextViewText(R.id.consult_name, messageContent.getConsultName() + ":");
            String contentText = messageContent.getContentText();
            int length = contentText.length() - 1;
            int i13 = 0;
            boolean z4 = false;
            while (i13 <= length) {
                if (!z4) {
                    i2 = i13;
                } else {
                    i2 = length;
                }
                if (z65.j(contentText.charAt(i2), 32) <= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z4) {
                    if (!z3) {
                        z4 = true;
                    } else {
                        i13++;
                    }
                } else if (!z3) {
                    break;
                } else {
                    length--;
                }
            }
            remoteViews.setTextViewText(i6, contentText.subSequence(i13, length + 1).toString());
            remoteViews2.setTextViewText(R.id.consult_name, messageContent.getConsultName() + ":");
            int i14 = R.id.text;
            String contentText2 = messageContent.getContentText();
            int length2 = contentText2.length() - 1;
            int i15 = 0;
            boolean z5 = false;
            while (i15 <= length2) {
                if (!z5) {
                    i = i15;
                } else {
                    i = length2;
                }
                if (z65.j(contentText2.charAt(i), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z5) {
                    if (!z2) {
                        z5 = true;
                    } else {
                        i15++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length2--;
                }
            }
            remoteViews2.setTextViewText(i14, contentText2.subSequence(i15, length2 + 1).toString());
            if (messageContent.getHasPlainFiles()) {
                int i16 = R.id.attach_image;
                remoteViews.setViewVisibility(i16, 0);
                remoteViews2.setViewVisibility(i16, 0);
                Bitmap decodeResource3 = BitmapFactory.decodeResource(this.context.getResources(), R.drawable.ecc_attach_file_grey_48x48);
                remoteViews.setImageViewBitmap(i16, decodeResource3);
                remoteViews2.setImageViewBitmap(i16, decodeResource3);
            } else if (messageContent.getHasImage()) {
                int i17 = R.id.attach_image;
                remoteViews.setViewVisibility(i17, 0);
                remoteViews2.setViewVisibility(i17, 0);
                Bitmap decodeResource4 = BitmapFactory.decodeResource(this.context.getResources(), R.drawable.ecc_insert_photo_grey_48x48);
                remoteViews.setImageViewBitmap(i17, decodeResource4);
                remoteViews2.setImageViewBitmap(i17, decodeResource4);
            } else {
                int i18 = R.id.attach_image;
                remoteViews.setViewVisibility(i18, 8);
                remoteViews2.setViewVisibility(i18, 8);
            }
            if (messageContent.isNeedAnswer()) {
                eVar.s(remoteViews2);
                remoteViews2.setOnClickPendingIntent(R.id.reply, QuickAnswerActivity.createPendingIntent(this.context));
            }
        }
        remoteViews2.setTextViewText(R.id.reply, this.context.getString(R.string.ecc_reply));
        eVar.o(remoteViews);
        PendingIntent chatIntent = getChatIntent(bVar.m(EXTRA_APP_MARKER), config);
        eVar.p(chatIntent);
        eVar.l(true);
        eVar.p(chatIntent);
        Notification b = eVar.b();
        z65.g(b, "builder.build()");
        try {
            b.contentView.setViewVisibility(this.context.getResources().getIdentifier("right_icon", "id", this.context.getPackageName()), 4);
        } catch (Exception e) {
            LoggerEdna.error("getPreNStyleNotification", e);
        }
        return b;
    }

    private final boolean needsShowNotification() {
        return !ChatFragment.Companion.isShown();
    }

    private final void notifyAboutCampaign(NotificationManager notificationManager, String str, Config config) {
        k17.e eVar = new k17.e(this.context, CHANNEL_ID);
        eVar.q(str);
        PendingIntent chatIntent = getChatIntent(null, config);
        eVar.H(config.getChatStyle().defPushIconResId);
        eVar.p(chatIntent);
        eVar.l(true);
        notificationManager.notify(2, eVar.b());
    }

    private final void notifyAboutUnsent(NotificationManager notificationManager, String str, Config config) {
        k17.e eVar = new k17.e(this.context, CHANNEL_ID);
        eVar.r(this.context.getString(R.string.ecc_message_were_unsent));
        PendingIntent chatIntent = getChatIntent(str, config);
        eVar.H(config.getChatStyle().defPushIconResId);
        eVar.p(chatIntent);
        eVar.l(true);
        notificationManager.notify(1, eVar.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void notifyUnreadMessagesCountChanged(android.app.NotificationManager r4, android.app.Notification r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.defaults
            r0 = r0 | 3
            r5.defaults = r0
            boolean r0 = r3.needsShowNotification()
            if (r0 == 0) goto L55
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L19
            android.graphics.drawable.Icon r0 = defpackage.d37.a(r5)
            if (r0 != 0) goto L19
            goto L50
        L19:
            k17$e r0 = new k17$e
            android.content.Context r1 = r3.context
            java.lang.String r2 = "im.threads.internal.workers.NotificationWorker.CHANNEL_ID"
            r0.<init>(r1, r2)
            int r1 = r5.icon
            k17$e r0 = r0.H(r1)
            int r1 = defpackage.k17.a(r5)
            k17$e r0 = r0.n(r1)
            android.app.PendingIntent r1 = r5.contentIntent
            k17$e r0 = r0.p(r1)
            r1 = 1
            k17$e r0 = r0.l(r1)
            java.lang.String r2 = "im.threads.internal.workers.NotificationWorker.UNREAD_MESSAGE_GROUP"
            k17$e r0 = r0.x(r2)
            k17$e r0 = r0.y(r1)
            android.app.Notification r0 = r0.b()
            r1 = 0
            r4.notify(r1, r0)
            r4.notify(r6, r5)
        L50:
            im.threads.business.controllers.UnreadMessagesController r4 = im.threads.business.controllers.UnreadMessagesController.INSTANCE
            r4.incrementUnreadPush()
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.workers.NotificationWorker.notifyUnreadMessagesCountChanged(android.app.NotificationManager, android.app.Notification, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageLoadError(RemoteViews remoteViews, RemoteViews remoteViews2) {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.context.getResources(), R.drawable.ecc_operator_avatar_placeholder);
        int i = R.id.icon_large;
        remoteViews.setImageViewBitmap(i, decodeResource);
        remoteViews2.setImageViewBitmap(i, decodeResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageLoaded(Drawable drawable, RemoteViews remoteViews, RemoteViews remoteViews2, int i) {
        z65.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        remoteViews.setImageViewBitmap(i, bitmap);
        remoteViews2.setImageViewBitmap(i, bitmap);
    }

    public static final void removeNotification(Context context) {
        Companion.removeNotification(context);
    }

    private final void showPreNStyleOperatorAvatar(String str, final RemoteViews remoteViews, final RemoteViews remoteViews2) {
        ImageLoader.Companion.get().load(str).modifications(ImageModifications.CircleCropModification.INSTANCE).callback(new ImageLoader.ImageLoaderCallback() { // from class: im.threads.ui.workers.NotificationWorker$showPreNStyleOperatorAvatar$1
            @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
            public void onBitmapLoaded(Bitmap bitmap) {
                Context context;
                z65.h(bitmap, "bitmap");
                NotificationWorker notificationWorker = NotificationWorker.this;
                context = notificationWorker.context;
                Resources resources = context.getResources();
                z65.g(resources, "context.resources");
                notificationWorker.onImageLoaded(new BitmapDrawable(resources, bitmap), remoteViews, remoteViews2, R.id.icon_large);
            }

            @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
            public void onImageLoadError() {
                NotificationWorker.this.onImageLoadError(remoteViews, remoteViews2);
            }

            @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
            public void onImageLoaded() {
                ImageLoader.ImageLoaderCallback.DefaultImpls.onImageLoaded(this);
            }
        }).getBitmap(this.context);
    }

    private final void showPreNStyleSmallIcon(RemoteViews remoteViews, RemoteViews remoteViews2, ChatStyle chatStyle) {
        Bitmap bitmapSync = ImageLoader.Companion.get().errorDrawableResourceId(Integer.valueOf(chatStyle.defPushIconResId)).modifications(ImageModifications.CircleCropModification.INSTANCE).getBitmapSync(this.context);
        if (bitmapSync != null) {
            int i = R.id.icon_small_corner;
            remoteViews.setImageViewBitmap(i, bitmapSync);
            remoteViews2.setImageViewBitmap(i, bitmapSync);
        }
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        Parcel parcel;
        Config companion = Config.Companion.getInstance();
        Object systemService = this.context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (systemService instanceof NotificationManager) {
            final NotificationManager notificationManager = (NotificationManager) systemService;
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                createNotificationChannel(this.context);
            }
            String m = getInputData().m(NOTIFICATION_ACTION);
            if (m != null) {
                switch (m.hashCode()) {
                    case -511077226:
                        if (m.equals(ACTION_ADD_UNSENT_MESSAGE)) {
                            notifyAboutUnsent(notificationManager, getInputData().m(EXTRA_APP_MARKER), companion);
                            break;
                        }
                        break;
                    case 218765031:
                        if (m.equals(ACTION_REMOVE_NOTIFICATION)) {
                            notificationManager.cancel(0);
                            notificationManager.cancel(2);
                            break;
                        }
                        break;
                    case 769015956:
                        if (m.equals(ACTION_ADD_UNREAD_MESSAGE)) {
                            final int k = getInputData().k(EXTRA_NOTIFICATION_ID, 0);
                            String m2 = getInputData().m(EXTRA_MESSAGE);
                            if (i < 24) {
                                b inputData = getInputData();
                                z65.g(inputData, "inputData");
                                notifyUnreadMessagesCountChanged(notificationManager, getPreNStyleNotification(inputData, null, m2, companion), k);
                                break;
                            } else {
                                b inputData2 = getInputData();
                                z65.g(inputData2, "inputData");
                                getNStyleNotification(inputData2, null, new xr1() { // from class: f37
                                    @Override // defpackage.xr1
                                    public final void accept(Object obj) {
                                        NotificationWorker.doWork$lambda$3$lambda$0(NotificationWorker.this, notificationManager, k, (Notification) obj);
                                    }
                                }, m2, companion);
                                break;
                            }
                        }
                        break;
                    case 1073569129:
                        if (m.equals(ACTION_ADD_UNREAD_MESSAGE_LIST)) {
                            byte[] j = getInputData().j(EXTRA_MESSAGE_CONTENT);
                            if (j != null) {
                                WorkerUtils workerUtils = WorkerUtils.INSTANCE;
                                z65.g(j, "it");
                                parcel = workerUtils.unmarshall(j);
                            } else {
                                parcel = null;
                            }
                            MessageFormatter.MessageContent createFromParcel = MessageFormatter.MessageContent.CREATOR.createFromParcel(parcel);
                            z65.g(createFromParcel, "CREATOR.createFromParcel(data)");
                            MessageFormatter.MessageContent messageContent = createFromParcel;
                            if (i < 24) {
                                b inputData3 = getInputData();
                                z65.g(inputData3, "inputData");
                                notifyUnreadMessagesCountChanged(notificationManager, getPreNStyleNotification(inputData3, messageContent, null, companion), new Date().hashCode());
                                break;
                            } else {
                                b inputData4 = getInputData();
                                z65.g(inputData4, "inputData");
                                getNStyleNotification(inputData4, messageContent, new xr1() { // from class: g37
                                    @Override // defpackage.xr1
                                    public final void accept(Object obj) {
                                        NotificationWorker.doWork$lambda$3$lambda$2(NotificationWorker.this, notificationManager, (Notification) obj);
                                    }
                                }, null, companion);
                                break;
                            }
                        }
                        break;
                    case 1235254709:
                        if (m.equals(ACTION_ADD_CAMPAIGN_MESSAGE)) {
                            notifyAboutCampaign(notificationManager, getInputData().m(EXTRA_CAMPAIGN_MESSAGE), companion);
                            break;
                        }
                        break;
                }
            }
            ListenableWorker.a c = ListenableWorker.a.c();
            if (c == null) {
                ListenableWorker.a a = ListenableWorker.a.a();
                z65.g(a, "failure()");
                return a;
            }
            return c;
        }
        ListenableWorker.a a2 = ListenableWorker.a.a();
        z65.g(a2, "failure()");
        return a2;
    }
}
