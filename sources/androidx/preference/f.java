package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.NonNull;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreferenceInflater.java */
/* loaded from: classes.dex */
public class f {
    private static final Class<?>[] e = {Context.class, AttributeSet.class};
    private static final HashMap<String, Constructor> f = new HashMap<>();
    private final Context a;
    private final Object[] b = new Object[2];
    private g c;
    private String[] d;

    public f(Context context, g gVar) {
        this.a = context;
        f(gVar);
    }

    private Preference a(@NonNull String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        Class<?> cls;
        Constructor<?> constructor = f.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e2;
                        }
                        constructor = cls.getConstructor(e);
                        constructor.setAccessible(true);
                        f.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(e);
                    constructor.setAccessible(true);
                    f.put(str, constructor);
                } catch (Exception e4) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e4);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e5) {
                throw e5;
            }
        }
        Object[] objArr = this.b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private Preference b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return g(str, attributeSet);
            }
            return a(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    private void f(g gVar) {
        this.c = gVar;
        j(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    @NonNull
    private PreferenceGroup h(PreferenceGroup preferenceGroup, @NonNull PreferenceGroup preferenceGroup2) {
        if (preferenceGroup == null) {
            preferenceGroup2.a0(this.c);
            return preferenceGroup2;
        }
        return preferenceGroup;
    }

    private void i(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (CommonCode.Resolution.HAS_RESOLUTION_FROM_APK.equals(name)) {
                        try {
                            preference.B0(Intent.parseIntent(c().getResources(), xmlPullParser, attributeSet));
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e2);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        c().getResources().parseBundleExtra("extra", attributeSet, preference.t());
                        try {
                            k(xmlPullParser);
                        } catch (IOException e3) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e3);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference b = b(name, attributeSet);
                        ((PreferenceGroup) preference).Q0(b);
                        i(xmlPullParser, b, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }

    private static void k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3 && xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public Context c() {
        return this.a;
    }

    public Preference d(int i, PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = c().getResources().getXml(i);
        try {
            return e(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    public Preference e(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup h;
        synchronized (this.b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.b[0] = this.a;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e2) {
                    throw e2;
                } catch (IOException e3) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException.initCause(e3);
                    throw inflateException;
                } catch (XmlPullParserException e4) {
                    InflateException inflateException2 = new InflateException(e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                h = h(preferenceGroup, (PreferenceGroup) b(xmlPullParser.getName(), asAttributeSet));
                i(xmlPullParser, h, asAttributeSet);
            } else {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return h;
    }

    protected Preference g(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return a(str, this.d, attributeSet);
    }

    public void j(String[] strArr) {
        this.d = strArr;
    }
}
