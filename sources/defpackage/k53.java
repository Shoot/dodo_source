package defpackage;
/* compiled from: DocumentData.java */
/* renamed from: k53  reason: default package */
/* loaded from: classes.dex */
public class k53 {
    public String a;
    public String b;
    public float c;
    public a d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;

    /* compiled from: DocumentData.java */
    /* renamed from: k53$a */
    /* loaded from: classes.dex */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public k53(String str, String str2, float f, a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        a(str, str2, f, aVar, i, f2, f3, i2, i3, f4, z);
    }

    public void a(String str, String str2, float f, a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = aVar;
        this.e = i;
        this.f = f2;
        this.g = f3;
        this.h = i2;
        this.i = i3;
        this.j = f4;
        this.k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c)) * 31) + this.d.ordinal()) * 31) + this.e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.h;
    }

    public k53() {
    }
}
