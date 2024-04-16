package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityChooserModel.java */
/* loaded from: classes.dex */
public class c extends DataSetObservable {
    static final String m = "c";
    private static final Object n = new Object();
    private static final Map<String, c> o = new HashMap();
    final Context d;
    final String e;
    private Intent f;
    private final Object a = new Object();
    private final List<a> b = new ArrayList();
    private final List<d> c = new ArrayList();
    private b g = new C0012c();
    private int h = 50;
    boolean i = true;
    private boolean j = false;
    private boolean k = true;
    private boolean l = false;

    /* compiled from: ActivityChooserModel.java */
    /* loaded from: classes.dex */
    public static final class a implements Comparable<a> {
        public final ResolveInfo a;
        public float b;

        public a(ResolveInfo resolveInfo) {
            this.a = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(a aVar) {
            return Float.floatToIntBits(aVar.b) - Float.floatToIntBits(this.b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass() && Float.floatToIntBits(this.b) == Float.floatToIntBits(((a) obj).b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.b) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.a.toString() + "; weight:" + new BigDecimal(this.b) + "]";
        }
    }

    /* compiled from: ActivityChooserModel.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Intent intent, List<a> list, List<d> list2);
    }

    /* compiled from: ActivityChooserModel.java */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0012c implements b {
        private final Map<ComponentName, a> a = new HashMap();

        C0012c() {
        }

        @Override // androidx.appcompat.widget.c.b
        public void a(Intent intent, List<a> list, List<d> list2) {
            Map<ComponentName, a> map = this.a;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a aVar = list.get(i);
                aVar.b = 0.0f;
                ActivityInfo activityInfo = aVar.a.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), aVar);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                d dVar = list2.get(size2);
                a aVar2 = map.get(dVar.a);
                if (aVar2 != null) {
                    aVar2.b += dVar.c * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* compiled from: ActivityChooserModel.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final ComponentName a;
        public final long b;
        public final float c;

        public d(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            ComponentName componentName = this.a;
            if (componentName == null) {
                if (dVar.a != null) {
                    return false;
                }
            } else if (!componentName.equals(dVar.a)) {
                return false;
            }
            if (this.b == dVar.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(dVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            ComponentName componentName = this.a;
            if (componentName == null) {
                hashCode = 0;
            } else {
                hashCode = componentName.hashCode();
            }
            long j = this.b;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "[; activity:" + this.a + "; time:" + this.b + "; weight:" + new BigDecimal(this.c) + "]";
        }

        public d(ComponentName componentName, long j, float f) {
            this.a = componentName;
            this.b = j;
            this.c = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActivityChooserModel.java */
    /* loaded from: classes.dex */
    public final class e extends AsyncTask<Object, Void, Void> {
        e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
            if (r15 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
            r15.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
            if (r15 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
            if (r15 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
            if (r15 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
            return null;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    private c(Context context, String str) {
        this.d = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !str.endsWith(".xml")) {
            this.e = str + ".xml";
            return;
        }
        this.e = str;
    }

    private boolean a(d dVar) {
        boolean add = this.c.add(dVar);
        if (add) {
            this.k = true;
            l();
            k();
            p();
            notifyChanged();
        }
        return add;
    }

    private void c() {
        boolean j = j() | m();
        l();
        if (j) {
            p();
            notifyChanged();
        }
    }

    public static c d(Context context, String str) {
        c cVar;
        synchronized (n) {
            try {
                Map<String, c> map = o;
                cVar = map.get(str);
                if (cVar == null) {
                    cVar = new c(context, str);
                    map.put(str, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    private boolean j() {
        if (!this.l || this.f == null) {
            return false;
        }
        this.l = false;
        this.b.clear();
        List<ResolveInfo> queryIntentActivities = this.d.getPackageManager().queryIntentActivities(this.f, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.b.add(new a(queryIntentActivities.get(i)));
        }
        return true;
    }

    private void k() {
        if (this.j) {
            if (!this.k) {
                return;
            }
            this.k = false;
            if (!TextUtils.isEmpty(this.e)) {
                new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.c), this.e);
                return;
            }
            return;
        }
        throw new IllegalStateException("No preceding call to #readHistoricalData");
    }

    private void l() {
        int size = this.c.size() - this.h;
        if (size <= 0) {
            return;
        }
        this.k = true;
        for (int i = 0; i < size; i++) {
            this.c.remove(0);
        }
    }

    private boolean m() {
        if (!this.i || !this.k || TextUtils.isEmpty(this.e)) {
            return false;
        }
        this.i = false;
        this.j = true;
        n();
        return true;
    }

    private void n() {
        FileInputStream fileInputStream;
        XmlPullParser newPullParser;
        try {
            try {
                FileInputStream openFileInput = this.d.openFileInput(this.e);
                try {
                    newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                    }
                } catch (IOException e2) {
                    String str = m;
                    Log.e(str, "Error reading historical recrod file: " + this.e, e2);
                    if (openFileInput == null) {
                        return;
                    }
                } catch (XmlPullParserException e3) {
                    String str2 = m;
                    Log.e(str2, "Error reading historical recrod file: " + this.e, e3);
                    if (openFileInput == null) {
                        return;
                    }
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<d> list = this.c;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                        } else if (next != 3 && next != 4) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new d(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, CrashHianalyticsData.TIME)), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (FileNotFoundException unused2) {
            }
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    private boolean p() {
        if (this.g != null && this.f != null && !this.b.isEmpty() && !this.c.isEmpty()) {
            this.g.a(this.f, this.b, Collections.unmodifiableList(this.c));
            return true;
        }
        return false;
    }

    public Intent b(int i) {
        synchronized (this.a) {
            try {
                if (this.f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.b.get(i).a.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f);
                intent.setComponent(componentName);
                a(new d(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo e(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.a) {
            c();
            resolveInfo = this.b.get(i).a;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.a) {
            c();
            size = this.b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.a) {
            try {
                c();
                List<a> list = this.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (list.get(i).a == resolveInfo) {
                        return i;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.a) {
            try {
                c();
                if (!this.b.isEmpty()) {
                    return this.b.get(0).a;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int i() {
        int size;
        synchronized (this.a) {
            c();
            size = this.c.size();
        }
        return size;
    }

    public void o(int i) {
        float f;
        synchronized (this.a) {
            try {
                c();
                a aVar = this.b.get(i);
                a aVar2 = this.b.get(0);
                if (aVar2 != null) {
                    f = (aVar2.b - aVar.b) + 5.0f;
                } else {
                    f = 1.0f;
                }
                ActivityInfo activityInfo = aVar.a.activityInfo;
                a(new d(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
