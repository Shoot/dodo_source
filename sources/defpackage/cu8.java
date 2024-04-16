package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: QRCodeGraphics.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0004J\b\u0010\f\u001a\u00020\u0001H\u0016J0\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006\""}, d2 = {"Lcu8;", "", "", RemoteMessageConst.Notification.COLOR, "Landroid/graphics/Paint$Style;", "paintStyle", "Landroid/graphics/Paint;", "f", "Landroid/graphics/Bitmap;", ElementGenerator.TYPE_IMAGE, "Landroid/graphics/Canvas;", "a", e.a, "x", "y", "width", "height", "", DateTokenConverter.CONVERTER_KEY, c.a, "img", "b", "I", "getWidth", "()I", "getHeight", "Landroid/graphics/Bitmap;", "Landroid/graphics/Canvas;", "canvas", "", "Ljava/util/Map;", "paintCache", "<init>", "(II)V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: cu8  reason: default package */
/* loaded from: classes3.dex */
public class cu8 {
    public static final a f = new a(null);
    private static final String[] g;
    private final int a;
    private final int b;
    private final Bitmap c;
    private final Canvas d;
    private final Map<Integer, Paint> e;

    /* compiled from: QRCodeGraphics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu8$a;", "", "<init>", "()V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: cu8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Bitmap.CompressFormat[] values = Bitmap.CompressFormat.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (Bitmap.CompressFormat compressFormat : values) {
            arrayList.add(compressFormat.name());
        }
        g = (String[]) arrayList.toArray(new String[0]);
    }

    public cu8(int i, int i2) {
        this.a = i;
        this.b = i2;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        z65.g(createBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        this.c = createBitmap;
        this.d = a(createBitmap);
        this.e = new LinkedHashMap();
    }

    private final Paint f(int i, Paint.Style style) {
        if (!this.e.containsKey(Integer.valueOf(i))) {
            Map<Integer, Paint> map = this.e;
            Integer valueOf = Integer.valueOf(i);
            Paint paint = new Paint();
            paint.setColor(i);
            map.put(valueOf, paint);
        }
        Paint paint2 = this.e.get(Integer.valueOf(i));
        z65.e(paint2);
        Paint paint3 = paint2;
        if (paint3.getStyle() != style) {
            paint3.setStyle(style);
        }
        return paint3;
    }

    protected final Canvas a(Bitmap bitmap) {
        z65.h(bitmap, ElementGenerator.TYPE_IMAGE);
        return new Canvas(bitmap);
    }

    public void b(cu8 cu8Var, int i, int i2) {
        z65.h(cu8Var, "img");
        this.d.drawBitmap(cu8Var.c, i, i2, (Paint) null);
    }

    public void c(int i) {
        d(0, 0, this.a, this.b, i);
    }

    public void d(int i, int i2, int i3, int i4, int i5) {
        this.d.drawRect(new Rect(i, i2, i3, i4), f(i5, Paint.Style.FILL));
    }

    public Object e() {
        return this.c;
    }
}
