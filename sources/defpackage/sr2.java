package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.gc5;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: DefaultSerializerProvider.java */
/* renamed from: sr2  reason: default package */
/* loaded from: classes2.dex */
public abstract class sr2 extends bda implements Serializable {
    protected transient Map<Object, b9c> o;
    protected transient ArrayList<y47<?>> p;
    protected transient ua5 q;

    /* compiled from: DefaultSerializerProvider.java */
    /* renamed from: sr2$a */
    /* loaded from: classes2.dex */
    public static final class a extends sr2 {
        public a() {
        }

        @Override // defpackage.sr2
        /* renamed from: c1 */
        public a a1(pca pcaVar, zca zcaVar) {
            return new a(this, pcaVar, zcaVar);
        }

        protected a(bda bdaVar, pca pcaVar, zca zcaVar) {
            super(bdaVar, pcaVar, zcaVar);
        }
    }

    protected sr2() {
    }

    private final void W0(ua5 ua5Var, Object obj, gc5<Object> gc5Var) throws IOException {
        try {
            gc5Var.f(obj, ua5Var, this);
        } catch (Exception e) {
            throw Z0(ua5Var, e);
        }
    }

    private final void X0(ua5 ua5Var, Object obj, gc5<Object> gc5Var, vq8 vq8Var) throws IOException {
        try {
            ua5Var.g1();
            ua5Var.f0(vq8Var.j(this.a));
            gc5Var.f(obj, ua5Var, this);
            ua5Var.b0();
        } catch (Exception e) {
            throw Z0(ua5Var, e);
        }
    }

    private IOException Z0(ua5 ua5Var, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String n = q81.n(exc);
        if (n == null) {
            n = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException(ua5Var, n, exc);
    }

    @Override // defpackage.bda
    public Object J0(ja0 ja0Var, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        this.a.E();
        return q81.k(cls, this.a.b());
    }

    @Override // defpackage.bda
    public boolean K0(Object obj) throws JsonMappingException {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Throwable th) {
            O0(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), th.getClass().getName(), q81.n(th)), th);
            return false;
        }
    }

    @Override // defpackage.bda
    public b9c Q(Object obj, y47<?> y47Var) {
        y47<?> y47Var2;
        Map<Object, b9c> map = this.o;
        if (map == null) {
            this.o = V0();
        } else {
            b9c b9cVar = map.get(obj);
            if (b9cVar != null) {
                return b9cVar;
            }
        }
        ArrayList<y47<?>> arrayList = this.p;
        if (arrayList == null) {
            this.p = new ArrayList<>(8);
        } else {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                y47Var2 = this.p.get(i);
                if (y47Var2.a(y47Var)) {
                    break;
                }
            }
        }
        y47Var2 = null;
        if (y47Var2 == null) {
            y47Var2 = y47Var.e(this);
            this.p.add(y47Var2);
        }
        b9c b9cVar2 = new b9c(y47Var2);
        this.o.put(obj, b9cVar2);
        return b9cVar2;
    }

    @Override // defpackage.bda
    public gc5<Object> T0(al alVar, Object obj) throws JsonMappingException {
        gc5<?> gc5Var;
        if (obj == null) {
            return null;
        }
        if (obj instanceof gc5) {
            gc5Var = (gc5) obj;
        } else {
            if (!(obj instanceof Class)) {
                y85 d = alVar.d();
                k(d, "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == gc5.a.class || q81.G(cls)) {
                return null;
            }
            if (!gc5.class.isAssignableFrom(cls)) {
                y85 d2 = alVar.d();
                k(d2, "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
            }
            this.a.E();
            gc5Var = (gc5) q81.k(cls, this.a.b());
        }
        return s(gc5Var);
    }

    protected Map<Object, b9c> V0() {
        if (M0(qca.USE_EQUALITY_FOR_OBJECT_ID)) {
            return new HashMap();
        }
        return new IdentityHashMap();
    }

    protected void Y0(ua5 ua5Var) throws IOException {
        try {
            n0().f(null, ua5Var, this);
        } catch (Exception e) {
            throw Z0(ua5Var, e);
        }
    }

    public abstract sr2 a1(pca pcaVar, zca zcaVar);

    public void b1(ua5 ua5Var, Object obj) throws IOException {
        this.q = ua5Var;
        if (obj == null) {
            Y0(ua5Var);
            return;
        }
        Class<?> cls = obj.getClass();
        gc5<Object> W = W(cls, true, null);
        vq8 p0 = this.a.p0();
        if (p0 == null) {
            if (this.a.K0(qca.WRAP_ROOT_VALUE)) {
                X0(ua5Var, obj, W, this.a.e0(cls));
                return;
            }
        } else if (!p0.i()) {
            X0(ua5Var, obj, W, p0);
            return;
        }
        W0(ua5Var, obj, W);
    }

    @Override // defpackage.bda
    public ua5 r0() {
        return this.q;
    }

    protected sr2(bda bdaVar, pca pcaVar, zca zcaVar) {
        super(bdaVar, pcaVar, zcaVar);
    }
}
