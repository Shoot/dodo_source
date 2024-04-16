package defpackage;
/* compiled from: Event.java */
/* renamed from: nk3  reason: default package */
/* loaded from: classes2.dex */
public class nk3<T> {
    private final Class<T> a;
    private final T b;

    public T a() {
        return this.b;
    }

    public Class<T> b() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}
