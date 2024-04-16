package defpackage;
/* compiled from: ThreadsLibDomainModule_ProvideNativeChatStateChecker$chat_releaseFactory.java */
/* renamed from: reb  reason: default package */
/* loaded from: classes.dex */
public final class reb implements no3<wt6> {
    private final as8<hq3> a;

    public reb(as8<hq3> as8Var) {
        this.a = as8Var;
    }

    public static reb a(as8<hq3> as8Var) {
        return new reb(as8Var);
    }

    public static wt6 c(hq3 hq3Var) {
        return (wt6) jh8.e(peb.a.b(hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wt6 get() {
        return c(this.a.get());
    }
}
