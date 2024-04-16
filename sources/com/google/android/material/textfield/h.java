package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes2.dex */
public class h extends androidx.appcompat.widget.d {
    @NonNull
    private final dr5 e;
    private final AccessibilityManager f;
    @NonNull
    private final Rect g;
    private final int h;

    /* compiled from: MaterialAutoCompleteTextView.java */
    /* loaded from: classes2.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object item;
            h hVar = h.this;
            if (i < 0) {
                item = hVar.e.v();
            } else {
                item = hVar.getAdapter().getItem(i);
            }
            h.this.f(item);
            AdapterView.OnItemClickListener onItemClickListener = h.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = h.this.e.y();
                    i = h.this.e.x();
                    j = h.this.e.w();
                }
                onItemClickListener.onItemClick(h.this.e.p(), view, i, j);
            }
            h.this.e.dismiss();
        }
    }

    public h(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qv8.b);
    }

    private TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout d = d();
        int i = 0;
        if (adapter == null || d == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.e.x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, d);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable h = this.e.h();
        if (h != null) {
            h.getPadding(this.g);
            Rect rect = this.g;
            i2 += rect.left + rect.right;
        }
        return i2 + d.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout d = d();
        if (d != null && d.O()) {
            return d.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d = d();
        if (d != null && d.O() && super.getHint() == null && v56.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.e.n(getAdapter());
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.e.c();
        } else {
            super.showDropDown();
        }
    }

    public h(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(ia6.c(context, attributeSet, i, 0), attributeSet, i);
        this.g = new Rect();
        Context context2 = getContext();
        TypedArray h = sdb.h(context2, attributeSet, b29.t3, i, i19.g, new int[0]);
        int i2 = b29.u3;
        if (h.hasValue(i2) && h.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.h = h.getResourceId(b29.v3, kz8.mtrl_auto_complete_simple_item);
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        dr5 dr5Var = new dr5(context2);
        this.e = dr5Var;
        dr5Var.J(true);
        dr5Var.D(this);
        dr5Var.I(2);
        dr5Var.n(getAdapter());
        dr5Var.L(new a());
        int i3 = b29.w3;
        if (h.hasValue(i3)) {
            setSimpleItems(h.getResourceId(i3, 0));
        }
        h.recycle();
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.h, strArr));
    }
}
