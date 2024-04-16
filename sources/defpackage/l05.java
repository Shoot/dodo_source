package defpackage;

import java.io.IOException;
import java.util.List;
/* compiled from: IndexedStringListSerializer.java */
@o85
/* renamed from: l05  reason: default package */
/* loaded from: classes2.dex */
public final class l05 extends kwa<List<String>> {
    public static final l05 d = new l05();

    protected l05() {
        super(List.class);
    }

    private final void L(List<String> list, ua5 ua5Var, bda bdaVar, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            try {
                String str = list.get(i2);
                if (str == null) {
                    bdaVar.G(ua5Var);
                } else {
                    ua5Var.q1(str);
                }
            } catch (Exception e) {
                y(bdaVar, e, list, i2);
                return;
            }
        }
    }

    @Override // defpackage.kwa
    public gc5<?> G(ia0 ia0Var, Boolean bool) {
        return new l05(this, bool);
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: K */
    public void f(List<String> list, ua5 ua5Var, bda bdaVar) throws IOException {
        int size = list.size();
        if (size == 1 && ((this.c == null && bdaVar.M0(qca.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.c == Boolean.TRUE)) {
            L(list, ua5Var, bdaVar, 1);
            return;
        }
        ua5Var.f1(list, size);
        L(list, ua5Var, bdaVar, size);
        ua5Var.W();
    }

    @Override // defpackage.gc5
    /* renamed from: M */
    public void i(List<String> list, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.d(list, nc5.START_ARRAY));
        ua5Var.u(list);
        L(list, ua5Var, bdaVar, list.size());
        bobVar.h(ua5Var, g);
    }

    public l05(l05 l05Var, Boolean bool) {
        super(l05Var, bool);
    }
}
