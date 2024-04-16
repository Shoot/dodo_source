package defpackage;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: RestrictedComponentContainer.java */
/* renamed from: pk9  reason: default package */
/* loaded from: classes2.dex */
final class pk9 implements im1 {
    private final Set<su8<?>> a;
    private final Set<su8<?>> b;
    private final Set<su8<?>> c;
    private final Set<su8<?>> d;
    private final Set<su8<?>> e;
    private final Set<Class<?>> f;
    private final im1 g;

    /* compiled from: RestrictedComponentContainer.java */
    /* renamed from: pk9$a */
    /* loaded from: classes2.dex */
    private static class a implements ms8 {
        private final Set<Class<?>> a;
        private final ms8 b;

        public a(Set<Class<?>> set, ms8 ms8Var) {
            this.a = set;
            this.b = ms8Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pk9(bm1<?> bm1Var, im1 im1Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (d03 d03Var : bm1Var.g()) {
            if (d03Var.e()) {
                if (d03Var.g()) {
                    hashSet4.add(d03Var.c());
                } else {
                    hashSet.add(d03Var.c());
                }
            } else if (d03Var.d()) {
                hashSet3.add(d03Var.c());
            } else if (d03Var.g()) {
                hashSet5.add(d03Var.c());
            } else {
                hashSet2.add(d03Var.c());
            }
        }
        if (!bm1Var.k().isEmpty()) {
            hashSet.add(su8.b(ms8.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = bm1Var.k();
        this.g = im1Var;
    }

    @Override // defpackage.im1
    public <T> T a(Class<T> cls) {
        if (this.a.contains(su8.b(cls))) {
            T t = (T) this.g.a(cls);
            if (!cls.equals(ms8.class)) {
                return t;
            }
            return (T) new a(this.f, (ms8) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // defpackage.im1
    public <T> bs8<Set<T>> b(su8<T> su8Var) {
        if (this.e.contains(su8Var)) {
            return this.g.b(su8Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", su8Var));
    }

    @Override // defpackage.im1
    public /* synthetic */ Set c(Class cls) {
        return hm1.f(this, cls);
    }

    @Override // defpackage.im1
    public <T> bs8<T> d(su8<T> su8Var) {
        if (this.b.contains(su8Var)) {
            return this.g.d(su8Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", su8Var));
    }

    @Override // defpackage.im1
    public <T> T e(su8<T> su8Var) {
        if (this.a.contains(su8Var)) {
            return (T) this.g.e(su8Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", su8Var));
    }

    @Override // defpackage.im1
    public <T> Set<T> f(su8<T> su8Var) {
        if (this.d.contains(su8Var)) {
            return this.g.f(su8Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", su8Var));
    }

    @Override // defpackage.im1
    public <T> bs8<T> g(Class<T> cls) {
        return d(su8.b(cls));
    }

    @Override // defpackage.im1
    public <T> gs2<T> h(su8<T> su8Var) {
        if (this.c.contains(su8Var)) {
            return this.g.h(su8Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", su8Var));
    }

    @Override // defpackage.im1
    public <T> gs2<T> i(Class<T> cls) {
        return h(su8.b(cls));
    }
}
