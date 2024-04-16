package com.google.android.material.appbar;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes2.dex */
public class d {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f = true;
    private boolean g = true;

    public d(View view) {
        this.a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        View view = this.a;
        syb.f0(view, this.d - (view.getTop() - this.b));
        View view2 = this.a;
        syb.e0(view2, this.e - (view2.getLeft() - this.c));
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.g;
    }

    public boolean f() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }

    public void h(boolean z) {
        this.g = z;
    }

    public boolean i(int i) {
        if (this.g && this.e != i) {
            this.e = i;
            a();
            return true;
        }
        return false;
    }

    public boolean j(int i) {
        if (this.f && this.d != i) {
            this.d = i;
            a();
            return true;
        }
        return false;
    }

    public void k(boolean z) {
        this.f = z;
    }
}
