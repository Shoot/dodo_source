package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes2.dex */
class d extends BaseAdapter {
    private static final int d;
    @NonNull
    private final Calendar a;
    private final int b;
    private final int c;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        d = i;
    }

    public d() {
        Calendar k = l.k();
        this.a = k;
        this.b = k.getMaximum(7);
        this.c = k.getFirstDayOfWeek();
    }

    private int b(int i) {
        int i2 = i + this.c;
        int i3 = this.b;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.b) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(kz8.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.a.set(7, b(i));
        textView.setText(this.a.getDisplayName(7, d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(w09.mtrl_picker_day_of_week_column_header), this.a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
