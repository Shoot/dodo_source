package defpackage;
/* compiled from: Java7HandlersImpl.java */
/* renamed from: u85  reason: default package */
/* loaded from: classes2.dex */
public class u85 extends s85 {
    private final Class<?> b = t85.a();

    @Override // defpackage.s85
    public gc5<?> a(Class<?> cls) {
        if (this.b.isAssignableFrom(cls)) {
            return new gy6();
        }
        return null;
    }
}
