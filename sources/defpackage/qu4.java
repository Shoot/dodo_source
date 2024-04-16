package defpackage;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ImageHeaderParserRegistry.java */
/* renamed from: qu4  reason: default package */
/* loaded from: classes.dex */
public final class qu4 {
    private final List<ImageHeaderParser> a = new ArrayList();

    public synchronized void a(@NonNull ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }

    @NonNull
    public synchronized List<ImageHeaderParser> b() {
        return this.a;
    }
}
