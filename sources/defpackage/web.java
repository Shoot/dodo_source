package defpackage;

import im.threads.ui.ChatCenterPushMessageHelper;
/* compiled from: ThreadsLibDomainModule_ProvideThreadsLibPushService$chat_releaseFactory.java */
/* renamed from: web  reason: default package */
/* loaded from: classes.dex */
public final class web implements no3<hfb> {
    private final as8<ChatCenterPushMessageHelper> a;

    public web(as8<ChatCenterPushMessageHelper> as8Var) {
        this.a = as8Var;
    }

    public static web a(as8<ChatCenterPushMessageHelper> as8Var) {
        return new web(as8Var);
    }

    public static hfb c(ChatCenterPushMessageHelper chatCenterPushMessageHelper) {
        return (hfb) jh8.e(peb.a.g(chatCenterPushMessageHelper));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hfb get() {
        return c(this.a.get());
    }
}
