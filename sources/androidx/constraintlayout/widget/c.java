package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class c {
    private final ConstraintLayout a;
    d b;
    int c = -1;
    int d = -1;
    private SparseArray<a> e = new SparseArray<>();
    private SparseArray<d> f = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class a {
        int a;
        ArrayList<b> b = new ArrayList<>();
        int c;
        d d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g29.y9);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == g29.z9) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == g29.A9) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.d = dVar;
                        dVar.o(context, this.c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.b.add(bVar);
        }

        public int b(float f, float f2) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class b {
        float a;
        float b;
        float c;
        float d;
        int e;
        d f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g29.ia);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == g29.ja) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f = dVar;
                        dVar.o(context, this.e);
                    }
                } else if (index == g29.ka) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == g29.la) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == g29.ma) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == g29.na) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f, float f2) {
            if (!Float.isNaN(this.a) && f < this.a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f2 < this.b) {
                return false;
            }
            if (!Float.isNaN(this.c) && f > this.c) {
                return false;
            }
            if (!Float.isNaN(this.d) && f2 > this.d) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, ConstraintLayout constraintLayout, int i) {
        this.a = constraintLayout;
        a(context, i);
    }

    private void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c != 2) {
                                if (c != 3) {
                                    if (c != 4) {
                                        continue;
                                    } else {
                                        b(context, xml);
                                        continue;
                                    }
                                } else {
                                    b bVar = new b(context, xml);
                                    if (aVar != null) {
                                        aVar.a(bVar);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                aVar = new a(context, xml);
                                this.e.put(aVar.a, aVar);
                                continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        int i;
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.F(context, xmlPullParser);
                this.f.put(i, dVar);
                return;
            }
        }
    }

    public void d(int i, float f, float f2) {
        d dVar;
        a aVar;
        int b2;
        d dVar2;
        int i2 = this.c;
        if (i2 == i) {
            if (i == -1) {
                aVar = this.e.valueAt(0);
            } else {
                aVar = this.e.get(i2);
            }
            int i3 = this.d;
            if ((i3 != -1 && aVar.b.get(i3).a(f, f2)) || this.d == (b2 = aVar.b(f, f2))) {
                return;
            }
            if (b2 == -1) {
                dVar2 = this.b;
            } else {
                dVar2 = aVar.b.get(b2).f;
            }
            if (b2 != -1) {
                int i4 = aVar.b.get(b2).e;
            }
            if (dVar2 == null) {
                return;
            }
            this.d = b2;
            dVar2.i(this.a);
            return;
        }
        this.c = i;
        a aVar2 = this.e.get(i);
        int b3 = aVar2.b(f, f2);
        if (b3 == -1) {
            dVar = aVar2.d;
        } else {
            dVar = aVar2.b.get(b3).f;
        }
        if (b3 != -1) {
            int i5 = aVar2.b.get(b3).e;
        }
        if (dVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.d = b3;
        dVar.i(this.a);
    }

    public void c(pr1 pr1Var) {
    }
}
