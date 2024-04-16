package com.google.firebase.installations;
/* compiled from: GetIdListener.java */
/* loaded from: classes2.dex */
class e implements g {
    final a7b<String> a;

    public e(a7b<String> a7bVar) {
        this.a = a7bVar;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(zy7 zy7Var) {
        if (!zy7Var.l() && !zy7Var.k() && !zy7Var.i()) {
            return false;
        }
        this.a.e(zy7Var.d());
        return true;
    }
}
