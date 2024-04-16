package defpackage;

import com.google.android.gms.internal.measurement.d1;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: l5d  reason: default package */
/* loaded from: classes2.dex */
public enum l5d {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(d1.b),
    ENUM(null),
    MESSAGE(null);
    
    private final Object a;

    l5d(Object obj) {
        this.a = obj;
    }
}
