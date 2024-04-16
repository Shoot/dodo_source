package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {
    Context a;
    LayoutInflater b;
    e c;
    ExpandedMenuView d;
    int e;
    int f;
    int g;
    private j.a h;
    a i;
    private int j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        private int a = -1;

        public a() {
            a();
        }

        void a() {
            g x = c.this.c.x();
            if (x != null) {
                ArrayList<g> B = c.this.c.B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.a = i;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public g getItem(int i) {
            ArrayList<g> B = c.this.c.B();
            int i2 = i + c.this.e;
            int i3 = this.a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.c.B().size() - c.this.e;
            if (this.a < 0) {
                return size;
            }
            return size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.b.inflate(cVar.g, viewGroup, false);
            }
            ((k.a) view).d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i) {
        this(i, 0);
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        j.a aVar = this.h;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    public ListAdapter b() {
        if (this.i == null) {
            this.i = new a();
        }
        return this.i;
    }

    public k c(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(xz8.i, viewGroup, false);
            if (this.i == null) {
                this.i = new a();
            }
            this.d.setAdapter((ListAdapter) this.i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.h;
        if (aVar != null) {
            aVar.b(mVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, e eVar) {
        if (this.f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f);
            this.a = contextThemeWrapper;
            this.b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = eVar;
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.O(this.i.getItem(i), this, 0);
    }

    public c(int i, int i2) {
        this.g = i;
        this.f = i2;
    }
}
