package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.mm6;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: UriLoader.java */
/* renamed from: rtb  reason: default package */
/* loaded from: classes.dex */
public class rtb<Data> implements mm6<Uri, Data> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(Action.FILE_ATTRIBUTE, RemoteMessageConst.Notification.CONTENT, "android.resource")));
    private final c<Data> a;

    /* compiled from: UriLoader.java */
    /* renamed from: rtb$a */
    /* loaded from: classes.dex */
    public static final class a implements nm6<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.rtb.c
        public uk2<AssetFileDescriptor> a(Uri uri) {
            return new is(this.a, uri);
        }

        @Override // defpackage.nm6
        public mm6<Uri, AssetFileDescriptor> d(qp6 qp6Var) {
            return new rtb(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* renamed from: rtb$b */
    /* loaded from: classes.dex */
    public static class b implements nm6<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.rtb.c
        public uk2<ParcelFileDescriptor> a(Uri uri) {
            return new st3(this.a, uri);
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Uri, ParcelFileDescriptor> d(qp6 qp6Var) {
            return new rtb(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* renamed from: rtb$c */
    /* loaded from: classes.dex */
    public interface c<Data> {
        uk2<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* renamed from: rtb$d */
    /* loaded from: classes.dex */
    public static class d implements nm6<Uri, InputStream>, c<InputStream> {
        private final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.rtb.c
        public uk2<InputStream> a(Uri uri) {
            return new uya(this.a, uri);
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Uri, InputStream> d(qp6 qp6Var) {
            return new rtb(this);
        }
    }

    public rtb(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<Data> b(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        return new mm6.a<>(new e57(uri), this.a.a(uri));
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull Uri uri) {
        return b.contains(uri.getScheme());
    }
}
