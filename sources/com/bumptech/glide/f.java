package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import defpackage.ak0;
import defpackage.ak9;
import defpackage.eg4;
import defpackage.jq4;
import defpackage.lc6;
import defpackage.ls;
import defpackage.mc6;
import defpackage.nj0;
import defpackage.pc6;
import defpackage.rtb;
import defpackage.rza;
import defpackage.sqb;
import defpackage.vt8;
import defpackage.wj0;
import defpackage.wl2;
import defpackage.wtb;
import defpackage.zt3;
import defpackage.ztb;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegistryFactory.java */
/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegistryFactory.java */
    /* loaded from: classes.dex */
    public class a implements eg4.b<Registry> {
        private boolean a;
        final /* synthetic */ b b;
        final /* synthetic */ List c;
        final /* synthetic */ zn d;

        a(b bVar, List list, zn znVar) {
            this.b = bVar;
            this.c = list;
            this.d = znVar;
        }

        @Override // defpackage.eg4.b
        /* renamed from: a */
        public Registry get() {
            if (!this.a) {
                pjb.a("Glide registry");
                this.a = true;
                try {
                    return f.a(this.b, this.c, this.d);
                } finally {
                    this.a = false;
                    pjb.b();
                }
            }
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
    }

    static Registry a(b bVar, List<ag4> list, zn znVar) {
        gc0 f = bVar.f();
        mr e = bVar.e();
        Context applicationContext = bVar.i().getApplicationContext();
        e g = bVar.i().g();
        Registry registry = new Registry();
        b(applicationContext, registry, f, e, g);
        c(applicationContext, bVar, registry, list, znVar);
        return registry;
    }

    private static void b(Context context, Registry registry, gc0 gc0Var, mr mrVar, e eVar) {
        rj9 sj0Var;
        rj9 pyaVar;
        Object obj;
        Registry registry2;
        registry.q(new DefaultImageHeaderParser());
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            registry.q(new vm3());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> g = registry.g();
        xj0 xj0Var = new xj0(context, g, gc0Var, mrVar);
        rj9<ParcelFileDescriptor, Bitmap> m = lyb.m(gc0Var);
        g73 g73Var = new g73(registry.g(), resources.getDisplayMetrics(), gc0Var, mrVar);
        if (i >= 28 && eVar.a(c.b.class)) {
            pyaVar = new x35();
            sj0Var = new uj0();
        } else {
            sj0Var = new sj0(g73Var);
            pyaVar = new pya(g73Var, mrVar);
        }
        if (i >= 28) {
            registry.e("Animation", InputStream.class, Drawable.class, nk.f(g, mrVar));
            registry.e("Animation", ByteBuffer.class, Drawable.class, nk.a(g, mrVar));
        }
        tj9 tj9Var = new tj9(context);
        xb0 xb0Var = new xb0(mrVar);
        qb0 qb0Var = new qb0();
        lf4 lf4Var = new lf4();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new vj0()).a(InputStream.class, new sya(mrVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, sj0Var).e("Bitmap", InputStream.class, Bitmap.class, pyaVar);
        if (ParcelFileDescriptorRewinder.c()) {
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new uq7(g73Var));
        }
        registry.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, lyb.c(gc0Var));
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m).c(Bitmap.class, Bitmap.class, sqb.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new qqb()).b(Bitmap.class, xb0Var).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ub0(resources, sj0Var)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ub0(resources, pyaVar)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new ub0(resources, m)).b(BitmapDrawable.class, new vb0(gc0Var, xb0Var)).e("Animation", InputStream.class, kf4.class, new tya(g, xj0Var, mrVar)).e("Animation", ByteBuffer.class, kf4.class, xj0Var).b(kf4.class, new mf4()).c(jf4.class, jf4.class, sqb.a.a()).e("Bitmap", jf4.class, Bitmap.class, new rf4(gc0Var)).d(Uri.class, Drawable.class, tj9Var).d(Uri.class, Bitmap.class, new oj9(tj9Var, gc0Var)).r(new ak0.a()).c(File.class, ByteBuffer.class, new wj0.b()).c(File.class, InputStream.class, new zt3.e()).d(File.class, File.class, new ft3()).c(File.class, ParcelFileDescriptor.class, new zt3.b()).c(File.class, File.class, sqb.a.a()).r(new c.a(mrVar));
        if (ParcelFileDescriptorRewinder.c()) {
            obj = BitmapDrawable.class;
            registry2 = registry;
            registry2.r(new ParcelFileDescriptorRewinder.a());
        } else {
            obj = BitmapDrawable.class;
            registry2 = registry;
        }
        nm6<Integer, InputStream> g2 = r23.g(context);
        nm6<Integer, AssetFileDescriptor> c = r23.c(context);
        nm6<Integer, Drawable> e = r23.e(context);
        Class cls = Integer.TYPE;
        registry2.c(cls, InputStream.class, g2).c(Integer.class, InputStream.class, g2).c(cls, AssetFileDescriptor.class, c).c(Integer.class, AssetFileDescriptor.class, c).c(cls, Drawable.class, e).c(Integer.class, Drawable.class, e).c(Uri.class, InputStream.class, dk9.f(context)).c(Uri.class, AssetFileDescriptor.class, dk9.e(context));
        ak9.c cVar = new ak9.c(resources);
        ak9.a aVar = new ak9.a(resources);
        ak9.b bVar = new ak9.b(resources);
        Object obj2 = obj;
        registry2.c(Integer.class, Uri.class, cVar).c(cls, Uri.class, cVar).c(Integer.class, AssetFileDescriptor.class, aVar).c(cls, AssetFileDescriptor.class, aVar).c(Integer.class, InputStream.class, bVar).c(cls, InputStream.class, bVar);
        registry2.c(String.class, InputStream.class, new wl2.c()).c(Uri.class, InputStream.class, new wl2.c()).c(String.class, InputStream.class, new rza.c()).c(String.class, ParcelFileDescriptor.class, new rza.b()).c(String.class, AssetFileDescriptor.class, new rza.a()).c(Uri.class, InputStream.class, new ls.c(context.getAssets())).c(Uri.class, AssetFileDescriptor.class, new ls.b(context.getAssets())).c(Uri.class, InputStream.class, new mc6.a(context)).c(Uri.class, InputStream.class, new pc6.a(context));
        if (i >= 29) {
            registry2.c(Uri.class, InputStream.class, new vt8.c(context));
            registry2.c(Uri.class, ParcelFileDescriptor.class, new vt8.b(context));
        }
        registry2.c(Uri.class, InputStream.class, new rtb.d(contentResolver)).c(Uri.class, ParcelFileDescriptor.class, new rtb.b(contentResolver)).c(Uri.class, AssetFileDescriptor.class, new rtb.a(contentResolver)).c(Uri.class, InputStream.class, new ztb.a()).c(URL.class, InputStream.class, new wtb.a()).c(Uri.class, File.class, new lc6.a(context)).c(gg4.class, InputStream.class, new jq4.a()).c(byte[].class, ByteBuffer.class, new nj0.a()).c(byte[].class, InputStream.class, new nj0.d()).c(Uri.class, Uri.class, sqb.a.a()).c(Drawable.class, Drawable.class, sqb.a.a()).d(Drawable.class, Drawable.class, new rqb()).s(Bitmap.class, obj2, new wb0(resources)).s(Bitmap.class, byte[].class, qb0Var).s(Drawable.class, byte[].class, new e83(gc0Var, qb0Var, lf4Var)).s(kf4.class, byte[].class, lf4Var);
        if (i >= 23) {
            rj9<ByteBuffer, Bitmap> d = lyb.d(gc0Var);
            registry2.d(ByteBuffer.class, Bitmap.class, d);
            registry2.d(ByteBuffer.class, obj2, new ub0(resources, d));
        }
    }

    private static void c(Context context, b bVar, Registry registry, List<ag4> list, zn znVar) {
        for (ag4 ag4Var : list) {
            try {
                ag4Var.b(context, bVar, registry);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + ag4Var.getClass().getName(), e);
            }
        }
        if (znVar != null) {
            znVar.a(context, bVar, registry);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eg4.b<Registry> d(b bVar, List<ag4> list, zn znVar) {
        return new a(bVar, list, znVar);
    }
}
