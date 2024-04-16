package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: FontResourcesParserCompat.java */
/* renamed from: p34  reason: default package */
/* loaded from: classes.dex */
public class p34 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: p34$a */
    /* loaded from: classes.dex */
    public static class a {
        static int a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: p34$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: p34$c */
    /* loaded from: classes.dex */
    public static final class c implements b {
        @NonNull
        private final d[] a;

        public c(@NonNull d[] dVarArr) {
            this.a = dVarArr;
        }

        @NonNull
        public d[] a() {
            return this.a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: p34$d */
    /* loaded from: classes.dex */
    public static final class d {
        @NonNull
        private final String a;
        private final int b;
        private final boolean c;
        private final String d;
        private final int e;
        private final int f;

        public d(@NonNull String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        @NonNull
        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: p34$e */
    /* loaded from: classes.dex */
    public static final class e implements b {
        @NonNull
        private final n34 a;
        private final int b;
        private final int c;
        private final String d;

        public e(@NonNull n34 n34Var, int i, int i2, String str) {
            this.a = n34Var;
            this.c = i;
            this.b = i2;
            this.d = str;
        }

        public int a() {
            return this.c;
        }

        @NonNull
        public n34 b() {
            return this.a;
        }

        public String c() {
            return this.d;
        }

        public int d() {
            return this.b;
        }
    }

    private static int a(TypedArray typedArray, int i) {
        return a.a(typedArray, i);
    }

    public static b b(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static List<List<byte[]>> c(@NonNull Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), i29.h);
        String string = obtainAttributes.getString(i29.i);
        String string2 = obtainAttributes.getString(i29.m);
        String string3 = obtainAttributes.getString(i29.n);
        int resourceId = obtainAttributes.getResourceId(i29.j, 0);
        int integer = obtainAttributes.getInteger(i29.k, 1);
        int integer2 = obtainAttributes.getInteger(i29.l, 500);
        String string4 = obtainAttributes.getString(i29.o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new n34(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), i29.p);
        int i = i29.y;
        if (!obtainAttributes.hasValue(i)) {
            i = i29.r;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = i29.w;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = i29.s;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i29.z;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = i29.t;
        }
        int i5 = i29.x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = i29.u;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = i29.v;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = i29.q;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i2, z, string, i6, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
