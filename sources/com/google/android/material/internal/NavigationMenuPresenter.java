package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import defpackage.d4;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class NavigationMenuPresenter implements j {
    int A;
    private NavigationMenuView a;
    LinearLayout b;
    private j.a c;
    androidx.appcompat.view.menu.e d;
    private int e;
    b f;
    LayoutInflater g;
    ColorStateList i;
    ColorStateList k;
    ColorStateList l;
    Drawable m;
    RippleDrawable n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;
    int u;
    int v;
    boolean w;
    private int y;
    private int z;
    int h = 0;
    int j = 0;
    boolean x = true;
    private int B = -1;
    final View.OnClickListener I = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(kz8.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(kz8.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(kz8.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* loaded from: classes2.dex */
    private static abstract class ViewHolder extends RecyclerView.d0 {
        public ViewHolder(View view) {
            super(view);
        }
    }

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            NavigationMenuPresenter.this.V(true);
            androidx.appcompat.view.menu.g itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean O = navigationMenuPresenter.d.O(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && O) {
                NavigationMenuPresenter.this.f.r(itemData);
            } else {
                z = false;
            }
            NavigationMenuPresenter.this.V(false);
            if (z) {
                NavigationMenuPresenter.this.i(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.h<ViewHolder> {
        private final ArrayList<d> a = new ArrayList<>();
        private androidx.appcompat.view.menu.g b;
        private boolean c;

        b() {
            p();
        }

        private void i(int i, int i2) {
            while (i < i2) {
                ((f) this.a.get(i)).b = true;
                i++;
            }
        }

        private void p() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.clear();
            this.a.add(new c());
            int size = NavigationMenuPresenter.this.d.G().size();
            int i = -1;
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                androidx.appcompat.view.menu.g gVar = NavigationMenuPresenter.this.d.G().get(i3);
                if (gVar.isChecked()) {
                    r(gVar);
                }
                if (gVar.isCheckable()) {
                    gVar.t(false);
                }
                if (gVar.hasSubMenu()) {
                    SubMenu subMenu = gVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.a.add(new e(NavigationMenuPresenter.this.A, 0));
                        }
                        this.a.add(new f(gVar));
                        int size2 = this.a.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) subMenu.getItem(i4);
                            if (gVar2.isVisible()) {
                                if (!z2 && gVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (gVar2.isCheckable()) {
                                    gVar2.t(false);
                                }
                                if (gVar.isChecked()) {
                                    r(gVar);
                                }
                                this.a.add(new f(gVar2));
                            }
                        }
                        if (z2) {
                            i(size2, this.a.size());
                        }
                    }
                } else {
                    int groupId = gVar.getGroupId();
                    if (groupId != i) {
                        i2 = this.a.size();
                        if (gVar.getIcon() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i3 != 0) {
                            i2++;
                            ArrayList<d> arrayList = this.a;
                            int i5 = NavigationMenuPresenter.this.A;
                            arrayList.add(new e(i5, i5));
                        }
                    } else if (!z && gVar.getIcon() != null) {
                        i(i2, this.a.size());
                        z = true;
                    }
                    f fVar = new f(gVar);
                    fVar.b = z;
                    this.a.add(fVar);
                    i = groupId;
                }
            }
            this.c = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i) {
            d dVar = this.a.get(i);
            if (dVar instanceof e) {
                return 2;
            }
            if (dVar instanceof c) {
                return 3;
            }
            if (dVar instanceof f) {
                if (((f) dVar).a().hasSubMenu()) {
                    return 1;
                }
                return 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @NonNull
        public Bundle j() {
            View view;
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.g gVar = this.b;
            if (gVar != null) {
                bundle.putInt("android:menu:checked", gVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                d dVar = this.a.get(i);
                if (dVar instanceof f) {
                    androidx.appcompat.view.menu.g a = ((f) dVar).a();
                    if (a != null) {
                        view = a.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.g k() {
            return this.b;
        }

        int l() {
            int i;
            if (NavigationMenuPresenter.this.b.getChildCount() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < NavigationMenuPresenter.this.f.getItemCount(); i2++) {
                if (NavigationMenuPresenter.this.f.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: m */
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            Drawable drawable;
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType == 2) {
                        e eVar = (e) this.a.get(i);
                        viewHolder.itemView.setPadding(NavigationMenuPresenter.this.s, eVar.b(), NavigationMenuPresenter.this.t, eVar.a());
                        return;
                    }
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((f) this.a.get(i)).a().getTitle());
                int i2 = NavigationMenuPresenter.this.h;
                if (i2 != 0) {
                    edb.o(textView, i2);
                }
                textView.setPadding(NavigationMenuPresenter.this.u, textView.getPaddingTop(), NavigationMenuPresenter.this.v, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                    return;
                }
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.l);
            int i3 = NavigationMenuPresenter.this.j;
            if (i3 != 0) {
                navigationMenuItemView.setTextAppearance(i3);
            }
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.k;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable2 = NavigationMenuPresenter.this.m;
            if (drawable2 != null) {
                drawable = drawable2.getConstantState().newDrawable();
            } else {
                drawable = null;
            }
            syb.y0(navigationMenuItemView, drawable);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.n;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            f fVar = (f) this.a.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(fVar.b);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i4 = navigationMenuPresenter.o;
            int i5 = navigationMenuPresenter.p;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.q);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.w) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.r);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.y);
            navigationMenuItemView.d(fVar.a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: n */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return new HeaderViewHolder(NavigationMenuPresenter.this.b);
                    }
                    return new SeparatorViewHolder(NavigationMenuPresenter.this.g, viewGroup);
                }
                return new SubheaderViewHolder(NavigationMenuPresenter.this.g, viewGroup);
            }
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            return new NormalViewHolder(navigationMenuPresenter.g, viewGroup, navigationMenuPresenter.I);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: o */
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).D();
            }
        }

        public void q(@NonNull Bundle bundle) {
            androidx.appcompat.view.menu.g a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.g a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.c = true;
                int size = this.a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    d dVar = this.a.get(i2);
                    if ((dVar instanceof f) && (a2 = ((f) dVar).a()) != null && a2.getItemId() == i) {
                        r(a2);
                        break;
                    }
                    i2++;
                }
                this.c = false;
                p();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d dVar2 = this.a.get(i3);
                    if ((dVar2 instanceof f) && (a = ((f) dVar2).a()) != null && (actionView = a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void r(@NonNull androidx.appcompat.view.menu.g gVar) {
            if (this.b != gVar && gVar.isCheckable()) {
                androidx.appcompat.view.menu.g gVar2 = this.b;
                if (gVar2 != null) {
                    gVar2.setChecked(false);
                }
                this.b = gVar;
                gVar.setChecked(true);
            }
        }

        public void s(boolean z) {
            this.c = z;
        }

        public void t() {
            p();
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c implements d {
        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface d {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class e implements d {
        private final int a;
        private final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f implements d {
        private final androidx.appcompat.view.menu.g a;
        boolean b;

        f(androidx.appcompat.view.menu.g gVar) {
            this.a = gVar;
        }

        public androidx.appcompat.view.menu.g a() {
            return this.a;
        }
    }

    /* loaded from: classes2.dex */
    private class g extends o {
        g(@NonNull RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.o, defpackage.s2
        public void g(View view, @NonNull d4 d4Var) {
            super.g(view, d4Var);
            d4Var.p0(d4.b.c(NavigationMenuPresenter.this.f.l(), 0, false));
        }
    }

    private void W() {
        int i;
        if (this.b.getChildCount() == 0 && this.x) {
            i = this.z;
        } else {
            i = 0;
        }
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    public int A() {
        return this.u;
    }

    public View B(int i) {
        View inflate = this.g.inflate(i, (ViewGroup) this.b, false);
        c(inflate);
        return inflate;
    }

    public void C(boolean z) {
        if (this.x != z) {
            this.x = z;
            W();
        }
    }

    public void D(@NonNull androidx.appcompat.view.menu.g gVar) {
        this.f.r(gVar);
    }

    public void E(int i) {
        this.t = i;
        i(false);
    }

    public void F(int i) {
        this.s = i;
        i(false);
    }

    public void G(int i) {
        this.e = i;
    }

    public void H(Drawable drawable) {
        this.m = drawable;
        i(false);
    }

    public void I(RippleDrawable rippleDrawable) {
        this.n = rippleDrawable;
        i(false);
    }

    public void J(int i) {
        this.o = i;
        i(false);
    }

    public void K(int i) {
        this.q = i;
        i(false);
    }

    public void L(int i) {
        if (this.r != i) {
            this.r = i;
            this.w = true;
            i(false);
        }
    }

    public void M(ColorStateList colorStateList) {
        this.l = colorStateList;
        i(false);
    }

    public void N(int i) {
        this.y = i;
        i(false);
    }

    public void O(int i) {
        this.j = i;
        i(false);
    }

    public void P(ColorStateList colorStateList) {
        this.k = colorStateList;
        i(false);
    }

    public void Q(int i) {
        this.p = i;
        i(false);
    }

    public void R(int i) {
        this.B = i;
        NavigationMenuView navigationMenuView = this.a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    public void S(ColorStateList colorStateList) {
        this.i = colorStateList;
        i(false);
    }

    public void T(int i) {
        this.u = i;
        i(false);
    }

    public void U(int i) {
        this.h = i;
        i(false);
    }

    public void V(boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.s(z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        j.a aVar = this.c;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    public void c(@NonNull View view) {
        this.b.addView(view);
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f.q(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.e;
    }

    @Override // androidx.appcompat.view.menu.j
    @NonNull
    public Parcelable h() {
        Bundle bundle = new Bundle();
        if (this.a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        b bVar = this.f;
        if (bVar != null) {
            bundle.putBundle("android:menu:adapter", bVar.j());
        }
        if (this.b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.t();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(@NonNull Context context, @NonNull androidx.appcompat.view.menu.e eVar) {
        this.g = LayoutInflater.from(context);
        this.d = eVar;
        this.A = context.getResources().getDimensionPixelOffset(ww8.design_navigation_separator_vertical_padding);
    }

    public void m(@NonNull c5c c5cVar) {
        int l = c5cVar.l();
        if (this.z != l) {
            this.z = l;
            W();
        }
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c5cVar.i());
        syb.i(this.b, c5cVar);
    }

    public androidx.appcompat.view.menu.g n() {
        return this.f.k();
    }

    public int o() {
        return this.t;
    }

    public int p() {
        return this.s;
    }

    public int q() {
        return this.b.getChildCount();
    }

    public Drawable r() {
        return this.m;
    }

    public int s() {
        return this.o;
    }

    public int t() {
        return this.q;
    }

    public int u() {
        return this.y;
    }

    public ColorStateList v() {
        return this.k;
    }

    public ColorStateList w() {
        return this.l;
    }

    public int x() {
        return this.p;
    }

    public k y(ViewGroup viewGroup) {
        if (this.a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.g.inflate(kz8.design_navigation_menu, viewGroup, false);
            this.a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new g(this.a));
            if (this.f == null) {
                this.f = new b();
            }
            int i = this.B;
            if (i != -1) {
                this.a.setOverScrollMode(i);
            }
            this.b = (LinearLayout) this.g.inflate(kz8.design_navigation_item_header, (ViewGroup) this.a, false);
            this.a.setAdapter(this.f);
        }
        return this.a;
    }

    public int z() {
        return this.v;
    }
}
