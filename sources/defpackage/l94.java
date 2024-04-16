package defpackage;
/* compiled from: FunctionReference.java */
/* renamed from: l94  reason: default package */
/* loaded from: classes3.dex */
public class l94 extends em0 implements j94, td5 {
    private final int arity;
    private final int flags;

    public l94(int i) {
        this(i, em0.NO_RECEIVER, null, null, null, 0);
    }

    @Override // defpackage.em0
    protected nd5 computeReflected() {
        return bc9.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l94) {
            l94 l94Var = (l94) obj;
            if (getName().equals(l94Var.getName()) && getSignature().equals(l94Var.getSignature()) && this.flags == l94Var.flags && this.arity == l94Var.arity && z65.c(getBoundReceiver(), l94Var.getBoundReceiver()) && z65.c(getOwner(), l94Var.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof td5)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override // defpackage.j94
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return ((hashCode + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.td5
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.td5
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.td5
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.td5
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.em0, defpackage.nd5
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        nd5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public l94(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.em0
    public td5 getReflected() {
        return (td5) super.getReflected();
    }

    public l94(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
