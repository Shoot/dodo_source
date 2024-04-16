package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class p {
    private final g a;
    private final ClassLoader b;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList<String> p;
    ArrayList<String> q;
    ArrayList<Runnable> s;
    ArrayList<a> c = new ArrayList<>();
    boolean j = true;
    boolean r = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransaction.java */
    /* loaded from: classes.dex */
    public static final class a {
        int a;
        Fragment b;
        boolean c;
        int d;
        int e;
        int f;
        int g;
        d.b h;
        d.b i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            this.c = false;
            d.b bVar = d.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i, Fragment fragment, boolean z) {
            this.a = i;
            this.b = fragment;
            this.c = z;
            d.b bVar = d.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        a(int i, @NonNull Fragment fragment, d.b bVar) {
            this.a = i;
            this.b = fragment;
            this.c = false;
            this.h = fragment.mMaxState;
            this.i = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(@NonNull g gVar, ClassLoader classLoader) {
        this.a = gVar;
        this.b = classLoader;
    }

    @NonNull
    private Fragment o(@NonNull Class<? extends Fragment> cls, Bundle bundle) {
        g gVar = this.a;
        if (gVar != null) {
            ClassLoader classLoader = this.b;
            if (classLoader != null) {
                Fragment a2 = gVar.a(classLoader, cls.getName());
                if (bundle != null) {
                    a2.setArguments(bundle);
                }
                return a2;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    @NonNull
    public p A(@NonNull Fragment fragment, @NonNull d.b bVar) {
        g(new a(10, fragment, bVar));
        return this;
    }

    @NonNull
    public p B(boolean z) {
        this.r = z;
        return this;
    }

    @NonNull
    public p b(int i, @NonNull Fragment fragment) {
        r(i, fragment, null, 1);
        return this;
    }

    @NonNull
    public p c(int i, @NonNull Fragment fragment, String str) {
        r(i, fragment, str, 1);
        return this;
    }

    @NonNull
    public final p d(int i, @NonNull Class<? extends Fragment> cls, Bundle bundle) {
        return b(i, o(cls, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p e(@NonNull ViewGroup viewGroup, @NonNull Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    @NonNull
    public p f(@NonNull Fragment fragment, String str) {
        r(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(a aVar) {
        this.c.add(aVar);
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
    }

    @NonNull
    public p h(@NonNull View view, @NonNull String str) {
        if (q.f()) {
            String N = syb.N(view);
            if (N != null) {
                if (this.p == null) {
                    this.p = new ArrayList<>();
                    this.q = new ArrayList<>();
                } else if (!this.q.contains(str)) {
                    if (this.p.contains(N)) {
                        throw new IllegalArgumentException("A shared element with the source name '" + N + "' has already been added to the transaction.");
                    }
                } else {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                this.p.add(N);
                this.q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    @NonNull
    public p i(String str) {
        if (this.j) {
            this.i = true;
            this.k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @NonNull
    public p j(@NonNull Fragment fragment) {
        g(new a(7, fragment));
        return this;
    }

    public abstract int k();

    public abstract int l();

    public abstract void m();

    public abstract void n();

    @NonNull
    public p p(@NonNull Fragment fragment) {
        g(new a(6, fragment));
        return this;
    }

    @NonNull
    public p q() {
        if (!this.i) {
            this.j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            v64.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            g(new a(i2, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    @NonNull
    public p s(@NonNull Fragment fragment) {
        g(new a(4, fragment));
        return this;
    }

    @NonNull
    public p t(@NonNull Fragment fragment) {
        g(new a(3, fragment));
        return this;
    }

    @NonNull
    public p u(int i, @NonNull Fragment fragment) {
        return v(i, fragment, null);
    }

    @NonNull
    public p v(int i, @NonNull Fragment fragment, String str) {
        if (i != 0) {
            r(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @NonNull
    public final p w(int i, @NonNull Class<? extends Fragment> cls, Bundle bundle, String str) {
        return v(i, o(cls, bundle), str);
    }

    @NonNull
    public p x(@NonNull Runnable runnable) {
        q();
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(runnable);
        return this;
    }

    @NonNull
    public p y(int i, int i2) {
        return z(i, i2, 0, 0);
    }

    @NonNull
    public p z(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        return this;
    }
}
