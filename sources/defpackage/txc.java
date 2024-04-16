package defpackage;

import android.content.ContentResolver;
import com.google.android.gms.internal.measurement.zzgb;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: txc  reason: default package */
/* loaded from: classes2.dex */
public final class txc implements uxc {
    private final AtomicBoolean a = new AtomicBoolean();
    private HashMap<String, String> b = null;
    private final HashMap<String, Boolean> c = new HashMap<>(16, 1.0f);
    private final HashMap<String, Integer> d = new HashMap<>(16, 1.0f);
    private final HashMap<String, Long> e = new HashMap<>(16, 1.0f);
    private final HashMap<String, Float> f = new HashMap<>(16, 1.0f);
    private Object g = null;
    private boolean h = false;
    private String[] i = new String[0];
    private final ContentResolver j = null;
    private final lyc k = new kyc();

    @Override // defpackage.uxc
    public final String a(ContentResolver contentResolver, String str, String str2) {
        if (contentResolver != null) {
            synchronized (this) {
                try {
                    String str3 = null;
                    if (this.b == null) {
                        this.a.set(false);
                        this.b = new HashMap<>(16, 1.0f);
                        this.g = new Object();
                        contentResolver.registerContentObserver(sxc.a, true, new wxc(this, null));
                    } else if (this.a.getAndSet(false)) {
                        this.b.clear();
                        this.c.clear();
                        this.d.clear();
                        this.e.clear();
                        this.f.clear();
                        this.g = new Object();
                        this.h = false;
                    }
                    Object obj = this.g;
                    if (this.b.containsKey(str)) {
                        String str4 = this.b.get(str);
                        if (str4 != null) {
                            str3 = str4;
                        }
                        return str3;
                    }
                    for (String str5 : this.i) {
                        if (str.startsWith(str5)) {
                            if (!this.h) {
                                try {
                                    HashMap<String, String> hashMap = (HashMap) this.k.b(contentResolver, this.i, new yxc() { // from class: xxc
                                        @Override // defpackage.yxc
                                        public final Map e(int i) {
                                            return new HashMap(i, 1.0f);
                                        }
                                    });
                                    if (!hashMap.isEmpty()) {
                                        Set<String> keySet = hashMap.keySet();
                                        keySet.removeAll(this.c.keySet());
                                        keySet.removeAll(this.d.keySet());
                                        keySet.removeAll(this.e.keySet());
                                        keySet.removeAll(this.f.keySet());
                                    }
                                    if (!hashMap.isEmpty()) {
                                        if (this.b.isEmpty()) {
                                            this.b = hashMap;
                                        } else {
                                            this.b.putAll(hashMap);
                                        }
                                    }
                                    this.h = true;
                                } catch (zzgb unused) {
                                }
                                if (this.b.containsKey(str)) {
                                    String str6 = this.b.get(str);
                                    if (str6 != null) {
                                        str3 = str6;
                                    }
                                    return str3;
                                }
                            }
                            return null;
                        }
                    }
                    try {
                        String a = this.k.a(contentResolver, str);
                        if (a != null && a.equals(null)) {
                            a = null;
                        }
                        synchronized (this) {
                            try {
                                if (obj == this.g) {
                                    this.b.put(str, a);
                                }
                            } finally {
                            }
                        }
                        if (a == null) {
                            return null;
                        }
                        return a;
                    } catch (zzgb unused2) {
                        return null;
                    }
                } finally {
                }
            }
        }
        throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
    }
}
