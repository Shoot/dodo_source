package defpackage;

import java.io.IOException;
import java.util.Collection;
/* compiled from: StringCollectionSerializer.java */
@o85
/* renamed from: oza  reason: default package */
/* loaded from: classes2.dex */
public class oza extends kwa<Collection<String>> {
    public static final oza d = new oza();

    protected oza() {
        super(Collection.class);
    }

    private final void L(Collection<String> collection, ua5 ua5Var, bda bdaVar) throws IOException {
        int i = 0;
        try {
            for (String str : collection) {
                if (str == null) {
                    bdaVar.G(ua5Var);
                } else {
                    ua5Var.q1(str);
                }
                i++;
            }
        } catch (Exception e) {
            y(bdaVar, e, collection, i);
        }
    }

    @Override // defpackage.kwa
    public gc5<?> G(ia0 ia0Var, Boolean bool) {
        return new oza(this, bool);
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: K */
    public void f(Collection<String> collection, ua5 ua5Var, bda bdaVar) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this.c == null && bdaVar.M0(qca.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.c == Boolean.TRUE)) {
            L(collection, ua5Var, bdaVar);
            return;
        }
        ua5Var.f1(collection, size);
        L(collection, ua5Var, bdaVar);
        ua5Var.W();
    }

    @Override // defpackage.gc5
    /* renamed from: M */
    public void i(Collection<String> collection, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.d(collection, nc5.START_ARRAY));
        ua5Var.u(collection);
        L(collection, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }

    protected oza(oza ozaVar, Boolean bool) {
        super(ozaVar, bool);
    }
}
