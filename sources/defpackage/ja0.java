package defpackage;

import defpackage.cb5;
import defpackage.ql;
/* compiled from: BeanPropertyDefinition.java */
/* renamed from: ja0  reason: default package */
/* loaded from: classes2.dex */
public abstract class ja0 {
    protected static final cb5.b a = cb5.b.c();

    public abstract vq8 A();

    public abstract boolean B();

    public boolean C() {
        return false;
    }

    public boolean a() {
        if (u() != null) {
            return true;
        }
        return false;
    }

    public abstract cb5.b g();

    public ql.a h() {
        return null;
    }

    public Class<?>[] i() {
        return null;
    }

    public hl k() {
        il s = s();
        if (s == null) {
            return p();
        }
        return s;
    }

    public abstract ll o();

    public abstract fl p();

    public abstract vq8 q();

    public abstract il s();

    public abstract uq8 t();

    public hl u() {
        ll o = o();
        if (o == null) {
            il z = z();
            if (z == null) {
                return p();
            }
            return z;
        }
        return o;
    }

    public abstract String v();

    public abstract hl w();

    public abstract Class<?> x();

    public abstract il z();
}
