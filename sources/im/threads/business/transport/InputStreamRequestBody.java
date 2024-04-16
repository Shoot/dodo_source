package im.threads.business.transport;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.net.Uri;
import im.threads.business.utils.FileUtils;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
/* compiled from: InputStreamRequestBody.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lim/threads/business/transport/InputStreamRequestBody;", "Lji9;", "Lqc6;", "contentType", "", "contentLength", "Leh0;", "sink", "", "writeTo", "Lqc6;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "uri", "Landroid/net/Uri;", "<init>", "(Lqc6;Landroid/content/ContentResolver;Landroid/net/Uri;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class InputStreamRequestBody extends ji9 {
    private final ContentResolver contentResolver;
    private final qc6 contentType;
    private final Uri uri;

    public InputStreamRequestBody(qc6 qc6Var, ContentResolver contentResolver, Uri uri) {
        z65.h(contentResolver, "contentResolver");
        if (uri != null) {
            this.contentType = qc6Var;
            this.contentResolver = contentResolver;
            this.uri = uri;
            return;
        }
        throw new NullPointerException("uri == null");
    }

    @Override // defpackage.ji9
    public long contentLength() {
        return FileUtils.getFileSize(this.uri);
    }

    @Override // defpackage.ji9
    public qc6 contentType() {
        return this.contentType;
    }

    @Override // defpackage.ji9
    @SuppressLint({"Recycle"})
    public void writeTo(eh0 eh0Var) throws IOException {
        pqa j;
        z65.h(eh0Var, "sink");
        InputStream openInputStream = this.contentResolver.openInputStream(this.uri);
        if (openInputStream != null && (j = c77.j(openInputStream)) != null) {
            try {
                eh0Var.a1(j);
                aa1.a(j, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    aa1.a(j, th);
                    throw th2;
                }
            }
        }
    }
}
