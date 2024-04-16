package defpackage;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.File;
import kotlin.Metadata;
/* compiled from: Compressor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lzo1;", "", "Lzo1$a;", "params", "Ljava/io/File;", "a", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zo1  reason: default package */
/* loaded from: classes4.dex */
public interface zo1 {

    /* compiled from: Compressor.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010#\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006&"}, d2 = {"Lzo1$a;", "", "Ljava/io/File;", "a", "", "b", c.a, "Landroid/graphics/Bitmap$CompressFormat;", DateTokenConverter.CONVERTER_KEY, e.a, "", "toString", "hashCode", "other", "", "equals", "Ljava/io/File;", "getImageFile", "()Ljava/io/File;", "imageFile", "I", "getReqWidth", "()I", "reqWidth", "getReqHeight", "reqHeight", "Landroid/graphics/Bitmap$CompressFormat;", "getCompressFormat", "()Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "getQuality", "quality", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "destinationPath", "<init>", "(Ljava/io/File;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zo1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private final File a;
        private final int b;
        private final int c;
        private final Bitmap.CompressFormat d;
        private final int e;
        private final String f;

        public a(File file, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str) {
            z65.h(file, "imageFile");
            z65.h(compressFormat, "compressFormat");
            z65.h(str, "destinationPath");
            this.a = file;
            this.b = i;
            this.c = i2;
            this.d = compressFormat;
            this.e = i3;
            this.f = str;
        }

        public final File a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final Bitmap.CompressFormat d() {
            return this.d;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && z65.c(this.f, aVar.f)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f;
        }

        public int hashCode() {
            return (((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f.hashCode();
        }

        public String toString() {
            File file = this.a;
            int i = this.b;
            int i2 = this.c;
            Bitmap.CompressFormat compressFormat = this.d;
            int i3 = this.e;
            String str = this.f;
            return "CompressParams(imageFile=" + file + ", reqWidth=" + i + ", reqHeight=" + i2 + ", compressFormat=" + compressFormat + ", quality=" + i3 + ", destinationPath=" + str + ")";
        }
    }

    File a(a aVar);
}
