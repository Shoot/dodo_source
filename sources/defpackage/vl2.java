package defpackage;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Collections;
/* compiled from: DataUriSchemeHandler.java */
/* renamed from: vl2  reason: default package */
/* loaded from: classes3.dex */
public class vl2 extends qw9 {
    private final ul2 a;
    private final tl2 b;

    vl2(@NonNull ul2 ul2Var, @NonNull tl2 tl2Var) {
        this.a = ul2Var;
        this.b = tl2Var;
    }

    @NonNull
    public static vl2 c() {
        return new vl2(ul2.a(), tl2.a());
    }

    @Override // defpackage.qw9
    @NonNull
    public ru4 a(@NonNull String str, @NonNull Uri uri) {
        if (str.startsWith("data:")) {
            sl2 b = this.a.b(str.substring(5));
            if (b != null) {
                try {
                    byte[] b2 = this.b.b(b);
                    if (b2 != null) {
                        return ru4.d(b.b(), new ByteArrayInputStream(b2));
                    }
                    throw new IllegalStateException("Decoding data-uri failed: " + str);
                } catch (Throwable th) {
                    throw new IllegalStateException("Cannot decode data-uri: " + str, th);
                }
            }
            throw new IllegalStateException("Invalid data-uri: " + str);
        }
        throw new IllegalStateException("Invalid data-uri: " + str);
    }

    @Override // defpackage.qw9
    @NonNull
    public Collection<String> b() {
        return Collections.singleton("data");
    }
}
