package defpackage;
/* compiled from: ThematicBreakParser.java */
/* renamed from: pdb  reason: default package */
/* loaded from: classes3.dex */
public class pdb extends x0 {
    private final odb a = new odb();

    /* compiled from: ThematicBreakParser.java */
    /* renamed from: pdb$a */
    /* loaded from: classes3.dex */
    public static class a extends y0 {
        @Override // defpackage.ed0
        public jd0 a(ir7 ir7Var, u96 u96Var) {
            if (ir7Var.d() >= 4) {
                return jd0.c();
            }
            int e = ir7Var.e();
            CharSequence b = ir7Var.b();
            if (pdb.j(b, e)) {
                return jd0.d(new pdb()).b(b.length());
            }
            return jd0.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                if (charAt != '*') {
                    if (charAt != '-') {
                        if (charAt != '_') {
                            return false;
                        }
                        i3++;
                    } else {
                        i2++;
                    }
                } else {
                    i4++;
                }
            }
            i++;
        }
        if ((i2 < 3 || i3 != 0 || i4 != 0) && ((i3 < 3 || i2 != 0 || i4 != 0) && (i4 < 3 || i2 != 0 || i3 != 0))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dd0
    public wc0 e() {
        return this.a;
    }

    @Override // defpackage.dd0
    public ad0 g(ir7 ir7Var) {
        return ad0.d();
    }
}
