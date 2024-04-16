package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.dodopizza.android.glide.MainAppGlideModule;
import java.util.Collections;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final MainAppGlideModule a = new MainAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.dodopizza.android.glide.MainAppGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.dodopizza.android.avif.glide.GlideAnimationModule");
        }
    }

    @Override // defpackage.bp5
    public void a(@NonNull Context context, @NonNull b bVar, @NonNull Registry registry) {
        new xf4().a(context, bVar, registry);
        this.a.a(context, bVar, registry);
    }

    @Override // defpackage.zn
    public void b(@NonNull Context context, @NonNull c cVar) {
        this.a.b(context, cVar);
    }

    @Override // defpackage.zn
    public boolean c() {
        return this.a.c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public Set<Class<?>> d() {
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    /* renamed from: f */
    public a e() {
        return new a();
    }
}
