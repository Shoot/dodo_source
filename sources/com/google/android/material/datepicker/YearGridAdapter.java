package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;
import java.util.Calendar;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class YearGridAdapter extends RecyclerView.h<ViewHolder> {
    private final e<?> a;

    /* loaded from: classes2.dex */
    public static class ViewHolder extends RecyclerView.d0 {
        final TextView textView;

        ViewHolder(TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            YearGridAdapter.this.a.Ah(YearGridAdapter.this.a.rh().e(Month.g(this.a, YearGridAdapter.this.a.th().b)));
            YearGridAdapter.this.a.Bh(e.k.DAY);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YearGridAdapter(e<?> eVar) {
        this.a = eVar;
    }

    @NonNull
    private View.OnClickListener j(int i) {
        return new a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.a.rh().k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k(int i) {
        return i - this.a.rh().j().c;
    }

    int l(int i) {
        return this.a.rh().j().c + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: m */
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        com.google.android.material.datepicker.a aVar;
        int l = l(i);
        String string = viewHolder.textView.getContext().getString(w09.mtrl_picker_navigate_to_year_description);
        viewHolder.textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(l)));
        viewHolder.textView.setContentDescription(String.format(string, Integer.valueOf(l)));
        b sh = this.a.sh();
        Calendar i2 = l.i();
        if (i2.get(1) == l) {
            aVar = sh.f;
        } else {
            aVar = sh.d;
        }
        for (Long l2 : this.a.uh().G1()) {
            i2.setTimeInMillis(l2.longValue());
            if (i2.get(1) == l) {
                aVar = sh.e;
            }
        }
        aVar.d(viewHolder.textView);
        viewHolder.textView.setOnClickListener(j(l));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    /* renamed from: n */
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(kz8.mtrl_calendar_year, viewGroup, false));
    }
}
