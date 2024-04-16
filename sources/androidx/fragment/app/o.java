package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public class o {
    private final ArrayList<Fragment> a = new ArrayList<>();
    private final HashMap<String, m> b = new HashMap<>();
    private final HashMap<String, FragmentState> c = new HashMap<>();
    private l d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(@NonNull l lVar) {
        this.d = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState B(@NonNull String str, FragmentState fragmentState) {
        if (fragmentState != null) {
            return this.c.put(str, fragmentState);
        }
        return this.c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(@NonNull String str) {
        if (this.b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) {
        for (m mVar : this.b.values()) {
            if (mVar != null) {
                mVar.u(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (m mVar : this.b.values()) {
                printWriter.print(str);
                if (mVar != null) {
                    Fragment k = mVar.k();
                    printWriter.println(k);
                    k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.a.get(i).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f(@NonNull String str) {
        m mVar = this.b.get(str);
        if (mVar != null) {
            return mVar.k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (m mVar : this.b.values()) {
            if (mVar != null) {
                Fragment k = mVar.k();
                if (k.mFragmentId == i) {
                    return k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (m mVar : this.b.values()) {
                if (mVar != null) {
                    Fragment k = mVar.k();
                    if (str.equals(k.mTag)) {
                        return k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment i(@NonNull String str) {
        Fragment findFragmentByWho;
        for (m mVar : this.b.values()) {
            if (mVar != null && (findFragmentByWho = mVar.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(@NonNull Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = this.a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<m> k() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : this.b.values()) {
            if (mVar != null) {
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : this.b.values()) {
            if (mVar != null) {
                arrayList.add(mVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public ArrayList<FragmentState> m() {
        return new ArrayList<>(this.c.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m n(@NonNull String str) {
        return this.b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<Fragment> o() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l p() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState q(@NonNull String str) {
        return this.c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(@NonNull m mVar) {
        Fragment k = mVar.k();
        if (c(k.mWho)) {
            return;
        }
        this.b.put(k.mWho, mVar);
        if (k.mRetainInstanceChangedWhileDetached) {
            if (k.mRetainInstance) {
                this.d.f(k);
            } else {
                this.d.p(k);
            }
            k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(@NonNull m mVar) {
        Fragment k = mVar.k();
        if (k.mRetainInstance) {
            this.d.p(k);
        }
        if (this.b.put(k.mWho, null) != null && FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            m mVar = this.b.get(it.next().mWho);
            if (mVar != null) {
                mVar.m();
            }
        }
        for (m mVar2 : this.b.values()) {
            if (mVar2 != null) {
                mVar2.m();
                Fragment k = mVar2.k();
                if (k.mRemoving && !k.isInBackStack()) {
                    if (k.mBeingSaved && !this.c.containsKey(k.mWho)) {
                        mVar2.s();
                    }
                    s(mVar2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(@NonNull Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        this.b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f = f(str);
                if (f != null) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f);
                    }
                    a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(@NonNull ArrayList<FragmentState> arrayList) {
        this.c.clear();
        Iterator<FragmentState> it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            this.c.put(next.b, next);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.b.size());
        for (m mVar : this.b.values()) {
            if (mVar != null) {
                Fragment k = mVar.k();
                mVar.s();
                arrayList.add(k.mWho);
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> z() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.a.size());
                Iterator<Fragment> it = this.a.iterator();
                while (it.hasNext()) {
                    Fragment next = it.next();
                    arrayList.add(next.mWho);
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
