package defpackage;
/* renamed from: xa3  reason: default package */
/* loaded from: classes3.dex */
public class xa3 extends ux {
    private final la3 b;

    /* JADX INFO: Access modifiers changed from: protected */
    public xa3(boolean z, la3 la3Var) {
        super(z);
        if (la3Var != null) {
            this.b = la3Var;
            return;
        }
        throw new NullPointerException("'parameters' cannot be null");
    }

    public la3 b() {
        return this.b;
    }
}
