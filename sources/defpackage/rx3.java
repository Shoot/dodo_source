package defpackage;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.internal.d;
/* compiled from: FirebaseRemoteConfigSettings.java */
/* renamed from: rx3  reason: default package */
/* loaded from: classes2.dex */
public class rx3 {
    private final long a;
    private final long b;

    /* compiled from: FirebaseRemoteConfigSettings.java */
    /* renamed from: rx3$b */
    /* loaded from: classes2.dex */
    public static class b {
        private long a = 60;
        private long b = d.j;

        @NonNull
        public rx3 c() {
            return new rx3(this);
        }

        @NonNull
        public b d(long j) throws IllegalArgumentException {
            if (j >= 0) {
                this.a = j;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
        }

        @NonNull
        public b e(long j) {
            if (j >= 0) {
                this.b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    private rx3(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }
}
