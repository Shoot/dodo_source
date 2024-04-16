package defpackage;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.zo1;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CompressBuilder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Luo1;", "", "", "maxWidth", "maxHeight", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "quality", "Lyo1;", DateTokenConverter.CONVERTER_KEY, "Lzo1;", "a", "Lzo1;", "compressor", "Ljava/io/File;", "b", "Ljava/io/File;", "imageToCompress", "", c.a, "Ljava/lang/String;", "destinationPath", "<init>", "(Lzo1;Ljava/io/File;Ljava/lang/String;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uo1  reason: default package */
/* loaded from: classes4.dex */
public final class uo1 {
    public static final a d = new a(null);
    private final zo1 a;
    private final File b;
    private final String c;

    /* compiled from: CompressBuilder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Luo1$a;", "", "", "DEFAULT_PARAM_MAX_HEIGHT", "I", "DEFAULT_PARAM_MAX_WIDTH", "DEFAULT_PARAM_QUALITY", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uo1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CompressBuilder.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"uo1$b", "Lyo1;", "Ljava/io/File;", "a", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uo1$b */
    /* loaded from: classes4.dex */
    public static final class b implements yo1 {
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ Bitmap.CompressFormat d;
        final /* synthetic */ int e;

        b(int i, int i2, Bitmap.CompressFormat compressFormat, int i3) {
            this.b = i;
            this.c = i2;
            this.d = compressFormat;
            this.e = i3;
        }

        @Override // defpackage.yo1
        public File a() {
            return uo1.this.a.a(new zo1.a(uo1.this.b, this.b, this.c, this.d, this.e, uo1.this.c));
        }
    }

    public uo1(zo1 zo1Var, File file, String str) {
        z65.h(zo1Var, "compressor");
        z65.h(file, "imageToCompress");
        z65.h(str, "destinationPath");
        this.a = zo1Var;
        this.b = file;
        this.c = str;
    }

    public static /* synthetic */ yo1 e(uo1 uo1Var, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 600;
        }
        if ((i4 & 2) != 0) {
            i2 = 800;
        }
        if ((i4 & 4) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i4 & 8) != 0) {
            i3 = 80;
        }
        return uo1Var.d(i, i2, compressFormat, i3);
    }

    public final yo1 d(int i, int i2, Bitmap.CompressFormat compressFormat, int i3) {
        z65.h(compressFormat, "compressFormat");
        return new b(i, i2, compressFormat, i3);
    }
}
