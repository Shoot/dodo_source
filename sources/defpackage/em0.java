package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
/* compiled from: CallableReference.java */
/* renamed from: em0  reason: default package */
/* loaded from: classes3.dex */
public abstract class em0 implements nd5, Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient nd5 reflected;
    private final String signature;

    /* compiled from: CallableReference.java */
    /* renamed from: em0$a */
    /* loaded from: classes3.dex */
    private static class a implements Serializable {
        private static final a a = new a();

        private a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return a;
        }
    }

    public em0() {
        this(NO_RECEIVER);
    }

    @Override // defpackage.nd5
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.nd5
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public nd5 compute() {
        nd5 nd5Var = this.reflected;
        if (nd5Var == null) {
            nd5 computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return nd5Var;
    }

    protected abstract nd5 computeReflected();

    @Override // defpackage.kd5
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.nd5
    public String getName() {
        return this.name;
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

    @Override // defpackage.nd5
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public nd5 getReflected() {
        nd5 compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new jh5();
    }

    @Override // defpackage.nd5
    public ne5 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.nd5
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.nd5
    public pe5 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.nd5
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.nd5
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.nd5
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.nd5
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public em0(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public em0(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
