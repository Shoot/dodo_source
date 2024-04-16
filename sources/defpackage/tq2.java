package defpackage;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
/* compiled from: DefaultMediaDecoder.java */
/* renamed from: tq2  reason: default package */
/* loaded from: classes3.dex */
public class tq2 extends kc6 {
    private final Resources a;

    tq2(Resources resources) {
        this.a = resources;
    }

    @NonNull
    public static tq2 c() {
        return new tq2(Resources.getSystem());
    }

    @Override // defpackage.kc6
    @NonNull
    public Drawable a(String str, @NonNull InputStream inputStream) {
        try {
            return new BitmapDrawable(this.a, BitmapFactory.decodeStream(inputStream));
        } catch (Throwable th) {
            throw new IllegalStateException("Exception decoding input-stream", th);
        }
    }

    @Override // defpackage.kc6
    @NonNull
    public Collection<String> b() {
        return Collections.emptySet();
    }
}
