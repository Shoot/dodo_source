package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: StateSet.java */
/* renamed from: dva  reason: default package */
/* loaded from: classes.dex */
public class dva {
    int a = -1;
    int b = -1;
    int c = -1;
    private SparseArray<a> d = new SparseArray<>();
    private SparseArray<d> e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateSet.java */
    /* renamed from: dva$a */
    /* loaded from: classes.dex */
    public static class a {
        int a;
        ArrayList<b> b = new ArrayList<>();
        int c;
        boolean d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            this.d = false;
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
                        this.d = true;
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
    /* compiled from: StateSet.java */
    /* renamed from: dva$b */
    /* loaded from: classes.dex */
    public static class b {
        float a;
        float b;
        float c;
        float d;
        int e;
        boolean f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            this.f = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g29.ia);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == g29.ja) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f = true;
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

    public dva(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g29.D9);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == g29.E9) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else if ("StateSet".equals(xmlPullParser.getName())) {
                                return;
                            }
                        } else {
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case 80204913:
                                    if (name.equals("State")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1301459538:
                                    if (name.equals("LayoutDescription")) {
                                        c = 0;
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
                                if (c == 3) {
                                    b bVar = new b(context, xmlPullParser);
                                    if (aVar != null) {
                                        aVar.a(bVar);
                                    }
                                }
                            } else {
                                aVar = new a(context, xmlPullParser);
                                this.d.put(aVar.a, aVar);
                            }
                        }
                    } else {
                        xmlPullParser.getName();
                    }
                    eventType = xmlPullParser.next();
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

    public int a(int i, int i2, float f, float f2) {
        a aVar = this.d.get(i2);
        if (aVar == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            Iterator<b> it = aVar.b.iterator();
            b bVar = null;
            while (it.hasNext()) {
                b next = it.next();
                if (next.a(f, f2)) {
                    if (i == next.e) {
                        return i;
                    }
                    bVar = next;
                }
            }
            if (bVar != null) {
                return bVar.e;
            }
            return aVar.c;
        } else if (aVar.c == i) {
            return i;
        } else {
            Iterator<b> it2 = aVar.b.iterator();
            while (it2.hasNext()) {
                if (i == it2.next().e) {
                    return i;
                }
            }
            return aVar.c;
        }
    }

    public int c(int i, int i2, int i3) {
        return d(-1, i, i2, i3);
    }

    public int d(int i, int i2, float f, float f2) {
        a aVar;
        if (i == i2) {
            if (i2 == -1) {
                aVar = this.d.valueAt(0);
            } else {
                aVar = this.d.get(this.b);
            }
            if (aVar == null) {
                return -1;
            }
            if (this.c != -1 && aVar.b.get(i).a(f, f2)) {
                return i;
            }
            int b2 = aVar.b(f, f2);
            if (i == b2) {
                return i;
            }
            if (b2 == -1) {
                return aVar.c;
            }
            return aVar.b.get(b2).e;
        }
        a aVar2 = this.d.get(i2);
        if (aVar2 == null) {
            return -1;
        }
        int b3 = aVar2.b(f, f2);
        if (b3 == -1) {
            return aVar2.c;
        }
        return aVar2.b.get(b3).e;
    }
}
