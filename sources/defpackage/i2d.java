package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: i2d  reason: default package */
/* loaded from: classes2.dex */
enum i2d {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean a;

    i2d(boolean z) {
        this.a = z;
    }
}
