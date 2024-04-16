package com.google.firebase.installations;
/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes2.dex */
class d implements g {
    private final h a;
    private final a7b<f> b;

    public d(h hVar, a7b<f> a7bVar) {
        this.a = hVar;
        this.b = a7bVar;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        this.b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(zy7 zy7Var) {
        if (zy7Var.k() && !this.a.f(zy7Var)) {
            this.b.c(f.a().b(zy7Var.b()).d(zy7Var.c()).c(zy7Var.h()).a());
            return true;
        }
        return false;
    }
}
