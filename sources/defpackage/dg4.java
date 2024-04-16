package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
/* compiled from: GlideRequests.java */
/* renamed from: dg4  reason: default package */
/* loaded from: classes.dex */
public class dg4 extends h {
    public dg4(@NonNull b bVar, @NonNull fp5 fp5Var, @NonNull wi9 wi9Var, @NonNull Context context) {
        super(bVar, fp5Var, wi9Var, context);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    /* renamed from: C */
    public <ResourceType> cg4<ResourceType> e(@NonNull Class<ResourceType> cls) {
        return new cg4<>(this.a, this, cls, this.b);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    /* renamed from: D */
    public cg4<Bitmap> f() {
        return (cg4) super.f();
    }

    @Override // com.bumptech.glide.h
    @NonNull
    /* renamed from: E */
    public cg4<Drawable> k() {
        return (cg4) super.k();
    }

    @Override // com.bumptech.glide.h
    @NonNull
    /* renamed from: F */
    public cg4<Drawable> s(Integer num) {
        return (cg4) super.s(num);
    }

    @Override // com.bumptech.glide.h
    @NonNull
    /* renamed from: G */
    public cg4<Drawable> t(String str) {
        return (cg4) super.t(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.h
    public void y(@NonNull xi9 xi9Var) {
        if (xi9Var instanceof bg4) {
            super.y(xi9Var);
        } else {
            super.y(new bg4().b(xi9Var));
        }
    }
}
