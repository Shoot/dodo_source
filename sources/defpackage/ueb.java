package defpackage;

import android.content.Context;
import im.threads.business.core.UnreadMessagesCountListener;
import im.threads.ui.config.ConfigBuilder;
/* compiled from: ThreadsLibDomainModule_ProvideThreadsLibConfig$chat_releaseFactory.java */
/* renamed from: ueb  reason: default package */
/* loaded from: classes.dex */
public final class ueb implements no3<ConfigBuilder> {
    private final as8<Context> a;
    private final as8<mh0> b;
    private final as8<oeb> c;
    private final as8<UnreadMessagesCountListener> d;

    public ueb(as8<Context> as8Var, as8<mh0> as8Var2, as8<oeb> as8Var3, as8<UnreadMessagesCountListener> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static ueb a(as8<Context> as8Var, as8<mh0> as8Var2, as8<oeb> as8Var3, as8<UnreadMessagesCountListener> as8Var4) {
        return new ueb(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static ConfigBuilder c(Context context, mh0 mh0Var, oeb oebVar, UnreadMessagesCountListener unreadMessagesCountListener) {
        return (ConfigBuilder) jh8.e(peb.a.e(context, mh0Var, oebVar, unreadMessagesCountListener));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ConfigBuilder get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
