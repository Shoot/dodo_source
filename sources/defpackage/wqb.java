package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
/* compiled from: UnknownSerializer.java */
/* renamed from: wqb  reason: default package */
/* loaded from: classes2.dex */
public class wqb extends phb {
    public wqb() {
        super(Object.class);
    }

    protected void G(bda bdaVar, Object obj) throws JsonMappingException {
        bdaVar.l(c(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", obj.getClass().getName()));
    }

    @Override // defpackage.phb, defpackage.cxa, defpackage.gc5
    public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
        if (bdaVar.M0(qca.FAIL_ON_EMPTY_BEANS)) {
            G(bdaVar, obj);
        }
        super.f(obj, ua5Var, bdaVar);
    }

    @Override // defpackage.phb, defpackage.gc5
    public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        if (bdaVar.M0(qca.FAIL_ON_EMPTY_BEANS)) {
            G(bdaVar, obj);
        }
        super.i(obj, ua5Var, bdaVar, bobVar);
    }

    public wqb(Class<?> cls) {
        super(cls);
    }
}
