package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.s58;
import defpackage.si9;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaStoreRequestHandler.java */
/* renamed from: nc6  reason: default package */
/* loaded from: classes3.dex */
public class nc6 extends cu1 {
    private static final String[] b = {"orientation"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediaStoreRequestHandler.java */
    /* renamed from: nc6$a */
    /* loaded from: classes3.dex */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int a;
        final int b;
        final int c;

        a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public nc6(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int k(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = defpackage.nc6.b     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L20
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L20
            if (r1 == 0) goto L22
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L20
            if (r8 != 0) goto L16
            goto L22
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L20
            r1.close()
            return r8
        L1e:
            r8 = move-exception
            goto L28
        L20:
            goto L2e
        L22:
            if (r1 == 0) goto L27
            r1.close()
        L27:
            return r0
        L28:
            if (r1 == 0) goto L2d
            r1.close()
        L2d:
            throw r8
        L2e:
            if (r1 == 0) goto L33
            r1.close()
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc6.k(android.content.ContentResolver, android.net.Uri):int");
    }

    static a l(int i, int i2) {
        a aVar = a.MICRO;
        if (i <= aVar.b && i2 <= aVar.c) {
            return aVar;
        }
        a aVar2 = a.MINI;
        if (i <= aVar2.b && i2 <= aVar2.c) {
            return aVar2;
        }
        return a.FULL;
    }

    @Override // defpackage.cu1, defpackage.si9
    public boolean c(gi9 gi9Var) {
        Uri uri = gi9Var.d;
        if (RemoteMessageConst.Notification.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cu1, defpackage.si9
    public si9.a f(gi9 gi9Var, int i) throws IOException {
        boolean z;
        Bitmap thumbnail;
        int i2;
        ContentResolver contentResolver = this.a.getContentResolver();
        int k = k(contentResolver, gi9Var.d);
        String type = contentResolver.getType(gi9Var.d);
        if (type != null && type.startsWith("video/")) {
            z = true;
        } else {
            z = false;
        }
        if (gi9Var.c()) {
            a l = l(gi9Var.h, gi9Var.i);
            if (!z && l == a.FULL) {
                return new si9.a(null, c77.j(j(gi9Var)), s58.e.DISK, k);
            }
            long parseId = ContentUris.parseId(gi9Var.d);
            BitmapFactory.Options d = si9.d(gi9Var);
            d.inJustDecodeBounds = true;
            si9.a(gi9Var.h, gi9Var.i, l.b, l.c, d, gi9Var);
            if (z) {
                if (l == a.FULL) {
                    i2 = 1;
                } else {
                    i2 = l.a;
                }
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i2, d);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l.a, d);
            }
            if (thumbnail != null) {
                return new si9.a(thumbnail, null, s58.e.DISK, k);
            }
        }
        return new si9.a(null, c77.j(j(gi9Var)), s58.e.DISK, k);
    }
}
