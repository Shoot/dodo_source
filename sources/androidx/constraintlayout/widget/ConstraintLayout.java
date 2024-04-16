package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import defpackage.hr1;
import defpackage.lr1;
import defpackage.m90;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.0";
    private static dia sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    protected androidx.constraintlayout.widget.c mConstraintLayoutSpec;
    private d mConstraintSet;
    private int mConstraintSetId;
    private pr1 mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected mr1 mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private yi6 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<lr1> mTempMapIdToWidget;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[lr1.b.values().length];
            a = iArr;
            try {
                iArr[lr1.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[lr1.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[lr1.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[lr1.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements m90.b {
        ConstraintLayout a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        private boolean d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // defpackage.m90.b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.a.getChildAt(i);
                if (childAt instanceof f) {
                    ((f) childAt).a(this.a);
                }
            }
            int size = this.a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.b) this.a.mConstraintHelpers.get(i2)).t(this.a);
                }
            }
        }

        @Override // defpackage.m90.b
        @SuppressLint({"WrongCall"})
        public final void b(lr1 lr1Var, m90.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int baseline;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            if (lr1Var == null) {
                return;
            }
            if (lr1Var.T() == 8 && !lr1Var.h0()) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
            } else if (lr1Var.L() == null) {
            } else {
                lr1.b bVar = aVar.a;
                lr1.b bVar2 = aVar.b;
                int i6 = aVar.c;
                int i7 = aVar.d;
                int i8 = this.b + this.c;
                int i9 = this.d;
                View view = (View) lr1Var.t();
                int[] iArr = a.a;
                int i10 = iArr[bVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                makeMeasureSpec = 0;
                            } else {
                                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i9, -2);
                                if (lr1Var.v == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                int i11 = aVar.j;
                                if (i11 == m90.a.l || i11 == m90.a.m) {
                                    if (view.getMeasuredHeight() == lr1Var.y()) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (aVar.j == m90.a.m || !z11 || ((z11 && z12) || (view instanceof f) || lr1Var.l0())) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(lr1Var.U(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i9 + lr1Var.C(), -1);
                        }
                    } else {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i9, -2);
                    }
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                }
                int i12 = iArr[bVar2.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                makeMeasureSpec2 = 0;
                            } else {
                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i8, -2);
                                if (lr1Var.w == 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                int i13 = aVar.j;
                                if (i13 == m90.a.l || i13 == m90.a.m) {
                                    if (view.getMeasuredWidth() == lr1Var.U()) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (aVar.j == m90.a.m || !z9 || ((z9 && z10) || (view instanceof f) || lr1Var.m0())) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(lr1Var.y(), 1073741824);
                                    }
                                }
                            }
                        } else {
                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i8 + lr1Var.S(), -1);
                        }
                    } else {
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i8, -2);
                    }
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                }
                mr1 mr1Var = (mr1) lr1Var.L();
                if (mr1Var != null && lb7.b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == lr1Var.U() && view.getMeasuredWidth() < mr1Var.U() && view.getMeasuredHeight() == lr1Var.y() && view.getMeasuredHeight() < mr1Var.y() && view.getBaseline() == lr1Var.q() && !lr1Var.k0() && d(lr1Var.D(), makeMeasureSpec, lr1Var.U()) && d(lr1Var.E(), makeMeasureSpec2, lr1Var.y())) {
                    aVar.e = lr1Var.U();
                    aVar.f = lr1Var.y();
                    aVar.g = lr1Var.q();
                    return;
                }
                lr1.b bVar3 = lr1.b.MATCH_CONSTRAINT;
                if (bVar == bVar3) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVar2 == bVar3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                lr1.b bVar4 = lr1.b.MATCH_PARENT;
                if (bVar2 != bVar4 && bVar2 != lr1.b.FIXED) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (bVar != bVar4 && bVar != lr1.b.FIXED) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z && lr1Var.e0 > 0.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z2 && lr1Var.e0 > 0.0f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (view == null) {
                    return;
                }
                b bVar5 = (b) view.getLayoutParams();
                int i14 = aVar.j;
                if (i14 != m90.a.l && i14 != m90.a.m && z && lr1Var.v == 0 && z2 && lr1Var.w == 0) {
                    i5 = -1;
                    i3 = 0;
                    baseline = 0;
                    i = 0;
                } else {
                    if ((view instanceof r1c) && (lr1Var instanceof s1c)) {
                        ((r1c) view).y((s1c) lr1Var, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    lr1Var.Q0(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i15 = lr1Var.y;
                    if (i15 > 0) {
                        i = Math.max(i15, measuredWidth);
                    } else {
                        i = measuredWidth;
                    }
                    int i16 = lr1Var.z;
                    if (i16 > 0) {
                        i = Math.min(i16, i);
                    }
                    int i17 = lr1Var.B;
                    if (i17 > 0) {
                        i3 = Math.max(i17, measuredHeight);
                        i2 = makeMeasureSpec;
                    } else {
                        i2 = makeMeasureSpec;
                        i3 = measuredHeight;
                    }
                    int i18 = lr1Var.C;
                    if (i18 > 0) {
                        i3 = Math.min(i18, i3);
                    }
                    if (!lb7.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                        if (z5 && z3) {
                            i = (int) ((i3 * lr1Var.e0) + 0.5f);
                        } else if (z6 && z4) {
                            i3 = (int) ((i / lr1Var.e0) + 0.5f);
                        }
                    }
                    if (measuredWidth != i || measuredHeight != i3) {
                        if (measuredWidth != i) {
                            i4 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                        } else {
                            i4 = i2;
                        }
                        if (measuredHeight != i3) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                        }
                        view.measure(i4, makeMeasureSpec2);
                        lr1Var.Q0(i4, makeMeasureSpec2);
                        i = view.getMeasuredWidth();
                        i3 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i5 = -1;
                }
                if (baseline != i5) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i == aVar.c && i3 == aVar.d) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                aVar.i = z8;
                if (bVar5.f0) {
                    z7 = true;
                }
                if (z7 && baseline != -1 && lr1Var.q() != baseline) {
                    aVar.i = true;
                }
                aVar.e = i;
                aVar.f = i3;
                aVar.h = z7;
                aVar.g = baseline;
            }
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new mr1();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static dia getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new dia();
        }
        return sSharedValues;
    }

    private final lr1 getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).u0;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.w0(this);
        this.mLayoutWidget.R1(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g29.m1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == g29.w1) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == g29.x1) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == g29.u1) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == g29.v1) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == g29.e3) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == g29.Z1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == g29.E1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.mConstraintSet = dVar;
                        dVar.E(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.S1(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            lr1 viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.r0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).x0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof e)) {
                    this.mConstraintSet = ((e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.mConstraintSet;
        if (dVar != null) {
            dVar.k(this, true);
        }
        this.mLayoutWidget.p1();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).w(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof f) {
                ((f) childAt3).b(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            lr1 viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.mLayoutWidget.b(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, bVar, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(lr1 lr1Var, b bVar, SparseArray<lr1> sparseArray, int i, hr1.b bVar2) {
        View view = this.mChildrenByIds.get(i);
        lr1 lr1Var2 = sparseArray.get(i);
        if (lr1Var2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f0 = true;
            hr1.b bVar3 = hr1.b.BASELINE;
            if (bVar2 == bVar3) {
                b bVar4 = (b) view.getLayoutParams();
                bVar4.f0 = true;
                bVar4.u0.F0(true);
            }
            lr1Var.p(bVar3).b(lr1Var2.p(bVar2), bVar.C, bVar.B, true);
            lr1Var.F0(true);
            lr1Var.p(hr1.b.TOP).q();
            lr1Var.p(hr1.b.BOTTOM).q();
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void applyConstraintsFromLayoutParams(boolean z, View view, lr1 lr1Var, b bVar, SparseArray<lr1> sparseArray) {
        lr1 lr1Var2;
        lr1 lr1Var3;
        lr1 lr1Var4;
        lr1 lr1Var5;
        int i;
        bVar.b();
        bVar.v0 = false;
        lr1Var.e1(view.getVisibility());
        if (bVar.i0) {
            lr1Var.O0(true);
            lr1Var.e1(8);
        }
        lr1Var.w0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).r(lr1Var, this.mLayoutWidget.L1());
        }
        if (bVar.g0) {
            vi4 vi4Var = (vi4) lr1Var;
            int i2 = bVar.r0;
            int i3 = bVar.s0;
            float f = bVar.t0;
            if (f != -1.0f) {
                vi4Var.u1(f);
                return;
            } else if (i2 != -1) {
                vi4Var.s1(i2);
                return;
            } else if (i3 != -1) {
                vi4Var.t1(i3);
                return;
            } else {
                return;
            }
        }
        int i4 = bVar.k0;
        int i5 = bVar.l0;
        int i6 = bVar.m0;
        int i7 = bVar.n0;
        int i8 = bVar.o0;
        int i9 = bVar.p0;
        float f2 = bVar.q0;
        int i10 = bVar.o;
        if (i10 != -1) {
            lr1 lr1Var6 = sparseArray.get(i10);
            if (lr1Var6 != null) {
                lr1Var.l(lr1Var6, bVar.q, bVar.p);
            }
        } else {
            if (i4 != -1) {
                lr1 lr1Var7 = sparseArray.get(i4);
                if (lr1Var7 != null) {
                    hr1.b bVar2 = hr1.b.LEFT;
                    lr1Var.c0(bVar2, lr1Var7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
                }
            } else if (i5 != -1 && (lr1Var2 = sparseArray.get(i5)) != null) {
                lr1Var.c0(hr1.b.LEFT, lr1Var2, hr1.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
            }
            if (i6 != -1) {
                lr1 lr1Var8 = sparseArray.get(i6);
                if (lr1Var8 != null) {
                    lr1Var.c0(hr1.b.RIGHT, lr1Var8, hr1.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
                }
            } else if (i7 != -1 && (lr1Var3 = sparseArray.get(i7)) != null) {
                hr1.b bVar3 = hr1.b.RIGHT;
                lr1Var.c0(bVar3, lr1Var3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
            }
            int i11 = bVar.h;
            if (i11 != -1) {
                lr1 lr1Var9 = sparseArray.get(i11);
                if (lr1Var9 != null) {
                    hr1.b bVar4 = hr1.b.TOP;
                    lr1Var.c0(bVar4, lr1Var9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.w);
                }
            } else {
                int i12 = bVar.i;
                if (i12 != -1 && (lr1Var4 = sparseArray.get(i12)) != null) {
                    lr1Var.c0(hr1.b.TOP, lr1Var4, hr1.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.w);
                }
            }
            int i13 = bVar.j;
            if (i13 != -1) {
                lr1 lr1Var10 = sparseArray.get(i13);
                if (lr1Var10 != null) {
                    lr1Var.c0(hr1.b.BOTTOM, lr1Var10, hr1.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.y);
                }
            } else {
                int i14 = bVar.k;
                if (i14 != -1 && (lr1Var5 = sparseArray.get(i14)) != null) {
                    hr1.b bVar5 = hr1.b.BOTTOM;
                    lr1Var.c0(bVar5, lr1Var5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.y);
                }
            }
            int i15 = bVar.l;
            if (i15 != -1) {
                setWidgetBaseline(lr1Var, bVar, sparseArray, i15, hr1.b.BASELINE);
            } else {
                int i16 = bVar.m;
                if (i16 != -1) {
                    setWidgetBaseline(lr1Var, bVar, sparseArray, i16, hr1.b.TOP);
                } else {
                    int i17 = bVar.n;
                    if (i17 != -1) {
                        setWidgetBaseline(lr1Var, bVar, sparseArray, i17, hr1.b.BOTTOM);
                    }
                }
            }
            if (f2 >= 0.0f) {
                lr1Var.H0(f2);
            }
            float f3 = bVar.G;
            if (f3 >= 0.0f) {
                lr1Var.Y0(f3);
            }
        }
        if (z && ((i = bVar.W) != -1 || bVar.X != -1)) {
            lr1Var.W0(i, bVar.X);
        }
        if (!bVar.d0) {
            if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                if (bVar.Z) {
                    lr1Var.K0(lr1.b.MATCH_CONSTRAINT);
                } else {
                    lr1Var.K0(lr1.b.MATCH_PARENT);
                }
                lr1Var.p(hr1.b.LEFT).g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                lr1Var.p(hr1.b.RIGHT).g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            } else {
                lr1Var.K0(lr1.b.MATCH_CONSTRAINT);
                lr1Var.f1(0);
            }
        } else {
            lr1Var.K0(lr1.b.FIXED);
            lr1Var.f1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                lr1Var.K0(lr1.b.WRAP_CONTENT);
            }
        }
        if (!bVar.e0) {
            if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                if (bVar.a0) {
                    lr1Var.b1(lr1.b.MATCH_CONSTRAINT);
                } else {
                    lr1Var.b1(lr1.b.MATCH_PARENT);
                }
                lr1Var.p(hr1.b.TOP).g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                lr1Var.p(hr1.b.BOTTOM).g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            } else {
                lr1Var.b1(lr1.b.MATCH_CONSTRAINT);
                lr1Var.G0(0);
            }
        } else {
            lr1Var.b1(lr1.b.FIXED);
            lr1Var.G0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                lr1Var.b1(lr1.b.WRAP_CONTENT);
            }
        }
        lr1Var.y0(bVar.H);
        lr1Var.M0(bVar.K);
        lr1Var.d1(bVar.L);
        lr1Var.I0(bVar.M);
        lr1Var.Z0(bVar.N);
        lr1Var.g1(bVar.c0);
        lr1Var.L0(bVar.O, bVar.Q, bVar.S, bVar.U);
        lr1Var.c1(bVar.P, bVar.R, bVar.T, bVar.V);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).u(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(yi6 yi6Var) {
        this.mLayoutWidget.D1(yi6Var);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.mDesignIds;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.mDesignIds.get(str);
            }
            return null;
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.F1();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final lr1 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).u0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).u0;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isRtl() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            return true;
        }
        return false;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            lr1 lr1Var = bVar.u0;
            if ((childAt.getVisibility() != 8 || bVar.g0 || bVar.h0 || bVar.j0 || isInEditMode) && !bVar.i0) {
                int V = lr1Var.V();
                int W = lr1Var.W();
                int U = lr1Var.U() + V;
                int y = lr1Var.y() + W;
                childAt.layout(V, W, U, y);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(V, W, U, y);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).s(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOnMeasureWidthMeasureSpec == i) {
            int i3 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.U1(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.W1();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.U(), this.mLayoutWidget.y(), this.mLayoutWidget.M1(), this.mLayoutWidget.K1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        lr1 viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof vi4)) {
            b bVar = (b) view.getLayoutParams();
            vi4 vi4Var = new vi4();
            bVar.u0 = vi4Var;
            bVar.g0 = true;
            vi4Var.v1(bVar.Y);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.x();
            ((b) view.getLayoutParams()).h0 = true;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.o1(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.mMeasurer;
        int i5 = cVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + cVar.d, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveSystem(mr1 mr1Var, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.c(i2, i3, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i4 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            i4 = max4;
        } else {
            i4 = max3;
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        setSelfDimensionBehaviour(mr1Var, mode, i6, mode2, i7);
        mr1Var.N1(i, mode, i6, mode2, i7, this.mLastMeasureWidth, this.mLastMeasureHeight, i4, max);
    }

    public void setConstraintSet(d dVar) {
        this.mConstraintSet = dVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(pr1 pr1Var) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.c(pr1Var);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.S1(i);
    }

    protected void setSelfDimensionBehaviour(mr1 mr1Var, int i, int i2, int i3, int i4) {
        lr1.b bVar;
        c cVar = this.mMeasurer;
        int i5 = cVar.e;
        int i6 = cVar.d;
        lr1.b bVar2 = lr1.b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                if (i != 1073741824) {
                    bVar = bVar2;
                    i2 = 0;
                } else {
                    i2 = Math.min(this.mMaxWidth - i6, i2);
                    bVar = bVar2;
                }
            } else {
                bVar = lr1.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
                i2 = 0;
            }
        } else {
            bVar = lr1.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 != 0) {
                if (i3 == 1073741824) {
                    i4 = Math.min(this.mMaxHeight - i5, i4);
                }
                i4 = 0;
            } else {
                bVar2 = lr1.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
                i4 = 0;
            }
        } else {
            bVar2 = lr1.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (i2 != mr1Var.U() || i4 != mr1Var.y()) {
            mr1Var.J1();
        }
        mr1Var.h1(0);
        mr1Var.i1(0);
        mr1Var.S0(this.mMaxWidth - i6);
        mr1Var.R0(this.mMaxHeight - i5);
        mr1Var.V0(0);
        mr1Var.U0(0);
        mr1Var.K0(bVar);
        mr1Var.f1(i2);
        mr1Var.b1(bVar2);
        mr1Var.G0(i4);
        mr1Var.V0(this.mMinWidth - i6);
        mr1Var.U0(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.d(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new mr1();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new mr1();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new mr1();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        boolean D;
        boolean E;
        public float F;
        public float G;
        public String H;
        float I;
        int J;
        public float K;
        public float L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public float U;
        public float V;
        public int W;
        public int X;
        public int Y;
        public boolean Z;
        public int a;
        public boolean a0;
        public int b;
        public String b0;
        public float c;
        public int c0;
        public int d;
        boolean d0;
        public int e;
        boolean e0;
        public int f;
        boolean f0;
        public int g;
        boolean g0;
        public int h;
        boolean h0;
        public int i;
        boolean i0;
        public int j;
        boolean j0;
        public int k;
        int k0;
        public int l;
        int l0;
        public int m;
        int m0;
        public int n;
        int n0;
        public int o;
        int o0;
        public int p;
        int p0;
        public float q;
        float q0;
        public int r;
        int r0;
        public int s;
        int s0;
        public int t;
        float t0;
        public int u;
        lr1 u0;
        public int v;
        public boolean v0;
        public int w;
        public int x;
        public int y;
        public int z;

        /* loaded from: classes.dex */
        private static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(g29.P2, 64);
                sparseIntArray.append(g29.s2, 65);
                sparseIntArray.append(g29.B2, 8);
                sparseIntArray.append(g29.C2, 9);
                sparseIntArray.append(g29.E2, 10);
                sparseIntArray.append(g29.F2, 11);
                sparseIntArray.append(g29.L2, 12);
                sparseIntArray.append(g29.K2, 13);
                sparseIntArray.append(g29.i2, 14);
                sparseIntArray.append(g29.h2, 15);
                sparseIntArray.append(g29.d2, 16);
                sparseIntArray.append(g29.f2, 52);
                sparseIntArray.append(g29.e2, 53);
                sparseIntArray.append(g29.j2, 2);
                sparseIntArray.append(g29.l2, 3);
                sparseIntArray.append(g29.k2, 4);
                sparseIntArray.append(g29.U2, 49);
                sparseIntArray.append(g29.V2, 50);
                sparseIntArray.append(g29.p2, 5);
                sparseIntArray.append(g29.q2, 6);
                sparseIntArray.append(g29.r2, 7);
                sparseIntArray.append(g29.n1, 1);
                sparseIntArray.append(g29.G2, 17);
                sparseIntArray.append(g29.H2, 18);
                sparseIntArray.append(g29.o2, 19);
                sparseIntArray.append(g29.n2, 20);
                sparseIntArray.append(g29.Z2, 21);
                sparseIntArray.append(g29.c3, 22);
                sparseIntArray.append(g29.a3, 23);
                sparseIntArray.append(g29.X2, 24);
                sparseIntArray.append(g29.b3, 25);
                sparseIntArray.append(g29.Y2, 26);
                sparseIntArray.append(g29.W2, 55);
                sparseIntArray.append(g29.d3, 54);
                sparseIntArray.append(g29.x2, 29);
                sparseIntArray.append(g29.M2, 30);
                sparseIntArray.append(g29.m2, 44);
                sparseIntArray.append(g29.z2, 45);
                sparseIntArray.append(g29.O2, 46);
                sparseIntArray.append(g29.y2, 47);
                sparseIntArray.append(g29.N2, 48);
                sparseIntArray.append(g29.b2, 27);
                sparseIntArray.append(g29.a2, 28);
                sparseIntArray.append(g29.Q2, 31);
                sparseIntArray.append(g29.t2, 32);
                sparseIntArray.append(g29.S2, 33);
                sparseIntArray.append(g29.R2, 34);
                sparseIntArray.append(g29.T2, 35);
                sparseIntArray.append(g29.v2, 36);
                sparseIntArray.append(g29.u2, 37);
                sparseIntArray.append(g29.w2, 38);
                sparseIntArray.append(g29.A2, 39);
                sparseIntArray.append(g29.J2, 40);
                sparseIntArray.append(g29.D2, 41);
                sparseIntArray.append(g29.g2, 42);
                sparseIntArray.append(g29.c2, 43);
                sparseIntArray.append(g29.I2, 51);
                sparseIntArray.append(g29.f3, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = 0.0f;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = Integer.MIN_VALUE;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.a0 = false;
            this.b0 = null;
            this.c0 = 0;
            this.d0 = true;
            this.e0 = true;
            this.f0 = false;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = Integer.MIN_VALUE;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = 0.5f;
            this.u0 = new lr1();
            this.v0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g29.m1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.o);
                        this.o = resourceId;
                        if (resourceId == -1) {
                            this.o = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.p = obtainStyledAttributes.getDimensionPixelSize(index, this.p);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.q) % 360.0f;
                        this.q = f;
                        if (f < 0.0f) {
                            this.q = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId11;
                        if (resourceId11 == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId12;
                        if (resourceId12 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId13;
                        if (resourceId13 == -1) {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId14;
                        if (resourceId14 == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 22:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 23:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 24:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 25:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 26:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 27:
                        this.Z = obtainStyledAttributes.getBoolean(index, this.Z);
                        break;
                    case 28:
                        this.a0 = obtainStyledAttributes.getBoolean(index, this.a0);
                        break;
                    case 29:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 30:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.O = i3;
                        if (i3 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.U = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.U));
                        this.O = 2;
                        break;
                    case 36:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                d.J(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.K = obtainStyledAttributes.getFloat(index, this.K);
                                continue;
                            case 46:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                continue;
                            case 47:
                                this.M = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.W = obtainStyledAttributes.getDimensionPixelOffset(index, this.W);
                                continue;
                            case 50:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                continue;
                            case 51:
                                this.b0 = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.m);
                                this.m = resourceId15;
                                if (resourceId15 == -1) {
                                    this.m = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId16;
                                if (resourceId16 == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            case 55:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            default:
                                switch (i2) {
                                    case 64:
                                        d.H(this, obtainStyledAttributes, index, 0);
                                        this.D = true;
                                        continue;
                                    case 65:
                                        d.H(this, obtainStyledAttributes, index, 1);
                                        this.E = true;
                                        continue;
                                    case 66:
                                        this.c0 = obtainStyledAttributes.getInt(index, this.c0);
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            b();
        }

        public String a() {
            return this.b0;
        }

        public void b() {
            this.g0 = false;
            this.d0 = true;
            this.e0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.Z) {
                this.d0 = false;
                if (this.O == 0) {
                    this.O = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.a0) {
                this.e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.d0 = false;
                if (i == 0 && this.O == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.Z = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.e0 = false;
                if (i2 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.a0 = true;
                }
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.g0 = true;
                this.d0 = true;
                this.e0 = true;
                if (!(this.u0 instanceof vi4)) {
                    this.u0 = new vi4();
                }
                ((vi4) this.u0).v1(this.Y);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = 0.0f;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = Integer.MIN_VALUE;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.a0 = false;
            this.b0 = null;
            this.c0 = 0;
            this.d0 = true;
            this.e0 = true;
            this.f0 = false;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = Integer.MIN_VALUE;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = 0.5f;
            this.u0 = new lr1();
            this.v0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = 0.0f;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = Integer.MIN_VALUE;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.a0 = false;
            this.b0 = null;
            this.c0 = 0;
            this.d0 = true;
            this.e0 = true;
            this.f0 = false;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = Integer.MIN_VALUE;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = 0.5f;
            this.u0 = new lr1();
            this.v0 = false;
        }
    }
}
