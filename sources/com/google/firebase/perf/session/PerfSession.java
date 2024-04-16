package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.firebase.perf.util.Timer;
import defpackage.zx7;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new a();
    private final String a;
    private final Timer b;
    private boolean c;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<PerfSession> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PerfSession createFromParcel(@NonNull Parcel parcel) {
            return new PerfSession(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    /* synthetic */ PerfSession(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static zx7[] b(@NonNull List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        zx7[] zx7VarArr = new zx7[list.size()];
        zx7 a2 = list.get(0).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            zx7 a3 = list.get(i).a();
            if (!z && list.get(i).g()) {
                zx7VarArr[0] = a3;
                zx7VarArr[i] = a2;
                z = true;
            } else {
                zx7VarArr[i] = a3;
            }
        }
        if (!z) {
            zx7VarArr[0] = a2;
        }
        return zx7VarArr;
    }

    public static PerfSession c(@NonNull String str) {
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new v91());
        perfSession.i(j());
        return perfSession;
    }

    public static boolean j() {
        com.google.firebase.perf.config.a g = com.google.firebase.perf.config.a.g();
        if (g.K() && Math.random() < g.D()) {
            return true;
        }
        return false;
    }

    public zx7 a() {
        zx7.c J = zx7.g0().J(this.a);
        if (this.c) {
            J.I(efa.GAUGES_AND_SYSTEM_EVENTS);
        }
        return J.a();
    }

    public Timer d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.c;
    }

    public boolean f() {
        if (TimeUnit.MICROSECONDS.toMinutes(this.b.c()) > com.google.firebase.perf.config.a.g().A()) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return this.c;
    }

    public String h() {
        return this.a;
    }

    public void i(boolean z) {
        this.c = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.b, 0);
    }

    public PerfSession(String str, v91 v91Var) {
        this.c = false;
        this.a = str;
        this.b = v91Var.a();
    }

    private PerfSession(@NonNull Parcel parcel) {
        this.c = false;
        this.a = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
