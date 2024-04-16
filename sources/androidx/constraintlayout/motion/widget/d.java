package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: KeyFrames.java */
/* loaded from: classes.dex */
public class d {
    static HashMap<String, Constructor<? extends a>> b;
    private HashMap<Integer, ArrayList<a>> a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends a>> hashMap = new HashMap<>();
        b = hashMap;
        try {
            hashMap.put("KeyAttribute", b.class.getConstructor(new Class[0]));
            b.put("KeyPosition", e.class.getConstructor(new Class[0]));
            b.put("KeyCycle", c.class.getConstructor(new Class[0]));
            b.put("KeyTimeCycle", g.class.getConstructor(new Class[0]));
            b.put("KeyTrigger", h.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public d() {
    }

    public void a(j jVar) {
        ArrayList<a> arrayList = this.a.get(-1);
        if (arrayList != null) {
            jVar.b(arrayList);
        }
    }

    public void b(j jVar) {
        ArrayList<a> arrayList = this.a.get(Integer.valueOf(jVar.c));
        if (arrayList != null) {
            jVar.b(arrayList);
        }
        ArrayList<a> arrayList2 = this.a.get(-1);
        if (arrayList2 != null) {
            Iterator<a> it = arrayList2.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f(((ConstraintLayout.b) jVar.b.getLayoutParams()).b0)) {
                    jVar.a(next);
                }
            }
        }
    }

    public void c(a aVar) {
        if (!this.a.containsKey(Integer.valueOf(aVar.b))) {
            this.a.put(Integer.valueOf(aVar.b), new ArrayList<>());
        }
        ArrayList<a> arrayList = this.a.get(Integer.valueOf(aVar.b));
        if (arrayList != null) {
            arrayList.add(aVar);
        }
    }

    public ArrayList<a> d(int i) {
        return this.a.get(Integer.valueOf(i));
    }

    public d(Context context, XmlPullParser xmlPullParser) {
        Exception e;
        a aVar;
        Constructor<? extends a> constructor;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap2;
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar2 = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (b.containsKey(name)) {
                        try {
                            constructor = b.get(name);
                        } catch (Exception e2) {
                            a aVar3 = aVar2;
                            e = e2;
                            aVar = aVar3;
                        }
                        if (constructor != null) {
                            aVar = constructor.newInstance(new Object[0]);
                            try {
                                aVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                c(aVar);
                            } catch (Exception e3) {
                                e = e3;
                                Log.e("KeyFrames", "unable to create ", e);
                                aVar2 = aVar;
                                continue;
                                eventType = xmlPullParser.next();
                            }
                            aVar2 = aVar;
                            continue;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                            break;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (aVar2 != null && (hashMap2 = aVar2.e) != null) {
                            androidx.constraintlayout.widget.a.i(context, xmlPullParser, hashMap2);
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && aVar2 != null && (hashMap = aVar2.e) != null) {
                        androidx.constraintlayout.widget.a.i(context, xmlPullParser, hashMap);
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }
}
