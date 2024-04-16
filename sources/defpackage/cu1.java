package defpackage;

import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.s58;
import defpackage.si9;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContentStreamRequestHandler.java */
/* renamed from: cu1  reason: default package */
/* loaded from: classes3.dex */
public class cu1 extends si9 {
    final Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cu1(Context context) {
        this.a = context;
    }

    @Override // defpackage.si9
    public boolean c(gi9 gi9Var) {
        return RemoteMessageConst.Notification.CONTENT.equals(gi9Var.d.getScheme());
    }

    @Override // defpackage.si9
    public si9.a f(gi9 gi9Var, int i) throws IOException {
        return new si9.a(c77.j(j(gi9Var)), s58.e.DISK);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputStream j(gi9 gi9Var) throws FileNotFoundException {
        return this.a.getContentResolver().openInputStream(gi9Var.d);
    }
}
