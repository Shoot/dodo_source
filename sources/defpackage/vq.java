package defpackage;

import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ArchiveFileFactory.java */
/* renamed from: vq  reason: default package */
/* loaded from: classes3.dex */
public class vq {
    static Map<String, Class<? extends gr4>> a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("zip", scc.class);
        a.put("sqlite", fm2.class);
        a.put("mbtiles", n36.class);
        a.put("gemf", ga4.class);
    }

    public static gr4 a(File file) {
        String name = file.getName();
        if (name.contains(".")) {
            try {
                name = name.substring(name.lastIndexOf(".") + 1);
            } catch (Exception unused) {
            }
        }
        Class<? extends gr4> cls = a.get(name.toLowerCase());
        if (cls != null) {
            try {
                gr4 newInstance = cls.newInstance();
                newInstance.a(file);
                return newInstance;
            } catch (IllegalAccessException e) {
                Log.e("OsmDroid", "Error initializing archive file provider " + file.getAbsolutePath(), e);
                return null;
            } catch (InstantiationException e2) {
                Log.e("OsmDroid", "Error initializing archive file provider " + file.getAbsolutePath(), e2);
                return null;
            } catch (Exception e3) {
                Log.e("OsmDroid", "Error opening archive file " + file.getAbsolutePath(), e3);
                return null;
            }
        }
        return null;
    }
}
