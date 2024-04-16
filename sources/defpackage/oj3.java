package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ta5;
import java.io.IOException;
import java.util.Objects;
/* compiled from: EnumSerializer.java */
@o85
/* renamed from: oj3  reason: default package */
/* loaded from: classes2.dex */
public class oj3 extends bxa<Enum<?>> implements bv1 {
    protected final qj3 c;
    protected final Boolean d;

    public oj3(qj3 qj3Var, Boolean bool) {
        super(qj3Var.c(), false);
        this.c = qj3Var;
        this.d = bool;
    }

    protected static Boolean G(Class<?> cls, ta5.d dVar, boolean z, Boolean bool) {
        ta5.c j;
        String str;
        if (dVar == null) {
            j = null;
        } else {
            j = dVar.j();
        }
        if (j == null) {
            return bool;
        }
        if (j != ta5.c.ANY && j != ta5.c.SCALAR) {
            if (j != ta5.c.STRING && j != ta5.c.NATURAL) {
                if (!j.a() && j != ta5.c.ARRAY) {
                    Object[] objArr = new Object[3];
                    objArr[0] = j;
                    objArr[1] = cls.getName();
                    if (z) {
                        str = Action.CLASS_ATTRIBUTE;
                    } else {
                        str = "property";
                    }
                    objArr[2] = str;
                    throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", objArr));
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return bool;
    }

    public static oj3 K(Class<?> cls, pca pcaVar, fa0 fa0Var, ta5.d dVar) {
        return new oj3(qj3.b(pcaVar, cls), G(cls, dVar, true, null));
    }

    protected final boolean H(bda bdaVar) {
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return bdaVar.M0(qca.WRITE_ENUMS_USING_INDEX);
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: L */
    public final void f(Enum<?> r2, ua5 ua5Var, bda bdaVar) throws IOException {
        if (H(bdaVar)) {
            ua5Var.o0(r2.ordinal());
        } else if (bdaVar.M0(qca.WRITE_ENUMS_USING_TO_STRING)) {
            ua5Var.q1(r2.toString());
        } else {
            ua5Var.o1(this.c.d(r2));
        }
    }

    @Override // defpackage.bv1
    public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
        ta5.d s = s(bdaVar, ia0Var, c());
        if (s != null) {
            Boolean G = G(c(), s, false, this.d);
            if (!Objects.equals(G, this.d)) {
                return new oj3(this.c, G);
            }
        }
        return this;
    }
}
