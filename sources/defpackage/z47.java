package defpackage;
/* compiled from: ObjectIdGenerators.java */
/* renamed from: z47  reason: default package */
/* loaded from: classes2.dex */
abstract class z47<T> extends y47<T> {
    protected final Class<?> a;

    /* JADX INFO: Access modifiers changed from: protected */
    public z47(Class<?> cls) {
        this.a = cls;
    }

    @Override // defpackage.y47
    public boolean a(y47<?> y47Var) {
        if (y47Var.getClass() == getClass() && y47Var.d() == this.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y47
    public Class<?> d() {
        return this.a;
    }
}
