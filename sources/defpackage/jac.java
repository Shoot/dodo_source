package defpackage;
/* renamed from: jac  reason: default package */
/* loaded from: classes3.dex */
public abstract class jac {
    private iac a;

    protected abstract iac a();

    public synchronized iac b() {
        try {
            if (this.a == null) {
                this.a = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
