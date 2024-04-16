package defpackage;
/* renamed from: d72  reason: default package */
/* loaded from: classes3.dex */
public class d72 extends ux {
    private h72 b;

    /* JADX INFO: Access modifiers changed from: protected */
    public d72(boolean z, h72 h72Var) {
        super(z);
        this.b = h72Var;
    }

    public h72 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d72)) {
            return false;
        }
        h72 h72Var = this.b;
        h72 b = ((d72) obj).b();
        if (h72Var == null) {
            if (b != null) {
                return false;
            }
            return true;
        }
        return h72Var.equals(b);
    }

    public int hashCode() {
        int i = !a();
        h72 h72Var = this.b;
        if (h72Var != null) {
            return i ^ h72Var.hashCode();
        }
        return i;
    }
}
