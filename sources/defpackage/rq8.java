package defpackage;
/* compiled from: PropertyBasedObjectIdGenerator.java */
/* renamed from: rq8  reason: default package */
/* loaded from: classes2.dex */
public class rq8 extends b57 {
    protected final ka0 b;

    public rq8(c57 c57Var, ka0 ka0Var) {
        this(c57Var.e(), ka0Var);
    }

    @Override // defpackage.b57, defpackage.z47, defpackage.y47
    public boolean a(y47<?> y47Var) {
        if (y47Var.getClass() != getClass()) {
            return false;
        }
        rq8 rq8Var = (rq8) y47Var;
        if (rq8Var.d() != this.a || rq8Var.b != this.b) {
            return false;
        }
        return true;
    }

    @Override // defpackage.y47
    public y47<Object> b(Class<?> cls) {
        if (cls == this.a) {
            return this;
        }
        return new rq8(cls, this.b);
    }

    @Override // defpackage.y47
    public Object c(Object obj) {
        try {
            return this.b.m(obj);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException("Problem accessing property '" + this.b.getName() + "': " + e2.getMessage(), e2);
        }
    }

    protected rq8(Class<?> cls, ka0 ka0Var) {
        super(cls);
        this.b = ka0Var;
    }

    @Override // defpackage.y47
    public y47<Object> e(Object obj) {
        return this;
    }
}
