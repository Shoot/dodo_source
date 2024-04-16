package defpackage;

import java.io.Serializable;
import java.lang.reflect.Member;
/* compiled from: VirtualAnnotatedMember.java */
/* renamed from: p1c  reason: default package */
/* loaded from: classes2.dex */
public class p1c extends hl implements Serializable {
    protected final Class<?> c;
    protected final y85 d;
    protected final String e;

    public p1c(znb znbVar, Class<?> cls, String str, y85 y85Var) {
        super(znbVar, null);
        this.c = cls;
        this.d = y85Var;
        this.e = str;
    }

    @Override // defpackage.al
    public Class<?> c() {
        return this.d.u();
    }

    @Override // defpackage.al
    public y85 d() {
        return this.d;
    }

    @Override // defpackage.al
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!q81.E(obj, getClass())) {
            return false;
        }
        p1c p1cVar = (p1c) obj;
        if (p1cVar.c == this.c && p1cVar.e.equals(this.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.al
    public String getName() {
        return this.e;
    }

    @Override // defpackage.al
    public int hashCode() {
        return this.e.hashCode();
    }

    @Override // defpackage.hl
    public Class<?> k() {
        return this.c;
    }

    @Override // defpackage.hl
    public Member m() {
        return null;
    }

    @Override // defpackage.hl
    public Object n(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot get virtual property '" + this.e + "'");
    }

    public String toString() {
        return "[virtual " + l() + "]";
    }

    @Override // defpackage.hl
    public al o(rl rlVar) {
        return this;
    }
}
