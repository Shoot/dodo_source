package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import com.huawei.hms.adapter.internal.CommonCode;
import java.lang.reflect.Method;
/* compiled from: ListPopupWindow.java */
/* renamed from: dr5  reason: default package */
/* loaded from: classes.dex */
public class dr5 implements eka {
    private static Method S4;
    private static Method T4;
    private static Method U4;
    private Runnable A;
    final Handler B;
    private final Rect I;
    private Rect X;
    private boolean Y;
    PopupWindow Z;
    private Context a;
    private ListAdapter b;
    c93 c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    int o;
    private View p;
    private int q;
    private DataSetObserver r;
    private View s;
    private Drawable t;
    private AdapterView.OnItemClickListener u;
    private AdapterView.OnItemSelectedListener v;
    final i w;
    private final h x;
    private final g y;
    private final e z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: dr5$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t = dr5.this.t();
            if (t != null && t.getWindowToken() != null) {
                dr5.this.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: dr5$c */
    /* loaded from: classes.dex */
    public static class c {
        static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: dr5$d */
    /* loaded from: classes.dex */
    public static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: dr5$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dr5.this.r();
        }
    }

    /* compiled from: ListPopupWindow.java */
    /* renamed from: dr5$f */
    /* loaded from: classes.dex */
    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (dr5.this.b()) {
                dr5.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            dr5.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: dr5$h */
    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = dr5.this.Z) != null && popupWindow.isShowing() && x >= 0 && x < dr5.this.Z.getWidth() && y >= 0 && y < dr5.this.Z.getHeight()) {
                dr5 dr5Var = dr5.this;
                dr5Var.B.postDelayed(dr5Var.w, 250L);
                return false;
            } else if (action == 1) {
                dr5 dr5Var2 = dr5.this;
                dr5Var2.B.removeCallbacks(dr5Var2.w);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: dr5$i */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c93 c93Var = dr5.this.c;
            if (c93Var != null && syb.X(c93Var) && dr5.this.c.getCount() > dr5.this.c.getChildCount()) {
                int childCount = dr5.this.c.getChildCount();
                dr5 dr5Var = dr5.this;
                if (childCount <= dr5Var.o) {
                    dr5Var.Z.setInputMethodMode(2);
                    dr5.this.c();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                S4 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                U4 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                T4 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public dr5(@NonNull Context context) {
        this(context, null, aw8.G);
    }

    private void C() {
        View view = this.p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.p);
            }
        }
    }

    private void N(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = S4;
            if (method != null) {
                try {
                    method.invoke(this.Z, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        d.b(this.Z, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int q() {
        int i2;
        int i3;
        int makeMeasureSpec;
        int i4;
        boolean z = true;
        if (this.c == null) {
            Context context = this.a;
            this.A = new a();
            c93 s = s(context, !this.Y);
            this.c = s;
            Drawable drawable = this.t;
            if (drawable != null) {
                s.setSelector(drawable);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.u);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new b());
            this.c.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c93 c93Var = this.c;
            View view = this.p;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.q;
                if (i5 != 0) {
                    if (i5 != 1) {
                        Log.e("ListPopupWindow", "Invalid hint position " + this.q);
                    } else {
                        linearLayout.addView(c93Var, layoutParams);
                        linearLayout.addView(view);
                    }
                } else {
                    linearLayout.addView(view);
                    linearLayout.addView(c93Var, layoutParams);
                }
                int i6 = this.e;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i2 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                c93Var = linearLayout;
            } else {
                i2 = 0;
            }
            this.Z.setContentView(c93Var);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.Z.getContentView();
            View view2 = this.p;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i2 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.Z.getBackground();
        if (background != null) {
            background.getPadding(this.I);
            Rect rect = this.I;
            int i7 = rect.top;
            i3 = rect.bottom + i7;
            if (!this.i) {
                this.g = -i7;
            }
        } else {
            this.I.setEmpty();
            i3 = 0;
        }
        if (this.Z.getInputMethodMode() != 2) {
            z = false;
        }
        int u = u(t(), this.g, z);
        if (!this.m && this.d != -1) {
            int i8 = this.e;
            if (i8 != -2) {
                if (i8 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                } else {
                    int i9 = this.a.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.I;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i10 = this.a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.I;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), Integer.MIN_VALUE);
            }
            int f2 = this.c.f(makeMeasureSpec, 0, -1, u - i2, -1);
            if (f2 > 0) {
                i2 += i3 + this.c.getPaddingTop() + this.c.getPaddingBottom();
            }
            return f2 + i2;
        }
        return u + i3;
    }

    private int u(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = T4;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.Z, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.Z.getMaxAvailableHeight(view, i2);
        }
        return c.a(this.Z, view, i2, z);
    }

    public boolean A() {
        if (this.Z.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    public boolean B() {
        return this.Y;
    }

    public void D(View view) {
        this.s = view;
    }

    public void E(int i2) {
        this.Z.setAnimationStyle(i2);
    }

    public void F(int i2) {
        Drawable background = this.Z.getBackground();
        if (background != null) {
            background.getPadding(this.I);
            Rect rect = this.I;
            this.e = rect.left + rect.right + i2;
            return;
        }
        Q(i2);
    }

    public void G(int i2) {
        this.l = i2;
    }

    public void H(Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.X = rect2;
    }

    public void I(int i2) {
        this.Z.setInputMethodMode(i2);
    }

    public void J(boolean z) {
        this.Y = z;
        this.Z.setFocusable(z);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.Z.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.u = onItemClickListener;
    }

    public void M(boolean z) {
        this.k = true;
        this.j = z;
    }

    public void O(int i2) {
        this.q = i2;
    }

    public void P(int i2) {
        c93 c93Var = this.c;
        if (b() && c93Var != null) {
            c93Var.setListSelectionHidden(false);
            c93Var.setSelection(i2);
            if (c93Var.getChoiceMode() != 0) {
                c93Var.setItemChecked(i2, true);
            }
        }
    }

    public void Q(int i2) {
        this.e = i2;
    }

    public void a(Drawable drawable) {
        this.Z.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.eka
    public boolean b() {
        return this.Z.isShowing();
    }

    @Override // defpackage.eka
    public void c() {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int q = q();
        boolean A = A();
        tf8.b(this.Z, this.h);
        boolean z2 = true;
        if (this.Z.isShowing()) {
            if (!syb.X(t())) {
                return;
            }
            int i6 = this.e;
            if (i6 == -1) {
                i6 = -1;
            } else if (i6 == -2) {
                i6 = t().getWidth();
            }
            int i7 = this.d;
            if (i7 == -1) {
                if (!A) {
                    q = -1;
                }
                if (A) {
                    PopupWindow popupWindow = this.Z;
                    if (this.e == -1) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                    popupWindow.setWidth(i5);
                    this.Z.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.Z;
                    if (this.e == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow2.setWidth(i4);
                    this.Z.setHeight(-1);
                }
            } else if (i7 != -2) {
                q = i7;
            }
            this.Z.setOutsideTouchable((this.n || this.m) ? false : false);
            PopupWindow popupWindow3 = this.Z;
            View t = t();
            int i8 = this.f;
            int i9 = this.g;
            if (i6 < 0) {
                i2 = -1;
            } else {
                i2 = i6;
            }
            if (q < 0) {
                i3 = -1;
            } else {
                i3 = q;
            }
            popupWindow3.update(t, i8, i9, i2, i3);
            return;
        }
        int i10 = this.e;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = t().getWidth();
        }
        int i11 = this.d;
        if (i11 == -1) {
            q = -1;
        } else if (i11 != -2) {
            q = i11;
        }
        this.Z.setWidth(i10);
        this.Z.setHeight(q);
        N(true);
        PopupWindow popupWindow4 = this.Z;
        if (!this.n && !this.m) {
            z = true;
        } else {
            z = false;
        }
        popupWindow4.setOutsideTouchable(z);
        this.Z.setTouchInterceptor(this.x);
        if (this.k) {
            tf8.a(this.Z, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = U4;
            if (method != null) {
                try {
                    method.invoke(this.Z, this.X);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            d.a(this.Z, this.X);
        }
        tf8.c(this.Z, t(), this.f, this.g, this.l);
        this.c.setSelection(-1);
        if (!this.Y || this.c.isInTouchMode()) {
            r();
        }
        if (!this.Y) {
            this.B.post(this.z);
        }
    }

    public int d() {
        return this.f;
    }

    @Override // defpackage.eka
    public void dismiss() {
        this.Z.dismiss();
        C();
        this.Z.setContentView(null);
        this.c = null;
        this.B.removeCallbacks(this.w);
    }

    public void f(int i2) {
        this.f = i2;
    }

    public Drawable h() {
        return this.Z.getBackground();
    }

    public void j(int i2) {
        this.g = i2;
        this.i = true;
    }

    public int m() {
        if (!this.i) {
            return 0;
        }
        return this.g;
    }

    public void n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new f();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r);
        }
        c93 c93Var = this.c;
        if (c93Var != null) {
            c93Var.setAdapter(this.b);
        }
    }

    @Override // defpackage.eka
    public ListView p() {
        return this.c;
    }

    public void r() {
        c93 c93Var = this.c;
        if (c93Var != null) {
            c93Var.setListSelectionHidden(true);
            c93Var.requestLayout();
        }
    }

    @NonNull
    c93 s(Context context, boolean z) {
        return new c93(context, z);
    }

    public View t() {
        return this.s;
    }

    public Object v() {
        if (!b()) {
            return null;
        }
        return this.c.getSelectedItem();
    }

    public long w() {
        if (!b()) {
            return Long.MIN_VALUE;
        }
        return this.c.getSelectedItemId();
    }

    public int x() {
        if (!b()) {
            return -1;
        }
        return this.c.getSelectedItemPosition();
    }

    public View y() {
        if (!b()) {
            return null;
        }
        return this.c.getSelectedView();
    }

    public int z() {
        return this.e;
    }

    public dr5(@NonNull Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public dr5(@NonNull Context context, AttributeSet attributeSet, int i2, int i3) {
        this.d = -2;
        this.e = -2;
        this.h = CommonCode.BusInterceptor.PRIVACY_CANCEL;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = Integer.MAX_VALUE;
        this.q = 0;
        this.w = new i();
        this.x = new h();
        this.y = new g();
        this.z = new e();
        this.I = new Rect();
        this.a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n29.n1, i2, i3);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(n29.o1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(n29.p1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        ln lnVar = new ln(context, attributeSet, i2, i3);
        this.Z = lnVar;
        lnVar.setInputMethodMode(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: dr5$b */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            c93 c93Var;
            if (i != -1 && (c93Var = dr5.this.c) != null) {
                c93Var.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* renamed from: dr5$g */
    /* loaded from: classes.dex */
    public class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !dr5.this.A() && dr5.this.Z.getContentView() != null) {
                dr5 dr5Var = dr5.this;
                dr5Var.B.removeCallbacks(dr5Var.w);
                dr5.this.w.run();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }
    }
}
