package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class e<S> extends com.google.android.material.datepicker.i<S> {
    static final Object m = "MONTHS_VIEW_GROUP_TAG";
    static final Object n = "NAVIGATION_PREV_TAG";
    static final Object o = "NAVIGATION_NEXT_TAG";
    static final Object p = "SELECTOR_TOGGLE_TAG";
    private int c;
    private DateSelector<S> d;
    private CalendarConstraints e;
    private Month f;
    private k g;
    private com.google.android.material.datepicker.b h;
    private RecyclerView i;
    private RecyclerView j;
    private View k;
    private View l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.j.smoothScrollToPosition(this.a);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class b extends s2 {
        b() {
        }

        @Override // defpackage.s2
        public void g(View view, @NonNull d4 d4Var) {
            super.g(view, d4Var);
            d4Var.p0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class c extends com.google.android.material.datepicker.j {
        final /* synthetic */ int U4;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.U4 = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void U1(@NonNull RecyclerView.a0 a0Var, @NonNull int[] iArr) {
            if (this.U4 == 0) {
                iArr[0] = e.this.j.getWidth();
                iArr[1] = e.this.j.getWidth();
                return;
            }
            iArr[0] = e.this.j.getHeight();
            iArr[1] = e.this.j.getHeight();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.e.l
        public void a(long j) {
            if (e.this.e.f().p0(j)) {
                e.this.d.R1(j);
                Iterator<z87<S>> it = e.this.b.iterator();
                while (it.hasNext()) {
                    it.next().a((S) e.this.d.I1());
                }
                e.this.j.getAdapter().notifyDataSetChanged();
                if (e.this.i != null) {
                    e.this.i.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0228e extends RecyclerView.o {
        private final Calendar a = com.google.android.material.datepicker.l.k();
        private final Calendar b = com.google.android.material.datepicker.l.k();

        C0228e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.a0 a0Var) {
            int i;
            int width;
            if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (wp7<Long, Long> wp7Var : e.this.d.Q0()) {
                    Long l = wp7Var.a;
                    if (l != null && wp7Var.b != null) {
                        this.a.setTimeInMillis(l.longValue());
                        this.b.setTimeInMillis(wp7Var.b.longValue());
                        int k = yearGridAdapter.k(this.a.get(1));
                        int k2 = yearGridAdapter.k(this.b.get(1));
                        View M = gridLayoutManager.M(k);
                        View M2 = gridLayoutManager.M(k2);
                        int e3 = k / gridLayoutManager.e3();
                        int e32 = k2 / gridLayoutManager.e3();
                        for (int i2 = e3; i2 <= e32; i2++) {
                            View M3 = gridLayoutManager.M(gridLayoutManager.e3() * i2);
                            if (M3 != null) {
                                int top = M3.getTop() + e.this.h.d.c();
                                int bottom = M3.getBottom() - e.this.h.d.b();
                                if (i2 == e3) {
                                    i = M.getLeft() + (M.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i2 == e32) {
                                    width = M2.getLeft() + (M2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(i, top, width, bottom, e.this.h.h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class f extends s2 {
        f() {
        }

        @Override // defpackage.s2
        public void g(View view, @NonNull d4 d4Var) {
            String string;
            super.g(view, d4Var);
            if (e.this.l.getVisibility() == 0) {
                string = e.this.getString(w09.mtrl_picker_toggle_to_year_selection);
            } else {
                string = e.this.getString(w09.mtrl_picker_toggle_to_day_selection);
            }
            d4Var.A0(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class g extends RecyclerView.u {
        final /* synthetic */ MonthsPagerAdapter a;
        final /* synthetic */ MaterialButton b;

        g(MonthsPagerAdapter monthsPagerAdapter, MaterialButton materialButton) {
            this.a = monthsPagerAdapter;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            int k2;
            if (i < 0) {
                k2 = e.this.xh().h2();
            } else {
                k2 = e.this.xh().k2();
            }
            e.this.f = this.a.j(k2);
            this.b.setText(this.a.k(k2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.Ch();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class i implements View.OnClickListener {
        final /* synthetic */ MonthsPagerAdapter a;

        i(MonthsPagerAdapter monthsPagerAdapter) {
            this.a = monthsPagerAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int h2 = e.this.xh().h2() + 1;
            if (h2 < e.this.j.getAdapter().getItemCount()) {
                e.this.Ah(this.a.j(h2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class j implements View.OnClickListener {
        final /* synthetic */ MonthsPagerAdapter a;

        j(MonthsPagerAdapter monthsPagerAdapter) {
            this.a = monthsPagerAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int k2 = e.this.xh().k2() - 1;
            if (k2 >= 0) {
                e.this.Ah(this.a.j(k2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public interface l {
        void a(long j);
    }

    private void ph(@NonNull View view, @NonNull MonthsPagerAdapter monthsPagerAdapter) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(ky8.month_navigation_fragment_toggle);
        materialButton.setTag(p);
        syb.u0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(ky8.month_navigation_previous);
        materialButton2.setTag(n);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(ky8.month_navigation_next);
        materialButton3.setTag(o);
        this.k = view.findViewById(ky8.mtrl_calendar_year_selector_frame);
        this.l = view.findViewById(ky8.mtrl_calendar_day_selector_frame);
        Bh(k.DAY);
        materialButton.setText(this.f.q());
        this.j.addOnScrollListener(new g(monthsPagerAdapter, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(monthsPagerAdapter));
        materialButton2.setOnClickListener(new j(monthsPagerAdapter));
    }

    @NonNull
    private RecyclerView.o qh() {
        return new C0228e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int vh(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(ww8.mtrl_calendar_day_height);
    }

    private static int wh(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(ww8.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(ww8.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(ww8.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(ww8.mtrl_calendar_days_of_week_height);
        int i2 = com.google.android.material.datepicker.h.f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(ww8.mtrl_calendar_day_height) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(ww8.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(ww8.mtrl_calendar_bottom_padding);
    }

    @NonNull
    public static <T> e<T> yh(@NonNull DateSelector<T> dateSelector, int i2, @NonNull CalendarConstraints calendarConstraints) {
        e<T> eVar = new e<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.i());
        eVar.setArguments(bundle);
        return eVar;
    }

    private void zh(int i2) {
        this.j.post(new a(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Ah(Month month) {
        boolean z;
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.j.getAdapter();
        int l2 = monthsPagerAdapter.l(month);
        int l3 = l2 - monthsPagerAdapter.l(this.f);
        boolean z2 = false;
        if (Math.abs(l3) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (l3 > 0) {
            z2 = true;
        }
        this.f = month;
        if (z && z2) {
            this.j.scrollToPosition(l2 - 3);
            zh(l2);
        } else if (z) {
            this.j.scrollToPosition(l2 + 3);
            zh(l2);
        } else {
            zh(l2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Bh(k kVar) {
        this.g = kVar;
        if (kVar == k.YEAR) {
            this.i.getLayoutManager().F1(((YearGridAdapter) this.i.getAdapter()).k(this.f.c));
            this.k.setVisibility(0);
            this.l.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            Ah(this.f);
        }
    }

    void Ch() {
        k kVar = this.g;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            Bh(k.DAY);
        } else if (kVar == k.DAY) {
            Bh(kVar2);
        }
    }

    @Override // com.google.android.material.datepicker.i
    public boolean gh(@NonNull z87<S> z87Var) {
        return super.gh(z87Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.c = bundle.getInt("THEME_RES_ID_KEY");
        this.d = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.c);
        this.h = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month j2 = this.e.j();
        if (com.google.android.material.datepicker.f.wh(contextThemeWrapper)) {
            i2 = kz8.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = kz8.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(wh(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(ky8.mtrl_calendar_days_of_week);
        syb.u0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.d());
        gridView.setNumColumns(j2.d);
        gridView.setEnabled(false);
        this.j = (RecyclerView) inflate.findViewById(ky8.mtrl_calendar_months);
        this.j.setLayoutManager(new c(getContext(), i3, false, i3));
        this.j.setTag(m);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.d, this.e, new d());
        this.j.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(zy8.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(ky8.mtrl_calendar_year_selector_frame);
        this.i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.i.setAdapter(new YearGridAdapter(this));
            this.i.addItemDecoration(qh());
        }
        if (inflate.findViewById(ky8.month_navigation_fragment_toggle) != null) {
            ph(inflate, monthsPagerAdapter);
        }
        if (!com.google.android.material.datepicker.f.wh(contextThemeWrapper)) {
            new n().b(this.j);
        }
        this.j.scrollToPosition(monthsPagerAdapter.l(this.f));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CalendarConstraints rh() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.b sh() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month th() {
        return this.f;
    }

    public DateSelector<S> uh() {
        return this.d;
    }

    @NonNull
    LinearLayoutManager xh() {
        return (LinearLayoutManager) this.j.getLayoutManager();
    }
}
