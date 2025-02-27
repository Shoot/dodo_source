package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MenuPopup.java */
/* loaded from: classes.dex */
public abstract class h implements eka, j, AdapterView.OnItemClickListener {
    private Rect a;

    /* JADX INFO: Access modifiers changed from: protected */
    public static d A(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (d) listAdapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean z(e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    public abstract void m(e eVar);

    protected boolean n() {
        return true;
    }

    public Rect o() {
        return this.a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        e eVar = A(listAdapter).a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (n()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        eVar.O(menuItem, this, i2);
    }

    public abstract void r(View view);

    public void s(Rect rect) {
        this.a = rect;
    }

    public abstract void t(boolean z);

    public abstract void u(int i);

    public abstract void v(int i);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(boolean z);

    public abstract void y(int i);

    @Override // androidx.appcompat.view.menu.j
    public void l(@NonNull Context context, e eVar) {
    }
}
