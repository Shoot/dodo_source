package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: y  reason: default package */
/* loaded from: classes.dex */
public final class y {
    private String a;
    private InputStream c;
    private u b = u.b;
    private final Map<String, String> d = new HashMap();
    private final List<wda> e = new ArrayList();

    public x a(Context context) {
        return new lec(context, this.a, this.b, this.c, this.d, this.e, null);
    }

    public y b(InputStream inputStream) {
        this.c = inputStream;
        return this;
    }
}
