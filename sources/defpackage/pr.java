package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ta5;
import java.io.IOException;
import java.util.Objects;
/* compiled from: ArraySerializerBase.java */
/* renamed from: pr  reason: default package */
/* loaded from: classes2.dex */
public abstract class pr<T> extends ct1<T> implements bv1 {
    protected final ia0 c;
    protected final Boolean d;

    /* JADX INFO: Access modifiers changed from: protected */
    public pr(Class<T> cls) {
        super(cls);
        this.c = null;
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean K(bda bdaVar) {
        Boolean bool = this.d;
        if (bool == null) {
            return bdaVar.M0(qca.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        }
        return bool.booleanValue();
    }

    public abstract gc5<?> L(ia0 ia0Var, Boolean bool);

    protected abstract void M(T t, ua5 ua5Var, bda bdaVar) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        ta5.d s;
        if (ia0Var != null && (s = s(bdaVar, ia0Var, c())) != null) {
            Boolean e = s.e(ta5.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
            if (!Objects.equals(e, this.d)) {
                return L(ia0Var, e);
            }
        }
        return this;
    }

    @Override // defpackage.gc5
    public final void i(T t, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.d(t, nc5.START_ARRAY));
        ua5Var.u(t);
        M(t, ua5Var, bdaVar);
        bobVar.h(ua5Var, g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pr(pr<?> prVar, ia0 ia0Var, Boolean bool) {
        super(prVar.a, false);
        this.c = ia0Var;
        this.d = bool;
    }
}
