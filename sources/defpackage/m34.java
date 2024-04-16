package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.w34;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontProvider.java */
/* renamed from: m34  reason: default package */
/* loaded from: classes.dex */
public class m34 {
    private static final Comparator<byte[]> a = new Comparator() { // from class: l34
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g;
            g = m34.g((byte[]) obj, (byte[]) obj2);
            return g;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontProvider.java */
    /* renamed from: m34$a */
    /* loaded from: classes.dex */
    public static class a {
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(n34 n34Var, Resources resources) {
        if (n34Var.b() != null) {
            return n34Var.b();
        }
        return p34.c(resources, n34Var.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static w34.a e(@NonNull Context context, @NonNull n34 n34Var, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f = f(context.getPackageManager(), n34Var, context.getResources());
        if (f == null) {
            return w34.a.a(1, null);
        }
        return w34.a.a(0, h(context, n34Var, f.authority, cancellationSignal));
    }

    static ProviderInfo f(@NonNull PackageManager packageManager, @NonNull n34 n34Var, Resources resources) throws PackageManager.NameNotFoundException {
        String e = n34Var.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(n34Var.f())) {
                List<byte[]> b = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(b, a);
                List<List<byte[]>> d = d(n34Var, resources);
                for (int i = 0; i < d.size(); i++) {
                    ArrayList arrayList = new ArrayList(d.get(i));
                    Collections.sort(arrayList, a);
                    if (c(b, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + n34Var.f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    @NonNull
    static w34.b[] h(Context context, n34 n34Var, String str, CancellationSignal cancellationSignal) {
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(str).build();
        Uri build2 = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(str).appendPath(Action.FILE_ATTRIBUTE).build();
        Cursor cursor = null;
        try {
            Cursor a2 = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{n34Var.g()}, null, cancellationSignal);
            if (a2 != null) {
                try {
                    if (a2.getCount() > 0) {
                        int columnIndex = a2.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = a2.getColumnIndex("_id");
                        int columnIndex3 = a2.getColumnIndex("file_id");
                        int columnIndex4 = a2.getColumnIndex("font_ttc_index");
                        int columnIndex5 = a2.getColumnIndex("font_weight");
                        int columnIndex6 = a2.getColumnIndex("font_italic");
                        while (a2.moveToNext()) {
                            if (columnIndex != -1) {
                                i = a2.getInt(columnIndex);
                            } else {
                                i = 0;
                            }
                            if (columnIndex4 != -1) {
                                i2 = a2.getInt(columnIndex4);
                            } else {
                                i2 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, a2.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, a2.getLong(columnIndex3));
                            }
                            if (columnIndex5 != -1) {
                                i3 = a2.getInt(columnIndex5);
                            } else {
                                i3 = 400;
                            }
                            if (columnIndex6 != -1 && a2.getInt(columnIndex6) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList.add(w34.b.a(withAppendedId, i2, i3, z, i));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = a2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a2 != null) {
                a2.close();
            }
            return (w34.b[]) arrayList.toArray(new w34.b[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
