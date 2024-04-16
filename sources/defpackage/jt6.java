package defpackage;
/* compiled from: NativeChatDomainModule_ProvideNativeChatUnreadMessagesCount$chat_releaseFactory.java */
/* renamed from: jt6  reason: default package */
/* loaded from: classes.dex */
public final class jt6 implements no3<zt6> {
    private final as8<jfb> a;

    public jt6(as8<jfb> as8Var) {
        this.a = as8Var;
    }

    public static jt6 a(as8<jfb> as8Var) {
        return new jt6(as8Var);
    }

    public static zt6 c(jfb jfbVar) {
        return (zt6) jh8.e(ht6.a.b(jfbVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zt6 get() {
        return c(this.a.get());
    }
}
