package defpackage;
/* compiled from: Protobuf.java */
/* renamed from: pr8  reason: default package */
/* loaded from: classes2.dex */
public @interface pr8 {

    /* compiled from: Protobuf.java */
    /* renamed from: pr8$a */
    /* loaded from: classes2.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
