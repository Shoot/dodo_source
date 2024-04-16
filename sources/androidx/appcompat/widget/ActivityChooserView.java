package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {
    final f a;
    private final g b;
    private final View c;
    private final Drawable d;
    final FrameLayout e;
    private final ImageView f;
    final FrameLayout g;
    private final ImageView h;
    private final int i;
    y4 j;
    final DataSetObserver k;
    private final ViewTreeObserver.OnGlobalLayoutListener l;
    private dr5 m;
    PopupWindow.OnDismissListener n;
    boolean o;
    int p;
    private boolean q;
    private int r;

    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {
        private static final int[] a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            e0 u = e0.u(context, attributeSet, a);
            setBackgroundDrawable(u.g(0));
            u.w();
        }
    }

    /* loaded from: classes.dex */
    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.a.notifyDataSetInvalidated();
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().c();
                y4 y4Var = ActivityChooserView.this.j;
                if (y4Var != null) {
                    y4Var.k(true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            d4.d1(accessibilityNodeInfo).k0(true);
        }
    }

    /* loaded from: classes.dex */
    class d extends u54 {
        d(View view) {
            super(view);
        }

        @Override // defpackage.u54
        public eka b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // defpackage.u54
        protected boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // defpackage.u54
        protected boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f extends BaseAdapter {
        private androidx.appcompat.widget.c a;
        private int b = 4;
        private boolean c;
        private boolean d;
        private boolean e;

        f() {
        }

        public int a() {
            return this.a.f();
        }

        public androidx.appcompat.widget.c b() {
            return this.a;
        }

        public ResolveInfo c() {
            return this.a.h();
        }

        public int d() {
            return this.a.i();
        }

        public boolean e() {
            return this.c;
        }

        public int f() {
            int i = this.b;
            this.b = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.b = i;
            return i2;
        }

        public void g(androidx.appcompat.widget.c cVar) {
            androidx.appcompat.widget.c b = ActivityChooserView.this.a.b();
            if (b != null && ActivityChooserView.this.isShown()) {
                b.unregisterObserver(ActivityChooserView.this.k);
            }
            this.a = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.k);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int f = this.a.f();
            if (!this.c && this.a.h() != null) {
                f--;
            }
            int min = Math.min(f, this.b);
            if (this.e) {
                return min + 1;
            }
            return min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.c && this.a.h() != null) {
                i++;
            }
            return this.a.e(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            if (this.e && i == getCount() - 1) {
                return 1;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view == null || view.getId() != 1) {
                        View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(xz8.f, viewGroup, false);
                        inflate.setId(1);
                        ((TextView) inflate.findViewById(ay8.S)).setText(ActivityChooserView.this.getContext().getString(h19.b));
                        return inflate;
                    }
                    return view;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != ay8.x) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(xz8.f, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            ((ImageView) view.findViewById(ay8.v)).setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(ay8.S)).setText(resolveInfo.loadLabel(packageManager));
            if (this.c && i == 0 && this.d) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i) {
            if (this.b != i) {
                this.b = i;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z, boolean z2) {
            if (this.c != z || this.d != z2) {
                this.c = z;
                this.d = z2;
                notifyDataSetChanged();
            }
        }

        public void j(boolean z) {
            if (this.e != z) {
                this.e = z;
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.n;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.g) {
                activityChooserView.a();
                Intent b = ActivityChooserView.this.a.b().b(ActivityChooserView.this.a.b().g(ActivityChooserView.this.a.c()));
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            } else if (view == activityChooserView.e) {
                activityChooserView.o = false;
                activityChooserView.d(activityChooserView.p);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            y4 y4Var = ActivityChooserView.this.j;
            if (y4Var != null) {
                y4Var.k(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.d(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.o) {
                if (i > 0) {
                    activityChooserView.a.b().o(i);
                    return;
                }
                return;
            }
            if (!activityChooserView.a.e()) {
                i++;
            }
            Intent b = ActivityChooserView.this.a.b().b(i);
            if (b != null) {
                b.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(b);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.g) {
                if (activityChooserView.a.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.o = true;
                    activityChooserView2.d(activityChooserView2.p);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(@NonNull Context context) {
        this(context, null);
    }

    public boolean a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.l);
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean b() {
        return getListPopupWindow().b();
    }

    public boolean c() {
        if (b() || !this.q) {
            return false;
        }
        this.o = false;
        d(this.p);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    void d(int i) {
        ?? r0;
        if (this.a.b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.l);
            if (this.g.getVisibility() == 0) {
                r0 = 1;
            } else {
                r0 = 0;
            }
            int a2 = this.a.a();
            if (i != Integer.MAX_VALUE && a2 > i + r0) {
                this.a.j(true);
                this.a.h(i - 1);
            } else {
                this.a.j(false);
                this.a.h(i);
            }
            dr5 listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.b()) {
                if (!this.o && r0 != 0) {
                    this.a.i(false, false);
                } else {
                    this.a.i(true, r0);
                }
                listPopupWindow.F(Math.min(this.a.f(), this.i));
                listPopupWindow.c();
                y4 y4Var = this.j;
                if (y4Var != null) {
                    y4Var.k(true);
                }
                listPopupWindow.p().setContentDescription(getContext().getString(h19.c));
                listPopupWindow.p().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    void e() {
        if (this.a.getCount() > 0) {
            this.e.setEnabled(true);
        } else {
            this.e.setEnabled(false);
        }
        int a2 = this.a.a();
        int d2 = this.a.d();
        if (a2 != 1 && (a2 <= 1 || d2 <= 0)) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            ResolveInfo c2 = this.a.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.h.setImageDrawable(c2.loadIcon(packageManager));
            if (this.r != 0) {
                this.g.setContentDescription(getContext().getString(this.r, c2.loadLabel(packageManager)));
            }
        }
        if (this.g.getVisibility() == 0) {
            this.c.setBackgroundDrawable(this.d);
        } else {
            this.c.setBackgroundDrawable(null);
        }
    }

    public androidx.appcompat.widget.c getDataModel() {
        return this.a.b();
    }

    dr5 getListPopupWindow() {
        if (this.m == null) {
            dr5 dr5Var = new dr5(getContext());
            this.m = dr5Var;
            dr5Var.n(this.a);
            this.m.D(this);
            this.m.J(true);
            this.m.L(this.b);
            this.m.K(this.b);
        }
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.c b2 = this.a.b();
        if (b2 != null) {
            b2.registerObserver(this.k);
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c b2 = this.a.b();
        if (b2 != null) {
            b2.unregisterObserver(this.k);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.l);
        }
        if (b()) {
            a();
        }
        this.q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
        if (!b()) {
            a();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        View view = this.c;
        if (this.g.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(androidx.appcompat.widget.c cVar) {
        this.a.g(cVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.r = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.p = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    public void setProvider(y4 y4Var) {
        this.j = y4Var;
    }

    public ActivityChooserView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new a();
        this.l = new b();
        this.p = 4;
        int[] iArr = n29.E;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        syb.s0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.p = obtainStyledAttributes.getInt(n29.G, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(n29.F);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(xz8.e, (ViewGroup) this, true);
        g gVar = new g();
        this.b = gVar;
        View findViewById = findViewById(ay8.j);
        this.c = findViewById;
        this.d = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(ay8.r);
        this.g = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i2 = ay8.w;
        this.h = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(ay8.t);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.e = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.a = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(xw8.d));
    }
}
