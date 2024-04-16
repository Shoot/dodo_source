package defpackage;

import android.graphics.Bitmap;
import kotlin.Metadata;
/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lyg;", "Leu4;", "", "a", "Landroid/graphics/Bitmap;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "", "getWidth", "()I", "width", "getHeight", "height", "<init>", "(Landroid/graphics/Bitmap;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yg  reason: default package */
/* loaded from: classes.dex */
public final class yg implements eu4 {
    private final Bitmap b;

    public yg(Bitmap bitmap) {
        z65.h(bitmap, "bitmap");
        this.b = bitmap;
    }

    @Override // defpackage.eu4
    public void a() {
        this.b.prepareToDraw();
    }

    public final Bitmap b() {
        return this.b;
    }

    @Override // defpackage.eu4
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // defpackage.eu4
    public int getWidth() {
        return this.b.getWidth();
    }
}
