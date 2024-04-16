package androidx.fragment.app;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class q {
    static final s a = new r();
    static final s b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment, Fragment fragment2, boolean z, lr<String, View> lrVar, boolean z2) {
        rha enterTransitionCallback;
        int size;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (lrVar == null) {
                size = 0;
            } else {
                size = lrVar.size();
            }
            for (int i = 0; i < size; i++) {
                arrayList2.add(lrVar.k(i));
                arrayList.add(lrVar.o(i));
            }
            if (z2) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(lr<String, String> lrVar, String str) {
        int size = lrVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(lrVar.o(i))) {
                return lrVar.k(i);
            }
        }
        return null;
    }

    private static s c() {
        try {
            return (s) x64.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(@NonNull lr<String, String> lrVar, @NonNull lr<String, View> lrVar2) {
        for (int size = lrVar.size() - 1; size >= 0; size--) {
            if (!lrVar2.containsKey(lrVar.o(size))) {
                lrVar.m(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        if (a == null && b == null) {
            return false;
        }
        return true;
    }
}
