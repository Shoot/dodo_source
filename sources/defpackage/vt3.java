package defpackage;
/* compiled from: FileExtension.java */
/* renamed from: vt3  reason: default package */
/* loaded from: classes.dex */
public enum vt3 {
    JSON(".json"),
    ZIP(".zip");
    
    public final String a;

    vt3(String str) {
        this.a = str;
    }

    public String a() {
        return ".temp" + this.a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
