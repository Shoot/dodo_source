package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import defpackage.d4;
import defpackage.uga;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    private static final String k = "MaterialButtonToggleGroup";
    private static final int l = i19.Widget_MaterialComponents_MaterialButtonToggleGroup;
    private final List<c> a;
    private final e b;
    private final LinkedHashSet<d> c;
    private final Comparator<MaterialButton> d;
    private Integer[] e;
    private boolean f;
    private boolean g;
    private boolean h;
    private final int i;
    private Set<Integer> j;

    /* loaded from: classes2.dex */
    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* loaded from: classes2.dex */
    class b extends s2 {
        b() {
        }

        @Override // defpackage.s2
        public void g(View view, @NonNull d4 d4Var) {
            super.g(view, d4Var);
            d4Var.q0(d4.c.f(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c {
        private static final dx1 e = new u0(0.0f);
        dx1 a;
        dx1 b;
        dx1 c;
        dx1 d;

        c(dx1 dx1Var, dx1 dx1Var2, dx1 dx1Var3, dx1 dx1Var4) {
            this.a = dx1Var;
            this.b = dx1Var3;
            this.c = dx1Var4;
            this.d = dx1Var2;
        }

        public static c a(c cVar) {
            dx1 dx1Var = e;
            return new c(dx1Var, cVar.d, dx1Var, cVar.c);
        }

        public static c b(c cVar, View view) {
            if (z0c.i(view)) {
                return c(cVar);
            }
            return d(cVar);
        }

        public static c c(c cVar) {
            dx1 dx1Var = cVar.a;
            dx1 dx1Var2 = cVar.d;
            dx1 dx1Var3 = e;
            return new c(dx1Var, dx1Var2, dx1Var3, dx1Var3);
        }

        public static c d(c cVar) {
            dx1 dx1Var = e;
            return new c(dx1Var, dx1Var, cVar.b, cVar.c);
        }

        public static c e(c cVar, View view) {
            if (z0c.i(view)) {
                return d(cVar);
            }
            return c(cVar);
        }

        public static c f(c cVar) {
            dx1 dx1Var = cVar.a;
            dx1 dx1Var2 = e;
            return new c(dx1Var, dx1Var2, cVar.b, dx1Var2);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class e implements MaterialButton.b {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(@NonNull MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.materialButtonToggleGroupStyle);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton h = h(i);
            int min = Math.min(h.getStrokeWidth(), h(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams d2 = d(h);
            if (getOrientation() == 0) {
                j86.c(d2, 0);
                j86.d(d2, -min);
                d2.topMargin = 0;
            } else {
                d2.bottomMargin = 0;
                d2.topMargin = -min;
                j86.d(d2, 0);
            }
            h.setLayoutParams(d2);
        }
        n(firstVisibleChildIndex);
    }

    @NonNull
    private LinearLayout.LayoutParams d(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i, boolean z) {
        if (i == -1) {
            String str = k;
            Log.e(str, "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        q(hashSet);
    }

    private void g(int i, boolean z) {
        Iterator<d> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(this, i, z);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (k(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && k(i2)) {
                i++;
            }
        }
        return i;
    }

    private MaterialButton h(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && k(i2)) {
                i++;
            }
        }
        return -1;
    }

    private c j(int i, int i2, int i3) {
        boolean z;
        c cVar = this.a.get(i);
        if (i2 == i3) {
            return cVar;
        }
        if (getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == i2) {
            if (z) {
                return c.e(cVar, this);
            }
            return c.f(cVar);
        } else if (i == i3) {
            if (z) {
                return c.b(cVar, this);
            }
            return c.a(cVar);
        } else {
            return null;
        }
    }

    private boolean k(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private void n(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            j86.c(layoutParams, 0);
            j86.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f = false;
        }
    }

    private static void p(uga.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.E(cVar.a).w(cVar.d).I(cVar.b).A(cVar.c);
        }
    }

    private void q(Set<Integer> set) {
        Set<Integer> set2 = this.j;
        this.j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = h(i).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(h(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(syb.m());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(k, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        uga shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        syb.u0(materialButton, new b());
    }

    public void b(@NonNull d dVar) {
        this.c.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NonNull Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (this.g && !this.j.isEmpty()) {
            return this.j.iterator().next().intValue();
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = h(i).getId();
            if (this.j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(k, "Child order wasn't updated");
        return i2;
    }

    public boolean l() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(@NonNull MaterialButton materialButton, boolean z) {
        if (this.f) {
            return;
        }
        e(materialButton.getId(), z);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            q(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d4 d1 = d4.d1(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (l()) {
            i = 1;
        } else {
            i = 2;
        }
        d1.p0(d4.b.d(1, visibleButtonCount, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        s();
        c();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.a.remove(indexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton h = h(i);
            if (h.getVisibility() != 8) {
                uga.b v = h.getShapeAppearanceModel().v();
                p(v, j(i, firstVisibleChildIndex, lastVisibleChildIndex));
                h.setShapeAppearanceModel(v.m());
            }
        }
    }

    public void setSelectionRequired(boolean z) {
        this.h = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.g != z) {
            this.g = z;
            f();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(@androidx.annotation.NonNull android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.l
            android.content.Context r7 = defpackage.ia6.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.d = r7
            r7 = 0
            r6.f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = defpackage.b29.R3
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = defpackage.sdb.h(r0, r1, r2, r3, r4, r5)
            int r9 = defpackage.b29.U3
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = defpackage.b29.S3
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.i = r9
            int r9 = defpackage.b29.T3
            boolean r7 = r8.getBoolean(r9, r7)
            r6.h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            defpackage.syb.F0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
