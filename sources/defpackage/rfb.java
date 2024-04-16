package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.uk2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ThumbFetcher.java */
/* renamed from: rfb  reason: default package */
/* loaded from: classes.dex */
public class rfb implements uk2<InputStream> {
    private final Uri a;
    private final ufb b;
    private InputStream c;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: rfb$a */
    /* loaded from: classes.dex */
    static class a implements sfb {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.sfb
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* renamed from: rfb$b */
    /* loaded from: classes.dex */
    static class b implements sfb {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.sfb
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    rfb(Uri uri, ufb ufbVar) {
        this.a = uri;
        this.b = ufbVar;
    }

    private static rfb c(Context context, Uri uri, sfb sfbVar) {
        return new rfb(uri, new ufb(com.bumptech.glide.b.c(context).j().g(), sfbVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static rfb f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static rfb g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        int i;
        InputStream d = this.b.d(this.a);
        if (d != null) {
            i = this.b.a(this.a);
        } else {
            i = -1;
        }
        if (i != -1) {
            return new xm3(d, i);
        }
        return d;
    }

    @Override // defpackage.uk2
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.uk2
    public void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.uk2
    public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super InputStream> aVar) {
        try {
            InputStream h = h();
            this.c = h;
            aVar.f(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.c(e);
        }
    }

    @Override // defpackage.uk2
    @NonNull
    public dl2 e() {
        return dl2.LOCAL;
    }

    @Override // defpackage.uk2
    public void cancel() {
    }
}
