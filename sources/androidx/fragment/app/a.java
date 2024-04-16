package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.lifecycle.d;
import ch.qos.logback.core.joran.action.ActionConst;
import java.io.PrintWriter;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class a extends p implements FragmentManager.j, FragmentManager.o {
    final FragmentManager t;
    boolean u;
    int v;
    boolean w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            androidx.fragment.app.g r0 = r3.x0()
            androidx.fragment.app.h r1 = r3.z0()
            if (r1 == 0) goto L17
            androidx.fragment.app.h r1 = r3.z0()
            android.content.Context r1 = r1.f()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L18
        L17:
            r1 = 0
        L18:
            r2.<init>(r0, r1)
            r0 = -1
            r2.v = r0
            r0 = 0
            r2.w = r0
            r2.t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.FragmentManager):void");
    }

    @Override // androidx.fragment.app.p
    @NonNull
    public p A(@NonNull Fragment fragment, @NonNull d.b bVar) {
        if (fragment.mFragmentManager == this.t) {
            if (bVar == d.b.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
            } else if (bVar != d.b.DESTROYED) {
                return super.A(fragment, bVar);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(int i) {
        p.a aVar;
        if (!this.i) {
            return;
        }
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
        }
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.c.get(i2).b;
            if (fragment != null) {
                fragment.mBackStackNesting += i;
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.mBackStackNesting);
                }
            }
        }
    }

    int D(boolean z) {
        if (!this.u) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new u("FragmentManager"));
                E("  ", printWriter);
                printWriter.close();
            }
            this.u = true;
            if (this.i) {
                this.v = this.t.m();
            } else {
                this.v = -1;
            }
            this.t.b0(this, z);
            return this.v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void E(String str, PrintWriter printWriter) {
        F(str, printWriter, true);
    }

    public void F(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (!this.c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                p.a aVar = this.c.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = ActionConst.NULL;
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (aVar.d != 0 || aVar.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.e));
                    }
                    if (aVar.f != 0 || aVar.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.g));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            p.a aVar = this.c.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.mBeingSaved = this.w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.h);
                fragment.setSharedElementNames(this.p, this.q);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.y1(fragment, false);
                    this.t.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.p1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.J0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.y1(fragment, false);
                    this.t.E1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.z(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.y1(fragment, false);
                    this.t.o(fragment);
                    break;
                case 8:
                    this.t.C1(fragment);
                    break;
                case 9:
                    this.t.C1(null);
                    break;
                case 10:
                    this.t.B1(fragment, aVar.i);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            p.a aVar = this.c.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.mBeingSaved = this.w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.u1(this.h));
                fragment.setSharedElementNames(this.q, this.p);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.y1(fragment, true);
                    this.t.p1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.E1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.y1(fragment, true);
                    this.t.J0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.o(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.y1(fragment, true);
                    this.t.z(fragment);
                    break;
                case 8:
                    this.t.C1(null);
                    break;
                case 9:
                    this.t.C1(fragment);
                    break;
                case 10:
                    this.t.B1(fragment, aVar.h);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment I(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.c.size()) {
            p.a aVar = this.c.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 6) {
                        if (i2 != 7) {
                            if (i2 == 8) {
                                this.c.add(i, new p.a(9, fragment2, true));
                                aVar.c = true;
                                i++;
                                fragment2 = aVar.b;
                            }
                        }
                    } else {
                        arrayList.remove(aVar.b);
                        Fragment fragment3 = aVar.b;
                        if (fragment3 == fragment2) {
                            this.c.add(i, new p.a(9, fragment3));
                            i++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = aVar.b;
                    int i3 = fragment4.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = arrayList.get(size);
                        if (fragment5.mContainerId == i3) {
                            if (fragment5 == fragment4) {
                                z = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.c.add(i, new p.a(9, fragment5, true));
                                    i++;
                                    fragment2 = null;
                                }
                                p.a aVar2 = new p.a(3, fragment5, true);
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                aVar2.e = aVar.e;
                                aVar2.g = aVar.g;
                                this.c.add(i, aVar2);
                                arrayList.remove(fragment5);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.c.remove(i);
                        i--;
                    } else {
                        aVar.a = 1;
                        aVar.c = true;
                        arrayList.add(fragment4);
                    }
                }
                i++;
            }
            arrayList.add(aVar.b);
            i++;
        }
        return fragment2;
    }

    public void J() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                this.s.get(i).run();
            }
            this.s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment K(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            p.a aVar = this.c.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.i = aVar.h;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.o
    public boolean a(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.i) {
            this.t.i(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public String getName() {
        return this.k;
    }

    @Override // androidx.fragment.app.p
    public int k() {
        return D(false);
    }

    @Override // androidx.fragment.app.p
    public int l() {
        return D(true);
    }

    @Override // androidx.fragment.app.p
    public void m() {
        q();
        this.t.e0(this, false);
    }

    @Override // androidx.fragment.app.p
    public void n() {
        q();
        this.t.e0(this, true);
    }

    @Override // androidx.fragment.app.p
    @NonNull
    public p p(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.t) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.p(fragment);
    }

    @Override // androidx.fragment.app.p
    void r(int i, Fragment fragment, String str, int i2) {
        super.r(i, fragment, str, i2);
        fragment.mFragmentManager = this.t;
    }

    @Override // androidx.fragment.app.p
    @NonNull
    public p s(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.t) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.s(fragment);
    }

    @Override // androidx.fragment.app.p
    @NonNull
    public p t(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.t(fragment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }
}
