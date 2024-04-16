package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.io.Serializable;
/* compiled from: DeserializationContext.java */
/* renamed from: x03  reason: default package */
/* loaded from: classes2.dex */
public abstract class x03 extends om2 implements Serializable {
    protected final z03 a;
    protected final a13 b;
    protected final w03 c;
    protected final int d;
    protected final m85<vya> e;
    protected final Class<?> f;
    protected transient ob5 g;
    protected transient gu1 h;

    /* JADX INFO: Access modifiers changed from: protected */
    public x03(a13 a13Var, z03 z03Var) {
        if (a13Var != null) {
            this.b = a13Var;
            this.a = z03Var == null ? new z03() : z03Var;
            this.d = 0;
            this.e = null;
            this.c = null;
            this.f = null;
            this.h = null;
            return;
        }
        throw new NullPointerException("Cannot pass null DeserializerFactory");
    }

    @Override // defpackage.om2
    public final rnb i() {
        return this.c.M();
    }

    @Override // defpackage.om2
    public <T> T k(y85 y85Var, String str) throws JsonMappingException {
        throw InvalidDefinitionException.x(this.g, str, y85Var);
    }

    @Override // defpackage.om2
    /* renamed from: m */
    public w03 f() {
        return this.c;
    }
}
