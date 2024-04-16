package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new a();
    private long a;
    private long b;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<Timer> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Timer[] newArray(int i) {
            return new Timer[i];
        }
    }

    /* synthetic */ Timer(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static Timer f(long j) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        return new Timer(h() + (micros - a()), micros);
    }

    private static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.a + c();
    }

    public long c() {
        return d(new Timer());
    }

    public long d(@NonNull Timer timer) {
        return timer.b - this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.a;
    }

    public void g() {
        this.a = h();
        this.b = a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public Timer() {
        this(h(), a());
    }

    Timer(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
