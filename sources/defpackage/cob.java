package defpackage;

import java.io.IOException;
/* compiled from: TypeSerializerBase.java */
/* renamed from: cob  reason: default package */
/* loaded from: classes2.dex */
public abstract class cob extends bob {
    protected final snb a;
    protected final ia0 b;

    /* JADX INFO: Access modifiers changed from: protected */
    public cob(snb snbVar, ia0 ia0Var) {
        this.a = snbVar;
        this.b = ia0Var;
    }

    @Override // defpackage.bob
    public String b() {
        return null;
    }

    @Override // defpackage.bob
    public c9c g(ua5 ua5Var, c9c c9cVar) throws IOException {
        i(c9cVar);
        return ua5Var.x1(c9cVar);
    }

    @Override // defpackage.bob
    public c9c h(ua5 ua5Var, c9c c9cVar) throws IOException {
        return ua5Var.y1(c9cVar);
    }

    protected void i(c9c c9cVar) {
        String l;
        if (c9cVar.c == null) {
            Object obj = c9cVar.a;
            Class<?> cls = c9cVar.b;
            if (cls == null) {
                l = k(obj);
            } else {
                l = l(obj, cls);
            }
            c9cVar.c = l;
        }
    }

    protected String k(Object obj) {
        String a = this.a.a(obj);
        if (a == null) {
            j(obj);
        }
        return a;
    }

    protected String l(Object obj, Class<?> cls) {
        String c = this.a.c(obj, cls);
        if (c == null) {
            j(obj);
        }
        return c;
    }

    protected void j(Object obj) {
    }
}
