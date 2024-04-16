package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import defpackage.g73;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamBitmapDecoder.java */
/* renamed from: pya  reason: default package */
/* loaded from: classes.dex */
public class pya implements rj9<InputStream, Bitmap> {
    private final g73 a;
    private final mr b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StreamBitmapDecoder.java */
    /* renamed from: pya$a */
    /* loaded from: classes.dex */
    public static class a implements g73.b {
        private final u99 a;
        private final ql3 b;

        a(u99 u99Var, ql3 ql3Var) {
            this.a = u99Var;
            this.b = ql3Var;
        }

        @Override // defpackage.g73.b
        public void a() {
            this.a.b();
        }

        @Override // defpackage.g73.b
        public void b(gc0 gc0Var, Bitmap bitmap) throws IOException {
            IOException a = this.b.a();
            if (a != null) {
                if (bitmap != null) {
                    gc0Var.c(bitmap);
                }
                throw a;
            }
        }
    }

    public pya(g73 g73Var, mr mrVar) {
        this.a = g73Var;
        this.b = mrVar;
    }

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<Bitmap> b(@NonNull InputStream inputStream, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        u99 u99Var;
        boolean z;
        if (inputStream instanceof u99) {
            u99Var = (u99) inputStream;
            z = false;
        } else {
            u99Var = new u99(inputStream, this.b);
            z = true;
        }
        ql3 b = ql3.b(u99Var);
        try {
            return this.a.f(new k86(b), i, i2, ac7Var, new a(u99Var, b));
        } finally {
            b.c();
            if (z) {
                u99Var.c();
            }
        }
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull InputStream inputStream, @NonNull ac7 ac7Var) {
        return this.a.p(inputStream);
    }
}
