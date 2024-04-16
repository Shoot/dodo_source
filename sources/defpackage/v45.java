package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
/* compiled from: InstallIdProvider.java */
/* renamed from: v45  reason: default package */
/* loaded from: classes2.dex */
public interface v45 {

    /* compiled from: InstallIdProvider.java */
    @AutoValue
    /* renamed from: v45$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static a a(String str, String str2) {
            return new r20(str, str2);
        }

        public static a b(String str) {
            return a(str, null);
        }

        @NonNull
        public abstract String c();

        public abstract String d();
    }

    a a();
}
