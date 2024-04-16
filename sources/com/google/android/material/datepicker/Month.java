package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();
    @NonNull
    private final Calendar a;
    final int b;
    final int c;
    final int d;
    final int e;
    final long f;
    private String g;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<Month> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a */
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.g(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    private Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = l.d(calendar);
        this.a = d;
        this.b = d.get(2);
        this.c = d.get(1);
        this.d = d.getMaximum(7);
        this.e = d.getActualMaximum(5);
        this.f = d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static Month g(int i, int i2) {
        Calendar k = l.k();
        k.set(1, i);
        k.set(2, i2);
        return new Month(k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static Month h(long j) {
        Calendar k = l.k();
        k.setTimeInMillis(j);
        return new Month(k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static Month i() {
        return new Month(l.i());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(@NonNull Month month) {
        return this.a.compareTo(month.a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.b == month.b && this.c == month.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        int firstDayOfWeek = this.a.get(7) - this.a.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.d;
        }
        return firstDayOfWeek;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long o(int i) {
        Calendar d = l.d(this.a);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p(long j) {
        Calendar d = l.d(this.a);
        d.setTimeInMillis(j);
        return d.get(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public String q() {
        if (this.g == null) {
            this.g = c.c(this.a.getTimeInMillis());
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long s() {
        return this.a.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Month t(int i) {
        Calendar d = l.d(this.a);
        d.add(2, i);
        return new Month(d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u(@NonNull Month month) {
        if (this.a instanceof GregorianCalendar) {
            return ((month.c - this.c) * 12) + (month.b - this.b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
