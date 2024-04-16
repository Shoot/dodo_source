package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Iterator;
/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes2.dex */
public final class g<S> extends i<S> {
    private int c;
    private DateSelector<S> d;
    private CalendarConstraints e;

    /* compiled from: MaterialTextInputPicker.java */
    /* loaded from: classes2.dex */
    class a extends z87<S> {
        a() {
        }

        @Override // defpackage.z87
        public void a(S s) {
            Iterator<z87<S>> it = g.this.b.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static <T> g<T> ih(DateSelector<T> dateSelector, int i, @NonNull CalendarConstraints calendarConstraints) {
        g<T> gVar = new g<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        gVar.setArguments(bundle);
        return gVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.c = bundle.getInt("THEME_RES_ID_KEY");
        this.d = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.d.H(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.c)), viewGroup, bundle, this.e, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.c);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.e);
    }
}
