package defpackage;

import java.io.Serializable;
/* compiled from: AdaptedFunctionReference.java */
/* renamed from: j6  reason: default package */
/* loaded from: classes3.dex */
public class j6 implements j94, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public j6(int i, Class cls, String str, String str2, int i2) {
        this(i, em0.NO_RECEIVER, cls, str, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        if (this.isTopLevel == j6Var.isTopLevel && this.arity == j6Var.arity && this.flags == j6Var.flags && z65.c(this.receiver, j6Var.receiver) && z65.c(this.owner, j6Var.owner) && this.name.equals(j6Var.name) && this.signature.equals(j6Var.signature)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.j94
    public int getArity() {
        return this.arity;
    }

    public sd5 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return bc9.c(cls);
        }
        return bc9.b(cls);
    }

    public int hashCode() {
        int i;
        int i2;
        Object obj = this.receiver;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Class cls = this.owner;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        int hashCode = (((((i4 + i3) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        if (this.isTopLevel) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((hashCode + i2) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return bc9.h(this);
    }

    public j6(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
