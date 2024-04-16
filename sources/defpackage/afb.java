package defpackage;

import im.threads.business.controllers.UnreadMessagesController;
/* compiled from: ThreadsLibDomainModule_ProvideUnreadMessagesController$chat_releaseFactory.java */
/* renamed from: afb  reason: default package */
/* loaded from: classes.dex */
public final class afb implements no3<UnreadMessagesController> {

    /* compiled from: ThreadsLibDomainModule_ProvideUnreadMessagesController$chat_releaseFactory.java */
    /* renamed from: afb$a */
    /* loaded from: classes.dex */
    private static final class a {
        private static final afb a = new afb();
    }

    public static afb a() {
        return a.a;
    }

    public static UnreadMessagesController c() {
        return (UnreadMessagesController) jh8.e(peb.a.k());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public UnreadMessagesController get() {
        return c();
    }
}
