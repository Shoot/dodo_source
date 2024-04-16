package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import defpackage.h74;
import java.io.IOException;
import org.aomedia.avif.android.AvifDecoder;
/* compiled from: AVIFDecoder.java */
/* renamed from: n0  reason: default package */
/* loaded from: classes.dex */
public class n0 extends h74<r0, s0> {
    private AvifDecoder v;

    public n0(xr5 xr5Var, h74.j jVar) {
        super(xr5Var, jVar);
        this.v = null;
    }

    @Override // defpackage.h74
    public int A() {
        return 1;
    }

    @Override // defpackage.h74
    protected /* bridge */ /* synthetic */ s0 B() {
        T();
        return null;
    }

    @Override // defpackage.h74
    protected void J() {
        AvifDecoder avifDecoder = this.v;
        if (avifDecoder != null) {
            avifDecoder.release();
            this.v = null;
        }
    }

    @Override // defpackage.h74
    protected void L(z64<r0, s0> z64Var) {
        Bitmap G = G(this.v.getWidth(), this.v.getHeight());
        AvifDecoder avifDecoder = this.v;
        if (avifDecoder == null) {
            return;
        }
        int i = this.e;
        int i2 = ((p0) z64Var).e;
        if (i != i2) {
            avifDecoder.nthFrame(i2, G);
        } else if (i == 0) {
            avifDecoder.nthFrame(0, G);
        } else {
            avifDecoder.nextFrame(G);
        }
        this.o.rewind();
        try {
            G.copyPixelsToBuffer(this.o);
        } catch (Exception e) {
            Log.d("AVIFDecoder", "Error in render frame", e);
        }
        I(G);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.h74
    /* renamed from: S */
    public r0 z(m79 m79Var) {
        return new r0(m79Var);
    }

    protected s0 T() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.h74
    /* renamed from: U */
    public Rect H(r0 r0Var) throws IOException {
        this.v = AvifDecoder.create(r0Var.a());
        return new Rect(0, 0, this.v.getWidth(), this.v.getHeight());
    }

    @Override // defpackage.h74
    public z64<r0, s0> t(int i) {
        p0 p0Var = new p0(null);
        p0Var.e = i;
        p0Var.b = (int) (this.v.getFrameDurations()[i] * 1000.0d);
        return p0Var;
    }

    @Override // defpackage.h74
    public Bitmap u(int i) throws IOException {
        if (this.v == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(r().width() / A(), r().height() / A(), Bitmap.Config.ARGB_8888);
        this.v.nthFrame(i, createBitmap);
        return createBitmap;
    }

    @Override // defpackage.h74
    public int v() {
        AvifDecoder avifDecoder = this.v;
        if (avifDecoder == null) {
            return 0;
        }
        return avifDecoder.getFrameCount();
    }

    @Override // defpackage.h74
    protected int w() {
        AvifDecoder avifDecoder = this.v;
        if (avifDecoder == null) {
            return 0;
        }
        if (avifDecoder.getFrameCount() == 1) {
            return 1;
        }
        return this.v.getRepetitionCount();
    }
}
