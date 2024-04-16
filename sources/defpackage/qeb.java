package defpackage;

import im.threads.ui.ChatCenterPushMessageHelper;
/* compiled from: ThreadsLibDomainModule_ProvideChatCenterPushMessageHelper$chat_releaseFactory.java */
/* renamed from: qeb  reason: default package */
/* loaded from: classes.dex */
public final class qeb implements no3<ChatCenterPushMessageHelper> {

    /* compiled from: ThreadsLibDomainModule_ProvideChatCenterPushMessageHelper$chat_releaseFactory.java */
    /* renamed from: qeb$a */
    /* loaded from: classes.dex */
    private static final class a {
        private static final qeb a = new qeb();
    }

    public static qeb a() {
        return a.a;
    }

    public static ChatCenterPushMessageHelper c() {
        return (ChatCenterPushMessageHelper) jh8.e(peb.a.a());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ChatCenterPushMessageHelper get() {
        return c();
    }
}
