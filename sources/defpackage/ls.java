package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import defpackage.mm6;
import java.io.InputStream;
/* compiled from: AssetUriLoader.java */
/* renamed from: ls  reason: default package */
/* loaded from: classes.dex */
public class ls<Data> implements mm6<Uri, Data> {
    private static final int c = 22;
    private final AssetManager a;
    private final a<Data> b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: ls$a */
    /* loaded from: classes.dex */
    public interface a<Data> {
        uk2<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: ls$b */
    /* loaded from: classes.dex */
    public static class b implements nm6<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // defpackage.ls.a
        public uk2<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new rt3(assetManager, str);
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Uri, AssetFileDescriptor> d(qp6 qp6Var) {
            return new ls(this.a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: ls$c */
    /* loaded from: classes.dex */
    public static class c implements nm6<Uri, InputStream>, a<InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // defpackage.ls.a
        public uk2<InputStream> a(AssetManager assetManager, String str) {
            return new oya(assetManager, str);
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Uri, InputStream> d(qp6 qp6Var) {
            return new ls(this.a, this);
        }
    }

    public ls(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<Data> b(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        return new mm6.a<>(new e57(uri), this.b.a(this.a, uri.toString().substring(c)));
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull Uri uri) {
        if (!Action.FILE_ATTRIBUTE.equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
