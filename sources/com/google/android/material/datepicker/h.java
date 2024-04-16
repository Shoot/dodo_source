package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonthAdapter.java */
/* loaded from: classes2.dex */
public class h extends BaseAdapter {
    static final int f = l.k().getMaximum(4);
    final Month a;
    final DateSelector<?> b;
    private Collection<Long> c;
    b d;
    final CalendarConstraints e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.a = month;
        this.b = dateSelector;
        this.e = calendarConstraints;
        this.c = dateSelector.G1();
    }

    private void e(Context context) {
        if (this.d == null) {
            this.d = new b(context);
        }
    }

    private boolean h(long j) {
        Iterator<Long> it = this.b.G1().iterator();
        while (it.hasNext()) {
            if (l.a(j) == l.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(TextView textView, long j) {
        a aVar;
        if (textView == null) {
            return;
        }
        if (this.e.f().p0(j)) {
            textView.setEnabled(true);
            if (h(j)) {
                aVar = this.d.b;
            } else if (l.i().getTimeInMillis() == j) {
                aVar = this.d.c;
            } else {
                aVar = this.d.a;
            }
        } else {
            textView.setEnabled(false);
            aVar = this.d.g;
        }
        aVar.d(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.h(j).equals(this.a)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(this.a.p(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        return b() + (i - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.a.k();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i) {
        if (i >= this.a.k() && i <= i()) {
            return Long.valueOf(this.a.o(j(i)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = defpackage.kz8.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.Month r8 = r5.a
            int r2 = r8.e
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.a
            long r7 = r8.o(r7)
            com.google.android.material.datepicker.Month r3 = r5.a
            int r3 = r3.c
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.i()
            int r4 = r4.c
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.c.a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.c.d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.h.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(int i) {
        if (i % this.a.d == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i) {
        if ((i + 1) % this.a.d == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.a.e + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.a.d;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return (this.a.k() + this.a.e) - 1;
    }

    int j(int i) {
        return (i - this.a.k()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.c) {
            l(materialCalendarGridView, l.longValue());
        }
        DateSelector<?> dateSelector = this.b;
        if (dateSelector != null) {
            for (Long l2 : dateSelector.G1()) {
                l(materialCalendarGridView, l2.longValue());
            }
            this.c = this.b.G1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n(int i) {
        if (i >= b() && i <= i()) {
            return true;
        }
        return false;
    }
}
