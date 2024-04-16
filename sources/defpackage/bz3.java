package defpackage;

import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlgTransport.java */
/* renamed from: bz3  reason: default package */
/* loaded from: classes2.dex */
public final class bz3 {
    private static final sh d = sh.e();
    private final String a;
    private final bs8<xlb> b;
    private ulb<wx7> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bz3(bs8<xlb> bs8Var, String str) {
        this.a = str;
        this.b = bs8Var;
    }

    private boolean a() {
        if (this.c == null) {
            xlb xlbVar = this.b.get();
            if (xlbVar != null) {
                this.c = xlbVar.a(this.a, wx7.class, eh3.b("proto"), new zkb() { // from class: az3
                    @Override // defpackage.zkb
                    public final Object apply(Object obj) {
                        return ((wx7) obj).v();
                    }
                });
            } else {
                d.j("Flg TransportFactory is not available at the moment");
            }
        }
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public void b(@NonNull wx7 wx7Var) {
        if (!a()) {
            d.j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.c.a(pk3.e(wx7Var));
        }
    }
}
