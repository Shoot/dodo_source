package defpackage;
/* compiled from: MinElf.java */
/* renamed from: hj6  reason: default package */
/* loaded from: classes2.dex */
public enum hj6 {
    NOT_SO("not_so"),
    X86("x86"),
    ARM("armeabi-v7a"),
    X86_64("x86_64"),
    AARCH64("arm64-v8a"),
    OTHERS("others");
    
    private final String a;

    hj6(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
