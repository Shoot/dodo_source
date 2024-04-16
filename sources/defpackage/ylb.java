package defpackage;

import java.util.Set;
/* compiled from: TransportFactoryImpl.java */
/* renamed from: ylb  reason: default package */
/* loaded from: classes2.dex */
final class ylb implements xlb {
    private final Set<eh3> a;
    private final wlb b;
    private final cmb c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ylb(Set<eh3> set, wlb wlbVar, cmb cmbVar) {
        this.a = set;
        this.b = wlbVar;
        this.c = cmbVar;
    }

    @Override // defpackage.xlb
    public <T> ulb<T> a(String str, Class<T> cls, eh3 eh3Var, zkb<T, byte[]> zkbVar) {
        if (this.a.contains(eh3Var)) {
            return new amb(this.b, str, eh3Var, zkbVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", eh3Var, this.a));
    }
}
