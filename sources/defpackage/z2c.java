package defpackage;

import kotlin.Metadata;
/* compiled from: TimeProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lz2c;", "Lrgb;", "", "a", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: z2c  reason: default package */
/* loaded from: classes2.dex */
public final class z2c implements rgb {
    public static final z2c a = new z2c();

    private z2c() {
    }

    @Override // defpackage.rgb
    public long a() {
        return System.currentTimeMillis() * 1000;
    }
}
