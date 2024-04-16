package defpackage;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.k;
/* renamed from: gb4  reason: default package */
/* loaded from: classes3.dex */
public class gb4 implements AlgorithmParameterSpec, kb4 {
    private qb4 a;
    private String b;
    private String c;
    private String d;

    public gb4(qb4 qb4Var) {
        this.a = qb4Var;
        this.c = y22.p.H();
        this.d = null;
    }

    public static gb4 e(pb4 pb4Var) {
        if (pb4Var.u() != null) {
            return new gb4(pb4Var.w().H(), pb4Var.t().H(), pb4Var.u().H());
        }
        return new gb4(pb4Var.w().H(), pb4Var.t().H());
    }

    @Override // defpackage.kb4
    public qb4 a() {
        return this.a;
    }

    @Override // defpackage.kb4
    public String b() {
        return this.d;
    }

    @Override // defpackage.kb4
    public String c() {
        return this.b;
    }

    @Override // defpackage.kb4
    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gb4)) {
            return false;
        }
        gb4 gb4Var = (gb4) obj;
        if (!this.a.equals(gb4Var.a) || !this.c.equals(gb4Var.c)) {
            return false;
        }
        String str = this.d;
        String str2 = gb4Var.d;
        if (str != str2 && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ this.c.hashCode();
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public gb4(String str) {
        this(str, y22.p.H(), null);
    }

    public gb4(String str, String str2) {
        this(str, str2, null);
    }

    public gb4(String str, String str2, String str3) {
        fb4 fb4Var;
        try {
            fb4Var = eb4.a(new k(str));
        } catch (IllegalArgumentException unused) {
            k b = eb4.b(str);
            if (b != null) {
                str = b.H();
                fb4Var = eb4.a(b);
            } else {
                fb4Var = null;
            }
        }
        if (fb4Var == null) {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        }
        this.a = new qb4(fb4Var.u(), fb4Var.v(), fb4Var.t());
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
