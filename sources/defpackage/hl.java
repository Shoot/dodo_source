package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
/* compiled from: AnnotatedMember.java */
/* renamed from: hl  reason: default package */
/* loaded from: classes2.dex */
public abstract class hl extends al implements Serializable {
    protected final transient znb a;
    protected final transient rl b;

    /* JADX INFO: Access modifiers changed from: protected */
    public hl(znb znbVar, rl rlVar) {
        this.a = znbVar;
        this.b = rlVar;
    }

    @Override // defpackage.al
    public final <A extends Annotation> A b(Class<A> cls) {
        rl rlVar = this.b;
        if (rlVar == null) {
            return null;
        }
        return (A) rlVar.a(cls);
    }

    @Override // defpackage.al
    public final boolean e(Class<?> cls) {
        rl rlVar = this.b;
        if (rlVar == null) {
            return false;
        }
        return rlVar.b(cls);
    }

    @Override // defpackage.al
    public boolean f(Class<? extends Annotation>[] clsArr) {
        rl rlVar = this.b;
        if (rlVar == null) {
            return false;
        }
        return rlVar.c(clsArr);
    }

    public final void i(boolean z) {
        Member m = m();
        if (m != null) {
            q81.g(m, z);
        }
    }

    public rl j() {
        return this.b;
    }

    public abstract Class<?> k();

    public String l() {
        return k().getName() + "#" + getName();
    }

    public abstract Member m();

    public abstract Object n(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract al o(rl rlVar);
}
