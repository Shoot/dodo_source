package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.e0;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {
    private static final int[] c = {16842964, 16843049};
    private e a;
    private int b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(e eVar) {
        this.a = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean e(g gVar) {
        return this.a.N(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        e((g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        e0 v = e0.v(context, attributeSet, c, i, 0);
        if (v.s(0)) {
            setBackgroundDrawable(v.g(0));
        }
        if (v.s(1)) {
            setDivider(v.g(1));
        }
        v.w();
    }
}
