package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b2;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class c2 implements y2 {
    private static final c2 a = new c2();

    private c2() {
    }

    public static c2 c() {
        return a;
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final w2 a(Class<?> cls) {
        if (b2.class.isAssignableFrom(cls)) {
            try {
                return (w2) b2.n(cls.asSubclass(b2.class)).o(b2.e.c, null, null);
            } catch (Exception e) {
                String name = cls.getName();
                throw new RuntimeException("Unable to get message info for " + name, e);
            }
        }
        String name2 = cls.getName();
        throw new IllegalArgumentException("Unsupported message type: " + name2);
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final boolean b(Class<?> cls) {
        return b2.class.isAssignableFrom(cls);
    }
}
