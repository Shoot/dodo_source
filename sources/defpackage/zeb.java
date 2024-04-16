package defpackage;

import im.threads.business.controllers.UnreadMessagesController;
/* compiled from: ThreadsLibDomainModule_ProvideThreadsLibUnreadMessagesCounter$chat_releaseFactory.java */
/* renamed from: zeb  reason: default package */
/* loaded from: classes.dex */
public final class zeb implements no3<kfb> {
    private final as8<UnreadMessagesController> a;

    public zeb(as8<UnreadMessagesController> as8Var) {
        this.a = as8Var;
    }

    public static zeb a(as8<UnreadMessagesController> as8Var) {
        return new zeb(as8Var);
    }

    public static kfb c(UnreadMessagesController unreadMessagesController) {
        return (kfb) jh8.e(peb.a.j(unreadMessagesController));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public kfb get() {
        return c(this.a.get());
    }
}
