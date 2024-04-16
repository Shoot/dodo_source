package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FlexLine.java */
/* loaded from: classes2.dex */
public class b {
    int e;
    int f;
    int g;
    int h;
    int i;
    float j;
    float k;
    int l;
    int m;
    int o;
    int p;
    boolean q;
    boolean r;
    int a = Integer.MAX_VALUE;
    int b = Integer.MAX_VALUE;
    int c = Integer.MIN_VALUE;
    int d = Integer.MIN_VALUE;
    List<Integer> n = new ArrayList();

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.h - this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - flexItem.i1()) - i);
        this.b = Math.min(this.b, (view.getTop() - flexItem.e0()) - i2);
        this.c = Math.max(this.c, view.getRight() + flexItem.H1() + i3);
        this.d = Math.max(this.d, view.getBottom() + flexItem.f1() + i4);
    }
}
