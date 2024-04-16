package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.mm6;
import java.io.InputStream;
/* compiled from: ResourceLoader.java */
/* renamed from: ak9  reason: default package */
/* loaded from: classes.dex */
public class ak9<Data> implements mm6<Integer, Data> {
    private final mm6<Uri, Data> a;
    private final Resources b;

    /* compiled from: ResourceLoader.java */
    /* renamed from: ak9$a */
    /* loaded from: classes.dex */
    public static final class a implements nm6<Integer, AssetFileDescriptor> {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.nm6
        public mm6<Integer, AssetFileDescriptor> d(qp6 qp6Var) {
            return new ak9(this.a, qp6Var.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* renamed from: ak9$b */
    /* loaded from: classes.dex */
    public static class b implements nm6<Integer, InputStream> {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Integer, InputStream> d(qp6 qp6Var) {
            return new ak9(this.a, qp6Var.d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* renamed from: ak9$c */
    /* loaded from: classes.dex */
    public static class c implements nm6<Integer, Uri> {
        private final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Integer, Uri> d(qp6 qp6Var) {
            return new ak9(this.a, sqb.c());
        }
    }

    public ak9(Resources resources, mm6<Uri, Data> mm6Var) {
        this.b = resources;
        this.a = mm6Var;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + '/' + this.b.getResourceTypeName(num.intValue()) + '/' + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
                return null;
            }
            return null;
        }
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<Data> b(@NonNull Integer num, int i, int i2, @NonNull ac7 ac7Var) {
        Uri d = d(num);
        if (d == null) {
            return null;
        }
        return this.a.b(d, i, i2, ac7Var);
    }

    @Override // defpackage.mm6
    /* renamed from: e */
    public boolean a(@NonNull Integer num) {
        return true;
    }
}
