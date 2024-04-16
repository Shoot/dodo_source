package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AccessibilityNodeProviderCompat.java */
/* renamed from: g4  reason: default package */
/* loaded from: classes.dex */
public class g4 {
    private final Object a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: g4$a */
    /* loaded from: classes.dex */
    static class a extends AccessibilityNodeProvider {
        final g4 a;

        a(g4 g4Var) {
            this.a = g4Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            d4 b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.c1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<d4> c = this.a.c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).c1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: g4$b */
    /* loaded from: classes.dex */
    static class b extends a {
        b(g4 g4Var) {
            super(g4Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            d4 d = this.a.d(i);
            if (d == null) {
                return null;
            }
            return d.c1();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: g4$c */
    /* loaded from: classes.dex */
    static class c extends b {
        c(g4 g4Var) {
            super(g4Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, d4.d1(accessibilityNodeInfo), str, bundle);
        }
    }

    public g4() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new c(this);
        } else {
            this.a = new b(this);
        }
    }

    public d4 b(int i) {
        return null;
    }

    public List<d4> c(@NonNull String str, int i) {
        return null;
    }

    public d4 d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public g4(Object obj) {
        this.a = obj;
    }

    public void a(int i, @NonNull d4 d4Var, @NonNull String str, Bundle bundle) {
    }
}
