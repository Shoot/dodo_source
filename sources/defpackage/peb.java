package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.controllers.UnreadMessagesController;
import im.threads.business.core.UnreadMessagesCountListener;
import im.threads.ui.ChatCenterPushMessageHelper;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.ConfigBuilder;
import im.threads.ui.core.ThreadsLib;
import kotlin.Metadata;
/* compiled from: ThreadsLibDomainModule.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 J/\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u001eH\u0001¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b.\u0010/¨\u00062"}, d2 = {"Lpeb;", "", "Lhq3;", "featureService", "Lwt6;", "b", "(Lhq3;)Lwt6;", "Lim/threads/ui/ChatCenterPushMessageHelper;", "chatCenterPushMessageHelper", "Lhfb;", "g", "(Lim/threads/ui/ChatCenterPushMessageHelper;)Lhfb;", "a", "()Lim/threads/ui/ChatCenterPushMessageHelper;", "Lih;", "androidLanguageManager", "Loeb;", "f", "(Lih;)Loeb;", "Lim/threads/business/controllers/UnreadMessagesController;", "k", "()Lim/threads/business/controllers/UnreadMessagesController;", "unreadMessagesController", "Lkfb;", "j", "(Lim/threads/business/controllers/UnreadMessagesController;)Lkfb;", "Ljfb;", Image.TYPE_HIGH, "()Ljfb;", "count", "Lim/threads/business/core/UnreadMessagesCountListener;", "i", "(Ljfb;)Lim/threads/business/core/UnreadMessagesCountListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmh0;", "buildInfo", "threadsLibContextLocaleFix", "unreadMessagesCountListener", "Lim/threads/ui/config/ConfigBuilder;", e.a, "(Landroid/content/Context;Lmh0;Loeb;Lim/threads/business/core/UnreadMessagesCountListener;)Lim/threads/ui/config/ConfigBuilder;", "Lim/threads/ui/ChatStyle;", DateTokenConverter.CONVERTER_KEY, "()Lim/threads/ui/ChatStyle;", "Lim/threads/ui/core/ThreadsLib;", c.a, "()Lim/threads/ui/core/ThreadsLib;", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: peb  reason: default package */
/* loaded from: classes.dex */
public final class peb {
    public static final peb a = new peb();

    private peb() {
    }

    public final ChatCenterPushMessageHelper a() {
        return new ChatCenterPushMessageHelper();
    }

    public final wt6 b(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        return new xt6(hq3Var);
    }

    public final ThreadsLib c() {
        return ThreadsLib.Companion.getInstance();
    }

    public final ChatStyle d() {
        return bq1.a();
    }

    public final ConfigBuilder e(Context context, mh0 mh0Var, oeb oebVar, UnreadMessagesCountListener unreadMessagesCountListener) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(mh0Var, "buildInfo");
        z65.h(oebVar, "threadsLibContextLocaleFix");
        z65.h(unreadMessagesCountListener, "unreadMessagesCountListener");
        return bq1.b(context, mh0Var, oebVar, unreadMessagesCountListener);
    }

    public final oeb f(ih ihVar) {
        z65.h(ihVar, "androidLanguageManager");
        return new oeb(ihVar);
    }

    public final hfb g(ChatCenterPushMessageHelper chatCenterPushMessageHelper) {
        z65.h(chatCenterPushMessageHelper, "chatCenterPushMessageHelper");
        return new ifb(chatCenterPushMessageHelper);
    }

    public final jfb h() {
        return new jfb();
    }

    public final UnreadMessagesCountListener i(jfb jfbVar) {
        z65.h(jfbVar, "count");
        return jfbVar;
    }

    public final kfb j(UnreadMessagesController unreadMessagesController) {
        z65.h(unreadMessagesController, "unreadMessagesController");
        return new lfb(unreadMessagesController);
    }

    public final UnreadMessagesController k() {
        return UnreadMessagesController.INSTANCE;
    }
}
