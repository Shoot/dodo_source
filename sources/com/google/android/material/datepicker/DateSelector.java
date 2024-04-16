package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Collection;
/* loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    boolean A1();

    @NonNull
    Collection<Long> G1();

    @NonNull
    View H(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull z87<S> z87Var);

    S I1();

    @NonNull
    String N0(Context context);

    @NonNull
    Collection<wp7<Long, Long>> Q0();

    void R1(long j);

    int o0(Context context);
}
