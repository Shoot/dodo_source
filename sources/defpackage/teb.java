package defpackage;

import im.threads.ui.ChatStyle;
/* compiled from: ThreadsLibDomainModule_ProvideThreadsLibChatStyle$chat_releaseFactory.java */
/* renamed from: teb  reason: default package */
/* loaded from: classes.dex */
public final class teb implements no3<ChatStyle> {

    /* compiled from: ThreadsLibDomainModule_ProvideThreadsLibChatStyle$chat_releaseFactory.java */
    /* renamed from: teb$a */
    /* loaded from: classes.dex */
    private static final class a {
        private static final teb a = new teb();
    }

    public static teb a() {
        return a.a;
    }

    public static ChatStyle c() {
        return (ChatStyle) jh8.e(peb.a.d());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ChatStyle get() {
        return c();
    }
}
