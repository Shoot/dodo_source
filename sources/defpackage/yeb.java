package defpackage;

import im.threads.business.core.UnreadMessagesCountListener;
/* compiled from: ThreadsLibDomainModule_ProvideThreadsLibUnreadMessagesCountListener$chat_releaseFactory.java */
/* renamed from: yeb  reason: default package */
/* loaded from: classes.dex */
public final class yeb implements no3<UnreadMessagesCountListener> {
    private final as8<jfb> a;

    public yeb(as8<jfb> as8Var) {
        this.a = as8Var;
    }

    public static yeb a(as8<jfb> as8Var) {
        return new yeb(as8Var);
    }

    public static UnreadMessagesCountListener c(jfb jfbVar) {
        return (UnreadMessagesCountListener) jh8.e(peb.a.i(jfbVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public UnreadMessagesCountListener get() {
        return c(this.a.get());
    }
}
