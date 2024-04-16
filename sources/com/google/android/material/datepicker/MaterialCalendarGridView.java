package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar a;
    private final boolean b;

    /* loaded from: classes2.dex */
    class a extends s2 {
        a() {
        }

        @Override // defpackage.s2
        public void g(View view, @NonNull d4 d4Var) {
            super.g(view, d4Var);
            d4Var.p0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().i());
        } else if (i == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private View e(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    private static int f(@NonNull View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean g(Long l, Long l2, Long l3, Long l4) {
        if (l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* renamed from: d */
    public h getAdapter2() {
        return (h) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(@NonNull Canvas canvas) {
        int a2;
        int f;
        int a3;
        int f2;
        int i;
        int i2;
        int i3;
        int i4;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        h adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.b;
        b bVar = adapter2.d;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.i(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<wp7<Long, Long>> it = dateSelector.Q0().iterator();
        while (it.hasNext()) {
            wp7<Long, Long> next = it.next();
            Long l = next.a;
            if (l != null) {
                if (next.b != null) {
                    long longValue = l.longValue();
                    long longValue2 = next.b.longValue();
                    if (!g(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean i5 = z0c.i(this);
                        if (longValue < item.longValue()) {
                            if (adapter2.f(max)) {
                                left2 = 0;
                            } else if (!i5) {
                                left2 = materialCalendarGridView.e(max - 1).getRight();
                            } else {
                                left2 = materialCalendarGridView.e(max - 1).getLeft();
                            }
                            f = left2;
                            a2 = max;
                        } else {
                            materialCalendarGridView.a.setTimeInMillis(longValue);
                            a2 = adapter2.a(materialCalendarGridView.a.get(5));
                            f = f(materialCalendarGridView.e(a2));
                        }
                        if (longValue2 > item2.longValue()) {
                            if (adapter2.g(min)) {
                                left = getWidth();
                            } else if (!i5) {
                                left = materialCalendarGridView.e(min).getRight();
                            } else {
                                left = materialCalendarGridView.e(min).getLeft();
                            }
                            f2 = left;
                            a3 = min;
                        } else {
                            materialCalendarGridView.a.setTimeInMillis(longValue2);
                            a3 = adapter2.a(materialCalendarGridView.a.get(5));
                            f2 = f(materialCalendarGridView.e(a3));
                        }
                        int itemId = (int) adapter2.getItemId(a2);
                        int i6 = max;
                        int i7 = min;
                        int itemId2 = (int) adapter2.getItemId(a3);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            h hVar = adapter2;
                            int numColumns2 = (numColumns + getNumColumns()) - 1;
                            View e = materialCalendarGridView.e(numColumns);
                            int top = e.getTop() + bVar.a.c();
                            Iterator<wp7<Long, Long>> it2 = it;
                            int bottom = e.getBottom() - bVar.a.b();
                            if (!i5) {
                                if (numColumns > a2) {
                                    i3 = 0;
                                } else {
                                    i3 = f;
                                }
                                if (a3 > numColumns2) {
                                    i4 = getWidth();
                                } else {
                                    i4 = f2;
                                }
                            } else {
                                if (a3 > numColumns2) {
                                    i = 0;
                                } else {
                                    i = f2;
                                }
                                if (numColumns > a2) {
                                    i2 = getWidth();
                                } else {
                                    i2 = f;
                                }
                                int i8 = i2;
                                i3 = i;
                                i4 = i8;
                            }
                            canvas.drawRect(i3, top, i4, bottom, bVar.h);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter2 = hVar;
                            it = it2;
                        }
                        materialCalendarGridView = this;
                        max = i6;
                        min = i7;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            c(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = l.k();
        if (f.wh(getContext())) {
            setNextFocusLeftId(ky8.a);
            setNextFocusRightId(ky8.c);
        }
        this.b = f.xh(getContext());
        syb.u0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof h) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), h.class.getCanonicalName()));
    }
}
