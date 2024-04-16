package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlexboxHelper.java */
/* loaded from: classes2.dex */
public class c {
    private final com.google.android.flexbox.a a;
    private boolean[] b;
    int[] c;
    long[] d;
    private long[] e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlexboxHelper.java */
    /* loaded from: classes2.dex */
    public static class b {
        List<com.google.android.flexbox.b> a;
        int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            this.a = null;
            this.b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FlexboxHelper.java */
    /* renamed from: com.google.android.flexbox.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0213c implements Comparable<C0213c> {
        int a;
        int b;

        private C0213c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(@NonNull C0213c c0213c) {
            int i = this.b;
            int i2 = c0213c.b;
            if (i != i2) {
                return i - i2;
            }
            return this.a - c0213c.a;
        }

        @NonNull
        public String toString() {
            return "Order{order=" + this.b + ", index=" + this.a + CoreConstants.CURLY_RIGHT;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(com.google.android.flexbox.a aVar) {
        this.a = aVar;
    }

    private int A(int i, FlexItem flexItem, int i2) {
        com.google.android.flexbox.a aVar = this.a;
        int c = aVar.c(i, aVar.getPaddingLeft() + this.a.getPaddingRight() + flexItem.i1() + flexItem.H1() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(c);
        if (size > flexItem.F0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.F0(), View.MeasureSpec.getMode(c));
        }
        if (size < flexItem.T()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.T(), View.MeasureSpec.getMode(c));
        }
        return c;
    }

    private int B(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.f1();
        }
        return flexItem.H1();
    }

    private int C(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.H1();
        }
        return flexItem.f1();
    }

    private int D(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.e0();
        }
        return flexItem.i1();
    }

    private int E(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.i1();
        }
        return flexItem.e0();
    }

    private int F(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getHeight();
        }
        return flexItem.getWidth();
    }

    private int G(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getWidth();
        }
        return flexItem.getHeight();
    }

    private int H(boolean z) {
        if (z) {
            return this.a.getPaddingBottom();
        }
        return this.a.getPaddingEnd();
    }

    private int I(boolean z) {
        if (z) {
            return this.a.getPaddingEnd();
        }
        return this.a.getPaddingBottom();
    }

    private int J(boolean z) {
        if (z) {
            return this.a.getPaddingTop();
        }
        return this.a.getPaddingStart();
    }

    private int K(boolean z) {
        if (z) {
            return this.a.getPaddingStart();
        }
        return this.a.getPaddingTop();
    }

    private int L(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int M(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private boolean N(int i, int i2, com.google.android.flexbox.b bVar) {
        if (i == i2 - 1 && bVar.c() != 0) {
            return true;
        }
        return false;
    }

    private boolean P(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.x0()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int j = this.a.j(view, i5, i6);
        if (j > 0) {
            i4 += j;
        }
        if (i2 >= i3 + i4) {
            return false;
        }
        return true;
    }

    private void T(int i, int i2, com.google.android.flexbox.b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8 = bVar.e;
        float f = bVar.k;
        float f2 = 0.0f;
        if (f > 0.0f && i3 <= i8) {
            float f3 = (i8 - i3) / f;
            bVar.e = i4 + bVar.f;
            if (!z) {
                bVar.g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < bVar.h) {
                int i11 = bVar.o + i9;
                View h = this.a.h(i11);
                if (h == null || h.getVisibility() == 8) {
                    i5 = i8;
                    i6 = i9;
                } else {
                    FlexItem flexItem = (FlexItem) h.getLayoutParams();
                    int flexDirection = this.a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i5 = i8;
                        int i12 = i9;
                        int measuredWidth = h.getMeasuredWidth();
                        long[] jArr = this.e;
                        if (jArr != null) {
                            measuredWidth = y(jArr[i11]);
                        }
                        int measuredHeight = h.getMeasuredHeight();
                        long[] jArr2 = this.e;
                        if (jArr2 != null) {
                            measuredHeight = x(jArr2[i11]);
                        }
                        if (!this.b[i11] && flexItem.Q() > 0.0f) {
                            float Q = measuredWidth - (flexItem.Q() * f3);
                            i6 = i12;
                            if (i6 == bVar.h - 1) {
                                Q += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(Q);
                            if (round < flexItem.T()) {
                                round = flexItem.T();
                                this.b[i11] = true;
                                bVar.k -= flexItem.Q();
                                z2 = true;
                            } else {
                                f4 += Q - round;
                                double d = f4;
                                if (d > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int z3 = z(i2, flexItem, bVar.m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            h.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = h.getMeasuredWidth();
                            int measuredHeight2 = h.getMeasuredHeight();
                            Z(i11, makeMeasureSpec, z3, h);
                            this.a.i(i11, h);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        } else {
                            i6 = i12;
                        }
                        int max = Math.max(i10, measuredHeight + flexItem.e0() + flexItem.f1() + this.a.f(h));
                        bVar.e += measuredWidth + flexItem.i1() + flexItem.H1();
                        i7 = max;
                    } else {
                        int measuredHeight3 = h.getMeasuredHeight();
                        long[] jArr3 = this.e;
                        if (jArr3 != null) {
                            measuredHeight3 = x(jArr3[i11]);
                        }
                        int measuredWidth3 = h.getMeasuredWidth();
                        long[] jArr4 = this.e;
                        if (jArr4 != null) {
                            measuredWidth3 = y(jArr4[i11]);
                        }
                        if (!this.b[i11] && flexItem.Q() > f2) {
                            float Q2 = measuredHeight3 - (flexItem.Q() * f3);
                            if (i9 == bVar.h - 1) {
                                Q2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(Q2);
                            if (round2 < flexItem.J1()) {
                                round2 = flexItem.J1();
                                this.b[i11] = true;
                                bVar.k -= flexItem.Q();
                                i5 = i8;
                                i6 = i9;
                                z2 = true;
                            } else {
                                f4 += Q2 - round2;
                                i5 = i8;
                                i6 = i9;
                                double d2 = f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int A = A(i, flexItem, bVar.m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            h.measure(A, makeMeasureSpec2);
                            measuredWidth3 = h.getMeasuredWidth();
                            int measuredHeight4 = h.getMeasuredHeight();
                            Z(i11, A, makeMeasureSpec2, h);
                            this.a.i(i11, h);
                            measuredHeight3 = measuredHeight4;
                        } else {
                            i5 = i8;
                            i6 = i9;
                        }
                        i7 = Math.max(i10, measuredWidth3 + flexItem.i1() + flexItem.H1() + this.a.f(h));
                        bVar.e += measuredHeight3 + flexItem.e0() + flexItem.f1();
                    }
                    bVar.g = Math.max(bVar.g, i7);
                    i10 = i7;
                }
                i9 = i6 + 1;
                i8 = i5;
                f2 = 0.0f;
            }
            int i13 = i8;
            if (z2 && i13 != bVar.e) {
                T(i, i2, bVar, i3, i4, true);
            }
        }
    }

    private int[] U(int i, List<C0213c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C0213c c0213c : list) {
            int i3 = c0213c.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c0213c.b);
            i2++;
        }
        return iArr;
    }

    private void V(View view, int i, int i2) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.i1()) - flexItem.H1()) - this.a.f(view), flexItem.T()), flexItem.F0());
        long[] jArr = this.e;
        if (jArr != null) {
            measuredHeight = x(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        Z(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.a.i(i2, view);
    }

    private void W(View view, int i, int i2) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.e0()) - flexItem.f1()) - this.a.f(view), flexItem.J1()), flexItem.P1());
        long[] jArr = this.e;
        if (jArr != null) {
            measuredWidth = y(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        Z(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.a.i(i2, view);
    }

    private void Z(int i, int i2, int i3, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = S(i2, i3);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List<com.google.android.flexbox.b> list, com.google.android.flexbox.b bVar, int i, int i2) {
        bVar.m = i2;
        this.a.g(bVar);
        bVar.p = i;
        list.add(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.T()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.T()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.F0()
            if (r1 <= r3) goto L26
            int r1 = r0.F0()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.J1()
            if (r2 >= r5) goto L32
            int r2 = r0.J1()
            goto L3e
        L32:
            int r5 = r0.P1()
            if (r2 <= r5) goto L3d
            int r2 = r0.P1()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Z(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.a
            r0.i(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.c.i(android.view.View, int):void");
    }

    private List<com.google.android.flexbox.b> k(List<com.google.android.flexbox.b> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
        bVar.g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @NonNull
    private List<C0213c> l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C0213c c0213c = new C0213c();
            c0213c.b = ((FlexItem) this.a.d(i2).getLayoutParams()).getOrder();
            c0213c.a = i2;
            arrayList.add(c0213c);
        }
        return arrayList;
    }

    private void r(int i) {
        boolean[] zArr = this.b;
        if (zArr == null) {
            this.b = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.b = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void v(CompoundButton compoundButton) {
        int minimumWidth;
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int T = flexItem.T();
        int J1 = flexItem.J1();
        Drawable a2 = so1.a(compoundButton);
        int i = 0;
        if (a2 == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = a2.getMinimumWidth();
        }
        if (a2 != null) {
            i = a2.getMinimumHeight();
        }
        if (T == -1) {
            T = minimumWidth;
        }
        flexItem.e1(T);
        if (J1 == -1) {
            J1 = i;
        }
        flexItem.l0(J1);
    }

    private void w(int i, int i2, com.google.android.flexbox.b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        float f = bVar.j;
        float f2 = 0.0f;
        if (f > 0.0f && i3 >= (i5 = bVar.e)) {
            float f3 = (i3 - i5) / f;
            bVar.e = i4 + bVar.f;
            if (!z) {
                bVar.g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = 0.0f;
            while (i9 < bVar.h) {
                int i11 = bVar.o + i9;
                View h = this.a.h(i11);
                if (h == null || h.getVisibility() == 8) {
                    i6 = i5;
                } else {
                    FlexItem flexItem = (FlexItem) h.getLayoutParams();
                    int flexDirection = this.a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i12 = i5;
                        int measuredWidth = h.getMeasuredWidth();
                        long[] jArr = this.e;
                        if (jArr != null) {
                            measuredWidth = y(jArr[i11]);
                        }
                        int measuredHeight = h.getMeasuredHeight();
                        long[] jArr2 = this.e;
                        i6 = i12;
                        if (jArr2 != null) {
                            measuredHeight = x(jArr2[i11]);
                        }
                        if (!this.b[i11] && flexItem.m0() > 0.0f) {
                            float m0 = measuredWidth + (flexItem.m0() * f3);
                            if (i9 == bVar.h - 1) {
                                m0 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(m0);
                            if (round > flexItem.F0()) {
                                round = flexItem.F0();
                                this.b[i11] = true;
                                bVar.j -= flexItem.m0();
                                z2 = true;
                            } else {
                                f4 += m0 - round;
                                double d3 = f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int z3 = z(i2, flexItem, bVar.m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            h.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = h.getMeasuredWidth();
                            int measuredHeight2 = h.getMeasuredHeight();
                            Z(i11, makeMeasureSpec, z3, h);
                            this.a.i(i11, h);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i10, measuredHeight + flexItem.e0() + flexItem.f1() + this.a.f(h));
                        bVar.e += measuredWidth + flexItem.i1() + flexItem.H1();
                        i7 = max;
                    } else {
                        int measuredHeight3 = h.getMeasuredHeight();
                        long[] jArr3 = this.e;
                        if (jArr3 != null) {
                            measuredHeight3 = x(jArr3[i11]);
                        }
                        int measuredWidth3 = h.getMeasuredWidth();
                        long[] jArr4 = this.e;
                        if (jArr4 != null) {
                            measuredWidth3 = y(jArr4[i11]);
                        }
                        if (!this.b[i11] && flexItem.m0() > f2) {
                            float m02 = measuredHeight3 + (flexItem.m0() * f3);
                            if (i9 == bVar.h - 1) {
                                m02 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(m02);
                            if (round2 > flexItem.P1()) {
                                round2 = flexItem.P1();
                                this.b[i11] = true;
                                bVar.j -= flexItem.m0();
                                i8 = i5;
                                z2 = true;
                            } else {
                                f4 += m02 - round2;
                                i8 = i5;
                                double d4 = f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int A = A(i, flexItem, bVar.m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            h.measure(A, makeMeasureSpec2);
                            measuredWidth3 = h.getMeasuredWidth();
                            int measuredHeight4 = h.getMeasuredHeight();
                            Z(i11, A, makeMeasureSpec2, h);
                            this.a.i(i11, h);
                            measuredHeight3 = measuredHeight4;
                        } else {
                            i8 = i5;
                        }
                        i7 = Math.max(i10, measuredWidth3 + flexItem.i1() + flexItem.H1() + this.a.f(h));
                        bVar.e += measuredHeight3 + flexItem.e0() + flexItem.f1();
                        i6 = i8;
                    }
                    bVar.g = Math.max(bVar.g, i7);
                    i10 = i7;
                }
                i9++;
                i5 = i6;
                f2 = 0.0f;
            }
            int i13 = i5;
            if (z2 && i13 != bVar.e) {
                w(i, i2, bVar, i3, i4, true);
            }
        }
    }

    private int z(int i, FlexItem flexItem, int i2) {
        com.google.android.flexbox.a aVar = this.a;
        int e = aVar.e(i, aVar.getPaddingTop() + this.a.getPaddingBottom() + flexItem.e0() + flexItem.f1() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(e);
        if (size > flexItem.P1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.P1(), View.MeasureSpec.getMode(e));
        }
        if (size < flexItem.J1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.J1(), View.MeasureSpec.getMode(e));
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View d = this.a.d(i);
            if (d != null && ((FlexItem) d.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(View view, com.google.android.flexbox.b bVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (flexItem.P() != -1) {
            alignItems = flexItem.P();
        }
        int i5 = bVar.g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else if (this.a.getFlexWrap() != 2) {
                        int max = Math.max(bVar.l - view.getBaseline(), flexItem.e0());
                        view.layout(i, i2 + max, i3, i4 + max);
                        return;
                    } else {
                        int max2 = Math.max((bVar.l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.f1());
                        view.layout(i, i2 - max2, i3, i4 - max2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.e0()) - flexItem.f1()) / 2;
                    if (this.a.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                }
            } else if (this.a.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.f1(), i3, i8 - flexItem.f1());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.e0(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.e0());
                return;
            }
        }
        if (this.a.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.e0(), i3, i4 + flexItem.e0());
        } else {
            view.layout(i, i2 - flexItem.f1(), i3, i4 - flexItem.f1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(View view, com.google.android.flexbox.b bVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (flexItem.P() != -1) {
            alignItems = flexItem.P();
        }
        int i5 = bVar.g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + j86.b(marginLayoutParams)) - j86.a(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.H1(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.H1(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.i1(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.i1(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.i1(), i2, i3 + flexItem.i1(), i4);
        } else {
            view.layout(i - flexItem.H1(), i2, i3 - flexItem.H1(), i4);
        }
    }

    long S(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        Y(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(int i) {
        int i2;
        View h;
        if (i >= this.a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.a.getFlexDirection();
        if (this.a.getAlignItems() == 4) {
            int[] iArr = this.c;
            if (iArr != null) {
                i2 = iArr[i];
            } else {
                i2 = 0;
            }
            List<com.google.android.flexbox.b> flexLinesInternal = this.a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i2 < size) {
                com.google.android.flexbox.b bVar = flexLinesInternal.get(i2);
                int i3 = bVar.h;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = bVar.o + i4;
                    if (i4 < this.a.getFlexItemCount() && (h = this.a.h(i5)) != null && h.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) h.getLayoutParams();
                        if (flexItem.P() == -1 || flexItem.P() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                                V(h, bVar.g, i5);
                            } else {
                                W(h, bVar.g, i5);
                            }
                        }
                    }
                }
                i2++;
            }
            return;
        }
        for (com.google.android.flexbox.b bVar2 : this.a.getFlexLinesInternal()) {
            for (Integer num : bVar2.n) {
                View h2 = this.a.h(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                    }
                    V(h2, bVar2.g, num.intValue());
                } else {
                    W(h2, bVar2.g, num.intValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(b bVar, int i, int i2, int i3, int i4, int i5, List<com.google.android.flexbox.b> list) {
        ArrayList arrayList;
        boolean z;
        int i6;
        b bVar2;
        int i7;
        int i8;
        int i9;
        List<com.google.android.flexbox.b> list2;
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        boolean z3;
        int i16;
        int i17;
        int i18;
        com.google.android.flexbox.b bVar3;
        int i19;
        int i20 = i;
        int i21 = i2;
        int i22 = i5;
        boolean k = this.a.k();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        bVar.a = arrayList;
        if (i22 == -1) {
            z = true;
        } else {
            z = false;
        }
        int K = K(k);
        int I = I(k);
        int J = J(k);
        int H = H(k);
        com.google.android.flexbox.b bVar4 = new com.google.android.flexbox.b();
        int i23 = i4;
        bVar4.o = i23;
        int i24 = I + K;
        bVar4.e = i24;
        int flexItemCount = this.a.getFlexItemCount();
        boolean z4 = z;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = Integer.MIN_VALUE;
        while (true) {
            if (i23 < flexItemCount) {
                View h = this.a.h(i23);
                if (h == null) {
                    if (N(i23, flexItemCount, bVar4)) {
                        a(arrayList, bVar4, i23, i25);
                    }
                } else if (h.getVisibility() == 8) {
                    bVar4.i++;
                    bVar4.h++;
                    if (N(i23, flexItemCount, bVar4)) {
                        a(arrayList, bVar4, i23, i25);
                    }
                } else {
                    if (h instanceof CompoundButton) {
                        v((CompoundButton) h);
                    }
                    FlexItem flexItem = (FlexItem) h.getLayoutParams();
                    int i29 = flexItemCount;
                    if (flexItem.P() == 4) {
                        bVar4.n.add(Integer.valueOf(i23));
                    }
                    int G = G(flexItem, k);
                    if (flexItem.r0() != -1.0f && mode == 1073741824) {
                        G = Math.round(size * flexItem.r0());
                    }
                    if (k) {
                        int c = this.a.c(i20, i24 + E(flexItem, true) + C(flexItem, true), G);
                        i7 = size;
                        i8 = mode;
                        int e = this.a.e(i21, J + H + D(flexItem, true) + B(flexItem, true) + i25, F(flexItem, true));
                        h.measure(c, e);
                        Z(i23, c, e, h);
                        i9 = c;
                    } else {
                        i7 = size;
                        i8 = mode;
                        int c2 = this.a.c(i21, J + H + D(flexItem, false) + B(flexItem, false) + i25, F(flexItem, false));
                        int e2 = this.a.e(i20, E(flexItem, false) + i24 + C(flexItem, false), G);
                        h.measure(c2, e2);
                        Z(i23, c2, e2, h);
                        i9 = e2;
                    }
                    this.a.i(i23, h);
                    i(h, i23);
                    i26 = View.combineMeasuredStates(i26, h.getMeasuredState());
                    int i30 = i25;
                    int i31 = i24;
                    com.google.android.flexbox.b bVar5 = bVar4;
                    int i32 = i23;
                    list2 = arrayList;
                    int i33 = i9;
                    if (P(h, i8, i7, bVar4.e, C(flexItem, k) + M(h, k) + E(flexItem, k), flexItem, i32, i27, arrayList.size())) {
                        i23 = i32;
                        if (bVar5.c() > 0) {
                            if (i23 > 0) {
                                i19 = i23 - 1;
                                bVar3 = bVar5;
                            } else {
                                bVar3 = bVar5;
                                i19 = 0;
                            }
                            a(list2, bVar3, i19, i30);
                            i25 = bVar3.g + i30;
                        } else {
                            i25 = i30;
                        }
                        if (k) {
                            if (flexItem.getHeight() == -1) {
                                com.google.android.flexbox.a aVar = this.a;
                                i10 = i2;
                                i13 = -1;
                                view = h;
                                view.measure(i33, aVar.e(i10, aVar.getPaddingTop() + this.a.getPaddingBottom() + flexItem.e0() + flexItem.f1() + i25, flexItem.getHeight()));
                                i(view, i23);
                            } else {
                                i10 = i2;
                                view = h;
                                i13 = -1;
                            }
                        } else {
                            i10 = i2;
                            view = h;
                            i13 = -1;
                            if (flexItem.getWidth() == -1) {
                                com.google.android.flexbox.a aVar2 = this.a;
                                view.measure(aVar2.c(i10, aVar2.getPaddingLeft() + this.a.getPaddingRight() + flexItem.i1() + flexItem.H1() + i25, flexItem.getWidth()), i33);
                                i(view, i23);
                            }
                        }
                        bVar4 = new com.google.android.flexbox.b();
                        i12 = 1;
                        bVar4.h = 1;
                        i11 = i31;
                        bVar4.e = i11;
                        bVar4.o = i23;
                        i14 = 0;
                        i15 = Integer.MIN_VALUE;
                    } else {
                        i10 = i2;
                        i23 = i32;
                        view = h;
                        bVar4 = bVar5;
                        i11 = i31;
                        i12 = 1;
                        i13 = -1;
                        bVar4.h++;
                        i14 = i27 + 1;
                        i25 = i30;
                        i15 = i28;
                    }
                    boolean z5 = bVar4.q;
                    if (flexItem.m0() != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bVar4.q = z5 | z2;
                    boolean z6 = bVar4.r;
                    if (flexItem.Q() != 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bVar4.r = z6 | z3;
                    int[] iArr = this.c;
                    if (iArr != null) {
                        iArr[i23] = list2.size();
                    }
                    bVar4.e += M(view, k) + E(flexItem, k) + C(flexItem, k);
                    bVar4.j += flexItem.m0();
                    bVar4.k += flexItem.Q();
                    this.a.b(view, i23, i14, bVar4);
                    int max = Math.max(i15, L(view, k) + D(flexItem, k) + B(flexItem, k) + this.a.f(view));
                    bVar4.g = Math.max(bVar4.g, max);
                    if (k) {
                        if (this.a.getFlexWrap() != 2) {
                            bVar4.l = Math.max(bVar4.l, view.getBaseline() + flexItem.e0());
                        } else {
                            bVar4.l = Math.max(bVar4.l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.f1());
                        }
                    }
                    i16 = i29;
                    if (N(i23, i16, bVar4)) {
                        a(list2, bVar4, i23, i25);
                        i25 += bVar4.g;
                    }
                    i17 = i5;
                    if (i17 != i13 && list2.size() > 0 && list2.get(list2.size() - i12).p >= i17 && i23 >= i17 && !z4) {
                        i25 = -bVar4.a();
                        i18 = i3;
                        z4 = true;
                    } else {
                        i18 = i3;
                    }
                    if (i25 > i18 && z4) {
                        bVar2 = bVar;
                        i6 = i26;
                        break;
                    }
                    i27 = i14;
                    i28 = max;
                    i23++;
                    i20 = i;
                    flexItemCount = i16;
                    i21 = i10;
                    i24 = i11;
                    arrayList = list2;
                    size = i7;
                    mode = i8;
                    i22 = i17;
                }
                i7 = size;
                i8 = mode;
                i10 = i21;
                i17 = i22;
                i11 = i24;
                list2 = arrayList;
                i16 = flexItemCount;
                i23++;
                i20 = i;
                flexItemCount = i16;
                i21 = i10;
                i24 = i11;
                arrayList = list2;
                size = i7;
                mode = i8;
                i22 = i17;
            } else {
                i6 = i26;
                bVar2 = bVar;
                break;
            }
        }
        bVar2.b = i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(b bVar, int i, int i2) {
        b(bVar, i, i2, Integer.MAX_VALUE, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(b bVar, int i, int i2, int i3, int i4, List<com.google.android.flexbox.b> list) {
        b(bVar, i, i2, i3, i4, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(b bVar, int i, int i2, int i3, int i4, List<com.google.android.flexbox.b> list) {
        b(bVar, i, i2, i3, 0, i4, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(b bVar, int i, int i2) {
        b(bVar, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(b bVar, int i, int i2, int i3, int i4, List<com.google.android.flexbox.b> list) {
        b(bVar, i2, i, i3, i4, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(b bVar, int i, int i2, int i3, int i4, List<com.google.android.flexbox.b> list) {
        b(bVar, i2, i, i3, 0, i4, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(List<com.google.android.flexbox.b> list, int i) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        List<C0213c> l = l(flexItemCount);
        C0213c c0213c = new C0213c();
        if (view != null && (layoutParams instanceof FlexItem)) {
            c0213c.b = ((FlexItem) layoutParams).getOrder();
        } else {
            c0213c.b = 1;
        }
        if (i != -1 && i != flexItemCount) {
            if (i < this.a.getFlexItemCount()) {
                c0213c.a = i;
                while (i < flexItemCount) {
                    l.get(i).a++;
                    i++;
                }
            } else {
                c0213c.a = flexItemCount;
            }
        } else {
            c0213c.a = flexItemCount;
        }
        l.add(c0213c);
        return U(flexItemCount + 1, l, sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.a.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        }
        List<com.google.android.flexbox.b> flexLinesInternal = this.a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.a.getAlignContent();
                if (alignContent != 1) {
                    if (alignContent != 2) {
                        if (alignContent != 3) {
                            if (alignContent != 4) {
                                if (alignContent == 5 && sumOfCrossSize < i5) {
                                    float size2 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                                    int size3 = flexLinesInternal.size();
                                    float f = 0.0f;
                                    while (i6 < size3) {
                                        com.google.android.flexbox.b bVar = flexLinesInternal.get(i6);
                                        float f2 = bVar.g + size2;
                                        if (i6 == flexLinesInternal.size() - 1) {
                                            f2 += f;
                                            f = 0.0f;
                                        }
                                        int round = Math.round(f2);
                                        f += f2 - round;
                                        if (f > 1.0f) {
                                            round++;
                                            f -= 1.0f;
                                        } else if (f < -1.0f) {
                                            round--;
                                            f += 1.0f;
                                        }
                                        bVar.g = round;
                                        i6++;
                                    }
                                    return;
                                }
                                return;
                            } else if (sumOfCrossSize >= i5) {
                                this.a.setFlexLines(k(flexLinesInternal, i5, sumOfCrossSize));
                                return;
                            } else {
                                int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                                ArrayList arrayList = new ArrayList();
                                com.google.android.flexbox.b bVar2 = new com.google.android.flexbox.b();
                                bVar2.g = size4;
                                for (com.google.android.flexbox.b bVar3 : flexLinesInternal) {
                                    arrayList.add(bVar2);
                                    arrayList.add(bVar3);
                                    arrayList.add(bVar2);
                                }
                                this.a.setFlexLines(arrayList);
                                return;
                            }
                        } else if (sumOfCrossSize < i5) {
                            float size5 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                            ArrayList arrayList2 = new ArrayList();
                            int size6 = flexLinesInternal.size();
                            float f3 = 0.0f;
                            while (i6 < size6) {
                                arrayList2.add(flexLinesInternal.get(i6));
                                if (i6 != flexLinesInternal.size() - 1) {
                                    com.google.android.flexbox.b bVar4 = new com.google.android.flexbox.b();
                                    if (i6 == flexLinesInternal.size() - 2) {
                                        bVar4.g = Math.round(f3 + size5);
                                        f3 = 0.0f;
                                    } else {
                                        bVar4.g = Math.round(size5);
                                    }
                                    int i7 = bVar4.g;
                                    f3 += size5 - i7;
                                    if (f3 > 1.0f) {
                                        bVar4.g = i7 + 1;
                                        f3 -= 1.0f;
                                    } else if (f3 < -1.0f) {
                                        bVar4.g = i7 - 1;
                                        f3 += 1.0f;
                                    }
                                    arrayList2.add(bVar4);
                                }
                                i6++;
                            }
                            this.a.setFlexLines(arrayList2);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.a.setFlexLines(k(flexLinesInternal, i5, sumOfCrossSize));
                    return;
                }
                int i8 = i5 - sumOfCrossSize;
                com.google.android.flexbox.b bVar5 = new com.google.android.flexbox.b();
                bVar5.g = i8;
                flexLinesInternal.add(0, bVar5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i, int i2) {
        q(i, i2, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        r(this.a.getFlexItemCount());
        if (i3 >= this.a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.a.getFlexDirection();
        int flexDirection2 = this.a.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                size = this.a.getLargestMainSize();
            }
            paddingLeft = this.a.getPaddingTop();
            paddingRight = this.a.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.a.getLargestMainSize();
            if (mode2 != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.a.getPaddingLeft();
            paddingRight = this.a.getPaddingRight();
        }
        int i5 = paddingLeft + paddingRight;
        int[] iArr = this.c;
        if (iArr != null) {
            i4 = iArr[i3];
        } else {
            i4 = 0;
        }
        List<com.google.android.flexbox.b> flexLinesInternal = this.a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i4 < size2) {
            com.google.android.flexbox.b bVar = flexLinesInternal.get(i4);
            int i6 = bVar.e;
            if (i6 < size && bVar.q) {
                w(i, i2, bVar, size, i5, false);
            } else if (i6 > size && bVar.r) {
                T(i, i2, bVar, size, i5, false);
            }
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf(this.c, Math.max(iArr.length * 2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf(this.d, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = Arrays.copyOf(this.e, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int x(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int y(long j) {
        return (int) j;
    }
}
