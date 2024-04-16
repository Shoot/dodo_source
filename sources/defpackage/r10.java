package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.util.Arrays;
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* renamed from: r10  reason: default package */
/* loaded from: classes2.dex */
final class r10 extends j12.d.b {
    private final String a;
    private final byte[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    /* renamed from: r10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.d.b.a {
        private String a;
        private byte[] b;

        @Override // defpackage.j12.d.b.a
        public j12.d.b a() {
            String str = "";
            if (this.a == null) {
                str = " filename";
            }
            if (this.b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new r10(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.d.b.a
        public j12.d.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // defpackage.j12.d.b.a
        public j12.d.b.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // defpackage.j12.d.b
    @NonNull
    public byte[] b() {
        return this.b;
    }

    @Override // defpackage.j12.d.b
    @NonNull
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        byte[] b2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.d.b)) {
            return false;
        }
        j12.d.b bVar = (j12.d.b) obj;
        if (this.a.equals(bVar.c())) {
            byte[] bArr = this.b;
            if (bVar instanceof r10) {
                b2 = ((r10) bVar).b;
            } else {
                b2 = bVar.b();
            }
            if (Arrays.equals(bArr, b2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }

    private r10(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }
}
