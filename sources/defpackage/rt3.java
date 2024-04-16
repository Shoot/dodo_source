package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
/* compiled from: FileDescriptorAssetPathFetcher.java */
/* renamed from: rt3  reason: default package */
/* loaded from: classes.dex */
public class rt3 extends js<AssetFileDescriptor> {
    public rt3(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.uk2
    @NonNull
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.js
    /* renamed from: g */
    public void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.js
    /* renamed from: h */
    public AssetFileDescriptor f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
