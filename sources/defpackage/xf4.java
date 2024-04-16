package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.b;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: GlideAnimationModule.java */
/* renamed from: xf4  reason: default package */
/* loaded from: classes.dex */
public class xf4 extends bp5 {
    @Override // defpackage.bp5
    public void a(@NonNull Context context, @NonNull b bVar, @NonNull Registry registry) {
        super.a(context, bVar, registry);
        qj0 qj0Var = new qj0();
        registry.o(InputStream.class, h74.class, new nya(qj0Var));
        registry.o(ByteBuffer.class, h74.class, qj0Var);
        registry.s(h74.class, Drawable.class, new d74());
        registry.s(h74.class, Bitmap.class, new b74(bVar.f()));
    }
}
