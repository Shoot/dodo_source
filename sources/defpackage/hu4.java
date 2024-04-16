package defpackage;

import androidx.annotation.NonNull;
/* compiled from: ImageDestinationProcessor.java */
/* renamed from: hu4  reason: default package */
/* loaded from: classes3.dex */
public abstract class hu4 {
    @NonNull
    public static hu4 a() {
        return new b();
    }

    @NonNull
    public abstract String b(@NonNull String str);

    /* compiled from: ImageDestinationProcessor.java */
    /* renamed from: hu4$b */
    /* loaded from: classes3.dex */
    private static class b extends hu4 {
        private b() {
        }

        @Override // defpackage.hu4
        @NonNull
        public String b(@NonNull String str) {
            return str;
        }
    }
}
