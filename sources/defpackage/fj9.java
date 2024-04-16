package defpackage;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
import com.huawei.hms.opendevice.c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ResizeImageTransformation.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014R\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lfj9;", "Ljc0;", "Ljava/security/MessageDigest;", "messageDigest", "", "b", "Lgc0;", "pool", "Landroid/graphics/Bitmap;", "toTransform", "", "outWidth", "outHeight", c.a, "I", "imageWidth", "imageHeight", "<init>", "(II)V", DateTokenConverter.CONVERTER_KEY, "a", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fj9  reason: default package */
/* loaded from: classes4.dex */
public final class fj9 extends jc0 {
    public static final a d = new a(null);
    private static final byte[] e;
    private final int b;
    private final int c;

    /* compiled from: ResizeImageTransformation.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lfj9$a;", "", "", ServerDeltaTimeEntity.ID_VALUE, "Ljava/lang/String;", "", "ID_BYTES", "[B", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fj9$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Charset charset = se5.a;
        z65.g(charset, "CHARSET");
        byte[] bytes = "ru.dodopizza.app.infrastracture.utils.transformations.ResizeImageTransformation".getBytes(charset);
        z65.g(bytes, "getBytes(...)");
        e = bytes;
    }

    public fj9(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.se5
    public void b(MessageDigest messageDigest) {
        z65.h(messageDigest, "messageDigest");
        messageDigest.update(e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.jc0
    protected Bitmap c(gc0 gc0Var, Bitmap bitmap, int i, int i2) {
        z65.h(gc0Var, "pool");
        z65.h(bitmap, "toTransform");
        if (Math.max(bitmap.getWidth(), bitmap.getHeight()) <= Math.min(this.b, this.c)) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.b, this.c, false);
        z65.g(createScaledBitmap, "createScaledBitmap(...)");
        return createScaledBitmap;
    }
}
