package defpackage;
/* compiled from: TextStyle.java */
/* renamed from: scb  reason: default package */
/* loaded from: classes3.dex */
public enum scb {
    FULL,
    FULL_STANDALONE,
    SHORT,
    SHORT_STANDALONE,
    NARROW,
    NARROW_STANDALONE;

    public scb a() {
        return values()[ordinal() & (-2)];
    }
}
