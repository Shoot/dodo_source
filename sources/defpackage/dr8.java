package defpackage;
/* compiled from: PropertyReference.java */
/* renamed from: dr8  reason: default package */
/* loaded from: classes3.dex */
public abstract class dr8 extends em0 implements je5 {
    private final boolean syntheticJavaProperty;

    public dr8() {
        this.syntheticJavaProperty = false;
    }

    @Override // defpackage.em0
    public nd5 compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dr8) {
            dr8 dr8Var = (dr8) obj;
            if (getOwner().equals(dr8Var.getOwner()) && getName().equals(dr8Var.getName()) && getSignature().equals(dr8Var.getSignature()) && z65.c(getBoundReceiver(), dr8Var.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof je5)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.je5
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.je5
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        nd5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public dr8(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.em0
    public je5 getReflected() {
        if (!this.syntheticJavaProperty) {
            return (je5) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public dr8(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }
}
