package defpackage;

import im.threads.ui.core.ThreadsLib;
/* compiled from: NativeChatDomainModule_ProvideNativeChatMessenger$chat_releaseFactory.java */
/* renamed from: it6  reason: default package */
/* loaded from: classes.dex */
public final class it6 implements no3<st6> {
    private final as8<ThreadsLib> a;

    public it6(as8<ThreadsLib> as8Var) {
        this.a = as8Var;
    }

    public static it6 a(as8<ThreadsLib> as8Var) {
        return new it6(as8Var);
    }

    public static st6 c(as8<ThreadsLib> as8Var) {
        return (st6) jh8.e(ht6.a.a(as8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public st6 get() {
        return c(this.a);
    }
}
