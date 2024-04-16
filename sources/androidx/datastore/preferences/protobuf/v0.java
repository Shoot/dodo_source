package androidx.datastore.preferences.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RawMessageInfo.java */
/* loaded from: classes.dex */
public final class v0 implements j0 {
    private final l0 a;
    private final String b;
    private final Object[] c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(l0 l0Var, String str, Object[] objArr) {
        this.a = l0Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public boolean a() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public l0 b() {
        return this.a;
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public or8 c() {
        if ((this.d & 1) == 1) {
            return or8.PROTO2;
        }
        return or8.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.b;
    }
}
