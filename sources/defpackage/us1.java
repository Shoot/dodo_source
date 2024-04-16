package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.s58;
import defpackage.si9;
import java.io.IOException;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContactsPhotoRequestHandler.java */
/* renamed from: us1  reason: default package */
/* loaded from: classes3.dex */
public class us1 extends si9 {
    private static final UriMatcher b;
    private final Context a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public us1(Context context) {
        this.a = context;
    }

    private InputStream j(gi9 gi9Var) throws IOException {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = gi9Var.d;
        int match = b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // defpackage.si9
    public boolean c(gi9 gi9Var) {
        Uri uri = gi9Var.d;
        if (RemoteMessageConst.Notification.CONTENT.equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && b.match(gi9Var.d) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.si9
    public si9.a f(gi9 gi9Var, int i) throws IOException {
        InputStream j = j(gi9Var);
        if (j == null) {
            return null;
        }
        return new si9.a(c77.j(j), s58.e.DISK);
    }
}
