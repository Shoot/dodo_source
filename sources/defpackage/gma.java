package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
/* compiled from: SingleDocumentFile.java */
/* renamed from: gma  reason: default package */
/* loaded from: classes.dex */
class gma extends m53 {
    private Context b;
    private Uri c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gma(m53 m53Var, Context context, Uri uri) {
        super(m53Var);
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.m53
    public boolean a() {
        try {
            return DocumentsContract.deleteDocument(this.b.getContentResolver(), this.c);
        } catch (Exception unused) {
            return false;
        }
    }
}
