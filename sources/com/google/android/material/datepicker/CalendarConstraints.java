package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    @NonNull
    private final Month a;
    @NonNull
    private final Month b;
    @NonNull
    private final DateValidator c;
    private Month d;
    private final int e;
    private final int f;

    /* loaded from: classes2.dex */
    public interface DateValidator extends Parcelable {
        boolean p0(long j);
    }

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<CalendarConstraints> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a */
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        static final long e = l.a(Month.g(1900, 0).f);
        static final long f = l.a(Month.g(2100, 11).f);
        private long a;
        private long b;
        private Long c;
        private DateValidator d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(@NonNull CalendarConstraints calendarConstraints) {
            this.a = e;
            this.b = f;
            this.d = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.a = calendarConstraints.a.f;
            this.b = calendarConstraints.b.f;
            this.c = Long.valueOf(calendarConstraints.d.f);
            this.d = calendarConstraints.c;
        }

        @NonNull
        public CalendarConstraints a() {
            Month h;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.d);
            Month h2 = Month.h(this.a);
            Month h3 = Month.h(this.b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.c;
            if (l == null) {
                h = null;
            } else {
                h = Month.h(l.longValue());
            }
            return new CalendarConstraints(h2, h3, dateValidator, h, null);
        }

        @NonNull
        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, a aVar) {
        this(month, month2, dateValidator, month3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month e(Month month) {
        if (month.compareTo(this.a) < 0) {
            return this.a;
        }
        if (month.compareTo(this.b) > 0) {
            return this.b;
        }
        return month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (this.a.equals(calendarConstraints.a) && this.b.equals(calendarConstraints.b) && p57.a(this.d, calendarConstraints.d) && this.c.equals(calendarConstraints.c)) {
            return true;
        }
        return false;
    }

    public DateValidator f() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Month g() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, this.c});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month i() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Month j() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
    }

    private CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, Month month3) {
        this.a = month;
        this.b = month2;
        this.d = month3;
        this.c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f = month.u(month2) + 1;
        this.e = (month2.c - month.c) + 1;
    }
}
