package im.threads.ui;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.Gson;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.CampaignMessageKt;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.Preferences$save$1;
import im.threads.business.preferences.PreferencesCoreKeys;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.PushMessageAttributes;
import im.threads.ui.workers.NotificationWorker;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChatCenterPushMessageHelper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ$\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lim/threads/ui/ChatCenterPushMessageHelper;", "", "", "token", "", "setFcmToken", "setHcmToken", "", "data", "process", "Landroid/os/Bundle;", "bundle", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "setInternalFcmToken$threads_release", "(Ljava/lang/String;)V", "setInternalFcmToken", "setInternalHcmToken$threads_release", "setInternalHcmToken", "processPush$threads_release", "(Landroid/content/Context;Landroid/os/Bundle;)V", "processPush", "Lim/threads/business/preferences/Preferences;", "preferences$delegate", "Lrn5;", "getPreferences", "()Lim/threads/business/preferences/Preferences;", "preferences", "<init>", "()V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatCenterPushMessageHelper {
    public static final Companion Companion = new Companion(null);
    private static cr6<String> fcmTokenStateFlow;
    private static cr6<String> hcmTokenStateFlow;
    private static cr6<Bundle> pushBundleStateFlow;
    private final rn5 preferences$delegate;

    /* compiled from: ChatCenterPushMessageHelper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR*\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\t¨\u0006\u0013"}, d2 = {"Lim/threads/ui/ChatCenterPushMessageHelper$Companion;", "", "Lcr6;", "", "fcmTokenStateFlow", "Lcr6;", "getFcmTokenStateFlow$threads_release", "()Lcr6;", "setFcmTokenStateFlow$threads_release", "(Lcr6;)V", "hcmTokenStateFlow", "getHcmTokenStateFlow$threads_release", "setHcmTokenStateFlow$threads_release", "Landroid/os/Bundle;", "pushBundleStateFlow", "getPushBundleStateFlow$threads_release", "setPushBundleStateFlow$threads_release", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cr6<String> getFcmTokenStateFlow$threads_release() {
            return ChatCenterPushMessageHelper.fcmTokenStateFlow;
        }

        public final cr6<String> getHcmTokenStateFlow$threads_release() {
            return ChatCenterPushMessageHelper.hcmTokenStateFlow;
        }

        public final cr6<Bundle> getPushBundleStateFlow$threads_release() {
            return ChatCenterPushMessageHelper.pushBundleStateFlow;
        }

        public final void setFcmTokenStateFlow$threads_release(cr6<String> cr6Var) {
            z65.h(cr6Var, "<set-?>");
            ChatCenterPushMessageHelper.fcmTokenStateFlow = cr6Var;
        }

        public final void setHcmTokenStateFlow$threads_release(cr6<String> cr6Var) {
            z65.h(cr6Var, "<set-?>");
            ChatCenterPushMessageHelper.hcmTokenStateFlow = cr6Var;
        }

        public final void setPushBundleStateFlow$threads_release(cr6<Bundle> cr6Var) {
            z65.h(cr6Var, "<set-?>");
            ChatCenterPushMessageHelper.pushBundleStateFlow = cr6Var;
        }
    }

    static {
        zg0 zg0Var = zg0.DROP_OLDEST;
        fcmTokenStateFlow = uha.b(1, 0, zg0Var, 2, null);
        hcmTokenStateFlow = uha.b(1, 0, zg0Var, 2, null);
        pushBundleStateFlow = uha.b(1, 0, zg0Var, 2, null);
    }

    public ChatCenterPushMessageHelper() {
        rn5 b;
        b = yn5.b(ChatCenterPushMessageHelper$special$$inlined$inject$1.INSTANCE);
        this.preferences$delegate = b;
    }

    private final Preferences getPreferences() {
        return (Preferences) this.preferences$delegate.getValue();
    }

    public final void process(Map<String, String> map) {
        List y;
        z65.h(map, "data");
        y = i86.y(map);
        Pair[] pairArr = (Pair[]) y.toArray(new Pair[0]);
        process(zh0.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }

    public final void processPush$threads_release(Context context, Bundle bundle) {
        boolean v;
        String str;
        String str2;
        String str3;
        long j;
        Date date;
        int i;
        int i2;
        String str4;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(bundle, "bundle");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(CampaignMessageKt.CAMPAIGN_DATE_FORMAT_PARSE, Locale.getDefault());
        v = l0b.v("threads", bundle.getString(PushMessageAttributes.ORIGIN), true);
        if (v) {
            if (bundle.containsKey(PushMessageAttributes.GATE_MESSAGE_ID)) {
                String string = bundle.getString(PushMessageAttributes.ALERT);
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("campaign");
                if (string2 == null) {
                    str = "";
                } else {
                    str = string2;
                }
                String string3 = bundle.getString(PushMessageAttributes.SENDER_NAME);
                if (string3 == null) {
                    str2 = "";
                } else {
                    str2 = string3;
                }
                Date date2 = new Date();
                String string4 = bundle.getString(PushMessageAttributes.CHAT_MESSAGE_ID);
                if (string4 == null) {
                    str3 = "";
                } else {
                    str3 = string4;
                }
                String string5 = bundle.getString(PushMessageAttributes.GATE_MESSAGE_ID);
                if (string5 != null) {
                    j = Long.parseLong(string5);
                } else {
                    j = 0;
                }
                long j2 = j;
                String string6 = bundle.getString("expiredAt");
                if (string6 != null) {
                    date = simpleDateFormat.parse(string6);
                } else {
                    date = null;
                }
                if (date == null) {
                    date = new Date();
                }
                Date date3 = date;
                String string7 = bundle.getString(MessageAttributes.SKILL_ID);
                if (string7 != null) {
                    i = Integer.parseInt(string7);
                } else {
                    i = 0;
                }
                String string8 = bundle.getString("priority");
                if (string8 != null) {
                    i2 = Integer.parseInt(string8);
                } else {
                    i2 = 0;
                }
                CampaignMessage campaignMessage = new CampaignMessage(string, str2, date2, str3, j2, date3, i, str, i2);
                Preferences preferences = getPreferences();
                String campaign_message = PreferencesCoreKeys.INSTANCE.getCAMPAIGN_MESSAGE();
                if (campaignMessage instanceof String) {
                    str4 = (String) campaignMessage;
                } else {
                    str4 = new Gson().t(campaignMessage).toString();
                }
                Preferences.Companion.savePreferenceToRam(campaign_message, str4);
                sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, campaign_message, str4, null), 3, null);
                NotificationWorker.Companion.addCampaignMessage(context, string);
                LoggerEdna.info("campaign message handled: " + campaignMessage);
                return;
            } else if (!bundle.containsKey("message") && !bundle.containsKey(PushMessageAttributes.ALERT)) {
                LoggerEdna.info("unparsed message with origin=threads ");
                return;
            } else {
                String str5 = (String) bundle.get(PushMessageAttributes.OPERATOR_URL);
                String str6 = (String) bundle.get("appMarker");
                String str7 = (String) bundle.get("message");
                if (str7 == null) {
                    str7 = (String) bundle.get(PushMessageAttributes.ALERT);
                }
                String str8 = str7;
                NotificationWorker.Companion.addUnreadMessage(context, new Date().hashCode(), str8, str5, str6);
                LoggerEdna.info("text message handled: " + str8);
                return;
            }
        }
        LoggerEdna.info("origin=threads not found in bundle");
    }

    public final void setFcmToken(String str) {
        fcmTokenStateFlow.a(str);
    }

    public final void setHcmToken(String str) {
        hcmTokenStateFlow.a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x015a, code lost:
        if (defpackage.z65.c(r4, "null") != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setInternalFcmToken$threads_release(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.ChatCenterPushMessageHelper.setInternalFcmToken$threads_release(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x015a, code lost:
        if (defpackage.z65.c(r4, "null") != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setInternalHcmToken$threads_release(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.ChatCenterPushMessageHelper.setInternalHcmToken$threads_release(java.lang.String):void");
    }

    public final void process(Bundle bundle) {
        z65.h(bundle, "bundle");
        pushBundleStateFlow.a(bundle);
    }

    public final void process(Context context, Map<String, String> map) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(map, "data");
        process(map);
    }

    public final void process(Context context, Bundle bundle) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(bundle, "bundle");
        process(bundle);
    }
}
