package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class r2 implements y2 {
    private y2[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r2(y2... y2VarArr) {
        this.a = y2VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final w2 a(Class<?> cls) {
        y2[] y2VarArr;
        for (y2 y2Var : this.a) {
            if (y2Var.b(cls)) {
                return y2Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final boolean b(Class<?> cls) {
        for (y2 y2Var : this.a) {
            if (y2Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
