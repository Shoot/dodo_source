package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.mm6;
import java.io.InputStream;
import java.util.List;
/* compiled from: ResourceUriLoader.java */
/* renamed from: dk9  reason: default package */
/* loaded from: classes.dex */
public final class dk9<DataT> implements mm6<Uri, DataT> {
    private final Context a;
    private final mm6<Integer, DataT> b;

    /* compiled from: ResourceUriLoader.java */
    /* renamed from: dk9$a */
    /* loaded from: classes.dex */
    private static final class a implements nm6<Uri, AssetFileDescriptor> {
        private final Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Uri, AssetFileDescriptor> d(@NonNull qp6 qp6Var) {
            return new dk9(this.a, qp6Var.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceUriLoader.java */
    /* renamed from: dk9$b */
    /* loaded from: classes.dex */
    private static final class b implements nm6<Uri, InputStream> {
        private final Context a;

        b(Context context) {
            this.a = context;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Uri, InputStream> d(@NonNull qp6 qp6Var) {
            return new dk9(this.a, qp6Var.d(Integer.class, InputStream.class));
        }
    }

    dk9(Context context, mm6<Integer, DataT> mm6Var) {
        this.a = context.getApplicationContext();
        this.b = mm6Var;
    }

    public static nm6<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static nm6<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    private mm6.a<DataT> g(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt == 0) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                }
                return null;
            }
            return this.b.b(Integer.valueOf(parseInt), i, i2, ac7Var);
        } catch (NumberFormatException e) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e);
            }
            return null;
        }
    }

    private mm6.a<DataT> h(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(1);
        int identifier = this.a.getResources().getIdentifier(str, pathSegments.get(0), this.a.getPackageName());
        if (identifier == 0) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
                return null;
            }
            return null;
        }
        return this.b.b(Integer.valueOf(identifier), i, i2, ac7Var);
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<DataT> b(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i, i2, ac7Var);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i, i2, ac7Var);
        }
        if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
            return null;
        }
        return null;
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull Uri uri) {
        if ("android.resource".equals(uri.getScheme()) && this.a.getPackageName().equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }
}
