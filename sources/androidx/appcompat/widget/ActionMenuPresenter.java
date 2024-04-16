package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import defpackage.y4;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements y4.a {
    c A;
    private b B;
    final f I;
    int X;
    d k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private final SparseBooleanArray x;
    e y;
    a z;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, aw8.m);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).i : view2);
            }
            j(ActionMenuPresenter.this.I);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.i
        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.z = null;
            actionMenuPresenter.X = 0;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public eka a() {
            a aVar = ActionMenuPresenter.this.z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        private e a;

        public c(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).c != null) {
                ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).i;
            if (view != null && view.getWindowToken() != null && this.a.m()) {
                ActionMenuPresenter.this.y = this.a;
            }
            ActionMenuPresenter.this.A = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* loaded from: classes.dex */
        class a extends u54 {
            final /* synthetic */ ActionMenuPresenter j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.j = actionMenuPresenter;
            }

            @Override // defpackage.u54
            public eka b() {
                e eVar = ActionMenuPresenter.this.y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // defpackage.u54
            public boolean c() {
                ActionMenuPresenter.this.N();
                return true;
            }

            @Override // defpackage.u54
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.A != null) {
                    return false;
                }
                actionMenuPresenter.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, aw8.l);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            yib.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.N();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                f83.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, aw8.m);
            h(8388613);
            j(ActionMenuPresenter.this.I);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.i
        public void e() {
            if (((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).c != null) {
                ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).c.close();
            }
            ActionMenuPresenter.this.y = null;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(@NonNull androidx.appcompat.view.menu.e eVar, boolean z) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.F().e(false);
            }
            j.a p = ActionMenuPresenter.this.p();
            if (p != null) {
                p.a(eVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).c) {
                return false;
            }
            ActionMenuPresenter.this.X = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a p = ActionMenuPresenter.this.p();
            if (p == null) {
                return false;
            }
            return p.b(eVar);
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, xz8.c, xz8.b);
        this.x = new SparseBooleanArray();
        this.I = new f();
    }

    private View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean B() {
        return E() | F();
    }

    public Drawable D() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.m) {
            return this.l;
        }
        return null;
    }

    public boolean E() {
        androidx.appcompat.view.menu.k kVar;
        c cVar = this.A;
        if (cVar != null && (kVar = this.i) != null) {
            ((View) kVar).removeCallbacks(cVar);
            this.A = null;
            return true;
        }
        e eVar = this.y;
        if (eVar != null) {
            eVar.b();
            return true;
        }
        return false;
    }

    public boolean F() {
        a aVar = this.z;
        if (aVar != null) {
            aVar.b();
            return true;
        }
        return false;
    }

    public boolean G() {
        if (this.A == null && !H()) {
            return false;
        }
        return true;
    }

    public boolean H() {
        e eVar = this.y;
        if (eVar != null && eVar.d()) {
            return true;
        }
        return false;
    }

    public void I(Configuration configuration) {
        if (!this.s) {
            this.r = v4.b(this.b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            eVar.M(true);
        }
    }

    public void J(boolean z) {
        this.v = z;
    }

    public void K(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.c(this.c);
    }

    public void L(Drawable drawable) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.m = true;
        this.l = drawable;
    }

    public void M(boolean z) {
        this.n = z;
        this.o = true;
    }

    public boolean N() {
        androidx.appcompat.view.menu.e eVar;
        if (this.n && !H() && (eVar = this.c) != null && this.i != null && this.A == null && !eVar.B().isEmpty()) {
            c cVar = new c(new e(this.b, this.c, this.k, true));
            this.A = cVar;
            ((View) this.i).post(cVar);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        B();
        super.a(eVar, z);
    }

    @Override // defpackage.y4.a
    public void b(boolean z) {
        if (z) {
            super.g(null);
            return;
        }
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            eVar.e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).a) > 0 && (findItem = this.c.findItem(i)) != null) {
            g((androidx.appcompat.view.menu.m) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean g(androidx.appcompat.view.menu.m mVar) {
        boolean z = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.i0() != this.c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.i0();
        }
        View C = C(mVar2.getItem());
        if (C == null) {
            return false;
        }
        this.X = mVar.getItem().getItemId();
        int size = mVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        a aVar = new a(this.b, mVar, C);
        this.z = aVar;
        aVar.g(z);
        this.z.k();
        super.g(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        SavedState savedState = new SavedState();
        savedState.a = this.X;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(boolean z) {
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int size;
        super.i(z);
        ((View) this.i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> u = eVar.u();
            int size2 = u.size();
            for (int i = 0; i < size2; i++) {
                y4 b2 = u.get(i).b();
                if (b2 != null) {
                    b2.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.c;
        if (eVar2 != null) {
            arrayList = eVar2.B();
        } else {
            arrayList = null;
        }
        if (this.n && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!arrayList.get(0).isActionViewExpanded()))) {
            if (this.k == null) {
                this.k = new d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.k.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.k, actionMenuView.F());
            }
        } else {
            d dVar = this.k;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                androidx.appcompat.view.menu.k kVar = this.i;
                if (parent == kVar) {
                    ((ViewGroup) kVar).removeView(this.k);
                }
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.e eVar = actionMenuPresenter.c;
        View view = null;
        int i5 = 0;
        if (eVar != null) {
            arrayList = eVar.G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.r;
        int i7 = actionMenuPresenter.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.i;
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            androidx.appcompat.view.menu.g gVar = arrayList.get(i10);
            if (gVar.o()) {
                i8++;
            } else if (gVar.n()) {
                i9++;
            } else {
                z3 = true;
            }
            if (actionMenuPresenter.v && gVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.n && (z3 || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.t) {
            int i12 = actionMenuPresenter.w;
            i3 = i7 / i12;
            i2 = i12 + ((i7 % i12) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i13);
            if (gVar2.o()) {
                View q = actionMenuPresenter.q(gVar2, view, viewGroup);
                if (actionMenuPresenter.t) {
                    i3 -= ActionMenuView.L(q, i2, i3, makeMeasureSpec, i5);
                } else {
                    q.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = q.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i4 = i;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                if ((i11 > 0 || z4) && i7 > 0 && (!actionMenuPresenter.t || i3 > 0)) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = z;
                i4 = i;
                if (z) {
                    View q2 = actionMenuPresenter.q(gVar2, null, viewGroup);
                    if (actionMenuPresenter.t) {
                        int L = ActionMenuView.L(q2, i2, i3, makeMeasureSpec, 0);
                        i3 -= L;
                        if (L == 0) {
                            z5 = false;
                        }
                    } else {
                        q2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = q2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    if (!actionMenuPresenter.t ? i7 + i14 > 0 : i7 >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = z6 & z2;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayList.get(i15);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i11++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z) {
                    i11--;
                }
                gVar2.u(z);
            } else {
                i4 = i;
                gVar2.u(false);
                i13++;
                view = null;
                actionMenuPresenter = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            actionMenuPresenter = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void l(@NonNull Context context, androidx.appcompat.view.menu.e eVar) {
        super.l(context, eVar);
        Resources resources = context.getResources();
        v4 b2 = v4.b(context);
        if (!this.o) {
            this.n = b2.h();
        }
        if (!this.u) {
            this.p = b2.c();
        }
        if (!this.s) {
            this.r = b2.d();
        }
        int i = this.p;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.a);
                this.k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i;
        this.w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void m(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean o(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.k) {
            return false;
        }
        return super.o(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.a
    public View q(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        int i;
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.q(gVar, view, viewGroup);
        }
        if (gVar.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k r(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.i;
        androidx.appcompat.view.menu.k r = super.r(viewGroup);
        if (kVar != r) {
            ((ActionMenuView) r).setPresenter(this);
        }
        return r;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean t(int i, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }
}
