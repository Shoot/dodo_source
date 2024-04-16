package defpackage;

import androidx.annotation.NonNull;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MetaDataStore.java */
/* renamed from: li6  reason: default package */
/* loaded from: classes2.dex */
public class li6 {
    private static final Charset b = Charset.forName("UTF-8");
    private final hu3 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetaDataStore.java */
    /* renamed from: li6$a */
    /* loaded from: classes2.dex */
    public class a extends JSONObject {
        final /* synthetic */ String a;

        a(String str) throws JSONException {
            this.a = str;
            put("userId", str);
        }
    }

    public li6(hu3 hu3Var) {
        this.a = hu3Var;
    }

    private static Map<String, String> e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, o(jSONObject, next));
        }
        return hashMap;
    }

    private static List<jn9> f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(jn9.a(string));
            } catch (Exception e) {
                rx5 f = rx5.f();
                f.l("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    private String g(String str) throws JSONException {
        return o(new JSONObject(str), "userId");
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String l(List<jn9> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(jn9.a.encode(list.get(i))));
            } catch (JSONException e) {
                rx5.f().l("Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            rx5 f = rx5.f();
            f.g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String n(String str) throws JSONException {
        return new a(str).toString();
    }

    private static String o(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @NonNull
    public File a(String str) {
        return this.a.o(str, "internal-keys");
    }

    @NonNull
    public File b(String str) {
        return this.a.o(str, "keys");
    }

    @NonNull
    public File c(String str) {
        return this.a.o(str, "rollouts-state");
    }

    @NonNull
    public File d(String str) {
        return this.a.o(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    public Map<String, String> i(String str, boolean z) {
        File b2;
        FileInputStream fileInputStream;
        Exception e;
        if (z) {
            b2 = a(str);
        } else {
            b2 = b(str);
        }
        if (b2.exists()) {
            ?? length = b2.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(b2);
                        try {
                            Map<String, String> e2 = e(ek1.A(fileInputStream));
                            ek1.f(fileInputStream, "Failed to close user metadata file.");
                            return e2;
                        } catch (Exception e3) {
                            e = e3;
                            rx5.f().l("Error deserializing user metadata.", e);
                            m(b2);
                            ek1.f(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        ek1.f(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e4) {
                    fileInputStream = null;
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    ek1.f(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        m(b2);
        return Collections.emptyMap();
    }

    public List<jn9> j(String str) {
        FileInputStream fileInputStream;
        File c = c(str);
        if (c.exists() && c.length() != 0) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(c);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                List<jn9> f = f(ek1.A(fileInputStream));
                rx5 f2 = rx5.f();
                f2.b("Loaded rollouts state:\n" + f + "\nfor session " + str);
                ek1.f(fileInputStream, "Failed to close rollouts state file.");
                return f;
            } catch (Exception e2) {
                e = e2;
                fileInputStream2 = fileInputStream;
                rx5.f().l("Error deserializing rollouts state.", e);
                m(c);
                ek1.f(fileInputStream2, "Failed to close rollouts state file.");
                return Collections.emptyList();
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                ek1.f(fileInputStream2, "Failed to close rollouts state file.");
                throw th;
            }
        }
        m(c);
        return Collections.emptyList();
    }

    public String k(String str) {
        FileInputStream fileInputStream;
        File d = d(str);
        FileInputStream fileInputStream2 = null;
        if (d.exists() && d.length() != 0) {
            try {
                fileInputStream = new FileInputStream(d);
                try {
                    try {
                        String g = g(ek1.A(fileInputStream));
                        rx5.f().b("Loaded userId " + g + " for session " + str);
                        ek1.f(fileInputStream, "Failed to close user metadata file.");
                        return g;
                    } catch (Exception e) {
                        e = e;
                        rx5.f().l("Error deserializing user metadata.", e);
                        m(d);
                        ek1.f(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    ek1.f(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                ek1.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            rx5.f().b("No userId set for session " + str);
            m(d);
            return null;
        }
    }

    public void p(String str, Map<String, String> map) {
        q(str, map, false);
    }

    public void q(String str, Map<String, String> map, boolean z) {
        File b2;
        String h;
        BufferedWriter bufferedWriter;
        if (z) {
            b2 = a(str);
        } else {
            b2 = b(str);
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                h = h(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(h);
            bufferedWriter.flush();
            ek1.f(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            rx5.f().l("Error serializing key/value metadata.", e);
            m(b2);
            ek1.f(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            ek1.f(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void r(String str, List<jn9> list) {
        String l;
        BufferedWriter bufferedWriter;
        File c = c(str);
        if (list.isEmpty()) {
            m(c);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                l = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(l);
            bufferedWriter.flush();
            ek1.f(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            rx5.f().l("Error serializing rollouts state.", e);
            m(c);
            ek1.f(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            ek1.f(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void s(String str, String str2) {
        String n;
        BufferedWriter bufferedWriter;
        File d = d(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                n = n(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d), b));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(n);
            bufferedWriter.flush();
            ek1.f(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            rx5.f().l("Error serializing user metadata.", e);
            ek1.f(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            ek1.f(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
