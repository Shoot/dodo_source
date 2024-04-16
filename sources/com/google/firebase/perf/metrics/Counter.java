package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new a();
    private final String a;
    private final AtomicLong b;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<Counter> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Counter[] newArray(int i) {
            return new Counter[i];
        }
    }

    /* synthetic */ Counter(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public String b() {
        return this.a;
    }

    public void c(long j) {
        this.b.addAndGet(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(long j) {
        this.b.set(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b.get());
    }

    public Counter(@NonNull String str) {
        this.a = str;
        this.b = new AtomicLong(0L);
    }

    private Counter(Parcel parcel) {
        this.a = parcel.readString();
        this.b = new AtomicLong(parcel.readLong());
    }
}
