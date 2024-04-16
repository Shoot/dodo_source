package defpackage;
/* renamed from: ee3  reason: default package */
/* loaded from: classes3.dex */
public class ee3 extends ux {
    private ie3 b;

    /* JADX INFO: Access modifiers changed from: protected */
    public ee3(boolean z, ie3 ie3Var) {
        super(z);
        this.b = ie3Var;
    }

    public ie3 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ee3)) {
            return false;
        }
        ie3 ie3Var = this.b;
        ie3 b = ((ee3) obj).b();
        if (ie3Var == null) {
            if (b != null) {
                return false;
            }
            return true;
        }
        return ie3Var.equals(b);
    }

    public int hashCode() {
        ie3 ie3Var = this.b;
        if (ie3Var != null) {
            return ie3Var.hashCode();
        }
        return 0;
    }
}
