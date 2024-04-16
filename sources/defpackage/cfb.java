package defpackage;

import im.threads.ui.ChatStyle;
import im.threads.ui.config.ConfigBuilder;
import im.threads.ui.core.ThreadsLib;
/* compiled from: ThreadsLibInitializer_Factory.java */
/* renamed from: cfb  reason: default package */
/* loaded from: classes.dex */
public final class cfb implements no3<bfb> {
    private final as8<ConfigBuilder> a;
    private final as8<ChatStyle> b;
    private final as8<ThreadsLib> c;

    public cfb(as8<ConfigBuilder> as8Var, as8<ChatStyle> as8Var2, as8<ThreadsLib> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static cfb a(as8<ConfigBuilder> as8Var, as8<ChatStyle> as8Var2, as8<ThreadsLib> as8Var3) {
        return new cfb(as8Var, as8Var2, as8Var3);
    }

    public static bfb c(as8<ConfigBuilder> as8Var, as8<ChatStyle> as8Var2, as8<ThreadsLib> as8Var3) {
        return new bfb(as8Var, as8Var2, as8Var3);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bfb get() {
        return c(this.a, this.b, this.c);
    }
}
