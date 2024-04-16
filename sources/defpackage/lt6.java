package defpackage;
/* compiled from: NativeChatDomainModule_ProvideThreadsLibAppMarkerCreator$chat_releaseFactory.java */
/* renamed from: lt6  reason: default package */
/* loaded from: classes.dex */
public final class lt6 implements no3<jeb> {
    private final as8<mh0> a;

    public lt6(as8<mh0> as8Var) {
        this.a = as8Var;
    }

    public static lt6 a(as8<mh0> as8Var) {
        return new lt6(as8Var);
    }

    public static jeb c(mh0 mh0Var) {
        return (jeb) jh8.e(ht6.a.d(mh0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jeb get() {
        return c(this.a.get());
    }
}
