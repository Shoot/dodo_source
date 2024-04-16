package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;
/* loaded from: classes2.dex */
class MonthsPagerAdapter extends RecyclerView.h<ViewHolder> {
    @NonNull
    private final CalendarConstraints a;
    private final DateSelector<?> b;
    private final e.l c;
    private final int d;

    /* loaded from: classes2.dex */
    public static class ViewHolder extends RecyclerView.d0 {
        final MaterialCalendarGridView monthGrid;
        final TextView monthTitle;

        ViewHolder(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(ky8.month_title);
            this.monthTitle = textView;
            syb.v0(textView, true);
            this.monthGrid = (MaterialCalendarGridView) linearLayout.findViewById(ky8.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements AdapterView.OnItemClickListener {
        final /* synthetic */ MaterialCalendarGridView a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.a.getAdapter2().n(i)) {
                MonthsPagerAdapter.this.c.a(this.a.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MonthsPagerAdapter(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, e.l lVar) {
        int i;
        Month j = calendarConstraints.j();
        Month g = calendarConstraints.g();
        Month i2 = calendarConstraints.i();
        if (j.compareTo(i2) <= 0) {
            if (i2.compareTo(g) <= 0) {
                int vh = h.f * e.vh(context);
                if (f.wh(context)) {
                    i = e.vh(context);
                } else {
                    i = 0;
                }
                this.d = vh + i;
                this.a = calendarConstraints;
                this.b = dateSelector;
                this.c = lVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.a.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i) {
        return this.a.j().t(i).s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Month j(int i) {
        return this.a.j().t(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public CharSequence k(int i) {
        return j(i).q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l(@NonNull Month month) {
        return this.a.j().u(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: m */
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Month t = this.a.j().t(i);
        viewHolder.monthTitle.setText(t.q());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.monthGrid.findViewById(ky8.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && t.equals(materialCalendarGridView.getAdapter2().a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m(materialCalendarGridView);
        } else {
            h hVar = new h(t, this.b, this.a);
            materialCalendarGridView.setNumColumns(t.d);
            materialCalendarGridView.setAdapter((ListAdapter) hVar);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* renamed from: n */
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(kz8.mtrl_calendar_month_labeled, viewGroup, false);
        if (f.wh(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.q(-1, this.d));
            return new ViewHolder(linearLayout, true);
        }
        return new ViewHolder(linearLayout, false);
    }
}
