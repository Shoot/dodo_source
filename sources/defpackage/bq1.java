package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import im.threads.business.core.UnreadMessagesCountListener;
import im.threads.business.logger.LoggerConfig;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.ConfigBuilder;
import kotlin.Metadata;
/* compiled from: configs.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\b\u0010\r\u001a\u00020\fH\u0000¨\u0006\u000e"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmh0;", "buildInfo", "Loeb;", "threadsLibContextLocaleFix", "Lim/threads/business/core/UnreadMessagesCountListener;", "unreadMessagesCountListener", "Lim/threads/ui/config/ConfigBuilder;", "b", "Lim/threads/business/logger/LoggerConfig;", c.a, "Lim/threads/ui/ChatStyle;", "a", "chat_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: bq1  reason: default package */
/* loaded from: classes.dex */
public final class bq1 {
    public static final ChatStyle a() {
        ChatStyle chatErrorScreenStyle = new ChatStyle().setChatSubtitleShowConsultOrgUnit(true).setCanShowSpecialistInfo(false).setShowConsultSearching(false).showChatBackButton(true).enableLinkPreview().setScrollChatToEndIfUserTyping(false).setInputEnabledDuringQuickReplies(true).setChatErrorScreenStyle(null, null, null, null, Integer.valueOf(kw8.a), null, null);
        z65.g(chatErrorScreenStyle, "setChatErrorScreenStyle(...)");
        return chatErrorScreenStyle;
    }

    public static final ConfigBuilder b(Context context, mh0 mh0Var, oeb oebVar, UnreadMessagesCountListener unreadMessagesCountListener) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(mh0Var, "buildInfo");
        z65.h(oebVar, "threadsLibContextLocaleFix");
        z65.h(unreadMessagesCountListener, "unreadMessagesCountListener");
        ConfigBuilder isDebugLoggingEnabled = new ConfigBuilder(oebVar.b(context)).showAttachmentsButton().surveyCompletionDelay(10000).unreadMessagesCountListener(unreadMessagesCountListener).isDebugLoggingEnabled(mh0Var.i());
        if (mh0Var.i()) {
            isDebugLoggingEnabled.enableLogging(c(context));
        }
        return isDebugLoggingEnabled;
    }

    private static final LoggerConfig c(Context context) {
        return new LoggerConfig.Builder(context).build();
    }
}
