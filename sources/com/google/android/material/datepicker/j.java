package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes2.dex */
class j extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    /* loaded from: classes2.dex */
    class a extends androidx.recyclerview.widget.j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.j
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Q1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i);
        R1(aVar);
    }
}
