package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import org.threeten.bp.DateTimeException;
/* compiled from: HijrahChronology.java */
/* renamed from: ko4  reason: default package */
/* loaded from: classes3.dex */
public final class ko4 extends p71 implements Serializable {
    public static final ko4 e = new ko4();
    private static final HashMap<String, String[]> f;
    private static final HashMap<String, String[]> g;
    private static final HashMap<String, String[]> h;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        g = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        h = hashMap3;
        hashMap.put("en", new String[]{"BH", "HE"});
        hashMap2.put("en", new String[]{"B.H.", "H.E."});
        hashMap3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private ko4() {
    }

    private Object readResolve() {
        return e;
    }

    @Override // defpackage.p71
    public j71<lo4> G(q8b q8bVar) {
        return super.G(q8bVar);
    }

    @Override // defpackage.p71
    public n71<lo4> P(b55 b55Var, vcc vccVar) {
        return super.P(b55Var, vccVar);
    }

    @Override // defpackage.p71
    /* renamed from: Q */
    public lo4 i(int i, int i2, int i3) {
        return lo4.k1(i, i2, i3);
    }

    @Override // defpackage.p71
    /* renamed from: T */
    public lo4 k(q8b q8bVar) {
        if (q8bVar instanceof lo4) {
            return (lo4) q8bVar;
        }
        return lo4.m1(q8bVar.q(h71.y));
    }

    @Override // defpackage.p71
    /* renamed from: W */
    public mo4 u(int i) {
        if (i != 0) {
            if (i == 1) {
                return mo4.AH;
            }
            throw new DateTimeException("invalid Hijrah era");
        }
        return mo4.BEFORE_AH;
    }

    public kwb b0(h71 h71Var) {
        return h71Var.s();
    }

    @Override // defpackage.p71
    public String getId() {
        return "Hijrah-umalqura";
    }

    @Override // defpackage.p71
    public String x() {
        return "islamic-umalqura";
    }
}
