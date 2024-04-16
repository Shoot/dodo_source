package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import defpackage.j10;
/* compiled from: ClientInfo.java */
@AutoValue
/* renamed from: l91  reason: default package */
/* loaded from: classes2.dex */
public abstract class l91 {

    /* compiled from: ClientInfo.java */
    @AutoValue.Builder
    /* renamed from: l91$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        @NonNull
        public abstract l91 a();

        @NonNull
        public abstract a b(wf wfVar);

        @NonNull
        public abstract a c(b bVar);
    }

    /* compiled from: ClientInfo.java */
    /* renamed from: l91$b */
    /* loaded from: classes2.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int a;

        b(int i) {
            this.a = i;
        }
    }

    @NonNull
    public static a a() {
        return new j10.b();
    }

    public abstract wf b();

    public abstract b c();
}
