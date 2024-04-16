package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class b extends View {
    protected int[] a;
    protected int b;
    protected Context c;
    protected co4 d;
    protected boolean e;
    protected String f;
    protected String g;
    private View[] h;
    protected HashMap<Integer, String> i;

    public b(Context context) {
        super(context);
        this.a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap<>();
        this.c = context;
        p(null);
    }

    private void e(String str) {
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int n = n(trim);
        if (n != 0) {
            this.i.put(Integer.valueOf(n), trim);
            f(n);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void f(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.b + 1;
        int[] iArr = this.a;
        if (i2 > iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        iArr2[i3] = i;
        this.b = i3 + 1;
    }

    private void g(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).b0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    f(childAt.getId());
                }
            }
        }
    }

    private int[] l(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String str2 : split) {
            int n = n(str2.trim());
            if (n != 0) {
                iArr[i] = n;
                i++;
            }
        }
        if (i != split.length) {
            return Arrays.copyOf(iArr, i);
        }
        return iArr;
    }

    private int m(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int n(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = py8.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.c.getResources().getIdentifier(str, "id", this.c.getPackageName());
        }
        return i;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    public void h(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else if (view.getParent() == null) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
        } else {
            this.f = null;
            f(view.getId());
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            j((ConstraintLayout) parent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.b; i++) {
            View viewById = constraintLayout.getViewById(this.a[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View[] o(ConstraintLayout constraintLayout) {
        View[] viewArr = this.h;
        if (viewArr == null || viewArr.length != this.b) {
            this.h = new View[this.b];
        }
        for (int i = 0; i < this.b; i++) {
            this.h[i] = constraintLayout.getViewById(this.a[i]);
        }
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g29.m1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == g29.F1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f = string;
                    setIds(string);
                } else if (index == g29.G1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void q(d.a aVar, eo4 eo4Var, ConstraintLayout.b bVar, SparseArray<lr1> sparseArray) {
        d.b bVar2 = aVar.e;
        int[] iArr = bVar2.j0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.k0;
            if (str != null && str.length() > 0) {
                d.b bVar3 = aVar.e;
                bVar3.j0 = l(this, bVar3.k0);
            }
        }
        eo4Var.c();
        if (aVar.e.j0 != null) {
            int i = 0;
            while (true) {
                int[] iArr2 = aVar.e.j0;
                if (i < iArr2.length) {
                    lr1 lr1Var = sparseArray.get(iArr2[i]);
                    if (lr1Var != null) {
                        eo4Var.b(lr1Var);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    protected void setIds(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                e(str.substring(i));
                return;
            } else {
                e(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                g(str.substring(i));
                return;
            } else {
                g(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f = null;
        this.b = 0;
        for (int i : iArr) {
            f(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            f(i);
        }
    }

    public void v(mr1 mr1Var, co4 co4Var, SparseArray<lr1> sparseArray) {
        co4Var.c();
        for (int i = 0; i < this.b; i++) {
            co4Var.b(sparseArray.get(this.a[i]));
        }
    }

    public void w(ConstraintLayout constraintLayout) {
        String str;
        int m;
        if (isInEditMode()) {
            setIds(this.f);
        }
        co4 co4Var = this.d;
        if (co4Var == null) {
            return;
        }
        co4Var.c();
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            View viewById = constraintLayout.getViewById(i2);
            if (viewById == null && (m = m(constraintLayout, (str = this.i.get(Integer.valueOf(i2))))) != 0) {
                this.a[i] = m;
                this.i.put(Integer.valueOf(m), str);
                viewById = constraintLayout.getViewById(m);
            }
            if (viewById != null) {
                this.d.b(constraintLayout.getViewWidget(viewById));
            }
        }
        this.d.a(constraintLayout.mLayoutWidget);
    }

    public void x() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).u0 = (lr1) this.d;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.e = false;
        this.h = null;
        this.i = new HashMap<>();
        this.c = context;
        p(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void s(ConstraintLayout constraintLayout) {
    }

    public void t(ConstraintLayout constraintLayout) {
    }

    public void u(ConstraintLayout constraintLayout) {
    }

    public void r(lr1 lr1Var, boolean z) {
    }
}
